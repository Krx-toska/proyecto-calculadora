/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author krox2
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button bttn_mas;
    private Button bttn_menos;
    private Button bttn_0;
    private Button bttn_1;
    private Button bttn_2;
    private Button bttn_3;
    private Button bttn_4;
    private Button bttn_5;
    private Button bttn_6;
    private Button bttn_7;
    
    @FXML
    private javafx.scene.canvas.Canvas texthere;
    static GraphicsContext gc;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    public void accion_mas(ActionEvent event) {//listo
      
      
      gc = texthere.getGraphicsContext2D();
      gc.strokeRect(50,50,50,0);
      gc.strokeRect(75,25,0,50);
     
        
    }
    public void accion_menos(ActionEvent event) {//listo
      gc = texthere.getGraphicsContext2D();
      gc.strokeRect(25,25,25,0);
    }
    
    public void accion0(ActionEvent event) {//listo
      gc = texthere.getGraphicsContext2D();
      gc.strokeRect(10,50,25,50);
    }
    
    public void accion1(ActionEvent event) {//listo
      gc = texthere.getGraphicsContext2D();
      gc.strokeRect(85,50,0,50);
      gc.strokeRect(75,50,10,0);
      
    }
    public void accion2(ActionEvent event) {
      gc = texthere.getGraphicsContext2D();
      gc.strokeRect(75,50,0,50);
      gc.strokeRect(75,50,10,0);
      
    }
    public void accion3(ActionEvent event) {
      gc = texthere.getGraphicsContext2D();
      gc.strokeRect(75,50,0,50);
      gc.strokeRect(75,50,10,0);
      
    }
    public void accion4(ActionEvent event) {
      gc = texthere.getGraphicsContext2D();
      gc.strokeRect(75,50,0,50);
      gc.strokeRect(75,50,10,0);
      
    }
    public void accion5(ActionEvent event) {
      gc = texthere.getGraphicsContext2D();
      gc.strokeRect(75,50,0,50);
      gc.strokeRect(75,50,10,0);
      
    }
    public void accion6(ActionEvent event) {
      gc = texthere.getGraphicsContext2D();
      gc.strokeRect(75,50,0,50);
      gc.strokeRect(75,50,10,0);
      
    }
    public void accion7(ActionEvent event) {//listo
      gc = texthere.getGraphicsContext2D();
      gc.strokeRect(105,50,0,50);
      gc.strokeRect(75,50,30,0);
      
    }
    public void accion8(ActionEvent event) {//listo
      gc = texthere.getGraphicsContext2D();
      gc.strokeRect(25,25,25,25);
      gc.strokeRect(25,50,25,25);
      
    }
    public void accion9(ActionEvent event) {
      gc = texthere.getGraphicsContext2D();
      gc.strokeRect(25,25,25,25);
      gc.strokeRect(50,0,25,0);
      
    }
    
    
    

    @FXML
    private void panel(MouseEvent event) {
        
    }
    
}
