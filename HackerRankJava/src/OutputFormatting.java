import java.util.Scanner;

public class OutputFormatting {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                if(s1.length()<10)
                	for(int j=s1.length();j<10;j++)
                		s1=s1+" ";
                String formattedInt = String.format("%03d", x);
                System.out.println(s1+"     "+formattedInt);
            }
            
            System.out.println("================================");

    }
}
