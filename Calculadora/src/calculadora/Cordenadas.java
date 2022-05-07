package calculadora;

import static calculadora.FXMLDocumentController.gc;
import javafx.scene.paint.Color;

/**
 *
 * @author krox2
 */
public class Cordenadas {  
    double amx = 0;
    public void puntos(String numero){
        gc.setLineWidth(4);
        gc.setStroke(Color.BLUEVIOLET);
        if("0".equals(numero)){
            gc.strokeLine(amx +10,25,amx +10,25);   
            gc.strokeLine(amx +10,75,amx +10,75);   
            gc.strokeLine(amx +35,75,amx +35,75);   
            gc.strokeLine(amx +35,25,amx +35,25);
            amx = amx + 35;
        }   
        if("1".equals(numero)){
            gc.strokeLine(amx + 20,25,amx + 20,25);
            gc.strokeLine(amx + 10,35,amx + 10,35);
            gc.strokeLine(amx + 20,75,amx + 20,75);
            amx = amx + 25;
        }
        if("2".equals(numero)){
            gc.strokeLine(amx +10,25,amx +10,25);
            gc.strokeLine(amx +35,25,amx +35,25);
            gc.strokeLine(amx +10,50,amx +10,50); //horizontal media
            gc.strokeLine(amx +10,75,amx +10,75);
            gc.strokeLine(amx +35,75,amx +35,75);             
            gc.strokeLine(amx +35,50,amx +35,50);
            amx = amx + 35;
        }
        if("3".equals(numero)){
            gc.strokeLine(amx +10,25,amx +10,25);
            gc.strokeLine(amx +35,25,amx +35,25);
            gc.strokeLine(amx +10,50,amx +10,50);
            gc.strokeLine(amx +35,75,amx +35,75);
            gc.strokeLine(amx +35,25,amx +35,25);
            gc.strokeLine(amx +35,50,amx +35,50);  
            gc.strokeLine(amx +10,75,amx +10,75);
            amx = amx + 35;
        }
        if("4".equals(numero)){
            gc.strokeLine(amx +35,25,amx +35,25);
            gc.strokeLine(amx +10,50,amx +10,50);
            gc.strokeLine(amx +10,25,amx +10,25);
            gc.strokeLine(amx +35,75,amx +35,75);
            gc.strokeLine(amx +35,50,amx +35,50);
            
            amx = amx + 35;
        }
        if("5".equals(numero)){
            gc.strokeLine(amx +10,25,amx +10,25);
            gc.strokeLine(amx +35,50,amx +35,50);
            gc.strokeLine(amx +10,50,amx +10,50);
            gc.strokeLine(amx +10,50,amx +10,50);
            gc.strokeLine(amx +10,75,amx +10,75);
            gc.strokeLine(amx +35,25,amx +35,25);
            gc.strokeLine(amx +35,75,amx +35,75);
            amx = amx + 35;
        }
        if("6".equals(numero)){
            gc.strokeLine(amx +10,25,amx +10,25);  
            gc.strokeLine(amx +10,75,amx +10,75);  
            gc.strokeLine(amx +10,50,amx +10,50);   
            gc.strokeLine(amx +35,50,amx +35,50);   
            gc.strokeLine(amx +35,75,amx +35,75);
            gc.strokeLine(amx +35,25,amx +35,25);
            amx = amx + 35;
        }
        if("7".equals(numero)){
            gc.strokeLine(amx +10,25,amx +10,25);    
            gc.strokeLine(amx +10,50,amx +10,50);     
            gc.strokeLine(amx +35,75,amx +35,75);
            gc.strokeLine(amx +35,25,amx +35,25);
            amx = amx + 35;
        }
        
        if("8".equals(numero)){
            gc.strokeLine(amx +10,25,amx +10,25);  
            gc.strokeLine(amx +10,75,amx +10,75);  
            gc.strokeLine(amx +10,50,amx +10,50);   
            gc.strokeLine(amx +35,50,amx +35,50);   
            gc.strokeLine(amx +35,75,amx +35,75);
            gc.strokeLine(amx +35,25,amx +35,25);
            amx = amx + 35;
        }
        if("9".equals(numero)){
            gc.strokeLine(amx +10,25,amx +10,25);  
            gc.strokeLine(amx +10,75,amx +10,75);  
            gc.strokeLine(amx +10,50,amx +10,50);   
            gc.strokeLine(amx +35,50,amx +35,50);   
            gc.strokeLine(amx +35,75,amx +35,75);
            gc.strokeLine(amx +35,25,amx +35,25);
            amx = amx + 35;
        }
        if("x".equals(numero)){
            gc.strokeLine(amx +20,35,amx +20,35);   
            gc.strokeLine(amx +32.5,65,amx +32.5,65);   
            gc.strokeLine(amx +20,65,amx +20,65);
            gc.strokeLine(amx +32.5,35,amx +32.5,35);
            amx = amx + 35;
            
        }
        if("/".equals(numero)){
            gc.strokeLine(amx +10,80,amx +10,80);
            gc.strokeLine(amx -30,80,amx -30,80);    
        }
        
        if("+".equals(numero)){
            gc.strokeLine(amx +22.5,37.5,amx +22.5,37.5);
            gc.strokeLine(amx +22.5,62.5,amx +22.5,62.5); 
            gc.strokeLine(amx +35,50,amx +35,50);
            gc.strokeLine(amx +10,50,amx +10,50);
            amx = amx + 35;
        }

        if("-".equals(numero)){
            gc.strokeLine(amx +35,50,amx +35,50);
            gc.strokeLine(amx +10,50,amx +10,50);
            amx = amx + 35;            
        }

        if(")".equals(numero)){
            gc.strokeLine(amx + 15,25,amx + 15,25);
            gc.strokeLine(amx + 15,75,amx + 15,75);
            amx = amx + 35;            
        }

        if("(".equals(numero)){
            gc.strokeLine(amx + 25,25,amx + 25,25);
            gc.strokeLine(amx + 25,75,amx + 25,75);
            amx = amx + 35;           
        }
        gc.setStroke(Color.BLACK);
    }
    
    public void limpiar(){
        amx = 0;
    }
}