/************************
 * Autor: Raphael Ciorba
 * Datum: 26. Januar 2021
 * Übung: Color Calculator
 *************************/

package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.ColorCode;
import model.Model;

public class Controller {

    @FXML
    TextField redField;
    @FXML
    TextField greenField;
    @FXML
    TextField blueField;
    @FXML
    Button colorBtn;
    @FXML
    Label hexLbl;

    private Model model = new Model();


    @FXML
    public void initialize() {
        changeButtonColor();
    }


    private void changeButtonColor(){
        int r = model.getRed();
        int g = model.getGreen();
        int b = model.getBlue();

        colorBtn.setStyle("-fx-background-color: rgb(" + r + ", " + g + ", " + b + ");");
        hexLbl.setText("Hex: " + model.getHex());
    }


    @FXML
    private void fieldInputR(){
        try {
            model.changeColorViaAbsoluteValue(ColorCode.RED, redField.getText());
            changeButtonColor();
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("invalid input");
        }
    }

    @FXML
    private void fieldInputG(){
        try {
            model.changeColorViaAbsoluteValue(ColorCode.GREEN, greenField.getText());
            changeButtonColor();
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("invalid input");
        }
    }

    @FXML
    private void fieldInputB(){
        try {
            model.changeColorViaAbsoluteValue(ColorCode.BLUE, blueField.getText());
            changeButtonColor();
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("invalid input");
        }
    }


    @FXML
    private void valIncTenR(){
        model.changeColorViaRelativeValue(ColorCode.RED, 10);
        redField.setText(Integer.toString(model.getRed()));
        changeButtonColor();
    }

    @FXML
    private void valDecTenR(){
        model.changeColorViaRelativeValue(ColorCode.RED, -10);
        redField.setText(Integer.toString(model.getRed()));
        changeButtonColor();
    }


    @FXML
    private void valIncTenG(){
        model.changeColorViaRelativeValue(ColorCode.GREEN, 10);
        greenField.setText(Integer.toString(model.getGreen()));
        changeButtonColor();
    }

    @FXML
    private void valDecTenG(){
        model.changeColorViaRelativeValue(ColorCode.GREEN, -10);
        greenField.setText(Integer.toString(model.getGreen()));
        changeButtonColor();
    }


    @FXML
    private void valIncTenB(){
        model.changeColorViaRelativeValue(ColorCode.BLUE, 10);
        blueField.setText(Integer.toString(model.getBlue()));
        changeButtonColor();
    }

    @FXML
    private void valDecTenB(){
        model.changeColorViaRelativeValue(ColorCode.BLUE, -10);
        blueField.setText(Integer.toString(model.getBlue()));
        changeButtonColor();
    }

}