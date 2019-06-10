package Main;

import com.sun.javafx.scene.control.LabeledText;
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

public class Main extends Application implements EventHandler {

    @Override
    public void start(Stage primaryStage) throws Exception{
        GridPane root = new GridPane();
        primaryStage.setTitle("Spiel auswählen");
        Scene scene = new Scene(root, 350, 150);
        primaryStage.setScene(scene);

        Text label1 = new Text("Nutzernamen wählen:");
        TextField usernameInput = new TextField();
        Text label2 = new Text("Spiel wählen wählen:");
        ChoiceBox gameChooser = new ChoiceBox();
        gameChooser.getItems().addAll
                ("Schwimmen", "Mau Mau", "Schwarzer Peter");
        Button confirmButton = new Button("Loslegen");

        root.setVgap(10);
        root.setHgap(10);
        root.setPadding(new Insets(10, 10, 10, 10));
        root.setAlignment(Pos.CENTER);


        root.add(label1, 0, 1);
        root.add(usernameInput, 1 , 1);
        root.add(label2, 0, 2);
        root.add(gameChooser, 1, 2);
        root.add(confirmButton, 0, 3);

        primaryStage.show();
    }

    @Override
    public void handle(Event event) {

    }

    public void initConnection() {

    }


    public static void main(String[] args) {
        launch(args);
    }

}