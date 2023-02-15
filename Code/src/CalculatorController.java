import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Paint;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class CalculatorController {

    @FXML
    private Label lblDisplay;

    @FXML
    private JFXTextField txtDisplay;

    String formula = "";

    //=====================================

    @FXML
    void answer(ActionEvent event) {
        lblDisplay.setText(formula);

        // get numeric answers using string formula eg: "10*3+2" -> 32
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        try {
            formula = engine.eval(formula).toString();
            txtDisplay.setText(formula);
        } catch (Exception e) {
            lblDisplay.setText("Wrong inputs!");
            txtDisplay.requestFocus();
            txtDisplay.setFocusColor(Paint.valueOf("Red"));
        }
    }

    @FXML
    void backSpaceOnAction(ActionEvent event) {
        String currentValue = txtDisplay.getText();
        if (!currentValue.equals("")) {
            formula = removeLastCharacter(currentValue);
            txtDisplay.setText(formula);
        }
    }

    @FXML
    void clearAllOnAction(ActionEvent event) {
        formula = "";
        txtDisplay.setText(formula);
        lblDisplay.setText(formula);
    }

    //=====================================

    @FXML
    void plus(ActionEvent event) {
        txtDisplay.setText(printValue("+"));
    }

    @FXML
    void minus(ActionEvent event) {
        txtDisplay.setText(printValue("-"));
    }

    @FXML
    void multiply(ActionEvent event) {
        txtDisplay.setText(printValue("*"));
    }

    @FXML
    void divide(ActionEvent event) {
        txtDisplay.setText(printValue("/"));
    }

    @FXML
    void dot(ActionEvent event) {
        txtDisplay.setText(printValue("."));
    }

    //=====================================

    @FXML
    void zero(ActionEvent event) {
        txtDisplay.setText(printValue("0"));
    }

    @FXML
    void one(ActionEvent event) {
        txtDisplay.setText(printValue("1"));
    }

    @FXML
    void two(ActionEvent event) {
        txtDisplay.setText(printValue("2"));
    }

    @FXML
    void tree(ActionEvent event) {
        txtDisplay.setText(printValue("3"));
    }

    @FXML
    void four(ActionEvent event) {
        txtDisplay.setText(printValue("4"));
    }

    @FXML
    void five(ActionEvent event) {
        txtDisplay.setText(printValue("5"));
    }

    @FXML
    void six(ActionEvent event) {
        txtDisplay.setText(printValue("6"));
    }

    @FXML
    void seven(ActionEvent event) {
        txtDisplay.setText(printValue("7"));
    }

    @FXML
    void eight(ActionEvent event) {
        txtDisplay.setText(printValue("8"));
    }

    @FXML
    void nine(ActionEvent event) {
        txtDisplay.setText(printValue("9"));
    }

    //===============================
    public String removeLastCharacter(String current) {
        current = current.substring(0, current.length() - 1) + "";
        return current;
    }

    private String printValue(String s) {
        formula = formula + s;
        //System.out.println(formula);
        return formula;
    }
}