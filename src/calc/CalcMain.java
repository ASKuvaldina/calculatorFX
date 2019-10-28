package calc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class CalcMain extends Application {

    @Override
    public void start(final Stage stage) throws Exception{
//        String fxmlFile = "calc.fxml";
//        FXMLLoader loader = new FXMLLoader();
//        Parent root = loader.load(getClass().getResourceAsStream(fxmlFile));
        Parent root = FXMLLoader.load(getClass().getResource("calc.fxml"));


        stage.setTitle("Калькулятор");
        stage.setMaxHeight(350);
        stage.setMaxWidth(450);
        stage.setResizable(true);

        Scene sceneCalc = new Scene(root);
        stage.setScene(sceneCalc);
        

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
