/**
 * Main
 * HDT#7 - Estructura de Datos
 * @author Esteban Aldana Guerra 20591
 * Refrencia de codigo:
 * BTS.zip, Este fue el ejemplo dado el clase por nuestro catedratico
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File txt = null;
        FileReader fr = null;
        BufferedReader br = null;


        Scanner sc = new Scanner(System.in);

        BinarySearchTree ing = new BinarySearchTree();
        BinarySearchTree esp = new BinarySearchTree();
        BinarySearchTree fra = new BinarySearchTree();

        try {
            txt = new File("Diccionario.txt");
            Scanner linea = new Scanner(txt);
            fr = new FileReader(txt);
            br = new BufferedReader(fr);

            while (linea.hasNextLine()) {
                String data = linea.nextLine();
                String[] word = data.split(",");

                Traduccion tra = new Traduccion(word);

                //realizamos la comparación desde la versión extendida creada que es la de comparableasso
                ComparableAssociation ingles = new ComparableAssociation(word[0], tra);
                ComparableAssociation espa = new ComparableAssociation(word[1], tra);
                ComparableAssociation frances = new ComparableAssociation(word[2], tra);

                ing.add(ingles);
                esp.add(espa);
                fra.add(frances);



            }
            linea.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        ing.iterator();
        int op = 0;
        int op1 = 0;
        boolean salir = true;
    while (true)
    
        {
            System.out.println(" ");
            System.out.println("-------------------Traductor----------------");

            System.out.println("A que idioma quisiera traducir su texto??");
            System.out.println("1. Ingles");
            System.out.println("2. Español");
            System.out.println("3. Frances");
            System.out.println("4. Salir");
            op = sc.nextInt();
            if(op == 1)
            {
                
            }
            else if(op == 2)
            {
                
            }
            else if(op == 3)
            {
                
            }
            else if(op == 4){
                System.out.println("Gracias por usar el programa");
                salir = false;
                System.exit(0);
            }
            else{
                System.out.println("Ingrese numeros los cuales se encuentran en el rango correspondiente");
            }
        }
    }
}



      

       