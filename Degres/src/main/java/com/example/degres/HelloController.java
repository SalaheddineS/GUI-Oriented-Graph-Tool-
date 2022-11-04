package com.example.degres;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class HelloController {
    public String ARC;
    public String SOMMETS;
    @FXML
    private TextField AID;

    @FXML
    private TextField SID;
    private Degre D;

    @FXML
    public TextArea ZID;
    @FXML
    void btnConfirmer(ActionEvent event){
        ZID.clear();
        D=new Degre();
        D.setS(SID.getText()); //on recois les sommets et arc et on les splits
        D.setA(AID.getText());
        D.split();
        D.AfficherDegre(ZID);


        Stage mainWindow = (Stage) AID.getScene().getWindow();
        /*this.ARC =AID.getText();
        this.SOMMETS = SID.getText();*/
        mainWindow.setTitle("Stop Looking here :)");

    }

}
