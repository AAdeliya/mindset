public class LearnString {
    public static void main(String[] args) {
        String firstText= "Apple";
        StringBuilder secondText = new StringBuilder("Apple");
        System.out.println(firstText.contentEquals(secondText));

        String filename = "  file.txt";
        System.out.println(filename.endsWith(".txt"));
        System.out.println(filename.strip().startsWith("file"));


    }
    
}
