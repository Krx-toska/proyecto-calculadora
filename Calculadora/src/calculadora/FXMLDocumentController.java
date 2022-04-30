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
<<<<<<< HEAD
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
=======
>>>>>>> joaquin-wylie

/**
 *
 * @author krox2
 */
public class FXMLDocumentController implements Initializable {
        
    @FXML
    private Button bttn_mas, bttn_menos, bttn_0, bttn_1, bttn_2, bttn_3, bttn_4, bttn_5, bttn_6, bttn_7, bttn_x, bttn_parentesisDerecho,bttn_parentesisIzquierdo ;
    
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
<<<<<<< HEAD
    @FXML
    private Button bbtn_cor;
    
    
    int posicion =0;
=======
    
    Dibuja dibuja = new Dibuja();

    

    
>>>>>>> joaquin-wylie
        
    ArrayList<String> operacion = new ArrayList<String>();
    

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
    }    
    
    
    @FXML
    public void accion_mas(ActionEvent event) {//listo
<<<<<<< HEAD
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(Color.RED);
      gc.strokeLine(mx + 22.5,37.5,mx +22.5,62.5);        //Altura maxima = 25, Altura Minima, 75
      gc.strokeLine(mx +10,50,mx +35,50);        //Ancho maximo = 30, parte desde x = 10
      mx = mx + 35;
      operacion.add("+");
=======
  
     if(operacion.isEmpty()){}   
     
     else if(operacion.get(operacion.size()-1) == "+"|| operacion.get(operacion.size()-1) == "x"){}
   
     else{
     gc = texthere.getGraphicsContext2D();
     dibuja.dibuja_mas(gc);
     operacion.add("+");}
>>>>>>> joaquin-wylie
      
    }
    @FXML
    public void accion_menos(ActionEvent event) {//listo
      if(operacion.isEmpty()){
      
      
      gc = texthere.getGraphicsContext2D();
<<<<<<< HEAD
      gc.setStroke(Color.RED);
      gc.strokeLine(mx +10,50,mx +35,50);
      mx = mx + 35;
=======
      dibuja.dibuja_menos(gc);
      operacion.add("-");
      }
      
      else if(operacion.get(operacion.size()-1) == "-"|| operacion.get(operacion.size()-1) == "+"){}
      
      else{
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_menos(gc);
>>>>>>> joaquin-wylie
      operacion.add("-");
    }
  }
    
    @FXML
    public void accion0(ActionEvent event) {//listo
      if(operacion.isEmpty()){
          
      gc = texthere.getGraphicsContext2D();
<<<<<<< HEAD
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
=======
      dibuja.dibuja_cero(gc);
      operacion.add("0");}  
    
        
      else{
          
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_cero(gc);
      operacion.add("0");}
    }
    
    @FXML
    public void accion1(ActionEvent event) {//listo
      
      if(operacion.isEmpty()){  
          
           int aux = 0;
           gc = texthere.getGraphicsContext2D();
           dibuja.dibuja_uno(gc,aux);
           operacion.add("1");
           
           }
      
      
      else if(!"/".equals(operacion.get(operacion.size()-1))){ 
          
           int aux = 0;
           gc = texthere.getGraphicsContext2D();
           dibuja.dibuja_uno(gc, aux);
           operacion.add("1");
           }
      
      else if("/".equals(operacion.get(operacion.size()-1))){
          
           int aux = 60;
           gc = texthere.getGraphicsContext2D();
           dibuja.dibuja_uno(gc, aux);
           operacion.add("1");
    
      
      }}
    
    @FXML
    public void accion2(ActionEvent event) {
    if(operacion.isEmpty()){ 
        
      int aux = 0;
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_dos(gc,aux);
      operacion.add("2");}
    
    else if(!"/".equals(operacion.get(operacion.size()-1))){ 
        
      int aux = 0;
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_dos(gc,aux);
      operacion.add("2");
    
>>>>>>> joaquin-wylie
    }
   
    }
    
    
    
    
    
