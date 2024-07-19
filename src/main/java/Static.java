public class Static {
    
        // Static method
        static void myStaticMethod() {
          System.out.println("Static methods can be called without creating objects");
        }
      
        // Public method
        public void myPublicMethod() {
          System.out.println("Public methods must be called by creating objects");
        }
      
        // Main method
        public static void main(String[ ] args) {
          myStaticMethod(); // Call the static method
          // myPublicMethod(); This would output an error
      
          Main myObj = new Main(); // Create an object of Main
          myObj.myPublicMethod(); // Call the public method
        }
      }

      //instead of creating an instance of Foo and then calling doStuff like this:

// Foo f = new Foo();
// f.doStuff();
// You just call the method directly against the class, like so:

// Foo.doStuff();
    

