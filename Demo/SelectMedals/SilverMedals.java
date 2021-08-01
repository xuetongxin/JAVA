package SelectMedals;

public class SilverMedals {
	int count=0;
	String sport=null;
	String playername=null; 
	String country=null;
	
	public SilverMedals(){}
	public SilverMedals(int count,String sport,String playername,String country){
		this.count=count;
		this.playername=playername;
		this.sport=sport;
		this.country=country;
	}
	
	public void setcount(int count){
		this.count=count;
	}
	
	public int getcount(){
		return count;
	}
	public void setsport(String sport) {
		this.sport=sport;
	}
	public String getsport() {
		return sport;
	}
	public void setpalyername(String playername) {
		this.playername=playername;
	}
	public String getplayername() {
		return playername;
	}
	public void setcountry(String country) {
		this.country=country;
	}
	public String getcountry() {
		return country;
	}
	
}
