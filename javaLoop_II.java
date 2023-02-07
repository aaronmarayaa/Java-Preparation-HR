
import java.util.Scanner;
import java.lang.Math;

import java.util.Scanner;

class javaLoop_II{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int q = input.nextInt();
        for(int i = 0; i < q; i++){
            int a = input.nextInt();
            int b = input.nextInt();
            int n = input.nextInt();
            
            int result = 0;
            int x = 0;
            int l = 1;
            x = a + l * b;
            result += x;
            for(int k = 1; k <= n; k++){
                System.out.print(result + " "); 
                l *= 2;                
                result += l * b;
            }
            System.out.println();
        }
    }
}