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

/**
 *
 * @author waki
 */
public class Division {
    
    
    
    static ArrayList niveles = new ArrayList();
    
    int contN = 1;
    static double bajar = 0;
    static double tamano = 1;
    
    public void limpiar(){
    bajar = 0;
    niveles.clear(); contN=1;
    
    tamano = 1;
    }
    
    
    public void division(GraphicsContext gc){
    
    if (niveles.isEmpty()){
        System.out.println("funciona");
        
        niveles.add(1);
        niveles.add(1);
        
        System.out.println(niveles);
        
        gc.strokeLine(mx+0,180,mx+60,180);
        
        contN++;
    }
    
    else if(!niveles.isEmpty()){
    
    if(niveles.size()==1){
    aux=1000; 

    niveles.add(contN);
    niveles.add(contN);
    int aux = (int) niveles.get(niveles.size()-3);
     bajar= bajar+5*aux;
    
    int x =(int) bajar-10;
    
    
    gc.strokeLine(mx+0+5*aux,180+50*aux,mx+60-5*aux,180+50*aux);
    
    
    } 
        
    
    else{
    aux=1000; 
       
    niveles.add(contN);
    niveles.add(contN);
    
    int aux = (int) niveles.get(niveles.size()-3);
    
    System.out.println("Es:"+aux);
    bajar= bajar-5*aux;
    
    int x =(int) bajar-10;
    System.out.println("sube"+ x);
    
    gc.strokeLine(mx+0+5*aux,180-50*aux,mx+60-5*aux,180-50*aux);
    
    auxmx=1000;
    contN++;
    tamano=tamano*0.75;
    System.out.println(niveles);
    }}
        
        
    
    }
    
    public void bajar(){
        
        if(!niveles.isEmpty()){
            if(niveles.size()==1){
            niveles.remove(niveles.size()-1);
            bajar();
            }
            
            else if(niveles.get(niveles.size()-1) == niveles.get(niveles.size()-2)){
            niveles.remove(niveles.size()-1);
            bajar = bajar + 60*tamano;
            mx=(double) nivelmx.get(nivelmx.size()-1) ;
            nivelmx.remove(nivelmx.size()-1);
            System.out.println(mx);}
            
            else{
            mx = mx+15;
            bajar = bajar - 30;
            niveles.remove(niveles.size()-1);
            System.out.println("niveles "+ niveles);
            tamano = tamano + (tamano*0.25);
     
            }
            System.out.println("niveles: "+niveles);
        }
        
        else{ bajar=0;
              mx=mx+35;
        }
        
 
    
    

    
}}
