public class Main {
    public static void main(String[] args) {

        // 1. Saisie identite
        String[] identite = ModuleIdentite.saisirIdentite();
        String nom = identite[0];
        String prenom = identite[1];

        // 2. Saisie notes
        double[] notes = ModuleNotes.saisirNotes();

        // 3. Calculs
        double moyenne = ModuleCalcul.calculerMoyenne(notes);
        double max = ModuleCalcul.trouverMax(notes);
        double min = ModuleCalcul.trouverMin(notes);

        // 4. Mention et decision
        String mention = ModuleMention.determinerMention(moyenne);
        String decision = ModuleMention.determinerDecision(moyenne);

        // 5. Affichage
        ModuleAffichage.afficherBulletin(nom, prenom, notes, moyenne, max, min, mention, decision);
    }
}
