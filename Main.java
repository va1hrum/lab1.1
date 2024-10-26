import java.util.Random;
import static java.lang.Math.*;

public class Main {

    public static void Wprint (double[] w1) {
        for ( double num : w1) {
            String b = String.format("%.3f",num);
            System.out.print(b+"\t");
        }
        System.out.println(' ');
    }



    public static double wex1(double  x){
        return  pow(E,tan(pow(x,3)));
    }
    public static double wex2(double  x){
        return asin(pow(1/pow(E, abs(x)),2));
    }
    public static double wex3(double  x){
        return pow(2/asin(1/pow(E,pow(cos(sin(pow(E,x))),2))),2);
    }



    public static void main(String[] args) {

        short[] e = {7,9,11,13,15,17,19,21};

        double[] x = new double[17];
        Random random = new Random(); //создаём объект класса
        for (int i = 0; i < x.length; i++) {
            x[i] = random.nextDouble(-12.0,9.0);
        }



        double[][] w = new double[8][17];
        for (int i = 0; i < e.length; i++){
            for (int j = 0; j < x.length; j++){
                w[i][j] = switch (e[i]){
                    case 9 -> wex1(x[j]);
                    case 11,15,19,21 -> wex2(x[j]) ;
                    default -> wex3(x[j]);
                };
            }
        }

        for (double[] s: w) {
            Wprint(s);
        }



    }
}

