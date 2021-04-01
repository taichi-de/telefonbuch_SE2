package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../../../../../Downloads/sample.fxml"));

        //BorderPane root = new BorderPane();
        TelefonBook telefonBook = new TelefonBook();
        EntryArea entryArea = new EntryArea(telefonBook.getNumbers());

       // SearchArea searchArea = new SearchArea(value -> entryArea.setItems(telefonBook.search(value)));

        //root.setTop(searchArea.getPane());
       // root.setCenter(entryArea.getAnchorPane());

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
