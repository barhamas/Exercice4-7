// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Personne personne = new Personne("sow", "Barhama", "1990-01-15");
        if (personne.getDatenaissance() != null) {
            System.out.println("Nom: " + personne.getNom());
            System.out.println("Prénom: " + personne.getPrenom());
            System.out.println("Matricule: " + personne.getMatricule());
            System.out.println("Âge: " + personne.getAge() + " ans");
        } else {
            System.out.println("Erreur : Date de naissance non valide.");
        }


    }
}