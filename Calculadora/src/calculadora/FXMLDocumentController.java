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
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

/**
 *
 * @author krox2
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button bttn_mas, bttn_menos, bttn_0, bttn_1, bttn_2, bttn_3, bttn_4, bttn_5, bttn_6, bttn_7, bttn_x, bttn_parentesisDerecho,bttn_parentesisIzquierdo ;
    int mx = 0;
    
    @FXML
    private javafx.scene.canvas.Canvas texthere;
    static GraphicsContext gc;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    public void accion_mas(ActionEvent event) {//listo
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(Color.RED);
      gc.strokeLine(mx + 22.5,37.5,mx +22.5,62.5);        //Altura maxima = 25, Altura Minima, 75
      gc.strokeLine(mx +10,50,mx +35,50);        //Ancho maximo = 30, parte desde x = 10
      mx = mx + 35;
    }
    public void accion_menos(ActionEvent event) {//listo
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(Color.RED);
      gc.strokeLine(mx +10,50,mx +35,50);
      mx = mx + 35;
    }
    
    public void accion0(ActionEvent event) {//listo
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(Color.BLUE);
      gc.strokeLine(mx +10,25,mx +35,25);   //arriba
      gc.strokeLine(mx +10,75,mx +35,75);   //abajo
      gc.strokeLine(mx +10,25,mx +10,75);   //izquierda
      gc.strokeLine(mx +35,25,mx +35,75);   //derecha
      mx = mx + 35;
    }
    
    public void accion1(ActionEvent event) {//listo
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(Color.BLUE);
      gc.strokeLine(mx + 20,25,mx + 20,75);
      gc.strokeLine(mx + 20,25,mx + 10,35);
      mx = mx + 20;
    }
    
    public void accion2(ActionEvent event) {
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(Color.BLUE);
      gc.strokeLine(mx +10,25,mx +35,25);
      gc.strokeLine(mx +35,25,mx +35,50);
      gc.strokeLine(mx +10,50,mx +35,50); //horizontal media
      gc.strokeLine(mx +10,50,mx +10,75);
      gc.strokeLine(mx +10,75,mx +35,75);
      mx = mx + 35;
    }
    
    public void accion3(ActionEvent event) {
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(Color.BLUE);
      gc.strokeLine(mx +10,25,mx +35,25);
      gc.strokeLine(mx +35,25,mx +35,75);
      gc.strokeLine(mx +10,50,mx +35,50);
      gc.strokeLine(mx +10,75,mx +35,75);
      mx = mx + 35;
    }
    
    public void accion4(ActionEvent event) {
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(Color.BLUE);
      gc.strokeLine(mx +35,25,mx +35,75);
      gc.strokeLine(mx +10,50,mx +35,50);
      gc.strokeLine(mx +10,25,mx +10,50);
      mx = mx + 35; 
    }
    
    public void accion5(ActionEvent event) {
      gc = texthere.getGraphicsContext2D();
      gc.strokeLine(mx +10,25,mx +35,25);
      gc.strokeLine(mx +35,50,mx +35,75);
      gc.strokeLine(mx +10,50,mx +35,50);
      gc.strokeLine(mx +10,25,mx +10,50);
      gc.strokeLine(mx +10,75,mx +35,75);
      mx = mx + 35;
    }
    
    public void accion6(ActionEvent event) {
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(Color.BLUE);
      gc.strokeLine(mx +10,25,mx +35,25);   //arriba
      gc.strokeLine(mx +10,75,mx +35,75);   //abajo
      gc.strokeLine(mx +10,25,mx +10,75);   //izquierda
      gc.strokeLine(mx +35,50,mx +35,75);   //derecha abajo
      gc.strokeLine(mx +10,50,mx +35,50);
      mx = mx + 35;
    }
    
    public void accion7(ActionEvent event) {//listo
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(Color.BLUE);
      gc.strokeLine(mx +10,25,mx +35,25);   //arriba
      gc.strokeLine(mx +10,25,mx +10,50);   //izquierda arriba
      gc.strokeLine(mx +35,25,mx +35,75);   //derecha
      mx = mx + 35;
    }
    
    public void accion8(ActionEvent event) {//listo
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(Color.BLUE);
      gc.strokeLine(mx +10,25,mx +35,25);   //arriba
      gc.strokeLine(mx +10,75,mx +35,75);   //abajo
      gc.strokeLine(mx +10,25,mx +10,75);   //izquierda
      gc.strokeLine(mx +35,25,mx +35,75);   //derecha
      gc.strokeLine(mx +10,50,mx +35,50);   //horizontal media
      mx = mx + 35;
    }
    
    public void accion9(ActionEvent event) {
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(Color.BLUE);
      gc.strokeLine(mx +10,25,mx +35,25);   //arriba
      gc.strokeLine(mx +10,75,mx +35,75);   //abajo
      gc.strokeLine(mx +10,25,mx +10,50);   //izquierda arriba
      gc.strokeLine(mx +35,25,mx +35,75);   //derecha
      gc.strokeLine(mx +10,50,mx +35,50);   //horizontal media
      mx = mx + 35;
    }
    
    public void accion_x(ActionEvent event) {
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(Color.RED);
      gc.strokeLine(mx +10,35,mx + 22.5,65); 
      gc.strokeLine(mx +10,65,mx + 22.5,35);
      mx = mx + 25;
    }
    public void accion_parentesisIzquierdo(ActionEvent event) {
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(Color.RED);
      gc.strokeArc(mx +20,25,10,50,90,180,ArcType.OPEN); 
      mx = mx + 25;
    }
    public void accion_parentesisDerecho(ActionEvent event) {
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(Color.RED);
      gc.strokeArc(mx +10,25,10,50,90,-180,ArcType.OPEN); 
      mx = mx + 25;
    }

    @FXML
    private void panel(MouseEvent event) {
        
    }
    
}
