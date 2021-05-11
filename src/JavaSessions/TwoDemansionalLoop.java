package JavaSessions;

public class TwoDemansionalLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [] rows = {1,2};
//		int [] columns = {5,6};
//		
//		for(int i2=0; i2<rows.length; i2++) {
//			
//			for(int j2=0; j2<columns.length; j2++) {
//				System.out.print(rows[i2]+",");
//				System.out.print( columns[j2]+ "-");
//				
//				}
//			System.out.println("");
//		}
		
		
		//WAP on pattern display:
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<10; j++) {
				System.out.print(i+""+j+ " ");
			}
			System.out.println(" ");
		}
		
		System.out.println("------------array----------------");
		//Put it in an array:
		
		int [] rows =  {0,1,2,3};
		int [] column = {0,1,2,3,4,5,6,7,8,9};
		
		for(int k=0; k<rows.length; k++) {
			for(int j=0; j<column.length; j++) {
				System.out.print(k+""+j+" ");
			}
			System.out.println(" ");
		}
		
		System.out.println("--------Naveen----------------");
		for(int h=0; h<=3; h++) {
			for(int g=0; g<=3; g++) {
				System.out.print(h+""+g+ " ");
			}
			System.out.println(" ");
		}
		
		System.out.println("---------99----------");
         
		for(int h1=0; h1<=9; h1++) {
			for(int g1=0; g1<=9; g1++) {
				System.out.print(h1+""+g1+" ");
			}
			System.out.println();
		}
		
		System.out.println("-----2d array-------------------------");
		
		//2d array- column will always be same
		
		int dd[][] = new int[3][3];//change it to 8,8
		
		for(int h=0; h<dd.length; h++) {
			for(int g=0; g<dd[0].length; g++) {
				System.out.print(h+""+g+" ");
			}
			System.out.println();
		}
		
		System.out.println("--------3 loops------------------");
		for(int h=0; h<=3; h++) {
			for(int j=0; j<=3; j++) {
				for(int u=0; u<=3; u++) {
					System.out.print(h+""+j+""+u+" ");
				}
				System.out.println();
				
			}
		}
	}

}
