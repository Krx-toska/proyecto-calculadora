
package calculadora;

import javafx.fxml.FXML;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
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
import static calculadora.Division.niveles;
import static calculadora.Dibuja.contG;
import javafx.scene.control.TextField;

/**
 *
 * @author krox2
 */
public class FXMLDocumentController implements Initializable {     
  @FXML
  private Button bttn_mas, bttn_menos, bttn_0, bttn_1, bttn_2, bttn_3, bttn_4, bttn_5, bttn_6, bttn_7,bttn_8, bttn_9, bttn_x, bttn_parentesisDerecho, bttn_parentesisIzquierdo, bttn_potencia, bttn_cambio, bttn_f, bttn_sin, bttn_cos, bttn_tan, bttn_paraBase;;
  @FXML
  private javafx.scene.canvas.Canvas texthere;
  @FXML
  ColorPicker myColorPickerNumbers, myColorPickerOperators;
  @FXML
  private Text myText;
  @FXML
  private Text myTextLevel;
  @FXML
  private Slider mySizeOfExpressions;
    ImageView myImageView;
  @FXML
  private Text textoColorNumeros, textoColorOperadores;

  Image myImage = new Image(getClass().getResourceAsStream("helloKitty.jpg"));

  
  static ArrayList<String> operacion = new ArrayList<>();
  static ArrayList<String> operacionR = new ArrayList<>();
  List<String> expresionEnBinario = new ArrayList<String>();
  Cordenadas cordenadas = new Cordenadas();
  Redibujar hola = new Redibujar();
  Division division = new Division();
  
  static GraphicsContext gc, gcaux;
  Color myColorNumbers=BLACK, myColorOperators=BLACK;
  int cont = 0, contadorParentesis = 0, cambio = 0;
  boolean estadoCambioDeBase = false;
  static double sizeFactor = 1;
  String textBoxInfo;
  String textBoxlevel;
  String[] numeros = {"0","1","2","3","4","5","6","7","8","9"};
  String[] operadores = {"+","-","x","/","^","(",")"};
  int contB = 0;
  static ArrayList<Boolean> Rdiviciones = new ArrayList<>();
  static ArrayList<Boolean> Rbajar = new ArrayList<>();
  
