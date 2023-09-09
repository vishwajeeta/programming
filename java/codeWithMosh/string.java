class sample1{
    public static void main(String [] args){
        String data="hello world !!";
        System.out.println(data);
        //check if strings end with !! mark
        System.out.println(data.endsWith("!!"));
        //check if strings starts with "hello" mark
        System.out.println(data.startsWith("hello"));
        //get length of string or No of char
        System.out.println(data.length());
        //get the index of string
        System.out.println(data.indexOf("o")+"\t"+data.indexOf("world"));
        //replace the string
        System.out.println(data.replace("world","vishwa"));
        //string is not changed
        System.out.println(data);
        //to change the string
        data=data.replace("world","vishwa");
        System.out.println(data);
        System.out.println(data.replace(" ","_"));

        System.out.println(data.toLowerCase()+"\t"+data.toUpperCase());
        //get raid of extra white spases
        data="hello    vishwa  !!";
        System.out.println(data);
        System.out.println(data.trim());
    }
}