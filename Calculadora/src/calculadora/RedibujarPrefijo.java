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
public class RedibujarPrefijo {

    public void redibujar(ArrayList<String> operacion,GraphicsContext gc,Color myColorOperators, Color myColorNumbers, double sizeFactor){
        Dibuja.limpiaMx();
        for( int i=0 ;i<operacion.size();i++){
            Division.bajar=0;
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
                  Dibuja.DibujaDivisionLineal(gc, operacion, myColorOperators, sizeFactor);
    }
    }
}
}