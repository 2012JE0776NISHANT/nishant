package com.sapient.client;

import com.sapient.bean.Camera;
import com.sapient.bean.Comp;
import com.sapient.bean.Product;

public class Productclient {

	public static void main(String[] args) {
		
		Product[] arr = new Product[4];
		arr[0]= new Comp(1001,"acer",50000,"intel 5");
		arr[1]= new Comp(1002,"hp",30000,"intel i7");
		arr[2]= new Camera(1003,"nikon",6000,"14mpx");
		arr[3]= new Camera(1004,"nikon7",20000,"30mpx");
		
for(Product p: arr){
	
	System.out.println(p.display()+ "   " +p.isExpensive());

	}

	}
}
