import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.web.WebView;


public class Main extends Application  {

    private static Stage stage;
    private static Scene mainScene;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        Parent fxmlMain = FXMLLoader.load(getClass().getResource("/fxml/main.fxml"));
        mainScene = new Scene(fxmlMain);
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
