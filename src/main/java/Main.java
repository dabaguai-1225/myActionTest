import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // throw new WrongFormatException();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        try {
            if (a == 1) {
                System.out.println(1);
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.exit(-1);
        }
        Runner runner = new Runner(MyPerson.class, MyNetwork.class);
        runner.run();
    }
}

