/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.net.URL;
import java.util.ArrayList;
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
    @FXML
    private Button bttn_8;
    @FXML
    private Button bttn_9;
    @FXML
    private Button bbtn_clear;
    @FXML
    private Button bbtn_dividir;
    @FXML
    private Button bbtn_cor;
    
    
    int posicion =0;
        
    ArrayList<String> operacion = new ArrayList<String>();
    

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
    }    
    
    
    @FXML
    public void accion_mas(ActionEvent event) {//listo
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(Color.RED);
      gc.strokeLine(mx + 22.5,37.5,mx +22.5,62.5);        //Altura maxima = 25, Altura Minima, 75
      gc.strokeLine(mx +10,50,mx +35,50);        //Ancho maximo = 30, parte desde x = 10
      mx = mx + 35;
      
    }
    @FXML
    public void accion_menos(ActionEvent event) {//listo
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(Color.RED);
      gc.strokeLine(mx +10,50,mx +35,50);
      mx = mx + 35;
    }
    
    @FXML
    public void accion0(ActionEvent event) {//listo
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(Color.BLUE);
      gc.strokeLine(mx +10,25,mx +35,25);   //arriba
      gc.strokeLine(mx +10,75,mx +35,75);   //abajo
      gc.strokeLine(mx +10,25,mx +10,75);   //izquierda
      gc.strokeLine(mx +35,25,mx +35,75);   //derecha
      operacion.add("0");
      mx = mx + 35;
    }
    
    @FXML
    public void accion1(ActionEvent event) {//listo
      
      if(operacion.isEmpty()){  
           gc = texthere.getGraphicsContext2D();
           gc.setStroke(Color.BLUE);
           gc.strokeLine(mx + 20,25,mx + 20,75);
           gc.strokeLine(mx + 20,25,mx + 10,35);
           mx = mx + 35;
           operacion.add("1");
           posicion = posicion + 1;
           }
      
      
      else if(operacion.get(operacion.size()-1) != "/"){  
           gc = texthere.getGraphicsContext2D();
           gc.setStroke(Color.BLUE);
           gc.strokeLine(mx + 20,25,mx + 20,75);
           gc.strokeLine(mx + 20,25,mx + 10,35);
           mx = mx + 35;
           operacion.add("1");
           posicion = posicion + 1;
           }
      
      else if(operacion.get(operacion.size()-1) == "/"){  
           gc = texthere.getGraphicsContext2D();
           gc.setStroke(Color.BLUE);
           gc.strokeLine(mx + 20,85,mx + 20,135);
           gc.strokeLine(mx + 20,85,mx + 10,95);
           mx = mx + 35;
           operacion.add("1");
           posicion = posicion + 1;
      
      }}
    
    @FXML
    public void accion2(ActionEvent event) {
    if(operacion.isEmpty()){     
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(Color.BLUE);
      gc.strokeLine(mx +10,25,mx +35,25);
      gc.strokeLine(mx +35,25,mx +35,50);
      gc.strokeLine(mx +10,50,mx +35,50); //horizontal media
      gc.strokeLine(mx +10,50,mx +10,75);
      gc.strokeLine(mx +10,75,mx +35,75);
      mx = mx + 35;
      operacion.add("2");
      posicion = posicion + 1;}
    
    else if(operacion.get(operacion.size()-1) != "/"){  
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(Color.BLUE);
      gc.strokeLine(mx +10,25,mx +35,25);
      gc.strokeLine(mx +35,25,mx +35,50);
      gc.strokeLine(mx +10,50,mx +35,50); //horizontal media
      gc.strokeLine(mx +10,50,mx +10,75);
      gc.strokeLine(mx +10,75,mx +35,75);
      mx = mx + 35;
      operacion.add("2");
      posicion = posicion + 1;
    
    }
    
    else if(operacion.get(operacion.size()-1) == "/"){
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(Color.BLUE);
      gc.strokeLine(mx +10,85,mx +35,85);
      gc.strokeLine(mx +35,85,mx +35,110);
      gc.strokeLine(mx +10,110,mx +35,110); //horizontal media
      gc.strokeLine(mx +10,110,mx +10,135);
      gc.strokeLine(mx +10,135,mx +35,135);
      mx = mx + 35;
      operacion.add("2");
      posicion = posicion + 1;
    }
   
    }
    
    
    
    
    
    @FXML
    public void accion3(ActionEvent event) {
        
      if(operacion.isEmpty()){  
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(Color.BLUE);
      gc.strokeLine(mx +10,25,mx +35,25);
      gc.strokeLine(mx +35,25,mx +35,75);
      gc.strokeLine(mx +10,50,mx +35,50);
      gc.strokeLine(mx +10,75,mx +35,75);
      mx = mx + 35;
      operacion.add("3");
      posicion = posicion + 1;
      }
      
      else if(operacion.get(operacion.size()-1) != "/"){ 
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(Color.BLUE);
      gc.strokeLine(mx +10,25,mx +35,25);
      gc.strokeLine(mx +35,25,mx +35,75);
      gc.strokeLine(mx +10,50,mx +35,50);
      gc.strokeLine(mx +10,75,mx +35,75);
      mx = mx + 35;
      operacion.add("3");
      posicion = posicion + 1;
      }
      else if(operacion.get(operacion.size()-1) == "/"){
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(Color.BLUE);
      gc.strokeLine(mx +10,85,mx +35,85);
      gc.strokeLine(mx +35,85,mx +35,135);
      gc.strokeLine(mx +10,110,mx +35,110);
      gc.strokeLine(mx +10,135,mx +35,135);
      mx = mx + 35;
      operacion.add("3");
      posicion = posicion + 1;
      }
      
      
      }
     
    
    @FXML
    public void accion4(ActionEvent event) {
        
      if(operacion.isEmpty()){    
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(Color.BLUE);
      gc.strokeLine(mx +35,25,mx +35,75);
      gc.strokeLine(mx +10,50,mx +35,50);
      gc.strokeLine(mx +10,25,mx +10,50);
      mx = mx + 35;
      operacion.add("4");
      posicion = posicion + 1;}
      
      else if(operacion.get(operacion.size()-1) != "/"){ 
      
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(Color.BLUE);
      gc.strokeLine(mx +35,25,mx +35,75);
      gc.strokeLine(mx +10,50,mx +35,50);
      gc.strokeLine(mx +10,25,mx +10,50);
      mx = mx + 35;
      operacion.add("4");
      posicion = posicion + 1;}
      
      
      else if(operacion.get(operacion.size()-1) == "/"){
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(Color.BLUE);
      gc.strokeLine(mx +35,85,mx +35,135);
      gc.strokeLine(mx +10,110,mx +35,110);
      gc.strokeLine(mx +10,85,mx +10,110);
      mx = mx + 35;
      operacion.add("4");
      posicion = posicion + 1;}

    }
    
    @FXML
    public void accion5(ActionEvent event) {
        
        
      if(operacion.isEmpty()){      
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(Color.BLUE);
      gc.strokeLine(mx +10,25,mx +35,25);
      gc.strokeLine(mx +35,50,mx +35,75);
      gc.strokeLine(mx +10,50,mx +35,50);
      gc.strokeLine(mx +10,25,mx +10,50);
      gc.strokeLine(mx +10,75,mx +35,75);
      mx = mx + 35;
      operacion.add("5");
      posicion = posicion + 1;}
      
      else if(operacion.get(operacion.size()-1) != "/"){ 
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(Color.BLUE);
      gc.strokeLine(mx +10,25,mx +35,25);
      gc.strokeLine(mx +35,50,mx +35,75);
      gc.strokeLine(mx +10,50,mx +35,50);
      gc.strokeLine(mx +10,25,mx +10,50);
      gc.strokeLine(mx +10,75,mx +35,75);
      mx = mx + 35;
      operacion.add("5");
      posicion = posicion + 1;}
      
      else if(operacion.get(operacion.size()-1) == "/"){
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(Color.BLUE);
      gc.strokeLine(mx +10,85,mx +35,85);
      gc.strokeLine(mx +35,110,mx +35,135);
      gc.strokeLine(mx +10,110,mx +35,110);
      gc.strokeLine(mx +10,85,mx +10,110);
      gc.strokeLine(mx +10,135,mx +35,135);
      mx = mx + 35;
      operacion.add("5");
      posicion = posicion + 1;
      
      }
      
      
      
    }
    
    @FXML
    public void accion6(ActionEvent event) {
      if(operacion.isEmpty()){  
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(Color.BLUE);
      gc.strokeLine(mx +10,25,mx +35,25);   //arriba
      gc.strokeLine(mx +10,75,mx +35,75);   //abajo
      gc.strokeLine(mx +10,25,mx +10,75);   //izquierda
      gc.strokeLine(mx +35,50,mx +35,75);   //derecha abajo
      gc.strokeLine(mx +10,50,mx +35,50);
      mx = mx + 35;
      operacion.add("6");
      posicion = posicion + 1;}
      
      else if(operacion.get(operacion.size()-1) != "/"){ 
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(Color.BLUE);
      gc.strokeLine(mx +10,25,mx +35,25);   //arriba
      gc.strokeLine(mx +10,75,mx +35,75);   //abajo
      gc.strokeLine(mx +10,25,mx +10,75);   //izquierda
      gc.strokeLine(mx +35,50,mx +35,75);   //derecha abajo
      gc.strokeLine(mx +10,50,mx +35,50);
      mx = mx + 35;
      operacion.add("6");
      posicion = posicion + 1;
      }
      
      else if(operacion.get(operacion.size()-1) == "/"){
      
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(Color.BLUE);
      gc.strokeLine(mx +10,85,mx +35,85);   //arriba
      gc.strokeLine(mx +10,135,mx +35,135);   //abajo
      gc.strokeLine(mx +10,85,mx +10,135);   //izquierda
      gc.strokeLine(mx +35,110,mx +35,135);   //derecha abajo
      gc.strokeLine(mx +10,110,mx +35,110);
      mx = mx + 35;
      operacion.add("6");
      posicion = posicion + 1;
      
      }
      
      
    }
    
    @FXML
    public void accion7(ActionEvent event) {
      
      if(operacion.isEmpty()){
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(Color.BLUE);
      gc.strokeLine(mx +10,25,mx +35,25);   //arriba
      gc.strokeLine(mx +10,25,mx +10,50);   //izquierda arriba
      gc.strokeLine(mx +35,25,mx +35,75);   //derecha
      mx = mx + 35;
      operacion.add("7");
      posicion = posicion + 1;}
      
      else if(operacion.get(operacion.size()-1) != "/"){
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(Color.BLUE);
      gc.strokeLine(mx +10,25,mx +35,25);   //arriba
      gc.strokeLine(mx +10,25,mx +10,50);   //izquierda arriba
      gc.strokeLine(mx +35,25,mx +35,75);   //derecha
      mx = mx + 35;
      operacion.add("7");
      posicion = posicion + 1;
      }
      else if(operacion.get(operacion.size()-1) == "/"){
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(Color.BLUE);
      gc.strokeLine(mx +10,85,mx +35,85);   //arriba
      gc.strokeLine(mx +10,85,mx +10,110);   //izquierda arriba
      gc.strokeLine(mx +35,85,mx +35,135);   //derecha
      mx = mx + 35;
      operacion.add("7");
      posicion = posicion + 1;
      
      }
      
    }
    
    @FXML
    public void accion8(ActionEvent event) {
      if(operacion.isEmpty()){
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(Color.BLUE);
      gc.strokeLine(mx +10,25,mx +35,25);   //arriba
      gc.strokeLine(mx +10,75,mx +35,75);   //abajo
      gc.strokeLine(mx +10,25,mx +10,75);   //izquierda
      gc.strokeLine(mx +35,25,mx +35,75);   //derecha
      gc.strokeLine(mx +10,50,mx +35,50);   //horizontal media
      mx = mx + 35;
      operacion.add("8");
      posicion = posicion + 1;}
      
      else if(operacion.get(operacion.size()-1) != "/"){
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(Color.BLUE);
      gc.strokeLine(mx +10,25,mx +35,25);   //arriba
      gc.strokeLine(mx +10,75,mx +35,75);   //abajo
      gc.strokeLine(mx +10,25,mx +10,75);   //izquierda
      gc.strokeLine(mx +35,25,mx +35,75);   //derecha
      gc.strokeLine(mx +10,50,mx +35,50);   //horizontal media
      mx = mx + 35;
      operacion.add("8");
      posicion = posicion + 1;
      }
    else if(operacion.get(operacion.size()-1) == "/"){
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(Color.BLUE);
      gc.strokeLine(mx +10,85,mx +35,85);   //arriba
      gc.strokeLine(mx +10,135,mx +35,135);   //abajo
      gc.strokeLine(mx +10,85,mx +10,135);   //izquierda
      gc.strokeLine(mx +35,85,mx +35,135);   //derecha
      gc.strokeLine(mx +10,110,mx +35,110);   //horizontal media
      mx = mx + 35;
      operacion.add("8");
      posicion = posicion + 1;
    
    
    }  
    }
    
    @FXML
    public void accion9(ActionEvent event) {
      if(operacion.isEmpty()){  
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(Color.BLUE);
      gc.strokeLine(mx +10,25,mx +35,25);   //arriba
      gc.strokeLine(mx +10,75,mx +35,75);   //abajo
      gc.strokeLine(mx +10,25,mx +10,50);   //izquierda arriba
      gc.strokeLine(mx +35,25,mx +35,75);   //derecha
      gc.strokeLine(mx +10,50,mx +35,50);   //horizontal media
      mx = mx + 35;
      operacion.add("9");
      posicion = posicion + 1;}
      
      else if(operacion.get(operacion.size()-1) != "/"){
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(Color.BLUE);
      gc.strokeLine(mx +10,25,mx +35,25);   //arriba
      gc.strokeLine(mx +10,75,mx +35,75);   //abajo
      gc.strokeLine(mx +10,25,mx +10,50);   //izquierda arriba
      gc.strokeLine(mx +35,25,mx +35,75);   //derecha
      gc.strokeLine(mx +10,50,mx +35,50);   //horizontal media
      mx = mx + 35;
      operacion.add("9");
      posicion = posicion + 1;}
      
      else if(operacion.get(operacion.size()-1) == "/"){
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(Color.BLUE);
      gc.strokeLine(mx +10,85,mx +35,85);   //arriba
      gc.strokeLine(mx +10,135,mx +35,135);   //abajo
      gc.strokeLine(mx +10,85,mx +10,110);   //izquierda arriba
      gc.strokeLine(mx +35,85,mx +35,135);   //derecha
      gc.strokeLine(mx +10,110,mx +35,110);   //horizontal media
      mx = mx + 35;
      operacion.add("9");
      posicion = posicion + 1;
      }
      
    }
    
    @FXML
    public void accion_x(ActionEvent event) {
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(Color.RED);
      gc.strokeLine(mx +20,35,mx + 32.5,65); 
      gc.strokeLine(mx +20,65,mx + 32.5,35);
      mx = mx + 35;
    }
    @FXML
    public void accion_parentesisIzquierdo(ActionEvent event) {
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(Color.RED);
      gc.strokeArc(mx +20,25,10,50,90,180,ArcType.OPEN); 
      mx = mx + 35;
    }
    @FXML
    public void accion_parentesisDerecho(ActionEvent event) {
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(Color.RED);
      gc.strokeArc(mx +10,25,10,50,90,-180,ArcType.OPEN); 
      mx = mx + 35;
    }
