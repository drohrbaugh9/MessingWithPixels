public class Test {
  public static void main(String[] args) {
    boolean[] start = {true, true, true, false, false};
    boolean[] end = {false, false, true, true, true};
    boolean[] change = new boolean[start.length];
    boolean[] middle = start;
    
    for (int i = 0; i < start.length; i++) {
      change[i] = !(start[i] && end[i]);
      //System.out.println(change[i]);
    }
    
    while(!equal(middle, end)) {
      for (int i = 0; i < middle.length; i++) {
        if (i == 0 && change[i] && middle[i] != middle[i + 1]) switch(middle, i);
        else if (i == (middle.length - 1) && change[i] && middle[i] != middle[i - 1]) switch(middle, i);
        else if (change[i] && (middle[i] != middle[i + 1] || middle[i] != middle[i - 1])) switch(middle, i);
      }
    }
  }
  
  public boolean equal(boolean[] a, boolean[] b) {
    if (a.length != b.length) return false;
    for (int i = 0; i < a.length; i++) {
      if (a[i] != b[i]) return false;
    }
    return true;
  }
  
  public void switch(boolean[] a, index i) {
    if (a[i]) {
      a[i] = false;
      return;
    } else if (!a[i]) {
      a[i] = true;
    }
  }
}
