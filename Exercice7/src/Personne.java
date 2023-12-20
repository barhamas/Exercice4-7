import java.util.Date;

public class Personne {
    protected String nom;
    protected Date dateNaissance;
    protected double taille;

    public Personne() {
    }

    public Personne(String nom, Date dateNaissance, double taille) {
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.taille = taille;
    }

    public Personne(String barhamaSow, Date date, double v, int i, String manager) {
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", taille=" + taille +
                '}';
    }
}
