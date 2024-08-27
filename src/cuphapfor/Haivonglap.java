package cuphapfor;

public class Haivonglap {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int j=0; j<=10; j++){
                System.out.print("* # *");
                System.out.println(" ## ");
            
            }
            System.out.println();
        }   
        for(int i=1; i<=5; i++){
            for(int j=1; j<=10; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        int n = 1;
        while(n>=10)
        {
            System.out.println(n + " ");
            n = n*2;
        }
    }
}
