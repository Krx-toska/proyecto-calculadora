package calculadora;



import java.util.ArrayList;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import static calculadora.Division.niveles;
import static calculadora.Division.bajar;
import static calculadora.Division.tamano;
import static calculadora.Division.nivelesD;
import static calculadora.Division.bajarD;
import static calculadora.Division.tamanoD;
import static calculadora.Division.DD;
import static calculadora.FXMLDocumentController.operacion;
import static calculadora.FXMLDocumentController.contP;
/**
 *
 * @author waki
 */
public class Dibuja {
    static double mx = 0;
    static boolean contG=false;
    static double auxmx = 1000;
    static double auxmxDD = 1000;
    static double aux = 0;
    static double auxmx2 = 0;
    static ArrayList nivelmx = new ArrayList();
    
    public static void limpiaMx(){
        mx = 0; auxmx = 1000; aux = 0;auxmx2=0;
        contG=false; nivelmx.clear(); double auxmxDD = 1000;
    }

    public static void dibuja_uno(GraphicsContext gc, ArrayList<String> operacion, Color myColorNumbers, double sizeFactor, Color myColorOperators){
        gc.setStroke(myColorNumbers);
        
    
        if(niveles.isEmpty()){ 
            
            if(contP==true){
            gc.strokeLine(mx +20*sizeFactor,110*sizeFactor,mx +20*sizeFactor,130*sizeFactor);
            gc.strokeLine(mx +20*sizeFactor,110*sizeFactor,mx +15*sizeFactor,115*sizeFactor);
            mx = mx + 15*sizeFactor;

            }
            else{
            if(contG==true){
            gc.clearRect(mx+10*sizeFactor, 40*sizeFactor, 100*sizeFactor, 100*sizeFactor);
            gc.strokeLine(mx + 20*sizeFactor,  125*sizeFactor,mx + 20*sizeFactor, 175*sizeFactor);
            gc.strokeLine(mx + 20*sizeFactor,  125*sizeFactor,mx + 10*sizeFactor, 135*sizeFactor);
            
            gc.setStroke(myColorOperators);
            dibuja_grados(gc,sizeFactor);
            mx = mx + 25*sizeFactor;
            }
            else{
            gc.strokeLine(mx + 20*sizeFactor,  125*sizeFactor,mx + 20*sizeFactor, 175*sizeFactor);
            gc.strokeLine(mx + 20*sizeFactor,  125*sizeFactor,mx + 10*sizeFactor, 135*sizeFactor);
            mx = mx + 25*sizeFactor;}
        
        }}
        
        
        else{
        
            if(!nivelesD.isEmpty()){
            aux = (int) niveles.get(niveles.size()-1);
            gc.strokeLine(mx +5*aux + 20*sizeFactor*tamanoD, 125*sizeFactor*tamanoD+bajarD,mx +5*aux + 20*sizeFactor*tamanoD, 175*sizeFactor*tamanoD+bajarD);
            gc.strokeLine(mx +5*aux + 20*sizeFactor*tamanoD, 125*sizeFactor*tamanoD+bajarD,mx +5*aux + 10*sizeFactor*tamanoD, 135*sizeFactor*tamanoD+bajarD);
          
            reubicarD();
            gc.setStroke(myColorOperators);
            if((int) niveles.get(niveles.size()-1)==2){
            gc.strokeLine(mx+0+5 *aux,180-25,mx+60-15*aux,180-25);}
            
            else if((int) niveles.get(niveles.size()-1)==3){
            gc.strokeLine(mx+0+10 *aux,180-75,mx+60-15*aux,180-75);}
            
            
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            

            contD++;    
            }
            
            mx = mx + 12*sizeFactor;
            }
        
            
            
            else{
            
                 if(contG==true){
                 aux = (int) niveles.get(niveles.size()-1);
                 gc.clearRect(mx+3.5*aux+ 10*sizeFactor*tamano, 114*tamano+bajar*sizeFactor, 100*sizeFactor*tamano, 100*sizeFactor*tamano);
                 
                 gc.strokeLine(mx +5*aux + 20*sizeFactor*tamano, 125*sizeFactor*tamano+bajar,mx +5*aux + 20*sizeFactor*tamano, 175*sizeFactor*tamano+bajar);
                 gc.strokeLine(mx +5*aux + 20*sizeFactor*tamano, 125*sizeFactor*tamano+bajar,mx +5*aux + 10*sizeFactor*tamano, 135*sizeFactor*tamano+bajar);
                 
                 gc.setStroke(myColorOperators);
                 dibuja_grados(gc,sizeFactor);
                 
                 reubicar();
                 reubicar2();
            if(DD==false){
            int contD = 0;
            
            for(int x =0;x<niveles.size();x+=2){
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            contD++;    
            }}
            
            else if(DD==true){
            gc.strokeLine(mx+0,180,mx+60,180);
            gc.strokeLine(mx+0+5 *aux,180+50,mx+60-5*aux,180+50);
            
            }
            
            mx = mx + 25*sizeFactor*tamano;
                 
                 }
                 else{
                     
            if(contP==true){
                
            aux = (int) niveles.get(niveles.size()-1); 
            gc.strokeLine(mx +5*aux+20*sizeFactor*tamano,120*sizeFactor*tamano+bajar,mx+5*aux +20*sizeFactor*tamano,140*sizeFactor*tamano+bajar);
            gc.strokeLine(mx +5*aux+20*sizeFactor*tamano,120*sizeFactor*tamano+bajar,mx +5*aux+15*sizeFactor*tamano,125*sizeFactor*tamano+bajar);
            
            gc.setStroke(myColorOperators);
            if(DD==false){
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            contD++;    
            }}
            
            else if(DD==true){
            gc.strokeLine(mx+0,180,mx+60,180);
            gc.strokeLine(mx+0+5 *aux,180+50,mx+60-5*aux,180+50);
            
            }
            
            mx = mx + 15*sizeFactor*tamano;
            

            }        
            else{
            aux = (int) niveles.get(niveles.size()-1);
            
            gc.strokeLine(mx +5*aux + 20*sizeFactor*tamano, 125*sizeFactor*tamano+bajar,mx +5*aux + 20*sizeFactor*tamano, 175*sizeFactor*tamano+bajar);
            gc.strokeLine(mx +5*aux + 20*sizeFactor*tamano, 125*sizeFactor*tamano+bajar,mx +5*aux + 10*sizeFactor*tamano, 135*sizeFactor*tamano+bajar);
            
            reubicar();
            reubicar2();
            gc.setStroke(myColorOperators);
            if(DD==false){
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            contD++;    
            }}
            
            else if(DD==true){
            gc.strokeLine(mx+0,180,mx+60,180);
            gc.strokeLine(mx+0+5 *aux,180+50,mx+60-5*aux,180+50);
            
            }
            
            mx = mx + 25*sizeFactor*tamano;}}}}}

    public static void dibuja_dos(GraphicsContext gc ,ArrayList<String> operacion, Color myColorNumbers, double sizeFactor, Color myColorOperators){
        gc.setStroke(myColorNumbers);
        
        if(niveles.isEmpty()){
        
            if(contG==true){
            gc.clearRect(mx+10*sizeFactor, 40*sizeFactor, 100*sizeFactor, 100*sizeFactor);
            
            
            gc.strokeLine(mx +10*sizeFactor,125*sizeFactor+bajar,mx +35*sizeFactor,125*sizeFactor+bajar);
            gc.strokeLine(mx +35*sizeFactor,125*sizeFactor+bajar,mx +35*sizeFactor,150*sizeFactor+bajar);
            gc.strokeLine(mx +10*sizeFactor,150*sizeFactor+bajar,mx +35*sizeFactor,150*sizeFactor+bajar); //horizontal media
            gc.strokeLine(mx +10*sizeFactor,150*sizeFactor+bajar,mx +10*sizeFactor,175*sizeFactor+bajar);
            gc.strokeLine(mx +10*sizeFactor,175*sizeFactor+bajar,mx +35*sizeFactor,175*sizeFactor+bajar);
            gc.setStroke(myColorOperators);
            dibuja_grados(gc,sizeFactor);
            mx = mx + 35*sizeFactor;
                
            }
            else{
                
            if(contP==true){
                
                
            gc.strokeLine(mx +10*sizeFactor,110*sizeFactor,mx +20*sizeFactor,110*sizeFactor);
            gc.strokeLine(mx +20*sizeFactor,110*sizeFactor,mx +20*sizeFactor,120*sizeFactor);
            gc.strokeLine(mx +20*sizeFactor,120*sizeFactor,mx +10*sizeFactor,120*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,120*sizeFactor,mx +10*sizeFactor,130*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,130*sizeFactor,mx +20*sizeFactor,130*sizeFactor);
            mx = mx + 15*sizeFactor;
            
            }
            else{    
            gc.strokeLine(mx +10*sizeFactor,125*sizeFactor+bajar,mx +35*sizeFactor,125*sizeFactor+bajar);
            gc.strokeLine(mx +35*sizeFactor,125*sizeFactor+bajar,mx +35*sizeFactor,150*sizeFactor+bajar);
            gc.strokeLine(mx +10*sizeFactor,150*sizeFactor+bajar,mx +35*sizeFactor,150*sizeFactor+bajar); //horizontal media
            gc.strokeLine(mx +10*sizeFactor,150*sizeFactor+bajar,mx +10*sizeFactor,175*sizeFactor+bajar);
            gc.strokeLine(mx +10*sizeFactor,175*sizeFactor+bajar,mx +35*sizeFactor,175*sizeFactor+bajar);
            
            mx = mx + 35*sizeFactor;}
            
        }}
        
        else{
            
            
            if(!nivelesD.isEmpty()){
            aux = (int) niveles.get(niveles.size()-1);
            gc.strokeLine(mx+5*aux +10*sizeFactor*tamanoD,125*sizeFactor*tamanoD+bajarD,mx+5*aux +35*sizeFactor*tamanoD,125*sizeFactor*tamanoD+bajarD);
            gc.strokeLine(mx+5*aux +35*sizeFactor*tamanoD,125*sizeFactor*tamanoD+bajarD,mx+5*aux +35*sizeFactor*tamanoD,150*sizeFactor*tamanoD+bajarD);
            gc.strokeLine(mx+5*aux +10*sizeFactor*tamanoD,150*sizeFactor*tamanoD+bajarD,mx+5*aux +35*sizeFactor*tamanoD,150*sizeFactor*tamanoD+bajarD); //horizontal media
            gc.strokeLine(mx+5*aux +10*sizeFactor*tamanoD,150*sizeFactor*tamanoD+bajarD,mx+5*aux +10*sizeFactor*tamanoD,175*sizeFactor*tamanoD+bajarD);
            gc.strokeLine(mx+5*aux +10*sizeFactor*tamanoD,175*sizeFactor*tamanoD+bajarD,mx+5*aux +35*sizeFactor*tamanoD,175*sizeFactor*tamanoD+bajarD);  
            
            reubicarD();
            
            gc.setStroke(myColorOperators);
            if((int) niveles.get(niveles.size()-1)==2){
            gc.strokeLine(mx+0+5 *aux,180-25,mx+60-15*aux,180-25);}
            
            else if((int) niveles.get(niveles.size()-1)==3){
            gc.strokeLine(mx+0+10 *aux,180-75,mx+60-15*aux,180-75);}
            
            
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            

            contD++;    
            }
            
            
            
            mx = mx+14*sizeFactor;
            
            }
            
            else{
                
                 if(contG==true){
                 aux = (int) niveles.get(niveles.size()-1);
                 gc.clearRect(mx+3.5*aux+ 10*sizeFactor*tamano, 114*tamano+bajar*sizeFactor, 100*sizeFactor*tamano, 100*sizeFactor*tamano);
                
                 gc.strokeLine(mx+5*aux +10*sizeFactor*tamano,125*sizeFactor*tamano+bajar,mx+5*aux +35*sizeFactor*tamano,125*sizeFactor*tamano+bajar);
                 gc.strokeLine(mx+5*aux +35*sizeFactor*tamano,125*sizeFactor*tamano+bajar,mx+5*aux +35*sizeFactor*tamano,150*sizeFactor*tamano+bajar);
                 gc.strokeLine(mx+5*aux +10*sizeFactor*tamano,150*sizeFactor*tamano+bajar,mx+5*aux +35*sizeFactor*tamano,150*sizeFactor*tamano+bajar); //horizontal media
                 gc.strokeLine(mx+5*aux +10*sizeFactor*tamano,150*sizeFactor*tamano+bajar,mx+5*aux +10*sizeFactor*tamano,175*sizeFactor*tamano+bajar);
                 gc.strokeLine(mx+5*aux +10*sizeFactor*tamano,175*sizeFactor*tamano+bajar,mx+5*aux +35*sizeFactor*tamano,175*sizeFactor*tamano+bajar);
                 gc.setStroke(myColorOperators);
                 dibuja_grados(gc,sizeFactor);
                 reubicar();
                 reubicar2();
                 
                 if(DD==false){
                 int contD = 0;
                 for(int x =0;x<niveles.size();x+=2){
            
            
            //Ejemplo con cambiar tamano y tener la division tiene 2 problemas.
            
            gc.strokeLine((mx+0+5*contD)*sizeFactor,(180-50*contD)*sizeFactor,(mx+60-5*contD)*sizeFactor,(180-50*contD)*sizeFactor);  
            
            
            
            contD++;    
            }}
            
            else if(DD==true){
            gc.strokeLine(mx+0,180,mx+60,180);
            gc.strokeLine(mx+0+5 *aux,180+50,mx+60-5*aux,180+50);
            
            }
            
            mx = mx + 35*sizeFactor*tamano;
                }
                

                else{
                     
                     
            if(contP==true){
                
            aux = (int) niveles.get(niveles.size()-1); 
             gc.strokeLine(mx +5*aux +10*sizeFactor*tamano,120*sizeFactor*tamano+bajar,mx +5*aux +20*sizeFactor*tamano,120*sizeFactor*tamano+bajar);
             gc.strokeLine(mx +5*aux +20*sizeFactor*tamano,120*sizeFactor*tamano+bajar,mx +5*aux +20*sizeFactor*tamano,130*sizeFactor*tamano+bajar);
             gc.strokeLine(mx +5*aux +20*sizeFactor*tamano,130*sizeFactor*tamano+bajar,mx +5*aux +10*sizeFactor*tamano,130*sizeFactor*tamano+bajar);
             gc.strokeLine(mx +5*aux +10*sizeFactor*tamano,130*sizeFactor*tamano+bajar,mx +5*aux +10*sizeFactor*tamano,140*sizeFactor*tamano+bajar);
             gc.strokeLine(mx +5*aux +10*sizeFactor*tamano,140*sizeFactor*tamano+bajar,mx +5*aux +20*sizeFactor*tamano,140*sizeFactor*tamano+bajar);
            
            gc.setStroke(myColorOperators);
            if(DD==false){
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            contD++;    
            }}
            
            else if(DD==true){
            gc.strokeLine(mx+0,180,mx+60,180);
            gc.strokeLine(mx+0+5 *aux,180+50,mx+60-5*aux,180+50);
            
            }
            
            mx = mx + 15*sizeFactor*tamano;
            

            }
            
            else{
                        
            aux = (int) niveles.get(niveles.size()-1);
            
        
            gc.strokeLine(mx+5*aux +10*sizeFactor*tamano,125*sizeFactor*tamano+bajar,mx+5*aux +35*sizeFactor*tamano,125*sizeFactor*tamano+bajar);
            gc.strokeLine(mx+5*aux +35*sizeFactor*tamano,125*sizeFactor*tamano+bajar,mx+5*aux +35*sizeFactor*tamano,150*sizeFactor*tamano+bajar);
            gc.strokeLine(mx+5*aux +10*sizeFactor*tamano,150*sizeFactor*tamano+bajar,mx+5*aux +35*sizeFactor*tamano,150*sizeFactor*tamano+bajar); //horizontal media
            gc.strokeLine(mx+5*aux +10*sizeFactor*tamano,150*sizeFactor*tamano+bajar,mx+5*aux +10*sizeFactor*tamano,175*sizeFactor*tamano+bajar);
            gc.strokeLine(mx+5*aux +10*sizeFactor*tamano,175*sizeFactor*tamano+bajar,mx+5*aux +35*sizeFactor*tamano,175*sizeFactor*tamano+bajar);
            
            reubicar();
            reubicar2();
            gc.setStroke(myColorOperators);
            if(DD==false){
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            
            //Ejemplo con cambiar tamano y tener la division tiene 2 problemas.
            
            gc.strokeLine((mx+0+5*contD)*sizeFactor,(180-50*contD)*sizeFactor,(mx+60-5*contD)*sizeFactor,(180-50*contD)*sizeFactor);  
            
            
            
            contD++;    
            }}
            
            else if(DD==true){
            gc.strokeLine(mx+0,180,mx+60,180);
            gc.strokeLine(mx+0+5 *aux,180+50,mx+60-5*aux,180+50);
            
            }
            
            mx = mx + 35*sizeFactor*tamano;}}
            
    }}}
    
    public static void dibuja_tres(GraphicsContext gc, ArrayList<String> operacion, Color myColorNumbers, double sizeFactor, Color myColorOperators){
        gc.setStroke(myColorNumbers);
        

       if(niveles.isEmpty()){
           
           if(contG==true){
            gc.clearRect(mx+10*sizeFactor, 40*sizeFactor, 100*sizeFactor, 100*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,125*sizeFactor,mx +35*sizeFactor,125*sizeFactor);
            gc.strokeLine(mx +35*sizeFactor,125*sizeFactor,mx +35*sizeFactor,175*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,150*sizeFactor,mx +35*sizeFactor,150*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,175*sizeFactor,mx +35*sizeFactor,175*sizeFactor);
            gc.setStroke(myColorOperators);
            dibuja_grados(gc,sizeFactor);
            mx = mx + 35*sizeFactor;
           }
           
           else{
               
            if(contP==true){
            
            gc.strokeLine(mx +10*sizeFactor,110*sizeFactor,mx +20*sizeFactor,110*sizeFactor);
            gc.strokeLine(mx +20*sizeFactor,110*sizeFactor,mx +20*sizeFactor,120*sizeFactor);
            gc.strokeLine(mx +20*sizeFactor,120*sizeFactor,mx +10*sizeFactor,120*sizeFactor);
            gc.strokeLine(mx +20*sizeFactor,120*sizeFactor,mx +20*sizeFactor,130*sizeFactor);
            gc.strokeLine(mx +20*sizeFactor,130*sizeFactor,mx +10*sizeFactor,130*sizeFactor);
            mx = mx + 15*sizeFactor;
            
            }
            
            else{
               
            gc.strokeLine(mx +10*sizeFactor,125*sizeFactor,mx +35*sizeFactor,125*sizeFactor);
            gc.strokeLine(mx +35*sizeFactor,125*sizeFactor,mx +35*sizeFactor,175*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,150*sizeFactor,mx +35*sizeFactor,150*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,175*sizeFactor,mx +35*sizeFactor,175*sizeFactor);
            mx = mx + 35*sizeFactor;}}}
    
       else{
       
       if(!nivelesD.isEmpty()){
            aux = (int) niveles.get(niveles.size()-1);
       
            gc.strokeLine(mx +5*aux +10*sizeFactor*tamanoD,125*sizeFactor*tamanoD+bajarD,mx +5*aux +35*sizeFactor*tamanoD,125*sizeFactor*tamanoD+bajarD);
            gc.strokeLine(mx +5*aux +35*sizeFactor*tamanoD,125*sizeFactor*tamanoD+bajarD,mx +5*aux +35*sizeFactor*tamanoD,175*sizeFactor*tamanoD+bajarD);
            gc.strokeLine(mx +5*aux +10*sizeFactor*tamanoD,150*sizeFactor*tamanoD+bajarD,mx +5*aux +35*sizeFactor*tamanoD,150*sizeFactor*tamanoD+bajarD);
            gc.strokeLine(mx +5*aux +10*sizeFactor*tamanoD,175*sizeFactor*tamanoD+bajarD,mx +5*aux +35*sizeFactor*tamanoD,175*sizeFactor*tamanoD+bajarD);
            
            reubicarD();
            gc.setStroke(myColorOperators);
            if((int) niveles.get(niveles.size()-1)==2){
            gc.strokeLine(mx+0+5 *aux,180-25,mx+60-15*aux,180-25);}
            
            else if((int) niveles.get(niveles.size()-1)==3){
            gc.strokeLine(mx+0+10 *aux,180-75,mx+60-15*aux,180-75);}
            
            
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            

            contD++;    
            }

            mx = mx+14*sizeFactor;
            
            
       }
       else{
             
                 if(contG==true){
                 aux = (int) niveles.get(niveles.size()-1);
                 gc.clearRect(mx+3.5*aux+ 10*sizeFactor*tamano, 114*tamano+bajar*sizeFactor, 100*sizeFactor*tamano, 100*sizeFactor*tamano);
            
                 gc.strokeLine(mx +5*aux +10*sizeFactor*tamano,125*sizeFactor*tamano+bajar,mx +5*aux +35*sizeFactor*tamano,125*sizeFactor*tamano+bajar);
                 gc.strokeLine(mx +5*aux +35*sizeFactor*tamano,125*sizeFactor*tamano+bajar,mx +5*aux +35*sizeFactor*tamano,175*sizeFactor*tamano+bajar);
                 gc.strokeLine(mx +5*aux +10*sizeFactor*tamano,150*sizeFactor*tamano+bajar,mx +5*aux +35*sizeFactor*tamano,150*sizeFactor*tamano+bajar);
                 gc.strokeLine(mx +5*aux +10*sizeFactor*tamano,175*sizeFactor*tamano+bajar,mx +5*aux +35*sizeFactor*tamano,175*sizeFactor*tamano+bajar);
                 gc.setStroke(myColorOperators);
                 dibuja_grados(gc,sizeFactor);
                 
                 reubicar();
                 reubicar2();
            
            if(DD==false){
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  

            contD++;    
            }}
            
            else if(DD==true){
            gc.strokeLine(mx+0,180,mx+60,180);
            gc.strokeLine(mx+0+5 *aux,180+50,mx+60-5*aux,180+50);
            
            }
            
            mx = mx + 35*sizeFactor*tamano;
            
            }
           
            else{
                     
            if(contP==true){
                
            aux = (int) niveles.get(niveles.size()-1); 
            
            
            gc.strokeLine(mx +5*aux +10*sizeFactor*tamano,120*sizeFactor*tamano+bajar,mx +5*aux +20*sizeFactor*tamano,120*sizeFactor*tamano+bajar);
            gc.strokeLine(mx +5*aux +20*sizeFactor*tamano,120*sizeFactor*tamano+bajar,mx +5*aux +20*sizeFactor*tamano,130*sizeFactor*tamano+bajar);
            gc.strokeLine(mx +5*aux +20*sizeFactor*tamano,130*sizeFactor*tamano+bajar,mx +5*aux +10*sizeFactor*tamano,130*sizeFactor*tamano+bajar);
            gc.strokeLine(mx +5*aux +20*sizeFactor*tamano,130*sizeFactor*tamano+bajar,mx +5*aux +20*sizeFactor*tamano,140*sizeFactor*tamano+bajar);
            gc.strokeLine(mx +5*aux +20*sizeFactor*tamano,140*sizeFactor*tamano+bajar,mx +5*aux +10*sizeFactor*tamano,140*sizeFactor*tamano+bajar);
            
            reubicar();
            reubicar2();
            gc.setStroke(myColorOperators);
            if(DD==false){
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            
            
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            
            
            
            contD++;    
            }}
            
            else if(DD==true){
            gc.strokeLine(mx+0,180,mx+60,180);
            gc.strokeLine(mx+0+5 *aux,180+50,mx+60-5*aux,180+50);
            
            }
            
            mx = mx + 15*sizeFactor*tamano;
            }
            
            
            else{         
           
            aux = (int) niveles.get(niveles.size()-1);
       
            gc.strokeLine(mx +5*aux +10*sizeFactor*tamano,125*sizeFactor*tamano+bajar,mx +5*aux +35*sizeFactor*tamano,125*sizeFactor*tamano+bajar);
            gc.strokeLine(mx +5*aux +35*sizeFactor*tamano,125*sizeFactor*tamano+bajar,mx +5*aux +35*sizeFactor*tamano,175*sizeFactor*tamano+bajar);
            gc.strokeLine(mx +5*aux +10*sizeFactor*tamano,150*sizeFactor*tamano+bajar,mx +5*aux +35*sizeFactor*tamano,150*sizeFactor*tamano+bajar);
            gc.strokeLine(mx +5*aux +10*sizeFactor*tamano,175*sizeFactor*tamano+bajar,mx +5*aux +35*sizeFactor*tamano,175*sizeFactor*tamano+bajar);
       
            reubicar();
            reubicar2();
            gc.setStroke(myColorOperators);
            if(DD==false){
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            
            
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            
            
            
            contD++;    
            }}
            
            else if(DD==true){
            gc.strokeLine(mx+0,180,mx+60,180);
            gc.strokeLine(mx+0+5 *aux,180+50,mx+60-5*aux,180+50);
            
            }
            
            mx = mx + 35*sizeFactor*tamano;
       
       }}}}}
    
    public static void dibuja_cuatro(GraphicsContext gc, ArrayList<String> operacion, Color myColorNumbers, double sizeFactor, Color myColorOperators){
        gc.setStroke(myColorNumbers);
        
        if(niveles.isEmpty()){
            
            if(contG==true){
            gc.clearRect(mx+10*sizeFactor, 40*sizeFactor, 100*sizeFactor, 100*sizeFactor);
            
            gc.strokeLine(mx +35*sizeFactor,125*sizeFactor,mx +35*sizeFactor,175*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,150*sizeFactor,mx +35*sizeFactor,150*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,125*sizeFactor,mx +10*sizeFactor,150*sizeFactor);
            gc.setStroke(myColorOperators);
            dibuja_grados(gc,sizeFactor);
            mx = mx + 35*sizeFactor;
            }
            
            else{
                
            if(contP==true){
            gc.strokeLine(mx +20*sizeFactor,110*sizeFactor,mx +20*sizeFactor,130*sizeFactor);
            gc.strokeLine(mx +20*sizeFactor,120*sizeFactor,mx +10*sizeFactor,120*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,120*sizeFactor,mx +10*sizeFactor,110*sizeFactor);
           
            mx = mx + 15*sizeFactor;
            }    
            else{
            gc.strokeLine(mx +35*sizeFactor,125*sizeFactor,mx +35*sizeFactor,175*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,150*sizeFactor,mx +35*sizeFactor,150*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,125*sizeFactor,mx +10*sizeFactor,150*sizeFactor);
            mx = mx + 35*sizeFactor;}}
        }
        else{
        
        if(!nivelesD.isEmpty()){
            aux = (int) niveles.get(niveles.size()-1);
        
            
            gc.strokeLine(mx +5*aux +35*sizeFactor*tamanoD,125*sizeFactor*tamanoD+bajarD,mx +5*aux +35*sizeFactor*tamanoD,175*sizeFactor*tamanoD+bajarD);
            gc.strokeLine(mx +5*aux +10*sizeFactor*tamanoD,150*sizeFactor*tamanoD+bajarD,mx +5*aux +35*sizeFactor*tamanoD,150*sizeFactor*tamanoD+bajarD);
            gc.strokeLine(mx +5*aux +10*sizeFactor*tamanoD,125*sizeFactor*tamanoD+bajarD,mx +5*aux +10*sizeFactor*tamanoD,150*sizeFactor*tamanoD+bajarD);
            
            reubicarD();
            gc.setStroke(myColorOperators);
            if((int) niveles.get(niveles.size()-1)==2){
            gc.strokeLine(mx+0+5 *aux,180-25,mx+60-15*aux,180-25);}
            
            else if((int) niveles.get(niveles.size()-1)==3){
            gc.strokeLine(mx+0+10 *aux,180-75,mx+60-15*aux,180-75);}
            
            
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            

            contD++;    
            }

            mx = mx+14*sizeFactor;
        }
        else{
        
            if(contG==true){
                 aux = (int) niveles.get(niveles.size()-1);
                 gc.clearRect(mx+3.5*aux+ 10*sizeFactor*tamano, 114*tamano+bajar*sizeFactor, 100*sizeFactor*tamano, 100*sizeFactor*tamano);
            
                 gc.strokeLine(mx +5*aux +35*sizeFactor*tamano,125*sizeFactor*tamano+bajar,mx +5*aux +35*sizeFactor*tamano,175*sizeFactor*tamano+bajar);
                 gc.strokeLine(mx +5*aux +10*sizeFactor*tamano,150*sizeFactor*tamano+bajar,mx +5*aux +35*sizeFactor*tamano,150*sizeFactor*tamano+bajar);
                 gc.strokeLine(mx +5*aux +10*sizeFactor*tamano,125*sizeFactor*tamano+bajar,mx +5*aux +10*sizeFactor*tamano,150*sizeFactor*tamano+bajar);
                 gc.setStroke(myColorOperators);
                 dibuja_grados(gc,sizeFactor);
                 reubicar();
                 reubicar2();
            
            if(DD==false){
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            
            
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            
            
            
            contD++;    
            }}
            
            else if(DD==true){
            gc.strokeLine(mx+0,180,mx+60,180);
            gc.strokeLine(mx+0+5 *aux,180+50,mx+60-5*aux,180+50);
            
            }
            
            mx = mx + 35*sizeFactor*tamano;
            
            
            }
            
            
            
            else{
                
            if(contP==true){
                
            aux = (int) niveles.get(niveles.size()-1);
            
            gc.strokeLine(mx +5*aux+20*sizeFactor*tamano,120*sizeFactor*tamano+bajar,mx +5*aux+20*sizeFactor*tamano,140*sizeFactor*tamano+bajar);
            gc.strokeLine(mx +5*aux+20*sizeFactor*tamano,130*sizeFactor*tamano+bajar,mx +5*aux+10*sizeFactor*tamano,130*sizeFactor*tamano+bajar);
            gc.strokeLine(mx +5*aux+10*sizeFactor*tamano,130*sizeFactor*tamano+bajar,mx +5*aux+10*sizeFactor*tamano,120*sizeFactor*tamano+bajar);
            
            reubicar();
            reubicar2();
            gc.setStroke(myColorOperators);
            if(DD==false){
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            
            
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            
            
            
            contD++;    
            }}
            
            else if(DD==true){
            gc.strokeLine(mx+0,180,mx+60,180);
            gc.strokeLine(mx+0+5 *aux,180+50,mx+60-5*aux,180+50);
            
            }
            
            mx = mx + 15*sizeFactor*tamano;
            
            }
            
            else{
                
            aux = (int) niveles.get(niveles.size()-1);
        
            gc.strokeLine(mx +5*aux +35*sizeFactor*tamano,125*sizeFactor*tamano+bajar,mx +5*aux +35*sizeFactor*tamano,175*sizeFactor*tamano+bajar);
            gc.strokeLine(mx +5*aux +10*sizeFactor*tamano,150*sizeFactor*tamano+bajar,mx +5*aux +35*sizeFactor*tamano,150*sizeFactor*tamano+bajar);
            gc.strokeLine(mx +5*aux +10*sizeFactor*tamano,125*sizeFactor*tamano+bajar,mx +5*aux +10*sizeFactor*tamano,150*sizeFactor*tamano+bajar);
        
            reubicar();
            reubicar2();
            gc.setStroke(myColorOperators);
            if(DD==false){
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            
            
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            
            
            
            contD++;    
            }}
            
            else if(DD==true){
            gc.strokeLine(mx+0,180,mx+60,180);
            gc.strokeLine(mx+0+5 *aux,180+50,mx+60-5*aux,180+50);
            
            }
            
            mx = mx + 35*sizeFactor*tamano;
        }}}}}
          
    public static void dibuja_cinco(GraphicsContext gc, ArrayList<String> operacion, Color myColorNumbers, double sizeFactor, Color myColorOperators){
        gc.setStroke(myColorNumbers);
        
        if(niveles.isEmpty()){
            
            if(contG==true){
            gc.clearRect(mx+10*sizeFactor, 40*sizeFactor, 100*sizeFactor, 100*sizeFactor);
            
            gc.strokeLine(mx +10*sizeFactor,125*sizeFactor,mx +35*sizeFactor,125*sizeFactor);
            gc.strokeLine(mx +35*sizeFactor,150*sizeFactor,mx +35*sizeFactor,175*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,150*sizeFactor,mx +35*sizeFactor,150*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,125*sizeFactor,mx +10*sizeFactor,150*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,175*sizeFactor,mx +35*sizeFactor,175*sizeFactor);
            gc.setStroke(myColorOperators);
            dibuja_grados(gc,sizeFactor);
            
            mx = mx + 35*sizeFactor;}
            
            else{
                
            if(contP==true){
            
                gc.strokeLine(mx +10*sizeFactor,130*sizeFactor,mx +20*sizeFactor,130*sizeFactor);
                gc.strokeLine(mx +20*sizeFactor,130*sizeFactor,mx +20*sizeFactor,120*sizeFactor);
                gc.strokeLine(mx +20*sizeFactor,120*sizeFactor,mx +10*sizeFactor,120*sizeFactor);
                gc.strokeLine(mx +10*sizeFactor,120*sizeFactor,mx +10*sizeFactor,110*sizeFactor);
                gc.strokeLine(mx +10*sizeFactor,110*sizeFactor,mx +20*sizeFactor,110*sizeFactor);
                mx = mx + 15*sizeFactor;
            }    
            
            else{
            gc.strokeLine(mx +10*sizeFactor,125*sizeFactor,mx +35*sizeFactor,125*sizeFactor);
            gc.strokeLine(mx +35*sizeFactor,150*sizeFactor,mx +35*sizeFactor,175*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,150*sizeFactor,mx +35*sizeFactor,150*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,125*sizeFactor,mx +10*sizeFactor,150*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,175*sizeFactor,mx +35*sizeFactor,175*sizeFactor);
            mx = mx + 35*sizeFactor;}}
        }
        
        else{
        
        if(!nivelesD.isEmpty()){
        
            aux = (int) niveles.get(niveles.size()-1);
            gc.strokeLine(mx +5*aux +10*sizeFactor*tamanoD,125*sizeFactor*tamanoD+bajarD,mx +5*aux +35*sizeFactor*tamanoD,125*sizeFactor*tamanoD+bajarD);
            gc.strokeLine(mx +5*aux +35*sizeFactor*tamanoD,150*sizeFactor*tamanoD+bajarD,mx +5*aux +35*sizeFactor*tamanoD,175*sizeFactor*tamanoD+bajarD);
            gc.strokeLine(mx +5*aux +10*sizeFactor*tamanoD,150*sizeFactor*tamanoD+bajarD,mx +5*aux +35*sizeFactor*tamanoD,150*sizeFactor*tamanoD+bajarD);
            gc.strokeLine(mx +5*aux +10*sizeFactor*tamanoD,125*sizeFactor*tamanoD+bajarD,mx +5*aux +10*sizeFactor*tamanoD,150*sizeFactor*tamanoD+bajarD);
            gc.strokeLine(mx +5*aux +10*sizeFactor*tamanoD,175*sizeFactor*tamanoD+bajarD,mx +5*aux +35*sizeFactor*tamanoD,175*sizeFactor*tamanoD+bajarD);
            
            reubicarD();
            gc.setStroke(myColorOperators);
            if((int) niveles.get(niveles.size()-1)==2){
            gc.strokeLine(mx+0+5 *aux,180-25,mx+60-15*aux,180-25);}
            
            else if((int) niveles.get(niveles.size()-1)==3){
            gc.strokeLine(mx+0+10 *aux,180-75,mx+60-15*aux,180-75);}
            
            
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            

            contD++;    
            }

            mx = mx+14*sizeFactor;

        }
        else{
            
            if(contG==true){
                 aux = (int) niveles.get(niveles.size()-1);
                 gc.clearRect(mx+3.5*aux+ 10*sizeFactor*tamano, 114*tamano+bajar*sizeFactor, 100*sizeFactor*tamano, 100*sizeFactor*tamano);
            
                 aux = (int) niveles.get(niveles.size()-1);
                 gc.strokeLine(mx +5*aux +10*sizeFactor*tamano,125*sizeFactor*tamano+bajar,mx +5*aux +35*sizeFactor*tamano,125*sizeFactor*tamano+bajar);
                 gc.strokeLine(mx +5*aux +35*sizeFactor*tamano,150*sizeFactor*tamano+bajar,mx +5*aux +35*sizeFactor*tamano,175*sizeFactor*tamano+bajar);
                 gc.strokeLine(mx +5*aux +10*sizeFactor*tamano,150*sizeFactor*tamano+bajar,mx +5*aux +35*sizeFactor*tamano,150*sizeFactor*tamano+bajar);
                 gc.strokeLine(mx +5*aux +10*sizeFactor*tamano,125*sizeFactor*tamano+bajar,mx +5*aux +10*sizeFactor*tamano,150*sizeFactor*tamano+bajar);
                 gc.strokeLine(mx +5*aux +10*sizeFactor*tamano,175*sizeFactor*tamano+bajar,mx +5*aux +35*sizeFactor*tamano,175*sizeFactor*tamano+bajar);
                 gc.setStroke(myColorOperators);
                 dibuja_grados(gc,sizeFactor);
        
            reubicar();
            reubicar2();
            
            if(DD==false){
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            
            
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            
            
            
            contD++;    
            }}
            
            else if(DD==true){
            gc.strokeLine(mx+0,180,mx+60,180);
            gc.strokeLine(mx+0+5 *aux,180+50,mx+60-5*aux,180+50);
            
            }
            
            mx = mx + 35*sizeFactor*tamano;
            
            
            }
            
            else{
                
                
            if(contP==true){
                
                aux = (int) niveles.get(niveles.size()-1);
            
                gc.strokeLine(mx +5*aux+10*sizeFactor*tamano,140*sizeFactor*tamano+bajar,mx +5*aux+20*sizeFactor*tamano,140*sizeFactor*tamano+bajar);
                gc.strokeLine(mx +5*aux+20*sizeFactor*tamano,140*sizeFactor*tamano+bajar,mx +5*aux+20*sizeFactor*tamano,130*sizeFactor*tamano+bajar);
                gc.strokeLine(mx +5*aux+20*sizeFactor*tamano,130*sizeFactor*tamano+bajar,mx +5*aux+10*sizeFactor*tamano,130*sizeFactor*tamano+bajar);
                gc.strokeLine(mx +5*aux+10*sizeFactor*tamano,130*sizeFactor*tamano+bajar,mx +5*aux+10*sizeFactor*tamano,120*sizeFactor*tamano+bajar);
                gc.strokeLine(mx +5*aux+10*sizeFactor*tamano,120*sizeFactor*tamano+bajar,mx +5*aux+20*sizeFactor*tamano,120*sizeFactor*tamano+bajar);
                gc.setStroke(myColorOperators);
                reubicar();
                reubicar2();
            
            if(DD==false){
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            
            
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            
            
            
            contD++;    
            }}
            
            else if(DD==true){
            gc.strokeLine(mx+0,180,mx+60,180);
            gc.strokeLine(mx+0+5 *aux,180+50,mx+60-5*aux,180+50);
            
            }
                mx = mx + 15*sizeFactor*tamano;
            
            }
            
            else{
            
            aux = (int) niveles.get(niveles.size()-1);
            gc.strokeLine(mx +5*aux +10*sizeFactor*tamano,125*sizeFactor*tamano+bajar,mx +5*aux +35*sizeFactor*tamano,125*sizeFactor*tamano+bajar);
            gc.strokeLine(mx +5*aux +35*sizeFactor*tamano,150*sizeFactor*tamano+bajar,mx +5*aux +35*sizeFactor*tamano,175*sizeFactor*tamano+bajar);
            gc.strokeLine(mx +5*aux +10*sizeFactor*tamano,150*sizeFactor*tamano+bajar,mx +5*aux +35*sizeFactor*tamano,150*sizeFactor*tamano+bajar);
            gc.strokeLine(mx +5*aux +10*sizeFactor*tamano,125*sizeFactor*tamano+bajar,mx +5*aux +10*sizeFactor*tamano,150*sizeFactor*tamano+bajar);
            gc.strokeLine(mx +5*aux +10*sizeFactor*tamano,175*sizeFactor*tamano+bajar,mx +5*aux +35*sizeFactor*tamano,175*sizeFactor*tamano+bajar);
        
        
            reubicar();
            reubicar2();
            gc.setStroke(myColorOperators);
            if(DD==false){
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            
            
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            
            
            
            contD++;    
            }}
            
            else if(DD==true){
            gc.strokeLine(mx+0,180,mx+60,180);
            gc.strokeLine(mx+0+5 *aux,180+50,mx+60-5*aux,180+50);
            
            }
            
            mx = mx + 35*sizeFactor*tamano;
        
        }}}}}
    
    public static void dibuja_seis(GraphicsContext gc, ArrayList<String> operacion, Color myColorNumbers, double sizeFactor, Color myColorOperators){
        gc.setStroke(myColorNumbers);
        
        if(niveles.isEmpty()){
            
            if(contG==true){
            gc.clearRect(mx+10*sizeFactor, 40*sizeFactor, 100*sizeFactor, 100*sizeFactor);
            
            gc.strokeLine(mx +10*sizeFactor,125*sizeFactor+bajar,mx +35*sizeFactor,125*sizeFactor+bajar);   //arriba
            gc.strokeLine(mx +10*sizeFactor,175*sizeFactor+bajar,mx +35*sizeFactor,175*sizeFactor+bajar);   //abajo
            gc.strokeLine(mx +10*sizeFactor,125*sizeFactor+bajar,mx +10*sizeFactor,175*sizeFactor+bajar);   //izquierda
            gc.strokeLine(mx +35*sizeFactor,150*sizeFactor+bajar,mx +35*sizeFactor,175*sizeFactor+bajar);   //derecha abajo
            gc.strokeLine(mx +10*sizeFactor,150*sizeFactor+bajar,mx +35*sizeFactor,150*sizeFactor+bajar);
            gc.setStroke(myColorOperators);
            dibuja_grados(gc,sizeFactor);
            mx = mx + 35*sizeFactor;
            
            
            }
            
            else{
                
            if(contP==true){
            
            gc.strokeLine(mx +10*sizeFactor,130*sizeFactor,mx +20*sizeFactor,130*sizeFactor);
            gc.strokeLine(mx +20*sizeFactor,130*sizeFactor,mx +20*sizeFactor,120*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,130*sizeFactor,mx +10*sizeFactor,120*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,120*sizeFactor,mx +20*sizeFactor,120*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,120*sizeFactor,mx +10*sizeFactor,110*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,110*sizeFactor,mx +20*sizeFactor,110*sizeFactor);
          
            mx = mx + 15*sizeFactor;
            }
            
            else{
                
            gc.strokeLine(mx +10*sizeFactor,125*sizeFactor+bajar,mx +35*sizeFactor,125*sizeFactor+bajar);   //arriba
            gc.strokeLine(mx +10*sizeFactor,175*sizeFactor+bajar,mx +35*sizeFactor,175*sizeFactor+bajar);   //abajo
            gc.strokeLine(mx +10*sizeFactor,125*sizeFactor+bajar,mx +10*sizeFactor,175*sizeFactor+bajar);   //izquierda
            gc.strokeLine(mx +35*sizeFactor,150*sizeFactor+bajar,mx +35*sizeFactor,175*sizeFactor+bajar);   //derecha abajo
            gc.strokeLine(mx +10*sizeFactor,150*sizeFactor+bajar,mx +35*sizeFactor,150*sizeFactor+bajar);
            mx = mx + 35*sizeFactor;}}
        }
        else{
        
        if(!nivelesD.isEmpty()){
            aux = (int) niveles.get(niveles.size()-1);
        
            
            gc.strokeLine(mx+5*aux +10*sizeFactor*tamanoD,125*sizeFactor*tamanoD+bajarD,mx+5*aux +35*sizeFactor*tamanoD,125*sizeFactor*tamanoD+bajarD);   //arriba
            gc.strokeLine(mx+5*aux +10*sizeFactor*tamanoD,175*sizeFactor*tamanoD+bajarD,mx+5*aux +35*sizeFactor*tamanoD,175*sizeFactor*tamanoD+bajarD);   //abajo
            gc.strokeLine(mx+5*aux +10*sizeFactor*tamanoD,125*sizeFactor*tamanoD+bajarD,mx+5*aux +10*sizeFactor*tamanoD,175*sizeFactor*tamanoD+bajarD);   //izquierda
            gc.strokeLine(mx+5*aux +35*sizeFactor*tamanoD,150*sizeFactor*tamanoD+bajarD,mx+5*aux +35*sizeFactor*tamanoD,175*sizeFactor*tamanoD+bajarD);   //derecha abajo
            gc.strokeLine(mx+5*aux +10*sizeFactor*tamanoD,150*sizeFactor*tamanoD+bajarD,mx+5*aux +35*sizeFactor*tamanoD,150*sizeFactor*tamanoD+bajarD);
            
            reubicarD();
            gc.setStroke(myColorOperators);
            if((int) niveles.get(niveles.size()-1)==2){
            gc.strokeLine(mx+0+5 *aux,180-25,mx+60-15*aux,180-25);}
            
            else if((int) niveles.get(niveles.size()-1)==3){
            gc.strokeLine(mx+0+10 *aux,180-75,mx+60-15*aux,180-75);}
            
            
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            

            contD++;    
            }

            mx = mx+14*sizeFactor;
        }
        else{
           
            if(contG==true){
                 aux = (int) niveles.get(niveles.size()-1);
                 gc.clearRect(mx+3.5*aux+ 10*sizeFactor*tamano, 114*tamano+bajar*sizeFactor, 100*sizeFactor*tamano, 100*sizeFactor*tamano);
            
                 gc.strokeLine(mx+5*aux +10*sizeFactor*tamano,125*sizeFactor*tamano+bajar,mx+5*aux +35*sizeFactor*tamano,125*sizeFactor*tamano+bajar);   //arriba
                 gc.strokeLine(mx+5*aux +10*sizeFactor*tamano,175*sizeFactor*tamano+bajar,mx+5*aux +35*sizeFactor*tamano,175*sizeFactor*tamano+bajar);   //abajo
                 gc.strokeLine(mx+5*aux +10*sizeFactor*tamano,125*sizeFactor*tamano+bajar,mx+5*aux +10*sizeFactor*tamano,175*sizeFactor*tamano+bajar);   //izquierda
                 gc.strokeLine(mx+5*aux +35*sizeFactor*tamano,150*sizeFactor*tamano+bajar,mx+5*aux +35*sizeFactor*tamano,175*sizeFactor*tamano+bajar);   //derecha abajo
                 gc.strokeLine(mx+5*aux +10*sizeFactor*tamano,150*sizeFactor*tamano+bajar,mx+5*aux +35*sizeFactor*tamano,150*sizeFactor*tamano+bajar); 
                 
                 gc.setStroke(myColorOperators);
                 dibuja_grados(gc,sizeFactor);
                 reubicar();
                 reubicar2();
            
            if(DD==false){
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            
            
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            
            
            
            contD++;    
            }}
            
            else if(DD==true){
            gc.strokeLine(mx+0,180,mx+60,180);
            gc.strokeLine(mx+0+5 *aux,180+50,mx+60-5*aux,180+50);
            
            }
            
            mx = mx + 35*sizeFactor*tamano;
            
            
            }
            
            
            
            else{
                
            if(contP==true){
                
            aux = (int) niveles.get(niveles.size()-1);
            
            gc.strokeLine(mx +5*aux+10*sizeFactor*tamano,140*sizeFactor*tamano+bajar,mx +5*aux+20*sizeFactor*tamano,140*sizeFactor*tamano+bajar);
            gc.strokeLine(mx +5*aux+20*sizeFactor*tamano,140*sizeFactor*tamano+bajar,mx +5*aux+20*sizeFactor*tamano,130*sizeFactor*tamano+bajar);
            gc.strokeLine(mx +5*aux+10*sizeFactor*tamano,140*sizeFactor*tamano+bajar,mx +5*aux+10*sizeFactor*tamano,130*sizeFactor*tamano+bajar);
            gc.strokeLine(mx +5*aux+10*sizeFactor*tamano,130*sizeFactor*tamano+bajar,mx +5*aux+20*sizeFactor*tamano,130*sizeFactor*tamano+bajar);
            gc.strokeLine(mx +5*aux+10*sizeFactor*tamano,130*sizeFactor*tamano+bajar,mx +5*aux+10*sizeFactor*tamano,120*sizeFactor*tamano+bajar);
            gc.strokeLine(mx +5*aux+10*sizeFactor*tamano,120*sizeFactor*tamano+bajar,mx +5*aux+20*sizeFactor*tamano,120*sizeFactor*tamano+bajar);
            
            reubicar();
            reubicar2();
            gc.setStroke(myColorOperators);
            if(DD==false){
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            
            
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            
            
            
            contD++;    
            }}
            
            else if(DD==true){
            gc.strokeLine(mx+0,180,mx+60,180);
            gc.strokeLine(mx+0+5 *aux,180+50,mx+60-5*aux,180+50);
            
            }
            
            mx = mx + 15*sizeFactor*tamano;
            
            }
            
            
            else{
                
            aux = (int) niveles.get(niveles.size()-1);
        
            gc.strokeLine(mx+5*aux +10*sizeFactor*tamano,125*sizeFactor*tamano+bajar,mx+5*aux +35*sizeFactor*tamano,125*sizeFactor*tamano+bajar);   //arriba
            gc.strokeLine(mx+5*aux +10*sizeFactor*tamano,175*sizeFactor*tamano+bajar,mx+5*aux +35*sizeFactor*tamano,175*sizeFactor*tamano+bajar);   //abajo
            gc.strokeLine(mx+5*aux +10*sizeFactor*tamano,125*sizeFactor*tamano+bajar,mx+5*aux +10*sizeFactor*tamano,175*sizeFactor*tamano+bajar);   //izquierda
            gc.strokeLine(mx+5*aux +35*sizeFactor*tamano,150*sizeFactor*tamano+bajar,mx+5*aux +35*sizeFactor*tamano,175*sizeFactor*tamano+bajar);   //derecha abajo
            gc.strokeLine(mx+5*aux +10*sizeFactor*tamano,150*sizeFactor*tamano+bajar,mx+5*aux +35*sizeFactor*tamano,150*sizeFactor*tamano+bajar); 
        
            reubicar();
            reubicar2();
            gc.setStroke(myColorOperators);
            if(DD==false){
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            
            
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            
            
            
            contD++;    
            }}
            
            else if(DD==true){
            gc.strokeLine(mx+0,180,mx+60,180);
            gc.strokeLine(mx+0+5 *aux,180+50,mx+60-5*aux,180+50);
            
            }
            
            mx = mx + 35*sizeFactor*tamano;
        }}}}}
        
    public static void dibuja_siete(GraphicsContext gc, ArrayList<String> operacion, Color myColorNumbers, double sizeFactor, Color myColorOperators){
        gc.setStroke(myColorNumbers);
        
        if(niveles.isEmpty()){
            
            if(contG==true){
            gc.clearRect(mx+10*sizeFactor, 40*sizeFactor, 100*sizeFactor, 100*sizeFactor);
                gc.strokeLine(mx +10*sizeFactor,125*sizeFactor+bajar,mx +35*sizeFactor,125*sizeFactor+bajar);   //arriba
                gc.strokeLine(mx +10*sizeFactor,125*sizeFactor+bajar,mx +10*sizeFactor,150*sizeFactor+bajar);   //izquierda arriba
                gc.strokeLine(mx +35*sizeFactor,125*sizeFactor+bajar,mx +35*sizeFactor,175*sizeFactor+bajar); 
                
                gc.setStroke(myColorOperators);
                dibuja_grados(gc,sizeFactor);
            
            
            mx = mx + 35*sizeFactor;
            }
            
            else{
                
            if(contP==true){
            gc.strokeLine(mx +20*sizeFactor,130*sizeFactor,mx +20*sizeFactor,110*sizeFactor);
            gc.strokeLine(mx +20*sizeFactor,110*sizeFactor,mx +10*sizeFactor,110*sizeFactor);
            gc.strokeLine(mx +10*sizeFactor,110*sizeFactor,mx +10*sizeFactor,120*sizeFactor);
            mx = mx + 15*sizeFactor;
            
            }
            
            else{
                
            gc.strokeLine(mx +10*sizeFactor,125*sizeFactor+bajar,mx +35*sizeFactor,125*sizeFactor+bajar);   //arriba
            gc.strokeLine(mx +10*sizeFactor,125*sizeFactor+bajar,mx +10*sizeFactor,150*sizeFactor+bajar);   //izquierda arriba
            gc.strokeLine(mx +35*sizeFactor,125*sizeFactor+bajar,mx +35*sizeFactor,175*sizeFactor+bajar);
            mx = mx + 35*sizeFactor;}}
        }
        else{
        
        if(!nivelesD.isEmpty()){
            aux = (int) niveles.get(niveles.size()-1);
        
            
            gc.strokeLine(mx+5*aux +10*sizeFactor*tamanoD,125*sizeFactor*tamanoD+bajarD,mx+5*aux +35*sizeFactor*tamanoD,125*sizeFactor*tamanoD+bajarD);   //arriba
            gc.strokeLine(mx+5*aux +10*sizeFactor*tamanoD,125*sizeFactor*tamanoD+bajarD,mx+5*aux +10*sizeFactor*tamanoD,150*sizeFactor*tamanoD+bajarD);   //izquierda arriba
            gc.strokeLine(mx+5*aux +35*sizeFactor*tamanoD,125*sizeFactor*tamanoD+bajarD,mx+5*aux +35*sizeFactor*tamanoD,175*sizeFactor*tamanoD+bajarD);
            gc.setStroke(myColorOperators);
            
            
            reubicarD();
            
            if((int) niveles.get(niveles.size()-1)==2){
            gc.strokeLine(mx+0+5 *aux,180-25,mx+60-15*aux,180-25);}
            
            else if((int) niveles.get(niveles.size()-1)==3){
            gc.strokeLine(mx+0+10 *aux,180-75,mx+60-15*aux,180-75);}
            
            
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            

            contD++;    
            }

            mx = mx+14*sizeFactor;
        }
        else{
        //dfdsfdfdsdff
            if(contG==true){
                 aux = (int) niveles.get(niveles.size()-1);
                 gc.clearRect(mx+3.5*aux+ 10*sizeFactor*tamano, 114*tamano+bajar*sizeFactor, 100*sizeFactor*tamano, 100*sizeFactor*tamano);
            
                gc.strokeLine(mx+5*aux +10*sizeFactor*tamano,125*sizeFactor*tamano+bajar,mx+5*aux +35*sizeFactor*tamano,125*sizeFactor*tamano+bajar);   //arriba
                gc.strokeLine(mx+5*aux +10*sizeFactor*tamano,125*sizeFactor*tamano+bajar,mx+5*aux +10*sizeFactor*tamano,150*sizeFactor*tamano+bajar);   //izquierda arriba
                gc.strokeLine(mx+5*aux +35*sizeFactor*tamano,125*sizeFactor*tamano+bajar,mx+5*aux +35*sizeFactor*tamano,175*sizeFactor*tamano+bajar); 
                 gc.setStroke(myColorOperators);
                 dibuja_grados(gc,sizeFactor);
                 reubicar();
                 reubicar2();
            
            if(DD==false){
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            
            
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            
            
            
            contD++;    
            }}
            
            else if(DD==true){
            gc.strokeLine(mx+0,180,mx+60,180);
            gc.strokeLine(mx+0+5 *aux,180+50,mx+60-5*aux,180+50);
            
            }
            
            mx = mx + 35*sizeFactor*tamano;
            
            
            }
            
            
            
            else{
                
            if(contP==true){
                
            aux = (int) niveles.get(niveles.size()-1);
            
            gc.strokeLine(mx +5*aux+20*sizeFactor*tamano,140*sizeFactor*tamano+bajar,mx +5*aux+20*sizeFactor*tamano,120*sizeFactor*tamano+bajar);
            gc.strokeLine(mx +5*aux+20*sizeFactor*tamano,120*sizeFactor*tamano+bajar,mx +5*aux+10*sizeFactor*tamano,120*sizeFactor*tamano+bajar);
            gc.strokeLine(mx +5*aux+10*sizeFactor*tamano,120*sizeFactor*tamano+bajar,mx +5*aux+10*sizeFactor*tamano,130*sizeFactor*tamano+bajar);
            gc.setStroke(myColorOperators);
            reubicar();
            reubicar2();
            
            if(DD==false){
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            
            
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            
            
            
            contD++;    
            }}
            
            else if(DD==true){
            gc.strokeLine(mx+0,180,mx+60,180);
            gc.strokeLine(mx+0+5 *aux,180+50,mx+60-5*aux,180+50);
            
            }
     
            mx = mx + 15*sizeFactor*tamano;
            
            }
            
            else{
                
            aux = (int) niveles.get(niveles.size()-1);
        
                gc.strokeLine(mx+5*aux +10*sizeFactor*tamano,125*sizeFactor*tamano+bajar,mx+5*aux +35*sizeFactor*tamano,125*sizeFactor*tamano+bajar);   //arriba
                gc.strokeLine(mx+5*aux +10*sizeFactor*tamano,125*sizeFactor*tamano+bajar,mx+5*aux +10*sizeFactor*tamano,150*sizeFactor*tamano+bajar);   //izquierda arriba
                gc.strokeLine(mx+5*aux +35*sizeFactor*tamano,125*sizeFactor*tamano+bajar,mx+5*aux +35*sizeFactor*tamano,175*sizeFactor*tamano+bajar);
        
            reubicar();
            reubicar2();
            gc.setStroke(myColorOperators);
            if(DD==false){
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            
            
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            
            
            
            contD++;    
            }}
            
            else if(DD==true){
            gc.strokeLine(mx+0,180,mx+60,180);
            gc.strokeLine(mx+0+5 *aux,180+50,mx+60-5*aux,180+50);
            
            }
            
            mx = mx + 35*sizeFactor*tamano;
        }}}}}
    
    public static void dibuja_ocho(GraphicsContext gc, ArrayList<String> operacion, Color myColorNumbers, double sizeFactor, Color myColorOperators){
            gc.setStroke(myColorNumbers);
        
        if(niveles.isEmpty()){
            
            if(contG==true){
            gc.clearRect(mx+10*sizeFactor, 40*sizeFactor, 100*sizeFactor, 100*sizeFactor);
                gc.strokeLine(mx +10*sizeFactor,150*sizeFactor+bajar,mx +35*sizeFactor,150*sizeFactor+bajar);
                gc.strokeLine(mx +10*sizeFactor,125*sizeFactor+bajar,mx +35*sizeFactor,125*sizeFactor+bajar);
                gc.strokeLine(mx +10*sizeFactor,175*sizeFactor+bajar,mx +35*sizeFactor,175*sizeFactor+bajar);   //arriba
                gc.strokeLine(mx +10*sizeFactor,125*sizeFactor+bajar,mx +10*sizeFactor,175*sizeFactor+bajar);   //izquierda arriba
                gc.strokeLine(mx +35*sizeFactor,125*sizeFactor+bajar,mx +35*sizeFactor,175*sizeFactor+bajar);
                
            gc.setStroke(myColorOperators);
            
            dibuja_grados(gc,sizeFactor);
            mx = mx + 35*sizeFactor;
            }
            
            else{
                
                if(contP==true){
                
                gc.strokeLine(mx +20*sizeFactor,130*sizeFactor,mx +20*sizeFactor,110*sizeFactor);
                gc.strokeLine(mx +20*sizeFactor,130*sizeFactor,mx +10*sizeFactor,130*sizeFactor);
                gc.strokeLine(mx +10*sizeFactor,110*sizeFactor,mx +20*sizeFactor,110*sizeFactor);
                gc.strokeLine(mx +10*sizeFactor,110*sizeFactor,mx +10*sizeFactor,130*sizeFactor);
                gc.strokeLine(mx +10*sizeFactor,120*sizeFactor,mx +20*sizeFactor,120*sizeFactor);
                mx = mx + 15*sizeFactor;
                
                }
                
                else{
                
                gc.strokeLine(mx +10*sizeFactor,150*sizeFactor+bajar,mx +35*sizeFactor,150*sizeFactor+bajar);
                gc.strokeLine(mx +10*sizeFactor,125*sizeFactor+bajar,mx +35*sizeFactor,125*sizeFactor+bajar);
                gc.strokeLine(mx +10*sizeFactor,175*sizeFactor+bajar,mx +35*sizeFactor,175*sizeFactor+bajar);   //arriba
                gc.strokeLine(mx +10*sizeFactor,125*sizeFactor+bajar,mx +10*sizeFactor,175*sizeFactor+bajar);   //izquierda arriba
                gc.strokeLine(mx +35*sizeFactor,125*sizeFactor+bajar,mx +35*sizeFactor,175*sizeFactor+bajar); 
            mx = mx + 35*sizeFactor;}}
        }
        else{
        
        if(!nivelesD.isEmpty()){
            aux = (int) niveles.get(niveles.size()-1);
        
            
            gc.strokeLine(mx+5*aux +10*sizeFactor*tamanoD,150*sizeFactor*tamanoD+bajarD,mx+5*aux +35*sizeFactor*tamanoD,150*sizeFactor*tamanoD+bajarD);
            gc.strokeLine(mx+5*aux +10*sizeFactor*tamanoD,125*sizeFactor*tamanoD+bajarD,mx+5*aux +35*sizeFactor*tamanoD,125*sizeFactor*tamanoD+bajarD);
            gc.strokeLine(mx+5*aux +10*sizeFactor*tamanoD,175*sizeFactor*tamanoD+bajarD,mx+5*aux +35*sizeFactor*tamanoD,175*sizeFactor*tamanoD+bajarD);   //arriba
            gc.strokeLine(mx+5*aux +10*sizeFactor*tamanoD,125*sizeFactor*tamanoD+bajarD,mx+5*aux +10*sizeFactor*tamanoD,175*sizeFactor*tamanoD+bajarD);   //izquierda arriba
            gc.strokeLine(mx+5*aux +35*sizeFactor*tamanoD,125*sizeFactor*tamanoD+bajarD,mx+5*aux +35*sizeFactor*tamanoD,175*sizeFactor*tamanoD+bajarD);   
            gc.setStroke(myColorOperators);
            
            reubicarD();
            
            if((int) niveles.get(niveles.size()-1)==2){
            gc.strokeLine(mx+0+5 *aux,180-25,mx+60-15*aux,180-25);}
            
            else if((int) niveles.get(niveles.size()-1)==3){
            gc.strokeLine(mx+0+10 *aux,180-75,mx+60-15*aux,180-75);}
            
            
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            

            contD++;    
            }

            mx = mx+14*sizeFactor;
        }
        else{
        //dfdsfdfdsdff
            if(contG==true){
                 aux = (int) niveles.get(niveles.size()-1);
                 gc.clearRect(mx+3.5*aux+ 10*sizeFactor*tamano, 114*tamano+bajar*sizeFactor, 100*sizeFactor*tamano, 100*sizeFactor*tamano);
            
                gc.strokeLine(mx+5*aux +10*sizeFactor*tamano,150*sizeFactor*tamano+bajar,mx+5*aux +35*sizeFactor*tamano,150*sizeFactor*tamano+bajar);
                gc.strokeLine(mx+5*aux +10*sizeFactor*tamano,125*sizeFactor*tamano+bajar,mx+5*aux +35*sizeFactor*tamano,125*sizeFactor*tamano+bajar);
                gc.strokeLine(mx+5*aux +10*sizeFactor*tamano,175*sizeFactor*tamano+bajar,mx+5*aux +35*sizeFactor*tamano,175*sizeFactor*tamano+bajar);   //arriba
                gc.strokeLine(mx+5*aux +10*sizeFactor*tamano,125*sizeFactor*tamano+bajar,mx+5*aux +10*sizeFactor*tamano,175*sizeFactor*tamano+bajar);   //izquierda arriba
                gc.strokeLine(mx+5*aux +35*sizeFactor*tamano,125*sizeFactor*tamano+bajar,mx+5*aux +35*sizeFactor*tamano,175*sizeFactor*tamano+bajar); 
                 gc.setStroke(myColorOperators);
                 dibuja_grados(gc,sizeFactor);
                 reubicar();
                 reubicar2();
            
            if(DD==false){
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            
            
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            
            
            
            contD++;    
            }}
            
            else if(DD==true){
            gc.strokeLine(mx+0,180,mx+60,180);
            gc.strokeLine(mx+0+5 *aux,180+50,mx+60-5*aux,180+50);
            
            }
            
            mx = mx + 35*sizeFactor*tamano;
            
            
            }
            
            
            
            else{
                
            if(contP==true){
                
            aux = (int) niveles.get(niveles.size()-1);
            
            gc.strokeLine(mx +5*aux+20*sizeFactor*tamano,140*sizeFactor*tamano+bajar,mx +5*aux+20*sizeFactor*tamano,120*sizeFactor*tamano+bajar);
            gc.strokeLine(mx +5*aux+20*sizeFactor*tamano,140*sizeFactor*tamano+bajar,mx +5*aux+10*sizeFactor*tamano,140*sizeFactor*tamano+bajar);
            gc.strokeLine(mx +5*aux+10*sizeFactor*tamano,120*sizeFactor*tamano+bajar,mx +5*aux+20*sizeFactor*tamano,120*sizeFactor*tamano+bajar);
            gc.strokeLine(mx +5*aux+10*sizeFactor*tamano,120*sizeFactor*tamano+bajar,mx +5*aux+10*sizeFactor*tamano,140*sizeFactor*tamano+bajar);
            gc.strokeLine(mx +5*aux+10*sizeFactor*tamano,130*sizeFactor*tamano+bajar,mx +5*aux+20*sizeFactor*tamano,130*sizeFactor*tamano+bajar);

            reubicar();
            reubicar2();
            gc.setStroke(myColorOperators);
            if(DD==false){
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            
            
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            
            
            
            contD++;    
            }}
            
            else if(DD==true){
            gc.strokeLine(mx+0,180,mx+60,180);
            gc.strokeLine(mx+0+5 *aux,180+50,mx+60-5*aux,180+50);
            
            }
            
            mx = mx + 15*sizeFactor*tamano;
            
            
            }
            
            else{
                
            aux = (int) niveles.get(niveles.size()-1);
        
                gc.strokeLine(mx+5*aux +10*sizeFactor*tamano,150*sizeFactor*tamano+bajar,mx+5*aux +35*sizeFactor*tamano,150*sizeFactor*tamano+bajar);
                gc.strokeLine(mx+5*aux +10*sizeFactor*tamano,125*sizeFactor*tamano+bajar,mx+5*aux +35*sizeFactor*tamano,125*sizeFactor*tamano+bajar);
                gc.strokeLine(mx+5*aux +10*sizeFactor*tamano,175*sizeFactor*tamano+bajar,mx+5*aux +35*sizeFactor*tamano,175*sizeFactor*tamano+bajar);   //arriba
                gc.strokeLine(mx+5*aux +10*sizeFactor*tamano,125*sizeFactor*tamano+bajar,mx+5*aux +10*sizeFactor*tamano,175*sizeFactor*tamano+bajar);   //izquierda arriba
                gc.strokeLine(mx+5*aux +35*sizeFactor*tamano,125*sizeFactor*tamano+bajar,mx+5*aux +35*sizeFactor*tamano,175*sizeFactor*tamano+bajar);
        
            reubicar();
            reubicar2();
            gc.setStroke(myColorOperators);
            if(DD==false){
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            
            
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            
            
            
            contD++;    
            }}
            
            else if(DD==true){
            gc.strokeLine(mx+0,180,mx+60,180);
            gc.strokeLine(mx+0+5 *aux,180+50,mx+60-5*aux,180+50);
            
            }
            
            mx = mx + 35*sizeFactor*tamano;
        }}}}}
        
       
    public static void dibuja_nueve(GraphicsContext gc, ArrayList<String> operacion, Color myColorNumbers, double sizeFactor, Color myColorOperators){
         gc.setStroke(myColorNumbers);
        
        if(niveles.isEmpty()){
            
            if(contG==true){
            gc.clearRect(mx+10*sizeFactor, 40*sizeFactor, 100*sizeFactor, 100*sizeFactor);
                
                gc.strokeLine(mx +10*sizeFactor,125*sizeFactor+bajar,mx +35*sizeFactor,125*sizeFactor+bajar);
                gc.strokeLine(mx +10*sizeFactor,175*sizeFactor+bajar,mx +35*sizeFactor,175*sizeFactor+bajar);
                gc.strokeLine(mx +10*sizeFactor,125*sizeFactor+bajar,mx +10*sizeFactor,150*sizeFactor+bajar);   //arriba  //izquierda arriba
                gc.strokeLine(mx +10*sizeFactor,150*sizeFactor+bajar,mx +35*sizeFactor,150*sizeFactor+bajar);
                gc.strokeLine(mx +35*sizeFactor,125*sizeFactor+bajar,mx +35*sizeFactor,175*sizeFactor+bajar);
                gc.setStroke(myColorOperators);
                dibuja_grados(gc,sizeFactor);
            
            dibuja_grados(gc,sizeFactor);
            mx = mx + 35*sizeFactor;
            }
            
            else{
                
                if(contP==true){
                
                gc.strokeLine(mx +20*sizeFactor,130*sizeFactor,mx +10*sizeFactor,130*sizeFactor);   
                gc.strokeLine(mx +20*sizeFactor,130*sizeFactor,mx +20*sizeFactor,110*sizeFactor);
                gc.strokeLine(mx +20*sizeFactor,110*sizeFactor,mx +10*sizeFactor,110*sizeFactor);
                gc.strokeLine(mx +10*sizeFactor,110*sizeFactor,mx +10*sizeFactor,120*sizeFactor);
                gc.strokeLine(mx +10*sizeFactor,120*sizeFactor,mx +20*sizeFactor,120*sizeFactor);
                mx = mx + 15*sizeFactor;
                
                }
                
                else{
                
                gc.strokeLine(mx +10*sizeFactor,125*sizeFactor+bajar,mx +35*sizeFactor,125*sizeFactor+bajar);
                gc.strokeLine(mx +10*sizeFactor,175*sizeFactor+bajar,mx +35*sizeFactor,175*sizeFactor+bajar);
                gc.strokeLine(mx +10*sizeFactor,125*sizeFactor+bajar,mx +10*sizeFactor,150*sizeFactor+bajar);   //arriba  //izquierda arriba
                gc.strokeLine(mx +10*sizeFactor,150*sizeFactor+bajar,mx +35*sizeFactor,150*sizeFactor+bajar);
                gc.strokeLine(mx +35*sizeFactor,125*sizeFactor+bajar,mx +35*sizeFactor,175*sizeFactor+bajar); 
            mx = mx + 35*sizeFactor;}}
        }
        else{
        
        if(!nivelesD.isEmpty()){
            aux = (int) niveles.get(niveles.size()-1);
        
            
            gc.strokeLine(mx+5*aux +10*sizeFactor*tamanoD,150*sizeFactor*tamanoD+bajarD,mx+5*aux +35*sizeFactor*tamanoD,150*sizeFactor*tamanoD+bajarD);
            gc.strokeLine(mx+5*aux +10*sizeFactor*tamanoD,125*sizeFactor*tamanoD+bajarD,mx+5*aux +35*sizeFactor*tamanoD,125*sizeFactor*tamanoD+bajarD);
            gc.strokeLine(mx+5*aux +10*sizeFactor*tamanoD,175*sizeFactor*tamanoD+bajarD,mx+5*aux +35*sizeFactor*tamanoD,175*sizeFactor*tamanoD+bajarD);   //arriba
            gc.strokeLine(mx+5*aux +10*sizeFactor*tamanoD,125*sizeFactor*tamanoD+bajarD,mx+5*aux +10*sizeFactor*tamanoD,175*sizeFactor*tamanoD+bajarD);   //izquierda arriba
            gc.strokeLine(mx+5*aux +35*sizeFactor*tamanoD,125*sizeFactor*tamanoD+bajarD,mx+5*aux +35*sizeFactor*tamanoD,175*sizeFactor*tamanoD+bajarD);    
           
            gc.setStroke(myColorOperators);
            reubicarD();
            
            if((int) niveles.get(niveles.size()-1)==2){
            gc.strokeLine(mx+0+5 *aux,180-25,mx+60-15*aux,180-25);}
            
            else if((int) niveles.get(niveles.size()-1)==3){
            gc.strokeLine(mx+0+10 *aux,180-75,mx+60-15*aux,180-75);}
            
            
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            

            contD++;    
            }

            mx = mx+14*sizeFactor;
        }
        else{
        //dfdsfdfdsdff
            if(contG==true){
                 aux = (int) niveles.get(niveles.size()-1);
                 gc.clearRect(mx+3.5*aux+ 10*sizeFactor*tamano, 114*tamano+bajar*sizeFactor, 100*sizeFactor*tamano, 100*sizeFactor*tamano);
            
                gc.strokeLine(mx+5*aux +10*sizeFactor*tamano,125*sizeFactor*tamano+bajar,mx+5*aux +35*sizeFactor*tamano,125*sizeFactor*tamano+bajar);
                gc.strokeLine(mx+5*aux +10*sizeFactor*tamano,175*sizeFactor*tamano+bajar,mx+5*aux +35*sizeFactor*tamano,175*sizeFactor*tamano+bajar);
                gc.strokeLine(mx+5*aux +10*sizeFactor*tamano,125*sizeFactor*tamano+bajar,mx+5*aux +10*sizeFactor*tamano,150*sizeFactor*tamano+bajar);   //arriba
                gc.strokeLine(mx+5*aux +10*sizeFactor*tamano,150*sizeFactor*tamano+bajar,mx+5*aux +35*sizeFactor*tamano,150*sizeFactor*tamano+bajar);   //izquierda arriba
                gc.strokeLine(mx+5*aux +35*sizeFactor*tamano,125*sizeFactor*tamano+bajar,mx+5*aux +35*sizeFactor*tamano,175*sizeFactor*tamano+bajar); ; 
                 gc.setStroke(myColorOperators);
                 dibuja_grados(gc,sizeFactor);
                 reubicar();
                 reubicar2();
            
            if(DD==false){
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            
            
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            
            
            
            contD++;    
            }}
            
            else if(DD==true){
            gc.strokeLine(mx+0,180,mx+60,180);
            gc.strokeLine(mx+0+5 *aux,180+50,mx+60-5*aux,180+50);
            
            }
            
            mx = mx + 35*sizeFactor*tamano;
            
            
            }
            
            
            
            else{
                
            if(contP==true){
                
            aux = (int) niveles.get(niveles.size()-1);
            
                gc.strokeLine(mx +5*aux+20*sizeFactor*tamano,140*sizeFactor*tamano+bajar,mx +5*aux+10*sizeFactor*tamano,140*sizeFactor*tamano+bajar);   
                gc.strokeLine(mx +5*aux+20*sizeFactor*tamano,140*sizeFactor*tamano+bajar,mx +5*aux+20*sizeFactor*tamano,120*sizeFactor*tamano+bajar);
                gc.strokeLine(mx +5*aux+20*sizeFactor*tamano,120*sizeFactor*tamano+bajar,mx +5*aux+10*sizeFactor*tamano,120*sizeFactor*tamano+bajar);
                gc.strokeLine(mx +5*aux+10*sizeFactor*tamano,120*sizeFactor*tamano+bajar,mx +5*aux+10*sizeFactor*tamano,130*sizeFactor*tamano+bajar);
                gc.strokeLine(mx +5*aux+10*sizeFactor*tamano,130*sizeFactor*tamano+bajar,mx +5*aux+20*sizeFactor*tamano,130*sizeFactor*tamano+bajar);
                
                reubicar();
            reubicar2();
            gc.setStroke(myColorOperators);
            if(DD==false){
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            
            
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            
            
            
            contD++;    
            }}
            
            else if(DD==true){
            gc.strokeLine(mx+0,180,mx+60,180);
            gc.strokeLine(mx+0+5 *aux,180+50,mx+60-5*aux,180+50);
            
            }

            mx = mx + 15*sizeFactor*tamano;

            }
            
            else{
                
            aux = (int) niveles.get(niveles.size()-1);
        
                gc.strokeLine(mx+5*aux +10*sizeFactor*tamano,125*sizeFactor*tamano+bajar,mx+5*aux +35*sizeFactor*tamano,125*sizeFactor*tamano+bajar);
                gc.strokeLine(mx+5*aux +10*sizeFactor*tamano,175*sizeFactor*tamano+bajar,mx+5*aux +35*sizeFactor*tamano,175*sizeFactor*tamano+bajar);
                gc.strokeLine(mx+5*aux +10*sizeFactor*tamano,125*sizeFactor*tamano+bajar,mx+5*aux +10*sizeFactor*tamano,150*sizeFactor*tamano+bajar);   //arriba
                gc.strokeLine(mx+5*aux +10*sizeFactor*tamano,150*sizeFactor*tamano+bajar,mx+5*aux +35*sizeFactor*tamano,150*sizeFactor*tamano+bajar);   //izquierda arriba
                gc.strokeLine(mx+5*aux +35*sizeFactor*tamano,125*sizeFactor*tamano+bajar,mx+5*aux +35*sizeFactor*tamano,175*sizeFactor*tamano+bajar); 
        
            reubicar();
            reubicar2();
            gc.setStroke(myColorOperators);
            if(DD==false){
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            
            
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            
            
            
            contD++;    
            }}
            
            else if(DD==true){
            gc.strokeLine(mx+0,180,mx+60,180);
            gc.strokeLine(mx+0+5 *aux,180+50,mx+60-5*aux,180+50);
            
            }
            
            mx = mx + 35*sizeFactor*tamano;
        }}}}}

    public static void dibuja_cero(GraphicsContext gc, ArrayList<String> operacion, Color myColorNumbers, double sizeFactor, Color myColorOperators){
        gc.setStroke(myColorNumbers);
        
        if(niveles.isEmpty()){
            
            if(contG==true){
            gc.clearRect(mx+10*sizeFactor, 40*sizeFactor, 100*sizeFactor, 100*sizeFactor);
                
                gc.strokeLine(mx +10*sizeFactor,125*sizeFactor+bajar,mx +35*sizeFactor,125*sizeFactor+bajar);   //arriba
                gc.strokeLine(mx +10*sizeFactor,175*sizeFactor+bajar,mx +35*sizeFactor,175*sizeFactor+bajar);   //abajo
                gc.strokeLine(mx +10*sizeFactor,125*sizeFactor+bajar,mx +10*sizeFactor,175*sizeFactor+bajar);   //izquierda
                gc.strokeLine(mx +35*sizeFactor,125*sizeFactor+bajar,mx +35*sizeFactor,175*sizeFactor+bajar);
                gc.setStroke(myColorOperators);
                dibuja_grados(gc,sizeFactor);
            
            mx = mx + 35*sizeFactor;
            }
            
            else{
                
                if(contP==true){
                
                gc.strokeLine(mx +10*sizeFactor,130*sizeFactor,mx +20*sizeFactor,130*sizeFactor);   
                gc.strokeLine(mx +20*sizeFactor,130*sizeFactor,mx +20*sizeFactor,110*sizeFactor);
                gc.strokeLine(mx +20*sizeFactor,110*sizeFactor,mx +10*sizeFactor,110*sizeFactor);
                gc.strokeLine(mx +10*sizeFactor,110*sizeFactor,mx +10*sizeFactor,130*sizeFactor);
      
                mx = mx + 15*sizeFactor;
                }
                
                else{
                gc.strokeLine(mx +10*sizeFactor,125*sizeFactor+bajar,mx +35*sizeFactor,125*sizeFactor+bajar);   //arriba
                gc.strokeLine(mx +10*sizeFactor,175*sizeFactor+bajar,mx +35*sizeFactor,175*sizeFactor+bajar);   //abajo
                gc.strokeLine(mx +10*sizeFactor,125*sizeFactor+bajar,mx +10*sizeFactor,175*sizeFactor+bajar);   //izquierda
                gc.strokeLine(mx +35*sizeFactor,125*sizeFactor+bajar,mx +35*sizeFactor,175*sizeFactor+bajar);  
            mx = mx + 35*sizeFactor;}}
        }
        else{
        
        if(!nivelesD.isEmpty()){
            aux = (int) niveles.get(niveles.size()-1);
        
            
            gc.strokeLine(mx+5*aux +10*sizeFactor*tamanoD,125*sizeFactor*tamanoD+bajarD,mx+5*aux +35*sizeFactor*tamanoD,125*sizeFactor*tamanoD+bajarD);
            gc.strokeLine(mx+5*aux +10*sizeFactor*tamanoD,175*sizeFactor*tamanoD+bajarD,mx+5*aux +35*sizeFactor*tamanoD,175*sizeFactor*tamanoD+bajarD);   //arriba
            gc.strokeLine(mx+5*aux +10*sizeFactor*tamanoD,125*sizeFactor*tamanoD+bajarD,mx+5*aux +10*sizeFactor*tamanoD,175*sizeFactor*tamanoD+bajarD);   //izquierda arriba
            gc.strokeLine(mx+5*aux +35*sizeFactor*tamanoD,125*sizeFactor*tamanoD+bajarD,mx+5*aux +35*sizeFactor*tamanoD,175*sizeFactor*tamanoD+bajarD);     
            gc.setStroke(myColorOperators);
            
            reubicarD();
            
            if((int) niveles.get(niveles.size()-1)==2){
            gc.strokeLine(mx+0+5 *aux,180-25,mx+60-15*aux,180-25);}
            
            else if((int) niveles.get(niveles.size()-1)==3){
            gc.strokeLine(mx+0+10 *aux,180-75,mx+60-15*aux,180-75);}
            
            
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            

            contD++;    
            }

            mx = mx+14*sizeFactor;
        }
        else{
        //dfdsfdfdsdff
            if(contG==true){
                 aux = (int) niveles.get(niveles.size()-1);
                 gc.clearRect(mx+3.5*aux+ 10*sizeFactor*tamano, 114*tamano+bajar*sizeFactor, 100*sizeFactor*tamano, 100*sizeFactor*tamano);
            
                gc.strokeLine(mx+5*aux +10*sizeFactor*tamano,125*sizeFactor*tamano+bajar,mx+5*aux +35*sizeFactor*tamano,125*sizeFactor*tamano+bajar);
                gc.strokeLine(mx+5*aux +10*sizeFactor*tamano,175*sizeFactor*tamano+bajar,mx+5*aux +35*sizeFactor*tamano,175*sizeFactor*tamano+bajar);   //arriba
                gc.strokeLine(mx+5*aux +10*sizeFactor*tamano,125*sizeFactor*tamano+bajar,mx+5*aux +10*sizeFactor*tamano,175*sizeFactor*tamano+bajar);   //izquierda arriba
                gc.strokeLine(mx+5*aux +35*sizeFactor*tamano,125*sizeFactor*tamano+bajar,mx+5*aux +35*sizeFactor*tamano,175*sizeFactor*tamano+bajar); 
                 gc.setStroke(myColorOperators);
                 dibuja_grados(gc,sizeFactor);
                 reubicar();
                 reubicar2();
                 
            if(DD==false){
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            
            
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            
            
            
            contD++;    
            }}
            
            else if(DD==true){
            gc.strokeLine(mx+0,180,mx+60,180);
            gc.strokeLine(mx+0+5 *aux,180+50,mx+60-5*aux,180+50);
            
            }
            
            mx = mx + 35*sizeFactor*tamano;
            
            
            }       
            else{
                
            if(contP==true){
                
            aux = (int) niveles.get(niveles.size()-1);
            
                gc.strokeLine(mx +5*aux+10*sizeFactor*tamano,140*sizeFactor*tamano+bajar,mx +5*aux+20*sizeFactor*tamano,140*sizeFactor*tamano+bajar);   
                gc.strokeLine(mx +5*aux+20*sizeFactor*tamano,140*sizeFactor*tamano+bajar,mx +5*aux+20*sizeFactor*tamano,120*sizeFactor*tamano+bajar);
                gc.strokeLine(mx +5*aux+20*sizeFactor*tamano,120*sizeFactor*tamano+bajar,mx +5*aux+10*sizeFactor*tamano,120*sizeFactor*tamano+bajar);
                gc.strokeLine(mx +5*aux+10*sizeFactor*tamano,120*sizeFactor*tamano+bajar,mx +5*aux+10*sizeFactor*tamano,140*sizeFactor*tamano+bajar);
                
            reubicar();
            reubicar2();
            gc.setStroke(myColorOperators);
            if(DD==false){
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            
            
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            
            
            
            contD++;    
            }}
            
            else if(DD==true){
            gc.strokeLine(mx+0,180,mx+60,180);
            gc.strokeLine(mx+0+5 *aux,180+50,mx+60-5*aux,180+50);
            
            }
                
            mx = mx + 15*sizeFactor*tamano;
            
            }
            
            
            else{
            aux = (int) niveles.get(niveles.size()-1);
        
            gc.strokeLine(mx+5*aux +10*sizeFactor*tamano,125*sizeFactor*tamano+bajar,mx+5*aux +35*sizeFactor*tamano,125*sizeFactor*tamano+bajar);
            gc.strokeLine(mx+5*aux +10*sizeFactor*tamano,175*sizeFactor*tamano+bajar,mx+5*aux +35*sizeFactor*tamano,175*sizeFactor*tamano+bajar);   //arriba
            gc.strokeLine(mx+5*aux +10*sizeFactor*tamano,125*sizeFactor*tamano+bajar,mx+5*aux +10*sizeFactor*tamano,175*sizeFactor*tamano+bajar);   //izquierda arriba
            gc.strokeLine(mx+5*aux +35*sizeFactor*tamano,125*sizeFactor*tamano+bajar,mx+5*aux +35*sizeFactor*tamano,175*sizeFactor*tamano+bajar); 
        
            reubicar();
            reubicar2();
            gc.setStroke(myColorOperators);
            if(DD==false){
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            
            
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            
            
            
            contD++;    
            }}
            
            else if(DD==true){
            gc.strokeLine(mx+0,180,mx+60,180);
            gc.strokeLine(mx+0+5 *aux,180+50,mx+60-5*aux,180+50);
            
            }
            
            mx = mx + 35*sizeFactor*tamano;
        }}}}}
       
    public static void dibuja_mas(GraphicsContext gc, ArrayList<String> operacion, Color myColorOperators, double sizeFactor){
        gc.setStroke(myColorOperators);
        
        if(niveles.isEmpty()){
            
        if(contG==true){
        operacion.add("°");
        contG=false;
        mx=mx+20;
        }
        
        if(contP==true){
            
          contP=false;
        }
        
        
        gc.strokeLine(mx +22.5*sizeFactor,137.5*sizeFactor,mx +22.5*sizeFactor,162.5*sizeFactor);        //Altura maxima = 25, Altura Minima, 75
        gc.strokeLine(mx +10*sizeFactor,150*sizeFactor,mx +35*sizeFactor,150*sizeFactor);        //Ancho maximo = 30, parte desde x = 10
        mx = mx + 35*sizeFactor;}
        
        
        else{
            if(contP==true){
            
            contP=false;
            }
            
            
        if(!nivelesD.isEmpty()){
            aux = (int) niveles.get(niveles.size()-1);
        
            
            
            gc.strokeLine(mx +5*aux + 22.5*sizeFactor*tamanoD,137.5*sizeFactor*tamanoD+bajarD,mx +5*aux +22.5*sizeFactor*tamanoD,162.5*sizeFactor*tamanoD+bajarD);        //Altura maxima = 25, Altura Minima, 75
            gc.strokeLine(mx +5*aux +10*sizeFactor*tamanoD,150*sizeFactor*tamanoD+bajarD,mx +5*aux +35*sizeFactor*tamanoD,150*sizeFactor*tamanoD+bajarD);        //Ancho maximo = 30, parte desde x = 10
            
            reubicarD();
            
            if((int) niveles.get(niveles.size()-1)==2){
            gc.strokeLine(mx+0+5 *aux,180-25,mx+60-15*aux,180-25);}
            
            else if((int) niveles.get(niveles.size()-1)==3){
            gc.strokeLine(mx+0+10 *aux,180-75,mx+60-15*aux,180-75);}
            
            
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            

            contD++;    
            }

            mx = mx + 12*sizeFactor;
        }
        
         else{
            
            aux = (int) niveles.get(niveles.size()-1);
        
            if(contG==true){
        
            contG=false;
            mx=mx+20;
            }
            
            gc.strokeLine(mx +5*aux + 22.5*sizeFactor*tamano,137.5*sizeFactor*tamano+bajar,mx +5*aux +22.5*sizeFactor*tamano,162.5*sizeFactor*tamano+bajar);        //Altura maxima = 25, Altura Minima, 75
            gc.strokeLine(mx +5*aux +10*sizeFactor*tamano,150*sizeFactor*tamano+bajar,mx +5*aux +35*sizeFactor*tamano,150*sizeFactor*tamano+bajar);        //Ancho maximo = 30, parte desde x = 10
            
            reubicar();
            reubicar2();
            
            if(DD==false){
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            
            
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            
            
            
            contD++;    
            }}
            
            else if(DD==true){
            gc.strokeLine(mx+0,180,mx+60,180);
            gc.strokeLine(mx+0+5 *aux,180+50,mx+60-5*aux,180+50);
            
            }
            
            mx = mx + 35*sizeFactor*tamano;}
            
    } }
       
    public static void dibuja_menos(GraphicsContext gc, ArrayList<String> operacion, Color myColorOperators, double sizeFactor){
        
        gc.setStroke(myColorOperators); 
        
        if(niveles.isEmpty()){
            
        if(contG==true){
        operacion.add("°");
        contG=false;
        mx=mx+20;
        }
        
        if(contP==true){
            
          contP=false;
        }
            
        gc.strokeLine(mx +10*sizeFactor,150*sizeFactor,mx +35*sizeFactor,150*sizeFactor);
        mx = mx + 35*sizeFactor;
        
        
        }
        
        else{
        if(contP==true){
            
            contP=false;
            }
            
            
        if(!nivelesD.isEmpty()){
            
            aux = (int) niveles.get(niveles.size()-1);
        
            gc.strokeLine(mx +5*aux +10*sizeFactor*tamanoD,150*sizeFactor*tamanoD+bajarD,mx +5*aux +35*sizeFactor*tamanoD,150*sizeFactor*tamanoD+bajarD);
            
            reubicarD();
            
            if((int) niveles.get(niveles.size()-1)==2){
            gc.strokeLine(mx+0+5 *aux,180-25,mx+60-15*aux,180-25);}
            
            else if((int) niveles.get(niveles.size()-1)==3){
            gc.strokeLine(mx+0+10 *aux,180-75,mx+60-15*aux,180-75);}
            
            
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            

            contD++;    
            }

            mx = mx + 12*sizeFactor;
            
            
        }
        
        else{
        
        aux = (int) niveles.get(niveles.size()-1);
        
        if(contG==true){
        
        contG=false;
        mx=mx+20;
        }
        
        gc.strokeLine(mx +5*aux +10*sizeFactor*tamano,150*sizeFactor*tamano+bajar,mx +5*aux +35*sizeFactor*tamano,150*sizeFactor*tamano+bajar);
        
            reubicar();
            reubicar2();
            
            if(DD==false){
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            
            
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            
            
            
            contD++;    
            }}
            
            else if(DD==true){
            gc.strokeLine(mx+0,180,mx+60,180);
            gc.strokeLine(mx+0+5 *aux,180+50,mx+60-5*aux,180+50);
            
            }
            
            mx = mx + 35*sizeFactor*tamano;
        }
        }} 
        
    public static void dibuja_x(GraphicsContext gc, ArrayList<String> operacion, Color myColorOperators, double sizeFactor){
        gc.setStroke(myColorOperators);    
        
        
        if(niveles.isEmpty()){
            
        if(contG==true){
        operacion.add("°");
        contG=false;
        mx=mx+20;
        }
        
        if(contP==true){
            
          contP=false;
          }
        
        gc.strokeLine(mx +20*sizeFactor,135*sizeFactor,mx + 32.5*sizeFactor,165*sizeFactor); 
        gc.strokeLine(mx +20*sizeFactor,165*sizeFactor,mx + 32.5*sizeFactor,135*sizeFactor);
        mx = mx + 35*sizeFactor;}
        
        else{
        
            if(contP==true){
            
            contP=false;
            }
            
            
            if(!nivelesD.isEmpty()){
                
                aux = (int) niveles.get(niveles.size()-1);
                gc.strokeLine(mx +5*aux +20*sizeFactor*tamanoD,135*sizeFactor*tamanoD+bajarD,mx +5*aux + 32.5*sizeFactor*tamanoD,165*sizeFactor*tamanoD+bajarD); 
                gc.strokeLine(mx +5*aux +20*sizeFactor*tamanoD,165*sizeFactor*tamanoD+bajarD,mx +5*aux + 32.5*sizeFactor*tamanoD,135*sizeFactor*tamanoD+bajarD);
                
                reubicarD();
                
                if((int) niveles.get(niveles.size()-1)==2){
            gc.strokeLine(mx+0+5 *aux,180-25,mx+60-15*aux,180-25);}
            
            else if((int) niveles.get(niveles.size()-1)==3){
            gc.strokeLine(mx+0+10 *aux,180-75,mx+60-15*aux,180-75);}
            
            
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            

            contD++;    
            }

            mx = mx + 12*sizeFactor;
        }
        
            else{
                
            aux = (int) niveles.get(niveles.size()-1);
            
            if(contG==true){
        
            contG=false;
            mx=mx+20;
            }
            gc.strokeLine(mx +5*aux +20*sizeFactor*tamano,135*sizeFactor*tamano+bajar,mx +5*aux + 32.5*sizeFactor*tamano,165*sizeFactor*tamano+bajar); 
            gc.strokeLine(mx +5*aux +20*sizeFactor*tamano,165*sizeFactor*tamano+bajar,mx +5*aux + 32.5*sizeFactor*tamano,135*sizeFactor*tamano+bajar);
            
            reubicar();
            reubicar2();
            
            if(DD==false){
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            
            contD++;    
            }}
            
            else if(DD==true){
            gc.strokeLine(mx+0,180,mx+60,180);
            gc.strokeLine(mx+0+5 *aux,180+50,mx+60-5*aux,180+50);
            
            }
            
            mx = mx + 35*sizeFactor*tamano;
            
            }
           
        }
    }
        
    public static void dibuja_parentesisI(GraphicsContext gc, ArrayList<String> operacion, Color myColorOperators, double sizeFactor){
        gc.setStroke(myColorOperators); 
        
        if(niveles.isEmpty()){
        gc.strokeArc(mx +20*sizeFactor,125*sizeFactor,10*sizeFactor,50*sizeFactor,90,180,ArcType.OPEN); 
        mx = mx + 25*sizeFactor;}
        
        else{
        if(!nivelesD.isEmpty()){
            aux = (int) niveles.get(niveles.size()-1);
            
            gc.strokeArc(mx +5*aux+10*sizeFactor,125*sizeFactor*tamanoD+bajarD,10*sizeFactor*tamanoD,50*sizeFactor*tamanoD,90,180,ArcType.OPEN); 
            reubicarD();
            if((int) niveles.get(niveles.size()-1)==2){
            gc.strokeLine(mx+0+5 *aux,180-25,mx+60-15*aux,180-25);}
            
            else if((int) niveles.get(niveles.size()-1)==3){
            gc.strokeLine(mx+0+10 *aux,180-75,mx+60-15*aux,180-75);}
            
            
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            

            contD++;    
            }

            mx = mx + 12*sizeFactor;
            }
        
        else{
                
            aux = (int) niveles.get(niveles.size()-1);
        
            gc.strokeArc(mx +5*aux+10*sizeFactor,125*sizeFactor*tamano+bajar,10*sizeFactor*tamano,50*sizeFactor*tamano,90,180,ArcType.OPEN);
        
            reubicar();
            reubicar2();
            
            if(DD==false){
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            
            contD++;    
            }}
            
            else if(DD==true){
            gc.strokeLine(mx+0,180,mx+60,180);
            gc.strokeLine(mx+0+5 *aux,180+50,mx+60-5*aux,180+50);
            
            }
            
            mx = mx + 35*sizeFactor*tamano;
        }
        
    }}
        
    public static void dibuja_parentesisD(GraphicsContext gc, ArrayList<String> operacion, Color myColorOperators, double sizeFactor){
        gc.setStroke(myColorOperators); 

        if(niveles.isEmpty()){
        gc.strokeArc(mx +10*sizeFactor,125*sizeFactor,10*sizeFactor,50*sizeFactor,90,-180,ArcType.OPEN); 
        mx = mx + 25*sizeFactor;}
        
        
        else{
        
            if(!nivelesD.isEmpty()){
            aux = (int) niveles.get(niveles.size()-1);
            
            gc.strokeArc(mx +5*aux+10*sizeFactor*tamanoD,125*sizeFactor*tamanoD+bajarD,10*sizeFactor*tamanoD,50*sizeFactor*tamanoD,90,-180,ArcType.OPEN); 
            reubicarD();
            if((int) niveles.get(niveles.size()-1)==2){
            gc.strokeLine(mx+0+5 *aux,180-25,mx+60-15*aux,180-25);}
            
            else if((int) niveles.get(niveles.size()-1)==3){
            gc.strokeLine(mx+0+10 *aux,180-75,mx+60-15*aux,180-75);}
            
            
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            

            contD++;    
            }

            mx = mx + 14*sizeFactor;
            }
        else{
                
            aux = (int) niveles.get(niveles.size()-1);
            
            gc.strokeArc(mx +5*aux+10*sizeFactor*tamano,125*sizeFactor*tamano+bajar,10*sizeFactor*tamano,50*sizeFactor*tamano,90,-180,ArcType.OPEN); 
            
            reubicar();
            reubicar2();
            
            if(DD==false){
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            
            contD++;    
            }}
            
            else if(DD==true){
            gc.strokeLine(mx+0,180,mx+60,180);
            gc.strokeLine(mx+0+5 *aux,180+50,mx+60-5*aux,180+50);
            
            }
            
            mx = mx + 35*sizeFactor*tamano;
            
            }
        }
    }

    public static void dibuja_factorial(GraphicsContext gc, Color myColorOperators, double sizeFactor){
        gc.setStroke(myColorOperators);
        
        if(niveles.isEmpty()){
            
            
        
        gc.strokeLine(mx + 20*sizeFactor, 125*sizeFactor, mx + 20*sizeFactor, 160*sizeFactor);
        gc.strokeLine(mx + 20*sizeFactor, 170*sizeFactor, mx + 20*sizeFactor, 170*sizeFactor);
        mx = mx + 35*sizeFactor;}
        
        else{
        
        if(!nivelesD.isEmpty()){
            aux = (int) niveles.get(niveles.size()-1);
            
            gc.strokeLine(mx +5*aux+ 20*sizeFactor*tamanoD, 125*sizeFactor*tamanoD+bajarD, mx +5*aux+ 20*sizeFactor*tamanoD, 160*sizeFactor*tamanoD+bajarD);
            gc.strokeLine(mx +5*aux+ 20*sizeFactor*tamanoD, 170*sizeFactor*tamanoD+bajarD, mx +5*aux+ 20*sizeFactor*tamanoD, 170*sizeFactor*tamanoD+bajarD);
            reubicarD();
            if((int) niveles.get(niveles.size()-1)==2){
            gc.strokeLine(mx+0+5 *aux,180-25,mx+60-15*aux,180-25);}
            
            else if((int) niveles.get(niveles.size()-1)==3){
            gc.strokeLine(mx+0+10 *aux,180-75,mx+60-15*aux,180-75);}
            
            
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            

            contD++;    
            }

            mx = mx + 14*sizeFactor;
            
        }
        else{
                
            aux = (int) niveles.get(niveles.size()-1);
            
            gc.strokeLine(mx +3*aux+ 20*sizeFactor*tamano, 125*sizeFactor*tamano+bajar, mx +3*aux+ 20*sizeFactor*tamano, 160*sizeFactor*tamano+bajar);
            gc.strokeLine(mx +3*aux+ 20*sizeFactor*tamano, 170*sizeFactor*tamano+bajar, mx +3*aux+ 20*sizeFactor*tamano, 170*sizeFactor*tamano+bajar);
            
            reubicar();
            reubicar2();
            
            if(DD==false){
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            
            contD++;    
            }}
            
            else if(DD==true){
            gc.strokeLine(mx+0,180,mx+60,180);
            gc.strokeLine(mx+0+5 *aux,180+50,mx+60-5*aux,180+50);
            
            }
            
            mx = mx + 35*sizeFactor*tamano;
        }
        }}

    public static void dibuja_s(GraphicsContext gc, double sizeFactor){
        if(niveles.isEmpty()){
        gc.strokeLine(mx + 20*sizeFactor, 170*sizeFactor, mx + 25*sizeFactor, 170*sizeFactor);//abajo s
        gc.strokeLine(mx + 25*sizeFactor, 170*sizeFactor, mx + 25*sizeFactor, 165*sizeFactor);//abajo derecha s
        gc.strokeLine(mx + 20*sizeFactor, 165*sizeFactor, mx + 25*sizeFactor, 165*sizeFactor);//medio s
        gc.strokeLine(mx + 20*sizeFactor, 160*sizeFactor, mx + 20*sizeFactor, 165*sizeFactor);//arriba izquierda s
        gc.strokeLine(mx + 20*sizeFactor, 160*sizeFactor, mx + 25*sizeFactor, 160*sizeFactor);//arriba s
        mx = mx + 10*sizeFactor;}
        
        else{
        
        if(!nivelesD.isEmpty()){
            
        }
        
        else{
            
            aux = (int) niveles.get(niveles.size()-1);
            
            gc.strokeLine(mx +5*aux+ 20*sizeFactor*tamano, 170*sizeFactor*tamano+bajar, mx +5*aux+ 25*sizeFactor*tamano, 170*sizeFactor*tamano+bajar);//abajo s
            gc.strokeLine(mx +5*aux+ 25*sizeFactor*tamano, 170*sizeFactor*tamano+bajar, mx +5*aux+ 25*sizeFactor*tamano, 165*sizeFactor*tamano+bajar);//abajo derecha s
            gc.strokeLine(mx +5*aux+ 20*sizeFactor*tamano, 165*sizeFactor*tamano+bajar, mx +5*aux+ 25*sizeFactor*tamano, 165*sizeFactor*tamano+bajar);//medio s
            gc.strokeLine(mx +5*aux+ 20*sizeFactor*tamano, 160*sizeFactor*tamano+bajar, mx +5*aux+ 20*sizeFactor*tamano, 165*sizeFactor*tamano+bajar);//arriba izquierda s
            gc.strokeLine(mx +5*aux+ 20*sizeFactor*tamano, 160*sizeFactor*tamano+bajar, mx +5*aux+ 25*sizeFactor*tamano, 160*sizeFactor*tamano+bajar);//arriba s
        
            reubicar();
            reubicar2();
            
            if(DD==false){
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            
            contD++;    
            }}
            
            else if(DD==true){
            gc.strokeLine(mx+0,180,mx+60,180);
            gc.strokeLine(mx+0+5 *aux,180+50,mx+60-5*aux,180+50);
            
            }
            
            mx = mx + 10*sizeFactor*tamano;
        }  
    }}

    public static void dibuja_o(GraphicsContext gc, double sizeFactor){
        if(niveles.isEmpty()){
        gc.strokeLine(mx + 20*sizeFactor, 170*sizeFactor, mx + 25*sizeFactor, 170*sizeFactor);//abajo o
        gc.strokeLine(mx + 20*sizeFactor, 170*sizeFactor, mx + 20*sizeFactor, 160*sizeFactor);//izquierda o
        gc.strokeLine(mx + 20*sizeFactor, 160*sizeFactor, mx + 25*sizeFactor, 160*sizeFactor);//arriba o
        gc.strokeLine(mx + 25*sizeFactor, 170*sizeFactor, mx + 25*sizeFactor, 160*sizeFactor);//derecha o
        mx = mx + 10*sizeFactor;}
        
        else{
        
            if(!nivelesD.isEmpty()){
            
            }
            
            
            else{
            aux = (int) niveles.get(niveles.size()-1);
            gc.strokeLine(mx +5*aux+ 20*sizeFactor*tamano, 170*sizeFactor*tamano+bajar, mx +5*aux+ 25*sizeFactor*tamano, 170*sizeFactor*tamano+bajar);//abajo o
            gc.strokeLine(mx +5*aux+ 20*sizeFactor*tamano, 170*sizeFactor*tamano+bajar, mx +5*aux+ 20*sizeFactor*tamano, 160*sizeFactor*tamano+bajar);//izquierda o
            gc.strokeLine(mx +5*aux+ 20*sizeFactor*tamano, 160*sizeFactor*tamano+bajar, mx +5*aux+ 25*sizeFactor*tamano, 160*sizeFactor*tamano+bajar);//arriba o
            gc.strokeLine(mx +5*aux+ 25*sizeFactor*tamano, 170*sizeFactor*tamano+bajar, mx +5*aux+ 25*sizeFactor*tamano, 160*sizeFactor*tamano+bajar);//derecha o
            
            reubicar();
            reubicar2();
            
            if(DD==false){
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            
            contD++;    
            }}
            
            else if(DD==true){
            gc.strokeLine(mx+0,180,mx+60,180);
            gc.strokeLine(mx+0+5 *aux,180+50,mx+60-5*aux,180+50);
            
            }
            
            mx = mx + 10*sizeFactor*tamano;
            }
        }}
    
    public static void dibuja_grados(GraphicsContext gc, double sizeFactor){
        
        if(niveles.isEmpty()){
        gc.strokeOval(mx+45*sizeFactor, 115*sizeFactor, 10*sizeFactor, 10*sizeFactor);
        

        }
        
        else{
        if(!nivelesD.isEmpty()){
        }
        
        else{
            
            aux = (int) niveles.get(niveles.size()-1);  
            gc.strokeOval(mx+5*aux+45*tamano, 115*tamano+bajar, 10*tamano, 10*tamano);
            reubicar();
            reubicar2();
            
            if(DD==false){
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            
            contD++;    
            }}
            
            else if(DD==true){
            gc.strokeLine(mx+0,180,mx+60,180);
            gc.strokeLine(mx+0+5 *aux,180+50,mx+60-5*aux,180+50);
            
            }
            
            
        
        }
        
        }
        
    }

    public static void dibuja_i(GraphicsContext gc, double sizeFactor){
        
        if(niveles.isEmpty()){
        gc.strokeLine(mx + 22.5*sizeFactor, 170*sizeFactor, mx + 22.5*sizeFactor, 165*sizeFactor);
        gc.strokeLine(mx + 22.5*sizeFactor, 160*sizeFactor, mx + 22.5*sizeFactor, 160*sizeFactor);
        mx = mx + 10*sizeFactor;}
        
        else{
        
            if(!nivelesD.isEmpty()){
            }
            
            else{
            
                aux = (int) niveles.get(niveles.size()-1);
                gc.strokeLine(mx +5*aux+ 22.5*sizeFactor*tamano, 170*sizeFactor*tamano+bajar, mx +5*aux+ 22.5*sizeFactor*tamano, 165*sizeFactor*tamano+bajar);
                gc.strokeLine(mx +5*aux+ 22.5*sizeFactor*tamano, 160*sizeFactor*tamano+bajar, mx +5*aux+ 22.5*sizeFactor*tamano, 160*sizeFactor*tamano+bajar);
                
            reubicar();
            reubicar2();
            
            if(DD==false){
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            
            contD++;    
            }}
            
            else if(DD==true){
            gc.strokeLine(mx+0,180,mx+60,180);
            gc.strokeLine(mx+0+5 *aux,180+50,mx+60-5*aux,180+50);
            
            }
            
            mx = mx + 10*sizeFactor*tamano;
            }
        }
    }

    public static void dibuja_n(GraphicsContext gc, double sizeFactor){
        
        if(niveles.isEmpty()){
        gc.strokeLine(mx + 20*sizeFactor, 170*sizeFactor, mx + 20*sizeFactor, 160*sizeFactor);
        gc.strokeLine(mx + 25*sizeFactor, 170*sizeFactor, mx + 25*sizeFactor, 160*sizeFactor);
        gc.strokeLine(mx + 20*sizeFactor, 160*sizeFactor, mx + 25*sizeFactor, 170*sizeFactor);
        mx = mx + 10*sizeFactor;}
        
        else{
        if(!nivelesD.isEmpty()){
            
        }
        
        else{
        aux = (int) niveles.get(niveles.size()-1);
        
        gc.strokeLine(mx +5*aux+ 20*sizeFactor*tamano, 170*sizeFactor*tamano+bajar, mx +5*aux+ 20*sizeFactor*tamano, 160*sizeFactor*tamano+bajar);
        gc.strokeLine(mx +5*aux+ 25*sizeFactor*tamano, 170*sizeFactor*tamano+bajar, mx +5*aux+ 25*sizeFactor*tamano, 160*sizeFactor*tamano+bajar);
        gc.strokeLine(mx +5*aux+ 20*sizeFactor*tamano, 160*sizeFactor*tamano+bajar, mx +5*aux+ 25*sizeFactor*tamano, 170*sizeFactor*tamano+bajar);
        
            reubicar();
            reubicar2();
            
            if(DD==false){
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            
            contD++;    
            }}
            
            else if(DD==true){
            gc.strokeLine(mx+0,180,mx+60,180);
            gc.strokeLine(mx+0+5 *aux,180+50,mx+60-5*aux,180+50);
            
            }
            
            mx = mx + 10*sizeFactor*tamano;
        
        }
        
        }
    }
    
    public static void dibuja_c(GraphicsContext gc, double sizeFactor){
        
        if(niveles.isEmpty()){
        gc.strokeLine(mx + 20*sizeFactor, 170*sizeFactor, mx + 25*sizeFactor, 170*sizeFactor);//abajo o
        gc.strokeLine(mx + 20*sizeFactor, 170*sizeFactor, mx + 20*sizeFactor, 160*sizeFactor);//izquierda o
        gc.strokeLine(mx + 20*sizeFactor, 160*sizeFactor, mx + 25*sizeFactor, 160*sizeFactor);//arriba o
        mx = mx + 10*sizeFactor;}
        
        else{
            if(!nivelesD.isEmpty()){
            
            }
            
            else{
            aux = (int) niveles.get(niveles.size()-1);
            
            gc.strokeLine(mx +5*aux+ 20*sizeFactor*tamano, 170*sizeFactor*tamano+bajar, mx +5*aux+ 25*sizeFactor*tamano, 170*sizeFactor*tamano+bajar);//abajo o
            gc.strokeLine(mx +5*aux+ 20*sizeFactor*tamano, 170*sizeFactor*tamano+bajar, mx +5*aux+ 20*sizeFactor*tamano, 160*sizeFactor*tamano+bajar);//izquierda o
            gc.strokeLine(mx +5*aux+ 20*sizeFactor*tamano, 160*sizeFactor*tamano+bajar, mx +5*aux+ 25*sizeFactor*tamano, 160*sizeFactor*tamano+bajar);//arriba o
            
            reubicar();
            reubicar2();
            
            if(DD==false){
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            
            contD++;    
            }}
            
            else if(DD==true){
            gc.strokeLine(mx+0,180,mx+60,180);
            gc.strokeLine(mx+0+5 *aux,180+50,mx+60-5*aux,180+50);
            
            }
            
            mx = mx + 10*sizeFactor*tamano;
            
            }
        
        }
    }
    public static void dibuja_a(GraphicsContext gc, double sizeFactor){
        
        if(niveles.isEmpty()){
        gc.strokeLine(mx + 20*sizeFactor, 165*sizeFactor, mx + 25*sizeFactor, 165*sizeFactor);//abajo o
        gc.strokeLine(mx + 20*sizeFactor, 170*sizeFactor, mx + 20*sizeFactor, 160*sizeFactor);//izquierda o
        gc.strokeLine(mx + 20*sizeFactor, 160*sizeFactor, mx + 25*sizeFactor, 160*sizeFactor);//arriba o
        gc.strokeLine(mx + 25*sizeFactor, 170*sizeFactor, mx + 25*sizeFactor, 160*sizeFactor);//derecha o 
        mx = mx + 10*sizeFactor;}
        
        else{
            if(!nivelesD.isEmpty()){}
            
            else{
            aux = (int) niveles.get(niveles.size()-1);
            
            gc.strokeLine(mx +5*aux+ 20*sizeFactor*tamano, 165*sizeFactor*tamano+bajar, mx +5*aux+ 25*sizeFactor*tamano, 165*sizeFactor*tamano+bajar);//abajo o
            gc.strokeLine(mx +5*aux+ 20*sizeFactor*tamano, 170*sizeFactor*tamano+bajar, mx +5*aux+ 20*sizeFactor*tamano, 160*sizeFactor*tamano+bajar);//izquierda o
            gc.strokeLine(mx +5*aux+ 20*sizeFactor*tamano, 160*sizeFactor*tamano+bajar, mx +5*aux+ 25*sizeFactor*tamano, 160*sizeFactor*tamano+bajar);//arriba o
            gc.strokeLine(mx +5*aux+ 25*sizeFactor*tamano, 170*sizeFactor*tamano+bajar, mx +5*aux+ 25*sizeFactor*tamano, 160*sizeFactor*tamano+bajar);//derecha o 
            
            reubicar();
            reubicar2();
            
            if(DD==false){
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            
            contD++;    
            }}
            
            else if(DD==true){
            gc.strokeLine(mx+0,180,mx+60,180);
            gc.strokeLine(mx+0+5 *aux,180+50,mx+60-5*aux,180+50);
            
            }
            
            mx = mx + 10*sizeFactor*tamano;
            }
        
        }
    }
    public static void dibuja_t(GraphicsContext gc, double sizeFactor){
        
        if(niveles.isEmpty()){
        gc.strokeLine(mx + 22.5*sizeFactor, 170*sizeFactor, mx + 22.5*sizeFactor, 160*sizeFactor);
        gc.strokeLine(mx + 20.5*sizeFactor, 160*sizeFactor, mx + 24.5*sizeFactor, 160*sizeFactor);
        mx = mx + 10*sizeFactor;}
        
        else{
        
        if(!nivelesD.isEmpty()){}
            
        else{
        aux = (int) niveles.get(niveles.size()-1);
        gc.strokeLine(mx +5*aux+ 22.5*sizeFactor*tamano, 170*sizeFactor*tamano+bajar, mx +5*aux+ 22.5*sizeFactor*tamano, 160*sizeFactor*tamano+bajar);
        gc.strokeLine(mx +5*aux+ 20.5*sizeFactor*tamano, 160*sizeFactor*tamano+bajar, mx +5*aux+ 24.5*sizeFactor*tamano, 160*sizeFactor*tamano+bajar);
        
        
        reubicar();
            reubicar2();
            
            if(DD==false){
            int contD = 0;
            for(int x =0;x<niveles.size();x+=2){
            
            gc.strokeLine(mx+0+5*contD,180-50*contD,mx+60-5*contD,180-50*contD);  
            
            contD++;    
            }}
            
            else if(DD==true){
            gc.strokeLine(mx+0,180,mx+60,180);
            gc.strokeLine(mx+0+5 *aux,180+50,mx+60-5*aux,180+50);
            
            }
            
            mx = mx + 10*sizeFactor*tamano;
        }
    }}

    public static void dibuja_seno(GraphicsContext gc, Color myColorOperators, double sizeFactor){
        gc.setStroke(myColorOperators);
        if(contG==true){
        operacion.remove(operacion.size()-1);
        return;
        }  
        
        dibuja_s(gc, sizeFactor);
        dibuja_i(gc, sizeFactor);
        dibuja_n(gc, sizeFactor);
        dibuja_grados(gc,sizeFactor);
        contG=true;
        
        mx = mx + 25*sizeFactor;
    }

    public static void dibuja_coseno(GraphicsContext gc, Color myColorOperators, double sizeFactor){
        if(contG==true){
        operacion.remove(operacion.size()-1);
        return;
        }  
        
        gc.setStroke(myColorOperators);
        dibuja_c(gc, sizeFactor);
        dibuja_o(gc, sizeFactor);
        dibuja_s(gc, sizeFactor);
        dibuja_grados(gc,sizeFactor);
        contG=true;
        mx = mx + 25*sizeFactor;
    }

    public static void dibuja_tangente(GraphicsContext gc, Color myColorOperators, double sizeFactor){
        if(contG==true){
        operacion.remove(operacion.size()-1);
        return;
        }  
        
        gc.setStroke(myColorOperators);
        dibuja_t(gc, sizeFactor);
        dibuja_a(gc, sizeFactor);
        dibuja_n(gc, sizeFactor);
        dibuja_grados(gc,sizeFactor);
        contG=true;
        mx = mx + 25*sizeFactor;
    }
    
    public static void reubicar(){
    
    if (auxmx>mx){
    auxmx=mx;
    nivelmx.add(auxmx);
    
    }
    else{}
    
    }
    
    public static void reubicar2(){
    
    if (auxmx2<mx){
    auxmx2=mx;
    }
    

    }
    
    public static void reubicarD(){
    
    if (auxmxDD>mx){
    auxmxDD=mx;
    
    
    }
    else{}
    
    }
    
    public static void dibujaPunto(GraphicsContext gc, ArrayList<String> operacion, Color myColorNumbers, double sizeFactor){
        gc.setStroke(myColorNumbers);
        gc.setLineWidth(4);
        gc.strokeLine(mx + 8*sizeFactor,  175*sizeFactor,mx + 8*sizeFactor, 175*sizeFactor);
        gc.setLineWidth(1);
        mx = mx + 8*sizeFactor;
    }
    
     public static void dibuja_raiz(GraphicsContext gc, ArrayList<String> operacion, Color myColorOperators, double sizeFactor) {
        gc.setStroke(myColorOperators);
        gc.clearRect(mx+10, 0, 100, 100);
        gc.strokeLine(mx + 20*sizeFactor,  160*sizeFactor,mx + 30*sizeFactor, 175*sizeFactor);
        gc.strokeLine(mx + 30*sizeFactor,  175*sizeFactor,mx + 40*sizeFactor, 125*sizeFactor);
        mx = mx + 35*sizeFactor;

    }
    
    
}