package javaOOPS2;

public class LearnInheritence {
    public static void main(String[] args) {
        Samsung s10 = new Samsung();
        s10.playGames();

        Apple a1 = new Apple();
        a1.playGames();

    }
}
class Samsung extends mobilePhone {
    void playGames() {
        System.out.println("Samsung play game");
    }
}

    class Apple extends mobilePhone {

    }
    class mobilePhone {
        String os;
        int price;
        int dimen;

        void playGames(){
            System.out.println("Apple is playing game");
        }
}


