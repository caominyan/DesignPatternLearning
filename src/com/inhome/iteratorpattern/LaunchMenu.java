package com.inhome.iteratorpattern;

import java.util.Iterator;

public class LaunchMenu implements Iterable<MenuItem>{
	
	MenuItem[] menus = new MenuItem[10];
	
	public void initMenu(){
		for(int index = 0 ;index < 10;index ++){
			MenuItem item = new MenuItem();
			item.setId(index + 1);
			item.setName("LaunchMenu_" + index);
			item.setPrice(index ^ 2);
			menus[index] = item;
		}
	}
	
	
	@Override
	public Iterator<MenuItem> iterator() {
		// TODO Auto-generated method stub
		return new LaunchMenuIterator();
	}




	public class LaunchMenuIterator implements Iterator<MenuItem>{

		public int position;
		
		@Override
		public boolean hasNext() {
			if(position < menus.length){
				return true;
			}
			return false;
		}

		@Override
		public MenuItem next() {
			MenuItem item = menus[position++];
			return item;
		}
		
	}
	

}
