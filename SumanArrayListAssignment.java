package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SumanArrayListAssignment {

	 static ArrayList<Integer> numberList = new ArrayList<Integer>();
	  
     //Task 1: Creating an ArrayList
	 
	 public SumanArrayListAssignment()
	 {
		 for(int i = 1; i <= 10; i++)
		 {
			 numberList.add(i); 
		 }
	 }
    
	// Task 2: Displaying ArrayList Contents
    
	 public void displayArrayList(ArrayList<Integer> list)
	 {
		 System.out.println(list);
	 }
	 
	 //Task 3: Adding Elements
	 
	 public void addElement(int a)
	 {
		 numberList.add(a);
	 }
	 
	 //Task 4: Removing Elements
	 
	 public void removeElement(int r)
	 {
		 numberList.remove(Integer.valueOf(9));
	 }
	 
	 //Task 5: Reversing the ArrayList
	 
	 public void reverseArrayList()
	 {
		Collections.reverse(numberList);
	 }
	 
	 //Task 6: Finding the Sum
	 
	 public int findSum()
	 {
		 int sum = 0;
		 
		 for(int i = 0; i< numberList.size(); i++)
		 {
			 sum = sum + numberList.get(i);
		 }
		 return sum;
	 }
	 
	 //Task 7a: Finding the Maximum number
	 
	 public int findMaximum(ArrayList<Integer> list) {
	        if (list.isEmpty()) {
	            throw new IllegalArgumentException("List has no values.....");
	        }

	        int max = list.get(0);

	        for (Integer num : list) {
	            if (num > max) {
	                max = num;
	            }
	        }

	        return max;
	    }
	 
	 //Task 7b: Finding the Minimum number
	 
	 public int findMinimum(ArrayList<Integer> list) {
	        if (list.isEmpty()) {
	            throw new IllegalArgumentException("List has no values.....");
	        }
	        int min = list.get(0);
	        for(Integer num : list)
	        {
	        	if(min > num )
	        	{
	        		min = num;
	        	}
	        }
	        return min;
	 }
//	 public int findMinimum() {
//	        return Collections.min(numberList);
//	    }
	 
	 //Task 8: Sorting the ArrayList
	 
	 public void sortArrayList()
	 {
		 Collections.sort(numberList);
	 }
	
	
	 //Task 10: Finding an Element
	 
		 public int findElement(ArrayList<Integer> list, int target) {
		        for (int i = 0; i < list.size(); i++) {
		            if (list.get(i) == target) {
		                return i;
		            }
		        }
		        return -1;
	 }
		 
		 
		 //Task 11: Removing Duplicates
	 
		 public void removeDuplicates() {
				ArrayList<Integer> newList = new ArrayList<>();
				for(Integer num : numberList) {
					if(!newList.contains(num)) {
						newList.add(num);
					}
				}
				numberList = newList;
			}
			
	 
		 //Task 12: Sublist Operations
		 
		 public List<Integer> getSublist(int start, int end){
				return numberList.subList(start, end);
			}
		 
		 
		// Task 13: Checking for Empty ArrayList
		 
		 public boolean isEmptyArrayList(ArrayList<Integer> list)
		 {
		 if(list.isEmpty())
		 {
			 return true;
		 }else
		return false;
		 }
		 
		 
		 
		 //Task 14: Replacing Elements
				
			public void replaceElement(ArrayList<Integer> list, int old, int nw)
			{
				Collections.replaceAll(list, old, nw);
			}
				
			
			//Task 15: Counting Occurrences
			
			public int countOccurrences(int n)
			{
				return Collections.frequency(numberList, n);
			}
			
			
			
			//Task 16: Clearing the ArrayList
			
			
			public void clearArrayList()
			{
				numberList.clear();
			}
			
			
			//Task 17: Getting the Size
			
			public int getArrayListSize()
			{
				return numberList.size();
			}
			
			//Task 18: Creating a Copy
			
			public ArrayList<Integer> copyArrayList()
			{
				ArrayList<Integer> list = new ArrayList<Integer>(numberList);
				return list;
				
			}
			
			
			//Task 19: Finding the Average
			int avg = 0;
			int sum = 0;
			public double findAverage()
			{
				
				for(int num : numberList)
				{
					sum = sum + num;
				}
				avg = sum / numberList.size();
				return avg;
				
			}
				
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("********ArrayList Operations in Java********");
         System.out.println();
         
         //Task 9: Testing of each method
         SumanArrayListAssignment s = new SumanArrayListAssignment();
       
         
         System.out.println("ArrayList contents are :: "+s.numberList);
         System.out.println();
         
         System.out.println("Display method::");
         s.displayArrayList(numberList);        
         System.out.println();
         
         
         s.addElement(72);
         s.addElement(69);
         s.addElement(9);
         s.addElement(9);
         s.addElement(9);
         s.addElement(9);
         System.out.println("Adding elements::");
         s.displayArrayList(numberList);
         System.out.println();
         
         
         s.removeElement(9);
         System.out.println("Removing  an element::");
         s.displayArrayList(numberList);
         System.out.println();
         
         
         s.reverseArrayList();
         System.out.println("Reverse ArrayList:: ");
         System.out.println(numberList);
         System.out.println();
         
        
         System.out.println("Sum of all elements in ArrayList:: ");
         System.out.println(s.findSum());
         System.out.println();
         
         
         System.out.println("Maximum number of all:: ");
         System.out.println(s.findMaximum(numberList));
         System.out.println();
         
         
         System.out.println("Minimum number of all:: ");
         System.out.println(s.findMinimum(numberList));
         System.out.println();
         
         
         
         s.sortArrayList();
         System.out.println("Sorting of ArrayList numbers:: ");
         System.out.println(numberList);
         System.out.println();
         
         
         System.out.println("Finding of an element:: ");
         int index = s.findElement(numberList, 72);
         if(index != -1)
         {
        	 System.out.println("Element is at index " + index);
         }
         else {
             System.out.println("Element is not in the list.");
         }
         System.out.println();
         
         
         
         System.out.println("List after removing the duplicate elements:: ");
         s.removeDuplicates();
         System.out.println(numberList);
         System.out.println();
         
         
         System.out.println("Contents of Sublist are:: ");
         System.out.println(s.getSublist(2, 10));
         System.out.println();
         
         
         System.out.println("Checking the list is empty or not....");
         System.out.println(s.isEmptyArrayList(numberList));
         System.out.println();
         
         
         System.out.println("Replacing the element with new one...");
         s.replaceElement(numberList, 6,100 );
         System.out.println(numberList);
         System.out.println();
         
         
         System.out.println("Counter check of an element...");
         System.out.println(s. countOccurrences(9));
         System.out.println();
         
         
         System.out.println("Size of Arraylist.......");
         int size =  s.getArrayListSize();
         System.out.println(size);
         System.out.println();
         
         
         System.out.println("Copy of older list...");
         System.out.println(s.copyArrayList());
         System.out.println();
         
         
         System.out.println("Average of List....");
         System.out.println(s.findAverage());
         System.out.println();
         
         
         System.out.println("Delete all the elements of list....");
         s.clearArrayList();
         System.out.println(numberList);
       
        
        
         
         
        	 
         
       
         
	}

}
