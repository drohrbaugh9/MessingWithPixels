package netbeansproject;

public class MessingWithPixels {

    static final int h = 2, l = 0, f = 1;
    
    static final int[][] A = {
        {f,f,f,f,f,f,f,f,f,f,f,f,f,f,f,f},
        {f,l,l,l,l,h,h,h,h,h,h,l,l,l,l,f},
        {f,l,l,l,h,h,h,h,h,h,h,h,l,l,l,f},
        {f,l,l,h,h,h,h,l,l,h,h,h,h,l,l,f},
        {f,l,h,h,h,h,l,l,l,l,h,h,h,h,l,f},
        {f,h,h,h,h,l,l,l,l,l,l,h,h,h,h,f},
        {f,h,h,h,h,l,l,l,l,l,l,h,h,h,h,f},
        {f,h,h,h,h,l,l,l,l,l,l,h,h,h,h,f},
        {f,h,h,h,h,l,l,l,l,l,l,h,h,h,h,f},
        {f,h,h,h,h,h,h,h,h,h,h,h,h,h,h,f},
        {f,h,h,h,h,h,h,h,h,h,h,h,h,h,h,f},
        {f,h,h,h,h,l,l,l,l,l,l,h,h,h,h,f},
        {f,h,h,h,h,l,l,l,l,l,l,h,h,h,h,f},
        {f,h,h,h,h,l,l,l,l,l,l,h,h,h,h,f},
        {f,h,h,h,h,l,l,l,l,l,l,h,h,h,h,f},
        {f,f,f,f,f,f,f,f,f,f,f,f,f,f,f,f}};
    static final int[][] B = {
        {f,f,f,f,f,f,f,f,f,f,f,f,f,f,f,f},
        {l,h,h,h,h,h,h,h,h,h,h,h,h,l,l,f},
        {f,h,h,h,h,h,h,h,h,h,h,h,h,h,l,f},
        {f,h,h,h,h,l,l,l,l,l,l,h,h,h,h,f},
        {f,h,h,h,h,l,l,l,l,l,l,h,h,h,h,f},
        {f,h,h,h,h,l,l,l,l,l,l,h,h,h,h,f},
        {f,h,h,h,h,l,l,l,l,l,l,h,h,h,h,f},
        {f,h,h,h,h,h,h,h,h,h,h,h,h,h,l,f},
        {f,h,h,h,h,h,h,h,h,h,h,h,h,h,l,f},
        {f,h,h,h,h,l,l,l,l,l,l,h,h,h,h,f},
        {f,h,h,h,h,l,l,l,l,l,l,h,h,h,h,f},
        {f,h,h,h,h,l,l,l,l,l,l,h,h,h,h,f},
        {f,h,h,h,h,l,l,l,l,l,l,h,h,h,h,f},
        {f,h,h,h,h,h,h,h,h,h,h,h,h,h,l,f},
        {f,h,h,h,h,h,h,h,h,h,h,h,h,l,l,f},
        {f,f,f,f,f,f,f,f,f,f,f,f,f,f,f,f}};
    static final int[][] C = {
        {f,f,f,f,f,f,f,f,f,f,f,f,f,f,f,f},
        {f,l,l,l,l,h,h,h,h,h,h,h,h,l,l,f},
        {f,l,l,l,h,h,h,h,h,h,h,h,h,h,l,f},
        {f,l,l,h,h,h,h,l,l,l,l,h,h,h,h,f},
        {f,l,h,h,h,h,l,l,l,l,l,l,h,h,h,f},
        {f,h,h,h,h,l,l,l,l,l,l,l,l,l,l,f},
        {f,h,h,h,h,l,l,l,l,l,l,l,l,l,l,f},
        {f,h,h,h,h,l,l,l,l,l,l,l,l,l,l,f},
        {f,h,h,h,h,l,l,l,l,l,l,l,l,l,l,f},
        {f,h,h,h,h,l,l,l,l,l,l,l,l,l,l,f},
        {f,h,h,h,h,l,l,l,l,l,l,l,l,l,l,f},
        {f,l,h,h,h,h,l,l,l,l,l,l,h,h,h,f},
        {f,l,l,h,h,h,h,l,l,l,l,h,h,h,h,f},
        {f,l,l,l,h,h,h,h,h,h,h,h,h,h,l,f},
        {f,l,l,l,l,h,h,h,h,h,h,h,h,l,l,f},
        {f,f,f,f,f,f,f,f,f,f,f,f,f,f,f,f}};
    static final int[][] D = {
        {f,f,f,f,f,f,f,f,f,f,f,f,f,f,f,f},
        {f,h,h,h,h,h,h,h,h,h,h,l,l,l,l,f},
        {f,h,h,h,h,h,h,h,h,h,h,h,l,l,l,f},
        {f,h,h,h,h,l,l,l,l,h,h,h,h,l,l,f},
        {f,h,h,h,h,l,l,l,l,l,h,h,h,h,l,f},
        {f,h,h,h,h,l,l,l,l,l,l,h,h,h,h,f},
        {f,h,h,h,h,l,l,l,l,l,l,h,h,h,h,f},
        {f,h,h,h,h,l,l,l,l,l,l,h,h,h,h,f},
        {f,h,h,h,h,l,l,l,l,l,l,h,h,h,h,f},
        {f,h,h,h,h,l,l,l,l,l,l,h,h,h,h,f},
        {f,h,h,h,h,l,l,l,l,l,l,h,h,h,h,f},
        {f,h,h,h,h,l,l,l,l,l,h,h,h,h,l,f},
        {f,h,h,h,h,l,l,l,l,h,h,h,h,l,l,f},
        {f,h,h,h,h,h,h,h,h,h,h,h,l,l,l,f},
        {f,h,h,h,h,h,h,h,h,h,h,l,l,l,l,f},
        {f,f,f,f,f,f,f,f,f,f,f,f,f,f,f,f}};
    
