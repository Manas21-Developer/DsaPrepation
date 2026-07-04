package Java.Array;

public class ArrayComparsion {
    public boolean helper (int [] arr1, int [] arr2){
        if (arr1 == null  || arr2 == null) return arr1 == arr2; // if  user pass null as parameter to avoid NullPointerException
        if (arr1.length != arr2.length ) return false;

        int i = 0;
        while (i <arr1.length){
            if (arr1[i] != arr2[i]) return  false;
            i++;
        }return true;
    }
}
