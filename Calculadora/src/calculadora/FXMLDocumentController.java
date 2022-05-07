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
<<<<<<< HEAD
import javafx.scene.shape.ArcType;
=======
import javafx.scene.control.ColorPicker;
>>>>>>> 08d548c8ec0bac71e636e9c9d17bf34a0583a997

/**
 *
 * @author krox2
 */
public class FXMLDocumentController implements Initializable {
<<<<<<< HEAD
    
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
=======
  @FXML
  Button bttn0, bttn1, bttn2, bttn3, bttn4, bttn5, bttn6, bttn7, bttn8, bttn9;
  @FXML
  Button bttnMas, bttnMenos,  bttnX, bttnDividir, bttnParentesisDerecho, bttnParentesisIzquierdo;
  @FXML
  Button bttnClear, bttnCor;
  @FXML
  javafx.scene.canvas.Canvas texthere;
  @FXML
  ColorPicker myColorPickerNumbers, myColorPickerOperators;
  
  static GraphicsContext gc;
  double mx = 0, aux = 0;
  Color myColorNumbers, myColorOperators;
  int posicion = 0;
      
  ArrayList<String> operacion = new ArrayList<>();
  Dibuja dibuja = new Dibuja();
  Cordenadas cordenadas = new Cordenadas();
  
  
  
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    gc = texthere.getGraphicsContext2D();
  }
  
  public void changeColorNumbers(){
    myColorNumbers = myColorPickerNumbers.getValue();
  }
  
  public void changeColorOperators(){
    myColorOperators = myColorPickerOperators.getValue();
  }
>>>>>>> 08d548c8ec0bac71e636e9c9d17bf34a0583a997

  @FXML
  public void accion0(ActionEvent event) {//listo
    if(!"/".equals(operacion.get(operacion.size()-1))){
      dibuja.dibuja_cero(gc,aux,myColorNumbers);
      operacion.add("0");
    }
  }
  
  @FXML
  public void accion1(ActionEvent event) {//listo
    if(operacion.isEmpty() || !"/".equals(operacion.get(operacion.size()-1))){
      aux = 0;
      dibuja.dibuja_uno(gc, aux, myColorNumbers);
      operacion.add("1");
    }else if("/".equals(operacion.get(operacion.size()-1))){
      aux = 60;
      dibuja.dibuja_uno(gc, aux, myColorNumbers);
      operacion.add("1");
    }
  }
  
  @FXML
  public void accion2(ActionEvent event) {
    if(operacion.isEmpty() || !"/".equals(operacion.get(operacion.size()-1))){
      aux = 0;
      dibuja.dibuja_dos(gc, aux, myColorNumbers);
      operacion.add("2");
    }else if("/".equals(operacion.get(operacion.size()-1))){
      aux = 60;
      dibuja.dibuja_dos(gc, aux, myColorNumbers);
      operacion.add("2");
    }
  }
  
  @FXML
  public void accion3(ActionEvent event) {
    if(operacion.isEmpty() || !"/".equals(operacion.get(operacion.size()-1))){
      aux = 0;
      dibuja.dibuja_tres(gc, aux, myColorNumbers);
      operacion.add("3");
    }else if("/".equals(operacion.get(operacion.size()-1))){
      aux = 60;
      dibuja.dibuja_tres(gc, aux, myColorNumbers);
      operacion.add("3");
    }
  }
  
  @FXML
  public void accion4(ActionEvent event) {
    if(operacion.isEmpty() || !"/".equals(operacion.get(operacion.size()-1))){
      aux = 0;
      dibuja.dibuja_cuatro(gc, aux, myColorNumbers);
      operacion.add("4");
    }else if("/".equals(operacion.get(operacion.size()-1))){
      aux = 60;
      dibuja.dibuja_cuatro(gc, aux, myColorNumbers);
      operacion.add("4");
    }
  }
  
  @FXML
  public void accion5(ActionEvent event) {
    if(operacion.isEmpty() || !"/".equals(operacion.get(operacion.size()-1))){ 
      aux = 0;
      dibuja.dibuja_cinco(gc, aux, myColorNumbers);
      operacion.add("5");
    }else if("/".equals(operacion.get(operacion.size()-1))){
      aux = 60;
      dibuja.dibuja_cinco(gc, aux, myColorNumbers);
      operacion.add("5");
    }
  }
  
  @FXML
  public void accion6(ActionEvent event) {
    if(operacion.isEmpty() || !"/".equals(operacion.get(operacion.size()-1))){
      aux = 0;
      dibuja.dibuja_seis(gc, aux, myColorNumbers);
      operacion.add("6");
    }else if("/".equals(operacion.get(operacion.size()-1))){
      aux = 60;
      dibuja.dibuja_seis(gc, aux, myColorNumbers);
      operacion.add("6");
    }
  }
  
  @FXML
  public void accion7(ActionEvent event) {
    if(operacion.isEmpty() || !"/".equals(operacion.get(operacion.size()-1))){
      aux = 0;
      dibuja.dibuja_siete(gc, aux, myColorNumbers);
      operacion.add("7");
    }else if("/".equals(operacion.get(operacion.size()-1))){
      aux = 60;
      dibuja.dibuja_siete(gc, aux, myColorNumbers);
      operacion.add("7");;
    }
  }
  
  @FXML
  public void accion8(ActionEvent event) {
    if(operacion.isEmpty() || !"/".equals(operacion.get(operacion.size()-1))){
      aux = 0;
      dibuja.dibuja_ocho(gc, aux, myColorNumbers);
      operacion.add("8");
    }else if("/".equals(operacion.get(operacion.size()-1))){
      aux = 60;
      dibuja.dibuja_ocho(gc, aux, myColorNumbers);
      operacion.add("8");
    }
  }
  
  @FXML
  public void accion9(ActionEvent event){
    if(operacion.isEmpty() || !"/".equals(operacion.get(operacion.size()-1))){
      aux = 0;
      dibuja.dibuja_nueve(gc, aux, myColorNumbers);
      operacion.add("9");
    }else if("/".equals(operacion.get(operacion.size()-1))){
      aux = 60;
      dibuja.dibuja_nueve(gc, aux, myColorNumbers);
      operacion.add("9");
    }
  }

  @FXML
  public void accion_mas(ActionEvent event) {//listo
    aux = 0;
    dibuja.dibuja_mas(gc, myColorOperators);
    operacion.add("+");
  }

  @FXML
  public void accion_menos(ActionEvent event) {//listo
    aux = 0;
    dibuja.dibuja_menos(gc, myColorOperators);
    operacion.add("-");
  }
  
  @FXML
  public void accion_x(ActionEvent event) {
    aux = 0;
    dibuja.dibuja_x(gc, myColorOperators);
    operacion.add("x");
  }

  @FXML
  public void accion_parentesisIzquierdo(ActionEvent event) {
    aux = 0;
    dibuja.dibuja_parentesisI(gc, myColorOperators);
    operacion.add("(");
  }

  @FXML
  public void accion_parentesisDerecho(ActionEvent event) {
    aux = 0;
    dibuja.dibuja_parentesisD(gc, myColorOperators);
    operacion.add(")");
  }
