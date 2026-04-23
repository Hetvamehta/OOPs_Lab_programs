import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.regex.Pattern;

public class RegistrationFormValidation extends Application {
    private static final Pattern EMAIL_PATTERN = Pattern.compile(".+@.+\\..+");

    @Override
    public void start(Stage stage) {
        Label header = new Label("Hetva-25");
        header.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");

        GridPane form = new GridPane();
        form.setHgap(10);
        form.setVgap(10);
        form.setPadding(new Insets(15));

        TextField rollNoField = new TextField();
        TextField nameField = new TextField();
        TextField ageField = new TextField();
        TextField emailField = new TextField();

        form.add(new Label("Roll_NO"), 0, 0);
        form.add(rollNoField, 1, 0);
        form.add(new Label("Name"), 0, 1);
        form.add(nameField, 1, 1);
        form.add(new Label("Age"), 0, 2);
        form.add(ageField, 1, 2);
        form.add(new Label("Email"), 0, 3);
        form.add(emailField, 1, 3);

        Button submitButton = new Button("Submit");
        form.add(submitButton, 1, 4);

        submitButton.setOnAction(event -> {
            String rollNoText = rollNoField.getText().trim();
            String nameText = nameField.getText().trim();
            String ageText = ageField.getText().trim();
            String emailText = emailField.getText().trim();

            int rollNo;
            int age;

            try {
                rollNo = Integer.parseInt(rollNoText);
            } catch (NumberFormatException ex) {
                showError("RollNo must be an integer.");
                return;
            }

            try {
                age = Integer.parseInt(ageText);
            } catch (NumberFormatException ex) {
                showError("Age must be an integer.");
                return;
            }

            if (!EMAIL_PATTERN.matcher(emailText).matches()) {
                showError("Email must contain @ and .");
                return;
            }

            Alert success = new Alert(Alert.AlertType.INFORMATION);
            success.setTitle("Registration Successful");
            success.setHeaderText("Submitted Details");
            success.setContentText(
                    "Roll_NO: " + rollNo + "\n" +
                    "Name: " + nameText + "\n" +
                    "Age: " + age + "\n" +
                    "Email: " + emailText
            );
            success.showAndWait();
        });

        VBox root = new VBox(8, header, form);
        root.setAlignment(Pos.TOP_CENTER);
        root.setPadding(new Insets(10));

        Scene scene = new Scene(root, 420, 320);
        stage.setTitle("Practical 54");
        stage.setScene(scene);
        stage.show();
    }

    private void showError(String message) {
        Alert error = new Alert(Alert.AlertType.ERROR);
        error.setTitle("Validation Error");
        error.setHeaderText("Invalid Input");
        error.setContentText(message);
        error.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
