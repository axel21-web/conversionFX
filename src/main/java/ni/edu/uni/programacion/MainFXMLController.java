/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.programacion;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.Border;
import uni.edeu.ni.programacion.conversionfx.App;

/**
 * FXML Controller class
 *
 * @author Sistemas-31
 */
public class MainFXMLController implements Initializable {

    @FXML
    public Button btnTemperatura;
    @FXML
    public Button btnCurrency;
    @FXML
    public Border border;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void btnTemperaturaAction(){
        try {
          Node parent = App.loadFXML("TemperatureFXML");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public void btnCurrencyAction(){
        
    }
}
