package onboarding;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem6 {
    public static List<String> solution(List<List<String>> forms) {
        List<String> answer = List.of("answer");
        return answer;
    }

    private static Set<String> getTwoLetters(String nickName) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < nickName.length() - 1; i++) {
            set.add(nickName.substring(i, i + 2));
        }
        return set;
    }
}
