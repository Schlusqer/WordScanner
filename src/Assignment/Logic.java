package Assignment;


public class Logic {
    //Skapa alla variabler
    private int letterCount = 0;
    private int rowCount = 0;
    private int wordCount = 0;
    String longestWord = "";
    boolean stopCheck = false;

    public void inputSize(String input) {
        //Kontrollera om input är stop eller inte
        if(input.equals("stop") || input.equals("Stop") || input.equals("STOP")) {
            stopCheck = true;
        }
        //Om input inte är stop räkna som vanligt
        if(!stopCheck) {
        // Läs in input och öka antalet tecken och rader
            letterCount += input.length();
            rowCount++;

        //gå igenom input och när ett mellanslag hittas läggs det ordet i en array
        //OBS! om en rad börjar eller slutar med mellanslag läggs ett extra ord till
            String[] words = input.split(" ");
            wordCount += words.length;

        /*Foreach loop genom hela arrayen och om längden av ett ord är
        längre än det tidigare längsta ordet sparas det som nya längsta
         */
            for (String longWord : words) {
                //Om två ord är samma längd är det första längsta ordet det som sparas
                if (longWord.length() > longestWord.length()) {
                    longestWord = longWord;
                }
            }
        }
    }

    //Returnera all data
    public int getRows() {
        return rowCount;
    }
    public int getLetterCount() {
        return letterCount;
    }

    public int getWordCount() {
        return wordCount;
    }

    public String getLongestWord() {
        return longestWord;
    }

    public Boolean getStopCheck() {
        return stopCheck;
    }
}
