interface Animal2 {
    public void animalSound(); //interface method

    public void run();

}
class Pig2 implements  Animal2{
    public void animalSound(){
        System.out.println("THe pig says : wee wee");
    }

    @Override
    public void run() {

    }

}
