package calculadora;

import static calculadora.FXMLDocumentController.gc;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *
 * @author krox2
 */
public class Cordenadas {
    double amx = 0;
    
    public void puntos(String numero, double sizeFactor){
        gc.setLineWidth(4);
        gc.setStroke(Color.BLUEVIOLET);
        if("0".equals(numero)){
            gc.strokeLine(amx + 10*sizeFactor,25*sizeFactor,amx + 10*sizeFactor,25*sizeFactor);   
            gc.strokeLine(amx + 10*sizeFactor,75*sizeFactor,amx + 10*sizeFactor,75*sizeFactor);   
            gc.strokeLine(amx + 35*sizeFactor,75*sizeFactor,amx + 35*sizeFactor,75*sizeFactor);   
            gc.strokeLine(amx + 35*sizeFactor,25*sizeFactor,amx + 35*sizeFactor,25*sizeFactor);
            amx = amx + 35*sizeFactor;
        }   
        if("1".equals(numero)){
            gc.strokeLine(amx + 20*sizeFactor,25*sizeFactor,amx + 20*sizeFactor,25*sizeFactor);
            gc.strokeLine(amx + 10*sizeFactor,35*sizeFactor,amx + 10*sizeFactor,35*sizeFactor);
            gc.strokeLine(amx + 20*sizeFactor,75*sizeFactor,amx + 20*sizeFactor,75*sizeFactor);
            amx = amx + 25*sizeFactor;
        }
        if("2".equals(numero)){
            gc.strokeLine(amx + 10*sizeFactor,25*sizeFactor,amx + 10*sizeFactor,25*sizeFactor);
            gc.strokeLine(amx + 35*sizeFactor,25*sizeFactor,amx + 35*sizeFactor,25*sizeFactor);
            gc.strokeLine(amx + 10*sizeFactor,50*sizeFactor,amx + 10*sizeFactor,50*sizeFactor); //horizontal media
            gc.strokeLine(amx + 10*sizeFactor,75*sizeFactor,amx + 10*sizeFactor,75*sizeFactor);
            gc.strokeLine(amx + 35*sizeFactor,75*sizeFactor,amx + 35*sizeFactor,75*sizeFactor);             
            gc.strokeLine(amx + 35*sizeFactor,50*sizeFactor,amx + 35*sizeFactor,50*sizeFactor);
            amx = amx + 35*sizeFactor;
        }
        if("3".equals(numero)){
            gc.strokeLine(amx + 10*sizeFactor,25*sizeFactor,amx + 10*sizeFactor,25*sizeFactor);
            gc.strokeLine(amx + 35*sizeFactor,25*sizeFactor,amx + 35*sizeFactor,25*sizeFactor);
            gc.strokeLine(amx + 10*sizeFactor,50*sizeFactor,amx + 10*sizeFactor,50*sizeFactor);
            gc.strokeLine(amx + 35*sizeFactor,75*sizeFactor,amx + 35*sizeFactor,75*sizeFactor);
            gc.strokeLine(amx + 35*sizeFactor,25*sizeFactor,amx + 35*sizeFactor,25*sizeFactor);
            gc.strokeLine(amx + 35*sizeFactor,50*sizeFactor,amx + 35*sizeFactor,50*sizeFactor);  
            gc.strokeLine(amx + 10*sizeFactor,75*sizeFactor,amx + 10*sizeFactor,75*sizeFactor);
            amx = amx + 35*sizeFactor;
        }
        if("4".equals(numero)){
            gc.strokeLine(amx + 35*sizeFactor,25*sizeFactor,amx + 35*sizeFactor,25*sizeFactor);
            gc.strokeLine(amx + 10*sizeFactor,50*sizeFactor,amx + 10*sizeFactor,50*sizeFactor);
            gc.strokeLine(amx + 10*sizeFactor,25*sizeFactor,amx + 10*sizeFactor,25*sizeFactor);
            gc.strokeLine(amx + 35*sizeFactor,75*sizeFactor,amx + 35*sizeFactor,75*sizeFactor);
            gc.strokeLine(amx + 35*sizeFactor,50*sizeFactor,amx + 35*sizeFactor,50*sizeFactor);
            amx = amx + 35*sizeFactor;
        }
        if("5".equals(numero)){
            gc.strokeLine(amx + 10*sizeFactor,25*sizeFactor,amx + 10*sizeFactor,25*sizeFactor);
            gc.strokeLine(amx + 35*sizeFactor,50*sizeFactor,amx + 35*sizeFactor,50*sizeFactor);
            gc.strokeLine(amx + 10*sizeFactor,50*sizeFactor,amx + 10*sizeFactor,50*sizeFactor);
            gc.strokeLine(amx + 10*sizeFactor,50*sizeFactor,amx + 10*sizeFactor,50*sizeFactor);
            gc.strokeLine(amx + 10*sizeFactor,75*sizeFactor,amx + 10*sizeFactor,75*sizeFactor);
            gc.strokeLine(amx + 35*sizeFactor,25*sizeFactor,amx + 35*sizeFactor,25*sizeFactor);
            gc.strokeLine(amx + 35*sizeFactor,75*sizeFactor,amx + 35*sizeFactor,75*sizeFactor);
            amx = amx + 35*sizeFactor;
        }
        if("6".equals(numero)){
            gc.strokeLine(amx + 10*sizeFactor,25*sizeFactor,amx + 10*sizeFactor,25*sizeFactor);  
            gc.strokeLine(amx + 10*sizeFactor,75*sizeFactor,amx + 10*sizeFactor,75*sizeFactor);  
            gc.strokeLine(amx + 10*sizeFactor,50*sizeFactor,amx + 10*sizeFactor,50*sizeFactor);   
            gc.strokeLine(amx + 35*sizeFactor,50*sizeFactor,amx + 35*sizeFactor,50*sizeFactor);   
            gc.strokeLine(amx + 35*sizeFactor,75*sizeFactor,amx + 35*sizeFactor,75*sizeFactor);
            gc.strokeLine(amx + 35*sizeFactor,25*sizeFactor,amx + 35*sizeFactor,25*sizeFactor);
            amx = amx + 35*sizeFactor;
        }
        if("7".equals(numero)){
            gc.strokeLine(amx + 10*sizeFactor,25*sizeFactor,amx + 10*sizeFactor,25*sizeFactor);    
            gc.strokeLine(amx + 10*sizeFactor,50*sizeFactor,amx + 10*sizeFactor,50*sizeFactor);     
            gc.strokeLine(amx + 35*sizeFactor,75*sizeFactor,amx + 35*sizeFactor,75*sizeFactor);
            gc.strokeLine(amx + 35*sizeFactor,25*sizeFactor,amx + 35*sizeFactor,25*sizeFactor);
            amx = amx + 35*sizeFactor;
        }
        
        if("8".equals(numero)){
            gc.strokeLine(amx + 10*sizeFactor,25*sizeFactor,amx + 10*sizeFactor,25*sizeFactor);  
            gc.strokeLine(amx + 10*sizeFactor,75*sizeFactor,amx + 10*sizeFactor,75*sizeFactor);  
            gc.strokeLine(amx + 10*sizeFactor,50*sizeFactor,amx + 10*sizeFactor,50*sizeFactor);   
            gc.strokeLine(amx + 35*sizeFactor,50*sizeFactor,amx + 35*sizeFactor,50*sizeFactor);   
            gc.strokeLine(amx + 35*sizeFactor,75*sizeFactor,amx + 35*sizeFactor,75*sizeFactor);
            gc.strokeLine(amx + 35*sizeFactor,25*sizeFactor,amx + 35*sizeFactor,25*sizeFactor);
            amx = amx + 35*sizeFactor;
        }
        if("9".equals(numero)){
            gc.strokeLine(amx + 10*sizeFactor,25*sizeFactor,amx + 10*sizeFactor,25*sizeFactor);  
            gc.strokeLine(amx + 10*sizeFactor,75*sizeFactor,amx + 10*sizeFactor,75*sizeFactor);  
            gc.strokeLine(amx + 10*sizeFactor,50*sizeFactor,amx + 10*sizeFactor,50*sizeFactor);   
            gc.strokeLine(amx + 35*sizeFactor,50*sizeFactor,amx + 35*sizeFactor,50*sizeFactor);   
            gc.strokeLine(amx + 35*sizeFactor,75*sizeFactor,amx + 35*sizeFactor,75*sizeFactor);
            gc.strokeLine(amx + 35*sizeFactor,25*sizeFactor,amx + 35*sizeFactor,25*sizeFactor);
            amx = amx + 35*sizeFactor;
        }
        if("x".equals(numero)){
            gc.strokeLine(amx + 20*sizeFactor,35*sizeFactor,amx + 20*sizeFactor,35*sizeFactor);   
            gc.strokeLine(amx + 32.5*sizeFactor,65*sizeFactor,amx + 32.5*sizeFactor,65*sizeFactor);   
            gc.strokeLine(amx + 20*sizeFactor,65*sizeFactor,amx + 20*sizeFactor,65*sizeFactor);
            gc.strokeLine(amx + 32.5*sizeFactor,35*sizeFactor,amx + 32.5*sizeFactor,35*sizeFactor);
            amx = amx + 35*sizeFactor;
        }
        if("/".equals(numero)){
            gc.strokeLine(amx + 10*sizeFactor,80*sizeFactor,amx + 10*sizeFactor,80*sizeFactor);
            gc.strokeLine(amx - 30*sizeFactor,80*sizeFactor,amx - 30*sizeFactor,80*sizeFactor);    
        }
        if("+".equals(numero)){
            gc.strokeLine(amx + 22.5*sizeFactor,37.5*sizeFactor,amx + 22.5*sizeFactor,37.5*sizeFactor);
            gc.strokeLine(amx + 22.5*sizeFactor,62.5*sizeFactor,amx + 22.5*sizeFactor,62.5*sizeFactor); 
            gc.strokeLine(amx + 35*sizeFactor,50*sizeFactor,amx + 35*sizeFactor,50*sizeFactor);
            gc.strokeLine(amx + 10*sizeFactor,50*sizeFactor,amx + 10*sizeFactor,50*sizeFactor);
            amx = amx + 35*sizeFactor;
        }
        if("-".equals(numero)){
            gc.strokeLine(amx + 35*sizeFactor,50*sizeFactor,amx + 35*sizeFactor,50*sizeFactor);
            gc.strokeLine(amx + 10*sizeFactor,50*sizeFactor,amx + 10*sizeFactor,50*sizeFactor);
            amx = amx + 35*sizeFactor;       
        }
        if(")".equals(numero)){
            gc.strokeLine(amx + 15*sizeFactor,25*sizeFactor,amx + 15*sizeFactor,25*sizeFactor);
            gc.strokeLine(amx + 15*sizeFactor,75*sizeFactor,amx + 15*sizeFactor,75*sizeFactor);
            amx = amx + 25*sizeFactor;       
        }
        if("(".equals(numero)){
            gc.strokeLine(amx + 25*sizeFactor,25*sizeFactor,amx + 25*sizeFactor,25*sizeFactor);
            gc.strokeLine(amx + 25*sizeFactor,75*sizeFactor,amx + 25*sizeFactor,75*sizeFactor);
            amx = amx + 25*sizeFactor;
        }
        if("sin".equals(numero)){
            punto_s(gc, sizeFactor);
            punto_i(gc, sizeFactor);
            punto_con(gc, sizeFactor);
            amx = amx + 35*sizeFactor;                
             
        }
         if("cos".equals(numero)){
            punto_con(gc, sizeFactor);
            punto_con(gc, sizeFactor);
            punto_s(gc, sizeFactor);
            amx = amx + 35*sizeFactor;                
             
         }
         if("tan".equals(numero)){
            punto_t(gc, sizeFactor);
            punto_s(gc, sizeFactor);
            punto_con(gc, sizeFactor);
            amx = amx + 35*sizeFactor;              
         }
         if("!".equals(numero)){
            gc.strokeLine(amx + 20*sizeFactor, 60*sizeFactor, amx + 20*sizeFactor, 60*sizeFactor);
            gc.strokeLine(amx + 20*sizeFactor, 25*sizeFactor, amx + 20*sizeFactor, 25*sizeFactor);
            gc.strokeLine(amx + 20*sizeFactor, 70*sizeFactor, amx + 20*sizeFactor, 70*sizeFactor);
            amx = amx + 35*sizeFactor;                
             
         }
        gc.setLineWidth(1);
        gc.setStroke(Color.BLACK);
    }

