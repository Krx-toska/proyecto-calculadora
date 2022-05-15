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

    int mx=0;
    
    
    public void dibuja_uno(GraphicsContext gc, ArrayList<String> operacion, Color myColorNumbers, double sizeFactor){
        
        gc.setStroke(myColorNumbers);
     if(operacion.isEmpty()){  
          gc.strokeLine(mx + 20*sizeFactor,  25*sizeFactor,mx + 20*sizeFactor, 75*sizeFactor);
          gc.strokeLine(mx + 20*sizeFactor,  25*sizeFactor,mx + 10*sizeFactor, 35*sizeFactor);
          mx = (int) (mx + 25*sizeFactor);}
     else if("^".equals(operacion.get(operacion.size()-1))){
          gc.strokeLine(mx +20*sizeFactor,10*sizeFactor,mx +20*sizeFactor,30*sizeFactor);
          gc.strokeLine(mx +20*sizeFactor,10*sizeFactor,mx +15*sizeFactor,15*sizeFactor);
          mx = (int) (mx + 15*sizeFactor);
       }
      else if(!"/".equals(operacion.get(operacion.size()-1))){
          gc.strokeLine(mx + 20*sizeFactor,  25*sizeFactor,mx + 20*sizeFactor, 75*sizeFactor);
          gc.strokeLine(mx + 20*sizeFactor,  25*sizeFactor,mx + 10*sizeFactor, 35*sizeFactor);
          mx = (int) (mx + 25*sizeFactor);}
         
     else if("/".equals(operacion.get(operacion.size()-1))){
          gc.strokeLine(mx + 20*sizeFactor,85*sizeFactor,mx + 20*sizeFactor,135*sizeFactor);
          gc.strokeLine(mx + 20*sizeFactor,85*sizeFactor,mx + 10*sizeFactor,95*sizeFactor);
          mx = (int) (mx + 25*sizeFactor);}
    }
    
    public void dibuja_dos(GraphicsContext gc ,ArrayList<String> operacion, Color myColorNumbers, double sizeFactor){
        
        gc.setStroke(myColorNumbers);
      if(operacion.isEmpty()){ 
          gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);
          gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,50*sizeFactor);
          gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor); //horizontal media
          gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +10*sizeFactor,75*sizeFactor);
          gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor,75*sizeFactor);
          mx = (int) (mx + 35*sizeFactor);}
       else if("^".equals(operacion.get(operacion.size()-1))){
          gc.strokeLine(mx +10*sizeFactor,10*sizeFactor,mx +20*sizeFactor,10*sizeFactor);
          gc.strokeLine(mx +20*sizeFactor,10*sizeFactor,mx +20*sizeFactor,20*sizeFactor);
          gc.strokeLine(mx +20*sizeFactor,20*sizeFactor,mx +10*sizeFactor,20*sizeFactor);
          gc.strokeLine(mx +10*sizeFactor,20*sizeFactor,mx +10*sizeFactor,30*sizeFactor);
          gc.strokeLine(mx +10*sizeFactor,30*sizeFactor,mx +20*sizeFactor,30*sizeFactor);
          mx = (int) (mx + 15*sizeFactor);
       }
       else if("/".equals(operacion.get(operacion.size()-1))){
          gc.strokeLine(mx +10*sizeFactor,85*sizeFactor,mx +35*sizeFactor,85*sizeFactor);
          gc.strokeLine(mx +35*sizeFactor,85*sizeFactor,mx +35*sizeFactor,110*sizeFactor);
          gc.strokeLine(mx +10*sizeFactor,110*sizeFactor,mx +35*sizeFactor,110*sizeFactor); //horizontal media
          gc.strokeLine(mx +10*sizeFactor,110*sizeFactor,mx +10*sizeFactor,135*sizeFactor);
          gc.strokeLine(mx +10*sizeFactor,135*sizeFactor,mx +35*sizeFactor,135*sizeFactor);
          mx = (int) (mx + 35*sizeFactor);}
      
      else if(!"/".equals(operacion.get(operacion.size()-1))){
          gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);
          gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,50*sizeFactor);
          gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor); //horizontal media
          gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +10*sizeFactor,75*sizeFactor);
          gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor,75*sizeFactor);
          mx = (int) (mx + 35*sizeFactor);}
      
    }
    
        public void dibuja_tres(GraphicsContext gc, ArrayList<String> operacion, Color myColorNumbers, double sizeFactor){

            gc.setStroke(myColorNumbers);
        if(operacion.isEmpty()){
          gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);
          gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,75*sizeFactor);
          gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);
          gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor,75*sizeFactor);
          mx = (int) (mx + 35*sizeFactor);}
         else if("^".equals(operacion.get(operacion.size()-1))){
          gc.strokeLine(mx +10*sizeFactor,10*sizeFactor,mx +20*sizeFactor,10*sizeFactor);
          gc.strokeLine(mx +20*sizeFactor,10*sizeFactor,mx +20*sizeFactor,20*sizeFactor);
          gc.strokeLine(mx +20*sizeFactor,20*sizeFactor,mx +10*sizeFactor,20*sizeFactor);
          gc.strokeLine(mx +20*sizeFactor,20*sizeFactor,mx +20*sizeFactor,30*sizeFactor);
          gc.strokeLine(mx +20*sizeFactor,30*sizeFactor,mx +10*sizeFactor,30*sizeFactor);
          mx = (int) (mx + 15*sizeFactor);
       }       
        else if(!"/".equals(operacion.get(operacion.size()-1))){
          gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);
          gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,75*sizeFactor);
          gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);
          gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor,75*sizeFactor);
          mx = (int) (mx + 35*sizeFactor);}
        else if("/".equals(operacion.get(operacion.size()-1))){
          gc.strokeLine(mx +10*sizeFactor,85*sizeFactor,mx +35*sizeFactor,85*sizeFactor);
          gc.strokeLine(mx +35*sizeFactor,85*sizeFactor,mx +35*sizeFactor,135*sizeFactor);
          gc.strokeLine(mx +10*sizeFactor,110*sizeFactor,mx +35*sizeFactor,110*sizeFactor);
          gc.strokeLine(mx +10*sizeFactor,135*sizeFactor,mx +35*sizeFactor,135*sizeFactor);
          mx = (int) (mx + 35*sizeFactor);}
    }
      
          public void dibuja_cuatro(GraphicsContext gc, ArrayList<String> operacion, Color myColorNumbers, double sizeFactor){

              gc.setStroke(myColorNumbers);
        if(operacion.isEmpty()){
         gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,75*sizeFactor);
         gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);
         gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,50*sizeFactor);
         mx = (int) (mx + 35*sizeFactor);}
        else if("^".equals(operacion.get(operacion.size()-1))){
          gc.strokeLine(mx +20*sizeFactor,10*sizeFactor,mx +20*sizeFactor,30*sizeFactor);
          gc.strokeLine(mx +20*sizeFactor,20*sizeFactor,mx +10*sizeFactor,20*sizeFactor);
          gc.strokeLine(mx +10*sizeFactor,20*sizeFactor,mx +10*sizeFactor,10*sizeFactor);
          
          mx = mx + 15;}
        else if(!"/".equals(operacion.get(operacion.size()-1))){
         gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,75*sizeFactor);
         gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);
         gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,50*sizeFactor);
         mx = (int) (mx + 35*sizeFactor);}
        else if("/".equals(operacion.get(operacion.size()-1))){
         gc.strokeLine(mx +35*sizeFactor,85*sizeFactor,mx +35*sizeFactor,135*sizeFactor);
         gc.strokeLine(mx +10*sizeFactor,110*sizeFactor,mx +35*sizeFactor,110*sizeFactor);
         gc.strokeLine(mx +10*sizeFactor,85*sizeFactor,mx +10*sizeFactor,110*sizeFactor);
         mx = (int) (mx + 35*sizeFactor);}
    }
          
    public void dibuja_cinco(GraphicsContext gc, ArrayList<String> operacion, Color myColorNumbers, double sizeFactor){

            gc.setStroke(myColorNumbers);
        if(operacion.isEmpty()){
         gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);
         gc.strokeLine(mx +35*sizeFactor,50*sizeFactor,mx +35*sizeFactor,75*sizeFactor);
         gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);
         gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,50*sizeFactor);
         gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor,75*sizeFactor);
         mx = (int) (mx + 35*sizeFactor);}
        else if("^".equals(operacion.get(operacion.size()-1))){
          gc.strokeLine(mx +10*sizeFactor,30*sizeFactor,mx +20*sizeFactor,30*sizeFactor);
          gc.strokeLine(mx +20*sizeFactor,30*sizeFactor,mx +20*sizeFactor,20*sizeFactor);
          gc.strokeLine(mx +20*sizeFactor,20*sizeFactor,mx +10*sizeFactor,20*sizeFactor);
          gc.strokeLine(mx +10*sizeFactor,20*sizeFactor,mx +10*sizeFactor,10*sizeFactor);
          gc.strokeLine(mx +10*sizeFactor,10*sizeFactor,mx +20*sizeFactor,10*sizeFactor);
          mx = (int) (mx + 15*sizeFactor);}
        else if(!"/".equals(operacion.get(operacion.size()-1))){
         gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);
         gc.strokeLine(mx +35*sizeFactor,50*sizeFactor,mx +35*sizeFactor,75*sizeFactor);
         gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);
         gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,50*sizeFactor);
         gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor,75*sizeFactor);
         mx = (int) (mx + 35*sizeFactor);}
        else if("/".equals(operacion.get(operacion.size()-1))){
         gc.strokeLine(mx +10*sizeFactor,85*sizeFactor,mx +35*sizeFactor*sizeFactor,85*sizeFactor);
         gc.strokeLine(mx +35*sizeFactor,110*sizeFactor,mx +35*sizeFactor,135*sizeFactor);
         gc.strokeLine(mx +10*sizeFactor,110*sizeFactor,mx +35*sizeFactor,110*sizeFactor);
         gc.strokeLine(mx +10*sizeFactor,85*sizeFactor,mx +10*sizeFactor,110*sizeFactor);
         gc.strokeLine(mx +10*sizeFactor,135*sizeFactor,mx +35*sizeFactor,135*sizeFactor);
         mx = (int) (mx + 35*sizeFactor);}
    }
    
        public void dibuja_seis(GraphicsContext gc, ArrayList<String> operacion, Color myColorNumbers, double sizeFactor){

            gc.setStroke(myColorNumbers);
       if(operacion.isEmpty()){
        gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);   //arriba
        gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //abajo
        gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,75*sizeFactor);   //izquierda
        gc.strokeLine(mx +35*sizeFactor,50*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //derecha abajo
        gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);
        mx = (int) (mx + 35*sizeFactor);}
        else if("^".equals(operacion.get(operacion.size()-1))){
          gc.strokeLine(mx +10*sizeFactor,30*sizeFactor,mx +20*sizeFactor,30*sizeFactor);
          gc.strokeLine(mx +20*sizeFactor,30*sizeFactor,mx +20*sizeFactor,20*sizeFactor);
          gc.strokeLine(mx +10*sizeFactor,30*sizeFactor,mx +10*sizeFactor,20*sizeFactor);
          gc.strokeLine(mx +10*sizeFactor,20*sizeFactor,mx +20*sizeFactor,20*sizeFactor);
          gc.strokeLine(mx +10*sizeFactor,20*sizeFactor,mx +10*sizeFactor,10*sizeFactor);
          gc.strokeLine(mx +10*sizeFactor,10*sizeFactor,mx +20*sizeFactor,10*sizeFactor); 
         mx = (int) (mx + 15*sizeFactor);}
       else if(!"/".equals(operacion.get(operacion.size()-1))){
        gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);   //arriba
        gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //abajo
        gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,75*sizeFactor);   //izquierda
        gc.strokeLine(mx +35*sizeFactor,50*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //derecha abajo
        gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);
        mx = (int) (mx + 35*sizeFactor);}
       else if("/".equals(operacion.get(operacion.size()-1))){
        gc.strokeLine(mx +10*sizeFactor,85*sizeFactor,mx +35*sizeFactor,85*sizeFactor);   //arriba
        gc.strokeLine(mx +10*sizeFactor,135*sizeFactor,mx +35*sizeFactor,135*sizeFactor);   //abajo
        gc.strokeLine(mx +10*sizeFactor,85*sizeFactor,mx +10*sizeFactor,135*sizeFactor);   //izquierda
        gc.strokeLine(mx +35*sizeFactor,110*sizeFactor,mx +35*sizeFactor,135*sizeFactor);   //derecha abajo
        gc.strokeLine(mx +10*sizeFactor,110*sizeFactor,mx +35*sizeFactor,110*sizeFactor);
        mx = (int) (mx + 35*sizeFactor);}
    }
        
        public void dibuja_siete(GraphicsContext gc, ArrayList<String> operacion, Color myColorNumbers, double sizeFactor){

            gc.setStroke(myColorNumbers);
      if(operacion.isEmpty()){
       gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);   //arriba
       gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,50*sizeFactor);   //izquierda arriba
       gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //derecha
       mx = (int) (mx + 35*sizeFactor);}
      else if("^".equals(operacion.get(operacion.size()-1))){
      gc.strokeLine(mx +20*sizeFactor,30*sizeFactor,mx +20*sizeFactor,10*sizeFactor);
      gc.strokeLine(mx +20*sizeFactor,10*sizeFactor,mx +10*sizeFactor,10*sizeFactor);
      gc.strokeLine(mx +10*sizeFactor,10*sizeFactor,mx +10*sizeFactor,20*sizeFactor);
      mx = (int) (mx + 15*sizeFactor);}
      else if(!"/".equals(operacion.get(operacion.size()-1))){
       gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);   //arriba
       gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,50*sizeFactor);   //izquierda arriba
       gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //derecha
       mx = (int) (mx + 35*sizeFactor);;}
      else if("/".equals(operacion.get(operacion.size()-1))){
       gc.strokeLine(mx +10*sizeFactor,85*sizeFactor,mx +35*sizeFactor,85*sizeFactor);   //arriba
       gc.strokeLine(mx +10*sizeFactor,85*sizeFactor,mx +10*sizeFactor,110*sizeFactor);   //izquierda arriba
       gc.strokeLine(mx +35*sizeFactor,85*sizeFactor,mx +35*sizeFactor,135*sizeFactor);   //derecha
       mx = (int) (mx + 35*sizeFactor);}
    }
        
       public void dibuja_ocho(GraphicsContext gc, ArrayList<String> operacion, Color myColorNumbers, double sizeFactor){
           gc.setStroke(myColorNumbers);
      if(operacion.isEmpty()){
       gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);   //arriba
       gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //abajo
       gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,75*sizeFactor);   //izquierda
       gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //derecha
       gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);   //horizontal media
       mx = (int) (mx + 35*sizeFactor);}
      else if("^".equals(operacion.get(operacion.size()-1))){
      gc.strokeLine(mx +20*sizeFactor,30*sizeFactor,mx +20*sizeFactor,10*sizeFactor);
      gc.strokeLine(mx +20*sizeFactor,30*sizeFactor,mx +10*sizeFactor,30*sizeFactor);
      gc.strokeLine(mx +10*sizeFactor,10*sizeFactor,mx +20*sizeFactor,10*sizeFactor);
      gc.strokeLine(mx +10*sizeFactor,10*sizeFactor,mx +10*sizeFactor,30*sizeFactor);
      gc.strokeLine(mx +10*sizeFactor,20*sizeFactor,mx +20*sizeFactor,20*sizeFactor);
      mx = (int) (mx + 15*sizeFactor);}
      else if(!"/".equals(operacion.get(operacion.size()-1))){
       gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);   //arriba
       gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //abajo
       gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,75*sizeFactor);   //izquierda
       gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //derecha
       gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);   //horizontal media
       mx = (int) (mx + 35*sizeFactor);;}
      else if("/".equals(operacion.get(operacion.size()-1))){
        gc.strokeLine(mx +10*sizeFactor,85*sizeFactor,mx +35*sizeFactor,85*sizeFactor);   //arriba
        gc.strokeLine(mx +10*sizeFactor,135*sizeFactor,mx +35*sizeFactor,135*sizeFactor);   //abajo
        gc.strokeLine(mx +10*sizeFactor,85*sizeFactor,mx +10*sizeFactor,135*sizeFactor);   //izquierda
        gc.strokeLine(mx +35*sizeFactor,85*sizeFactor,mx +35*sizeFactor,135*sizeFactor);   //derecha
        gc.strokeLine(mx +10*sizeFactor,110*sizeFactor,mx +35*sizeFactor,110*sizeFactor);   //horizontal media
        mx = (int) (mx + 35*sizeFactor);}
    }  
       
       public void dibuja_nueve(GraphicsContext gc, ArrayList<String> operacion, Color myColorNumbers, double sizeFactor){

           gc.setStroke(myColorNumbers);
      if(operacion.isEmpty()){
       gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);   //arriba
       gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //abajo
       gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,50*sizeFactor);   //izquierda arriba
       gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //derecha
       gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);   //horizontal media
       mx = (int) (mx + 35*sizeFactor);}
      else if("^".equals(operacion.get(operacion.size()-1))){
      gc.strokeLine(mx +20*sizeFactor,30*sizeFactor,mx +10*sizeFactor,30*sizeFactor);   
      gc.strokeLine(mx +20*sizeFactor,30*sizeFactor,mx +20*sizeFactor,10*sizeFactor);
      gc.strokeLine(mx +20*sizeFactor,10*sizeFactor,mx +10*sizeFactor,10*sizeFactor);
      gc.strokeLine(mx +10*sizeFactor,10*sizeFactor,mx +10*sizeFactor,20*sizeFactor);
      gc.strokeLine(mx +10*sizeFactor,20*sizeFactor,mx +20*sizeFactor,20*sizeFactor);
      mx = (int) (mx + 15*sizeFactor);}
      else if(!"/".equals(operacion.get(operacion.size()-1))){
       gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);   //arriba
       gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //abajo
       gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,50*sizeFactor);   //izquierda arriba
       gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //derecha
       gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);   //horizontal media
       mx = (int) (mx + 35*sizeFactor);}
      else if("/".equals(operacion.get(operacion.size()-1))){
       gc.strokeLine(mx +10*sizeFactor,85*sizeFactor,mx +35*sizeFactor,85*sizeFactor);   //arriba
       gc.strokeLine(mx +10*sizeFactor,135*sizeFactor,mx +35*sizeFactor,135*sizeFactor);   //abajo
       gc.strokeLine(mx +10*sizeFactor,85*sizeFactor,mx +10*sizeFactor,110*sizeFactor);   //izquierda arriba
       gc.strokeLine(mx +35*sizeFactor,85*sizeFactor,mx +35*sizeFactor,135*sizeFactor);   //derecha
       gc.strokeLine(mx +10*sizeFactor,110*sizeFactor,mx +35*sizeFactor,110*sizeFactor);   //horizontal media
       mx = (int) (mx + 35*sizeFactor);}
    }  
       
       public void dibuja_cero(GraphicsContext gc, ArrayList<String> operacion, Color myColorNumbers, double sizeFactor){

           gc.setStroke(myColorNumbers);
      if(operacion.isEmpty()){
       gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);   //arriba
       gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor*sizeFactor,75*sizeFactor);   //abajo
       gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,75*sizeFactor);   //izquierda
       gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //derecha
       mx = (int) (mx + 35*sizeFactor);}
      else if("^".equals(operacion.get(operacion.size()-1))){
      gc.strokeLine(mx +10*sizeFactor,30*sizeFactor,mx +20*sizeFactor,30*sizeFactor);   
      gc.strokeLine(mx +20*sizeFactor,30*sizeFactor,mx +20*sizeFactor,10*sizeFactor);
      gc.strokeLine(mx +20*sizeFactor,10*sizeFactor,mx +10*sizeFactor,10*sizeFactor);
      gc.strokeLine(mx +10*sizeFactor,10*sizeFactor,mx +10*sizeFactor,30*sizeFactor);
      mx = (int) (mx + 15*sizeFactor);}
      else if(!"/".equals(operacion.get(operacion.size()-1))){
       gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);   //arriba
       gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor*sizeFactor,75*sizeFactor);   //abajo
       gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,75*sizeFactor);   //izquierda
       gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //derecha
       mx = (int) (mx + 35*sizeFactor);}
      else if("/".equals(operacion.get(operacion.size()-1))){
       gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);   //arriba
       gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //abajo
       gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,50*sizeFactor);   //izquierda arriba
       gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //derecha
       gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);   //horizontal media
       mx = (int) (mx + 35*sizeFactor);}
    }  
       
       public void dibuja_mas(GraphicsContext gc, ArrayList<String> operacion, Color myColorOperators, double sizeFactor){
       gc.setStroke(myColorOperators);
       gc.strokeLine(mx + 22.5*sizeFactor,37.5*sizeFactor,mx +22.5*sizeFactor,62.5*sizeFactor);        //Altura maxima = 25, Altura Minima, 75
       gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);        //Ancho maximo = 30, parte desde x = 10
       mx = (int) (mx + 35*sizeFactor);
    } 
       
        public void dibuja_menos(GraphicsContext gc, ArrayList<String> operacion, Color myColorOperators, double sizeFactor){
       gc.setStroke(myColorOperators);     
       gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);
       mx = (int) (mx + 35*sizeFactor);
    } 
        
        public void dibuja_x(GraphicsContext gc, ArrayList<String> operacion, Color myColorOperators, double sizeFactor){
       gc.setStroke(myColorOperators);    
       gc.strokeLine(mx +20*sizeFactor,35*sizeFactor,mx + 32.5*sizeFactor,65*sizeFactor); 
       gc.strokeLine(mx +20*sizeFactor,65*sizeFactor,mx + 32.5*sizeFactor,35*sizeFactor);
       mx = (int) (mx + 35*sizeFactor);
    }
        
        public void dibuja_parentesisI(GraphicsContext gc, ArrayList<String> operacion, Color myColorOperators, double sizeFactor){

        gc.setStroke(myColorOperators); 
        gc.strokeArc(mx +20*sizeFactor,25*sizeFactor,10*sizeFactor,50*sizeFactor,90*sizeFactor,180*sizeFactor,ArcType.OPEN); 
        mx = (int) (mx + 25*sizeFactor);
    }
        
        public void dibuja_parentesisD(GraphicsContext gc, ArrayList<String> operacion, Color myColorOperators, double sizeFactor){

        gc.setStroke(myColorOperators);    
        gc.strokeArc(mx +10*sizeFactor,25*sizeFactor,10*sizeFactor,50*sizeFactor,90*sizeFactor,-180*sizeFactor,ArcType.OPEN); 
        mx = (int) (mx + 25*sizeFactor);
    }
        public void dibuja_dividir1(GraphicsContext gc, Color myColorOperators, double sizeFactor){
         gc.setStroke(myColorOperators);
         gc.strokeLine(mx -30*sizeFactor,80*sizeFactor,mx + 10*sizeFactor,80*sizeFactor);
         mx = (int) (mx - 25*sizeFactor);
    }
        
        public void dibuja_dividir(GraphicsContext gc, ArrayList<String> operacion, Color myColorOperators, double sizeFactor){
         gc.setStroke(myColorOperators);
         gc.strokeLine(mx -30*sizeFactor,80*sizeFactor,mx + 10*sizeFactor,80*sizeFactor);
         mx = (int) (mx - 35*sizeFactor);
    }
        
        public void limpiar(){
         mx = 0;
    }
    
    public void dibuja_factorial(GraphicsContext gc, Color myColorOperators){
            gc.setStroke(myColorOperators);
            gc.setLineWidth(2);   
            gc.strokeLine(mx + 20,25 ,mx + 20,60 );
            gc.strokeLine(mx + 20,70 ,mx + 20,70 );
            gc.setLineWidth(1);
       
             //Altura maxima = 25, Altura Minima, 75
       
       mx = mx + 35;
    }
        
    public void dibuja_seno(GraphicsContext gc, Color myColorOperators){
            gc.setStroke(myColorOperators);
            gc.setLineWidth(2);
            dibuja_s(gc);
            dibuja_i(gc);
            dibuja_n(gc);
            gc.setLineWidth(1);
       mx = mx + 35;
       
    }
        
    public void dibuja_coseno(GraphicsContext gc, Color myColorOperators){
        gc.setStroke(myColorOperators);
        gc.setLineWidth(2);
        dibuja_c(gc);
        dibuja_o(gc);
        dibuja_s(gc);
        gc.setLineWidth(1);
       mx = mx + 35;
    }
        
   public void dibuja_tangente(GraphicsContext gc, Color myColorOperators){
       gc.setStroke(myColorOperators);
       gc.setLineWidth(2);
       dibuja_t(gc);
       dibuja_a(gc);
       dibuja_n(gc);
       gc.setLineWidth(1);      
       
       mx = mx + 35;
    }
   
   public void dibuja_s(GraphicsContext gc){
       
            gc.strokeLine(mx + 20,70,mx +25,70);//abajo s
            gc.strokeLine(mx + 25,70,mx +25,65);//abajo derecha s
            gc.strokeLine(mx + 20,65,mx +25,65);//medio s
            gc.strokeLine(mx + 20,60,mx +20,65);//arriba izquierda s
            gc.strokeLine(mx + 20,60,mx +25,60);//arriba s
            
            mx= mx + 10;
   }
   
   public void dibuja_o(GraphicsContext gc){
       
            gc.strokeLine(mx + 20,70,mx +25,70);//abajo o
            gc.strokeLine(mx + 20,70,mx +20,60);//izquierda o
            gc.strokeLine(mx + 20,60,mx +25,60);//arriba o
            gc.strokeLine(mx + 25,70,mx +25,60);//derecha o
            
            mx= mx + 10;
   }
   
   public void dibuja_i(GraphicsContext gc){
       gc.strokeLine(mx + 22.5,70,mx +22.5,65);
       gc.strokeLine(mx + 22.5,60,mx +22.5,60);
       mx= mx + 10;
   }
   
   public void dibuja_n(GraphicsContext gc){
       gc.strokeLine(mx + 20,70,mx +20,60);
       gc.strokeLine(mx + 25,70,mx +25,60);
       gc.strokeLine(mx + 20,60,mx +25,70);
       mx= mx + 10;
   }
   
   public void dibuja_c(GraphicsContext gc){
       gc.strokeLine(mx + 20,70,mx +25,70);//abajo o
       gc.strokeLine(mx + 20,70,mx +20,60);//izquierda o
       gc.strokeLine(mx + 20,60,mx +25,60);//arriba o
       mx= mx + 10;
   }
   public void dibuja_a(GraphicsContext gc){
       
            gc.strokeLine(mx + 20,65,mx +25,65);//abajo o
            gc.strokeLine(mx + 20,70,mx +20,60);//izquierda o
            gc.strokeLine(mx + 20,60,mx +25,60);//arriba o
            gc.strokeLine(mx + 25,70,mx +25,60);//derecha o
            
            mx= mx + 10;
   }
   public void dibuja_t(GraphicsContext gc){
       gc.strokeLine(mx + 22.5,70,mx +22.5,60);
       gc.strokeLine(mx + 20.5,60,mx +24.5,60);
       mx= mx + 10;
   }
   
     
}
