package Assignment;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //Läs in vad användaren skriver i kommandotolken
        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv ett ord eller en mening, avsluta med 'Stop': ");
        String userInput = scan.nextLine();
        //Skapa konstruktorn för att komma åt Logic klassen
        Logic data = new Logic();

        //Så länge som Logic inte har upptäckt Stop-kommandot fortsätter vi ta input
        while(!data.getStopCheck()) {
            data.inputSize(userInput);
            //Om logik klassen hittar stop tas ingen mer data in
            if(data.getStopCheck()) {
                break;
            }
            userInput = scan.nextLine();
        }
        //Samla data från Logic klassen
        int rows = data.getRows();
        int letters = data.getLetterCount();
        int words = data.getWordCount();
        String longestWord = data.getLongestWord();

        //Visa resultatet
        System.out.println("Antalet rader: "+rows);
        System.out.println("Antalet tecken: "+letters);
        System.out.println("Antalet ord: "+words);
        System.out.println("Längsta ordet: "+ longestWord);

    }

}
