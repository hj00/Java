package basic.exam;

// 조건연산
public class ConditionTest {
	public static void main(String[] args) {
		
		int n1 = 2;
		System.out.println(n1 == 1 ? "남자" : "여자");
		
	    int n2 = 7;
	    System.out.println(n2 == 1 ? "남자" : 
	                       n2 == 2 ? "여자" :
	                    	         "에러");  		
       
       int n3 = 4;
       System.out.println(n3 == 1||n3 == 3 ? "남자" : 
    	                  n3 == 2||n3 == 4 ? "여자" :
    	                	                 "에러");  
        
	}

}
