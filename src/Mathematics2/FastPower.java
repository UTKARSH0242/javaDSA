package Mathematics2;

public class FastPower {
    public static double fastPower(double a, int b){
        if(b == 0)
            return 1;
        else{
            double res = fastPower(a, b/2);
            if(b % 2 < 0)
                return res * res / a;
            else if(b % 2 > 0)
                return res * res * a;
            else
                return res * res;
        }
    }

    public static void main(String[] args) {



        System.out.println(fastPower(2, -2));

    }

}


