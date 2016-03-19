/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thirdjava;

/**
 *
 * @author user
 */
public class films {
    private String Name;
    private String Code =" ";
	
    public films (String Name0){
		this.Name = Name0;
		
		for(String word:(Name.split (" "))){
			Code += word.charAt(0);
		}
		
	}

	public void setName(String Name0){
		this.Name = Name0;
	}
	
	public String getName(){
		return Name;
	}
	
	public String getCode(){
		return Code;
	}
	
	
	
public String toString (){
		
		return( this.Name +" \t\t");	
		// to get proper formatting,it would be better to read into fixed width table first and display
	}
}
