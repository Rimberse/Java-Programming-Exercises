package io.github.rimberse.Java_Programming_Exercises.collections;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

/**
 * A PhoneDirectory holds a list of names with a phone number for
 * each name.  It is possible to find the number associated with
 * a given name, and to specify the phone number for a given name.
 */
public class PhoneDirectory {
   
   private Map<String, String> data;
   
   /**
    * Constructor creates an initially empty directory.
    */
   public PhoneDirectory() {
      data = new TreeMap<>();
   }
   
   /**
    * Looks for a name/number pair with a given name.  If found, the index
    * of the pair in the data array is returned.  If no pair contains the
    * given name, then the return value is -1.  This private method is
    * used internally in getNumber() and putNumber().
    */
   private int find (String name) {
	   if (data.containsKey(name))
		   return 1;	 // The name has been found in position i.
	   
      return -1;  // The name does not exist in the array.
   }
   
   /**
    * Finds the phone number, if any, for a given name.
    * @return The phone number associated with the name; if the name does
    *    not occur in the phone directory, then the return value is null.
    */
   public String getNumber(String name) {
      int position = find(name);
      if (position == -1)
         return null;   // There is no phone entry for the given name.
 
      return data.get(name);
   }
   
   /**
    * Associates a given name with a given phone number.  If the name
    * already exists in the phone directory, then the new number replaces
    * the old one.  Otherwise, a new name/number pair is added.  The
    * name and number should both be non-null.  An IllegalArgumentException
    * is thrown if this is not the case.
    */
   public void putNumber(String name, String number) {
      if (name == null || number == null)
         throw new IllegalArgumentException("name and number cannot be null");
      int i = find(name);
      
      if (i >= 0) {
             // The name already exists, in position i in the array.
             // Just replace the old number at that position with the new.
        data.put(name, number);
      }
      else {
            // Add a new name/number pair to the array.  If the array is
            // already full, first create a new, larger array.
    	  data.put(name, number);
      }
   }

} // end class PhoneDirectory