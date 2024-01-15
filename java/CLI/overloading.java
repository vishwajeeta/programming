class vishwa{
    void data(){
        System.out.println("hello");
    }
    void data(int x){
        System.out.println("hello1");
    }
    void data(int x,int y){
        System.out.println("hello2");
    }
    void data(int x,int y,int z){
        System.out.println("hello3");
    }
    public static void main(String []args){
        System.out.println("Hello Vishwa!\n");
        vishwa a=new vishwa();
        a.data();
        a.data(1,1);
        a.data(1);
        a.data(1,1,1);
    }
}