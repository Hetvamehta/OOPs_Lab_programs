import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class GradeDistributionBars extends Application {
    @Override
    public void start(Stage stage) {
        Label header = new Label("Hetva-25");
        header.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");

        HBox barsContainer = new HBox(20);
        barsContainer.setAlignment(Pos.BOTTOM_CENTER);
        barsContainer.setPadding(new Insets(20));

        barsContainer.getChildren().add(createBar("Projects - 20%", 20, Color.RED));
        barsContainer.getChildren().add(createBar("Quizzes - 10%", 10, Color.BLUE));
        barsContainer.getChildren().add(createBar("Midterm Exams - 30%", 30, Color.GREEN));
        barsContainer.getChildren().add(createBar("Final Exam - 40%", 40, Color.ORANGE));

        VBox root = new VBox(10, header, barsContainer);
        root.setAlignment(Pos.TOP_CENTER);
        root.setPadding(new Insets(12));

        Scene scene = new Scene(root, 700, 420);
        stage.setTitle("Practical 55");
        stage.setScene(scene);
        stage.show();
    }

    private VBox createBar(String labelText, int percentage, Color color) {
        double scale = 6.0;
        Rectangle bar = new Rectangle(80, percentage * scale);
        bar.setFill(color);

        Label label = new Label(labelText);
        label.setWrapText(true);
        label.setMaxWidth(100);
        label.setAlignment(Pos.CENTER);

        VBox barBox = new VBox(8, bar, label);
        barBox.setAlignment(Pos.BOTTOM_CENTER);
        return barBox;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
