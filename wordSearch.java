package bestNumberChecker;

import static org.junit.Assert.*;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class WordSearch {

	char wordArray[][] =     {{'A','B','C','O','R','B'},
			                  {'X','Y','Z','A','C','K'},
			                  {'K','B','X','Y','L','A'},
			                  {'C','D','F','E','G','I'}};
	
	private String str="ORACLE";
	HashMap<Character, ArrayList<Integer>> hm = new HashMap<Character, ArrayList<Integer>>();
	ArrayList<Integer> index = new ArrayList<Integer>();
	@Test
	public void test() {
		/*System.out.println(wordArray[0][3]);*/
		int ci=0;
		char start_letter = str.charAt(0);
		for (int i=0;i<wordArray.length;i++){
			for (int j=0;j<wordArray.length;j++){
				if (start_letter==wordArray[i][j]){
					ci++;
					index.add(i);
					index.add(j);
					hm.put(start_letter, index);
					checkOtherPostitions(ci,i,j);
					continue;
				}
			}
		}
		if(ci==str.length()-1){
			System.out.println("Found");
			ArrayList<Character> chars= (ArrayList<Character>) hm.keySet();
			for (Character c : chars){
				System.out.println("Character -> " +c + "Index i,j -> "+hm.get(c));
			}
		}
	}
	public boolean checkOtherPostitions(int ci,int i, int j) {
		
		boolean CL = checkLeft(ci,i,j-1);
		boolean CR = checkRight(ci,i,j+1);
		boolean CU = checkUp(ci,i-1,j);
		boolean CD = checkDown(ci,i+1,j);
		boolean CUL = checkUpLeft(ci,i-1,j-1);
		boolean CUR = checkUpRight(ci,i-1,j+1);
		boolean CDL = checkDownLeft(ci,i+1,j-1);
		boolean CDR = checkDownRight(ci,i+1,j+1);
	
		if ((CL||CR||CU||CD||CUL||CUR||CDL||CDR)==false){
			System.out.println("No combinations");
			return false;
		}
		return true;
		
	}
	private boolean checkLeft(int ci,int i, int j) {
		if (str.charAt(ci)==wordArray[i][j]){
			
			
			index.add(i);
			index.add(j);
			hm.put(str.charAt(ci), index);
			ci++;
			checkOtherPostitions(ci,i,j);
			return true;
		}
		else
			return false;
		
		
		
	}
	private boolean checkRight(int ci,int i, int j) {
		if (str.charAt(ci)==wordArray[i][j]){
			
			
			index.add(i);
			index.add(j);
			hm.put(str.charAt(ci), index);
			ci++;
			checkOtherPostitions(ci,i,j);
			return true;
		}
		else
			return false;
		
		
		
	}
	private boolean checkUp(int ci,int i, int j) {
		if (str.charAt(ci)==wordArray[i][j]){
			
			
			index.add(i);
			index.add(j);
			hm.put(str.charAt(ci), index);
			ci++;
			checkOtherPostitions(ci,i,j);
			return true;
		}
		else
			return false;
		
		
		
	}
	private boolean checkDown(int ci,int i, int j) {
		if (str.charAt(ci)==wordArray[i][j]){
			
			
			index.add(i);
			index.add(j);
			hm.put(str.charAt(ci), index);
			ci++;
			checkOtherPostitions(ci,i,j);
			return true;
		}
		else
			return false;
		
		
		
	}
	private boolean checkUpLeft(int ci,int i, int j) {
		if (str.charAt(ci)==wordArray[i][j]){
			
			
			index.add(i);
			index.add(j);
			hm.put(str.charAt(ci), index);
			ci++;
			checkOtherPostitions(ci,i,j);
			return true;
		}
		else
			return false;
		
		
		
	}
	private boolean checkUpRight(int ci,int i, int j) {
		if (str.charAt(ci)==wordArray[i][j]){
			
			
			index.add(i);
			index.add(j);
			hm.put(str.charAt(ci), index);
			ci++;
			checkOtherPostitions(ci,i,j);
			return true;
		}
		else
			return false;
		
		
		
	}
	private boolean checkDownRight(int ci,int i, int j) {
		if (str.charAt(ci)==wordArray[i][j]){
			
			
			index.add(i);
			index.add(j);
			hm.put(str.charAt(ci), index);
			ci++;
			checkOtherPostitions(ci,i,j);
			return true;
		}
		else
			return false;
		
		
		
	}
	private boolean checkDownLeft(int ci,int i, int j) {
		if (str.charAt(ci)==wordArray[i][j]){
			
			
			index.add(i);
			index.add(j);
			hm.put(str.charAt(ci), index);
			ci++;
			checkOtherPostitions(ci,i,j);
			return true;
		}
		else
			return false;
		
		
		
	}
	

}
