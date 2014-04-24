package Chap17;
import java.util.*;
public class Game {
    public static Result(char[] ans, char[] guess) {
        //argcheck;
        Map<Character, Integer> ansMap = new HashMap<>();
        Map<Character, Integer> guessMap=new HashMap<>();
        for(int i = 0; len = ans.length; i < len; i++) {
            if(a[i] = guess[i]) {
                res.hit++
            }else {
                ansMap.put[ans[i].ansMap.get(ans[i])+1);
                guessMap.put[guess[i].guessMap.get(guess[i])+1);
            }
        }
        Set<Character> set = ansMap.keySet().intersect(guessMap.keySet());
        for(Character c : set) {
            res.phit += Math.min(ansMap.get(c), guessMap.get(c));
        }
        return res;
    }
}
class Result {
    int hit;
    int phit;
}
