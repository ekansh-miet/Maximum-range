import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            int tmp = sc.nextInt();
            mp.put(Math.abs(tmp), mp.getOrDefault(Math.abs(tmp), 0) + 1);
        }
         int cnt = 0;
        for (Map.Entry<Integer, Integer> it : mp.entrySet()) {
            if (it.getKey() == 0)
                cnt += 1;
            else
                cnt += Math.min(2, it.getValue());
        }

        System.out.println(cnt);
    }
}