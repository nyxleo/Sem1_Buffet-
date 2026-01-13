/*
    Lecture note example - Loops!!
*/

class LectureLoops{
    public static void main(String args[]) {
        int count = 0;
        int pow = 1;
        while(true){
            if(pow >= 100){
                break;
            }
            pow = pow * 5;
            System.out.println(pow);
            count = count + 1; 
            
        }
	}
}
