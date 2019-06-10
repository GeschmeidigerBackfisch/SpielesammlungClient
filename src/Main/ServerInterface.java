package Main;

import java.rmi.Remote;

public interface ServerInterface extends Remote {
    boolean anmelden(ClientInterface client, String username);
    void ready(int ClientId);
    void spielWaehlen(int spielNr);
    void nachrichtSchicken(String msg);
    void abmelden(ClientInterface client);

    //Schwimmen
    void klopfen();
    void schieben();
    void eineTauschen(int kartenNr, int pottNr);
    void dreiTauschen();
    void einunddreißig();
}
