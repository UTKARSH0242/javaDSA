package Day1;

public class Compare {
    static void comp(int x,int y,int z){
        if (x == y && y == z){
            System.out.println("Hello");
        }else{
            System.out.println("Geeks");
        }

    }
    public static void main(String[] args) {
        int x =4, y =4, z=4;
//        System.out.println(comp(x,y,z));
        comp(x,y,z);
    }

}
