package test;

public class Num {
    int value;

    public static void main(String[] args) {
        Num n = new Num();
        n.value = 5;
        incre(n);
        System.out.println(n.value);

    }

    static void incre(Num n){
        n.value++;
    }
}