<<<<<<< HEAD
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
=======
    else if("/".equals(operacion.get(operacion.size()-1))){
        
      int aux = 60; 
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_dos(gc,aux);
      operacion.add("2");
  
    }
   
    }
       
    @FXML
    public void accion3(ActionEvent event) {
        
      if(operacion.isEmpty()){  
          
      gc = texthere.getGraphicsContext2D();
      int aux = 0;
      dibuja.dibuja_tres(gc,aux);
      operacion.add("3");
      }
      
      else if(!"/".equals(operacion.get(operacion.size()-1))){
          
      int aux = 0;   
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_tres(gc,aux);
      operacion.add("3");

      }
      else if("/".equals(operacion.get(operacion.size()-1))){
          
      int aux = 60;  
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_tres(gc,aux);
      operacion.add("3");
>>>>>>> joaquin-wylie
      }
      
      
      }
     
    
    @FXML
    public void accion4(ActionEvent event) {
        
<<<<<<< HEAD
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
=======
      if(operacion.isEmpty()){ 
          
      int aux = 0;   
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_cuatro(gc,aux);
      operacion.add("4");}
            
      
      else if(!"/".equals(operacion.get(operacion.size()-1))){ 
          
      int aux = 0;
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_cuatro(gc,aux);
      operacion.add("4");}
      
      
      else if("/".equals(operacion.get(operacion.size()-1))){
          
      int aux = 60;    
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_cuatro(gc,aux);
      operacion.add("4");}
>>>>>>> joaquin-wylie

    }
    
    @FXML
    public void accion5(ActionEvent event) {
        
        
<<<<<<< HEAD
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
      
      
      
=======
      if(operacion.isEmpty()){ 
          
       int aux = 0;
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_cinco(gc,aux);
      operacion.add("5");}
      
      else if(!"/".equals(operacion.get(operacion.size()-1))){ 
          
      int aux = 0;
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_cinco(gc,aux);
      operacion.add("5");}
      
      else if("/".equals(operacion.get(operacion.size()-1))){
      
      int aux = 60;    
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_cinco(gc,aux);
      operacion.add("5");
      
      }
         
>>>>>>> joaquin-wylie
    }
    
    @FXML
    public void accion6(ActionEvent event) {
      if(operacion.isEmpty()){  
<<<<<<< HEAD
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
=======
          
      int aux = 0;
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_seis(gc,aux);
      operacion.add("6");}
      
      else if(!"/".equals(operacion.get(operacion.size()-1))){ 
          
       int aux = 0;   
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_seis(gc,aux);
      operacion.add("6");
      }
      
      else if(operacion.get(operacion.size()-1) == "/"){
          
       int aux = 60;
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_seis(gc,aux);
      operacion.add("6");
>>>>>>> joaquin-wylie
      
      }
      
      
    }
    
    @FXML
    public void accion7(ActionEvent event) {
      
      if(operacion.isEmpty()){
<<<<<<< HEAD
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
=======
          
      int aux = 0;    
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_siete(gc,aux);
      operacion.add("7");}
      
      else if(!"/".equals(operacion.get(operacion.size()-1))){
          
       int aux = 0;    
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_siete(gc,aux);
      operacion.add("7");
      }
      else if("/".equals(operacion.get(operacion.size()-1))){
      
      int aux = 60;    
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_siete(gc,aux);
      operacion.add("7");
>>>>>>> joaquin-wylie
      
      }
      
    }
    
    @FXML
    public void accion8(ActionEvent event) {
      if(operacion.isEmpty()){
<<<<<<< HEAD
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
=======
          
       int aux = 0;    
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_ocho(gc,aux);
      operacion.add("8");}
      
      else if(!"/".equals(operacion.get(operacion.size()-1))){
      
      int aux = 0;    
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_ocho(gc,aux);
      operacion.add("8");
      }
    else if("/".equals(operacion.get(operacion.size()-1))){
      
       int aux = 60;  
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_ocho(gc,aux);
      operacion.add("8");
>>>>>>> joaquin-wylie
    
    
    }  
    }
    
    @FXML
    public void accion9(ActionEvent event) {
<<<<<<< HEAD
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
=======
      if(operacion.isEmpty()){ 
          
      int aux = 0;    
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_nueve(gc,aux);
      operacion.add("9");}
      
      else if(!"/".equals(operacion.get(operacion.size()-1))){
      
       int aux = 0;    
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_nueve(gc,aux);
      operacion.add("9");}
      
      else if("/".equals(operacion.get(operacion.size()-1))){
      
       int aux = 60;    
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_nueve(gc,aux);
      operacion.add("9");
>>>>>>> joaquin-wylie
      }
      
    }
    
    @FXML
    public void accion_x(ActionEvent event) {
      if(operacion.isEmpty()){}
      
      else if(operacion.get(operacion.size()-1) == "x" || operacion.get(operacion.size()-1) == "+" ){}
      
      else{
      gc = texthere.getGraphicsContext2D();
<<<<<<< HEAD
      gc.setStroke(Color.RED);
      gc.strokeLine(mx +20,35,mx + 32.5,65); 
      gc.strokeLine(mx +20,65,mx + 32.5,35);
      operacion.add("x");
      mx = mx + 35;
=======
      dibuja.dibuja_x(gc);
      operacion.add("x");
      }
>>>>>>> joaquin-wylie
    }
    @FXML
    public void accion_parentesisIzquierdo(ActionEvent event) {
      gc = texthere.getGraphicsContext2D();
<<<<<<< HEAD
      gc.setStroke(Color.RED);
      gc.strokeArc(mx +20,25,10,50,90,180,ArcType.OPEN); 
      mx = mx + 35;
=======
      dibuja.dibuja_parentesisI(gc);
>>>>>>> joaquin-wylie
      operacion.add("(");
    }
    @FXML
    public void accion_parentesisDerecho(ActionEvent event) {
      gc = texthere.getGraphicsContext2D();
<<<<<<< HEAD
      gc.setStroke(Color.RED);
      gc.strokeArc(mx +10,25,10,50,90,-180,ArcType.OPEN); 
      mx = mx + 35;
      operacion.add(")");
      
=======
      dibuja.dibuja_parentesisD(gc);
      operacion.add(")");
>>>>>>> joaquin-wylie
    }
