package calculadora;



import java.util.ArrayList;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;


/**
 *
 * @author waki
 */
public class Dibuja {
    static double mx = 0;

    public Dibuja() {
      //empty
    }

    public static void limpiaMx(){
        mx = 0;
    }

    public static void dibuja_uno(GraphicsContext gc, ArrayList<String> operacion, Color myColorNumbers, double sizeFactor){
        gc.setStroke(myColorNumbers);
        if(operacion.isEmpty()){  
            gc.strokeLine(mx + 20*sizeFactor,  25*sizeFactor,mx + 20*sizeFactor, 75*sizeFactor);
            gc.strokeLine(mx + 20*sizeFactor,  25*sizeFactor,mx + 10*sizeFactor, 35*sizeFactor);
            mx = mx + 25*sizeFactor;
        }else if("^".equals(operacion.get(operacion.size()-1))){
            gc.strokeLine(mx +20*sizeFactor,10*sizeFactor,mx +20*sizeFactor,30*sizeFactor);
            gc.strokeLine(mx +20*sizeFactor,10*sizeFactor,mx +15*sizeFactor,15*sizeFactor);
            mx = mx + 15*sizeFactor;
        }else if(!"/".equals(operacion.get(operacion.size()-1))){  
            gc.strokeLine(mx + 20*sizeFactor,  25*sizeFactor,mx + 20*sizeFactor, 75*sizeFactor);
            gc.strokeLine(mx + 20*sizeFactor,  25*sizeFactor,mx + 10*sizeFactor, 35*sizeFactor);
            mx = mx + 25*sizeFactor;
        }else if("/".equals(operacion.get(operacion.size()-1))){
            gc.strokeLine(mx + 20*sizeFactor,85*sizeFactor,mx + 20*sizeFactor,135*sizeFactor);
            gc.strokeLine(mx + 20*sizeFactor,85*sizeFactor,mx + 10*sizeFactor,95*sizeFactor);
            mx = mx + 25*sizeFactor;
        }
    }
    
