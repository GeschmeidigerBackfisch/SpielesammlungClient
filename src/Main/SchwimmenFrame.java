package Main;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Vector;

public class SchwimmenFrame extends Stage implements EventHandler {

    Vector<Spieler> spieler = new Vector<Spieler>();

    SchwimmenFrame() {
        this.setTitle("Schwimmen");

        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 500, 500);
        this.setScene(scene);

        Text label1 = new Text("Spieler in der Lobby: " + spieler.size());

        Button readyButton = new Button("Ready");
        readyButton.setMaxWidth(Double.MAX_VALUE);
        readyButton.setMaxHeight(Double.MAX_VALUE);

        readyButton.setOnAction(this);

        root.setTop(label1);
        root.setCenter(readyButton);

        show();
    }

    @Override
    public void handle(Event event) {
        System.out.println(event.getSource().toString());
    }
}
