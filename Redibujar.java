/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.ArrayList;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import static calculadora.FXMLDocumentController.contP;
import static calculadora.FXMLDocumentController.operacion;

/**
 *
 * @author waki
 */
public class Redibujar {
    ArrayList<String> auxlista = new ArrayList();
    Division d = new Division();
   
    public void redibujar(ArrayList<String> operacion,GraphicsContext gc,Color myColorOperators, Color myColorNumbers, double sizeFactor){
        Dibuja.limpiaMx();
        d.limpiar();
        int contB = 0;
        contP=false;
        auxlista.clear();
        int cont = 0; 
       
        
        
       
        int contD=0;
         
        
        for(int i=0;i<operacion.size(); i++){
        
        if("/".equals(operacion.get(i)) ){
            
        d.division(gc, myColorOperators);
        
        }}
         
        
        for( int i=0 ;i<operacion.size();i++){
            auxlista.add(operacion.get(cont));
            cont++;
            
            
            if ("1".equals(operacion.get(i)) ){
                Dibuja.dibuja_uno(gc, operacion,myColorNumbers,sizeFactor,myColorOperators);}
            if ("2".equals(operacion.get(i)) ){
                Dibuja.dibuja_dos(gc, operacion, myColorNumbers,sizeFactor,myColorOperators);}
            if ("3".equals(operacion.get(i)) ){
                Dibuja.dibuja_tres(gc, operacion,myColorNumbers,sizeFactor,myColorOperators);}
            if ("4".equals(operacion.get(i)) ){
                Dibuja.dibuja_cuatro(gc, operacion,myColorNumbers,sizeFactor,myColorOperators);}
            if ("5".equals(operacion.get(i)) ){
                Dibuja.dibuja_cinco(gc, operacion,myColorNumbers,sizeFactor,myColorOperators);}
            if ("6".equals(operacion.get(i)) ){
                Dibuja.dibuja_seis(gc, operacion,myColorNumbers,sizeFactor,myColorOperators);}
            if ("7".equals(operacion.get(i)) ){
                Dibuja.dibuja_siete(gc, operacion,myColorNumbers,sizeFactor,myColorOperators);}
            if ("8".equals(operacion.get(i)) ){
                Dibuja.dibuja_ocho(gc, operacion,myColorNumbers,sizeFactor,myColorOperators);}
            if ("9".equals(operacion.get(i)) ){
                Dibuja.dibuja_nueve(gc, operacion,myColorNumbers,sizeFactor,myColorOperators);}
            if ("0".equals(operacion.get(i)) ){
                Dibuja.dibuja_cero(gc, operacion,myColorNumbers,sizeFactor,myColorOperators);}
            if ("+".equals(operacion.get(i)) ){
                Dibuja.dibuja_mas(gc, operacion,myColorOperators,sizeFactor);}
            if ("-".equals(operacion.get(i)) ){
                Dibuja.dibuja_menos(gc, operacion,myColorOperators,sizeFactor);}
            if ("x".equals(operacion.get(i)) ){
                Dibuja.dibuja_x(gc, operacion,myColorOperators,sizeFactor);}
            if ("(".equals(operacion.get(i)) ){
                Dibuja.dibuja_parentesisI(gc, operacion,myColorOperators,sizeFactor);}
            if (")".equals(operacion.get(i)) ){
                Dibuja.dibuja_parentesisD(gc, operacion,myColorOperators,sizeFactor);}
            if ("^".equals(operacion.get(i)) ){
                contP=true;}
            if ("sin".equals(operacion.get(i)) ){
                Dibuja.dibuja_seno(gc, myColorOperators,sizeFactor);}
            if ("cos".equals(operacion.get(i)) ){
                Dibuja.dibuja_coseno(gc, myColorOperators,sizeFactor);}   
            if ("tan".equals(operacion.get(i)) ){
                Dibuja.dibuja_tangente(gc, myColorOperators,sizeFactor);} 
            if ("!".equals(operacion.get(i)) ){
                Dibuja.dibuja_factorial(gc, myColorOperators, sizeFactor);}
            if (".".equals(operacion.get(i)) ){
                Dibuja.dibujaPunto(gc, operacion, myColorNumbers, sizeFactor);    
            }
            if ("/".equals(operacion.get(i)) ){
                if(contB==0){
                d.bajar();
                contB++;}
                
                else{
                d.bajar();d.bajar();
                }
            }
        }
    }
}