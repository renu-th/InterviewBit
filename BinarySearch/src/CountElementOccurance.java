
public class CountElementOccurance {

	/*
	 * 
	 * Given a sorted array of integers, find the number of occurrences of a given target value.
		Your algorithm’s runtime complexity must be in the order of O(log n).
		If the target is not found in the array, return 0

	 **Example : **
		Given [5, 7, 7, 8, 8, 10] and target value 8,
		
		For ArrayList use list.get(i) and list.size()
	 */
	public static int findOccurance(int[] list, int target, boolean isFirstOccurance)
	{
		int start = 0;
		int end = list.length-1;	
		int result =-1;		
		while(start<=end)
		{
			int mid = start + (end-start)/2;
			if (list[mid] == target)
			{
				result= mid;
				if(isFirstOccurance)
					end = mid-1; //Trying to find the first occurance, try searching towards left
				else
					start = mid+1; //finding last occurance
			}
			else if(list[mid] > target)
				end = mid-1;
			else 
				start = mid+1;
		}
		
		return result;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = {5,5,5, 7, 7, 8, 8,8, 10};
		int firstOccurance = findOccurance(nums,5,true);
		if(firstOccurance ==-1)
			System.out.println(0);
		else
		{
			int lastOccurance = findOccurance(nums,5,false);
		 System.out.println(lastOccurance-firstOccurance+1);
		}

	}

}
