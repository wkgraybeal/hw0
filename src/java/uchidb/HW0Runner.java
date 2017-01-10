package uchidb;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

/**
 * @author aelmore
 */
public class HW0Runner implements Containers<Integer, String> {

	/* Code to implement singleton class; (i.e. only one instance allowed) */
	private static HW0Runner singleton = new HW0Runner();
	private HW0Runner() { }
	
	// This class is a factory for a singleton containers class.
	// https://www.tutorialspoint.com/java/java_using_singleton.htm
	public static Containers<Integer, String> getContainers() {
		// TODO fix this function
		return singleton;
	}
	
	/* Local variable used in various methods */
	public static Map<String, Integer> map;

	public Set<Integer> initSet(Integer[] tArray) {
		Set<Integer> set = new HashSet<Integer>(Arrays.asList(tArray));
		return set;
	}

	//Create a list that stores an the array of T objects
	public List<Integer> initList(Integer[] tArray) {
		List<Integer> list = Arrays.asList(tArray);
		return list;
	}

	//Create an empty map that will use type S as keys, and T as values
	public Map<String, Integer> initEmptyMap() {
		return new HashMap<String, Integer>();
	}

	//Store the map in a local field variable -- often called a setter 
	public void storeMap(Map<String,Integer> mapToStoreInClass) {
		map = mapToStoreInClass;
	}

	//add a key value to store map with a boolean indicating whether to overwrite existing value
	public boolean addToMap(String key, Integer value, boolean overwriteExistingKey) {
		if (overwriteExistingKey){
			map.put(key, value);
			return true;
		} else {
			if (map.containsKey(key)) {
				return false;
			} else {
				map.put(key, value);
				return true;
			}
		}
	}		

	//get a value based on a key
	public Integer getValueFromMap(String key) {
		return map.get(key);
	}

	//an overloaded function to get value from map but with a default value
	//if the key is not present
	public Integer getValueFromMap(String key, Integer defaultValue) {
		if (map.containsKey(key))
			return map.get(key);
		else 
			return defaultValue;
	}

	public static void main(String[] args){

	}
}
