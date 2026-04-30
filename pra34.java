import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class pra34 extends Application {
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setHgap(10);
        grid.setVgap(10);

        TextField rollField = new TextField();
        TextField nameField = new TextField();
        TextField ageField = new TextField();
        TextField emailField = new TextField();

        grid.add(new Label("Roll No:"), 0, 0); grid.add(rollField, 1, 0);
        grid.add(new Label("Name:"), 0, 1); grid.add(nameField, 1, 1);
        grid.add(new Label("Age:"), 0, 2); grid.add(ageField, 1, 2);
        grid.add(new Label("Email:"), 0, 3); grid.add(emailField, 1, 3);

        Button submit = new Button("Submit");
        grid.add(submit, 1, 4);

        submit.setOnAction(e -> {
            try {
                int roll = Integer.parseInt(rollField.getText());
                String name = nameField.getText();
                int age = Integer.parseInt(ageField.getText());
                String email = emailField.getText();
                if (!email.contains("@") || !email.contains(".")) {
                    throw new IllegalArgumentException("Invalid email address.");
                }
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Registration Successful");
                alert.setContentText("Roll No: " + roll + "\nName: " + name + "\nAge: " + age + "\nEmail: " + email);
                alert.showAndWait();
            } catch (NumberFormatException ex) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Validation Error");
                alert.setContentText("Roll No and Age must be integers.");
                alert.showAndWait();
            } catch (IllegalArgumentException ex) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Validation Error");
                alert.setContentText(ex.getMessage());
                alert.showAndWait();
            }
        });

        primaryStage.setTitle("Registration Form");
        primaryStage.setScene(new Scene(grid, 350, 250));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
