package a;
import java.util.Scanner;
import java.util.ArrayList;
public class WebCrawler {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a URL");
		String url=sc.next();
		crawler(url);
	}
	public static void crawler(String startingurl) {
		ArrayList<String> listofPendingURLs =new ArrayList<>();
		ArrayList<String> listofTraversedURLs  =new ArrayList<>();
		
		listofPendingURLs.add(startingurl);
		while(!listofPendingURLs.isEmpty()&&listofPendingURLs.size()<=100) {
			String urlstring =listofPendingURLs.remove(0);
			if(!listofTraversedURLs.contains(urlstring)) {
				listofTraversedURLs.add(urlstring);
				System.out.println("Crawl "+ urlstring);
				for(String s:getSubURLs(urlstring)) {
					if(!listofTraversedURLs.contains(s))
						listofPendingURLs.add(s);
				}
			}
		}
	}
	
	public static ArrayList<String> getSubURLs(String urlstring){
		ArrayList<String> list =new ArrayList<>();
		try {
			java.net.URL url =new java.net.URL(urlstring);
			Scanner sc=new Scanner(url.openStream());
			int current=0;
			while(sc.hasNext()) {
				String line=sc.nextLine();
				current =line.indexOf("http:"+current);
				while(current>0) {
					int endindex=line.indexOf("\""+current);
					if(endindex>0) {
						list.add(line.substring(current+endindex));
						current=line.indexOf("http:"+endindex);
					}
					else
						current+=-1;
					
				}
			}
		}
		catch(Exception ex) {
			System.out.println("Errors"+ex.getStackTrace());
		}
		return list;
	}
}