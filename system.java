/**
 * Arbitrary mapping algorithm
 *
 * AUTHOR        Jayed S. Rafi
 * DATE          August 2021
 *
 * PURPOSE: randomize array values
 */

public class system {

// main
// interface to test the system
public static void main(String[] args) {
  
  int[] list = {1,2,3,4,5,6,7,8,9};
  print(list,randomize(list));
  
  }//end main

  
/**
 * PURPOSE: randomization
 * INPUT PARAMETERS:
 *    initial array
 * OUTPUT PARAMETERS:
 *    returns the modified array
 */
public static int[] randomize ( int[] list ){
  
  final int SIZE = list.length; //length of initial array
  final int RANDOM_CONSTANT = (int)(Math.random()*SIZE);
  int[] temp = new int[SIZE]; //temporary array
  
  for(int i=0; i<SIZE; i++){
      int index = (i+RANDOM_CONSTANT)%SIZE; //index
      temp[index] = list[i]; //update
  }
  
  return temp;
  }//End MapArray

  
/**
 * PURPOSE: prints the contents of initial and modified array
 * INPUT PARAMETERS:
 *    initial and modified array
 */
public static void print( int[] list, int[] mod){
  System.out.println("[ Index ] [ Base list ] [ Arbitrary Mapping Algorithm ] ");
  
  for(int i=0; i<list.length; i++){
      System.out.println("Index["+i+"] = "+" [ "+list[i]+" ] "+" [ "+mod[i] +" ]");
  }
  
}//end print
  

}//end system
