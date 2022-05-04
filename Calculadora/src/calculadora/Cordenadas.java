package calculadora;

import static calculadora.FXMLDocumentController.gc;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

/**
 *
 * @author krox2
 */
public class Cordenadas {
   
        
        int Amx = 0;
    
       
    public void puntos(String numero){
            gc.setLineWidth(4);
            gc.setStroke(Color.BLUEVIOLET);
            if(numero == "0"){
               gc.strokeLine(Amx +10,25,Amx +10,25);   
               gc.strokeLine(Amx +10,75,Amx +10,75);   
               gc.strokeLine(Amx +35,75,Amx +35,75);   
               gc.strokeLine(Amx +35,25,Amx +35,25);
              
               Amx = Amx + 35;
            }   
           if(numero == "1"){
               gc.strokeLine(Amx + 20,25,Amx + 20,25);
               gc.strokeLine(Amx + 10,35,Amx + 10,35);
               gc.strokeLine(Amx + 20,75,Amx + 20,75);
               Amx = Amx + 35;
           }
           if(numero == "2"){
               gc.strokeLine(Amx +10,25,Amx +10,25);
               gc.strokeLine(Amx +35,25,Amx +35,25);
               gc.strokeLine(Amx +10,50,Amx +10,50); //horizontal media
               gc.strokeLine(Amx +10,75,Amx +10,75);
               gc.strokeLine(Amx +35,75,Amx +35,75);             
               gc.strokeLine(Amx +35,50,Amx +35,50);
               Amx = Amx + 35;
           }
           if(numero == "3"){
               gc.strokeLine(Amx +10,25,Amx +10,25);
               gc.strokeLine(Amx +35,25,Amx +35,25);
               gc.strokeLine(Amx +10,50,Amx +10,50);
               gc.strokeLine(Amx +35,75,Amx +35,75);
               gc.strokeLine(Amx +35,25,Amx +35,25);
               gc.strokeLine(Amx +35,50,Amx +35,50);  
               gc.strokeLine(Amx +10,75,Amx +10,75);
               Amx = Amx + 35;
           }
           if(numero == "4"){
               gc.strokeLine(Amx +35,25,Amx +35,25);
               gc.strokeLine(Amx +10,50,Amx +10,50);
               gc.strokeLine(Amx +10,25,Amx +10,25);
               gc.strokeLine(Amx +35,75,Amx +35,75);
               gc.strokeLine(Amx +35,50,Amx +35,50);
               
               Amx = Amx + 35;
           }
           if(numero == "5"){
               gc.strokeLine(Amx +10,25,Amx +10,25);
               gc.strokeLine(Amx +35,50,Amx +35,50);
               gc.strokeLine(Amx +10,50,Amx +10,50);
               gc.strokeLine(Amx +10,50,Amx +10,50);
               gc.strokeLine(Amx +10,75,Amx +10,75);
               gc.strokeLine(Amx +35,25,Amx +35,25);
               gc.strokeLine(Amx +35,75,Amx +35,75);
               Amx = Amx + 35;
           }
           if(numero == "6"){
               gc.strokeLine(Amx +10,25,Amx +10,25);  
               gc.strokeLine(Amx +10,75,Amx +10,75);  
               gc.strokeLine(Amx +10,50,Amx +10,50);   
               gc.strokeLine(Amx +35,50,Amx +35,50);   
               gc.strokeLine(Amx +35,75,Amx +35,75);
               gc.strokeLine(Amx +35,25,Amx +35,25);
               Amx = Amx + 35;
           }
           if(numero == "7"){
               gc.strokeLine(Amx +10,25,Amx +10,25);    
               gc.strokeLine(Amx +10,50,Amx +10,50);     
               gc.strokeLine(Amx +35,75,Amx +35,75);
               gc.strokeLine(Amx +35,25,Amx +35,25);
               Amx = Amx + 35;
           }
           
           if(numero == "8"){
               gc.strokeLine(Amx +10,25,Amx +10,25);  
               gc.strokeLine(Amx +10,75,Amx +10,75);  
               gc.strokeLine(Amx +10,50,Amx +10,50);   
               gc.strokeLine(Amx +35,50,Amx +35,50);   
               gc.strokeLine(Amx +35,75,Amx +35,75);
               gc.strokeLine(Amx +35,25,Amx +35,25);
               Amx = Amx + 35;
           }
           if(numero == "9"){
               gc.strokeLine(Amx +10,25,Amx +10,25);  
               gc.strokeLine(Amx +10,75,Amx +10,75);  
               gc.strokeLine(Amx +10,50,Amx +10,50);   
               gc.strokeLine(Amx +35,50,Amx +35,50);   
               gc.strokeLine(Amx +35,75,Amx +35,75);
               gc.strokeLine(Amx +35,25,Amx +35,25);
               Amx = Amx + 35;
           }
           if(numero == "x"){
               gc.strokeLine(Amx +20,35,Amx +20,35);   
               gc.strokeLine(Amx +32.5,65,Amx +32.5,65);   
               gc.strokeLine(Amx +20,65,Amx +20,65);
               gc.strokeLine(Amx +32.5,35,Amx +32.5,35);
               Amx = Amx + 35;
               
           }
           if(numero == "/"){
              gc.strokeLine(Amx +10,80,Amx +10,80);
              gc.strokeLine(Amx -30,80,Amx -30,80);    
           }
           
           if(numero == "+"){
              gc.strokeLine(Amx +22.5,37.5,Amx +22.5,37.5);
              gc.strokeLine(Amx +22.5,62.5,Amx +22.5,62.5); 
              gc.strokeLine(Amx +35,50,Amx +35,50);
              gc.strokeLine(Amx +10,50,Amx +10,50);
              Amx = Amx + 35;
               
               
           }
           if(numero == "-"){
              gc.strokeLine(Amx +35,50,Amx +35,50);
              gc.strokeLine(Amx +10,50,Amx +10,50);
              Amx = Amx + 35;            
               
               
           }
           if(numero == ")"){
              gc.strokeLine(Amx + 15,25,Amx + 15,25);
              gc.strokeLine(Amx + 15,75,Amx + 15,75);
              
              Amx = Amx + 35;            
               
               
           }
           if(numero == "("){
              gc.strokeLine(Amx + 25,25,Amx + 25,25);
              gc.strokeLine(Amx + 25,75,Amx + 25,75);
              
              Amx = Amx + 35;            
               
               
           }
        gc.setLineWidth(1);
        gc.setStroke(Color.BLACK);
    
    }
    
    public void limpiar(){
         Amx = 0;
         
    }
    //si
}