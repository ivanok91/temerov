/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temerov;

/**
 *
 * @author ivan.temerov
 */
public class Temerov {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        int num;
        int cifra;
        int sommaPesata =0;
        int contatore =0;
        System.out.println("ciao");
        
        do{
            System.out.println("inserisci un numero di 4 cifre da tasiera");
            numero = Tastiera.leggiUnIntero();
        }while(numero<9999 || numero<1000);
        num=numero;
        
        do {
            cifra = num%10;
            if(contatore == 1 || contatore == 3){
                sommaPesata += cifra*3;
            } else if (contatore == 1 || contatore == 3){
                sommaPesata += cifra*1;
            }
            contatore+=1;
        }while(num>0);
        
        
        
        
        
        }
        
    
    
}
