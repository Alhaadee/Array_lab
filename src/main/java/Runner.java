import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

//        1. Add "Coll" to the end of the list
        scottishIslands.add("Coll");
//        2. Add "Tiree" to the start of the list
        scottishIslands.add(0, "Tiree");
//        3. Add "Islay" after "Jura" and before "Mull"
        scottishIslands.add(2, "Islay");
//        4. Print out the index position of "Skye"
        System.out.println(scottishIslands.indexOf("Skye"));
//        5. Remove "Tresco" from the list by name
        scottishIslands.remove("Tresco");
//        6. Remove "Arran" from the list by index
        scottishIslands.remove(5);
//        7. Print the number of islands in your arraylist
        System.out.println(scottishIslands.size());
//        8. Sort the list alphabetically
        Collections.sort(scottishIslands);
//        9. Print out all the islands using a for loop
        for (String island : scottishIslands) {
            System.out.println(island);
        }
        System.out.println(scottishIslands);

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers
        for (Integer num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
//        2. Print the difference between the largest and smallest value
        System.out.println(Collections.max(numbers) - Collections.min(numbers));
//        3. Print True if the list contains a 1 next to a 1 somewhere.
        Boolean consecutive_one = false;
        for (int i = 0; i < numbers.size() ; i++) {
            if (numbers.get(i).equals(1) && numbers.get(i+=1).equals(1)) {
                consecutive_one = true;
            }
        }
        System.out.println(consecutive_one);

//        4. Print the sum of the numbers,
        Integer sum = 0;
        for (Integer num : numbers){
            sum += num;
        }
        System.out.println(sum);
//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.
        sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
            if (numbers.get(i).equals(13)) {
                sum -= 13;
                numbers.get(i++);
            }
            }

            System.out.println(sum);
//          So [7, 13, 2] would have sum of 9.

        }

    }


