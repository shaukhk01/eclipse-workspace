
class FindK{

    static int[] arr = {-2,11,1,-3,2,8,4};
    public static void main(String[]args) {

        int z = 0;
        int i =0;
        int temp=0;
        int x = 0;
        int[] arrI = new int[8];
        while(x < arr.length ){

            if(arr[x]>0 && arr[x] < arr.length && arr[x] !=x+1){

                temp = arr[i];
                arr[i] = arr[z];
                arr[z] = temp;
               // System.out.print(arr[i]+" "+arr[z]);
                i++;
                z++;
            }
            else{
                z++;
            }
            x++;
        }

        for(int p=0;p<arr.length;p++)
            System.out.print(arr[p]+" ");
    }
}