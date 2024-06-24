import java.util.*;

public class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];
        for(int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        System.out.println();
        TreeSet<Integer> hashSet = new TreeSet<Integer>();

        for (int i = 0; i < num.length; i++) {
            hashSet.add(num[i]);
        }
        int[] ans = new int[hashSet.size()];
        int k = 0;
        for (Integer element : hashSet) {
            ans[k] = element;
            k++;
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
        System.out.println();
        int count = 1;
        int max = 0;

        for (int i = 0; i < ans.length-1; i++) {
            if(ans[i] == ans[i+1]-1){
                count++;
            }else{
                max = Math.max(max, count);
                count = 1;
            }         
        }
        max = Math.max(max, count);
        
        System.out.println(max);

        
    }
}