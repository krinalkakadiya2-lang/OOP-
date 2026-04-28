import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.scene.paint.Color;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import java.util.Random;

public class Pr33 extends Application {

    @Override
    public void start(Stage stage) {
        VBox vbox = new VBox(10);
        vbox.setAlignment(Pos.CENTER);

        Random rand = new Random();

        for (int i = 1; i <= 5; i++) {
            Text text = new Text("Text " + i);

            text.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));

            double r = rand.nextDouble();
            double g = rand.nextDouble();
            double b = rand.nextDouble();
            double opacity = 0.3 + (rand.nextDouble() * 0.7);

            text.setFill(new Color(r, g, b, opacity));

            vbox.getChildren().add(text);
        }

        Scene scene = new Scene(vbox, 400, 300);
        stage.setTitle("Random Styled Texts");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
