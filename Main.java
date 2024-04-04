import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(factorialiter(4));
        String("help");


        ArrayList<Integer> array = new ArrayList();
        array.add(1); array.add(2); array.add(2);
        array.add(3); array.add(3);

        int[] intlist =  {2,3,2,3,2,3};

        Array(intlist, 2);
        ArrayList(array, 5);

    }

    public static int factorial(int i) {
        if (i == 0 || i == 1) {
            return 1;
        } else {
            return i * factorial(i - 1);
        }
    }
    public static int factorialiter(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void String(String str) {
        if (str.length() == 0)
        {
            return;
        }
        System.out.print(str.charAt(0) + " ");
        String(str.substring(1));
    }

    public static void Array(int[] list, int i) {
        if (i == list.length) {
            return;
        }
        System.out.print(list[i] + " ");
        Array(list, i + 1);
    }
    public static void ArrayList(ArrayList<Integer> list, int i) {
        if (i == list.size()) {
            return;
        }
        System.out.print(list.get(i) + " ");
        ArrayList(list, i + 1);
    }


}
