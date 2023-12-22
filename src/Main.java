import java.util.Date;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n...........................Personne sans surcharges........................................\n");
        Personne personne = new Personne("Saikou Abdou Rahim Diallo", new Date(98,6,4), 1.79);
        personne.affichePersonne();

        System.out.println("\n..............................Employée Sans surcharge .........................\n");
        Employe employe = new Employe("Rahim", new Date(98,6,4), 1.7, 15550000.0, "Développeur");
        employe.afficheEmploye();

        System.out.println("\n..............................Employée avec surcharge.........................\n");
        Employe employe1 = new Employe();
        employe1.afficheEmploye("Rahim Diallo", 550000.0);
        System.out.println("..........................................................");
        employe1.afficheEmploye("Rahim Diallo", new Date(98, 6, 4), "Développeur Mobile");

        System.out.println("............................Méthode to String............................");

        System.out.println("..........................Personne........................................");
        Personne personne2 = new Personne("Saikou Abdou Rahim Diallo", new Date(98,6,4), 1.79);
        System.out.println(personne2.toString());

        System.out.println("..........................Employée........................................");
        Employe employe2 = new Employe("Rahim", new Date(98,6,4), 1.7, 15550000.0, "Développeur");
        System.out.println(employe2.toString());

        System.out.println("..........................Employée avec un nom Génerer........................................");
        Employe employe3 = new Employe(new Date(98, 6, 4), 1.9, "Comptable");
        System.out.println(employe3.toString());
    }
}