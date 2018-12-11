
package Metodo;
import Metodo.Fila_Aleatorio;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class CsMetodo_Aleatorio {
static double n1;
static double n2;
    
    public ArrayList aleatorio(int iteraciones){
          
        ArrayList<Fila_Aleatorio>lista;
        
        int a,b,c,aux;  // Variables
        
        a=10; // Limite inferior 
        b=23; // Limite superior 
        c=13; // Moda
        int array[]= new int[iteraciones];
        int i=0; // contador
       
        lista= new ArrayList<Fila_Aleatorio>();
        
        for(int x=0; x<array.length; x++){
            
            Fila_Aleatorio fila = new Fila_Aleatorio();    
            
            n1 = (double) (Math.random() *1.0) + .0; 
            System.out.println(" Aleatorio (R1):"+n1);
            n2 = (double) (Math.random() *1.0) + .0; 
            System.out.println(" Aleatorio (R2):"+n2);
           
            if(n1<(b-a)/(c-a)){
                double datos=a+(b-a)*Math.sqrt(n2);
                fila.setAleatorio(datos);
            }else{
                double datos2=c-(c-b)*Math.sqrt(1-n2);
                fila.setAleatorio(datos2);
            }

            fila.setI(i);
            i++;
            
            lista.add(fila);
        }
        
        return lista;
    }
    
}
