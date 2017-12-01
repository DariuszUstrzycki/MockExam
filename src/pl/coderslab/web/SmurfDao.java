package pl.coderslab.web;

import java.util.ArrayList;
import java.util.List;


public class SmurfDao {
	
	public static List<Smurf> getList(){
		
		List<Smurf> list = new ArrayList<>();
		list.add(new Smurf("Ola", "abc@", "aaa"));
		list.add(new Smurf("Ula", "def@", "bbb"));
		list.add(new Smurf("Mike", "frd@", "ccc"));
		list.add(new Smurf("Nico", "scd@", "ddd"));
		list.add(new Smurf("Lico", "asd@", "eee"));
		
		return list;
	}

}
