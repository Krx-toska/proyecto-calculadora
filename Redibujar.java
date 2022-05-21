/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.ArrayList;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *
 * @author waki
 */
public class Redibujar {
    
    Dibuja dibuja = new Dibuja();
    ArrayList<String> auxlista = new ArrayList();
    ArrayList<String> auxlista2 = new ArrayList();
 
    
    public void redibujar(ArrayList<String> operacion,GraphicsContext gc,Color myColorOperators, Color myColorNumbers, double sizeFactor,int contD,ArrayList<String> auxlista2){
    dibuja.limpiar();
    auxlista.clear();
    System.out.println(auxlista2);
    String ax;
    int cont = 0;
         
     for(int i =0;i<operacion.size();i++){
  
     auxlista.add(operacion.get(cont));
     ax=auxlista2.get(cont);
     contD = Integer.parseInt(ax);
     cont++;
    if ("1".equals(operacion.get(i)) ){
     dibuja.dibuja_uno(gc, auxlista,myColorNumbers,sizeFactor,contD,myColorOperators);}
    if ("2".equals(operacion.get(i)) ){
     dibuja.dibuja_dos(gc, auxlista, myColorNumbers,sizeFactor,contD,myColorOperators);}
    if ("3".equals(operacion.get(i)) ){
     dibuja.dibuja_tres(gc, auxlista,myColorNumbers,sizeFactor,contD,myColorOperators);}
    if ("4".equals(operacion.get(i)) ){
     dibuja.dibuja_cuatro(gc, auxlista,myColorNumbers,sizeFactor,contD,myColorOperators);}
    if ("5".equals(operacion.get(i)) ){
     dibuja.dibuja_cinco(gc, auxlista,myColorNumbers,sizeFactor,contD,myColorOperators);}
    if ("6".equals(operacion.get(i)) ){
     dibuja.dibuja_seis(gc, auxlista,myColorNumbers,sizeFactor,contD,myColorOperators);}
    if ("7".equals(operacion.get(i)) ){
     dibuja.dibuja_siete(gc, auxlista,myColorNumbers,sizeFactor,contD,myColorOperators);}
    if ("8".equals(operacion.get(i)) ){
     dibuja.dibuja_ocho(gc, auxlista,myColorNumbers,sizeFactor,contD,myColorOperators);}
    if ("9".equals(operacion.get(i)) ){
     dibuja.dibuja_nueve(gc, auxlista,myColorNumbers,sizeFactor,contD,myColorOperators);}
    if ("0".equals(operacion.get(i)) ){
     dibuja.dibuja_cero(gc, auxlista,myColorNumbers,sizeFactor,contD,myColorOperators);}
    if ("+".equals(operacion.get(i)) ){
     dibuja.dibuja_mas(gc, operacion,myColorOperators,sizeFactor,contD);}
    if ("-".equals(operacion.get(i)) ){
     dibuja.dibuja_menos(gc, operacion,myColorOperators,sizeFactor,contD);}
    if ("x".equals(operacion.get(i)) ){
     dibuja.dibuja_x(gc, operacion,myColorOperators,sizeFactor,contD);}
    if ("(".equals(operacion.get(i)) ){
     dibuja.dibuja_parentesisI(gc, operacion,myColorOperators,sizeFactor);}
    if (")".equals(operacion.get(i)) ){
     dibuja.dibuja_parentesisD(gc, operacion,myColorOperators,sizeFactor);}
    if ("^".equals(operacion.get(i)) ){
     cont--;
     cont=i;} 
 }
    
    
    }
    
    
}
