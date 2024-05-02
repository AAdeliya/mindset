public class IndexOf {
    public static void main(String[] args) {
        String phoneNumber="(234) 333-5551";
        String areaCode="";
        String excahnge="";
        String lineNumeber="";

        System.out.println(areaCode);
        System.out.println(excahnge);
        System.out.println(lineNumeber);

    }
    public static String parseAreaCode(String phonenumber){
        int openParens = phonenumber.indexOf("()");
        int closeParens=phonenumber.indexOf(")");
        String areaCode=phonenumber.substring(openParens+1, closeParens);
        return areaCode;
    }
    public static String parseExchange(String phoneNumber){
        int spaceIdx=phoneNumber.indexOf(" ");
        int hyphenIdx=phoneNumber.indexOf("-");
        String exchange = phoneNumber.substring(spaceIdx+1, hyphenIdx);
        return "";
        
    }
    
}
