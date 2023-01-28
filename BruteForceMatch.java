


public class BruteForceMatch{

    public static void main(String[] args) {
        
        String Tstring1n="akfkdfdsfsfsdfhsdfhsdfhdsfhdshfdsfhskhfsdfjksd";
        String Pstring2m="dsfh";
        
        int position = BruteForceStringMatch(Tstring1n, Pstring2m);
        System.out.println("Found at position:" + (position+1));
	
    }
    
    public static int BruteForceStringMatch(String Tstring1n, String Pstring2m){
        
        int str1n = Tstring1n.length();
        int str2m = Pstring2m.length();
        int i;
    
        for( i = 0; i<=str1n - str2m ;++i){
            int j = 0;
                while((j<str2m) && (Pstring2m.charAt(j) == Tstring1n.charAt(i + j))){
                     j = j+1;           
            }
                
                if(j == str2m){
                    return i;
                }
                
        }  
        return -1;
    }
    
}
