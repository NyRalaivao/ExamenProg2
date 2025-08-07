import java.util.ArrayList;

public class Combattant {
    private String id_combattant;
    private String nom;
    private String prenom;
    private String nom_combattant;
    private float poids;
    private ArrayList<String> titres = new ArrayList<>();

    public Combattant(String id_combattant, String nom, String prenom, String nom_combattant, float poids, ArrayList<String> titres) {
        this.id_combattant = id_combattant;
        this.nom = nom;
        this.prenom = prenom;
        this.nom_combattant = nom_combattant;
        this.poids = poids;
        this.titres = titres;
    }

    public Combattant(String id_combattant, String nom, String prenom, String nom_combattant, float poids) {
        this.id_combattant = id_combattant;
        this.nom = nom;
        this.prenom = prenom;
        this.nom_combattant = nom_combattant;
        this.poids = poids;
    }

    public String getId_combattant() {
        return id_combattant;
    }

    public void setId_combattant(String id_combattant) {
        this.id_combattant = id_combattant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom_combattant() {
        return nom_combattant;
    }

    public void setNom_combattant(String nom_combattant) {
        this.nom_combattant = nom_combattant;
    }

    public float getPoids() {
        return poids;
    }

    public void setPoids(float poids) {
        this.poids = poids;
    }

    public ArrayList<String> getTitres() {
        return titres;
    }

    public void setTitres(ArrayList<String> titres) {
        this.titres = titres;
    }

    void presentation(){
        System.out.println(prenom + " " + nom + " allias " + nom_combattant);
    }
    public static void main(String[] args) {
        Combattant Bolo = new Combattant("CB35",
                "RAKOTO",
                "Solofo",
                "Bolo" ,
                85);

        Combattant Bonanga = new Combattant("CB37",
                "ANDRIA",
                "Kely",
                "Bonanga" ,
                85);

        Bolo.presentation();
        Bonanga.presentation();
    }
}
