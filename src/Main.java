public class Main {

    public static void main(String[] args) {
        Language spanish = new IndoEuropean("Spanish", 555000000);
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
