package étude_mooc_1_ver16;                                                                                                                            
import java.util.Scanner;                                                                                                                              
import java.util.ArrayList;                    
                                                                                                                                                       
public class projet_perso_semaine_6 {               
	                                                                                                                                                   
	private static Scanner keyb = new Scanner(System.in);                                                          
	                                                                                                                                                   
	public static void main(String[] args) {                                                                
		                                                                                                                                               
		int n=0;                
		                                                                                                                                               
		do{                                                                                                                                            
			System.out.println("combien de joueurs y a-t-il ?");                                                                                       
			n = keyb.nextInt();                                                                                                                        
		}while(n<0||n==0);                                                                                                                             
		                                                                                                                                               
		int[] scorejoueur = new int[n];                                                                                                                
		                                                                                                                                               
		System.out.println("calculs des scores d'une partie\n");                                                                                       
		                                                                                                                                               
		for(int j =0; j<n;j++) {                                                                                                                       
			                                                                                                                                           
			System.out.println("saisi des données du joueur : " + (j+1));                                                                              
			                                                                                                                                           
			scorejoueur [j] = SaisieEtCalcul() ;                                                                                                       
		}                                                                                                                                              
			                                                                                                                                           
			                                                                                                                                           
		trierScore(scorejoueur);                                                                                                                       
		                                                                                                                                               
		                                                                                                                                               
keyb.close();                                                                                                                                          
}//fin public static                                                                                                                                   
// toutes les méthodes commencent ici:                                                                                                                 
	                                                                                                                                                   
	//1er methode                                                                                                                                      
	                                                                                                                                                   
	static int SaisieEtCalcul() {                                                                                                                      
		                                                                                                                                               
		                                                                                                                                               
		double npoints = 0,tpsjeu = 0;                                                                                                                 
		                                                                                                                                               
		                                                                                                                                               
		do {                                                                                                                                           
			System.out.println("\nentrez le nombre de points (0 à 100) : ");                                                                           
			npoints = keyb.nextDouble();                                                                                                               
			                                                                                                                                           
		}while( (npoints<0.0)||(npoints>100.0));                                                                                                       
		                                                                                                                                               
		do {                                                                                                                                           
			System.out.println("entrez le temps de jeu (1 à 60) : ");                                                                                  
			tpsjeu = keyb.nextDouble();                                                                                                                
			                                                                                                                                           
		}while( (tpsjeu<1.0)||(tpsjeu>60.0));                                                                                                          
		                                                                                                                                               
		return scorejoueur(npoints,tpsjeu);                                                                                                            
		                                                                                                                                               
	}                                                                                                                                                  
	                                                                                                                                                   
	                                                                                                                                                   
	//2eme methode                                                                                                                                     
	                                                                                                                                                   
	static int scorejoueur(double npoints, double tpsjeu) {                                                                                            
		int lescore = 0;                                                                                                                               
		                                                                                                                                               
		lescore = (int) (1000*npoints/tpsjeu);                                                                                                         
				return lescore;                                                                                                                        
	}                                                                                                                                                  
	                                                                                                                                                   
	                                                                                                                                                   
	//3eme methode                                                                                                                                     
                                                                                                                                                   
	static void afficheresult(int[] x) {                                                                                                               
		                                                                                                                                               
		ArrayList <Integer> list3 = new ArrayList<Integer>();                                                                                          
		                                                                                                                                               
		for(int a= 0; a<x.length;a++) {	list.add(x[a]);	}                                                                                              
		                                                                                                                                               
		ArrayList <Integer> list4 = new ArrayList<Integer>();                                                                                          
		                                                                                                                                                
		                                                                                                                                               
	}                                                                                                                                
	                                                                                                                                                   
	           //3eme methode                                                                                        
		                                                                                                                                               
		static ArrayList<Integer> trierScore(int[] array) {
			
	        ArrayList<Integer> tempList = new ArrayList<>(array.length);
	        
	        ArrayList<Integer> orderedList = new ArrayList<>();
	        int min = 0;
	        
	        for(int i = 0;i<array.length;++i){
	            tempList.add(array[i]);
	        }
	        while(!tempList.isEmpty()){
	            for(int j = 0;j<tempList.size();++j){
	                int index = tempList.get(j);
	                if(index <= tempList.get(j)){
	                    min = index;
	                }
	            }
	            orderedList.add(min);
	            tempList.remove(tempList.get(min));
	        }
	        return orderedList;
	    }                                                                                                                                           
	                                                                                                                                             
                                                                                                                                                            
	                                                                                                                                                   
}//fin public classe                                                                                                                                   
                                                                                                                                                       