    public void punto_s(GraphicsContext gc, double sizeFactor){
        gc.strokeLine(amx + 20*sizeFactor, 70*sizeFactor, amx + 25*sizeFactor, 70*sizeFactor);//abajo s
        gc.strokeLine(amx + 25*sizeFactor, 70*sizeFactor, amx + 25*sizeFactor, 70*sizeFactor); 
        gc.strokeLine(amx + 25*sizeFactor, 65*sizeFactor, amx + 25*sizeFactor, 65*sizeFactor);//abajo derecha s
        gc.strokeLine(amx + 20*sizeFactor, 65*sizeFactor, amx + 20*sizeFactor, 65*sizeFactor);//medio s 
        gc.strokeLine(amx + 20*sizeFactor, 60*sizeFactor, amx + 20*sizeFactor, 60*sizeFactor);//arriba izquierda s
        gc.strokeLine(amx + 20*sizeFactor, 65*sizeFactor, amx + 25*sizeFactor, 65*sizeFactor);
        gc.strokeLine(amx + 25*sizeFactor, 60*sizeFactor, amx + 25*sizeFactor, 60*sizeFactor);//arriba s 
        amx= amx + 10*sizeFactor;
    }

    public void punto_i(GraphicsContext gc, double sizeFactor){//listo
        gc.strokeLine(amx + 22.5*sizeFactor, 65*sizeFactor, amx + 22.5*sizeFactor, 65*sizeFactor);
        gc.strokeLine(amx + 22.5*sizeFactor, 70*sizeFactor, amx + 22.5*sizeFactor, 70*sizeFactor);
        gc.strokeLine(amx + 22.5*sizeFactor, 60*sizeFactor, amx + 22.5*sizeFactor, 60*sizeFactor);
        amx= amx + 10*sizeFactor;
    }

