package Main;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServerInterface extends Remote {
    boolean anmelden(ClientInterface client, String username, int spielId) throws RemoteException;
    void ready(int ClientId) throws RemoteException;
    void nachrichtSchicken(String msg) throws RemoteException;
    void abmelden(ClientInterface client) throws RemoteException;

    //Schwimmen
    void klopfen() throws RemoteException;
    void schieben() throws RemoteException;
    void eineTauschen(int kartenNr, int pottNr) throws RemoteException;
    void dreiTauschen() throws RemoteException;
    void einunddreißig() throws RemoteException;
}
