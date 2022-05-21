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

    private int mx=0;
    int auxmx=0;
    int auxmx2=0;
    ArrayList auxlista= new ArrayList();
    
    public void dibuja_uno(GraphicsContext gc, ArrayList<String> operacion, Color myColorNumbers, double sizeFactor,int contD,Color myColorOperators){
        
     gc.setStroke(myColorNumbers);
     if(contD==0){
     if(operacion.isEmpty()){  
          gc.strokeLine(mx + 20*sizeFactor,  25*sizeFactor,mx + 20*sizeFactor, 75*sizeFactor);
          gc.strokeLine(mx + 20*sizeFactor,  25*sizeFactor,mx + 10*sizeFactor, 35*sizeFactor);
          mx = (int) (mx + 25*sizeFactor);
          auxlista.add("0");}
     else if("^".equals(operacion.get(operacion.size()-1))){
          gc.strokeLine(mx +20*sizeFactor,10*sizeFactor,mx +20*sizeFactor,30*sizeFactor);
          gc.strokeLine(mx +20*sizeFactor,10*sizeFactor,mx +15*sizeFactor,15*sizeFactor);
          mx = (int) (mx + 15*sizeFactor);
          auxlista.add("0");
       }
      else if(!"/".equals(operacion.get(operacion.size()-1))){
          gc.strokeLine(mx + 20*sizeFactor,  25*sizeFactor,mx + 20*sizeFactor, 75*sizeFactor);
          gc.strokeLine(mx + 20*sizeFactor,  25*sizeFactor,mx + 10*sizeFactor, 35*sizeFactor);
          mx = (int) (mx + 25*sizeFactor);
          auxlista.add("0");}}
     else{
      if(contD==1){
          gc.strokeLine(mx + 20*sizeFactor,  25*sizeFactor,mx + 20*sizeFactor, 75*sizeFactor);
          gc.strokeLine(mx + 20*sizeFactor,  25*sizeFactor,mx + 10*sizeFactor, 35*sizeFactor);
          gc.setStroke(myColorOperators);
          gc.strokeLine(mx + 0*sizeFactor,80*sizeFactor,mx + 40*sizeFactor,80*sizeFactor);
          gc.setStroke(myColorNumbers);
          mx = (int) (mx + 25*sizeFactor);
          auxmx =(int) (auxmx-25*sizeFactor);
          auxmx2 = mx;
          auxlista.add("1"); 
          auxmx2 = reducir(auxmx2,auxmx);
          int x=(int) (mx + 20*sizeFactor);
          System.out.println(x+" viejo punto");
          }
      else if(contD==2){
          gc.strokeLine(auxmx2 + 20*sizeFactor,85*sizeFactor,auxmx2 + 20*sizeFactor,135*sizeFactor);
          gc.strokeLine(auxmx2 + 20*sizeFactor,85*sizeFactor,auxmx2 + 10*sizeFactor,95*sizeFactor);
          gc.setStroke(myColorOperators);
          gc.strokeLine(auxmx2 + 0*sizeFactor,80*sizeFactor,auxmx2 + 40*sizeFactor,80*sizeFactor);
          gc.setStroke(myColorNumbers);
          auxmx2 = (int) (auxmx2 + 25*sizeFactor);
          auxlista.add("2");
          mx=ubicarse(auxmx2,mx,sizeFactor);
          auxmx=0;
          int x=(int) (auxmx2 + 20*sizeFactor);
          System.out.println(x+" nuevo punto");}
    }
  }
    
    public void dibuja_dos(GraphicsContext gc ,ArrayList<String> operacion, Color myColorNumbers, double sizeFactor,int contD,Color myColorOperators){
        
        gc.setStroke(myColorNumbers);
      if(contD==0){  
      if(operacion.isEmpty()){ 
          gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);
          gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,50*sizeFactor);
          gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor); //horizontal media
          gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +10*sizeFactor,75*sizeFactor);
          gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor,75*sizeFactor);
          mx = (int) (mx + 35*sizeFactor);
          auxlista.add("0");}
       else if("^".equals(operacion.get(operacion.size()-1))){
          gc.strokeLine(mx +10*sizeFactor,10*sizeFactor,mx +20*sizeFactor,10*sizeFactor);
          gc.strokeLine(mx +20*sizeFactor,10*sizeFactor,mx +20*sizeFactor,20*sizeFactor);
          gc.strokeLine(mx +20*sizeFactor,20*sizeFactor,mx +10*sizeFactor,20*sizeFactor);
          gc.strokeLine(mx +10*sizeFactor,20*sizeFactor,mx +10*sizeFactor,30*sizeFactor);
          gc.strokeLine(mx +10*sizeFactor,30*sizeFactor,mx +20*sizeFactor,30*sizeFactor);
          mx = (int) (mx + 15*sizeFactor);
          auxlista.add("0");
       }
  
      else if(!"/".equals(operacion.get(operacion.size()-1))){
          gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);
          gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,50*sizeFactor);
          gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor); //horizontal media
          gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +10*sizeFactor,75*sizeFactor);
          gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor,75*sizeFactor);
          mx = (int) (mx + 35*sizeFactor);auxlista.add("0");}}
       else{
       if(contD==1){
       gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);
       gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,50*sizeFactor);
       gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor); //horizontal media
       gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +10*sizeFactor,75*sizeFactor);
       gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor,75*sizeFactor);
       gc.setStroke(myColorOperators);
       gc.strokeLine(mx + 0*sizeFactor,80*sizeFactor,mx +50*sizeFactor,80*sizeFactor);
       gc.setStroke(myColorNumbers);
       mx = (int) (mx + 35*sizeFactor);
       auxmx =(int) (auxmx-35*sizeFactor);
       auxmx2 = mx;
       auxlista.add("1"); 
       auxmx2 = reducir(auxmx2,auxmx);
       int x= (int) (mx +10*sizeFactor);}
       else if(contD==2){
        gc.strokeLine(auxmx2 +10*sizeFactor,85*sizeFactor,auxmx2 +35*sizeFactor,85*sizeFactor);
        gc.strokeLine(auxmx2 +35*sizeFactor,85*sizeFactor,auxmx2 +35*sizeFactor,110*sizeFactor);
        gc.strokeLine(auxmx2 +10*sizeFactor,110*sizeFactor,auxmx2 +35*sizeFactor,110*sizeFactor); //horizontal media
        gc.strokeLine(auxmx2 +10*sizeFactor,110*sizeFactor,auxmx2 +10*sizeFactor,135*sizeFactor);
        gc.strokeLine(auxmx2 +10*sizeFactor,135*sizeFactor,auxmx2 +35*sizeFactor,135*sizeFactor);
        gc.setStroke(myColorOperators);
        gc.strokeLine(auxmx2 + 0*sizeFactor,80*sizeFactor,auxmx2 +50*sizeFactor,80*sizeFactor);
        gc.setStroke(myColorNumbers);
        auxmx2 = (int) (auxmx2 + 35*sizeFactor);
        auxlista.add("2");
        mx=ubicarse(auxmx2,mx,sizeFactor);
        int x= (int) (auxmx2 +10*sizeFactor);
        auxmx=0;
       }
       
       }
    }
    
        public void dibuja_tres(GraphicsContext gc, ArrayList<String> operacion, Color myColorNumbers, double sizeFactor,int contD,Color myColorOperators){

            gc.setStroke(myColorNumbers);
        if(contD==0){  
        if(operacion.isEmpty()){
          gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);
          gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,75*sizeFactor);
          gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);
          gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor,75*sizeFactor);
          mx = (int) (mx + 35*sizeFactor);auxlista.add("0");}
         else if("^".equals(operacion.get(operacion.size()-1))){
          gc.strokeLine(mx +10*sizeFactor,10*sizeFactor,mx +20*sizeFactor,10*sizeFactor);
          gc.strokeLine(mx +20*sizeFactor,10*sizeFactor,mx +20*sizeFactor,20*sizeFactor);
          gc.strokeLine(mx +20*sizeFactor,20*sizeFactor,mx +10*sizeFactor,20*sizeFactor);
          gc.strokeLine(mx +20*sizeFactor,20*sizeFactor,mx +20*sizeFactor,30*sizeFactor);
          gc.strokeLine(mx +20*sizeFactor,30*sizeFactor,mx +10*sizeFactor,30*sizeFactor);
          mx = (int) (mx + 15*sizeFactor);auxlista.add("0");
       }       
        else if(!"/".equals(operacion.get(operacion.size()-1))){
          gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);
          gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,75*sizeFactor);
          gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);
          gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor,75*sizeFactor);
          mx = (int) (mx + 35*sizeFactor);auxlista.add("0");}}
        else{
        if(contD==1){
          gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);
          gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,75*sizeFactor);
          gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);
          gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor,75*sizeFactor);
          gc.setStroke(myColorOperators);
          gc.strokeLine(mx + 0*sizeFactor,80*sizeFactor,mx +50*sizeFactor,80*sizeFactor);
          gc.setStroke(myColorNumbers);
          mx = (int) (mx + 35*sizeFactor);
          auxmx =(int) (auxmx-35*sizeFactor);
          auxmx2 = mx;
          auxlista.add("1"); 
          auxmx2 = reducir(auxmx2,auxmx);}
          else if(contD==2){
          gc.strokeLine(auxmx2 +10*sizeFactor,85*sizeFactor,auxmx2 +35*sizeFactor,85*sizeFactor);
          gc.strokeLine(auxmx2 +35*sizeFactor,85*sizeFactor,auxmx2 +35*sizeFactor,135*sizeFactor);
          gc.strokeLine(auxmx2 +10*sizeFactor,110*sizeFactor,auxmx2 +35*sizeFactor,110*sizeFactor);
          gc.strokeLine(auxmx2 +10*sizeFactor,135*sizeFactor,auxmx2 +35*sizeFactor,135*sizeFactor);
          gc.setStroke(myColorOperators);
          gc.strokeLine(auxmx2 + 0*sizeFactor,80*sizeFactor,auxmx2 +50*sizeFactor,80*sizeFactor);
          gc.setStroke(myColorNumbers);
          auxmx2 = (int) (auxmx2 + 35*sizeFactor);
          auxlista.add("2");
          mx=ubicarse(auxmx2,mx,sizeFactor);
          auxmx=0;}
        }
    }
      
          public void dibuja_cuatro(GraphicsContext gc, ArrayList<String> operacion, Color myColorNumbers, double sizeFactor,int contD,Color myColorOperators){

              gc.setStroke(myColorNumbers);
        if(contD==0){
        if(operacion.isEmpty()){
         gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,75*sizeFactor);
         gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);
         gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,50*sizeFactor);
         mx = (int) (mx + 35*sizeFactor);auxlista.add("0");}
        else if("^".equals(operacion.get(operacion.size()-1))){
          gc.strokeLine(mx +20*sizeFactor,10*sizeFactor,mx +20*sizeFactor,30*sizeFactor);
          gc.strokeLine(mx +20*sizeFactor,20*sizeFactor,mx +10*sizeFactor,20*sizeFactor);
          gc.strokeLine(mx +10*sizeFactor,20*sizeFactor,mx +10*sizeFactor,10*sizeFactor);
          auxlista.add("0");
          mx = mx + 15;}
        else if(!"/".equals(operacion.get(operacion.size()-1))){
         gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,75*sizeFactor);
         gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);
         gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,50*sizeFactor);
         mx = (int) (mx + 35*sizeFactor);auxlista.add("0");}}
        else{
        if(contD==1){
         gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,75*sizeFactor);
         gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);
         gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,50*sizeFactor);
         gc.strokeLine(mx + 0*sizeFactor,80*sizeFactor,mx +50*sizeFactor,80*sizeFactor);
         mx = (int) (mx + 35*sizeFactor);
         auxmx =(int) (auxmx-35*sizeFactor);
         auxmx2 = mx;
         auxlista.add("1"); 
         auxmx2 = reducir(auxmx2,auxmx);}
        if(contD==2){
        gc.strokeLine(auxmx2 +35*sizeFactor,85*sizeFactor,auxmx2 +35*sizeFactor,135*sizeFactor);
        gc.strokeLine(auxmx2 +10*sizeFactor,110*sizeFactor,auxmx2 +35*sizeFactor,110*sizeFactor);
        gc.strokeLine(auxmx2 +10*sizeFactor,85*sizeFactor,auxmx2 +10*sizeFactor,110*sizeFactor);
        gc.strokeLine(auxmx2 + 0*sizeFactor,80*sizeFactor,auxmx2 +50*sizeFactor,80*sizeFactor);
        auxmx2 = (int) (auxmx2 + 35*sizeFactor);}
        auxlista.add("2");auxmx=0;
        }
    }
          
    public void dibuja_cinco(GraphicsContext gc, ArrayList<String> operacion, Color myColorNumbers, double sizeFactor,int contD,Color myColorOperators){

            gc.setStroke(myColorNumbers);
        if(contD==0){
        if(operacion.isEmpty()){
         gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);
         gc.strokeLine(mx +35*sizeFactor,50*sizeFactor,mx +35*sizeFactor,75*sizeFactor);
         gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);
         gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,50*sizeFactor);
         gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor,75*sizeFactor);
         mx = (int) (mx + 35*sizeFactor);auxlista.add("0");}
        else if("^".equals(operacion.get(operacion.size()-1))){
          gc.strokeLine(mx +10*sizeFactor,30*sizeFactor,mx +20*sizeFactor,30*sizeFactor);
          gc.strokeLine(mx +20*sizeFactor,30*sizeFactor,mx +20*sizeFactor,20*sizeFactor);
          gc.strokeLine(mx +20*sizeFactor,20*sizeFactor,mx +10*sizeFactor,20*sizeFactor);
          gc.strokeLine(mx +10*sizeFactor,20*sizeFactor,mx +10*sizeFactor,10*sizeFactor);
          gc.strokeLine(mx +10*sizeFactor,10*sizeFactor,mx +20*sizeFactor,10*sizeFactor);
          mx = (int) (mx + 15*sizeFactor);auxlista.add("0");}
        else if(!"/".equals(operacion.get(operacion.size()-1))){
         gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);
         gc.strokeLine(mx +35*sizeFactor,50*sizeFactor,mx +35*sizeFactor,75*sizeFactor);
         gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);
         gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,50*sizeFactor);
         gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor,75*sizeFactor);
         mx = (int) (mx + 35*sizeFactor);auxlista.add("0");}}
        else{
        if(contD==1){
         gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);
         gc.strokeLine(mx +35*sizeFactor,50*sizeFactor,mx +35*sizeFactor,75*sizeFactor);
         gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);
         gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,50*sizeFactor);
         gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor,75*sizeFactor);
         gc.setStroke(myColorOperators);
         gc.strokeLine(mx + 0*sizeFactor,80*sizeFactor,mx +50*sizeFactor,80*sizeFactor);
         gc.setStroke(myColorNumbers);
         mx = (int) (mx + 35*sizeFactor);
         auxmx =(int) (auxmx-35*sizeFactor);
         auxmx2 = mx;
         auxlista.add("1"); 
         auxmx2 = reducir(auxmx2,auxmx);}
        else if(contD==2){
         gc.strokeLine(auxmx2 +10*sizeFactor,85*sizeFactor,auxmx2 +35*sizeFactor*sizeFactor,85*sizeFactor);
         gc.strokeLine(auxmx2 +35*sizeFactor,110*sizeFactor,auxmx2 +35*sizeFactor,135*sizeFactor);
         gc.strokeLine(auxmx2 +10*sizeFactor,110*sizeFactor,auxmx2 +35*sizeFactor,110*sizeFactor);
         gc.strokeLine(auxmx2 +10*sizeFactor,85*sizeFactor,auxmx2 +10*sizeFactor,110*sizeFactor);
         gc.strokeLine(auxmx2 +10*sizeFactor,135*sizeFactor,auxmx2 +35*sizeFactor,135*sizeFactor);
         gc.setStroke(myColorOperators);
         gc.strokeLine(auxmx2 + 0*sizeFactor,80*sizeFactor,auxmx2 +50*sizeFactor,80*sizeFactor);
         gc.setStroke(myColorNumbers);
         auxmx2 = (int) (auxmx2 + 35*sizeFactor);
         auxlista.add("2");
         mx=ubicarse(auxmx2,mx,sizeFactor);auxmx=0;
        }
        
        }
    }
    
        public void dibuja_seis(GraphicsContext gc, ArrayList<String> operacion, Color myColorNumbers, double sizeFactor,int contD,Color myColorOperators){

            gc.setStroke(myColorNumbers);
       if(contD==0){
       if(operacion.isEmpty()){
        gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);   //arriba
        gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //abajo
        gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,75*sizeFactor);   //izquierda
        gc.strokeLine(mx +35*sizeFactor,50*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //derecha abajo
        gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);
        mx = (int) (mx + 35*sizeFactor);auxlista.add("0");}
        else if("^".equals(operacion.get(operacion.size()-1))){
          gc.strokeLine(mx +10*sizeFactor,30*sizeFactor,mx +20*sizeFactor,30*sizeFactor);
          gc.strokeLine(mx +20*sizeFactor,30*sizeFactor,mx +20*sizeFactor,20*sizeFactor);
          gc.strokeLine(mx +10*sizeFactor,30*sizeFactor,mx +10*sizeFactor,20*sizeFactor);
          gc.strokeLine(mx +10*sizeFactor,20*sizeFactor,mx +20*sizeFactor,20*sizeFactor);
          gc.strokeLine(mx +10*sizeFactor,20*sizeFactor,mx +10*sizeFactor,10*sizeFactor);
          gc.strokeLine(mx +10*sizeFactor,10*sizeFactor,mx +20*sizeFactor,10*sizeFactor); 
         mx = (int) (mx + 15*sizeFactor);auxlista.add("0");}
       else if(!"/".equals(operacion.get(operacion.size()-1))){
        gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);   //arriba
        gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //abajo
        gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,75*sizeFactor);   //izquierda
        gc.strokeLine(mx +35*sizeFactor,50*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //derecha abajo
        gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);
        mx = (int) (mx + 35*sizeFactor);auxlista.add("0");}}
       else{
       if(contD==1){
        gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);   //arriba
        gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //abajo
        gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,75*sizeFactor);   //izquierda
        gc.strokeLine(mx +35*sizeFactor,50*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //derecha abajo
        gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);
        gc.setStroke(myColorOperators);
        gc.strokeLine(mx + 0*sizeFactor,80*sizeFactor,mx +50*sizeFactor,80*sizeFactor);
        gc.setStroke(myColorNumbers);
        mx = (int) (mx + 35*sizeFactor);
        auxmx =(int) (auxmx-35*sizeFactor);
        auxmx2 = mx;
        auxlista.add("1"); 
        auxmx2 = reducir(auxmx2,auxmx);}
       if(contD==2){
        gc.strokeLine(auxmx2 +10*sizeFactor,85*sizeFactor,auxmx2 +35*sizeFactor,85*sizeFactor);//arriba
        gc.strokeLine(auxmx2 +10*sizeFactor,135*sizeFactor,auxmx2 +35*sizeFactor,135*sizeFactor);//abajo
        gc.strokeLine(auxmx2 +10*sizeFactor,85*sizeFactor,auxmx2 +10*sizeFactor,135*sizeFactor); //izquierda
        gc.strokeLine(auxmx2 +35*sizeFactor,110*sizeFactor,auxmx2 +35*sizeFactor,135*sizeFactor);//derecha abajo
        gc.strokeLine(auxmx2 +10*sizeFactor,110*sizeFactor,auxmx2 +35*sizeFactor,110*sizeFactor);
        gc.setStroke(myColorOperators);
        gc.strokeLine(auxmx2 + 0*sizeFactor,80*sizeFactor,auxmx2 +50*sizeFactor,80*sizeFactor);
        gc.setStroke(myColorNumbers);
        auxmx2 = (int) (auxmx2 + 35*sizeFactor);
        auxlista.add("2");
        mx=ubicarse(auxmx2,mx,sizeFactor);auxmx=0;
       }
       
       }
    }
        
        public void dibuja_siete(GraphicsContext gc, ArrayList<String> operacion, Color myColorNumbers, double sizeFactor,int contD,Color myColorOperators){

            gc.setStroke(myColorNumbers);
      if(contD==0){
      if(operacion.isEmpty()){
       gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);   //arriba
       gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,50*sizeFactor);   //izquierda arriba
       gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //derecha
       mx = (int) (mx + 35*sizeFactor);auxlista.add("0");}
      else if("^".equals(operacion.get(operacion.size()-1))){
      gc.strokeLine(mx +20*sizeFactor,30*sizeFactor,mx +20*sizeFactor,10*sizeFactor);
      gc.strokeLine(mx +20*sizeFactor,10*sizeFactor,mx +10*sizeFactor,10*sizeFactor);
      gc.strokeLine(mx +10*sizeFactor,10*sizeFactor,mx +10*sizeFactor,20*sizeFactor);
      mx = (int) (mx + 15*sizeFactor);auxlista.add("0");}
      else if(!"/".equals(operacion.get(operacion.size()-1))){
       gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);   //arriba
       gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,50*sizeFactor);   //izquierda arriba
       gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //derecha
       mx = (int) (mx + 35*sizeFactor);auxlista.add("0");}
    }
      else{
      if(contD==1){
       gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);   //arriba
       gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,50*sizeFactor);   //izquierda arriba
       gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //derecha
       gc.setStroke(myColorOperators);
       gc.strokeLine(mx + 0*sizeFactor,80*sizeFactor,mx +50*sizeFactor,80*sizeFactor);
       gc.setStroke(myColorNumbers);
       mx = (int) (mx + 35*sizeFactor);
       auxmx =(int) (auxmx-35*sizeFactor);
       auxmx2 = mx;
       auxlista.add("1"); 
       auxmx2 = reducir(auxmx2,auxmx);}
      if(contD==2){
       gc.strokeLine(auxmx2 +10*sizeFactor,85*sizeFactor,auxmx2 +35*sizeFactor,85*sizeFactor);   //arriba
       gc.strokeLine(auxmx2 +10*sizeFactor,85*sizeFactor,auxmx2 +10*sizeFactor,110*sizeFactor);   //izquierda arriba
       gc.strokeLine(auxmx2 +35*sizeFactor,85*sizeFactor,auxmx2 +35*sizeFactor,135*sizeFactor);   //derecha
       gc.setStroke(myColorOperators);
       gc.strokeLine(auxmx2 + 0*sizeFactor,80*sizeFactor,auxmx2 +50*sizeFactor,80*sizeFactor);
       gc.setStroke(myColorNumbers);
       auxmx2 = (int) (auxmx2 + 35*sizeFactor);}
      auxlista.add("2");
      mx=ubicarse(auxmx2,mx,sizeFactor);auxmx=0;
      }
        
        
        }
        
       public void dibuja_ocho(GraphicsContext gc, ArrayList<String> operacion, Color myColorNumbers, double sizeFactor,int contD,Color myColorOperators){
           gc.setStroke(myColorNumbers);
      if(contD==0){
      if(operacion.isEmpty()){
       gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);   //arriba
       gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //abajo
       gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,75*sizeFactor);   //izquierda
       gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //derecha
       gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);   //horizontal media
       mx = (int) (mx + 35*sizeFactor);auxlista.add("0");}
      else if("^".equals(operacion.get(operacion.size()-1))){
      gc.strokeLine(mx +20*sizeFactor,30*sizeFactor,mx +20*sizeFactor,10*sizeFactor);
      gc.strokeLine(mx +20*sizeFactor,30*sizeFactor,mx +10*sizeFactor,30*sizeFactor);
      gc.strokeLine(mx +10*sizeFactor,10*sizeFactor,mx +20*sizeFactor,10*sizeFactor);
      gc.strokeLine(mx +10*sizeFactor,10*sizeFactor,mx +10*sizeFactor,30*sizeFactor);
      gc.strokeLine(mx +10*sizeFactor,20*sizeFactor,mx +20*sizeFactor,20*sizeFactor);
      mx = (int) (mx + 15*sizeFactor);auxlista.add("0");}
      else if(!"/".equals(operacion.get(operacion.size()-1))){
       gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);   //arriba
       gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //abajo
       gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,75*sizeFactor);   //izquierda
       gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //derecha
       gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);   //horizontal media
       mx = (int) (mx + 35*sizeFactor);auxlista.add("0");}}
      else{
      if(contD==1){
       gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);   //arriba
       gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //abajo
       gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,75*sizeFactor);   //izquierda
       gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //derecha
       gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);   //horizontal media
       gc.setStroke(myColorOperators);
       gc.strokeLine(mx + 0*sizeFactor,80*sizeFactor,mx +50*sizeFactor,80*sizeFactor);
       gc.setStroke(myColorNumbers);
       mx = (int) (mx + 35*sizeFactor);
       auxmx =(int) (auxmx-35*sizeFactor);
       auxmx2 = mx;
       auxlista.add("1"); 
       auxmx2 = reducir(auxmx2,auxmx);}
      if(contD==2){
        gc.strokeLine(auxmx2 +10*sizeFactor,85*sizeFactor,auxmx2 +35*sizeFactor,85*sizeFactor);   //arriba
        gc.strokeLine(auxmx2 +10*sizeFactor,135*sizeFactor,auxmx2 +35*sizeFactor,135*sizeFactor);   //abajo
        gc.strokeLine(auxmx2 +10*sizeFactor,85*sizeFactor,auxmx2 +10*sizeFactor,135*sizeFactor);   //izquierda
        gc.strokeLine(auxmx2 +35*sizeFactor,85*sizeFactor,auxmx2 +35*sizeFactor,135*sizeFactor);   //derecha
        gc.strokeLine(auxmx2 +10*sizeFactor,110*sizeFactor,auxmx2 +35*sizeFactor,110*sizeFactor);   //horizontal media
        gc.setStroke(myColorOperators);
        gc.strokeLine(auxmx2 + 0*sizeFactor,80*sizeFactor,auxmx2 +50*sizeFactor,80*sizeFactor);
        gc.setStroke(myColorNumbers);
        auxmx2 = (int) (auxmx2 + 35*sizeFactor);
        auxlista.add("2");
        mx=ubicarse(auxmx2,mx,sizeFactor);auxmx=0;}
      }
    }  
       
       public void dibuja_nueve(GraphicsContext gc, ArrayList<String> operacion, Color myColorNumbers, double sizeFactor,int contD,Color myColorOperators){

           gc.setStroke(myColorNumbers);
      if(contD==0){
      if(operacion.isEmpty()){
       gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);   //arriba
       gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //abajo
       gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,50*sizeFactor);   //izquierda arriba
       gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //derecha
       gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);   //horizontal media
       mx = (int) (mx + 35*sizeFactor);auxlista.add("0");}
      else if("^".equals(operacion.get(operacion.size()-1))){
      gc.strokeLine(mx +20*sizeFactor,30*sizeFactor,mx +10*sizeFactor,30*sizeFactor);   
      gc.strokeLine(mx +20*sizeFactor,30*sizeFactor,mx +20*sizeFactor,10*sizeFactor);
      gc.strokeLine(mx +20*sizeFactor,10*sizeFactor,mx +10*sizeFactor,10*sizeFactor);
      gc.strokeLine(mx +10*sizeFactor,10*sizeFactor,mx +10*sizeFactor,20*sizeFactor);
      gc.strokeLine(mx +10*sizeFactor,20*sizeFactor,mx +20*sizeFactor,20*sizeFactor);
      mx = (int) (mx + 15*sizeFactor);auxlista.add("0");}
      else if(!"/".equals(operacion.get(operacion.size()-1))){
       gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);   //arriba
       gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //abajo
       gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,50*sizeFactor);   //izquierda arriba
       gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //derecha
       gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);   //horizontal media
       mx = (int) (mx + 35*sizeFactor);auxlista.add("0");}}
      else{
      if(contD==1){
       gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);   //arriba
       gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //abajo
       gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,50*sizeFactor);   //izquierda arriba
       gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //derecha
       gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);   //horizontal media
       gc.setStroke(myColorOperators);
       gc.strokeLine(mx + 0*sizeFactor,80*sizeFactor,mx +50*sizeFactor,80*sizeFactor);
       gc.setStroke(myColorNumbers);
       mx = (int) (mx + 35*sizeFactor);
       auxmx =(int) (auxmx-35*sizeFactor);
       auxmx2 = mx;
       auxlista.add("1"); 
       auxmx2 = reducir(auxmx2,auxmx);}
      if(contD==2){
       gc.strokeLine(auxmx2 +10*sizeFactor,85*sizeFactor,auxmx2 +35*sizeFactor,85*sizeFactor);   //arriba
       gc.strokeLine(auxmx2 +10*sizeFactor,135*sizeFactor,auxmx2 +35*sizeFactor,135*sizeFactor);   //abajo
       gc.strokeLine(auxmx2 +10*sizeFactor,85*sizeFactor,auxmx2 +10*sizeFactor,110*sizeFactor);   //izquierda arriba
       gc.strokeLine(auxmx2 +35*sizeFactor,85*sizeFactor,auxmx2 +35*sizeFactor,135*sizeFactor);   //derecha
       gc.strokeLine(auxmx2 +10*sizeFactor,110*sizeFactor,auxmx2 +35*sizeFactor,110*sizeFactor);   //horizontal media
       gc.setStroke(myColorOperators);
       gc.strokeLine(auxmx2 + 0*sizeFactor,80*sizeFactor,auxmx2 +50*sizeFactor,80*sizeFactor);
       gc.setStroke(myColorNumbers);
       auxmx2 = (int) (auxmx2 + 35*sizeFactor);
       auxmx=auxmx2;
       auxlista.add("2");
       mx=ubicarse(auxmx2,mx,sizeFactor);auxmx=0;}}
    }  
       
       public void dibuja_cero(GraphicsContext gc, ArrayList<String> operacion, Color myColorNumbers, double sizeFactor,int contD,Color myColorOperators){

           gc.setStroke(myColorNumbers);
      if(contD==0){
      if(operacion.isEmpty()){
       gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);   //arriba
       gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor*sizeFactor,75*sizeFactor);   //abajo
       gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,75*sizeFactor);   //izquierda
       gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //derecha
       mx = (int) (mx + 35*sizeFactor);auxlista.add("0");}
      else if("^".equals(operacion.get(operacion.size()-1))){
      gc.strokeLine(mx +10*sizeFactor,30*sizeFactor,mx +20*sizeFactor,30*sizeFactor);
      gc.strokeLine(mx +20*sizeFactor,30*sizeFactor,mx +20*sizeFactor,10*sizeFactor);
      gc.strokeLine(mx +20*sizeFactor,10*sizeFactor,mx +10*sizeFactor,10*sizeFactor);
      gc.strokeLine(mx +10*sizeFactor,10*sizeFactor,mx +10*sizeFactor,30*sizeFactor);
      mx = (int) (mx + 15*sizeFactor);auxlista.add("0");}
      else if(!"/".equals(operacion.get(operacion.size()-1))){
       gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);   //arriba
       gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor*sizeFactor,75*sizeFactor);   //abajo
       gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,75*sizeFactor);   //izquierda
       gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //derecha
       mx = (int) (mx + 35*sizeFactor);auxlista.add("0");}}
      else{
      if(contD==1){
       gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);   //arriba
       gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor*sizeFactor,75*sizeFactor);   //abajo
       gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,75*sizeFactor);   //izquierda
       gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //derecha
       mx = (int) (mx + 35*sizeFactor);}
      if(contD==2){
       gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +35*sizeFactor,25*sizeFactor);   //arriba
       gc.strokeLine(mx +10*sizeFactor,75*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //abajo
       gc.strokeLine(mx +10*sizeFactor,25*sizeFactor,mx +10*sizeFactor,50*sizeFactor);   //izquierda arriba
       gc.strokeLine(mx +35*sizeFactor,25*sizeFactor,mx +35*sizeFactor,75*sizeFactor);   //derecha
       gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);   //horizontal media
       mx = (int) (mx + 35*sizeFactor);
       mx=ubicarse(auxmx2,mx,sizeFactor);auxmx=0;}}
    }  
       
       public void dibuja_mas(GraphicsContext gc, ArrayList<String> operacion, Color myColorOperators, double sizeFactor,int contD){
       gc.setStroke(myColorOperators);
       if(contD==0){
       gc.strokeLine(mx + 22.5*sizeFactor,37.5*sizeFactor,mx +22.5*sizeFactor,62.5*sizeFactor);        //Altura maxima = 25, Altura Minima, 75
       gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);        //Ancho maximo = 30, parte desde x = 10
       mx = (int) (mx + 35*sizeFactor);
       auxlista.add("0");}
       else{
       if(contD==1){
       gc.strokeLine(mx + 22.5*sizeFactor,37.5*sizeFactor,mx +22.5*sizeFactor,62.5*sizeFactor);        //Altura maxima = 25, Altura Minima, 75
       gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);//Ancho maximo = 30, parte desde x = 10
       gc.strokeLine(mx + 0*sizeFactor,80*sizeFactor,mx +50*sizeFactor,80*sizeFactor);
       auxmx -=35*sizeFactor;
       mx = (int) (mx + 35*sizeFactor);
       auxlista.add("1");
       auxmx2 = reducir(auxmx2,auxmx);}
       if(contD==2){
       gc.strokeLine(auxmx2 + 22.5*sizeFactor,87.5*sizeFactor,auxmx2 +22.5*sizeFactor,112.5*sizeFactor);        //Altura maxima = 25, Altura Minima, 75
       gc.strokeLine(auxmx2 +10*sizeFactor,100*sizeFactor,auxmx2 +35*sizeFactor,100*sizeFactor);//Ancho maximo = 30, parte desde x = 10
       gc.strokeLine(auxmx2 + 0*sizeFactor,80*sizeFactor,auxmx2 +50*sizeFactor,80*sizeFactor);
       auxmx2 = (int) (auxmx2 + 35*sizeFactor);
       auxlista.add("2");}
       
       }
    } 
       
        public void dibuja_menos(GraphicsContext gc, ArrayList<String> operacion, Color myColorOperators, double sizeFactor,int contD){
       gc.setStroke(myColorOperators);  
       if(contD==0){
       gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);
       mx = (int) (mx + 35*sizeFactor);auxlista.add("0");}
       else{
       if(contD==1){
       gc.strokeLine(mx +10*sizeFactor,50*sizeFactor,mx +35*sizeFactor,50*sizeFactor);
       gc.strokeLine(mx + 0*sizeFactor,80*sizeFactor,mx +50*sizeFactor,80*sizeFactor);
       mx = (int) (mx + 35*sizeFactor);
       auxmx =(int) (auxmx-35*sizeFactor);
       auxmx2 = mx;
       auxlista.add("1"); 
       auxmx2 = reducir(auxmx2,auxmx);}
       if(contD==2){
       gc.strokeLine(auxmx2 +10*sizeFactor,100*sizeFactor,auxmx2 +35*sizeFactor,100*sizeFactor);
       gc.strokeLine(auxmx2 + 0*sizeFactor,80*sizeFactor,auxmx2 +50*sizeFactor,80*sizeFactor);
       auxmx2 = (int) (auxmx2 + 35*sizeFactor);
       auxlista.add("2");}
       }
    } 
        
        public void dibuja_x(GraphicsContext gc, ArrayList<String> operacion, Color myColorOperators, double sizeFactor,int contD){
       gc.setStroke(myColorOperators);    
       if(contD==0){
       gc.strokeLine(mx +20*sizeFactor,35*sizeFactor,mx + 32.5*sizeFactor,65*sizeFactor); 
       gc.strokeLine(mx +20*sizeFactor,65*sizeFactor,mx + 32.5*sizeFactor,35*sizeFactor);
       mx = (int) (mx + 35*sizeFactor);auxlista.add("0");}
       else{
       if(contD==1){
       gc.strokeLine(mx +20*sizeFactor,35*sizeFactor,mx + 32.5*sizeFactor,65*sizeFactor); 
       gc.strokeLine(mx +20*sizeFactor,65*sizeFactor,mx + 32.5*sizeFactor,35*sizeFactor);
       gc.strokeLine(mx + 0*sizeFactor,80*sizeFactor,mx +50*sizeFactor,80*sizeFactor);
       mx = (int) (mx + 35*sizeFactor);
       auxmx =(int) (auxmx-35*sizeFactor);
       auxmx2 = mx;
       auxlista.add("1"); 
       auxmx2 = reducir(auxmx2,auxmx);}
       if(contD==2){
       gc.strokeLine(auxmx2 +20*sizeFactor,95*sizeFactor,auxmx2 + 32.5*sizeFactor,125*sizeFactor); 
       gc.strokeLine(auxmx2 +20*sizeFactor,125*sizeFactor,auxmx2 + 32.5*sizeFactor,95*sizeFactor);
       gc.strokeLine(auxmx2 + 0*sizeFactor,80*sizeFactor,auxmx2 +50*sizeFactor,80*sizeFactor);
       auxmx2 = (int) (auxmx2 + 35*sizeFactor);
       auxlista.add("2");}
       }
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
        
        public void limpiar(){
         mx = 0;
         auxmx=0;
         auxmx2=0;
         auxlista.clear();
         
    }     
        public ArrayList getauxlista(){
        return auxlista;}
        
        
        public int reducir(int x,int y){
        x=x+y;
        System.out.println(x);
        return x;
        }
        
        
        public int ubicarse(int auxmx, int aux,double sizefactor){
        if(auxmx>mx){
        mx=auxmx;
        mx=(int) (mx+15*sizefactor);
        }
        return mx;
        
        }
}

