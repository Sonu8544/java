public class NumaricParamid {
    public static void main(String[] args){
        int n = 5;
        for(int i=1; i<n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i*2; k++){
                if (k%2 == 0) {
                    System.out.print(i+" ");
                    System.out.print(" ");
                } 
            }
            System.out.println();
        }
    }
}
