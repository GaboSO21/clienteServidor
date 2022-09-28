/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.hashpractice;

import java.util.HashMap;

/**
 *
 * @author GabrielPC
 */
public class HashPractice {

    public static void main(String[] args) {
        
        // HashMap<String, String> countries = new HashMap<>();
        
        // //Adds a key and a value
        // countries.put("Costa Rica", "San Jose");
        // countries.put("USA","Washington DC");
        // countries.put("Russia", "Moscow");
        // countries.put("China", "Beijing");

        // //Remove a stored key and it's value
        // countries.remove("USA");

        // //Returns the value associated to the key
        // System.out.println(countries.get("Russia"));

        // //Clears the hashmap
        // // countries.clear();
        // // System.out.println(countries);

        // //Returns an int value refering to the amounts of keys and their value
        // System.out.println(countries.size());

        // //Replace the value that belongs to the specified key
        // countries.replace("Costa Rica", "Cartago");
        // System.out.println(countries);

        // //Returns all the keys stored in the hasmap
        // System.out.println(countries.keySet());

        // //Returns a boolean value, checking if a key exists in the map
        // System.out.println(countries.containsKey("England"));
        // //Returns a boolean value, checking if a value exists in the map
        // System.out.println(countries.containsValue("San Jose"));

        //TwoSum leetcode
        long startTime = System.nanoTime();

        int[] array = twoSum(new int[] {2,4,8,9,0,10}, 13);
        String info = "";
        for (int i = 0; i < array.length; i++) {
            info += array[i] + " ";
        }
        System.out.println(info);

        long totalTime = System.nanoTime() - startTime;
        System.out.println(totalTime);
    }

    public static int[] twoSum(int[] nums, int target){

        HashMap<Integer, Integer> solution = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            solution.put(i, nums[i]);
            int complement = target - solution.get(i);
            if(solution.containsValue(complement)){
                return new int[] {complement, solution.get(i)};
            }
        }

        return null;

    }






}
