package question;

import java.util.HashSet;

/**
 * Created by jihun on 2018. 10. 27..
 */

public class Solution2 {
    public int solution(String dirs) {
        int x = 0;
        int y = 0;
        int nX = 0;
        int nY = 0;
        HashSet<String> set = new HashSet<>();

        for (Character c : dirs.toCharArray()) {
            switch (c) {
                case 'U':
                    nY = y + 1;
                    break;
                case 'D':
                    nY = y - 1;
                    break;
                case 'R':
                    nX = x + 1;
                    break;
                case 'L':
                    nX = x - 1;
                    break;
            }

            if (nX > 5 || nX < -5 || nY > 5 || nY < -5) {
                nX = x;
                nY = y;
                continue;
            }

            String position = "";

            position += x > nX ? "" + x + nX : "" + nX + x;
            position += y > nY ? "" + y + nY : "" + nY + y;

            set.add(position);

            x = nX;
            y = nY;
        }

        return set.size();
    }
}
