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
<<<<<<< .merge_file_a13612
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
        gc.setLineWidth(1);
        gc.setStroke(Color.BLACK);
    }
=======
   
        
        int Amx = 0;
    
       
    public void puntos(String numero){
            gc.setLineWidth(3);
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
               Amx = Amx + 25;
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
           if(numero == "sin"){
              punto_s(gc);
              punto_i(gc);
              punto_con(gc);
              
              Amx = Amx + 35;                
               
           }
           if(numero == "cos"){
              punto_con(gc);
              punto_con(gc);
              punto_s(gc);
              
              Amx = Amx + 35;                
               
           }
           if(numero == "tan"){
              punto_t(gc);
              punto_s(gc);
              punto_con(gc);
              
              Amx = Amx + 35;                
               
           }
           if(numero == "!"){
              gc.strokeLine(Amx + 20,60 ,Amx + 20,60 );
              gc.strokeLine(Amx + 20,25 ,Amx + 20,25 );
              gc.strokeLine(Amx + 20,70 ,Amx + 20,70 );
              
              Amx = Amx + 35;                
               
           }
        gc.setLineWidth(1);
        gc.setStroke(Color.BLACK);
    
    }
    
    public void punto_s(GraphicsContext gc){
       
            gc.strokeLine(Amx + 20,70,Amx +25,70);//abajo s
            gc.strokeLine(Amx + 25,70,Amx +25,70);
            
            gc.strokeLine(Amx + 25,65,Amx +25,65);//abajo derecha s
            
            gc.strokeLine(Amx + 20,65,Amx +20,65);//medio s
            
            gc.strokeLine(Amx + 20,60,Amx +20,60);//arriba izquierda s
            gc.strokeLine(Amx + 20,65,Amx +25,65);
            gc.strokeLine(Amx + 25,60,Amx +25,60);//arriba s
            
            Amx= Amx + 10;
   }
   
  
   
   public void punto_i(GraphicsContext gc){//listo
       gc.strokeLine(Amx + 22.5,65,Amx +22.5,65);
       gc.strokeLine(Amx + 22.5,70,Amx +22.5,70);
       gc.strokeLine(Amx + 22.5,60,Amx +22.5,60);
       Amx= Amx + 10;
   }
   
  
   
   public void punto_con(GraphicsContext gc){
       gc.strokeLine(Amx + 25,70,Amx +25,70);//abajo o
       gc.strokeLine(Amx + 20,70,Amx +20,70);//abajo o
       gc.strokeLine(Amx + 20,60,Amx +20,60);//izquierda o
       gc.strokeLine(Amx + 25,60,Amx +25,60);//arriba o
       Amx= Amx+ 10;
   }
   public void punto_a(GraphicsContext gc){
       
            gc.strokeLine(Amx + 20,65,Amx +20,65);//abajo o
            gc.strokeLine(Amx + 20,65,Amx +20,65);//abajo o
            
            gc.strokeLine(Amx + 25,65,Amx +25,65);//abajo o
            gc.strokeLine(Amx + 20,65,Amx +20,65);//abajo o

            gc.strokeLine(Amx + 20,60,Amx +20,60);//arriba o
            gc.strokeLine(Amx + 25,60,Amx +25,60);
            
            gc.strokeLine(Amx + 25,70,Amx +25,70);//derecha o
           
            
            Amx= Amx + 10;
   }
   public void punto_t(GraphicsContext gc){
       gc.strokeLine(Amx + 22.5,60,Amx +22.5,60);
       gc.strokeLine(Amx + 22.5,70,Amx +22.5,70);
       
       gc.strokeLine(Amx + 20.5,60,Amx +24.5,60);
       Amx= Amx + 10;
   }
    
>>>>>>> .merge_file_a15700
    public void limpiar(){
         Amx = 0;
         
    }
    
}