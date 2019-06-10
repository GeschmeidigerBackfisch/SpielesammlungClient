package Main;

public class Spieler {

    private String username;
    private int spielerId;
    private boolean isReady;


    public int getSpielerId() {
        return spielerId;
    }

    public boolean isReady() {
        return isReady;
    }

    public void setReady(boolean ready) {
        isReady = ready;
    }

    Spieler(String username, int spielerId) {
        this.spielerId = spielerId;
        this.username = username;
    }
}
