package calculadora;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

public class FXMLDocumentController implements Initializable {
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
  
  GraphicsContext gc;
  double mx = 0, amx = 0;
  Color myColorNumbers, myColorOperators;
  int posicion = 0;
      
  ArrayList<String> operacion = new ArrayList<>();

  @Override
  public void initialize(URL url, ResourceBundle rb) {
    //empty
  }   
  
  @FXML
  public void changeColorNumbers(ActionEvent event){
    myColorNumbers = myColorPickerNumbers.getValue();
  }

  @FXML
  public void changeColorOperators(ActionEvent event){
    myColorOperators = myColorPickerOperators.getValue();
  }
    
  @FXML
  public void accion0(ActionEvent event) {//listo
    gc = texthere.getGraphicsContext2D();
    gc.setStroke(myColorNumbers);
    if(!"/".equals(operacion.get(operacion.size()-1))){
      gc.strokeLine(mx +10,25,mx +35,25);   //arriba
      gc.strokeLine(mx +10,75,mx +35,75);   //abajo
      gc.strokeLine(mx +10,25,mx +10,75);   //izquierda
      gc.strokeLine(mx +35,25,mx +35,75);   //derecha
      operacion.add("0");
      mx = mx + 35;
    }
  }
  
  @FXML
  public void accion1(ActionEvent event) {//listo
    gc = texthere.getGraphicsContext2D();
    gc.setStroke(myColorNumbers);
    if(operacion.isEmpty() || !"/".equals(operacion.get(operacion.size()-1))){
      gc.strokeLine(mx + 20,25,mx + 20,75);
      gc.strokeLine(mx + 20,25,mx + 10,35);
      mx = mx + 35;
      operacion.add("1");
      posicion = posicion + 1;
    }else if("/".equals(operacion.get(operacion.size()-1))){
      gc.strokeLine(mx + 20,85,mx + 20,135);
      gc.strokeLine(mx + 20,85,mx + 10,95);
      mx = mx + 35;
      operacion.add("1");
      posicion = posicion + 1;
    }
  }
  
