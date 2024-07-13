import java.util.*;

// public class main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int num[] = new int[n];
//         for(int i = 0; i < n; i++){
//             num[i] = sc.nextInt();
//         }
//         Arrays.sort(num);
//         for (int i = 0; i < num.length; i++) {
//             System.out.println(num[i]);
//         }
//         System.out.println();
//         TreeSet<Integer> hashSet = new TreeSet<Integer>();

//         for (int i = 0; i < num.length; i++) {
//             hashSet.add(num[i]);
//         }
//         int[] ans = new int[hashSet.size()];
//         int k = 0;
//         for (Integer element : hashSet) {
//             ans[k] = element;
//             k++;
//         }
//         for (int i = 0; i < ans.length; i++) {
//             System.out.println(ans[i]);
//         }
//         System.out.println();
//         int count = 1;
//         int max = 0;

//         for (int i = 0; i < ans.length-1; i++) {
//             if(ans[i] == ans[i+1]-1){
//                 count++;
//             }else{
//                 max = Math.max(max, count);
//                 count = 1;
//             }         
//         }
//         max = Math.max(max, count);
        
//         System.out.println(max);

        
//     }
// }

// public class main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.next();
//         String t = sc.next();
//         int[] arr = new int[27];
//         if(s.length() == t.length()){

//             for(int i = 0; i < s.length(); i++){
//                 arr[s.charAt(i) - 'a']++;
//             }
//             for(int i = 0; i < t.length(); i++){
//                 arr[t.charAt(i) - 'a']--;
//             }
//             int count = 0;
//             for (int i = 0; i < arr.length; i++) {
//                 if(arr[i] != 0){
//                     count++;
//                 }
//             }
//             if(count == 0){
//                 System.out.println("Yes");
//             }else{
//                 System.out.println("No");
//             }
//         }else{
//             System.out.println("NO");
//         }
//     }
// }

// public class main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int target = sc.nextInt();
//         int n = sc.nextInt();
//         int numbers[] = new int[n];

//         int ans[] = new int[2];

//         for (int i = 0; i < numbers.length; i++) {
//             numbers[i] = sc.nextInt();
//         }

//         for (int i = 0; i < numbers.length; i++) {
//             // int curr = numbers[i];
//             for (int j = 0; j < numbers.length; j++) {
//                 if(numbers[j] + numbers[i] == target ){
//                     ans[0] = i;
//                     ans[1] = j;
//                     break;
//                 }
                
//             }
            
//         }
//         for (int i = 0; i < ans.length; i++) {
//             System.out.println(ans[i]);
//         }
//     }
// }

// public class main{

//     public static void main(String[] args) {

//         // Scanner sc = new Scanner(System.in);
//         // int n = sc.nextInt();
//         // for (int i = 0; i < n; i++) {
//         //     int p = sc.nextInt();
//         //     int m = sc.nextInt();
//         //     String a = sc.next();
//         //     String b = sc.next();

//         //     int max = m;
//         //     for (int j = 0; j < p-m+1; j++) {
//         //         int count = 0;
//         //         for (int j2 = 0; j2 < m; j2++) {
//         //             if (a.charAt(j+j2) != b.charAt(j2)) {
//         //                 count++;
//         //             }

                    
//         //         }
//         //         // System.out.println(count);
//         //         if (count < max) {
//         //             max = count;
//         //         }
                
//         //     }
//         //     System.out.println(max);
            
//         // }

//         Scanner scanner = new Scanner(System.in);

//         int T = scanner.nextInt();  // Number of test cases

//         for (int t = 0; t < T; t++) {
//             int N = scanner.nextInt();  
//             int K = scanner.nextInt();  
//             int H = scanner.nextInt();  

//             long count = 0;  

        
//             for (int A = 1; A <= N; A++) {
//                 // Calculate the minimum B that allows the frog to escape
//                 // H <= A * K - B * (K - 1)
//                 // B * (K - 1) <= A * K - H
//                 // B <= (A * K - H) / (K - 1)

