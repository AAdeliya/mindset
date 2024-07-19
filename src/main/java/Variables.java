public class Variables {

    //All primitives in Java:
    //
    //byte (number, 1 byte)
    //short (number, 2 bytes)
    //int (number, 4 bytes)
    //long (number, 8 bytes)
    //float (float number, 4 bytes)
    //double (float number, 8 bytes)
    //char (a character, 2 bytes)
    //boolean (true or false, 1 byte)

    //// Create a string with a constructor
    //String s1 = new String("Who let the dogs out?");        // String object stored in heap memory
    //// Just using "" creates a string, so no need to write it the previous way.
    //String s2 = "Who who who who!";                         // String literal stored in String pool
    //// Java defined the operator + on strings to concatenate:
    //String s3 = s1 + s2;

            public static void main(String[] args) {
                byte zero = 0;
                short a = 3;
                int b = 1;
                char d = ' ';
                float e = 2.0f;
                boolean f = true;
                String output = "H" + a + b + b + zero + d + "w" + zero + "r" + b + "d" + d + e + d + f;
                System.out.println(output);
            }
        }

