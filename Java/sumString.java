//String fun(String a, String b) a and b numbers, the ith numbers of a and b are added in turn, returning a new String

public static String sumOfString(String a, String b){
    StringBuilder sb = new StringBuilder();
    int length = a.length() < b.length() ? a.length() : b.length();
    
    for(int i = 0; i < length; i++){
        int num1 = Integer.parseInt(String.valueOf(a.charAt(i)));
        int num2 = Integer.parseInt(String.valueOf(b.charAt(i)));
        sb.append(num1+num2);
    }

    return sb.toString();
}