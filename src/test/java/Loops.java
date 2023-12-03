public class Loops {
    public static void main(String args[]) {
       for (int x=0; x <=5; x++){
            System.out.println(x);
            //For loop in Java iterates a given set of statements multiple times.
            //Use it when you know the exact number of times to execute the part of the program.
           // for (int age=0;age<=18; age++ ){
              //  System.out.println(age);

                for (int i = 0; i < 3; i++) {
                    System.out.println(i);

                    //int i = 0;
                    //i < 3 // 0 < 3 = true
                    //      // Inside of loop
                    //i++ // i is now 1
                    //i < 3 // 1 < 3 = true
                    //      // Inside of loop
                    //i++ // i is now 2
                    //i < 3 // 2 < 3 = true
                    //      // Inside of loop
                    //i++ // i is now 3
                    //i < 3 // 3 < 3 = false
                    //      // Loop is done...
                    int a;
                    for(a=0; a<5; a++) {
                        if (a > 2) {
                            break;
                            //These two keywords help us control the loop from within it. break will cause the loop
                            // to stop and will go immediately to the next statement after the loop:
                        }
                        System.out.println("Break");
                    }
                    System.out.println(a);
                    int s;
                    for(s=0; s<5; s++){
                        if(s>=3){
                            break;

                        }
                        System.out.println("Adel");
                        if(s>=1){
                            continue;
                        }
                        System.out.println("Continue");

                    }
                    System.out.println(s);


                    }


        }


        }

    }

