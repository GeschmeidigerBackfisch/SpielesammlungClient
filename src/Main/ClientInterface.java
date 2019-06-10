package Main;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ClientInterface extends Remote {
    void nachrichtAusgeben(String var1) throws RemoteException;

    void spielBeenden(int var1) throws RemoteException;

    void zugPosition(int var1) throws RemoteException;

    void kartenAusteilenSpieler(int[] var1) throws RemoteException;

    void kartenAusteilenPott(int[] var1) throws RemoteException;
}