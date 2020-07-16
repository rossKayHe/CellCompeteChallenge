import java.util.*;
public class CellCompete {
    public static void main(String[] args) {
        // write your code here
        int days = 5;
        ArrayList<Integer> states = new ArrayList<>(Arrays.asList(1, 0, 0, 1, 0, 0, 1, 1));
        for(int day = 1; day == days; day++) {
            states=getCellValues(states);
        }
        System.out.println(getCellValues(states));
    }
    static ArrayList<Integer> getCellValues(ArrayList<Integer> states_in){
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add((states_in.get(1))%2);

        for (int i = 1; i < (states_in.size() - 1); i++) {
            result.add((states_in.get(i - 1) + states_in.get(i + 1)) % 2);
        }
        result.add((states_in.get(6))%2);
        return result;
    }
}
