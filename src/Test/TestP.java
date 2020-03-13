package Test;

import entites.Employe;

public class TestP {
    public static void main(String[] args){
        Employe employe1 = new Employe((long) 1, "Elouarzazi", "Salima", 26, 2222);
        employe1.afficher();
    }

}
