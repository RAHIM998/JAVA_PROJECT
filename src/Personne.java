import java.util.Date;

public class Personne {
    protected String nom;
    protected Date dateNaissance;
    protected Double taille;

    //Constructeurs

    public Personne(String nom, Date dateNaissance, Double taille) {
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.taille = taille;
    }

    public Personne() {

    }

    public Personne(Date dateNaissance, Double taille) {
        dateNaissance = this.dateNaissance;
        taille = this.taille;
    }

    // Méthode d'affichage du polymorphisme
    public void affichePersonne (){
        if (nom.length() <= 50){
            System.out.println("Nom: " + nom);
        }else
            System.out.println("Le nom ne doit pas depasser 50 caractère");
        System.out.println("Date de naissance: " + dateNaissance);
        System.out.println("Taile: " + taille);
    }

    //redéfintion de la méthode to string

    @Override
    public String toString() {
        return "Personne{" +
                "Nom: " + nom +
                ", Date de naissance: " + dateNaissance +
                ", Taille: " + taille +
                '}';
    }
}
