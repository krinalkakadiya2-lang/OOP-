// pr34

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Pr34 extends Application {

    @Override
    public void start(Stage stage) {

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setHgap(10);
        grid.setVgap(10);

        Label lblRoll = new Label("Roll No:");
        Label lblName = new Label("Name:");
        Label lblAge = new Label("Age:");
        Label lblEmail = new Label("Email:");

        TextField txtRoll = new TextField();
        TextField txtName = new TextField();
        TextField txtAge = new TextField();
        TextField txtEmail = new TextField();

        Button btnSubmit = new Button("Submit");

        grid.add(lblRoll, 0, 0);
        grid.add(txtRoll, 1, 0);
        grid.add(lblName, 0, 1);
        grid.add(txtName, 1, 1);
        grid.add(lblAge, 0, 2);
        grid.add(txtAge, 1, 2);
        grid.add(lblEmail, 0, 3);
        grid.add(txtEmail, 1, 3);
        grid.add(btnSubmit, 1, 4);

        btnSubmit.setOnAction(e -> {
            try {
                int roll = Integer.parseInt(txtRoll.getText());
                String name = txtName.getText();
                int age = Integer.parseInt(txtAge.getText());
                String email = txtEmail.getText();

                if (!email.contains("@") || !email.contains(".")) {
                    throw new Exception("Invalid email format");
                }

                FileChooser fc = new FileChooser();
                fc.setTitle("Save Data");
                File file = fc.showSaveDialog(stage);

                if (file != null) {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
                    bw.write(roll + ", " + name + ", " + age + ", " + email);
                    bw.newLine();
                    bw.close();
                }

                Alert success = new Alert(Alert.AlertType.INFORMATION);
                success.setTitle("Success");
                success.setHeaderText("Registration Successful");
                success.setContentText(
                        "Roll No: " + roll +
                        "\nName: " + name +
                        "\nAge: " + age +
                        "\nEmail: " + email
                );
                success.showAndWait();

            } catch (NumberFormatException ex) {
                Alert error = new Alert(Alert.AlertType.ERROR);
                error.setTitle("Error");
                error.setHeaderText("Invalid Input");
                error.setContentText("Roll No and Age must be integers.");
                error.showAndWait();

            } catch (IOException ex) {
                Alert error = new Alert(Alert.AlertType.ERROR);
                error.setTitle("Error");
                error.setHeaderText("File Error");
                error.setContentText("Error writing to file.");
                error.showAndWait();

            } catch (Exception ex) {
                Alert error = new Alert(Alert.AlertType.ERROR);
                error.setTitle("Error");
                error.setHeaderText("Validation Error");
                error.setContentText(ex.getMessage());
                error.showAndWait();
            }
        });

        Scene scene = new Scene(grid, 350, 250);
        stage.setTitle("Registration Form");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
