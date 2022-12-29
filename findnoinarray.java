public class findnoinarray {
    public static void main(String[] args){
        int no[] = {1,10,15,20,34};
        int max = no[0];
        int min = no[0];
        for(int i = 1; i < no.length; i++){
            if(no[i]>max){
                max = no[i];
            }
        }
        for(int i = 1; i< no.length; i++){ 
            if(no[i]<min){ 
                min = no[i];
            }
        }
        System.out.println("Max from array is : " + max);
        System.out.println("Min from array is : " + min);
    }
}
