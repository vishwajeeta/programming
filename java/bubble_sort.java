class Vishwa{
    public static void main(String []args){
        System.out.println("hello world!");
        int omg []= {6,7,4,3,2,8,6,7,4};
        
        for(int i=0;i<omg.length;i++)
        {
            
            for(int j=1;i<omg.length-1;j++)
            {
            if(omg[j]>omg[i+1])
            {
                int temp=omg[j];
                omg[j]=omg[i+1];
                omg[i+1]=temp;
            }
            }
        }
        for(int i=0;i<omg.length;i++)
        {
            System.out.println(omg[i]);
        }
    }
}