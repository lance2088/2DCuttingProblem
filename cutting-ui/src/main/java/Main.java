import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.image.Image;

/**
 * Created by Morgan on 11/03/2015.
 */
public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(Main.class.getResource("views/main.fxml"));
        Parent root = loader.load();

        Scene scene = getScene(root);
        scene.getStylesheets().add("css/styles.css");

        primaryStage.setTitle("Cutting Problem");
        primaryStage.setOnCloseRequest(event -> System.exit(0));
        primaryStage.getIcons().add(new Image("icons/logo.png"));
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Scene getScene(Parent root) {
        Rectangle2D screen = Screen.getPrimary().getBounds();
        return new Scene(root, screen.getWidth() * 0.9, screen.getHeight() * 0.9);
    }
}
