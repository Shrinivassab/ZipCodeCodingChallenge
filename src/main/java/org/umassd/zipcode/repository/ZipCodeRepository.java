/*
 * Contains the REST repository class for the zip code webservice
 * 
 * AUTHOR: ABS
 * Date: 9/12/2016
 * 
 */

package org.umassd.zipcode.repository;

import java.util.ArrayList;
import java.util.Collections;

import org.umassd.zipcode.model.ZipCode;

public class ZipCodeRepository {
	
	private static ArrayList<Integer> zipList = new ArrayList<Integer>();
	private static ZipCode zipCode = new ZipCode();

	/*
	 * Inserts the zipcode into array list based on certain criterion
	 */
	public static String zipInsert(Integer zip){
		
		zipCode.setZipValue(zip);
		
		if(zipList.contains(zipCode.getZipValue())){
			return "Zip code " + zipCode.getZipValue() + " exists already." ;
		}
		else if(zip.toString().length() != 5){
			return "Zip code must contain only 5 characters" ;
		}
		else{
			zipList.add(zipCode.getZipValue());
			return "Zip code " + zipCode.getZipValue() + " inserted." ;
		}		
	}
	
	/*
	 * Checks whether the given zip code exists
	 */
	public static boolean isZipPresent(Integer zip){
		
		zipCode.setZipValue(zip);
		
		if(zipList.contains(zipCode.getZipValue())){
			return true ;
		}
		else{
			return false ;
		}		
	}
	
	/*
	 * Deletes the zipcode if it exists in the list
	 */
	public static String zipDelete(Integer zip){
		
		zipCode.setZipValue(zip);
		
		if(zipList.contains(zipCode.getZipValue())){
			zipList.remove(zipCode.getZipValue());
			return "Zip code " + zipCode.getZipValue() + " deleted." ;
		}
		else{
			return "Zip code " + zipCode.getZipValue() + " not found" ;
		}		
	}
	
	/*
	 * Displays the zip code
	 */
	public static String zipDisplay(){
		
		if(zipList.isEmpty()){
			return "No zip codes present to display";
		}
		else{
			String resultZip = "";
			Collections.sort(zipList);
			Integer start = 0, end = 0;
			while( (end = start) < (zipList.size())){
				while(end + 1 < zipList.size() && zipList.get(end + 1) == zipList.get(end) + 1) 
					end++;	            
				resultZip += (zipList.get(start) + 
	            				 (end == start ? "":("-" + zipList.get(end)))+ 
	            				 (end < zipList.size() - 1 ? ", ":""));
	            start = end + 1;
			}
			return resultZip;
		}
	}
	
 
}
