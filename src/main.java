import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by Filip on 28.10.2016.
 */
public class main extends Application{


    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane stack = new StackPane();
        Scene scene = new Scene(stack, 500, 200);
        Label tekst = new Label("Hello World!");

        stack.getChildren().addAll(tekst);


        primaryStage.setScene(scene);
        primaryStage.setTitle("Vaheetapp 2");
        primaryStage.show();
    }
}