    public static void dibuja_dos(GraphicsContext gc ,ArrayList<String> operacion, Color myColorNumbers, double sizeFactor){
        gc.setStroke(myColorNumbers);
        if(operacion.isEmpty()){ 
            gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);
            gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,50*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor); //horizontal media
            gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +10*sizeFactor,75*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor,75*sizeFactor);
            mx = mx + 35*sizeFactor;
        }else if("^".equals(operacion.get(operacion.size()-1))){
            gc.strokeLine(mx +10*sizeFactor,10*sizeFactor,mx +20*sizeFactor,10*sizeFactor);
            gc.strokeLine(mx +20*sizeFactor,10*sizeFactor,mx +20*sizeFactor,20*sizeFactor);
            gc.strokeLine(mx +20*sizeFactor,20*sizeFactor,mx +10*sizeFactor,20*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,20*sizeFactor,mx +10*sizeFactor,30*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,30*sizeFactor,mx +20*sizeFactor,30*sizeFactor);
            mx = mx + 15*sizeFactor;
        }else if(!"/".equals(operacion.get(operacion.size()-1))){ 
            gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);
            gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,50*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor); //horizontal media
            gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +10*sizeFactor,75*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor,75*sizeFactor);
            mx = mx + 35*sizeFactor;
        }else if("/".equals(operacion.get(operacion.size()-1))){
            gc.strokeLine(mx +10*sizeFactor,85*sizeFactor,mx +35*sizeFactor,85*sizeFactor);
            gc.strokeLine(mx +35*sizeFactor,85*sizeFactor,mx +35*sizeFactor,110*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,110*sizeFactor,mx +35*sizeFactor,110*sizeFactor); //horizontal media
            gc.strokeLine(mx +10*sizeFactor,110*sizeFactor,mx +10*sizeFactor,135*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,135*sizeFactor,mx +35*sizeFactor,135*sizeFactor);
            mx = mx + 35*sizeFactor;
        }
    }
    
    public static void dibuja_tres(GraphicsContext gc, ArrayList<String> operacion, Color myColorNumbers, double sizeFactor){
        gc.setStroke(myColorNumbers);
        if(operacion.isEmpty()){
            gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);
            gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,75*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor,75*sizeFactor);
            mx = mx + 35*sizeFactor;
        }else if("^".equals(operacion.get(operacion.size()-1))){
            gc.strokeLine(mx +10*sizeFactor,10*sizeFactor,mx +20*sizeFactor,10*sizeFactor);
            gc.strokeLine(mx +20*sizeFactor,10*sizeFactor,mx +20*sizeFactor,20*sizeFactor);
            gc.strokeLine(mx +20*sizeFactor,20*sizeFactor,mx +10*sizeFactor,20*sizeFactor);
            gc.strokeLine(mx +20*sizeFactor,20*sizeFactor,mx +20*sizeFactor,30*sizeFactor);
            gc.strokeLine(mx +20*sizeFactor,30*sizeFactor,mx +10*sizeFactor,30*sizeFactor);
            mx = mx + 15*sizeFactor;
        }else if(!"/".equals(operacion.get(operacion.size()-1))){
            gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);
            gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,75*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor,75*sizeFactor);
            mx = mx + 35*sizeFactor;
        }else if("/".equals(operacion.get(operacion.size()-1))){
            gc.strokeLine(mx +10*sizeFactor,85*sizeFactor,mx +35*sizeFactor,85*sizeFactor);
            gc.strokeLine(mx +35*sizeFactor,85*sizeFactor,mx +35*sizeFactor,135*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,110*sizeFactor,mx +35*sizeFactor,110*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,135*sizeFactor,mx +35*sizeFactor,135*sizeFactor);
            mx = mx + 35*sizeFactor;
        }
    }
      
    public static void dibuja_cuatro(GraphicsContext gc, ArrayList<String> operacion, Color myColorNumbers, double sizeFactor){
        gc.setStroke(myColorNumbers);
        if(operacion.isEmpty()){
            gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,75*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,50*sizeFactor);
            mx = mx + 35*sizeFactor;
        }else if("^".equals(operacion.get(operacion.size()-1))){
            gc.strokeLine(mx +20*sizeFactor,10*sizeFactor,mx +20*sizeFactor,30*sizeFactor);
            gc.strokeLine(mx +20*sizeFactor,20*sizeFactor,mx +10*sizeFactor,20*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,20*sizeFactor,mx +10*sizeFactor,10*sizeFactor);
            mx = mx + 15;
        }else if(!"/".equals(operacion.get(operacion.size()-1))){
            gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,75*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,50*sizeFactor);
            mx = mx + 35*sizeFactor;
        }else if("/".equals(operacion.get(operacion.size()-1))){
            gc.strokeLine(mx +35*sizeFactor,85*sizeFactor,mx +35*sizeFactor,135*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,110*sizeFactor,mx +35*sizeFactor,110*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,85*sizeFactor,mx +10*sizeFactor,110*sizeFactor);
            mx = mx + 35*sizeFactor;
        }
    }
          
    public static void dibuja_cinco(GraphicsContext gc, ArrayList<String> operacion, Color myColorNumbers, double sizeFactor){
        gc.setStroke(myColorNumbers);
        if(operacion.isEmpty()){
            gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);
            gc.strokeLine(mx +35*sizeFactor,50*sizeFactor,mx +35*sizeFactor,75*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,50*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor,75*sizeFactor);
            mx = mx + 35*sizeFactor;
        }else if("^".equals(operacion.get(operacion.size()-1))){
            gc.strokeLine(mx +10*sizeFactor,30*sizeFactor,mx +20*sizeFactor,30*sizeFactor);
            gc.strokeLine(mx +20*sizeFactor,30*sizeFactor,mx +20*sizeFactor,20*sizeFactor);
            gc.strokeLine(mx +20*sizeFactor,20*sizeFactor,mx +10*sizeFactor,20*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,20*sizeFactor,mx +10*sizeFactor,10*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,10*sizeFactor,mx +20*sizeFactor,10*sizeFactor);
            mx = mx + 15*sizeFactor;
        }else if(!"/".equals(operacion.get(operacion.size()-1))){
            gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);
            gc.strokeLine(mx +35*sizeFactor,50*sizeFactor,mx +35*sizeFactor,75*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,50*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor,75*sizeFactor);
            mx = mx + 35*sizeFactor;
        }else if("/".equals(operacion.get(operacion.size()-1))){
            gc.strokeLine(mx +10*sizeFactor,85*sizeFactor,mx +35*sizeFactor*sizeFactor,85*sizeFactor);
            gc.strokeLine(mx +35*sizeFactor,110*sizeFactor,mx +35*sizeFactor,135*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,110*sizeFactor,mx +35*sizeFactor,110*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,85*sizeFactor,mx +10*sizeFactor,110*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,135*sizeFactor,mx +35*sizeFactor,135*sizeFactor);
            mx = mx + 35*sizeFactor;
        }
    }
    
    public static void dibuja_seis(GraphicsContext gc, ArrayList<String> operacion, Color myColorNumbers, double sizeFactor){
        gc.setStroke(myColorNumbers);
        if(operacion.isEmpty()){
            gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);   //arriba
            gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //abajo
            gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,75*sizeFactor);   //izquierda
            gc.strokeLine(mx +35*sizeFactor,50*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //derecha abajo
            gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);
            mx = mx + 35*sizeFactor;
        }else if("^".equals(operacion.get(operacion.size()-1))){
            gc.strokeLine(mx +10*sizeFactor,30*sizeFactor,mx +20*sizeFactor,30*sizeFactor);
            gc.strokeLine(mx +20*sizeFactor,30*sizeFactor,mx +20*sizeFactor,20*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,30*sizeFactor,mx +10*sizeFactor,20*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,20*sizeFactor,mx +20*sizeFactor,20*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,20*sizeFactor,mx +10*sizeFactor,10*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,10*sizeFactor,mx +20*sizeFactor,10*sizeFactor); 
            mx = mx + 15*sizeFactor;
        }else if(!"/".equals(operacion.get(operacion.size()-1))){
            gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);   //arriba
            gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //abajo
            gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,75*sizeFactor);   //izquierda
            gc.strokeLine(mx +35*sizeFactor,50*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //derecha abajo
            gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);
            mx = mx + 35*sizeFactor;
        }else if("/".equals(operacion.get(operacion.size()-1))){
            gc.strokeLine(mx +10*sizeFactor,85*sizeFactor,mx +35*sizeFactor,85*sizeFactor);   //arriba
            gc.strokeLine(mx +10*sizeFactor,135*sizeFactor,mx +35*sizeFactor,135*sizeFactor);   //abajo
            gc.strokeLine(mx +10*sizeFactor,85*sizeFactor,mx +10*sizeFactor,135*sizeFactor);   //izquierda
            gc.strokeLine(mx +35*sizeFactor,110*sizeFactor,mx +35*sizeFactor,135*sizeFactor);   //derecha abajo
            gc.strokeLine(mx +10*sizeFactor,110*sizeFactor,mx +35*sizeFactor,110*sizeFactor);
            mx = mx + 35*sizeFactor;
        }
    }
        
    public static void dibuja_siete(GraphicsContext gc, ArrayList<String> operacion, Color myColorNumbers, double sizeFactor){
        gc.setStroke(myColorNumbers);
        if(operacion.isEmpty()){
            gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);   //arriba
            gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,50*sizeFactor);   //izquierda arriba
            gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //derecha
            mx = mx + 35*sizeFactor;
        }else if("^".equals(operacion.get(operacion.size()-1))){
            gc.strokeLine(mx +20*sizeFactor,30*sizeFactor,mx +20*sizeFactor,10*sizeFactor);
            gc.strokeLine(mx +20*sizeFactor,10*sizeFactor,mx +10*sizeFactor,10*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,10*sizeFactor,mx +10*sizeFactor,20*sizeFactor);
            mx = mx + 15*sizeFactor;
        }else if(!"/".equals(operacion.get(operacion.size()-1))){
            gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);   //arriba
            gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,50*sizeFactor);   //izquierda arriba
            gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //derecha
            mx = mx + 35*sizeFactor;
        }else if("/".equals(operacion.get(operacion.size()-1))){
            gc.strokeLine(mx +10*sizeFactor,85*sizeFactor,mx +35*sizeFactor,85*sizeFactor);   //arriba
            gc.strokeLine(mx +10*sizeFactor,85*sizeFactor,mx +10*sizeFactor,110*sizeFactor);   //izquierda arriba
            gc.strokeLine(mx +35*sizeFactor,85*sizeFactor,mx +35*sizeFactor,135*sizeFactor);   //derecha
            mx = mx + 35*sizeFactor;
        }
    }
        
    public static void dibuja_ocho(GraphicsContext gc, ArrayList<String> operacion, Color myColorNumbers, double sizeFactor){
        gc.setStroke(myColorNumbers);
        if(operacion.isEmpty()){
            gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);   //arriba
            gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //abajo
            gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,75*sizeFactor);   //izquierda
            gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //derecha
            gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);   //horizontal media
            mx = mx + 35*sizeFactor;
        }else if("^".equals(operacion.get(operacion.size()-1))){
            gc.strokeLine(mx +20*sizeFactor,30*sizeFactor,mx +20*sizeFactor,10*sizeFactor);
            gc.strokeLine(mx +20*sizeFactor,30*sizeFactor,mx +10*sizeFactor,30*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,10*sizeFactor,mx +20*sizeFactor,10*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,10*sizeFactor,mx +10*sizeFactor,30*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,20*sizeFactor,mx +20*sizeFactor,20*sizeFactor);
            mx = mx + 15*sizeFactor;
        }else if(!"/".equals(operacion.get(operacion.size()-1))){
            gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);   //arriba
            gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //abajo
            gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,75*sizeFactor);   //izquierda
            gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //derecha
            gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);   //horizontal media
            mx = mx + 35*sizeFactor;
        }else if("/".equals(operacion.get(operacion.size()-1))){
            gc.strokeLine(mx +10*sizeFactor,85*sizeFactor,mx +35*sizeFactor,85*sizeFactor);   //arriba
            gc.strokeLine(mx +10*sizeFactor,135*sizeFactor,mx +35*sizeFactor,135*sizeFactor);   //abajo
            gc.strokeLine(mx +10*sizeFactor,85*sizeFactor,mx +10*sizeFactor,135*sizeFactor);   //izquierda
            gc.strokeLine(mx +35*sizeFactor,85*sizeFactor,mx +35*sizeFactor,135*sizeFactor);   //derecha
            gc.strokeLine(mx +10*sizeFactor,110*sizeFactor,mx +35*sizeFactor,110*sizeFactor);   //horizontal media
            mx = mx + 35*sizeFactor;
        }
    }  
       
    public static void dibuja_nueve(GraphicsContext gc, ArrayList<String> operacion, Color myColorNumbers, double sizeFactor){
        gc.setStroke(myColorNumbers);
        if(operacion.isEmpty()){
            gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);   //arriba
            gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //abajo
            gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,50*sizeFactor);   //izquierda arriba
            gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //derecha
            gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);   //horizontal media
            mx = mx + 35*sizeFactor;
        }else if("^".equals(operacion.get(operacion.size()-1))){
            gc.strokeLine(mx +20*sizeFactor,30*sizeFactor,mx +10*sizeFactor,30*sizeFactor);   
            gc.strokeLine(mx +20*sizeFactor,30*sizeFactor,mx +20*sizeFactor,10*sizeFactor);
            gc.strokeLine(mx +20*sizeFactor,10*sizeFactor,mx +10*sizeFactor,10*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,10*sizeFactor,mx +10*sizeFactor,20*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,20*sizeFactor,mx +20*sizeFactor,20*sizeFactor);
            mx = mx + 15*sizeFactor;
        }else if(!"/".equals(operacion.get(operacion.size()-1))){
            gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);   //arriba
            gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //abajo
            gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,50*sizeFactor);   //izquierda arriba
            gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //derecha
            gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);   //horizontal media
            mx = mx + 35*sizeFactor;
        }else if("/".equals(operacion.get(operacion.size()-1))){
            gc.strokeLine(mx +10*sizeFactor,85*sizeFactor,mx +35*sizeFactor,85*sizeFactor);   //arriba
            gc.strokeLine(mx +10*sizeFactor,135*sizeFactor,mx +35*sizeFactor,135*sizeFactor);   //abajo
            gc.strokeLine(mx +10*sizeFactor,85*sizeFactor,mx +10*sizeFactor,110*sizeFactor);   //izquierda arriba
            gc.strokeLine(mx +35*sizeFactor,85*sizeFactor,mx +35*sizeFactor,135*sizeFactor);   //derecha
            gc.strokeLine(mx +10*sizeFactor,110*sizeFactor,mx +35*sizeFactor,110*sizeFactor);   //horizontal media
            mx = mx + 35*sizeFactor;
        }
    }  
       
    public static void dibuja_cero(GraphicsContext gc, ArrayList<String> operacion, Color myColorNumbers, double sizeFactor){
        gc.setStroke(myColorNumbers);
        if(operacion.isEmpty()){
            gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);   //arriba
            gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor*sizeFactor,75*sizeFactor);   //abajo
            gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,75*sizeFactor);   //izquierda
            gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //derecha
            mx = mx + 35*sizeFactor;
        }else if("^".equals(operacion.get(operacion.size()-1))){
            gc.strokeLine(mx +10*sizeFactor,30*sizeFactor,mx +20*sizeFactor,30*sizeFactor);   
            gc.strokeLine(mx +20*sizeFactor,30*sizeFactor,mx +20*sizeFactor,10*sizeFactor);
            gc.strokeLine(mx +20*sizeFactor,10*sizeFactor,mx +10*sizeFactor,10*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,10*sizeFactor,mx +10*sizeFactor,30*sizeFactor);
            mx = mx + 15*sizeFactor;
        }else if(!"/".equals(operacion.get(operacion.size()-1))){
            gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);   //arriba
            gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor*sizeFactor,75*sizeFactor);   //abajo
            gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,75*sizeFactor);   //izquierda
            gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //derecha
            mx = mx + 35*sizeFactor;
        }else if("/".equals(operacion.get(operacion.size()-1))){
            gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);   //arriba
            gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //abajo
            gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,50*sizeFactor);   //izquierda arriba
            gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //derecha
            gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);   //horizontal media
            mx = mx + 35*sizeFactor;
        }
    }  
       
    public static void dibuja_mas(GraphicsContext gc, ArrayList<String> operacion, Color myColorOperators, double sizeFactor){
        gc.setStroke(myColorOperators);
        gc.strokeLine(mx + 22.5*sizeFactor,37.5*sizeFactor,mx +22.5*sizeFactor,62.5*sizeFactor);        //Altura maxima = 25, Altura Minima, 75
        gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);        //Ancho maximo = 30, parte desde x = 10
        mx = mx + 35*sizeFactor;
    } 
       
    public static void dibuja_menos(GraphicsContext gc, ArrayList<String> operacion, Color myColorOperators, double sizeFactor){
        gc.setStroke(myColorOperators);     
        gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);
        mx = mx + 35*sizeFactor;
    } 
        
    public static void dibuja_x(GraphicsContext gc, ArrayList<String> operacion, Color myColorOperators, double sizeFactor){
        gc.setStroke(myColorOperators);    
        gc.strokeLine(mx +20*sizeFactor,35*sizeFactor,mx + 32.5*sizeFactor,65*sizeFactor); 
        gc.strokeLine(mx +20*sizeFactor,65*sizeFactor,mx + 32.5*sizeFactor,35*sizeFactor);
        mx = mx + 35*sizeFactor;
    }
        
    public static void dibuja_parentesisI(GraphicsContext gc, ArrayList<String> operacion, Color myColorOperators, double sizeFactor){
        gc.setStroke(myColorOperators); 
        gc.strokeArc(mx +20*sizeFactor,25*sizeFactor,10*sizeFactor,50*sizeFactor,90,180,ArcType.OPEN); 
        mx = mx + 25*sizeFactor;
    }
        
    public static void dibuja_parentesisD(GraphicsContext gc, ArrayList<String> operacion, Color myColorOperators, double sizeFactor){
        gc.setStroke(myColorOperators);    
        gc.strokeArc(mx +10*sizeFactor,25*sizeFactor,10*sizeFactor,50*sizeFactor,90,-180,ArcType.OPEN); 
        mx = mx + 25*sizeFactor;
    }

    public static void dibuja_dividir1(GraphicsContext gc, Color myColorOperators, double sizeFactor){
        gc.setStroke(myColorOperators);
        gc.strokeLine(mx -30*sizeFactor,80*sizeFactor,mx + 10*sizeFactor,80*sizeFactor);
        mx = mx - 25*sizeFactor;
    }
        
    public static void dibuja_dividir(GraphicsContext gc, ArrayList<String> operacion, Color myColorOperators, double sizeFactor){
        gc.setStroke(myColorOperators);
        gc.strokeLine(mx -30*sizeFactor,80*sizeFactor,mx + 10*sizeFactor,80*sizeFactor);
        mx = mx - 35*sizeFactor;
    }

    public static void dibuja_factorial(GraphicsContext gc, Color myColorOperators, double sizeFactor){
        gc.setStroke(myColorOperators);
        gc.strokeLine(mx + 20*sizeFactor, 25*sizeFactor, mx + 20*sizeFactor, 60*sizeFactor);
        gc.strokeLine(mx + 20*sizeFactor, 70*sizeFactor, mx + 20*sizeFactor, 70*sizeFactor);
        mx = mx + 35*sizeFactor;
    }

    public static void dibuja_s(GraphicsContext gc, double sizeFactor){
        gc.strokeLine(mx + 20*sizeFactor, 70*sizeFactor, mx + 25*sizeFactor, 70*sizeFactor);//abajo s
        gc.strokeLine(mx + 25*sizeFactor, 70*sizeFactor, mx + 25*sizeFactor, 65*sizeFactor);//abajo derecha s
        gc.strokeLine(mx + 20*sizeFactor, 65*sizeFactor, mx + 25*sizeFactor, 65*sizeFactor);//medio s
        gc.strokeLine(mx + 20*sizeFactor, 60*sizeFactor, mx + 20*sizeFactor, 65*sizeFactor);//arriba izquierda s
        gc.strokeLine(mx + 20*sizeFactor, 60*sizeFactor, mx + 25*sizeFactor, 60*sizeFactor);//arriba s
        mx = mx + 10*sizeFactor;
    }

    public static void dibuja_o(GraphicsContext gc, double sizeFactor){
        gc.strokeLine(mx + 20*sizeFactor, 70*sizeFactor, mx + 25*sizeFactor, 70*sizeFactor);//abajo o
        gc.strokeLine(mx + 20*sizeFactor, 70*sizeFactor, mx + 20*sizeFactor, 60*sizeFactor);//izquierda o
        gc.strokeLine(mx + 20*sizeFactor, 60*sizeFactor, mx + 25*sizeFactor, 60*sizeFactor);//arriba o
        gc.strokeLine(mx + 25*sizeFactor, 70*sizeFactor, mx + 25*sizeFactor, 60*sizeFactor);//derecha o
        mx = mx + 10*sizeFactor;
    }

    public static void dibuja_i(GraphicsContext gc, double sizeFactor){
        gc.strokeLine(mx + 22.5*sizeFactor, 70*sizeFactor, mx + 22.5*sizeFactor, 65*sizeFactor);
        gc.strokeLine(mx + 22.5*sizeFactor, 60*sizeFactor, mx + 22.5*sizeFactor, 60*sizeFactor);
        mx = mx + 10*sizeFactor;
    }

    public static void dibuja_n(GraphicsContext gc, double sizeFactor){
        gc.strokeLine(mx + 20*sizeFactor, 70*sizeFactor, mx + 20*sizeFactor, 60*sizeFactor);
        gc.strokeLine(mx + 25*sizeFactor, 70*sizeFactor, mx + 25*sizeFactor, 60*sizeFactor);
        gc.strokeLine(mx + 20*sizeFactor, 60*sizeFactor, mx + 25*sizeFactor, 70*sizeFactor);
        mx = mx + 10*sizeFactor;
    }
    
    public static void dibuja_c(GraphicsContext gc, double sizeFactor){
        gc.strokeLine(mx + 20*sizeFactor, 70*sizeFactor, mx + 25*sizeFactor, 70*sizeFactor);//abajo o
        gc.strokeLine(mx + 20*sizeFactor, 70*sizeFactor, mx + 20*sizeFactor, 60*sizeFactor);//izquierda o
        gc.strokeLine(mx + 20*sizeFactor, 60*sizeFactor, mx + 25*sizeFactor, 60*sizeFactor);//arriba o
        mx = mx + 10*sizeFactor;
    }
    public static void dibuja_a(GraphicsContext gc, double sizeFactor){
        gc.strokeLine(mx + 20*sizeFactor, 65*sizeFactor, mx + 25*sizeFactor, 65*sizeFactor);//abajo o
        gc.strokeLine(mx + 20*sizeFactor, 70*sizeFactor, mx + 20*sizeFactor, 60*sizeFactor);//izquierda o
        gc.strokeLine(mx + 20*sizeFactor, 60*sizeFactor, mx + 25*sizeFactor, 60*sizeFactor);//arriba o
        gc.strokeLine(mx + 25*sizeFactor, 70*sizeFactor, mx + 25*sizeFactor, 60*sizeFactor);//derecha o 
        mx = mx + 10*sizeFactor;
    }
    public static void dibuja_t(GraphicsContext gc, double sizeFactor){
        gc.strokeLine(mx + 22.5*sizeFactor, 70*sizeFactor, mx + 22.5*sizeFactor, 60*sizeFactor);
        gc.strokeLine(mx + 20.5*sizeFactor, 60*sizeFactor, mx + 24.5*sizeFactor, 60*sizeFactor);
        mx = mx + 10*sizeFactor;
    }

    public static void dibuja_seno(GraphicsContext gc, Color myColorOperators, double sizeFactor){
        gc.setStroke(myColorOperators);
        dibuja_s(gc, sizeFactor);
        dibuja_i(gc, sizeFactor);
        dibuja_n(gc, sizeFactor);
        mx = mx + 35*sizeFactor;
    }

    public static void dibuja_coseno(GraphicsContext gc, Color myColorOperators, double sizeFactor){
        gc.setStroke(myColorOperators);
        dibuja_c(gc, sizeFactor);
        dibuja_o(gc, sizeFactor);
        dibuja_s(gc, sizeFactor);
        mx = mx + 35*sizeFactor;
    }

    public static void dibuja_tangente(GraphicsContext gc, Color myColorOperators, double sizeFactor){
        gc.setStroke(myColorOperators);
        dibuja_t(gc, sizeFactor);
        dibuja_a(gc, sizeFactor);
        dibuja_n(gc, sizeFactor);
        mx = mx + 35*sizeFactor;
    }
}