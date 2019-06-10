package Main;

import javafx.stage.Stage;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ClientImpl extends UnicastRemoteObject implements ClientInterface {

    Stage gameStage = null;

    ClientImpl(Stage gameStage) throws RemoteException {
        this.gameStage = gameStage;
    }

    @Override
    public void nachrichtAusgeben(String msg) {
        System.out.println(msg);
    }

    @Override
    public void spielBeenden(int grund) {

    }

    @Override
    public void zugPosition(int spieler) {

    }

    @Override
    public void kartenAusteilenSpieler(int[] handkarten) {

    }

    @Override
    public void kartenAusteilenPott(int[] pottkarten) {

    }

    public void setGameStage(Stage stage) {
        this.gameStage = stage;
    }

}
