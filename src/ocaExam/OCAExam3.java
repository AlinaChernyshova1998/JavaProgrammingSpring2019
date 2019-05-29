package ocaExam;

public class OCAExam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		   
		   1. What's the result of the following code fragment? 

      String[][] arr= { { "A","B","C" }, { "D", "E" } };
                                i<2
             for(int i=0; i < arr.length; i++) {//i=0;     i=1
                              j<3
                for(int j=0; j<arr[i].length; j++) {//j=0; j=1; j=2
                
                
                    System.out.print( arr[ i ][ j ] ) ;[0][0]==A, [0][1]==B->break; [1][0]==D; [1][1]==E;===> ABDE
                    
                        if(arr[ i ][ j ].equals("B")) {
                               break;//exit loop and switch
                                     }
                                     
                                     
                                  }
                                  
                            }
		 
		 		A. ACDE					     		B. ABC
		 		C. ABDE	correct answer							C. Compile Error
		 		
		 */	
		
		
		
		
		
		/*
		 		2. what is the result? 

              String[][] arr= { {"A","B","C"}, {"D","E"} };
              
                for(int i=0; i<arr.length; i++) { [0][0]==A; [0][1]==B== break(because we print after if statement); [1][0]==D; [1][1]==E
                
                    for(int j=0; j<arr[i].length; j++) {
                    
                         if(arr[i][j].equals("B")) {
                                   break;
                                     }
                                     
                      System.out.print(arr[i][j]);
                           }
               }
                	
             A. ADE		correct answer						B. ABDE      
		 		C. ACDE 							D. Compile Error
		 		
		 */
		
		
		
		
		
		/*
	     3. What's the result of the given code fragment? 

                         int wd=0;
     		String[] days= {"sun","mon","wed","sat"}; length==4
     		                     i<4
               for(int i=0; i<days.length; i++) {
               
                   switch (days[i]) {
                           case "sat": 
                           case "sun": 
                           wd -=1;//i=0=-1;i=1=+1=2(because we don't have a break statement); i=2=2+2=4; i=3=4-1=3
                           break;
                           case "mon": 
                            wd++;
                           case "wed": 
                           wd += 2; 
                                 }              
                                                                       
                            }
                                  
                    System.out.println(wd);
                    
         A. 0 									B. 4
         C. compile error						D. 3     correct answer      
	 
	 */
		
	// switch statment not exist double, long, float, boolean, Double, Long, Float, Boolean
		
		/*
		 
		 4. what's the result of the given code fragment?

               int[] num1=new int[3];//[0,0,0]
               int[] num2= {1,2,3,4,5};
                    num1=num2;
                    //num1= [1,2,3,4,5]
          for(int i=0; i<num1.length; i++) {
                     System.out.print(num1[i]);
                 }
             
          A. 000								B. 12345 correct answer
          C. Compile Error 				D. 123
		 
		 //default value: byte=0; int=0; long=0; short=0; double=0.0; float=0.0; boolean= false; char =''; String =null;
		  * default value of all wrapper classes and string= null;
		  * 
		 
		 */
		
		
		
		
		/*
		 	5. Given the code fragment:

                   int[] arr1 = {1,2,3,4,5};
                        for(  XXX ) {
                      System.out.print(arr1[e]);
                        }

				Which option can replace xxx to enable the code to print 135 ?
				
		 A. int e = 0;  e < 5;  e += 2   true             B. int e = 1;  e <= 5;  e += 1
		 C. int e = 0;  e <= 4;  e++                  D. int e = 1;  e  <  5;  e +=2
		 
		 
		 */
		
		
		
		
		/*
		   6. Which statement is true about the switch statement?

				A. It must contain the default section. true
				
				B. The break statement, at the end of each case block, is mandatory.
				
				C. Its case label literals can be changed at run time.
				
				D. Its expression must evaluate to a single value.
		 
		 
		 */
		
		
		
		
		
		/*
		 7. Given the code fragment: 

                 int x=100;
                 int a=x++;//101
                 int b=++x;//101
                 int c=x++;//101

           int d=(a<b) ? (a < c) ? a : ( b<c )? b : c;
            System.out.println(d);

			what's the result?
			
			A.  Compilation fails     true                   B. 100
			C. 101 										 D. 102
			
		 */
		
		
		
		
		
		/*
		   8. Which method signature do you use at line 1?
		   
		   public static void main(String[] args) {
		   
					int[] numbers= {1, 2, 3, 4, 5};
					int max =findMax(numbers);
					
				}
				
				 		line 1     {
					int max =0;
					return max;
							
				}
				
				A.  static int findMax (int[] numbers)
				B.  public int findMax (int[] numbers)//true
				C.  static int[] findMax (int max)
				D.  static int findMax (int numbers)
		   		
		   
		 */
		
		
		/*
		 	9. What's the result of the following code fragment?
		 				public static void main(String[] args) {
								int num = 10;
								add10(num);
								System.out.println(num);
								
							}
							public static void add10(int num) {
								num=num+10;
										
							}
		 	
			A. 0							B. 10
			C. compile error	true			D. 20

		 
		 */
		
		

		
		

	}
	}


