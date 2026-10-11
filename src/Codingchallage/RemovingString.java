package Codingchallage;

public class RemovingString {

	/*public static void main(String[] args) {
		StringBuffer sfb=new StringBuffer("java programing language");
		sfb.replace(5, 15,"");
		
		System.out.println(sfb);
		// TODO Auto-generated method stub
      String str="i am programer";
	}
*/
      static void remove(String str, String word)
      {
          // Split the string using split() method
          String msg[] = str.split(" ");
          String new_str = "";

          // Iterating the string using for each loop
          for (String words : msg) {

              // If desired word is found
              if (!words.equals(word)) {

                  // Concat the word not equal to the given
                  // word
                  new_str += words + " ";
              }
          }

          // Print the new String
          System.out.print(new_str);
      }

      // Method 2
      // Main driver method
      public static void main(String[] args)
      {
          // Custom string as input
          String str = "This is the the the Geeks For Geeks";

          // Word to be removed from above string
          String word = "the";

          // Calling the method 1 by passing both strings to
          // it
          remove(str, word);
      }
  }
	
   

