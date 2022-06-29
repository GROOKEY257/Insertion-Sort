import java.util.*;

public class Main {
    public static void main(String args[]) {
        int[] sort = new int[]{35, 20, 30000, 10, -1};
        boolean isSorted = false;
        int tempInt;
        int place = 0;
        for (int i = 0; i < sort.length; i++) {
            place = i;
            System.out.println(place);
            isSorted = false;
                if (place < sort.length - 1 && sort[place] > sort[place + 1]) {
                    tempInt = sort[place + 1];
                    sort[place + 1] = sort[place];
                    sort[place] = tempInt;
                    while (!isSorted) {
                        if (place > 0 && sort[place] < sort[place - 1]) {
                            tempInt = sort[place - 1];
                            sort[place - 1] = sort[place];
                            sort[place] = tempInt;
                            if (place > 0) {
                                place--;
                            }
                        }
                        else {
                            isSorted = true;
                        }
                    }
                }
                else {
                    isSorted = true;
                }
        }
        for (int i = 0; i < sort.length; i++) {
            System.out.print(sort[i] + " ");
        }
    }
}
