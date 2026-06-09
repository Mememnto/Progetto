package Controller;

import Database.GestorePersistenza;
import Database.Session;
import Entity.Cliente;
import Entity.Ristoratore;

public class LoginController {

    public static boolean login(String email,String ruolo){

        if (ruolo.equalsIgnoreCase("Cliente")) {
            Cliente c = (Cliente) new GestorePersistenza().cercaPerCampo(Cliente.class, "email", email);
            Session.getInstance().setUtenteLoggato(c);
            return true;
        } else if (ruolo.equalsIgnoreCase("Ristoratore")) {
            Ristoratore r = (Ristoratore) new GestorePersistenza().cercaPerCampo(Ristoratore.class, "email", email);
            Session.getInstance().setUtenteLoggato(r);
        }
        return false;
    }
}