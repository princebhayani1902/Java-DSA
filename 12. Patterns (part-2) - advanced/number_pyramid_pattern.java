public class number_pyramid_pattern {
    public static void main(String[] args) {
        int lines = 5 ;
        int start = 1;
        for(int i =0;i<lines;i++){
            for(int j =lines-1;j>i;j--){
                System.out.print(" ");
            }
            for(int j =0;j<=i;j++){
                System.out.print(start+" ");
            }
            start++;
            System.out.println();
        }
    }
}
