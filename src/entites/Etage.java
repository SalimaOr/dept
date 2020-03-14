package entites;

public class Etage {

    private Long id;
    private String lbelle;
    private int nbrPiece;
    private Double tauxPart;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLbelle() {
        return lbelle;
    }

    public void setLbelle(String lbelle) {
        this.lbelle = lbelle;
    }

    public int getNbrPiece() {
        return nbrPiece;
    }

    public void setNbrPiece(int nbrPiece) {
        this.nbrPiece = nbrPiece;
    }

    public Double getTauxPart() {
        return tauxPart;
    }

    public void setTauxPart(Double tauxPart) {
        this.tauxPart = tauxPart;
    }

    public Etage(Long id, String lbelle, int nbrPiece, Double tauxPart) {
        this.id = id;
        this.lbelle = lbelle;
        this.nbrPiece = nbrPiece;
        this.tauxPart = tauxPart;
    }

    public Etage() {
    }

    public void afficher() {
        System.out.println("l'id de l'tage : " +id+ "le libelle de l'etage : " +lbelle+ "le nombre de pieces : "+nbrPiece+
                "le taux de participation : " +tauxPart);

    }
}
