import question.*;

public class Main {
    public static void test1() {
        Solution1 s = new Solution1();
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
        System.out.println(s.solution("CBD", skill_trees));
    }

    public static void test2() {
        Solution2 s = new Solution2();
        System.out.println(s.solution("LULLLLLLU"));
    }

    public static void test3() {
        Solution3 s = new Solution3();
        int[] cookie = {1, 1, 2, 3};
        System.out.println(s.solution(cookie));
    }

    public static void main(String[] args) {
        // test1();
        // test2();
        test3();
    }
}
