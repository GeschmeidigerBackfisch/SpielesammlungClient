package Main;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Main extends Application implements EventHandler {

    private String host = "localhost";
    private static final String BIND_NAME = "Spielesammlung-Server";
    private ServerInterface server;
    private ClientInterface client;

    private Stage launchStage;

    private String username;
    private TextField usernameInput;
    private ChoiceBox gameChooser;

    @Override
    public void start(Stage primaryStage) throws Exception{
        this.launchStage = primaryStage;
        GridPane root = new GridPane();
        launchStage.setTitle("Spiel auswählen");
        Scene scene = new Scene(root, 350, 150);
        launchStage.setScene(scene);

        Text label1 = new Text("Nutzernamen wählen:");
        usernameInput = new TextField();
        Text label2 = new Text("Spiel wählen wählen:");
        gameChooser = new ChoiceBox();
        gameChooser.getItems().addAll
                ("Schwimmen", "MauMau", "SchwarzerPeter");
        Button confirmButton = new Button("Loslegen");
        confirmButton.setOnAction(this);

        root.setVgap(10);
        root.setHgap(10);
        root.setPadding(new Insets(10, 10, 10, 10));
        root.setAlignment(Pos.CENTER);

        root.add(label1, 0, 1);
        root.add(usernameInput, 1 , 1);
        root.add(label2, 0, 2);
        root.add(gameChooser, 1, 2);
        root.add(confirmButton, 0, 3);

        initConnection();

        launchStage.show();
    }

    @Override
    public void handle(Event event) {

        String username = this.usernameInput.getText();

        try {

            switch(this.gameChooser.getValue().toString()) {
                case "Schwimmen":
                    Stage schwimmenStage = new SchwimmenFrame();
                    this.client = new ClientImpl(schwimmenStage);
                    this.launchStage.hide();
                    this.server.anmelden(client, username, 1);
                    break;
                case "MauMau":
                    this.server.anmelden(client, username, 2);
                    break;
                case "SchwarzerPeter":
                    this.server.anmelden(client, username, 3);
                    break;
            }
        }
        catch(RemoteException e) {
            System.out.println(e.getMessage());
        }
    }

    public void initConnection() {
        ServerInterface server = null;
        try {
            String bindURL = "rmi://" + host + "/" + BIND_NAME;
            server = (ServerInterface) Naming.lookup(bindURL);
            this.server = server;
        } catch (NotBoundException | MalformedURLException | RemoteException e) {
            System.out.println(e.getMessage());
        }
    }



    public static void main(String[] args) {
        launch(args);
    }

}
