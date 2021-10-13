/*******************************
 * 
 * Project: Arbritary mapping algorithm
 * Language: Java
 * Date: August 2021
 * 
 * Dev: Jayed Rafi
 *
*******************************/

public class ArbitraryMappingAlgorithm {
/***
 * Main
 */
public static void main(String[] args) {
  int[] sortedList = {1,2,3,4,5,6,7,8,9};
  print(sortedList,MapArray(sortedList));
  }//End main

/***
 * Arbitrary Mapping Algorithm
 * Step 1: Counts the length of the list
 * Step 2: Randomly decides a value between zero to length of the list
 * Step 3: initialize the maping array
 * Step 4: Assign an abitrary value to each index of the new array
 * Step 5: Assign the value of from the list accordingly in the index of:
 * Index = {current index number of the list (i) + Random constant from (Step 2)}%length of the list (Step 1)
 */
public static int[] MapArray ( int[] list ){
  int dataQuantity = list.length;
  final int RANDOM_CONSTANT = (int)(Math.random()*dataQuantity);
  int[] map = new int[dataQuantity];
  
  for(int i=0; i<map.length; i++)
  {
  map[i] = 000;
  }
  
  for(int i=0; i<map.length; i++){
      int index = (i+RANDOM_CONSTANT)%dataQuantity;
      map[index] = list[i];
  }
  return map;
  }//End MapArray

/***
 * An helper function to print the elements
 */
public static void print( int[] list, int[] Map){
  System.out.println("[ Index ] [ Base list ] [ Arbitrary Mapping Algorithm ] ");
  for(int i=0; i<list.length; i++){
      System.out.println("Index["+i+"] = "+" [ "+list[i]+" ] "+" [ "+Map[i] +" ]");
  }
}//End print

}//End class 
