package calculadora;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

/**
 *
 * @author waki
 */

public class Dibuja {
    double mx=0;
    public void dibuja_uno(GraphicsContext gc, double aux, Color myColorNumbers, double sizeFactor){
        gc.setStroke(myColorNumbers);
        gc.strokeLine(mx + 20*sizeFactor,aux + 25*sizeFactor,mx + 20*sizeFactor,aux + 75*sizeFactor);
        gc.strokeLine(mx + 20*sizeFactor,aux + 25*sizeFactor,mx + 10*sizeFactor,aux + 35*sizeFactor);
        mx = mx + 25*sizeFactor;
    }
    
    public void dibuja_dos(GraphicsContext gc, double aux, Color myColorNumbers, double sizeFactor){
        gc.setStroke(myColorNumbers);
        gc.strokeLine(mx + 10*sizeFactor,aux + 25*sizeFactor,mx + 35*sizeFactor,aux + 25*sizeFactor);
        gc.strokeLine(mx + 35*sizeFactor,aux + 25*sizeFactor,mx + 35*sizeFactor,aux + 50*sizeFactor);
        gc.strokeLine(mx + 10*sizeFactor,aux + 50*sizeFactor,mx + 35*sizeFactor,aux + 50*sizeFactor); //horizontal media
        gc.strokeLine(mx + 10*sizeFactor,aux + 50*sizeFactor,mx + 10*sizeFactor,aux + 75*sizeFactor);
        gc.strokeLine(mx + 10*sizeFactor,aux + 75*sizeFactor,mx + 35*sizeFactor,aux + 75*sizeFactor);
        mx = mx + 35*sizeFactor;
    }
    
    public void dibuja_tres(GraphicsContext gc, double aux, Color myColorNumbers, double sizeFactor){
        gc.setStroke(myColorNumbers);
        gc.strokeLine(mx + 10*sizeFactor,aux + 25*sizeFactor,mx + 35*sizeFactor,aux + 25*sizeFactor);
        gc.strokeLine(mx + 35*sizeFactor,aux + 25*sizeFactor,mx + 35*sizeFactor,aux + 75*sizeFactor);
        gc.strokeLine(mx + 10*sizeFactor,aux + 50*sizeFactor,mx + 35*sizeFactor,aux + 50*sizeFactor);
        gc.strokeLine(mx + 10*sizeFactor,aux + 75*sizeFactor,mx + 35*sizeFactor,aux + 75*sizeFactor);
        mx = mx + 35*sizeFactor;
    }
      
    public void dibuja_cuatro(GraphicsContext gc, double aux, Color myColorNumbers, double sizeFactor){
        gc.setStroke(myColorNumbers);
        gc.strokeLine(mx + 35*sizeFactor,aux + 25*sizeFactor,mx + 35*sizeFactor,aux + 75*sizeFactor);
        gc.strokeLine(mx + 10*sizeFactor,aux + 50*sizeFactor,mx + 35*sizeFactor,aux + 50*sizeFactor);
        gc.strokeLine(mx + 10*sizeFactor,aux + 25*sizeFactor,mx + 10*sizeFactor,aux + 50*sizeFactor);
        mx = mx + 35*sizeFactor;
    }
          
    public void dibuja_cinco(GraphicsContext gc, double aux, Color myColorNumbers, double sizeFactor){
        gc.setStroke(myColorNumbers);
        gc.strokeLine(mx + 10*sizeFactor,aux + 25*sizeFactor,mx + 35*sizeFactor,aux + 25*sizeFactor);
        gc.strokeLine(mx + 35*sizeFactor,aux + 50*sizeFactor,mx + 35*sizeFactor,aux + 75*sizeFactor);
        gc.strokeLine(mx + 10*sizeFactor,aux + 50*sizeFactor,mx + 35*sizeFactor,aux + 50*sizeFactor);
        gc.strokeLine(mx + 10*sizeFactor,aux + 25*sizeFactor,mx + 10*sizeFactor,aux + 50*sizeFactor);
        gc.strokeLine(mx + 10*sizeFactor,aux + 75*sizeFactor,mx + 35*sizeFactor,aux + 75*sizeFactor);
        mx = mx + 35*sizeFactor;
    }
    
