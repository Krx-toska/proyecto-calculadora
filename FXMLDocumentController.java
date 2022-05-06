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
import javafx.scene.control.ColorPicker;
import javafx.scene.paint.Paint;


/**
 *
 * @author krox2
 */
public class FXMLDocumentController implements Initializable {
        
    @FXML
    private Button bttn_mas, bttn_menos, bttn_0, bttn_1, bttn_2, bttn_3, bttn_4, bttn_5, bttn_6, bttn_7, bttn_x, bttn_parentesisDerecho,bttn_parentesisIzquierdo ;
    
    @FXML
    
    private javafx.scene.canvas.Canvas texthere;
    private javafx.scene.canvas.Canvas texthere2;
    static GraphicsContext gc;
    GraphicsContext gcaux;
    @FXML
    private Button bttn_8;
    @FXML
    private Button bttn_9;
    @FXML
    private Button bbtn_clear;
    @FXML
    private Button bbtn_dividir;
    
    @FXML
            ColorPicker myColorPickerNumbers;
    @FXML
    ColorPicker myColorPickerOperators;
    
    
    
    
    Dibuja dibuja = new Dibuja();
    Cordenadas cordenadas = new Cordenadas();
    Redibujar hola = new Redibujar();
    Color myColorNumbers, myColorOperators;
    int cont = 0;
    double mx = 0, aux = 0;
        
    ArrayList<String> operacion = new ArrayList<String>();
    @FXML
    private Button bbtn_cor;
    @FXML
    private Button bttn_parentesisIzquierdo1;
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    gc = texthere.getGraphicsContext2D();
    }
    
    @FXML
      public void changeColorNumbers(){
    myColorNumbers = myColorPickerNumbers.getValue();
  }

    @FXML
  public void changeColorOperators(){
    myColorOperators = myColorPickerOperators.getValue();
  }
    
    
    
    @FXML
    public void accion_mas(ActionEvent event) {//listo
     gc.setStroke(myColorOperators);
     
     if(operacion.isEmpty()){}   
     
     else if(operacion.get(operacion.size()-1) == "+"|| operacion.get(operacion.size()-1) == "x"){}
   
     else{
     gc = texthere.getGraphicsContext2D();
     dibuja.dibuja_mas(gc,operacion,myColorNumbers);
     operacion.add("+");}
      
    }
    @FXML
    public void accion_menos(ActionEvent event) {//listo
 
      if(operacion.isEmpty()){
      
      
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(myColorOperators);
      dibuja.dibuja_menos(gc,operacion, myColorOperators);
      operacion.add("-");
      }
      
      else if(operacion.get(operacion.size()-1) == "-"|| operacion.get(operacion.size()-1) == "+"|| operacion.get(operacion.size()-1) == "x"){}
      
      else{
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(myColorOperators);
      dibuja.dibuja_menos(gc,operacion, myColorOperators);
      operacion.add("-");
    }
  }
    
    @FXML
    public void accion0(ActionEvent event) {//listo  
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(myColorNumbers);
      dibuja.dibuja_cero(gc,operacion,myColorNumbers);
      operacion.add("0");}  
    
    @FXML
    public void accion1(ActionEvent event) {//listo
      
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(myColorNumbers);
      dibuja.dibuja_uno(gc ,operacion,myColorNumbers);
      operacion.add("1");}
    
    @FXML
    public void accion2(ActionEvent event) {
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(myColorNumbers);
      dibuja.dibuja_dos(gc ,operacion,myColorNumbers);
      operacion.add("2");}

    @FXML
    public void accion3(ActionEvent event) {  
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(myColorNumbers);
      dibuja.dibuja_tres(gc,operacion,myColorNumbers);
      operacion.add("3");}
    
    @FXML
    public void accion4(ActionEvent event) {
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(myColorNumbers);
      dibuja.dibuja_cuatro(gc,operacion,myColorNumbers);
      operacion.add("4");}
    
    @FXML
    public void accion5(ActionEvent event) {       
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(myColorNumbers);
      dibuja.dibuja_cinco(gc,operacion,myColorNumbers);
      operacion.add("5");}
    
    @FXML
    public void accion6(ActionEvent event) {
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(myColorNumbers);
      dibuja.dibuja_seis(gc,operacion,myColorNumbers);
      operacion.add("6");
      }
      
    @FXML
    public void accion7(ActionEvent event) {    
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(myColorNumbers);
      dibuja.dibuja_siete(gc,operacion,myColorNumbers);
      operacion.add("7"); 
      }
  
    @FXML
    public void accion8(ActionEvent event) {
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(myColorNumbers);
      dibuja.dibuja_ocho(gc,operacion,myColorNumbers);
      operacion.add("8");  }
      
    
    @FXML
    public void accion9(ActionEvent event) {   
         
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(myColorNumbers);
      dibuja.dibuja_nueve(gc,operacion,myColorNumbers);
      operacion.add("9"); }
    
    
    @FXML
    public void accion_x(ActionEvent event) {
      
      if(operacion.isEmpty()){}
      
      else if(operacion.get(operacion.size()-1) == "x" || operacion.get(operacion.size()-1) == "+" ){}
      
      else{
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(myColorOperators);
      dibuja.dibuja_x(gc,operacion, myColorOperators);
      operacion.add("x");
      }
    }
    @FXML
    public void accion_parentesisIzquierdo(ActionEvent event) {

      gc = texthere.getGraphicsContext2D();
      gc.setStroke(myColorOperators);
      dibuja.dibuja_parentesisI(gc,operacion, myColorOperators);
      operacion.add("(");
    }
    @FXML
    public void accion_parentesisDerecho(ActionEvent event) {
    
      gc = texthere.getGraphicsContext2D();
      gc.setStroke(myColorOperators);
      dibuja.dibuja_parentesisD(gc,operacion, myColorOperators);
      operacion.add(")");
    }
