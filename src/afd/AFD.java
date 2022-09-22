

package afd;

import javax.swing.*;

public class AFD
{
    public static void main(String[] args)
    {
     int j=1;
        while(j <= 5)//El Programa se repite 5 veces
       {  
        char cadena [] = new char[4];//Arreglo para ingresar la cadena se puede cambiar de valor
        int q=0;//iniciamos en el estado q0

           JOptionPane.showMessageDialog(null,"El siguiente AFD es capaz de reconocer cadenas con la siguiente caracteristicas: \n\n a^n b^m donde m > 0");
           for(int i=0; i<cadena.length; i++)
           {//ciclo para ingresar valores
           String entrada = JOptionPane.showInputDialog("Ingrese los caracteres del alfabeto:");
           cadena[i]=entrada.charAt(0);//con charAt(0) obligo a la entrada de datos que solo tome el valor del primer dato que se ingreso
           }

        for(int i=0; i<cadena.length; i++)
           {//ciclo para validar la cadena
               if(q==0) //estado q0
               {
                   if(cadena[i]=='a')
                   {
                       q=0; //se queda en q0
                   }
                   if(cadena[i]=='b')
                   {
                       q=1; //se va a q1
                   }
                   continue;
               } 
               if(q==1) //estado q1
               {
                   if(cadena[i]=='a')
                   {
                       q=0; //se regresa a q0
                   }
                   if(cadena[i]=='b')
                   {
                       q=1; //se queda en q1
                   }
                   continue;      
                }
           }
           if(q==1)
           {
               //si se queda en q1
               JOptionPane.showMessageDialog(null,"La cadena es valida. ");
           }
           else
           {
               //de lo contrario
               JOptionPane.showMessageDialog(null,"La cadena no es valida ");
           }
           j++;
        }//Fin del While
    }//Fin del main
}//Fin del Programa

