abstract class Bank {
    abstract void getBalance();

    int num = 10;

    void print() {
        System.out.println("printing...");
    }

}

class SBI extends Bank {
    void getBalance() {
        System.out.println("$100");
    }
}

class Axis extends Bank {
    void getBalance() {
        System.out.println("$200");
    }
}

class ICICI extends Bank {
    void getBalance() {
        System.out.println("$300");
    }
}

public class abstractClass {
    public static void main(String args[]) {
        SBI a = new SBI();
        a.getBalance();
        a.print();
        System.out.println(a.num);
    }
}