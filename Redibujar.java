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
    
    
    
    public void redibujar(ArrayList<String> operacion,GraphicsContext gc,Color myColorOperators, Color myColorNumbers){
     dibuja.limpiar();
    
     for(int i =0;i<operacion.size() ;i++){
    if ("1".equals(operacion.get(i)) ){
     dibuja.dibuja_uno(gc, operacion,myColorNumbers);}
    if ("2".equals(operacion.get(i)) ){
     dibuja.dibuja_dos(gc, operacion,myColorNumbers);}
    if ("3".equals(operacion.get(i)) ){
     dibuja.dibuja_tres(gc, operacion,myColorNumbers);}
    if ("4".equals(operacion.get(i)) ){
     dibuja.dibuja_cuatro(gc, operacion,myColorNumbers);}
    if ("5".equals(operacion.get(i)) ){
     dibuja.dibuja_cinco(gc, operacion,myColorNumbers);}
    if ("6".equals(operacion.get(i)) ){
     dibuja.dibuja_seis(gc, operacion,myColorNumbers);}
    if ("7".equals(operacion.get(i)) ){
     dibuja.dibuja_siete(gc, operacion,myColorNumbers);}
    if ("8".equals(operacion.get(i)) ){
     dibuja.dibuja_ocho(gc, operacion,myColorNumbers);}
    if ("9".equals(operacion.get(i)) ){
     dibuja.dibuja_nueve(gc, operacion,myColorNumbers);}
    if ("0".equals(operacion.get(i)) ){
     dibuja.dibuja_cero(gc, operacion,myColorNumbers);}
    if ("+".equals(operacion.get(i)) ){
     dibuja.dibuja_mas(gc, operacion,myColorOperators);}
    if ("-".equals(operacion.get(i)) ){
     dibuja.dibuja_menos(gc, operacion,myColorOperators);}
    if ("x".equals(operacion.get(i)) ){
     dibuja.dibuja_x(gc, operacion,myColorOperators);}
    if ("(".equals(operacion.get(i)) ){
     dibuja.dibuja_parentesisI(gc, operacion,myColorOperators);}
    if (")".equals(operacion.get(i)) ){
     dibuja.dibuja_parentesisD(gc, operacion,myColorOperators);}
    if ("/".equals(operacion.get(i)) ){
     dibuja.dibuja_dividir(gc, operacion,myColorOperators);}
     
 }
    
    
    }
    
    
}