    public void dibuja_seis(GraphicsContext gc, double aux, Color myColorNumbers, double sizeFactor){
        gc.setStroke(myColorNumbers);
        gc.strokeLine(mx + 10*sizeFactor,aux + 25*sizeFactor,mx + 35*sizeFactor,aux + 25*sizeFactor);   //arriba
        gc.strokeLine(mx + 10*sizeFactor,aux + 75*sizeFactor,mx + 35*sizeFactor,aux + 75*sizeFactor);   //abajo
        gc.strokeLine(mx + 10*sizeFactor,aux + 25*sizeFactor,mx + 10*sizeFactor,aux + 75*sizeFactor);   //izquierda
        gc.strokeLine(mx + 35*sizeFactor,aux + 50*sizeFactor,mx + 35*sizeFactor,aux + 75*sizeFactor);   //derecha abajo
        gc.strokeLine(mx + 10*sizeFactor,aux + 50*sizeFactor,mx + 35*sizeFactor,aux + 50*sizeFactor);
        mx = mx + 35*sizeFactor;
    }
        
    public void dibuja_siete(GraphicsContext gc, double aux, Color myColorNumbers, double sizeFactor){
        gc.setStroke(myColorNumbers);
        gc.strokeLine(mx + 10*sizeFactor,aux + 25*sizeFactor,mx + 35*sizeFactor,aux + 25*sizeFactor);   //arriba
        gc.strokeLine(mx + 10*sizeFactor,aux + 25*sizeFactor,mx + 10*sizeFactor,aux + 50*sizeFactor);   //izquierda arriba
        gc.strokeLine(mx + 35*sizeFactor,aux + 25*sizeFactor,mx + 35*sizeFactor,aux + 75*sizeFactor);   //derecha
        mx = mx + 35*sizeFactor;
    }
        
    public void dibuja_ocho(GraphicsContext gc, double aux, Color myColorNumbers, double sizeFactor){
        gc.setStroke(myColorNumbers);
        gc.strokeLine(mx + 10*sizeFactor,aux + 25*sizeFactor,mx + 35*sizeFactor,aux + 25*sizeFactor);   //arriba
        gc.strokeLine(mx + 10*sizeFactor,aux + 75*sizeFactor,mx + 35*sizeFactor,aux + 75*sizeFactor);   //abajo
        gc.strokeLine(mx + 10*sizeFactor,aux + 25*sizeFactor,mx + 10*sizeFactor,aux + 75*sizeFactor);   //izquierda
        gc.strokeLine(mx + 35*sizeFactor,aux + 25*sizeFactor,mx + 35*sizeFactor,aux + 75*sizeFactor);   //derecha
        gc.strokeLine(mx + 10*sizeFactor,aux + 50*sizeFactor,mx + 35*sizeFactor,aux + 50*sizeFactor);   //horizontal media
        mx = mx + 35*sizeFactor;
    }  
       
    public void dibuja_nueve(GraphicsContext gc, double aux, Color myColorNumbers, double sizeFactor){
        gc.setStroke(myColorNumbers);
        gc.strokeLine(mx + 10*sizeFactor,aux + 25*sizeFactor,mx + 35*sizeFactor,aux + 25*sizeFactor);   //arriba
        gc.strokeLine(mx + 10*sizeFactor,aux + 75*sizeFactor,mx + 35*sizeFactor,aux + 75*sizeFactor);   //abajo
        gc.strokeLine(mx + 10*sizeFactor,aux + 25*sizeFactor,mx + 10*sizeFactor,aux + 50*sizeFactor);   //izquierda arriba
        gc.strokeLine(mx + 35*sizeFactor,aux + 25*sizeFactor,mx + 35*sizeFactor,aux + 75*sizeFactor);   //derecha
        gc.strokeLine(mx + 10*sizeFactor,aux + 50*sizeFactor,mx + 35*sizeFactor,aux + 50*sizeFactor);   //horizontal media
        mx = mx + 35*sizeFactor;
    }  
       
