package com.rk.mergesorting;

/* --> Merge Sort is one of the most popular sorting algorithms that is based on the principle of 
 * 		Divide and Conquer Algorithm.
 * --> Here, a problem is divided into multiple sub-problems. Each sub-problem is solved individually.
 * 		Finally, sub-problems are combined to form the final solution.
 * --> Sorting In Place: No
 * --> Stable: Yes
 * --> Auxiliary Space: O(n)
 * --> It has a complexity as follows:
 * --------------------------------------------------------------------------
 * 					|	Best Case	|	Average Case	|	Worst Case
 * --------------------------------------------------------------------------
 * Time Complexity	|	O(nlogn)	|	O(nlogn)		|	O(nlogn)
 * --------------------------------------------------------------------------
 * Space Complexity	|	O(n)		|	O(n)			|	O(n)
 * --------------------------------------------------------------------------
 * */
public class MergeSort {
	private int size;
	private int[] array;
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int[] getArray() {
		return array;
	}
	public void setArray(int[] array) {
		this.array = array;
	}
	public void merge(int arr[],int l,int m,int r)
    {
        int L[]=new int[m-l+1];
        int R[]=new int[r-m];
        for(int i=0;i<L.length;i++){
            L[i]=arr[l+i];
        }
        for(int i=0;i<R.length;i++){
            R[i] = arr[m + 1 + i];
        }
        int i = 0, j = 0, k = l;
        while(i<L.length && j<R.length) {
        	if(L[i] <= R[j])
        		arr[k++] = L[i++];
        	else
        		arr[k++] = R[j++];
        }
        while(i<L.length)
        	arr[k++] = L[i++];
        while(j<R.length)
        	arr[k++] = R[j++];
    }

    public void sort(int arr[], int l, int r)
    {
        if(l<r)
        {
            int m=(l+r)/2;
            sort(arr,l,m);
            sort(arr,m+1,r);
            merge(arr,l,m,r);               
        }
    }
    
    public void mergeSort() {
    	sort(array,0,size-1);
    }

	public MergeSort(int size, int[] array) {
		super();
		this.size = size;
		this.array = array;
	}
	public void display() {
		for(int i = 0; i<size; i++) {
			System.out.print(array[i] + "\t");
		}
	}
}
