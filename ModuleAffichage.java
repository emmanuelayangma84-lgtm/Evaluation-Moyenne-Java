public class ModuleAffichage {

    // Afficher le bulletin complet
    public static void afficherBulletin(String nom, String prenom, double[] notes, double moyenne, double max, double min, String mention, String decision) {
        System.out.println("========== BULLETIN DE NOTES ==========");
        System.out.println("Nom : " + nom);
        System.out.println("Prenom : " + prenom);
        System.out.println("----------------------------------------");
        System.out.println("Notes :");
        for (int i = 0; i < notes.length; i++) {
            System.out.println("  Matiere " + (i + 1) + " : " + notes[i]);
        }
        System.out.println("----------------------------------------");
        System.out.println("Moyenne : " + moyenne);
        System.out.println("Note max : " + max);
        System.out.println("Note min : " + min);
        System.out.println("Mention : " + mention);
        System.out.println("Decision : " + decision);
        System.out.println("========================================");
    }
}
