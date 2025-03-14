package Leetcode;


// https://leetcode.com/problems/excel-sheet-column-number/

// Input: columnTitle = "A"
// Output: 1
public class ExcelSheetColumnNumber {

	public static void main(String[] args) {
		String columnTitle="AB";
		int result=0;
		
		for(int i=0;i<columnTitle.length();i++)
		{
			result=(result*26)+(columnTitle.charAt(i)-'A'+1);
		}
		System.out.println(result);
	}

}
