import java.rmi.Remote;

public interface ClientInterface extends Remote {
    void nachrichtAusgeben(String msg);

    //Schwimmen
    void spielBeenden(int grund);
    void zugPosition(int spieler);
    void kartenAusteilenSpieler(int[] handkarten);
    void kartenAusteilenPott(int[] pottkarten);
}
