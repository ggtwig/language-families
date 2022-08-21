public class Language {
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    Language(String name, int numSpeakers, String regionsSpoken, String wordOrder) {
        this.name = name;
        this.numSpeakers = numSpeakers;
        this.regionsSpoken = regionsSpoken;
        this.wordOrder = wordOrder;
    }

    public void getInfo() {
        System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken+ ".");
        System.out.println("The language follows the word order: " + wordOrder + ".");
    }

    public static void main(String[] args) {
        Language spanish = new Language("Spanish", 555000000, "Spain, Latin America, and Equatorial Guinea", "subject-verb-object");
        Language kiche = new Mayan("Ki'che", 2330000);
        Language mandarin = new SinoTibetan("Mandarin Chinese", 1110000000);
        Language burmese = new SinoTibetan("Burmese", 43000000);


        spanish.getInfo();
        System.out.println();
        kiche.getInfo();
        System.out.println();
        mandarin.getInfo();
        System.out.println();
        burmese.getInfo();
    }

}
