public class IsOverlap {
    public static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int x1 = rec1[0];
        int y1 = rec1[1];
        int x2 = rec1[2];
        int y2 = rec1[3];

        // for rectangle 2
        int a1 = rec2[0];
        int b1 = rec2[1];

        int a2= rec2[2];
        int b2= rec2[3];

        // check for all side
        if (x2<=a1 || a2<=x1 || y2<=b1 || b2 <=y1) return false;
        //  right  || left   || top    || bottom
        return true;
    }


    public static void main() {
        int [] arr1 ={0,0,4,4};
        int [] arr2 = {2,2,6,6};
        System.out.println("if both rectangle overlap return ture else false :- " +isRectangleOverlap(arr1,arr2));

        int [] num1 = {0,0,4,4};
        int [] num2 = {5,5,8,8};
        System.out.println("if both rectangle overlap return ture else false :- " +isRectangleOverlap(num1,num2));
    }
}
