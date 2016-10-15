package com.jdenner.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Juliano
 */
public class JanelaController implements Initializable {
    
    @FXML
    private Label lbTexto;

    @FXML
    private TextField tfCampoTexto;

    @FXML
    public void apresentarTexto(ActionEvent event) {
        String texto = tfCampoTexto.getText();
        lbTexto.setText(texto);
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
