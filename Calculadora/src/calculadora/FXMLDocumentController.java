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
    
    Dibuja dibuja = new Dibuja();

    

    
        
    ArrayList<String> operacion = new ArrayList<String>();
    

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
    }    
    
    
    @FXML
    public void accion_mas(ActionEvent event) {//listo
  
     if(operacion.isEmpty()){}   
     
     else if(operacion.get(operacion.size()-1) == "+"|| operacion.get(operacion.size()-1) == "x"){}
   
     else{
     gc = texthere.getGraphicsContext2D();
     dibuja.dibuja_mas(gc);
     operacion.add("+");}
      
    }
    @FXML
    public void accion_menos(ActionEvent event) {//listo
      if(operacion.isEmpty()){
          
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_menos(gc);
      operacion.add("-");
      }
      
      else if(operacion.get(operacion.size()-1) == "-"|| operacion.get(operacion.size()-1) == "+"){}
      
      else{
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_menos(gc);
      operacion.add("-");
    }
  }
    
    @FXML
    public void accion0(ActionEvent event) {//listo
      if(operacion.isEmpty()){
          
      gc = texthere.getGraphicsContext2D();
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
           gc = texthere.getGraphicsContext2D();
           dibuja.dibuja_uno(gc);
           
           
           }
      
      
      else if(!"/".equals(operacion.get(operacion.size()-1))){  
          
           gc = texthere.getGraphicsContext2D();
           dibuja.dibuja_uno(gc);
           operacion.add("1");
           }
      
      else if("/".equals(operacion.get(operacion.size()-1))){ 
          
           gc = texthere.getGraphicsContext2D();
           dibuja.dibuja_uno(gc);
           operacion.add("1");
    
      
      }}
    
    @FXML
    public void accion2(ActionEvent event) {
    if(operacion.isEmpty()){     
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_dos(gc);
      operacion.add("2");}
    
    else if(operacion.get(operacion.size()-1) != "/"){  
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_dos(gc);
      operacion.add("2");
    
    }
    
    else if(operacion.get(operacion.size()-1) == "/"){
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_dos(gc);
      operacion.add("2");
  
    }
   
    }
       
    @FXML
    public void accion3(ActionEvent event) {
        
      if(operacion.isEmpty()){  
          
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_tres(gc);
      operacion.add("3");
      }
      
      else if(operacion.get(operacion.size()-1) != "/"){ 
          
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_tres(gc);
      operacion.add("3");

      }
      else if(operacion.get(operacion.size()-1) == "/"){
          
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_tres(gc);
      operacion.add("3");
      }
      
      
      }
     
    
    @FXML
    public void accion4(ActionEvent event) {
        
      if(operacion.isEmpty()){ 
          
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_cuatro(gc);
      operacion.add("4");}
            
      
      else if(operacion.get(operacion.size()-1) != "/"){ 
      
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_cuatro(gc);
      operacion.add("4");}
      
      
      else if(operacion.get(operacion.size()-1) == "/"){
          
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_cuatro(gc);
      operacion.add("4");}

    }
    
    @FXML
    public void accion5(ActionEvent event) {
        
        
      if(operacion.isEmpty()){      
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_cinco(gc);
      operacion.add("5");}
      
      else if(operacion.get(operacion.size()-1) != "/"){ 
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_cinco(gc);
      operacion.add("5");}
      
      else if(operacion.get(operacion.size()-1) == "/"){
          
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_cinco(gc);
      operacion.add("5");
      
      }
         
    }
    
    @FXML
    public void accion6(ActionEvent event) {
      if(operacion.isEmpty()){  
          
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_seis(gc);
      operacion.add("6");}
      
      else if(operacion.get(operacion.size()-1) != "/"){ 
          
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_seis(gc);
      operacion.add("6");
      }
      
      else if(operacion.get(operacion.size()-1) == "/"){
      
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_seis(gc);
      operacion.add("6");
      
      }
      
      
    }
    
    @FXML
    public void accion7(ActionEvent event) {
      
      if(operacion.isEmpty()){
          
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_siete(gc);
      operacion.add("7");}
      
      else if(operacion.get(operacion.size()-1) != "/"){
          
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_siete(gc);
      operacion.add("7");
      }
      else if(operacion.get(operacion.size()-1) == "/"){
          
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_siete(gc);
      operacion.add("7");
      
      }
      
    }
    
    @FXML
    public void accion8(ActionEvent event) {
      if(operacion.isEmpty()){
          
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_ocho(gc);
      operacion.add("8");}
      
      else if(operacion.get(operacion.size()-1) != "/"){
          
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_ocho(gc);
      operacion.add("8");
      }
    else if(operacion.get(operacion.size()-1) == "/"){
        
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_ocho(gc);
      operacion.add("8");
    
    
    }  
    }
    
    @FXML
    public void accion9(ActionEvent event) {
      if(operacion.isEmpty()){  
          
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_nueve(gc);
      operacion.add("9");}
      
      else if(!"/".equals(operacion.get(operacion.size()-1))){
          
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_nueve(gc);
      operacion.add("9");}
      
      else if("/".equals(operacion.get(operacion.size()-1))){
          
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_nueve(gc);
      operacion.add("9");
      }
      
    }
    
    @FXML
    public void accion_x(ActionEvent event) {
      if(operacion.isEmpty()){}
      
      else if(operacion.get(operacion.size()-1) == "x" || operacion.get(operacion.size()-1) == "+" ){}
      
      else{
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_x(gc);
      operacion.add("x");
      }
    }
    @FXML
    public void accion_parentesisIzquierdo(ActionEvent event) {
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_parentesisI(gc);
      operacion.add("(");
    }
    @FXML
    public void accion_parentesisDerecho(ActionEvent event) {
      gc = texthere.getGraphicsContext2D();
      dibuja.dibuja_parentesisD(gc);
      operacion.add(")");
    }
@FXML
    private void accion_limpiar(ActionEvent event) {
        
        gc = texthere.getGraphicsContext2D();
        gc.clearRect(0, 0, 1000, 1000);
        mx=0;
        operacion.clear();
    }
    //nuevo
     @FXML
    private void accion_dividir(ActionEvent event) {
        if(operacion.isEmpty()){}
        
        else{
        
        if(!"1".equals(operacion.get(operacion.size()-1))){
            
         gc = texthere.getGraphicsContext2D();
         dibuja.dibuja_dividir(gc);
         operacion.add("/");
   }
        if("1".equals(operacion.get(operacion.size()-1))){
         gc = texthere.getGraphicsContext2D();
         dibuja.dibuja_dividir(gc);
         operacion.add("/");}
        }
        
        
    }
    
    @FXML
    private void panel(MouseEvent event) {
        
    }

   

    
    
}