  static boolean contP = false;
    @FXML
    private Button bbtn_dividir;
    @FXML
    private Button bbtn_clear;
    @FXML
    private Button bbtn_cor;
    @FXML
    private TextField inputText;
    @FXML
    private Button bttnConvertir;
    @FXML
    private Button bttn_raiz;
    @FXML
    private Button bttnCalcular;
    @FXML
    private Button bbtn_mover;

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
    hola.redibujar(operacionR, gc,myColorOperators,myColorNumbers,sizeFactor);
  }

  @FXML
  public void changeColorOperators(){
    myColorOperators = myColorPickerOperators.getValue();
    gc.clearRect(0, 0, 1000, 1000);
    hola.redibujar(operacionR, gc,myColorOperators,myColorNumbers,sizeFactor);
  }
    
  @FXML
  public void accion0(ActionEvent event) {//
    if(!check(operadores, operacion.get(operacion.size()-1))){
      Dibuja.dibuja_cero(gc,operacion,myColorNumbers,sizeFactor,myColorOperators);
      operacion.add("0");
      operacionR.add("0");
    }
    updateText();
  }  
  
  @FXML
  public void accion1(ActionEvent event) {//listo
    Dibuja.dibuja_uno(gc ,operacion,myColorNumbers,sizeFactor,myColorOperators);
    operacion.add("1");
    operacionR.add("1");
    updateText();
  }
    
  @FXML
  public void accion2(ActionEvent event) {
      
    Rdiviciones.add(false);
    Rbajar.add(false);  
      
    Dibuja.dibuja_dos(gc ,operacion,myColorNumbers,sizeFactor,myColorOperators);
    operacion.add("2");
    operacionR.add("2");
    updateText();
  }

  @FXML
  public void accion3(ActionEvent event) {
    Dibuja.dibuja_tres(gc,operacion,myColorNumbers,sizeFactor,myColorOperators);
    operacion.add("3");
    operacionR.add("3");
    updateText();
  }
  
  @FXML
  public void accion4(ActionEvent event) {
    Dibuja.dibuja_cuatro(gc,operacion,myColorNumbers,sizeFactor,myColorOperators);
    operacion.add("4");
    operacionR.add("4");
    updateText();
  }
  
  @FXML
  public void accion5(ActionEvent event) {
    Dibuja.dibuja_cinco(gc,operacion,myColorNumbers,sizeFactor,myColorOperators);
    operacion.add("5");
    operacionR.add("5");
    updateText();
  }
    
  @FXML
  public void accion6(ActionEvent event) {
    Dibuja.dibuja_seis(gc,operacion,myColorNumbers,sizeFactor,myColorOperators);
    operacion.add("6");
    operacionR.add("6");
    updateText();
  }
      
  @FXML
  public void accion7(ActionEvent event) { 
    Dibuja.dibuja_siete(gc,operacion,myColorNumbers,sizeFactor,myColorOperators);
    operacion.add("7");
    operacionR.add("7");
    updateText();
  }

  @FXML
  public void accion8(ActionEvent event) {
    Dibuja.dibuja_ocho(gc,operacion,myColorNumbers,sizeFactor,myColorOperators);
    operacion.add("8"); 
    operacionR.add("8");
    updateText();
  }
    
  @FXML
  public void accion9(ActionEvent event) {
    Dibuja.dibuja_nueve(gc,operacion,myColorNumbers,sizeFactor,myColorOperators);
    operacion.add("9"); 
    operacionR.add("9");
    updateText();
  }  

  @FXML
  public void accion_mas(ActionEvent event) {//listo
    if(check(numeros, operacion.get(operacion.size()-1))){
      Dibuja.dibuja_mas(gc,operacion,myColorOperators,sizeFactor);
      operacion.add("+");
      operacionR.add("+");
    }
    updateText();
  }

  @FXML
  public void accion_menos(ActionEvent event) {//listo
    if(!"-".equals(operacion.get(operacion.size()-1))){
      Dibuja.dibuja_menos(gc,operacion, myColorOperators,sizeFactor);
      operacion.add("-");
      operacionR.add("-");
    }
    updateText();
  }

  @FXML
  public void accion_x(ActionEvent event) {
    if(check(numeros, operacion.get(operacion.size()-1))){
      Dibuja.dibuja_x(gc,operacion, myColorOperators,sizeFactor);
      operacion.add("x");
      operacionR.add("x");
    }
    updateText();
  }

  @FXML
  public void accion_parentesisIzquierdo(ActionEvent event){
      
    if(contG==true){
    return;
    }  
    else{
      if(operacionR.isEmpty() || !check(numeros, operacion.get(operacion.size()-1))){
        Dibuja.dibuja_parentesisI(gc,operacion, myColorOperators,sizeFactor);
        operacion.add("(");
        operacionR.add("(");
        contadorParentesis++;
      }
    updateText();}
  }

  @FXML
  public void accion_parentesisDerecho(ActionEvent event) {
    if(contadorParentesis!=0 && !check(operadores, operacion.get(operacion.size()-1))){
      Dibuja.dibuja_parentesisD(gc,operacion, myColorOperators,sizeFactor);
      operacion.add(")");
      operacionR.add(")");
      contadorParentesis--;
    }
    updateText();
  }

  @FXML
  private void accion_limpiar(ActionEvent event) {
    contP=false;
    gc.clearRect(0, 0, 1000, 1000);
    Dibuja.limpiaMx();
    operacion.clear();
    division.limpiar();
    operacionR.clear();
    updateText();
    contB=0;
    
  }
  
  @FXML
  private void accion_dividir(ActionEvent event) {
    operacion.add("/");
    operacionR.add("/"); 
    
    division.division(gc,myColorOperators);
    
    updateTextlevel();
    updateText();
  }
    
  @FXML
  private void accion_potencia(ActionEvent event) {
    if(operacion.isEmpty()  || operacion.get(operacion.size()-1)=="^" || contG==true){
    
    return;
    }
    else{
    if(contP==false){
    operacion.add("^");
    operacionR.add("^");
    contP=true;
    }
    
    else{
    
    contP=false;
    }
    
    updateText();
  }}

  @FXML
  public void accion_factorial(ActionEvent event){
    Dibuja.dibuja_factorial(gc, myColorOperators, sizeFactor);
    operacion.add("!");
    operacionR.add("!");
  }

  @FXML
  public void accion_seno(ActionEvent event){
    Dibuja.dibuja_seno(gc, myColorOperators, sizeFactor);
    operacion.add("sin");
    operacionR.add("sin");
  }

  @FXML
  public void accion_coseno(ActionEvent event){
    Dibuja.dibuja_coseno(gc, myColorOperators, sizeFactor);
    operacion.add("cos");
    operacionR.add("cos");
  }

  @FXML
  public void accion_tangente(ActionEvent event){
    Dibuja.dibuja_tangente(gc, myColorOperators, sizeFactor);
    operacion.add("tan");
    operacionR.add("tan");
  }

  @FXML
  public void accion_cambio(ActionEvent event){
    if(cambio == 0){
      bttn_potencia.setVisible(false);
      bttn_f.setVisible(false);
      bttn_sin.setVisible(false);
      bttn_cos.setVisible(false);
      bttn_tan.setVisible(false);
      bttn_raiz.setVisible(false);
      cambio = 1;
    }else{
      bttn_potencia.setVisible(true);
      bttn_f.setVisible(true);
      bttn_sin.setVisible(true);
      bttn_cos.setVisible(true);
      bttn_tan.setVisible(true); 
      bttn_raiz.setVisible(true);
      cambio = 0;
    }
  }

  @FXML
  void accion_cambioDeBase(ActionEvent event) {
      
    System.out.println("lista de operacionR: "+operacionR);
    if(estadoCambioDeBase == false){
      bttn_2.setVisible(false);
      bttn_3.setVisible(false);
      bttn_4.setVisible(false);
      bttn_5.setVisible(false);
      bttn_6.setVisible(false);
      bttn_7.setVisible(false);
      bttn_8.setVisible(false);
      bttn_9.setVisible(false);
      estadoCambioDeBase = true;
      gc.clearRect(0, 0, 5000, 5000);
      hola.redibujar(Binario.toBinary(operacionR), gc, myColorOperators, myColorNumbers, sizeFactor);
      operacionR = Binario.toBinary(operacionR);
    }else{
      bttn_2.setVisible(true);
      bttn_3.setVisible(true);
      bttn_4.setVisible(true);
      bttn_5.setVisible(true);
      bttn_6.setVisible(true);
      bttn_7.setVisible(true);
      bttn_8.setVisible(true);
      bttn_9.setVisible(true);
      estadoCambioDeBase = false;
      gc.clearRect(0, 0, 5000, 5000);
      hola.redibujar(Binario.toDecimal(operacionR), gc, myColorOperators, myColorNumbers, sizeFactor);
      operacionR = Binario.toDecimal(operacionR);
      updateText();
    }
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
        if("sin".equals(operacion.get(i))){
          cordenadas.puntos("sin", sizeFactor);
        }
        if("cos".equals(operacion.get(i))){
          cordenadas.puntos("cos", sizeFactor);
        }
        if("tan".equals(operacion.get(i))){
          cordenadas.puntos("tan", sizeFactor);
        }
        if("!".equals(operacion.get(i))){
          cordenadas.puntos("!", sizeFactor);
        }
      }   
    }else{
      gc.clearRect(0, 0, 1000, 1000);
      hola.redibujar(operacionR, gc,myColorOperators,myColorNumbers,sizeFactor);
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
    hola.redibujar(operacionR, gc,myColorOperators,myColorNumbers,sizeFactor);
  }

  void updateText() {
    textBoxInfo = String.join("", operacion);
    myText.setText(textBoxInfo);
  }
  
  
  void updateTextlevel() {
    
    String numCadena;  
      
      
    if(niveles.isEmpty()){
    numCadena="no hay";
    }
    
    else{
    numCadena= niveles.get(niveles.size()-1)+""; 
    textBoxlevel =String.join("", numCadena);}
    
    
    
    
    myTextLevel.setText(numCadena);
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

    @FXML
    private void accion_mover(ActionEvent event) {
        
        operacionR.add("bajar");
        
        division.bajar();
        updateTextlevel();
    }

    @FXML
  void textToDraw(ActionEvent event) {
    String newOp = inputText.getText();
    operacion.clear();
    myText.setText("");
    for (int i = 0; i < newOp.length(); i++) {
      operacionR.add(String.valueOf(newOp.charAt(i)));
    }
    gc.clearRect(0, 0, 1000, 1000);
    hola.redibujar(operacionR, gc,myColorOperators,myColorNumbers,sizeFactor);
    updateText();
    cordenadas.limpiar();
  }

    @FXML
    public void accion_raiz(ActionEvent actionEvent) {
    Dibuja.dibuja_raiz(gc,operacion,myColorOperators,sizeFactor);
    Dibuja.dibuja_parentesisI(gc,operacion, myColorOperators,sizeFactor);
    contadorParentesis++;
    operacion.add("√");
    operacion.add("(");
    }

      @FXML
  void accionCalcular(ActionEvent event) {
    String expresion = "";
    String resultado = "";
    String resi = "";
    for (int i = 0; i < operacion.size(); i++) {
      if (operacion.get(i) == "°"){}
      else {
        expresion = expresion + operacion.get(i);
      }
    }
    resultado = String.valueOf(eval(expresion));
    operacion.clear();
    gc.clearRect(0,0,1000,1000);
    for (int i = 0; i < resultado.length(); i++) {
      operacion.add(String.valueOf(resultado.charAt(i)));
    };
    hola.redibujar(operacion, gc,myColorOperators,myColorNumbers,sizeFactor);
    updateText();
  }
      

  
    
    public static double eval(final String str) {
    return new Object() {
      int pos = -1, ch;

      void nextChar() {
        ch = (++pos < str.length()) ? str.charAt(pos) : -1;
      }

      boolean eat(int charToEat) {
        while (ch == ' ') nextChar();
        if (ch == charToEat) {
          nextChar();
          return true;
        }
        return false;
      }

      double parse() {
        nextChar();
        double x = parseExpression();
        if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
        return x;
      }

      double parseExpression() {
        double x = parseTerm();
        for (;;) {
          if      (eat('+')) x += parseTerm(); // addition
          else if (eat('-')) x -= parseTerm(); // subtraction
          else return x;
        }
      }

      double parseTerm() {
        double x = parseFactor();
        for (;;) {
          if      (eat('x')) x *= parseFactor(); // multiplication
          else if (eat('/')) x /= parseFactor(); // division
          else return x;
        }
      }
      long factorial(double number) {
        long result = 1;

        for (int factor = 2; factor <= number; factor++) {
          result *= factor;
        }

        return result;
      }

      double parseFactor() {
        if (eat('+')) return +parseFactor(); // unary plus
        if (eat('-')) return -parseFactor(); // unary minus

        double x;
        int startPos = this.pos;
        if (eat('(')) { // parentheses
          x = parseExpression();
          if (!eat(')')) throw new RuntimeException("Missing ')'");
        } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
          while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
          x = Double.parseDouble(str.substring(startPos, this.pos));
        } else if ((ch >= 'a' && ch <= 'z') || ch == '√' || ch == '!') { // functions
          while ((ch >= 'a' && ch <= 'z') || ch == '√' || ch == '!') nextChar();
          String func = str.substring(startPos, this.pos);
          if (eat('(')) {
            x = parseExpression();
            if (!eat(')')) throw new RuntimeException("Missing ')' after argument to " + func);
          } else {
            x = parseFactor();
          }
          System.out.println(func);
          switch (func) {
            case "√":
              x = Math.sqrt(x);
              break;
            case "sin":
              x = Math.sin(Math.toRadians(x));
              break;
            case "cos":
              x = Math.cos(Math.toRadians(x));
              break;
            case "tan":
              x = Math.tan(Math.toRadians(x));
              break;
            case "!":
              x = factorial(x);
              break;
            default:
              throw new RuntimeException("Unknown function: " + func);
          }
        } else {
          throw new RuntimeException("Unexpected: " + (char)ch);
        }

        if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

        return x;
      }
    }.parse();
  }
    
}