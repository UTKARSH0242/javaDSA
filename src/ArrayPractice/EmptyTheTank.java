package ArrayPractice;

public class EmptyTheTank {
    static long minDaysToEmpty(long C, long l) {
        long newcap=0;
        long i=0;
        long x=0;
        for(;i<Integer.MAX_VALUE;i++)
        {
            if(newcap>C)
            {
                newcap=C;
            }
            else if(newcap<C)
            {

                newcap=newcap+l;
                newcap=newcap-i;
            }

            if(newcap==0)
            {
                x=i;
            }
        }
        return (int)x;

}
    public static void main(String[] args) {
    long C = 5;
    long l = 2;
        System.out.println(minDaysToEmpty(C,l));
    }
}
