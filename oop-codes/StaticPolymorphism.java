
class StaticPolymorphism{
    public static void main(String[] args) {
        
    }
     

    public static void method1(int a, int b){
        System.out.println(a+b);
    }

    //this is overloading
    //signature (int)
    public static void method1(int a){
        System.out.println(a);
    }

    //this overloading but signature in not effected by return type
    //signature ()
    public static int method1(){
        return 0;
    }

    //this overloading but signature in not effected by return type
    //signature (char)
    public static int method1(char a){
        return 0;
    }

    //this overloading but signature in not effected by return type
    //signature (int, char, int)
    public static int method1(int a, char b, int c){
        return a+b;
    }


    //this overloading but signature in not effected by return type
    //signature (char, int, int)
    public static int method1(char a, int b, int c){
        return b+c;
    }
}
