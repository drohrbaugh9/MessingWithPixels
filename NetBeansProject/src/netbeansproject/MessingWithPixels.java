package netbeansproject;

import java.util.ArrayList;
import java.util.Arrays;

public class MessingWithPixels {

    static ArrayList<Boolean> start; static boolean[] s = {false, true, true, true, false, false, false};
    static ArrayList<Boolean> end; static boolean[] e = {false, false, false, true, true, true, false};
    static ArrayList<Boolean> change;
    static ArrayList<Boolean> middle;
    static ArrayList<Boolean> newMiddle;

    public static void main(String[] args) {
        ArrayListInit();
      	
        //System.out.println("change array: " + change.toString());
        System.out.println("step 0: " + middle.toString());

        int j = 0;
        while (!middle.equals(end) && j < 6) {
            //System.out.println("newmiddle: " + newMiddle.toString() + ", i: 0");
            for (int i = 1; i < (middle.size() - 1); i++) {
                if (change.get(i) && (middle.get(i) != middle.get(i - 1) || middle.get(i) != middle.get(i + 1))) {
                    switcheroo(newMiddle, i);
                }
                //System.out.println("newmiddle: " + newMiddle.toString() + ", i: " + i);
                //System.out.println("middle: " + newMiddle.toString());
            }
            middle = new ArrayList<>(newMiddle);
            System.out.println("step " + (j + 1) + ": " + middle.toString());
          	updateChange();
          	j++;
        }
    }

    public static void switcheroo(ArrayList<Boolean> a, int i) {
        if (a.get(i)) {
          	a.remove(i);
            a.add(i, false);
            return;
        } if (!a.get(i)) {
          	a.remove(i);
            a.add(i, true);
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
            change.add(!(middle.get(i) == end.get(i)));
        }
  	}
}