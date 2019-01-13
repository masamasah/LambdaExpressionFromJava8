import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavaFXone extends Application {
    Text title;
    Label lbl;
    Label outlbl;
    TextField inputField;
    Button btn;

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(5);
        grid.setVgap(15);
        grid.setPadding(new Insets(10, 10, 10, 25));

        Scene scene = new Scene(grid, 300, 250);
        primaryStage.setScene(scene);

        title = new Text("Input the Name");
        title.setFont(new Font(20));
        grid.add(title, 0, 0);

        lbl = new Label("Name");
        inputField = new TextField();

        HBox fieldBox = new HBox(5);
        fieldBox.getChildren().addAll(lbl, inputField);
        grid.add(fieldBox, 0, 1);

        btn = new Button();
        btn.setText("Click");
        btn.setOnAction(
                (e) -> outlbl.setText("Hello " + inputField.getText())
        );

        grid.add(btn, 0, 2);

        GridPane.setHalignment(btn, HPos.RIGHT);

        outlbl = new Label();
        outlbl.setFont(new Font(16));
        outlbl.setText("Hello");
        grid.add(outlbl, 0, 3);
        GridPane.setHalignment(outlbl, HPos.CENTER);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
