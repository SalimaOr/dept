package Model;

public class Proprio {
    private long id;
    private String nom;
    private String prenom;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Proprio(long id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Proprio() {
    }

    public void afficher(){

        System.out.println("l'id du proprio : " +id+ "le nom du proprio : " +nom+ "le prenom du proprio : " +prenom);
    }
}
