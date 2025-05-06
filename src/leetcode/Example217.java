package leetcode;

import java.util.HashSet;
import java.util.Scanner;

public class Example217 {


    public boolean containsDuplicate(int[] nums){
        //haset used cause hasset stores unique values only
        HashSet<Integer> hashSet =new HashSet<>();
    for (int num :nums){
        if (!hashSet.add(num)) {

            return true;
        }
    }
        return false;
    }

    public static void main(String[] args) {

            Example217 example217 = new Example217();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter numbers separated by spaces (e.g., 1 2 3 1):");
            String inputLine = scanner.nextLine(); // Read entire line
            String[] parts = inputLine.trim().split("\\s+"); // Split by spaces

            int[] nums = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                nums[i] = Integer.parseInt(parts[i]); // Convert each to int
            }

            boolean hasDuplicate = example217.containsDuplicate(nums);
            System.out.println("Contains duplicate? " + hasDuplicate);
        }
    }
