import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class pra35 extends Application {
    public void start(Stage primaryStage) {
        String[] labels = {"Projects — 20%", "Quizzes — 10%", "Midterm — 30%", "Final — 40%"};
        double[] percents = {20, 10, 30, 40};
        Color[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE};
        double maxHeight = 200;

        HBox hbox = new HBox(30);
        hbox.setPadding(new Insets(30));
        hbox.setAlignment(Pos.BOTTOM_CENTER);

        for (int i = 0; i < labels.length; i++) {
            double barHeight = (percents[i] / 100.0) * maxHeight;
            Rectangle bar = new Rectangle(60, barHeight, colors[i]);
            Text label = new Text(labels[i]);
            VBox col = new VBox(5, bar, label);
            col.setAlignment(Pos.BOTTOM_CENTER);
            hbox.getChildren().add(col);
        }

        primaryStage.setTitle("Grade Distribution Bar Chart");
        primaryStage.setScene(new Scene(hbox, 500, 320));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
