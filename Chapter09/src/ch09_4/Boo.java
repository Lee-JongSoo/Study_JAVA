package ch09_4;

class Boo {
    public Boo(int i){}
    public Boo(String a){}
    public Boo(String a, int i){}
}

class SonOfBoo extends Boo{
    public SonOfBoo(){
        super("boo");
    }
    public SonOfBoo(int i){
        super("Fred");
    }
    public SonOfBoo(String a){
        super(42);
    }
    //public SonOfBoo(int i, String a){
    //}
    //public SonOfBoo(String a, String b, String c){
    //    super(a,b);
    //}
    public SonOfBoo(int i, int j){
        super("man", j);
    }
    //public SonOfBoo(int i, int x, int y){
     //   super(i, "star");
    //}
}
