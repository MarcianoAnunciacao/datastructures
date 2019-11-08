package datastructures.searching.binarysearch;

public class BinarySearch {

    public static int binarySearch(int [] elements, int valueForSearching){

        int p = 0;
        int r = elements.length - 1;
        int q = 0;
        while(p <= r){
            q = (p + r)/2;

            if(elements[q] == valueForSearching){
                return q;
            }

            if (elements[q] > valueForSearching) {
                r = q-1;
            }else{
                p = q+1;
            }
        }

        return -1;
    }

}