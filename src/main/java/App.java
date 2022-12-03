import subject.*;

public class App {
    public static void main(String[] args) {
        Subject x1 = SubjectFactory.getSubject("DM");
        Subject x2 = SubjectFactory.getSubject("RPR");
        Subject x3 = SubjectFactory.getSubject("SP");

        System.out.println("\nDISKRETNA MATEMATIKA");
        System.out.println("NASTAVNI ANSAMBL - " + x1.nastavniAnsambl());
        System.out.println("BODOVANJE - " + x1.bodovanje());

        System.out.println("\nRAZVOJ PROGRAMSKIH RJESENJA");
        System.out.println("NASTAVNI ANSAMBL - " + x2.nastavniAnsambl());
        System.out.println("BODOVANJE - " + x2.bodovanje());

        System.out.println("\nSISTEMSKO PROGRAMIRANJE");
        System.out.println("NASTAVNI ANSAMBL - " + x3.nastavniAnsambl());
        System.out.println("BODOVANJE - " + x3.bodovanje());
    }
}
