public class LongestPalindromicSubstring {



        public static void main(String[] args) {
            String text="adeliyaadeliyaaaadddada";
            System.out.println(longestPalindronomicSub(text));
        }
        public static String longestPalindronomicSub(String text) {
            if (text == null || text.length() < 1) return "";
    
    
    
            int start = 0; int end = 0;
            for (int i = 0; i < text.length(); i++) {
    
    
                int len1= expandAroundCenter(text, i, i);
                        int len2 = expandAroundCenter(text, i, i+1);
                                int len= Math.max(len1, len2);
                                if(len>end-start){
                                    start=i-(len-1)/2;
                                            end= i+len/2;
                                }
    
            }
            return text.substring(start, end+1);
    
    
        }
            private static int expandAroundCenter(String text, int left, int right){
             while(left >=0 && right<text.length() &&text.charAt(left)==text.charAt(right)){
                 right ++;
                 left--;
    
    
    
            }
             return right - left - 1; //return the length of palindronome
    
        }
    
    }
    