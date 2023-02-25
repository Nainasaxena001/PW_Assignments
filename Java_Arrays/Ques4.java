package Java_Arrays;

public class Ques4 {
    public static void main(String[] args) {
        int []arr={2,-3,5,8,1,0,-4};
        int ans=0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]<ans){
                ans=arr[i];
            }
        }
        System.out.println(ans);
    }
}
