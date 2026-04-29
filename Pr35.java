import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class import35 extends Application {

    @Override
    public void start(Stage stage) {

        HBox root = new HBox(20);
        root.setAlignment(Pos.BOTTOM_CENTER);

        int scale = 5; // scaling factor for height

        // Projects
        VBox v1 = createBar("Projects — 20%", 20 * scale, Color.RED);

        // Quizzes
        VBox v2 = createBar("Quizzes — 10%", 10 * scale, Color.BLUE);

        // Midterm
        VBox v3 = createBar("Midterm Exams — 30%", 30 * scale, Color.GREEN);

        // Final
        VBox v4 = createBar("Final Exam — 40%", 40 * scale, Color.ORANGE);

        root.getChildren().addAll(v1, v2, v3, v4);

        Scene scene = new Scene(root, 400, 300);
        stage.setTitle("Grade Distribution Bar Chart");
        stage.setScene(scene);
        stage.show();
    }

    private VBox createBar(String label, int height, Color color) {
        Rectangle bar = new Rectangle(50, height);
        bar.setFill(color);

        Text text = new Text(label);

        VBox vbox = new VBox(5);
        vbox.setAlignment(Pos.BOTTOM_CENTER);
        vbox.getChildren().addAll(bar, text);

        return vbox;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
