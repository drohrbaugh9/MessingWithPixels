package netbeansproject;

import java.util.ArrayList;
import java.util.Arrays;

public class OneD_Test {

    static final int h = 2, l = 0, f = 1;
    static ArrayList<Integer> start; static int[] s = {f, l, h, l, l, l, f};
    static ArrayList<Integer> end;   static int[] e = {f, l, l, l, h, l, f};
    static ArrayList<Integer> change;
    static ArrayList<Integer> middle;
    static ArrayList<Integer> newMiddle;
  
    //debugging variables
    static boolean printChange = false;

    public static void main(String[] args) {
        ArrayListInit();

        System.out.print("step 0: ");
        printArray(middle);
        printChange();

        int j = 0;
        while (!middle.equals(end) && j < 6) {
            System.out.println("newMiddle: " + newMiddle.toString() + ", i: 0");
            for (int i = 1; i < middle.size() - 1; i++) {
                if (change.get(i) == 2 && (middle.get(i) != middle.get(i - 1) || middle.get(i) != middle.get(i + 1))) {
                    switcheroo(newMiddle, i);
                }
                System.out.println("newMiddle: " + newMiddle.toString() + ", i: " + i);
                System.out.println("middle: " + newMiddle.toString());
            }
            middle = new ArrayList<>(newMiddle);
            System.out.print("step " + (j + 1) + ": ");
            printArray(middle);
            updateChange();
            printChange();
            j++;
        }
    }

    public static void switcheroo(ArrayList<Integer> a, int i) {
        if (a.get(i) == 2) {
            a.remove(i);
            a.add(i, 0);
            return;
        }
        if (a.get(i) == 0) {
            a.remove(i);
            a.add(i, 2);
        }
    }

    public static void ArrayListInit() {
        start = new ArrayList<>();
        for (int i = 0; i < s.length; i++) {
            start.add(s[i]);
        }

        end = new ArrayList<>();
        for (int i = 0; i < e.length; i++) {
            end.add(e[i]);
        }

        middle = new ArrayList<>(start);
        newMiddle = new ArrayList<>(middle);
        updateChange();
    }

    public static void updateChange() {
        change = new ArrayList<>();
        for (int i = 0; i < start.size(); i++) {
            if (middle.get(i) != end.get(i)) change.add(2);
            else change.add(0);
        }
    }
    
    public static void printArray(int[] a) {
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] == 2) System.out.print("M ");
            else if (a[i] == 0) System.out.print("_ ");
            else System.out.print("  ");
        }
        System.out.println();
    }
    
    public static void printArray(ArrayList<Integer> a) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == 2) System.out.print("M ");
            else if (a.get(i) == 0) System.out.print("_ ");
            else System.out.print("  ");
        }
        System.out.println();
    }
    
    public static void printChange() {
      	if (!printChange) return;
        System.out.println("change array: [" + change.toString().substring(4,change.toString().length() - 4) + "]");
    }
}
