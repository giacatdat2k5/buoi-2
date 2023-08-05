public class App {
    public static void main(String[] args) throws Exception {
        int t=0;
       for(int i=1;i<=100;i++){
        if ((i % 3 ==0) || (i % 7 ==0)){
            t++;
            }      
       }
       System.out.println("so luong: "+t);      
    }
}

