/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;


import java.awt.Graphics;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Point2D;
import javafx.scene.input.MouseEvent;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.canvas.*;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author waki
 */
public class FXMLController implements Initializable{
  
    @FXML
    private Button bttn_1;
    @FXML
    private javafx.scene.canvas.Canvas texthere;
    static GraphicsContext gc;
    
   
    
    
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
   
    }   

    @FXML
    private void accion_mas(ActionEvent event) {
      gc = texthere.getGraphicsContext2D();
      gc.strokeRect(50,50,50,0);
      gc.strokeRect(75,25,0,50);
     
        
    }

    @FXML
    private void panel(MouseEvent event) {
        
    }



 }