@FXML
  private void accion_limpiar(ActionEvent event) {
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
        gc.setStroke(myColorOperators);
        dibuja.dibuja_dividir(gc, myColorOperators);
        operacion.add("/");
  }
      if("1".equals(operacion.get(operacion.size()-1))){
        gc.setStroke(myColorOperators);
        dibuja.dibuja_dividir1(gc, myColorOperators);
        operacion.add("/");}
      }
      
      
  }
  
  public void accion_cordenadas(){
      aux = 0;
      
      for(int i = 0; i< operacion.size();i++){
          if("0".equals(operacion.get(i))){
            cordenadas.puntos("0");
          }   
          if("1".equals(operacion.get(i))){
            cordenadas.puntos("1");
          }
          if("2".equals(operacion.get(i))){
            cordenadas.puntos("2");
          }
          if("3".equals(operacion.get(i))){
            cordenadas.puntos("3");
          }
          if("4".equals(operacion.get(i))){
            cordenadas.puntos("4");
          }
          if("5".equals(operacion.get(i))){
            cordenadas.puntos("5");
          }
          if("6".equals(operacion.get(i))){
            cordenadas.puntos("6");
          }
          if("7".equals(operacion.get(i))){
            cordenadas.puntos("7");
          }
          if("8".equals(operacion.get(i))){
            cordenadas.puntos("8");
          }
          if("9".equals(operacion.get(i))){
            cordenadas.puntos("9");
          }
          if("x".equals(operacion.get(i))){
            cordenadas.puntos("x");
          }
          if("/".equals(operacion.get(i))){
            cordenadas.puntos("/");
          }
          if("+".equals(operacion.get(i))){
            cordenadas.puntos("+");
          }   
          if("-".equals(operacion.get(i))){
            cordenadas.puntos("-");
          }
          if(")".equals(operacion.get(i))){
            cordenadas.puntos(")");
          }
          if("(".equals(operacion.get(i))){
            cordenadas.puntos("(");           
          }
      }
      gc.setLineWidth(1);
      cordenadas.limpiar();
  }
  @FXML
  private void panel(MouseEvent event) {
    //empty
  }
}