/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import static calculadora.Dibuja.mx;
import static calculadora.Dibuja.aux;
import static calculadora.Dibuja.auxmx;
import static calculadora.Dibuja.nivelmx;
import java.util.ArrayList;
import javafx.scene.canvas.GraphicsContext;
import static calculadora.Dibuja.auxmx2;
import static calculadora.Dibuja.auxmxDD;


/**
 *
 * @author waki
 */
public class Division {
    
    
    
    static ArrayList niveles = new ArrayList();
    static ArrayList nivelesD = new ArrayList();
    int contN = 1;
    static double bajar = 0;
    static double bajarD = 0;
    static double tamano = 1;
    static double tamanoD = 1;
    static double auxtamano = 0;
    static double auxtamanoD = 0;
    static double auxmxD = 1000;
    static double contMX = 0;
    static boolean DD = false;
    
    static ArrayList listaBajar = new ArrayList();
    
    public void limpiar(){
    bajar = 0; bajarD =0;
    niveles.clear(); contN=1;nivelesD.clear();
    auxtamano = 0; auxtamanoD = 0;
    tamano = 1; tamanoD = 1;
    listaBajar.clear();
    DD=false;
    }
    
    
    public void division(GraphicsContext gc){
    
    if (niveles.isEmpty()){
        System.out.println("funciona");
        
        niveles.add(1);
        niveles.add(1);
        
        System.out.println(niveles);
        
        gc.strokeLine(mx+0,180,mx+60,180);
        reubicar();
        auxmx =1000;
                
        contN++;
    }
    
    else if(!niveles.isEmpty()){
    
    if(niveles.size()==1){
    contN++;
    DD = true;
    niveles.add(contN);
    niveles.add(contN);
    System.out.println(niveles);
    int aux = (int) niveles.get(niveles.size()-3);
    

    bajar= bajar+26*aux;
    listaBajar.add(bajar);
    
    int x =(int) bajar+10;
    reubicar();
    
    auxmx=1000;
    
    gc.strokeLine(mx+0+5 *aux,180+50,mx+60-5*aux,180+50);
    
    tamano=tamano*0.75;
    }
    
    else if(niveles.get(niveles.size()-1)!= niveles.get(niveles.size()-2)){
    int sube = 0;
    int auxBajar = 0;
        
    if((int)niveles.get(niveles.size()-1) == 3){
    
    auxBajar = 75;
    sube = 45;
    }
    
    else if((int)niveles.get(niveles.size()-1)== 2){
    
    auxBajar = 25;
    sube = 95;
    }
    
    nivelesD.add(5);
    nivelesD.add(5);
    bajarD = bajarD + sube;
 
    gc.strokeLine(mx+0+15 ,180-auxBajar,mx+60-15,180-auxBajar);
    tamanoD=tamanoD*0.75;
    tamanoD=tamanoD*0.75;
    tamanoD=tamanoD*0.75;
    tamanoD=tamanoD*0.75;
    mx =mx+10;
    if(auxmxD>mx){auxmxD=mx;}
    
    
    
    }
    
    
        
    
    else{
    aux=1000; 
       
    niveles.add(contN);
    niveles.add(contN);
    
    int aux = (int) niveles.get(niveles.size()-3);
    
    listaBajar.add(bajar);
    
    bajar= bajar-8*aux;
    
    
   
    
    gc.strokeLine(mx+0+5*aux,180-50*aux,mx+60-5*aux,180-50*aux);
    reubicar();
    auxmx=1000;
    contN++;
    auxtamano = tamano;
    
    tamano=tamano*0.75;
    
    }
    System.out.println(niveles);
    }
        
        
    
    }
    
    public void bajar(){
        
        
        
        if(!nivelesD.isEmpty()){
            
            
            if(nivelesD.size()==1){
            nivelesD.remove(nivelesD.size()-1);
            mx=mx+10;
            }
            

            else if(nivelesD.get(nivelesD.size()-1) == nivelesD.get(nivelesD.size()-2)){
                
            int aux = (int) nivelesD.get(nivelesD.size()-1);
            nivelesD.remove(nivelesD.size()-1);
            
            bajarD = bajarD +68-8*aux;
            mx = auxmxDD;
            }
            
            
            
        }
        else{
        if(!niveles.isEmpty()){
            if(niveles.size()==1){
            niveles.remove(niveles.size()-1);
            
            bajar();
            }
            
            else if(niveles.get(niveles.size()-1) == niveles.get(niveles.size()-2)){
                
            int aux = (int) niveles.get(niveles.size()-1);
            niveles.remove(niveles.size()-1);
            
            bajar = bajar +68-8*aux;
            if(niveles.size()==1){bajar=bajar+8;}
            
            
            mx=(double) nivelmx.get(nivelmx.size()-1) ;
            nivelmx.remove(nivelmx.size()-1);
            
            contN--;
            
            }
            
            else{
            DD=false;
            int aux = (int) niveles.get(niveles.size()-1);   
            mx = mx+15;
            bajar = (double)  listaBajar.get(listaBajar.size()-1);
            listaBajar.remove(listaBajar.size()-1);
            niveles.remove(niveles.size()-1);
            System.out.println("niveles "+ niveles);
            tamano = tamano + (auxtamano*0.25);
     
            }
          
        }
        
        // Al salir de la division y borrar todos los niveles esto hara que vuelve a colocar numeros a la altura que tiene sin que este dentro de una division
        
        else{ 
            
              mx= auxmx2;
              bajar=0;
              mx=mx+70;
              limpiar();
              nivelmx.clear();
              
        }
       }}

    public static void reubicar(){
    
    if (auxmx>mx){
    auxmx=mx;
    nivelmx.add(auxmx);
    System.out.println(nivelmx);
    }
    else{}
    
    }
}
