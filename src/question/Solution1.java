package question;

import java.util.HashSet;

/**
 * Created by jihun on 2018. 10. 27..
 */
public class Solution1 {
    public int solution(String skill, String[] skill_trees) {
        int skill_idx;
        int count = 0;
        boolean correct;
        HashSet<Character> set = new HashSet<>();

        for (Character c : skill.toCharArray())
            set.add(c);

        for (String skill_tree : skill_trees) {
            skill_idx = -1;
            correct = true;
            for (Character c : skill_tree.toCharArray()) {
                if (set.contains(c)) {
                    if (skill_idx + 1 == skill.indexOf(c)) {
                        skill_idx = skill.indexOf(c);
                    }
                    else {
                        correct = false;
                        break;
                    }
                }
            }
            if (correct) count++;
        }

        return count;
    }
}
