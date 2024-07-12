public class sum{
    public static void main(String[] args) {
        int a[]={1,0,9,2};
        int x=4;
        for(int i=0; i<a.length-1;i++){
            int sum=a[i]+a[i+1];
            if(sum==x){
                System.out.println("true");
            }
            else{
                System.out.println("fasle");
            }

        }

        
    }
}
