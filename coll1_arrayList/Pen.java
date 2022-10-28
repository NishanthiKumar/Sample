package coll1_arrayList;

import java.util.ArrayList;

public class Pen {
	public static void main(String[] args) {
		ArrayList<String> penBrand=new ArrayList<>();
		penBrand.add("Natraj");
		penBrand.add("Absara");
		penBrand.add("Doms");
		penBrand.add("Roritoo");
		penBrand.add("Prox");
		penBrand.set(1, "AbsaraBlack");
		penBrand.remove(4);
		
		
		/*for(int i=0;i<penBrand.size();i++) {
			System.out.println(penBrand.get(i).charAt(penBrand.get(i).length()-1));
		}*/
		
		
		String value="";
		for(int i=0;i<penBrand.size();i++) {
			value=value+penBrand.get(i);
		}
		System.out.println(value);
		
		
		/*int max=0;String val="";
		for(String pen:penBrand) {
			if(pen.length()>max) {
				max=pen.length();
				val=pen;
			}
		}
		System.out.println(val);*/
		
		//penBrand.forEach(x -> System.out.println(x));
		
	}

}
