package somadeprimos;
import java.util.Scanner; 
public class SomaDePrimos 
{
    public static void main(String[] args) 
    {
        int exit = 1;
        while(exit != 0)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Informe um n° inteiro: ");
            int n = sc.nextInt();
            int som = 0;
            int i = 1;
            while(i <= n)
            {
                if (n >= 7)
                {
                    float a = 1%2;
                    float b = 1%3;
                    float c = 1%4;
                    float d = 1%5;
                    float e = 1%6;
                    float f = 1%7;
                    float g = 1%8;
                    float h = 1%9;
    
                if(a != 0 && b != 0 && c != 0 && d != 0 && e != 0 && f != 0 && g != 0 && h != 0)
                {
                    som += i;
                }
            }
            i++;
            }
            if(n >= 7)System.out.println(som+2+3+5+7);
            if(n<7)
            {
                switch(n)
                {
                    case 1 : System.out.println("1"); ;break;
                    case 2 : System.out.println("3"); ;break;
                    case 3 : System.out.println("6"); ;break;
                    case 4 : System.out.println("6"); ;break;
                    case 5 : System.out.println("11"); ;break;
                    case 6 : System.out.println("11"); ;break;
                }
            }
            System.out.println("sair? digite 0: ");
            exit = sc.nextInt();
        } 
    }
}

