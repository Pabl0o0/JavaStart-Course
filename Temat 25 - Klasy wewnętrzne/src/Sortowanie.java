
public class Sortowanie {

	public static void main(String[] args){
		Sortable st = new Sortable() {

			
			@Override
			public int[] sort(int[] tab) {
				// TODO Auto-generated method stub
				 int a;
					for(int i = 0; i<tab.length; i++){
						System.out.println("*");
						for (int j=1; j<tab.length-i;j++){
							System.out.println(tab[j-1] + ">" + tab[j] + " " + (tab[j-1] > tab[j]));
						
						if (tab[j-1]>tab[j]){
							a = tab[j];
							tab[j]= tab[j-1];
							tab[j-1] = a;
						}
					    }
			       }
				
				return tab;
			}		
		};
		int[] tab2 = {2,5,1,10,15,14,12,9,0};
		st.sort(tab2);
		 for (int i = 0; i < tab2.length; i++) {
	            System.out.print(tab2[i] + "  ");
	        }
	}
}
