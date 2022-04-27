package calculadora;



import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.ArcType;


/**
 *
 * @author waki
 */
public class Dibuja {

    int mx=0;
    
    
    public void dibuja_uno(GraphicsContext gc){

          gc.strokeLine(mx + 20,25,mx + 20,75);
          gc.strokeLine(mx + 20,25,mx + 10,35);
          mx = mx + 25;
    }
    
    public void dibuja_dos(GraphicsContext gc){

          gc.strokeLine(mx +10,25,mx +35,25);
          gc.strokeLine(mx +35,25,mx +35,50);
          gc.strokeLine(mx +10,50,mx +35,50); //horizontal media
          gc.strokeLine(mx +10,50,mx +10,75);
          gc.strokeLine(mx +10,75,mx +35,75);
          mx = mx + 35;
    }
    
        public void dibuja_tres(GraphicsContext gc){


          gc.strokeLine(mx +10,25,mx +35,25);
          gc.strokeLine(mx +35,25,mx +35,75);
          gc.strokeLine(mx +10,50,mx +35,50);
          gc.strokeLine(mx +10,75,mx +35,75);
          mx = mx + 35;
    }
      
          public void dibuja_cuatro(GraphicsContext gc){


         gc.strokeLine(mx +35,25,mx +35,75);
         gc.strokeLine(mx +10,50,mx +35,50);
         gc.strokeLine(mx +10,25,mx +10,50);
         mx = mx + 35;
    }
          
    public void dibuja_cinco(GraphicsContext gc){


         gc.strokeLine(mx +10,25,mx +35,25);
         gc.strokeLine(mx +35,50,mx +35,75);
         gc.strokeLine(mx +10,50,mx +35,50);
         gc.strokeLine(mx +10,25,mx +10,50);
         gc.strokeLine(mx +10,75,mx +35,75);
         mx = mx + 35;
    }
    
        public void dibuja_seis(GraphicsContext gc){


        gc.strokeLine(mx +10,25,mx +35,25);   //arriba
        gc.strokeLine(mx +10,75,mx +35,75);   //abajo
        gc.strokeLine(mx +10,25,mx +10,75);   //izquierda
        gc.strokeLine(mx +35,50,mx +35,75);   //derecha abajo
        gc.strokeLine(mx +10,50,mx +35,50);
        mx = mx + 35;
    }
        
        public void dibuja_siete(GraphicsContext gc){


       gc.strokeLine(mx +10,25,mx +35,25);   //arriba
       gc.strokeLine(mx +10,25,mx +10,50);   //izquierda arriba
       gc.strokeLine(mx +35,25,mx +35,75);   //derecha
       mx = mx + 35;
    }
        
       public void dibuja_ocho(GraphicsContext gc){


       gc.strokeLine(mx +10,25,mx +35,25);   //arriba
       gc.strokeLine(mx +10,75,mx +35,75);   //abajo
       gc.strokeLine(mx +10,25,mx +10,75);   //izquierda
       gc.strokeLine(mx +35,25,mx +35,75);   //derecha
       gc.strokeLine(mx +10,50,mx +35,50);   //horizontal media
       mx = mx + 35;
    }  
       
       public void dibuja_nueve(GraphicsContext gc){


       gc.strokeLine(mx +10,25,mx +35,25);   //arriba
       gc.strokeLine(mx +10,75,mx +35,75);   //abajo
       gc.strokeLine(mx +10,25,mx +10,50);   //izquierda arriba
       gc.strokeLine(mx +35,25,mx +35,75);   //derecha
       gc.strokeLine(mx +10,50,mx +35,50);   //horizontal media
       mx = mx + 35;
    }  
       
       public void dibuja_cero(GraphicsContext gc){


       gc.strokeLine(mx +10,25,mx +35,25);   //arriba
       gc.strokeLine(mx +10,75,mx +35,75);   //abajo
       gc.strokeLine(mx +10,25,mx +10,75);   //izquierda
       gc.strokeLine(mx +35,25,mx +35,75);   //derecha
       mx = mx + 35;
    }  
       
       public void dibuja_mas(GraphicsContext gc){


       gc.strokeLine(mx + 22.5,37.5,mx +22.5,62.5);        //Altura maxima = 25, Altura Minima, 75
       gc.strokeLine(mx +10,50,mx +35,50);        //Ancho maximo = 30, parte desde x = 10
       mx = mx + 35;
    } 
       
        public void dibuja_menos(GraphicsContext gc){

            
       gc.strokeLine(mx +10,50,mx +35,50);
       mx = mx + 35;
    } 
        
        public void dibuja_x(GraphicsContext gc){

            
       gc.strokeLine(mx +20,35,mx + 32.5,65); 
       gc.strokeLine(mx +20,65,mx + 32.5,35);
       mx = mx + 35;
    }
        
        public void dibuja_parentesisI(GraphicsContext gc){

            
        gc.strokeArc(mx +20,25,10,50,90,180,ArcType.OPEN); 
        mx = mx + 25;
    }
        
        public void dibuja_parentesisD(GraphicsContext gc){

            
        gc.strokeArc(mx +10,25,10,50,90,-180,ArcType.OPEN); 
        mx = mx + 25;
    }
        public void dibuja_dividir(GraphicsContext gc){

            
         gc.strokeLine(mx -30,80,mx + 10,80);
         mx = mx + 25;
    }
     
}
