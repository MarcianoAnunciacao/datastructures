package datastructures.searching.linearsearch;

public class LinearSearch {

    public static int search( int [] elements, int valueForSearching){
        for (int index =0; index < elements.length; index++){
            if(elements[index] == valueForSearching){
                return index;
            }
        }
        return -1;
    }
}