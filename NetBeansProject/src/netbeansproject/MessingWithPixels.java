package netbeansproject;

import java.util.ArrayList;

public class MessingWithPixels {

    static boolean M = true, _ = false;

    static boolean[][] start = {
        {_, _, _, _, _, _, _},
        {_, M, M, M, M, _, _},
        {_, M, M, M, M, _, _},
        {_, _, _, _, _, _, _},
        {_, _, _, _, _, _, _}};
    static boolean[][] end = {
        {_, _, _, _, _, _, _},
        {_, _, _, _, _, _, _},
        {_, _, M, M, M, M, _},
        {_, _, M, M, M, M, _},
        {_, _, _, _, _, _, _}};
    static boolean[][] change;
    static boolean[][] middle = start;
    static boolean[][] newMiddle = middle;

    public static void main(String[] args) {

        //System.out.println("change array: " + change.toString());
        System.out.println("step 0: [" + middle.toString().substring(8, middle.toString().length() - 8) + "]");

        while (middle != end) {
            //System.out.println("newmiddle: " + newMiddle.toString() + ", i: 0");
            for (int i = 1; i < (middle.length - 1); i++) {
                for (int j = 1; j < (middle[i].length - 1); j++) {
                    if (change[i][j] && (middle.get(i) != middle.get(i - 1) || middle.get(i) != middle.get(i + 1))) {
                        switcheroo(newMiddle, i);
                    }
                }
                //System.out.println("newmiddle: " + newMiddle.toString() + ", i: " + i);
                //System.out.println("middle: " + newMiddle.toString());
            }
            middle = new ArrayList<>(newMiddle);
            System.out.println("step " + (j + 1) + ": [" + middle.toString().substring(8, middle.toString().length() - 8) + "]");
            updateChange();
        }
    }

    public static void switcheroo(boolean[][] a, int i, int j) {
        if (a[i][j]) {
            a[i][j] = false;
            return;
        }
        if (!a[i][j]) {
            a[i][j] = true;
        }
    }

    public static void updateChange() {
        change = new boolean[start.length][start.length];
        for (int i = 0; i < start.length; i++) {
            for (int j = 0; j < start.length; j++) {
                change[i][j] = (!(middle[i][j] == end[i][j]));
            }
        }
    }
}