  @FXML
  public void accion2(ActionEvent event) {
    gc = texthere.getGraphicsContext2D();
    gc.setStroke(myColorNumbers);
    if(operacion.isEmpty() || !"/".equals(operacion.get(operacion.size()-1))){
      gc.strokeLine(mx + 10,25,mx + 35,25);
      gc.strokeLine(mx + 35,25,mx + 35,50);
      gc.strokeLine(mx + 10,50,mx + 35,50); //horizontal media
      gc.strokeLine(mx + 10,50,mx + 10,75);
      gc.strokeLine(mx + 10,75,mx + 35,75);
      mx = mx + 35;
      operacion.add("2");
      posicion = posicion + 1;
    }else if("/".equals(operacion.get(operacion.size()-1))){
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
    gc = texthere.getGraphicsContext2D();
    gc.setStroke(myColorNumbers);
    if(operacion.isEmpty() || !"/".equals(operacion.get(operacion.size()-1))){
      gc.strokeLine(mx +10,25,mx +35,25);
      gc.strokeLine(mx +35,25,mx +35,75);
      gc.strokeLine(mx +10,50,mx +35,50);
      gc.strokeLine(mx +10,75,mx +35,75);
      mx = mx + 35;
      operacion.add("3");
      posicion = posicion + 1;
    }else if("/".equals(operacion.get(operacion.size()-1))){
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
    gc = texthere.getGraphicsContext2D();
    gc.setStroke(myColorNumbers);
    if(operacion.isEmpty() || !"/".equals(operacion.get(operacion.size()-1))){
      gc.strokeLine(mx +35,25,mx +35,75);
      gc.strokeLine(mx +10,50,mx +35,50);
      gc.strokeLine(mx +10,25,mx +10,50);
      mx = mx + 35;
      operacion.add("4");
      posicion = posicion + 1;
    }else if("/".equals(operacion.get(operacion.size()-1))){
      gc.strokeLine(mx +35,85,mx +35,135);
      gc.strokeLine(mx +10,110,mx +35,110);
      gc.strokeLine(mx +10,85,mx +10,110);
      mx = mx + 35;
      operacion.add("4");
      posicion = posicion + 1;
    }
  }
  
  @FXML
  public void accion5(ActionEvent event) {
    gc = texthere.getGraphicsContext2D();
    gc.setStroke(myColorNumbers);
    if(operacion.isEmpty() || !"/".equals(operacion.get(operacion.size()-1))){ 
      gc.strokeLine(mx +10,25,mx +35,25);
      gc.strokeLine(mx +35,50,mx +35,75);
      gc.strokeLine(mx +10,50,mx +35,50);
      gc.strokeLine(mx +10,25,mx +10,50);
      gc.strokeLine(mx +10,75,mx +35,75);
      mx = mx + 35;
      operacion.add("5");
      posicion = posicion + 1;
    }else if("/".equals(operacion.get(operacion.size()-1))){
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
    gc = texthere.getGraphicsContext2D();
    gc.setStroke(myColorNumbers);
    if(operacion.isEmpty() || !"/".equals(operacion.get(operacion.size()-1))){
      gc.strokeLine(mx +10,25,mx +35,25);   //arriba
      gc.strokeLine(mx +10,75,mx +35,75);   //abajo
      gc.strokeLine(mx +10,25,mx +10,75);   //izquierda
      gc.strokeLine(mx +35,50,mx +35,75);   //derecha abajo
      gc.strokeLine(mx +10,50,mx +35,50);
      mx = mx + 35;
      operacion.add("6");
      posicion = posicion + 1;
    }else if("/".equals(operacion.get(operacion.size()-1))){
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
    gc = texthere.getGraphicsContext2D();
    gc.setStroke(myColorNumbers);
    if(operacion.isEmpty() || !"/".equals(operacion.get(operacion.size()-1))){
      gc.strokeLine(mx +10,25,mx +35,25);   //arriba
      gc.strokeLine(mx +10,25,mx +10,50);   //izquierda arriba
      gc.strokeLine(mx +35,25,mx +35,75);   //derecha
      mx = mx + 35;
      operacion.add("7");
      posicion = posicion + 1;
    }else if("/".equals(operacion.get(operacion.size()-1))){
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
    gc = texthere.getGraphicsContext2D();
    gc.setStroke(myColorNumbers);
    if(operacion.isEmpty() || !"/".equals(operacion.get(operacion.size()-1))){
      gc.strokeLine(mx +10,25,mx +35,25);   //arriba
      gc.strokeLine(mx +10,75,mx +35,75);   //abajo
      gc.strokeLine(mx +10,25,mx +10,75);   //izquierda
      gc.strokeLine(mx +35,25,mx +35,75);   //derecha
      gc.strokeLine(mx +10,50,mx +35,50);   //horizontal media
      mx = mx + 35;
      operacion.add("8");
      posicion = posicion + 1;
    }else if("/".equals(operacion.get(operacion.size()-1))){
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
  public void accion9(ActionEvent event){
    gc = texthere.getGraphicsContext2D();
    gc.setStroke(myColorNumbers);
    if(operacion.isEmpty() || !"/".equals(operacion.get(operacion.size()-1))){
      gc.strokeLine(mx +10,25,mx +35,25);   //arriba
      gc.strokeLine(mx +10,75,mx +35,75);   //abajo
      gc.strokeLine(mx +10,25,mx +10,50);   //izquierda arriba
      gc.strokeLine(mx +35,25,mx +35,75);   //derecha
      gc.strokeLine(mx +10,50,mx +35,50);   //horizontal media
      mx = mx + 35;
      operacion.add("9");
      posicion = posicion + 1;
    }else if("/".equals(operacion.get(operacion.size()-1))){
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
  public void accion_mas(ActionEvent event) {//listo
    gc = texthere.getGraphicsContext2D();
    gc.setStroke(myColorOperators);
    gc.strokeLine(mx + 22.5,37.5,mx +22.5,62.5);        //Altura maxima = 25, Altura Minima, 75
    gc.strokeLine(mx + 10,50,mx + 35,50);        //Ancho maximo = 30, parte desde x = 10
    mx = mx + 35;
    operacion.add("+");
  }

  @FXML
  public void accion_menos(ActionEvent event) {//listo
    gc = texthere.getGraphicsContext2D();
    gc.setStroke(myColorOperators);
    gc.strokeLine(mx +10,50,mx +35,50);
    mx = mx + 35;
    operacion.add("-");
    posicion = posicion + 1;
  }
  
  @FXML
  public void accion_x(ActionEvent event) {
    gc = texthere.getGraphicsContext2D();
    gc.setStroke(myColorOperators);
    gc.strokeLine(mx +20,35,mx + 32.5,65); 
    gc.strokeLine(mx +20,65,mx + 32.5,35);
    mx = mx + 35;
    operacion.add("x");
  }

  @FXML
  public void accion_parentesisIzquierdo(ActionEvent event) {
    gc = texthere.getGraphicsContext2D();
    gc.setStroke(myColorOperators);
    gc.strokeArc(mx +20,25,10,50,90,180,ArcType.OPEN); 
    mx = mx + 35;
    operacion.add("(");
  }

  @FXML
  public void accion_parentesisDerecho(ActionEvent event) {
    gc = texthere.getGraphicsContext2D();
    gc.setStroke(myColorOperators);
    gc.strokeArc(mx +10,25,10,50,90,-180,ArcType.OPEN); 
    mx = mx + 35;
    operacion.add(")");
  }
  @FXML
  private void accion_limpiar(ActionEvent event) {
    gc = texthere.getGraphicsContext2D();
    gc.clearRect(0, 0, 1000, 1000);
    mx = 0;
    posicion = 0;   //limpia la poscion
    operacion.clear(); // vacia lisra "operacion"
  }

  @FXML
  private void accion_dividir(ActionEvent event) {
    gc = texthere.getGraphicsContext2D();
    gc.setStroke(myColorOperators);
    gc.strokeLine(mx -30,80,mx + 10,80);
    operacion.add("/");
    posicion = posicion + 1;
    mx = mx - 35;
  }
  public void accion_cordenadas(ActionEvent event){
    gc = texthere.getGraphicsContext2D();
    gc.setLineWidth(4);
    gc.setStroke(Color.BLUEVIOLET);
    for(int i = 0; i< operacion.size();i++){
      if("0".equals(operacion.get(i))){
        gc.strokeLine(amx +10,25,amx +10,25);   
        gc.strokeLine(amx +10,75,amx +10,75);   
        gc.strokeLine(amx +35,75,amx +35,75);   
        gc.strokeLine(amx +35,25,amx +35,25);
        amx = amx + 35;
      }   
      if("1".equals(operacion.get(i))){
        gc.strokeLine(amx + 20,25,amx + 20,25);
        gc.strokeLine(amx + 10,35,amx + 10,35);
        gc.strokeLine(amx + 20,75,amx + 20,75);
        amx = amx + 35;
      }
      if("2".equals(operacion.get(i))){
        gc.strokeLine(amx +10,25,amx +10,25);
        gc.strokeLine(amx +35,25,amx +35,25);
        gc.strokeLine(amx +10,50,amx +10,50); //horizontal media
        gc.strokeLine(amx +10,75,amx +10,75);
        gc.strokeLine(amx +35,75,amx +35,75);             
        gc.strokeLine(amx +35,50,amx +35,50);
        amx = amx + 35;
      }
      if("3".equals(operacion.get(i))){
        gc.strokeLine(amx +10,25,amx +10,25);
        gc.strokeLine(amx +35,25,amx +35,25);
        gc.strokeLine(amx +10,50,amx +10,50);
        gc.strokeLine(amx +35,75,amx +35,75);
        gc.strokeLine(amx +35,25,amx +35,25);
        gc.strokeLine(amx +35,50,amx +35,50);  
        gc.strokeLine(amx +10,75,amx +10,75);
        amx = amx + 35;
      }
      if("4".equals(operacion.get(i))){
        gc.strokeLine(amx +35,25,amx +35,25);
        gc.strokeLine(amx +10,50,amx +10,50);
        gc.strokeLine(amx +10,25,amx +10,25);
        gc.strokeLine(amx +35,75,amx +35,75);
        gc.strokeLine(amx +35,50,amx +35,50);
        amx = amx + 35;
      }
      if("5".equals(operacion.get(i))){
        gc.strokeLine(amx +10,25,amx +10,25);
        gc.strokeLine(amx +35,50,amx +35,50);
        gc.strokeLine(amx +10,50,amx +10,50);
        gc.strokeLine(amx +10,50,amx +10,50);
        gc.strokeLine(amx +10,75,amx +10,75);
        gc.strokeLine(amx +35,25,amx +35,25);
        gc.strokeLine(amx +35,75,amx +35,75);
        amx = amx + 35;
      }
      if("6".equals(operacion.get(i))){
        gc.strokeLine(amx +10,25,amx +10,25);  
        gc.strokeLine(amx +10,75,amx +10,75);  
        gc.strokeLine(amx +10,50,amx +10,50);   
        gc.strokeLine(amx +35,50,amx +35,50);   
        gc.strokeLine(amx +35,75,amx +35,75);
        gc.strokeLine(amx +35,25,amx +35,25);
        amx = amx + 35;
      }
      if("7".equals(operacion.get(i))){
        gc.strokeLine(amx +10,25,amx +10,25);    
        gc.strokeLine(amx +10,50,amx +10,50);     
        gc.strokeLine(amx +35,75,amx +35,75);
        gc.strokeLine(amx +35,25,amx +35,25);
        amx = amx + 35;
      }
      if("8".equals(operacion.get(i))){
        gc.strokeLine(amx +10,25,amx +10,25);  
        gc.strokeLine(amx +10,75,amx +10,75);  
        gc.strokeLine(amx +10,50,amx +10,50);   
        gc.strokeLine(amx +35,50,amx +35,50);   
        gc.strokeLine(amx +35,75,amx +35,75);
        gc.strokeLine(amx +35,25,amx +35,25);
        amx = amx + 35;
      }
      if("9".equals(operacion.get(i))){
        gc.strokeLine(amx +10,25,amx +10,25);  
        gc.strokeLine(amx +10,75,amx +10,75);  
        gc.strokeLine(amx +10,50,amx +10,50);   
        gc.strokeLine(amx +35,50,amx +35,50);   
        gc.strokeLine(amx +35,75,amx +35,75);
        gc.strokeLine(amx +35,25,amx +35,25);
        amx = amx + 35;
      }
    }
    gc.setLineWidth(1);
  }
  
  @FXML
  private void panel(MouseEvent event) {
    //empty
  }
}