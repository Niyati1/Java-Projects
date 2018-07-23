package ooad_assign3;

import java.util.Arrays;

public class MyArrayList<T> {

	private T[] array;
	private int size;
	
	public MyArrayList(int initialSize){
		if(initialSize < 0){
			throw new IllegalArgumentException("Initial size should be greater than 0");
		}
		
		array = (T[]) new Object[initialSize];
	}
	
	public MyArrayList(){
		this(10);
	}
	
	public int size(){
		return size;
	}
	
	public boolean isEmpty(){
		if(size==0)
			return true;
		else
			return false;
	}
	
	public <E> void add(int index, E element){
		rangeCheckForAdd(index);
		if((size+1) - array.length > 0)
		grow(size+1);
		System.arraycopy(array, index, array, index+1, size-index);
		array[index]=(T) element;
		size++;
	}
	
	public <E> boolean add(E e) {
			if((size+1) - array.length > 0)
			grow(size+1);
			array[size++] = (T) e;
		   return true;
		 }
	
	public <E> E get(int index) {
		rangeCheck(index);
		return elementData(index);
	 }
	
	public <E> E set(int index, E element){
		rangeCheck(index);
		E temp = (E) array[index];
		array[index]=(T) element;
		return temp;
		
	}
	
	
	private <E> E elementData(int index){
		return (E) array[index];
	}
	
	private void rangeCheck(int index){
		
		if(index > this.size())
			throw new  IndexOutOfBoundsException("The index exceeds the size " + outOfBoundsMsg(index) );
	}
	
	private String outOfBoundsMsg(int index){
		String s = "Index: " + index + " Size: " + size;
		return s;
	}

	 
	
	public void grow(int minCap){
		int oldLength = array.length;
		int newLength;
		if(minCap > oldLength)
        	newLength = (int) ((1.5 * oldLength)+ 1);
        else
        	newLength = oldLength+1;
        array = Arrays.copyOf(array, newLength);
   }
	

	private void rangeCheckForAdd(int index){
		if(index > this.size() || index < 0)
			throw new  IndexOutOfBoundsException(outOfBoundsMsg(index) );
	}
	
	public <E> E remove(int index) {
		  E oldValue = (E)array[index];

		        int removeNumber = size - index - 1;
		        if (removeNumber > 0){
		            System.arraycopy(array, index+1, array, index,removeNumber);
		        }
		        array[--size] = null; 
		        return oldValue;
		 }
	
	public int getlength() {
		// TODO Auto-generated method stub
		return array.length;
	}

}