@FXML
    private void accion_limpiar(ActionEvent event) {
        
        gc = texthere.getGraphicsContext2D();
        gc.clearRect(0, 0, 1000, 1000);
<<<<<<< HEAD
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
           if(operacion.get(i) == "x"){
               gc.strokeLine(Amx +20,35,Amx +20,35);   
               gc.strokeLine(Amx +32.5,65,Amx +32.5,65);   
               gc.strokeLine(Amx +20,65,Amx +20,65);
               gc.strokeLine(Amx +32.5,35,Amx +32.5,35);
               Amx = Amx + 35;
               
           }
           if(operacion.get(i) == "/"){
              gc.strokeLine(Amx +10,80,Amx +10,80);
              gc.strokeLine(Amx -30,80,Amx -30,80);    
           }
           
           if(operacion.get(i) == "+"){
              gc.strokeLine(Amx +22.5,37.5,Amx +22.5,37.5);
              gc.strokeLine(Amx +22.5,62.5,Amx +22.5,62.5); 
              gc.strokeLine(Amx +35,50,Amx +35,50);
              gc.strokeLine(Amx +10,50,Amx +10,50);
              Amx = Amx + 35;
               
               
           }
           if(operacion.get(i) == "-"){
              gc.strokeLine(Amx +35,50,Amx +35,50);
              gc.strokeLine(Amx +10,50,Amx +10,50);
              Amx = Amx + 35;            
               
               
           }
           if(operacion.get(i) == ")"){
              gc.strokeLine(Amx + 15,25,Amx + 15,25);
              gc.strokeLine(Amx + 15,75,Amx + 15,75);
              
              Amx = Amx + 35;            
               
               
           }
           if(operacion.get(i) == "("){
              gc.strokeLine(Amx + 25,25,Amx + 25,25);
              gc.strokeLine(Amx + 25,75,Amx + 25,75);
              
              Amx = Amx + 35;            
               
               
           }
           
           
           
           
        }
        gc.setLineWidth(1);
    
    }
=======
        dibuja.limpiar();
        operacion.clear();
    }
    //nuevo
     @FXML
    private void accion_dividir(ActionEvent event) {
        if(operacion.isEmpty() || "/".equals(operacion.get(operacion.size()-1))){}
        
        else{
        
        if(!"1".equals(operacion.get(operacion.size()-1))){
            
         gc = texthere.getGraphicsContext2D();
         dibuja.dibuja_dividir(gc);
         operacion.add("/");
   }
        if("1".equals(operacion.get(operacion.size()-1))){
         gc = texthere.getGraphicsContext2D();
         dibuja.dibuja_dividir1(gc);
         operacion.add("/");}
        }
        
        
    }
>>>>>>> joaquin-wylie
    
    @FXML
    private void panel(MouseEvent event) {
        
    }

   

    
    
}