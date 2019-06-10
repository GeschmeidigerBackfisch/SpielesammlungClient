package Main;

import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SchwimmenFrame extends Stage {
    SchwimmenFrame() {
        this.setTitle("schwimmen");

        GridPane root = new GridPane();
        Scene scene = new Scene(root, 500, 500);
        this.setScene(scene);

        show();
    }
}
