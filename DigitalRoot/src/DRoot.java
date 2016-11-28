public class DRoot {
  public static int digital_root(int n) {
	  int digitalRoot = 0;
	  int len = Integer.toString(n).length();
	  int[] iarray = new int[len];
	  int numLeft = len;
	  	
	  for (int index = 0; index < len; index++) {
	  		iarray[index] = n % 10;
	  		n /= 10;
	  	}
	  
	  while (numLeft > 0) {
	  if (len > 1) {
		  for (int i = 0; i < len; i ++ ) {
			  
		  }
		}
	}
	  return digitalRoot;
  }
}