@FXML
    private void accion_limpiar(ActionEvent event) {
        
        gc = texthere.getGraphicsContext2D();
        gc.clearRect(0, 0, 1000, 1000);
        mx=0;
        posicion = 0;   //limpia la poscion
        operacion.clear();// vacia lisra "operacion"
    }
    /*private void accion_limpiarUnidad(ActionEvent event) {
    } */
    //nuevo
     @FXML
    private void accion_dividir(ActionEvent event) {
        
        if(operacion.get(operacion.size()-1) != "1"){
         gc = texthere.getGraphicsContext2D();
         gc.setStroke(Color.RED);
         gc.strokeLine(mx -30,80,mx + 10,80);
         operacion.add("/");
         posicion = posicion + 1;
         mx = mx - 35;}
        if(operacion.get(operacion.size()-1) == "1"){
         gc = texthere.getGraphicsContext2D();
         gc.setStroke(Color.RED);
         gc.strokeLine(mx -30,80,mx + 10,80);
         operacion.add("/");
         posicion = posicion + 1;
         mx = mx - 35;}
        
        
    }
    public void accion_cordenadas(ActionEvent event){
        int Amx = 0;
        gc = texthere.getGraphicsContext2D();
        gc.setLineWidth(4);
        gc.setStroke(Color.BLUEVIOLET);
        for(int i = 0; i< operacion.size();i++){
            if(operacion.get(i) == "0"){
               gc.strokeLine(Amx +10,25,Amx +10,25);   
               gc.strokeLine(Amx +10,75,Amx +10,75);   
               gc.strokeLine(Amx +35,75,Amx +35,75);   
               gc.strokeLine(Amx +35,25,Amx +35,25);
              
               Amx = Amx + 35;
            }   
           if(operacion.get(i) == "1"){
               gc.strokeLine(Amx + 20,25,Amx + 20,25);
               gc.strokeLine(Amx + 10,35,Amx + 10,35);
               gc.strokeLine(Amx + 20,75,Amx + 20,75);
               Amx = Amx + 35;
           }
           if(operacion.get(i) == "2"){
               gc.strokeLine(Amx +10,25,Amx +10,25);
               gc.strokeLine(Amx +35,25,Amx +35,25);
               gc.strokeLine(Amx +10,50,Amx +10,50); //horizontal media
               gc.strokeLine(Amx +10,75,Amx +10,75);
               gc.strokeLine(Amx +35,75,Amx +35,75);             
               gc.strokeLine(Amx +35,50,Amx +35,50);
               Amx = Amx + 35;
           }
           if(operacion.get(i) == "3"){
               gc.strokeLine(Amx +10,25,Amx +10,25);
               gc.strokeLine(Amx +35,25,Amx +35,25);
               gc.strokeLine(Amx +10,50,Amx +10,50);
               gc.strokeLine(Amx +35,75,Amx +35,75);
               gc.strokeLine(Amx +35,25,Amx +35,25);
               gc.strokeLine(Amx +35,50,Amx +35,50);  
               gc.strokeLine(Amx +10,75,Amx +10,75);
               Amx = Amx + 35;
           }
           if(operacion.get(i) == "4"){
               gc.strokeLine(Amx +35,25,Amx +35,25);
               gc.strokeLine(Amx +10,50,Amx +10,50);
               gc.strokeLine(Amx +10,25,Amx +10,25);
               gc.strokeLine(Amx +35,75,Amx +35,75);
               gc.strokeLine(Amx +35,50,Amx +35,50);
               
               Amx = Amx + 35;
           }
           if(operacion.get(i) == "5"){
               gc.strokeLine(Amx +10,25,Amx +10,25);
               gc.strokeLine(Amx +35,50,Amx +35,50);
               gc.strokeLine(Amx +10,50,Amx +10,50);
               gc.strokeLine(Amx +10,50,Amx +10,50);
               gc.strokeLine(Amx +10,75,Amx +10,75);
               gc.strokeLine(Amx +35,25,Amx +35,25);
               gc.strokeLine(Amx +35,75,Amx +35,75);
               Amx = Amx + 35;
           }
           if(operacion.get(i) == "6"){
               gc.strokeLine(Amx +10,25,Amx +10,25);  
               gc.strokeLine(Amx +10,75,Amx +10,75);  
               gc.strokeLine(Amx +10,50,Amx +10,50);   
               gc.strokeLine(Amx +35,50,Amx +35,50);   
               gc.strokeLine(Amx +35,75,Amx +35,75);
               gc.strokeLine(Amx +35,25,Amx +35,25);
               Amx = Amx + 35;
           }
           if(operacion.get(i) == "7"){
               gc.strokeLine(Amx +10,25,Amx +10,25);    
               gc.strokeLine(Amx +10,50,Amx +10,50);     
               gc.strokeLine(Amx +35,75,Amx +35,75);
               gc.strokeLine(Amx +35,25,Amx +35,25);
               Amx = Amx + 35;
           }
           
           if(operacion.get(i) == "8"){
               gc.strokeLine(Amx +10,25,Amx +10,25);  
               gc.strokeLine(Amx +10,75,Amx +10,75);  
               gc.strokeLine(Amx +10,50,Amx +10,50);   
               gc.strokeLine(Amx +35,50,Amx +35,50);   
               gc.strokeLine(Amx +35,75,Amx +35,75);
               gc.strokeLine(Amx +35,25,Amx +35,25);
               Amx = Amx + 35;
           }
           if(operacion.get(i) == "9"){
               gc.strokeLine(Amx +10,25,Amx +10,25);  
               gc.strokeLine(Amx +10,75,Amx +10,75);  
               gc.strokeLine(Amx +10,50,Amx +10,50);   
               gc.strokeLine(Amx +35,50,Amx +35,50);   
               gc.strokeLine(Amx +35,75,Amx +35,75);
               gc.strokeLine(Amx +35,25,Amx +35,25);
               Amx = Amx + 35;
           }
           
           
           
           
        }
        gc.setLineWidth(1);
    
    }
    
    @FXML
    private void panel(MouseEvent event) {
        
    }

   

    
    
}
