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
            case 1:
                String strSomma = String.valueOf(operando1+operando2);
                displayLabel.setText(strSomma);
                tipoOp=0;
                break;
        }

    }
    @FXML
    protected void on0Click(){
        addNumberToDisplay("0");
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

    }

    @FXML
    protected void onPercentClick(){

    }

    @FXML
    protected void onSquaredClick(){

    }

    @FXML
    protected void onSqrtClick(){

    }

    @FXML
    protected void onDeleteEverythingClick(){
        operando1 = 0;
        operando2 = 0;
        displayLabel.setText("");
        opCompletata = false;
    }

    @FXML
    protected void onDeleteClick(){
        displayLabel.setText("");
        opCompletata = false;
    }

    @FXML
    protected void onBackspaceClick(){
        if(opCompletata == false) {
            String newStr = displayLabel.getText().substring(0, displayLabel.getText().length() - 1);
            displayLabel.setText(newStr);
        }
    }

    @FXML
    protected void onInverseClick(){

    }

    @FXML
    protected void onDivideClick(){

    }

    @FXML
    protected void onMultiplyClick(){

    }

    @FXML
    protected void onSignClick(){

    }

    @FXML
    protected void onMinusClick(){

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