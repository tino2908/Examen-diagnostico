
import java.util.Scanner;
public class luis {
    
    public static void main(String[] args)
    {
        Scanner QS = new Scanner(System.in);
        String a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11;
        int Edad;
        System.out.print("Ingresa tu nombre completo:\n");
        a1 = QS.nextLine();
        
        System.out.print("Fecha cuando nacio:\n");
        a2= QS.nextLine();
        
        System.out.print("Edad actual:\n");
        Edad= QS.nextInt();
        
        System.out.print("Genero:\n");
        QS.nextLine();
        a3= QS.nextLine();
        
        System.out.print("Ocupacion o trabajo:\n");
        a4= QS.nextLine();
        
        System.out.print("Hobbie favorito:\n");
        a5= QS.nextLine();
        
        System.out.print("Pelicula favorita:\n");
        a6= QS.nextLine();
        
        System.out.print("Comida favorita:\n");
        a7= QS.nextLine();
        
        System.out.print("Animal favorito:\n");
        a8= QS.nextLine();
        
        System.out.print("Que esperas de mí en la carrera?\n");
        a9= QS.nextLine();
        
        System.out.print("Estas orgulloso de mí? (SI/NO):\n");
        a10= QS.nextLine();
        
        if (a10.equalsIgnoreCase("NO")) 
        {
            System.out.print("Por que?:\n");
            a11= QS.nextLine();
            System.out.print("Gracias por contestar mi cuestionario");
        }
    }
    
}
