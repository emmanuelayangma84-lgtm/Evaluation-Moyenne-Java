import java.util.Scanner;

public class ModuleIdentite {

    public static String saisirNom(Scanner sc) {
        System.out.print("Nom : ");
        String nom = sc.nextLine();
        return nom;
    }

    public static String saisirPrenom(Scanner sc) {
        System.out.print("Prenom : ");
        String prenom = sc.nextLine();
        return prenom;
    }

    public static String saisirClasse(Scanner sc) {
        System.out.print("Classe : ");
        String classe = sc.nextLine();
        return classe;
    }
}