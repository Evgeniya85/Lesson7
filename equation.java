package lesson7;
import java.util.Scanner;
import java.util.StringTokenizer;

public class equation {
        static Scanner reader=new Scanner (System.in);
        public static void main(String[]args) {
            String m = reader.nextLine();
            StringTokenizer st=new StringTokenizer(m,"+=");
            String aa=st.nextToken();
            int x= Character.getNumericValue(aa.charAt(0));
            int y=Integer.parseInt(st.nextToken());
            int z=Integer.parseInt(st.nextToken());

            int res=(z-y);
            System.out.print(res);

        }
    }



