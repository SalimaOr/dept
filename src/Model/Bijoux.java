package Model;

public class Bijoux {
    private int id;
    private String libelle;
    private Double prix;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public Bijoux(int id, String libelle, Double prix) {
        this.id = id;
        this.libelle = libelle;
        this.prix = prix;
    }

    public Bijoux() {
    }

    public void afficher(){

        System.out.println("l'id du bijoux : " +id+ " le libelle du bijoux :" +libelle+ "le prix du bijoux : " +prix);
    }
}
