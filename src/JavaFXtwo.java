import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class JavaFXtwo extends Application {
    GridPane grid = new GridPane();
    Button btn = new Button();

    @Override
    public void start(Stage primaryStage) {
        Task task = new Task<Void>() {
            @Override
            protected Void call() {
                for (int i = 0; i < 10; i++) {
                    if (isCancelled()) {
                        break;
                    }
                    updateProgress(i, 10);
                    updateMessage(Integer.toString(i));

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ignore) {
                    }
                }
                return null;
            }

            @Override
            protected void succeeded() {
                updateMessage("10");
                btn.setDisable(false);
            }
        };

        grid.setAlignment(Pos.CENTER);
        grid.setHgap(20);
        grid.setVgap(15);
        grid.setPadding(new Insets(5, 5, 5, 5));

        Scene scene = new Scene(grid, 200, 50);
        primaryStage.setScene(scene);

        Label outlbl = new Label("0");
        outlbl.setFont(new Font(16));

        btn.setText("Start");

        btn.setOnAction(
                (e) -> {
                    btn.setDisable(true);
                    new Thread(task).start();

                    outlbl.textProperty().bind(
                            task.messageProperty()
                    );
                }
        );

        grid.add(btn, 0, 1);
        grid.add(outlbl, 1, 1);

        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
