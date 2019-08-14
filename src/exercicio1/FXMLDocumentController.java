/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author IFNMG
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private Button buttonCalcular;
    @FXML
    private Label labelNumero;
    @FXML
    private Label labelDobro;
    @FXML
    private Label labelTriplo;
    @FXML
    private Label labelQuadrado;
    @FXML
    private Label labelCubo;
    @FXML
    private TextField textFieldNumero;
    @FXML
    private TextField textFieldDobro;
    @FXML
    private TextField textFieldTriplo;
    @FXML
    private TextField textFieldQuadrado;
    @FXML
    private TextField textFieldCubo;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Calcular(ActionEvent event) {
        String numero = textFieldNumero.getText();
        double num =Double.parseDouble(numero);
        
        //calculando dobro
        double dobro = num*2;
        textFieldDobro.setText(Double.toString(dobro));
        
        
        
        
        //calculando triplo
      double triplo = num*3;
        textFieldTriplo.setText(Double.toString(triplo));
        
        
        //calculando quadrado
       double quadrado = num*num;
          textFieldQuadrado.setText(Double.toString(quadrado));
        
          //calcular cubo
  
        //calculando quadrado
       double cubo = num*num*num;
          textFieldCubo.setText(Double.toString(cubo));
    }
    
}
