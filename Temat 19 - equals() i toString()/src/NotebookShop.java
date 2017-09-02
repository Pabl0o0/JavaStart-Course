
public class NotebookShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataStore dataStore = new DataStore();
		dataStore.add(new Computer("msi",123));
		dataStore.add(new Computer("msi",123));
		dataStore.add(new Computer("msi",123));
		dataStore.add(new Computer("asus",12));
		dataStore.add(new Computer("asus",12));
		dataStore.add(new Computer("hp",1));
		dataStore.add(new Computer("hp",0));
		
/*		Computer comp1 = new Computer("msi",123);
		
		dataStore.checkAvalability(comp1);
		System.out.println(dataStore.checkAvalability(comp1));
		*/
		
		 Computer compToFind = new Computer("msi",123);
	        int computersFound = dataStore.checkAvalability(compToFind);
	        System.out.println("Liczba komputerów " + compToFind + ": " + computersFound);
	        
	     System.out.println("Wszystkie dostêpne komputery: ");
	     for(Computer c : dataStore.getComputers()){
	    	 System.out.println(c);
	     }
	}

}
