/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.ArrayList;
import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author waki
 */
public class Redibujar {
    
    Dibuja dibuja = new Dibuja();
    
    
    
    public void redibujar(ArrayList<String> operacion,GraphicsContext gc){
     dibuja.limpiar();
    
     for(int i =0;i<operacion.size() ;i++){
    if ("1".equals(operacion.get(i)) ){
     dibuja.dibuja_uno(gc, operacion);}
    if ("2".equals(operacion.get(i)) ){
     dibuja.dibuja_dos(gc, operacion);}
    if ("3".equals(operacion.get(i)) ){
     dibuja.dibuja_tres(gc, operacion);}
    if ("4".equals(operacion.get(i)) ){
     dibuja.dibuja_cuatro(gc, operacion);}
    if ("5".equals(operacion.get(i)) ){
     dibuja.dibuja_cinco(gc, operacion);}
    if ("6".equals(operacion.get(i)) ){
     dibuja.dibuja_seis(gc, operacion);}
    if ("7".equals(operacion.get(i)) ){
     dibuja.dibuja_siete(gc, operacion);}
    if ("8".equals(operacion.get(i)) ){
     dibuja.dibuja_ocho(gc, operacion);}
    if ("9".equals(operacion.get(i)) ){
     dibuja.dibuja_nueve(gc, operacion);}
    if ("0".equals(operacion.get(i)) ){
     dibuja.dibuja_cero(gc, operacion);}
    if ("+".equals(operacion.get(i)) ){
     dibuja.dibuja_mas(gc, operacion);}
    if ("-".equals(operacion.get(i)) ){
     dibuja.dibuja_menos(gc, operacion);}
    if ("x".equals(operacion.get(i)) ){
     dibuja.dibuja_x(gc, operacion);}
    if ("(".equals(operacion.get(i)) ){
     dibuja.dibuja_parentesisI(gc, operacion);}
    if (")".equals(operacion.get(i)) ){
     dibuja.dibuja_parentesisD(gc, operacion);}
    if ("/".equals(operacion.get(i)) ){
     dibuja.dibuja_dividir(gc, operacion);}
     
 }
    
    
    }
    
    
}
