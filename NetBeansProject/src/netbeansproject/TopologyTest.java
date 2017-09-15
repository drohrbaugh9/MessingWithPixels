package netbeansproject;

import java.util.ArrayList;

public class TopologyTest {
    
    static final int h = 2, l = 0, f = 1;
    static ArrayList<ArrayList<Integer>> start, donut;
    static ArrayList<ArrayList<Integer>> aa;
    static int[][] s = {{f, f, f, f, f, f, f},
                        {f, l, h, l, l, l, f},
                        {f, l, h, h, l, h, f},
                        {f, h, h, h, h, h, f},
                        {f, f, f, f, f, f, f}};
    static int[][] d = {{f,f,f,f,f,f,f,f,f,f},
                        {f,l,l,h,h,h,h,l,l,f},
                        {f,l,h,h,l,l,h,h,l,f},
                        {f,h,h,l,l,l,l,h,h,f},
                        {f,l,h,h,l,l,h,h,l,f},
                        {f,l,l,h,h,h,h,l,l,f},
                        {f,f,f,f,f,f,f,f,f,f}};
        
    
                         
    
    public static void main(String[] args) {
        ArrayListInit();
        printArray(start);
        printArray(donut);
    }

    public static void ArrayListInit() {
        start = new ArrayList<>();
        for (int i = 0; i < s.length; i++) {
            start.add(new ArrayList<Integer>());
            for (int j = 0; j < s[i].length; j++) {
                start.get(i).add(s[i][j]);
            }
        }
        
        donut = new ArrayList<>();
        for (int i = 0; i < d.length; i++) {
            donut.add(new ArrayList<Integer>());
            for (int j = 0; j < d[i].length; j++) {
                donut.get(i).add(d[i][j]);
            }
        }
    }
    
    public static void printArray(ArrayList<ArrayList<Integer>> a) {
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < a.get(i).size(); j++) {
                if (a.get(i).get(j) == 2) System.out.print("M ");
                else if (a.get(i).get(j) == 0) System.out.print("_ ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        //System.out.println();
    }
    
    public ArrayList<ArrayList<Integer>> traverseShape(ArrayList<ArrayList<Integer>> a, int i, int j) {
        boolean[][] visited = new boolean[a.size()][a.get(0).size()];
        if (a.get(i).get(j) < 2) return null;
        aa = new ArrayList<>(a);
        //traverseShape(visited, i, j);
        return aa;
    }
    
    /*public traverseShape(boolean[][] v, int i, int j) {
        
        if (aa.get(i).get(j) > 0) v[i][j] = true;
        if
    }*/
}
