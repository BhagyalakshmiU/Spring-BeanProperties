package mySimpleSpringAppp;

import java.util.List;
import java.util.Map;


public class Vegetable
{
	private List<String> vegetableNameList;
	private Map<String,String> vegetableNameMap ;
	
	public Vegetable() {}
	
	public List<String> getVegetableNameList() {
		return vegetableNameList;
	}


	public void setVegetableNameList(List<String> vegetableNameList) {
		this.vegetableNameList = vegetableNameList;
	}


	public Map<String, String> getVegetableNameMap() {
		return vegetableNameMap;
	}


	public void setVegetableNameMap(Map<String, String> vegetableNameMap) {
		this.vegetableNameMap = vegetableNameMap;
	}


	
	
	
	public String talkAboutYourself()
	{
		
		String speech= "Hi I  am a vegetable.I am a plant that is eaten as food...";
		if(vegetableNameList!=null && vegetableNameList.size()>0)
		{
			speech+="\nList: ";
		for(int i=0;i<vegetableNameList.size();i++)
		{
			speech+=".name: "+vegetableNameList.get(i);
		}}
		if(vegetableNameMap!=null && vegetableNameMap.size()>0) {
			speech=speech+"\nMap: ";
		for(Map.Entry<String,String>vegetableName:vegetableNameMap.entrySet())
		{
			speech+=vegetableName.getKey()+" ==> "+vegetableName.getValue()+" :: ";
		}}
		return speech;
	}


}
