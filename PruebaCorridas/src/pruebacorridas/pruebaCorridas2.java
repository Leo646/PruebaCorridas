/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacorridas;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author cluster
 */
public class pruebaCorridas2 {
    public static void main(String[] args) {
        // TODO code application logic here
        double alfa;
        int R=1;
        int n1=0;
        int n2=0;
        double promedio=0;
        double desviacion=0;
        double Z=0;
        ArrayList<Integer>binarios= new ArrayList<>();
        Numeros nu=new Numeros();
        double datos[]=nu.getDatos();
        
      
        
        for (int i =1; i <datos.length; i++) {
            if(datos[i]<=datos[i-1]){
                binarios.add(0);
                n2++;
            }else{
                binarios.add(1);
                n1++;
            }  
            
            
        }
        
        
        
   
        int contador=binarios.get(0);
        for (int i =0; i < binarios.size(); i++) {
            if(binarios.get(i)!=contador){
                    R++;
                contador=binarios.get(i);
            }
            System.out.print(binarios.get(i) +"");
        }
        System.out.print(" \n");
        System.out.println("positivas: "+n1);
        System.out.println("negativas: "+n2);
         
        DecimalFormat  decimal = new DecimalFormat("0.000");
        promedio= ((double)(2*n1*n2)/(n1+n2)+1);
        desviacion=(Math.sqrt((2*n1*n2*(2*n1*n2-n1-n2))/((Math.pow(n1+n2, 2))*(n1+n2-n1))));
        Z=(R-promedio)/desviacion;
         System.out.print("corridas "+R+ "\n"+"promedio: " +promedio +" \n"+
                 "desviacion: "+ decimal.format(desviacion)+"\n"+"Valor de Z: "+ decimal.format(Z));
        
    }
    
    
}
