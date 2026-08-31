class Second{

    public static void main(String args[]){

        int arr[]= new int[]{1,4,5,4,3,7,7,8,6,1,7};

        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for(int num : arr){
            if(num>largest){
                second_largest = largest;
                largest = num;
            }
            else if(num>second_largest){
                second_largest = num;
            }
        }
        System.out.println(largest +" "+ second_largest);
    }
}