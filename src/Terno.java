import java.sql.Array;

public class Terno {
    public static void main(String[] args) {

        String resulado = 78==78 ? "obvio bobis" : "obovio no bobis" ;
        System.out.println("resultado"+" "+ resulado);

        String[] myArray = {"b","d","c","a"};
        System.out.println("myArray = " + myArray[2]);

        for(int i=0;i<myArray.length;i++){
            System.out.println("myArray"+" "+myArray[i]);
        }

        for(int i=0;i<myArray.length;i++){
            if (myArray[i]=="b"){
                System.out.println("myArray "+myArray[i]);
                break;
            }
        }
        
        for (int i=0;i<101;i++){
            System.out.println("i = " + i);
        }
    }
}
