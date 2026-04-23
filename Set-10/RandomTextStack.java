import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Random;

public class RandomTextStack extends Application {
    @Override
    public void start(Stage stage) {
        Random random = new Random();

        VBox root = new VBox(14);
        root.setAlignment(Pos.CENTER);

        Text header = new Text("Hetva-25");
        header.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
        header.setFill(Color.BLACK);
        header.setOpacity(1.0);
        root.getChildren().add(header);

        for (int i = 1; i <= 5; i++) {
            Text text = new Text("Text " + i);
            text.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
            text.setFill(Color.color(random.nextDouble(), random.nextDouble(), random.nextDouble()));
            text.setOpacity(0.3 + (0.7 * random.nextDouble()));
            root.getChildren().add(text);
        }

        Scene scene = new Scene(root, 500, 380);
        stage.setTitle("Practical 52");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
