package entites;

public class Service {
    private long id;
    private String libelle;
    private int nbrBureaux;
    private Double tauxInt;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getNbrBureaux() {
        return nbrBureaux;
    }

    public void setNbrBureaux(int nbrBureaux) {
        this.nbrBureaux = nbrBureaux;
    }

    public Double getTauxInt() {
        return tauxInt;
    }

    public void setTauxInt(Double tauxInt) {
        this.tauxInt = tauxInt;
    }

    //constructeur avec arguements( = attributs) qui permet de créer un objet
    public Service(long id, String libelle, int nbrBureaux, Double tauxInt) {
        this.id = id;
        this.libelle = libelle;
        this.nbrBureaux = nbrBureaux;
        this.tauxInt = tauxInt;
    }

    public Service() {
    }

    //une methode de type void qui permet d 'afficher
    public void afficher () {
        System.out.println("l'id du service: " + id + ", et son libelle : " + libelle + ", et le nombre des bureaux du service : "
                + nbrBureaux + ", et le taux d'interssement du service : " + tauxInt );
    }
}