@FXML
    private void accion_limpiar(ActionEvent event) {
        
        gc = texthere.getGraphicsContext2D();
        gc.clearRect(0, 0, 1000, 1000);
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
         gc.setStroke(myColorOperators);
         dibuja.dibuja_dividir(gc,operacion, myColorOperators);
         operacion.add("/");}
        
        
        if("1".equals(operacion.get(operacion.size()-1))){
         gc = texthere.getGraphicsContext2D();
         gc.setStroke(myColorOperators);
         dibuja.dibuja_dividir1(gc, myColorOperators);
         operacion.add("/");}
        }
        
        
    }
    
    @FXML
    private void accion_potencia(ActionEvent event) {
    
    operacion.add("^");
    }
    
    @FXML
    public void accion_cordenadas(ActionEvent event){
        int Amx = 0;
        
        Paint aux = null;
        
        if(cont == 0){
            cont=1;
            
           
            
        for(int i = 0; i< operacion.size();i++){
           gc = texthere.getGraphicsContext2D(); 
           if(operacion.get(i) == "0"){
               cordenadas.puntos("0");
            }   
           if(operacion.get(i) == "1"){
               cordenadas.puntos("1");
           }
           if(operacion.get(i) == "2"){
               cordenadas.puntos("2");
           }
           if(operacion.get(i) == "3"){
               cordenadas.puntos("3");
           }
           if(operacion.get(i) == "4"){
               cordenadas.puntos("4");
           }
           if(operacion.get(i) == "5"){
               cordenadas.puntos("5");
           }
           if(operacion.get(i) == "6"){
               cordenadas.puntos("6");
           }
           if(operacion.get(i) == "7"){
               cordenadas.puntos("7");
           }
           
           if(operacion.get(i) == "8"){
               cordenadas.puntos("8");
           }
           if(operacion.get(i) == "9"){
               cordenadas.puntos("9");
           }
           if(operacion.get(i) == "x"){
               cordenadas.puntos("x");
               
           }
           if(operacion.get(i) == "/"){
              cordenadas.puntos("/");
           }
           if(operacion.get(i) == "+"){
              cordenadas.puntos("+");
           }   
               
           if(operacion.get(i) == "-"){
              cordenadas.puntos("-");
               
           }
           if(operacion.get(i) == ")"){
              cordenadas.puntos(")");           
               
               
           }
           if(operacion.get(i) == "("){
              cordenadas.puntos("(");           
    
           }
        }
         
           
           
        }
        else{
        gc.clearRect(0, 0, 1000, 1000);
        
        hola.redibujar(operacion, gc,myColorOperators,myColorNumbers);
        
        cont = 0;
        
        }
        gc.setLineWidth(1);
        cordenadas.limpiar();
    
    }
    @FXML
    private void panel(MouseEvent event) {
        
    }

    
      
}