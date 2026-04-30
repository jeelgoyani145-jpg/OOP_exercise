import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.Random;

public class pra33 extends Application {
    public void start(Stage primaryStage) {
        VBox vbox = new VBox(15);
        vbox.setStyle("-fx-alignment: center; -fx-padding: 20;");
        Random rand = new Random();
        for (int i = 1; i <= 5; i++) {
            Text text = new Text("Text " + i);
            text.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
            double r = rand.nextDouble();
            double g = rand.nextDouble();
            double b = rand.nextDouble();
            double opacity = 0.3 + rand.nextDouble() * 0.7;
            text.setFill(Color.color(r, g, b, opacity));
            vbox.getChildren().add(text);
        }
        Scene scene = new Scene(vbox, 400, 300);
        primaryStage.setTitle("Text Nodes");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
