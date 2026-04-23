import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class BouncingBallControl extends Application {
    private final Circle ball = new Circle(18, Color.DODGERBLUE);
    private final Slider speedSlider = new Slider(1, 15, 6);
    private double velocityX = 3;
    private boolean running = false;

    @Override
    public void start(Stage stage) {
        Label header = new Label("Hetva-25");
        header.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");

        Pane animationPane = new Pane();
        animationPane.setPrefHeight(260);
        animationPane.getChildren().add(ball);

        ball.setCenterX(40);
        ball.setCenterY(130);

        speedSlider.setShowTickLabels(true);
        speedSlider.setShowTickMarks(true);

        Button startButton = new Button("Start");
        Button stopButton = new Button("Stop");

        HBox controls = new HBox(12, startButton, stopButton, new Label("Speed"), speedSlider);
        controls.setAlignment(Pos.CENTER);

        BorderPane root = new BorderPane();
        BorderPane.setMargin(header, new Insets(12, 0, 8, 0));
        BorderPane.setAlignment(header, Pos.CENTER);
        root.setTop(header);
        root.setCenter(animationPane);
        root.setBottom(controls);
        BorderPane.setMargin(controls, new Insets(12));

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                if (!running) {
                    return;
                }
                double paneWidth = animationPane.getWidth();
                double radius = ball.getRadius();
                velocityX = Math.signum(velocityX) * speedSlider.getValue();
                double nextX = ball.getCenterX() + velocityX;

                if (nextX - radius <= 0) {
                    nextX = radius;
                    velocityX = Math.abs(velocityX);
                } else if (nextX + radius >= paneWidth) {
                    nextX = paneWidth - radius;
                    velocityX = -Math.abs(velocityX);
                }

                ball.setCenterX(nextX);
            }
        };
        timer.start();

        startButton.setOnAction(event -> running = true);
        stopButton.setOnAction(event -> running = false);

        animationPane.widthProperty().addListener((obs, oldVal, newVal) -> {
            double radius = ball.getRadius();
            if (ball.getCenterX() + radius > newVal.doubleValue()) {
                ball.setCenterX(newVal.doubleValue() - radius);
            }
            if (ball.getCenterX() - radius < 0) {
                ball.setCenterX(radius);
            }
        });

        animationPane.heightProperty().addListener((obs, oldVal, newVal) -> {
            double radius = ball.getRadius();
            if (ball.getCenterY() + radius > newVal.doubleValue()) {
                ball.setCenterY(newVal.doubleValue() - radius);
            }
            if (ball.getCenterY() - radius < 0) {
                ball.setCenterY(radius);
            }
        });

        Scene scene = new Scene(root, 640, 360);
        stage.setTitle("Practical 53");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
