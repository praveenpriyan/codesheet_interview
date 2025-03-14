package Leetcode;

// https://leetcode.com/problems/excel-sheet-column-title/description/

// For example:

// A -> 1 B -> 2 C -> 3 ... Z -> 26 AA -> 27 AB -> 28 ...
 
// Example 1:
// Input: columnNumber = 1
// Output: "A"
public class ExcelSheetColumnTiltle {

	public static void main(String[] args) {
		int columnNumber=28;
		String result="";
		
		while(columnNumber>0) {
			columnNumber--;
			
			result+=(char)(columnNumber%26+'A');
			columnNumber/=26;
		}
		//System.out.println(result);
		
		String ans="";
		for(int i=result.length()-1;i>=0;i--) {
			ans+=result.charAt(i);
		}
		System.out.println(ans);
	}

}