//                 if (A >= H) {
//                     count+=N;
//                 }else{
                    
//                     if (A * K >= H) {
//                         int B_max = (A * K - H) / (K - 1);
//                         // B must be within the range [1, N]
//                         System.out.println(B_max);
//                         System.out.println(A);
//                         count += Math.min(N, B_max);
//                     }
//                 }
//             }

//             // Output the result for the current test case
//             System.out.println(count);
//         }
        
        

//     }
// }

// public class main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
//         int k = sc.nextInt();
//         int[] colors = new int[t];
//         for(int i = 0; i < t; i++) {
//             colors[i] = sc.nextInt();
//         }
//         int count = 0;
//         for (int i = 0; i < colors.length; i++) {
//             for (int j = 0; j < k; j++) {
//                 if(colors[] != colors[i-1] && colors[i] != colors[i+1]){
//                     count += 1;
//                 }
//             }
            
//         }
//         System.out.println(count);

//     }
// }

// public class main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
//         for (int i = 0; i < t; i++) {
//             int x = sc.nextInt();
//             int counter = 0;
//             long n = 2;
//             while (counter == 0) {
//                 if(x >= n){
//                     n = n*n;
//                 }else{
//                     counter = 1;
//                     break;
//                 }
//             }
//             System.out.println(x - (n-x));

//         }
//     }
// }

// public class main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         int ex = sc.nextInt();
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         // find the max number in array
//         int max = arr[0];
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//                 }
//         }
//         List<Boolean> result = new ArrayList<Boolean>();
//         for (int i = 0; i < n; i++) {
//             if(arr[i]+ex > max){
//                 result.add(true);
//             }else{
//                 result.add(false);
//             }
//         }
//         return result;


//     }
// }

public class main{

    public static int point = 0;

    public static void max(String s , int x , int y ){
        if(s.length() == 1 || s.length() == 0){
            return;
        }
        if(s.length() == 2 && s.charAt(1) != 'a' && s.charAt(0) != 'b' && s.charAt(1) != 'b'){
            return;
        }
        int counter = 0;
        if(x>y){
            if(counter == 0){

                for(int i = 0 ; i < s.length() -1; i++){
                    if(s.charAt(i) == 'a' && s.charAt(i+1) == 'b'){
                        // s.charAt(i) = '';
                        s = s.substring(0,i) + s.substring(i+2,s.length());
                        max(s, x, y);
                        point += x;
                        counter = 1;
                        break;
                    }
                }
            }
            if(counter == 0){

                for(int i = 0 ; i < s.length() -1 ; i++){
                    if(s.charAt(i) == 'b' && s.charAt(i+1) == 'a'){
                        // s.charAt(i) = '';
                        s = s.substring(0,i) + s.substring(i+2,s.length());
                        max(s, x, y);
                        point += y;
                        counter = 1;
                        break;
                    }
                }
            }
        }else{
            if(counter == 0){
            for(int i = 0 ; i < s.length()-1; i++){
                if(s.charAt(i) == 'b' && s.charAt(i+1) == 'a'){
                    // s.charAt(i) = '';
                    s = s.substring(0,i) + s.substring(i+2,s.length());
                    max(s, x, y);
                    point += y;
                    counter = 1;
                    break;
                }
            }
            }
            if(counter == 0){
            for(int i = 0 ; i < s.length()-1 ; i++){
                if(s.charAt(i) == 'a' && s.charAt(i+1) == 'b'){
                    // s.charAt(i) = '';
                    s = s.substring(0,i) + s.substring(i+2,s.length());
                    max(s, x, y);
                    point += x;
                    counter = 1;
                    break;
                }
            }
        }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int x = sc.nextInt();
        int y = sc.nextInt();
        max(s, x, y );
        int ans =  point;
        point = 0;
        System.out.println(ans);
    }
}