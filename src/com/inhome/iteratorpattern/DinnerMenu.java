package com.inhome.iteratorpattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DinnerMenu implements Iterable<MenuItem>{
	
	List<MenuItem> list = new ArrayList<MenuItem>();
	
	public void initMenu(){
		for(int index = 0 ;index < 10;index ++){
			MenuItem item = new MenuItem();
			item.setId(index + 1);
			item.setName("DinnerMenu_" + index);
			item.setPrice(index ^ 2);
			list.add(item);
		}
	}
	
	
	@Override
	public Iterator<MenuItem> iterator() {
		// TODO Auto-generated method stub
		return new DinnerMenuIterator();
	}




	public class DinnerMenuIterator implements Iterator<MenuItem>{

		public int position;
		
		@Override
		public boolean hasNext() {
			if(position < list.size()){
				return true;
			}
			return false;
		}

		@Override
		public MenuItem next() {
			MenuItem item = list.get(position ++);
			return item;
		}
		
	}
	
}
