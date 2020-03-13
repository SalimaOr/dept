package entites;

public class Employe {

    private Long id;
    private String nom;
    private String prenom;
    private int age;
    private double salaire;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public Employe() {
    }

    public Employe(Long id, String nom, String prenom, int age, double salaire) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.salaire = salaire;
    }
    public void afficher(){
        System.out.println("l'emplmoye avec l'id " + id +  ", nom: " + nom + ", prenom: " + prenom + ", age: "
                + age + ", salaire: " +salaire);
    }
}
