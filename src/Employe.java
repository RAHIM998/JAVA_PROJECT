import java.util.Date;
import java.util.Random;

public class Employe extends Personne{
    private Double salaire;
    private String poste;
    private static int nbEmploye = 0;
    private static final Double salMin = 10000.0;


    // Constructor
    public Employe(String nom, Date dateNaissance, Double taille, Double salaire, String poste) {
        super(nom, dateNaissance, taille);
        this.salaire = salaire;
        this.poste = poste;
        nbEmploye ++;
    }

    public Employe() {
        this.poste = poste;
        this.salaire = salaire;
    }


    // Methode d'affichage d'un employé
    public void afficheEmploye(){
        super.affichePersonne();
        System.out.println("Salaire: " + salaire);
        System.out.println("Poste: " + poste);
        System.out.println("Nombre total Employée: " + nbEmploye);
    }

    //Méthode de descompte des employee
    public int nbEmployee(){
        return nbEmploye;
     }

    //Surcharge de méthode
    public void afficheEmploye(String nom, Double salaire){
        System.out.println("Nom: " + nom);
        System.out.println("Salaire: " + salaire);
    }
    public void afficheEmploye(String nom, Date dateNaissance, String poste){
        System.out.println("Nom: " + nom);
        System.out.println("Date de naissance: " + dateNaissance);
        System.out.println("Poste: " + poste);
    }

    //redéfinition de la méthode to string
    @Override
    public String toString() {
        return (super.toString() +
                "Salaire: " + salaire +
                "Poste: " + poste
        );
    }

    public static String generateNomEmploye (){
        int nbChar = 10;
        Random random = new Random();
        StringBuilder lettreGenerer = new StringBuilder();
        for (int i = 0; i <= 10; i++){
            char caractere = 'A';
            caractere = (char) (caractere + random.nextInt(26));
            lettreGenerer.append(caractere);
        }
    return lettreGenerer.toString();
    }

    public Employe (Date dateNaissance, Double taille, String poste){
        super(dateNaissance, taille);
        generateNomEmploye();
        poste = this.poste;
        salaire = salMin;

    }
}
