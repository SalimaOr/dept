package Test;

import entites.Service;

public class TestS {
    public static void main(String[] args){

        //création d'objet
        Service serviceClient = new Service(1,"service client",200,15.05);

        //affichage de l'objet
        serviceClient.afficher();

    }

}