    public void punto_con(GraphicsContext gc, double sizeFactor){
        gc.strokeLine(amx + 25*sizeFactor, 70*sizeFactor, amx + 25*sizeFactor, 70*sizeFactor);//abajo o
        gc.strokeLine(amx + 20*sizeFactor, 70*sizeFactor, amx + 20*sizeFactor, 70*sizeFactor);//abajo o
        gc.strokeLine(amx + 20*sizeFactor, 60*sizeFactor, amx + 20*sizeFactor, 60*sizeFactor);//izquierda o
        gc.strokeLine(amx + 25*sizeFactor, 60*sizeFactor, amx + 25*sizeFactor, 60*sizeFactor);//arriba o
        amx = amx + 10*sizeFactor;
    }
    public void punto_a(GraphicsContext gc, double sizeFactor){
        gc.strokeLine(amx + 20*sizeFactor, 65*sizeFactor, amx + 20*sizeFactor, 65*sizeFactor);//abajo o
        gc.strokeLine(amx + 20*sizeFactor, 65*sizeFactor, amx + 20*sizeFactor, 65*sizeFactor);//abajo o 
        gc.strokeLine(amx + 25*sizeFactor, 65*sizeFactor, amx + 25*sizeFactor, 65*sizeFactor);//abajo o
        gc.strokeLine(amx + 20*sizeFactor, 65*sizeFactor, amx + 20*sizeFactor, 65*sizeFactor);//abajo o
        gc.strokeLine(amx + 20*sizeFactor, 60*sizeFactor, amx + 20*sizeFactor, 60*sizeFactor);//arriba o
        gc.strokeLine(amx + 25*sizeFactor, 60*sizeFactor, amx + 25*sizeFactor, 60*sizeFactor); 
        gc.strokeLine(amx + 25*sizeFactor, 70*sizeFactor, amx + 25*sizeFactor, 70*sizeFactor);//derecha o     
        amx= amx + 10*sizeFactor;
    }

    public void punto_t(GraphicsContext gc, double sizeFactor){
        gc.strokeLine(amx + 22.5*sizeFactor, 60*sizeFactor, amx + 22.5*sizeFactor, 60*sizeFactor);
        gc.strokeLine(amx + 22.5*sizeFactor, 70*sizeFactor, amx + 22.5*sizeFactor, 70*sizeFactor);
        gc.strokeLine(amx + 20.5*sizeFactor, 60*sizeFactor, amx + 24.5*sizeFactor, 60*sizeFactor);
        amx= amx + 10*sizeFactor;
    }

    public void limpiar(){
        amx = 0;
    }
}