    static final int[][] start = B;
    static final int[][] end = A;
    static int[][] change;
    static int[][] middle;
    static int[][] newMiddle;
    
    static boolean topLeftCorner, topRightCorner, bottomRightCorner, bottomLeftCorner;

    public static void main(String[] args) {
        
        setupMatrices();
        
        //System.out.println("change array (step 0): "); printMatrix(change);
        System.out.println("step 0: "); printMatrix(middle);

        int step = 1;
        while (!matricesEqual(middle, end) && step < 10) {
            /*
            checkCorners(middle);
            for (int r = 1; r < middle.length - 1; r++) {
                int c = 1;
                if (change[r][c] == 1 && checkNeighborsEdges(middle, r, c)) switcheroo(newMiddle, r, c);
                c = middle.length - 2;
                if (change[r][c] == 1 && checkNeighborsEdges(middle, r, c)) switcheroo(newMiddle, r, c);
            }
            
            for (int c = 1; c < middle[0].length - 1; c++) {
                int r = 1;
                if (change[r][c] == 1 && checkNeighborsEdges(middle, r, c)) switcheroo(newMiddle, r, c);
                r = middle.length - 2;
                if (change[r][c] == 1 && checkNeighborsEdges(middle, r, c)) switcheroo(newMiddle, r, c);
            }
            
            for (int i = 2; i < (middle.length - 2); i++) {
                for (int j = 2; j < (middle[i].length - 2); j++) {
                    if (change[i][j] == 1 && checkNeighborsInterior(middle, i, j)) {
                        switcheroo(newMiddle, i, j);
                    }
                }
            }
            //*/
            
            //*
            for (int i = 1; i < (middle.length - 1); i++) {
                for (int j = 1; j < (middle[i].length - 1); j++) {
                    if (change[i][j] == 1 && checkNeighborsInterior(middle, i, j)) {
                        switcheroo(newMiddle, i, j);
                    }
                }
            }//*/
            
            updateMiddle();
            System.out.println("\nstep " + step + ": "); printMatrix(middle);
            updateChange();
            //System.out.println("change array (step " + step + "): "); printMatrix(change);
            step++;
        }
    }

    public static void switcheroo(int[][] a, int i, int j) {
        if (a[i][j] == 2) {
            a[i][j] = 0;
            return;
        }
        if (a[i][j] == 0) {
            a[i][j] = 2;
        }
    }
    
    public static boolean matricesEqual(int[][] a, int[][] b) {
        if (a.length != b.length) { System.out.println("rows not equal"); return false; }
        for (int i = 0; i < a.length; i++) {
            if (a[i].length != b[i].length) { System.out.println("cols " + i + " not equal"); return false; }
            for (int j = 0; j < a[i].length; j++) {
                if ((a[i][j] == 0 && b[i][j] == 2) || (a[i][j] == 2 && b[i][j] == 0)) { /*System.out.println(i + "," + j + " not equal");*/ return false; }
            }
        }
        return true;
    }

