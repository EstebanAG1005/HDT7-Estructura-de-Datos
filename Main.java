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
    }
}

       