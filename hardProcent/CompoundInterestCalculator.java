import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CompoundInterestCalculator extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Калькулятор складного відсотка");

        // Створення полів вводу
        TextField principalField = new TextField();
        TextField rateField = new TextField();
        TextField periodsField = new TextField();
        TextField yearsField = new TextField();

        // Кнопка для розрахунку
        Button calculateButton = new Button("Розрахувати");

        // Поле для результатів
        Label resultLabel = new Label();

        // Розміщення елементів на GridPane
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setHgap(10);
        grid.setVgap(10);

        grid.add(new Label("Початкова сума (P):"), 0, 0);
        grid.add(principalField, 1, 0);

        grid.add(new Label("Річна ставка (%):"), 0, 1);
        grid.add(rateField, 1, 1);

        grid.add(new Label("Кількість нарахувань на рік:"), 0, 2);
        grid.add(periodsField, 1, 2);

        grid.add(new Label("Кількість років:"), 0, 3);
        grid.add(yearsField, 1, 3);

        grid.add(calculateButton, 0, 4);
        grid.add(resultLabel, 1, 4);

        // Додавання логіки кнопки
        calculateButton.setOnAction(e -> {
            try {
                double P = Double.parseDouble(principalField.getText());
                double r = Double.parseDouble(rateField.getText()) / 100;
                int n = Integer.parseInt(periodsField.getText());
                int t = Integer.parseInt(yearsField.getText());

                double A = P * Math.pow(1 + r / n, n * t);

                resultLabel.setText(String.format("Кінцева сума: %.2f", A));
            } catch (NumberFormatException ex) {
                resultLabel.setText("Помилка: Перевірте введені дані!");
            }
        });

        // Налаштування сцени
        Scene scene = new Scene(grid, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
