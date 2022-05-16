
package calculadora;

import javafx.fxml.FXML;
import java.net.URL;
import java.util.ArrayList;
import java.util.Objects;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import static javafx.scene.paint.Color.BLACK;
import javafx.scene.text.Text;

/**
 *
 * @author krox2
 */
public class FXMLDocumentController implements Initializable {     
  @FXML
  private Button bttn_mas, bttn_menos, bttn_0, bttn_1, bttn_2, bttn_3, bttn_4, bttn_5, bttn_6, bttn_7,bttn_8, bttn_9, bttn_clear, bttn_dividir, bttn_x, bttn_parentesisDerecho, bttn_parentesisIzquierdo, bttn_cor, bttn_potencia;
  @FXML
  private javafx.scene.canvas.Canvas texthere;
  @FXML
  ColorPicker myColorPickerNumbers, myColorPickerOperators;
  @FXML
  private Text myText;
  @FXML
  private Slider mySizeOfExpressions;
  @FXML
  ImageView myImageView;

  Image myImage = new Image(getClass().getResourceAsStream("helloKitty.jpg"));

  ArrayList<String> operacion = new ArrayList<>();
  Cordenadas cordenadas = new Cordenadas();
  Redibujar hola = new Redibujar();
  
  static GraphicsContext gc, gcaux;
  Color myColorNumbers=BLACK, myColorOperators=BLACK;
  int cont = 0, contadorParentesis = 0;
  double sizeFactor = 1;
  String textBoxInfo;
  String[] numeros = {"0","1","2","3","4","5","6","7","8","9"};
  String[] operadores = {"+","-","x","/","^","(",")"};

  @Override
  public void initialize(URL url, ResourceBundle rb) {
    gc = texthere.getGraphicsContext2D();
  }
  public void displayImage(){
    myImageView.setImage(myImage);
  }
  @FXML
  public void changeColorNumbers(){
    myColorNumbers = myColorPickerNumbers.getValue();
    gc.clearRect(0, 0, 1000, 1000);
    hola.redibujar(operacion, gc,myColorOperators,myColorNumbers,sizeFactor);
  }

  @FXML
  public void changeColorOperators(){
    myColorOperators = myColorPickerOperators.getValue();
    gc.clearRect(0, 0, 1000, 1000);
    hola.redibujar(operacion, gc,myColorOperators,myColorNumbers,sizeFactor);
  }
    
  @FXML
  public void accion0(ActionEvent event) {//
    if(!check(operadores, operacion.get(operacion.size()-1))){
      Dibuja.dibuja_cero(gc,operacion,myColorNumbers,sizeFactor);
      operacion.add("0");
    }
    updateText();
  }  
  
  @FXML
  public void accion1(ActionEvent event) {//listo
    Dibuja.dibuja_uno(gc ,operacion,myColorNumbers,sizeFactor);
    operacion.add("1");
    updateText();
  }
    
  @FXML
  public void accion2(ActionEvent event) {
    Dibuja.dibuja_dos(gc ,operacion,myColorNumbers,sizeFactor);
    operacion.add("2");
    updateText();
  }

  @FXML
  public void accion3(ActionEvent event) {
    Dibuja.dibuja_tres(gc,operacion,myColorNumbers,sizeFactor);
    operacion.add("3");
    updateText();
  }
  
  @FXML
  public void accion4(ActionEvent event) {
    Dibuja.dibuja_cuatro(gc,operacion,myColorNumbers,sizeFactor);
    operacion.add("4");
    updateText();
  }
  
  @FXML
  public void accion5(ActionEvent event) {
    Dibuja.dibuja_cinco(gc,operacion,myColorNumbers,sizeFactor);
    operacion.add("5");
    updateText();
  }
    
  @FXML
  public void accion6(ActionEvent event) {
    Dibuja.dibuja_seis(gc,operacion,myColorNumbers,sizeFactor);
    operacion.add("6");
    updateText();
  }
      
  @FXML
  public void accion7(ActionEvent event) { 
    Dibuja.dibuja_siete(gc,operacion,myColorNumbers,sizeFactor);
    operacion.add("7"); 
    updateText();
  }

  @FXML
  public void accion8(ActionEvent event) {
    Dibuja.dibuja_ocho(gc,operacion,myColorNumbers,sizeFactor);
    operacion.add("8");  
    updateText();
  }
    
  @FXML
  public void accion9(ActionEvent event) {
    Dibuja.dibuja_nueve(gc,operacion,myColorNumbers,sizeFactor);
    operacion.add("9"); 
    updateText();
  }  

  @FXML
  public void accion_mas(ActionEvent event) {//listo
    if(check(numeros, operacion.get(operacion.size()-1))){
      Dibuja.dibuja_mas(gc,operacion,myColorOperators,sizeFactor);
      operacion.add("+");
    }
    updateText();
  }

