// koko eating bananas

import java.util.Arrays;

public class KoKo
{
    public static int calculateTotalHours(int [] a ,int i){
        int totalHours=0;
        for(int pile:a){
            totalHours+=(int)Math.ceil((double)pile/i);
        }
        return totalHours;
    }
    public static int minEatingSpeed(int [] a,int h){
        int maxPile = Arrays.stream(a).max().getAsInt();

        // Initialize low and high pointers
        int low = 1, high = maxPile;
        int ans = maxPile;

        // Binary search on answer space
        while (low <= high) {
            int mid = (low + high) / 2;
            int totalH = calculateTotalHours(a, mid);

            // If possible, try smaller speed
            if (totalH <= h) {
                ans = mid;
                high = mid - 1;
            }
            // Otherwise, try larger speed
            else {
                low = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] a={3,6,7,11};
        int h=8;
        System.out.println(minEatingSpeed(a, h));

    }
}