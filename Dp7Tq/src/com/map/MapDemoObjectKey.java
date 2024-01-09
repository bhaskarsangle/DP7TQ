package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

class Apple{
    	int price;
    	String type;
		public Apple() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Apple(int price, String type) {
			super();
			this.price = price;
			this.type = type;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		@Override
		public String toString() {
			return "Apple [price=" + price + ", type=" + type + "]";
		}
		@Override
		public int hashCode() {
 
			
			
			return super.hashCode();
		}
		@Override
		public boolean equals(Object obj) {
 
			
			
			return super.equals(obj);
		}
    	
    		
    }

public class MapDemoObjectKey {

	public static void main(String[] args) {
 
		HashMap<Apple,Integer> map=new HashMap<Apple,Integer>();
		map.put(new Apple(150, "green Apple"), 150);
		map.put(new Apple(170, "simla Apple"), 250);
		map.put(new Apple(15, "kashmir Apple"), 350);

		Set<Entry<Apple,Integer>> set=map.entrySet();
		Iterator<Entry<Apple, Integer>> itr=set.iterator();
		
		while (itr.hasNext()) {
			 Entry<Apple,Integer> e=itr.next();
			 System.out.println("key :"+e.getKey());
			 System.out.println("value :"+e.getValue());
 			 System.out.println(e.getClass());

		}
		
		
		
		
	}

}
