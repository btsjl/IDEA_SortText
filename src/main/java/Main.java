import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        double n = a.nextDouble();
        person[] d = new person[(int) n];
        for (int i = 0; i < n; i++) {
            int num = a.nextInt();
            String name = a.next();
            double s = a.nextDouble();
            double f = a.nextDouble();
            double z = a.nextDouble();
            d[i] = new person(num, name, s, f, z);
        }
    }
}

class person {
    String name;
    int num;
    double s, f, z;

    public person(int num, String name, double s, double f, double z) {
        this.num = num;
        this.name = name;
        this.s = s;
        this.f = f;
        this.z = z;
    }


}
