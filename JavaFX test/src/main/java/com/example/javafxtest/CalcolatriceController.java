package com.example.javafxtest;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class CalcolatriceController {

    private double operando1;
    private double operando2;
    private int tipoOp=0;

    @FXML
    private Label displayLabel;
    private boolean opCompletata = false;
    private boolean flgSostituisci = true;

    @FXML
    protected void onAddClick()
    {
        String strOperando1 = displayLabel.getText();
        operando1 = Double.valueOf(strOperando1);
        flgSostituisci = true;
        tipoOp = 1;
    }
    @FXML
    protected void onEqualsClick()
    {
        String strOperando2 = displayLabel.getText();
        operando2 = Double.valueOf(strOperando2);
        flgSostituisci = true;
        opCompletata = true;

        switch(tipoOp)
        {
            case 1: // addizione
                double somma = operando1 + operando2;
                String strSomma = somma % 1 == 0 ? String.valueOf((int) somma) : String.valueOf(somma);
                displayLabel.setText(strSomma);
                tipoOp=0;
                break;
            case 2: // sottrazione
                double differenza = operando1 - operando2;
                String strDifferenza = differenza % 1 == 0 ? String.valueOf((int) differenza) : String.valueOf(differenza);
                displayLabel.setText(strDifferenza);
                tipoOp=0;
                break;
            case 3: // moltiplicazione
                double prodotto = operando1 * operando2;
                String strProdotto = prodotto % 1 == 0 ? String.valueOf((int) prodotto) : String.valueOf(prodotto);
                displayLabel.setText(strProdotto);
                tipoOp=0;
                break;
            case 4: // divisione
                double quoziente = operando1 / operando2;
                String strQuoziente = quoziente % 1 == 0 ? String.valueOf((int) quoziente) : String.valueOf(quoziente);
                displayLabel.setText(strQuoziente);
                tipoOp=0;
                break;
            default:
                break;
        }
    }
    @FXML
    protected void on0Click(){
        if(!displayLabel.getText().equals("0")){
            addNumberToDisplay("0");
        }

    }
    @FXML
    protected void on1Click() {
        addNumberToDisplay("1");
    }

    @FXML
    protected void on2Click() {
        addNumberToDisplay("2");
    }

    @FXML
    protected void on3Click() {
        addNumberToDisplay("3");
    }

    @FXML
    protected void on4Click() {
        addNumberToDisplay("4");
    }

    @FXML
    protected void on5Click() {
        addNumberToDisplay("5");
    }

    @FXML
    protected void on6Click() {
        addNumberToDisplay("6");
    }

    @FXML
    protected void on7Click() {
        addNumberToDisplay("7");
    }

    @FXML
    protected void on8Click() {
        addNumberToDisplay("8");
    }

    @FXML
    protected void on9Click() {
        addNumberToDisplay("9");
    }

    @FXML
    protected void onCommaClick(){
        if (!displayLabel.getText().contains(".")) {
            displayLabel.setText(displayLabel.getText() + ".");
        }
    }

    @FXML
    protected void onPercentClick(){
        double value = Double.parseDouble(displayLabel.getText());
        value /= 100;
        displayLabel.setText(String.valueOf(value));
    }

    @FXML
    protected void onSquaredClick(){
        double value = Double.parseDouble(displayLabel.getText());
        value *= value;
        if (value % 1 == 0) {
            int intValue = (int) value;
            displayLabel.setText(String.valueOf(intValue));
        } else {
            displayLabel.setText(String.valueOf(value));
        }
    }

    @FXML
    protected void onSqrtClick(){
        double value = Double.parseDouble(displayLabel.getText());
        value = Math.sqrt(value);
        if (value % 1 == 0) {
            int intValue = (int) value;
            displayLabel.setText(String.valueOf(intValue));
        } else {
            displayLabel.setText(String.valueOf(value));
        }
    }

    @FXML
    protected void onDeleteEverythingClick(){
        operando1 = 0;
        operando2 = 0;
        displayLabel.setText("0");
        opCompletata = false;
    }

    @FXML
    protected void onDeleteClick(){
        displayLabel.setText("0");
        opCompletata = false;
    }

    @FXML
    protected void onBackspaceClick(){
        if(opCompletata == false && !displayLabel.getText().equals("0")) {
            String newStr = displayLabel.getText().substring(0, displayLabel.getText().length() - 1);
            displayLabel.setText(newStr);
        }
    }

    @FXML
    protected void onInverseClick(){
        double value = Double.parseDouble(displayLabel.getText());
        if (value != 0) {
            value = 1 / value;
            displayLabel.setText(String.valueOf(value));
        } else {
            displayLabel.setText("ERROR");
        }
    }

    @FXML
    protected void onDivideClick(){
        String strOperando1 = displayLabel.getText();
        operando1 = Double.valueOf(strOperando1);
        flgSostituisci = true;
        tipoOp = 4;
    }

    @FXML
    protected void onMultiplyClick(){
        String strOperando1 = displayLabel.getText();
        operando1 = Double.valueOf(strOperando1);
        flgSostituisci = true;
        tipoOp = 3;
    }

    @FXML
    protected void onSignClick(){
        double value = Double.parseDouble(displayLabel.getText());
        value = -value;
        displayLabel.setText(String.valueOf(value));
    }

    @FXML
    protected void onMinusClick(){
        String strOperando1 = displayLabel.getText();
        operando1 = Double.valueOf(strOperando1);
        flgSostituisci = true;
        tipoOp = 2;
    }

    private void addNumberToDisplay(String number) {
        if (flgSostituisci) {
            displayLabel.setText(number);
            flgSostituisci = false;
        } else {
            String dispString = displayLabel.getText() + number;
            displayLabel.setText(dispString);
        }
    }
}