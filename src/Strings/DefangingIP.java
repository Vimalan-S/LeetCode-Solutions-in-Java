package Strings;

public class DefangingIP {
	public static String defangIPaddr(String address) {
        StringBuffer str=new StringBuffer();
        String arr[]=address.split("\\.");
        for(String word: arr){
            System.out.println(word);
        }
        
        for(int i=0;i<arr.length;i++) {
            str.append(arr[i]);
            str.append("[.]");
        } 

        String ansStr = str.toString();  
           
        return ansStr.substring(0, ansStr.length()-3);
    }
	
	public static String efficientDefangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
	
	public static void main(String[] args) {
		//String str = defangIPaddr("1.1.1.1")
		String str = efficientDefangIPaddr("1.1.1.1");
		System.out.println(str);
	}

}
