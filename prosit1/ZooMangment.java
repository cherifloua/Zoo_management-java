import java.io.PrintStream;
import java.util.Scanner;
public class ZooMangment {
    public static void main(String[] arg) {
        int nbrCage = 20;
        String zooName = "my zoo";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("entrez le nom du zoo");
            zooName = sc.nextLine().trim();
        } while (zooName.isEmpty());
        do {
            System.out.println("entrez le nbre des cages");
            while (!sc.hasNextInt()) {
                System.out.println("entrez le nbre des cages");
                sc.next();
            }
            nbrCage = sc.nextInt();
        } while (nbrCage <= 0);
        System.out.println((zooName + " comporte " + nbrCage + " cages"));
        sc.close();
    }
}
