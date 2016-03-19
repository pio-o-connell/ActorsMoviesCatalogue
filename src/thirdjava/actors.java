/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thirdjava;

import java.util.ArrayList;

/**
 *
 * @author Pio O'Connell
 */
public class actors {
    private String name;
	private String address;
	private int age;
	private ArrayList<films> myFilm = new ArrayList<films>();
	

	
	public actors (String Name0,String address0,int age0 ,ArrayList<films> myFilm0){
		
		this.name = Name0;
		this.address = address0;
		this.age = age0;
		this.myFilm = myFilm0;
	}
	
	public void setName(String Name0){
		this.name = Name0;
	}
	
	public String getName(){
		return name;
	}
	
	public void setAddress(String address0){
		this.address = address0;
	}
	
	public String getAddress(){
		return address;
	}
	
	public void setAge(int age0){
		this.age = age0;
	}
		
		
	public int getAge(){
		return age;
	}
	

	
	public String toString (){
		
		return("\n"+this.name +" , "+this.age+", from "+this.address+"  starred in movies : \n"+this.myFilm+"\n");	
		// to get proper formatting,it would be better to read into fixed width table first and display
	}
	
	
}
