import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;

public class Employe extends Personne{
        private static int nombreTotalEmployes = 0;
        private double salaire;
        private String poste;
        private static final int LONGUEUR_NOM_MAX = 50;
        private static final double SALAIRE_MINIMUM = 1000;

        public Employe(String nom, Date dateNaissance, double taille, double salaire, String poste) {
            super(nom, dateNaissance, taille);
            if (nom.length() > LONGUEUR_NOM_MAX) {
                throw new IllegalArgumentException("Le nom ne doit pas dépasser " + LONGUEUR_NOM_MAX + " caractères.");
            }
            this.salaire = (salaire < SALAIRE_MINIMUM) ? SALAIRE_MINIMUM : salaire;
            this.poste = poste;
            nombreTotalEmployes++;
        }
        @Override
        public String toString() {
            return "Employe [nom=" + nom + ", dateNaissance=" + new SimpleDateFormat("yyyy-MM-dd").format(dateNaissance) + ", taille=" + taille
                    + ", salaire=" + salaire + ", poste=" + poste + "]";
        }

        public static void afficherInfos(Personne personne) {
            System.out.println(personne.toString());
        }

        public void setInfos(String nom, double salaire) {
            this.nom = nom;
            this.salaire = salaire;
        }

        public void setInfos(String nom, Date dateNaissance, String poste) {
            this.nom = nom;
            this.dateNaissance = dateNaissance;
            this.poste = poste;
        }

        public static void afficherCollection() {
            Iterable<? extends Employe> employes = null;
            for (Employe employe : employes) {
                System.out.println(employe.toString());
            }
        }
    }

