class Solution {
    public int largestPerimeter(int[] A) {
        int max=0;
        for (int i=0; i<A.length;i++) {
            for (int j=i+1;j<A.length;j++) {
                for (int k=j+1;k<A.length;k++) {
                    //System.out.println("i="+i+"; j="+j+"; k="+k);
                    if (formTriangle(A[i], A[j], A[k])) {
                        int perimeter = A[i]+ A[j]+ A[k];
                        if (perimeter>max) {
                            max=perimeter;
                        }
                    }
                }
            }
            
        }
        return max;
    }
    public static boolean formTriangle(int a, int b, int c) {
        if (a+b>c && a+c>b && b+c>a) {
            return true;
        } else {
            return false;
        }
    }
}

//***********************************888
class Solution {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i=A.length-1;i>=0;i--) {
            for (int j=i-1;j>=0;j--) {
                for (int k=j-1;k>=0;k--) {
                    if (formTriangle(A[i], A[j], A[k])) {
                        return A[i]+ A[j]+ A[k];
                }
            }
        }
        }
        return 0;
        /*int max=0;
        for (int i=0; i<A.length;i++) {
            for (int j=i+1;j<A.length;j++) {
                for (int k=j+1;k<A.length;k++) {
                    //System.out.println("i="+i+"; j="+j+"; k="+k);
                    if (formTriangle(A[i], A[j], A[k])) {
                        int perimeter = A[i]+ A[j]+ A[k];
                        if (perimeter>max) {
                            max=perimeter;
                        }
                    }
                }
            }
            
        }
        return max;*/
    }
    public static boolean formTriangle(int a, int b, int c) {
        if (a+b>c && a+c>b && b+c>a) {
            return true;
        } else {
            return false;
        }
    }
}
