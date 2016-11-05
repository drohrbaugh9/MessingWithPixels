package netbeansproject;

import java.util.Arrays;

public class MessingWithPixels {

    static final boolean M = true, L = false;

    static final boolean[][] start = {
        {L, L, L, L, L},
        {L, M, L, L, L},
        {L, M, L, L, L},
        {L, M, L, L, L},
        {L, M, L, L, L},
        {L, M, M, M, L},
        {L, L, L, L, L}};
    static final boolean[][] end = {
        {L, L, L, L, L},
        {L, M, M, L, L},
        {L, M, L, M, L},
        {L, M, M, L, L},
        {L, M, L, M, L},
        {L, M, M, L, L},
        {L, L, L, L, L}};
    /*static final boolean[][] start = {
        {L, L, L, L, L, L, L},
        {L, M, M, M, L, L, L},
        {L, L, L, L, L, L, L}};
    static final boolean[][] end = {
        {L, L, L, L, L, L, L},
        {L, L, L, M, M, M, L},
        {L, L, L, L, L, L, L}};*/
    static boolean[][] change;
    static boolean[][] middle;
    static boolean[][] newMiddle;

    public static void main(String[] args) {
        setupMatrices();
        
        //System.out.println("change array (step 0): "); printMatrix(change);
        System.out.println("step 0: "); printMatrix(middle);

        int step = 1;
        while (!matricesEqual(middle, end) && step < 10) {
            for (int i = 1; i < (middle.length - 1); i++) {
                for (int j = 1; j < (middle[i].length - 1); j++) {
                    if (change[i][j] && checkNeighbors(middle, i, j)) {
                        switcheroo(newMiddle, i, j);
                    }
                }
            }
            updateMiddle();
            System.out.println("step " + step + ": "); printMatrix(middle);
            updateChange();
            //System.out.println("change array (step " + step + "): "); printMatrix(change);
            step++;
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
    
    public static boolean matricesEqual(boolean[][] a, boolean[][] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i].length != b[i].length) return false;
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != b[i][j]) return false;
            }
        }
        return true;
    }

    public static void updateChange() {
        change = new boolean[start.length][start[0].length];
        for (int i = 0; i < start.length; i++) {
            for (int j = 0; j < start[i].length; j++) {
                change[i][j] = (!(middle[i][j] == end[i][j]));
            }
        }
    }

    public static void updateMiddle() {
        middle = new boolean[newMiddle.length][newMiddle[0].length];
        for (int i = 0; i < newMiddle.length; i++) {
            for (int j = 0; j < newMiddle[i].length; j++) {
                middle[i][j] = newMiddle[i][j];
            }
        }
    }

    public static boolean checkNeighbors(boolean[][] a, int r, int c) {
        boolean d = a[r][c];
        boolean corners = d != a[r - 1][c] || d != a[r + 1][c] || d != a[r][c - 1] || d != a[r][c + 1];
        boolean diags = d != a[r - 1][c - 1] || d != a[r - 1][c + 1] || d != a[r + 1][c - 1] || d != a[r + 1][c + 1];
        return diags || corners;
    }
    
    public static void printMatrix(boolean[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j]) System.out.print("M ");
                else System.out.print("_ ");
            }
            System.out.println();
        }
    }
    
    public static void setupMatrices() {
        middle = new boolean[start.length][start[0].length];
        for (int i = 0; i < start.length; i++) {
            for (int j = 0; j < start[i].length; j++) {
                middle[i][j] = start[i][j];
            }
        }
        newMiddle = new boolean[middle.length][middle[0].length];
        for (int i = 0; i < middle.length; i++) {
            for (int j = 0; j < middle[i].length; j++) {
                newMiddle[i][j] = middle[i][j];
            }
        }
        updateChange();
    }
}
