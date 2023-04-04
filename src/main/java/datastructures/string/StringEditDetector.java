package datastructures.string;

public class StringEditDetector {

    public boolean isItEdited(String one, String two){
        boolean edited = false;
        int matches = 0;
        char previous;
        for (int i=0; i < one.length(); i++) {

            for (int j = 0; j < two.length(); j++) {
                if(one.charAt(i) == two.charAt(j) /*&& previous != one.charAt(j)*/){
                    matches += 1;
                }

            }
        }
        if(matches >= one.length()-1){
            edited = true;
        }
        return edited;

    }

}
