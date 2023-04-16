import java.util.Scanner;

public class StringToken {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        
        if(s.length() == 0){
            System.out.print(0);
        }
        String[] token = s.split("[^A-Za-z]+");
        
        System.out.println(token.length);
        
        for(int i = 0; i < token.length; i++){
            System.out.println(token[i]);
        }
        scan.close();
    }
}