    public void dibuja_cero(GraphicsContext gc, double aux, Color myColorNumbers, double sizeFactor){
        gc.setStroke(myColorNumbers);
        gc.strokeLine(mx + 10*sizeFactor,25*sizeFactor,mx + 35*sizeFactor,25*sizeFactor);   //arriba
        gc.strokeLine(mx + 10*sizeFactor,75*sizeFactor,mx + 35*sizeFactor,75*sizeFactor);   //abajo
        gc.strokeLine(mx + 10*sizeFactor,25*sizeFactor,mx + 10*sizeFactor,75*sizeFactor);   //izquierda
        gc.strokeLine(mx + 35*sizeFactor,25*sizeFactor,mx + 35*sizeFactor,75*sizeFactor);   //derecha
        mx = mx + 35*sizeFactor;
    }  
       
    public void dibuja_mas(GraphicsContext gc, Color myColorOperators, double sizeFactor){
        gc.setStroke(myColorOperators);
        gc.strokeLine(mx + 22.5*sizeFactor,37.5*sizeFactor,mx +22.5*sizeFactor,62.5*sizeFactor);        //Altura maxima = 25, Altura Minima, 75
        gc.strokeLine(mx + 10*sizeFactor,50*sizeFactor,mx + 35*sizeFactor,50*sizeFactor);        //Ancho maximo = 30, parte desde x = 10
        mx = mx + 35*sizeFactor;
    } 
       
    public void dibuja_menos(GraphicsContext gc, Color myColorOperators, double sizeFactor){
        gc.setStroke(myColorOperators);   
        gc.strokeLine(mx + 10*sizeFactor,50*sizeFactor,mx + 35*sizeFactor,50*sizeFactor);
        mx = mx + 35*sizeFactor;
    } 
        
    public void dibuja_x(GraphicsContext gc, Color myColorOperators, double sizeFactor){
        gc.setStroke(myColorOperators);
        gc.strokeLine(mx + 20*sizeFactor,35*sizeFactor,mx + 32.5*sizeFactor,65*sizeFactor); 
        gc.strokeLine(mx + 20*sizeFactor,65*sizeFactor,mx + 32.5*sizeFactor,35*sizeFactor);
        mx = mx + 35*sizeFactor;
    }
        
    public void dibuja_parentesisI(GraphicsContext gc, Color myColorOperators, double sizeFactor){
        gc.setStroke(myColorOperators); 
        gc.strokeArc(mx + 20*sizeFactor,25*sizeFactor,10*sizeFactor,50*sizeFactor,90,180,ArcType.OPEN); 
        mx = mx + 25*sizeFactor;
    }
        
    public void dibuja_parentesisD(GraphicsContext gc, Color myColorOperators, double sizeFactor){
        gc.setStroke(myColorOperators);   
        gc.strokeArc(mx + 10*sizeFactor,25*sizeFactor,10*sizeFactor,50*sizeFactor,90,-180,ArcType.OPEN); 
        mx = mx + 25*sizeFactor;
    }

    public void dibuja_dividir1(GraphicsContext gc, Color myColorOperators, double sizeFactor){
        gc.setStroke(myColorOperators);  
        gc.strokeLine(mx - 30*sizeFactor,80*sizeFactor,mx + 10*sizeFactor,80*sizeFactor);
        mx = mx - 25*sizeFactor;
    }
        
    public void dibuja_dividir(GraphicsContext gc, Color myColorOperators, double sizeFactor){
        gc.setStroke(myColorOperators);
        gc.strokeLine(mx - 30*sizeFactor,80*sizeFactor,mx + 10*sizeFactor,80*sizeFactor);
        mx = mx - 35*sizeFactor;
    }
        
    public void limpiar(){
        mx = 0;
    }
     
}