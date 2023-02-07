import java.util.Scanner;

class intTypes{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        for(int i = 0; i < n; i++){

            try{
                long number = input.nextLong();
            
                if(number >= -9223372036854775808L && number <= 9223372036854775807L){
                    System.out.println(number + " can be fitted in:");
                    
                    if(number >= -128 && number <= 127)
                        System.out.println("* byte");     
                    if(number >= -32768 && number <= 32767)
                        System.out.println("* short");     
                    if(number >= -2147483648 && number <= 2147483647)
                        System.out.println("* int");     
                    if(number >= -9223372036854775808L && number <= 9223372036854775807L)
                        System.out.println("* long"); 
                }
                else{
                    System.out.println(number + " can't be fitted anywhere");
                }
            }
            catch(Exception e){
                System.out.println(input.next() + " can't be fitted anywhere");
            }
        }
    }

}