    public static void updateChange() {
        change = new int[start.length][start[0].length];
        for (int i = 0; i < start.length; i++) {
            for (int j = 0; j < start[i].length; j++) {
                //change[i][j] = (!(middle[i][j] == end[i][j]));
                if (middle[i][j] == end[i][j]) change[i][j] = 0;
                else change[i][j] = 1;
            }
        }
    }

    public static void updateMiddle() {
        middle = new int[newMiddle.length][newMiddle[0].length];
        for (int i = 0; i < newMiddle.length; i++) {
            for (int j = 0; j < newMiddle[i].length; j++) {
                middle[i][j] = newMiddle[i][j];
            }
        }
    }

    public static boolean checkNeighborsInterior(int[][] a, int row, int col) {
        int val = a[row][col], up = a[row - 1][col], down = a[row + 1][col], left = a[row][col - 1], right = a[row][col + 1];
        boolean cornerOne = (val == 0 && up == 2) || (val == 2 && up == 0);
        boolean cornerTwo = (val == 0 && down == 2) || (val == 2 && down == 0);
        boolean cornerThree = (val == 0 && left == 2) || (val == 2 && left == 0);
        boolean cornerFour = (val == 0 && right == 2) || (val == 2 && right == 0);
        boolean corners = cornerOne || cornerTwo || cornerThree || cornerFour;
        
        /*boolean diagOne = (d == 0 && a[r - 1][c] == H) || (d == 1 && a[r - 1][c] == H);
        boolean diagTwo = (d == 0 && a[r + 1][c] == H) || (d == 1 && a[r + 1][c] == H);
        boolean diagThree = (d == 0 && a[r][c - 1] == H) || (d == 1 && a[r][c - 1] == H);
        boolean diagFour = (d == 0 && a[r][c + 1] == H) || (d == 1 && a[r][c + 1] == H);
        boolean diags = diagOne || diagTwo || diagThree || diagFour;*/
        
        //return diags || corners;
        return corners;
    }
    
    ///*
    public static boolean checkNeighborsEdges(int[][] a, int row, int col) {
        int val = a[row][col], up = a[row - 1][col], down = a[row + 1][col], left = a[row][col - 1], right = a[row][col + 1];
        boolean topEdge = up == 1 && (val == down || val == left || val == right);
        boolean bottomEdge = down == 1 && (val == up || val == left || val == right);
        boolean leftEdge = left == 1 && (val == up || val == down || val == right);
        boolean rightEdge = right == 1 && (val == up || val == down || val == left);
        return topEdge || bottomEdge || leftEdge || rightEdge;
    }
    //*/
    
    /*
    public static void checkCorners(int[][]a) {
        int up = a[row - 1][col], down = a[row + 1][col], left = a[row][col - 1], right = a[row][col + 1];
        int val = middle[1][1], bottomRow = a.length - 2, leftCol = a[0].length - 2;
        topLeftCorner = change[1][1] == 1 && (val == down || val == right;)
        val = middle[1][leftCol];
        topRightCorner = change[1][leftCol] == 1 && (val == down || val == left);
        val = middle[bottomRow][leftCol];
        bottomRightCorner = change[bottomRow][leftCol] == 1 && (val == down || val == left);
    }
    //*/
    
    public static void printMatrix(int[][] a) {
        for (int i = 1; i < a.length - 1; i++) {
            for (int j = 1; j < a[i].length - 1; j++) {
                if (a[i][j] == 2) System.out.print("M ");
                else if (a[i][j] == 0) System.out.print("_ ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
    
    public static void setupMatrices() {
        
        middle = new int[start.length][start[0].length];
        for (int i = 0; i < start.length; i++) {
            for (int j = 0; j < start[i].length; j++) {
                middle[i][j] = start[i][j];
            }
        }
        newMiddle = new int[middle.length][middle[0].length];
        for (int i = 0; i < middle.length; i++) {
            for (int j = 0; j < middle[i].length; j++) {
                newMiddle[i][j] = middle[i][j];
            }
        }
        updateChange();
    }
}