  @FXML
  public void accion_menos(ActionEvent event) {//listo
    if(!"-".equals(operacion.get(operacion.size()-1))){
      Dibuja.dibuja_menos(gc,operacion, myColorOperators,sizeFactor);
      operacion.add("-");
    }
    updateText();
  }

  @FXML
  public void accion_x(ActionEvent event) {
    if(check(numeros, operacion.get(operacion.size()-1))){
      Dibuja.dibuja_x(gc,operacion, myColorOperators,sizeFactor);
      operacion.add("x");
    }
    updateText();
  }

  @FXML
  public void accion_parentesisIzquierdo(ActionEvent event){
    if(!check(numeros, operacion.get(operacion.size()-1))){
      Dibuja.dibuja_parentesisI(gc,operacion, myColorOperators,sizeFactor);
      operacion.add("(");
      contadorParentesis++;
    }
    updateText();
  }

  @FXML
  public void accion_parentesisDerecho(ActionEvent event) {
    if(contadorParentesis!=0 && !check(operadores, operacion.get(operacion.size()-1))){
      Dibuja.dibuja_parentesisD(gc,operacion, myColorOperators,sizeFactor);
      operacion.add(")");
      contadorParentesis--;
    }
    updateText();
  }

  @FXML
  private void accion_limpiar(ActionEvent event) {
    gc.clearRect(0, 0, 1000, 1000);
    Dibuja.limpiaMx();
    operacion.clear();
    updateText();
  }
  
  @FXML
  private void accion_dividir(ActionEvent event) {
    if(!"1".equals(operacion.get(operacion.size()-1)) && !check(operadores, operacion.get(operacion.size()-1))){
      Dibuja.dibuja_dividir(gc,operacion, myColorOperators,sizeFactor);
      operacion.add("/");
    }else if("1".equals(operacion.get(operacion.size()-1)) && !check(operadores, operacion.get(operacion.size()-1))){
      Dibuja.dibuja_dividir1(gc, myColorOperators,sizeFactor);
      operacion.add("/");
    } 
    updateText();
  }
    
  @FXML
  private void accion_potencia(ActionEvent event) {
    operacion.add("^");
    updateText();
  }
    
  @FXML
  public void accion_cordenadas(ActionEvent event){
    if(cont == 0){
      cont=1;    
      for(int i = 0; i< operacion.size();i++){
        if("0".equals(operacion.get(i))){
          cordenadas.puntos("0", sizeFactor);
        }   
        if("1".equals(operacion.get(i))){
          cordenadas.puntos("1", sizeFactor);
        }
        if("2".equals(operacion.get(i))){
          cordenadas.puntos("2",sizeFactor);
        }
        if("3".equals(operacion.get(i))){
          cordenadas.puntos("3", sizeFactor);
        }
        if("4".equals(operacion.get(i))){
          cordenadas.puntos("4", sizeFactor);
        }
        if("5".equals(operacion.get(i))){
          cordenadas.puntos("5", sizeFactor);
        }
        if("6".equals(operacion.get(i))){
          cordenadas.puntos("6", sizeFactor);
        }
        if("7".equals(operacion.get(i))){
          cordenadas.puntos("7", sizeFactor);
        }
        if("8".equals(operacion.get(i))){
          cordenadas.puntos("8", sizeFactor);
        }
        if("9".equals(operacion.get(i))){
          cordenadas.puntos("9", sizeFactor);
        }
        if("x".equals(operacion.get(i))){
          cordenadas.puntos("x", sizeFactor);
        }
        if("/".equals(operacion.get(i))){
          cordenadas.puntos("/", sizeFactor);
        }
        if("+".equals(operacion.get(i))){
          cordenadas.puntos("+", sizeFactor);
        }
        if("-".equals(operacion.get(i))){
          cordenadas.puntos("-", sizeFactor);
        }
        if(")".equals(operacion.get(i))){
          cordenadas.puntos(")", sizeFactor);           
        }
        if("(".equals(operacion.get(i))){
          cordenadas.puntos("(", sizeFactor);
        }
      }   
    }else{
      gc.clearRect(0, 0, 1000, 1000);
      hola.redibujar(operacion, gc,myColorOperators,myColorNumbers,sizeFactor);
      cont = 0;
    }
    gc.setLineWidth(1);
    cordenadas.limpiar();
  }

  @FXML
  private void panel(MouseEvent event) {
    //empty    
  }

  @FXML
  private void updateSize(MouseEvent event) {
    sizeFactor = mySizeOfExpressions.getValue();    
    gc.clearRect(0, 0, 1000, 1000);
    hola.redibujar(operacion, gc,myColorOperators,myColorNumbers,sizeFactor);
  }

  @FXML
  void updateText() {
    textBoxInfo = String.join("", operacion);
    myText.setText(textBoxInfo);
  }
    
  private static boolean check(String[] arr, String toCheckValue){
    boolean test = false;
    for (String element : arr) {
      if (Objects.equals(element, toCheckValue)) {
        test = true;
        break;
      }
    }
    return test;
  }       
}