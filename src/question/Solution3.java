package question;

import java.util.HashMap;

/**
 * Created by jihun on 2018. 10. 27..
 */
public class Solution3 {
    int[][] array = new int[2000][2000];

    public int solution(int[] cookie) {
        int max = 0;

        for (int k = 1; k < cookie.length; k++) {
            for (int i = 0; i < cookie.length - k; i++) {
                int sum = 0;
                if (array[i][i+k-1] != 0) sum = array[i][i+k-1];
                else {
                    for (int j = 0; j < k; j++)
                        sum += cookie[i + j];
                    array[i][i+k-1] = sum;
                }

                int[] rest_cookie = new int[cookie.length - (i + k)];
                System.arraycopy(cookie, cookie.length - rest_cookie.length, rest_cookie, 0, rest_cookie.length);
                if (isContain(rest_cookie, sum, cookie.length - rest_cookie.length)) {
                    max = Math.max(sum, max);
                }
            }
        }

        return max;
    }

    boolean isContain(int[] arr, int count, int idx) {
        for (int k = 1; k <= arr.length; k++) {
            for (int i = 0; i <= arr.length - k; i++) {
                int sum = 0;
                if (array[i + idx][i+k-1 + idx] != 0) sum = array[i][i+k-1];
                else {
                    for (int j = 0; j < k; j++)
                        sum += arr[i + j];
                    array[i + idx][i+k-1 + idx] = sum;
                }
                if (sum == count) return true;
            }
        }

        return false;
    }
}

