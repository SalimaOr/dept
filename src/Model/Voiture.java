package Model;

public class Voiture {
    private long id;
    private String libelle ;
    private int nbrdeporte;

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

    public int getNbrdeporte() {
        return nbrdeporte;
    }

    public void setNbrdeporte(int nbrdeporte) {
        this.nbrdeporte = nbrdeporte;
    }

    public Voiture(long id, String libelle, int nbrdeporte) {
        this.id = id;
        this.libelle = libelle;
        this.nbrdeporte = nbrdeporte;
    }

    public Voiture(){
    }

    public void afficher(){

        System.out.println("l'id de la voiture : " +id+ "le libelle de la voiture :  "+libelle+ "le nombre de porte de la voiture :"
                +nbrdeporte);
    }

}
