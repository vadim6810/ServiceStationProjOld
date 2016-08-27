package com.carservice;

import java.util.ArrayList;

/**
 * Created by Legat on 8/27/2016.
 */
public class ClientController {


    ArrayList<Client> clients;

    String getClientEmail(Client client) {
        Client tempCl=null;
        for (Client clnt : clients) {
            if (clnt.equals(client)) {
                tempCl=clnt;
            }
        }
        if (!tempCl.equals(null)){
            return tempCl.getEmail();
        }
        else {return null;}
    }
    Client getClient (String email){
        Client tempCl=null;
        for (Client clnt : clients) {
            if (clnt.getEmail().equals(email)) {
                tempCl=clnt;
            }
        }
        return tempCl;
    }


}
