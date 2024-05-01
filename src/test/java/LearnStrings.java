public class LearnStrings {
    public static void main(String[] args) {
        String fruit = "apple";
        String anotherFruit = "apple";
        String vegetable = new String ("broccoli");
        String anotherVegetable= new String("broccoli");
        //new address in memory for another vegetable object 

        System.out.println(fruit == anotherFruit);
        //== equal  true=false
        //= assigned value
        System.out.println(vegetable== anotherVegetable);

        String myText= "adcd";
        System.out.println(myText.toUpperCase());

        String myText2= "ADDD";
        System.out.println(myText2.toLowerCase());
        
        String myTextadel="apple";
        String FirstPartOfText = myTextadel.substring(0,1).toUpperCase();
        String secondPart=myTextadel.substring(1 );
        String myNewText= FirstPartOfText.concat(secondPart);
        System.out.println(myNewText);
        //meaninful name 





    }
    
}
