import java.util.*;

public class Q61{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c, 0)+1);
        }

        for(char key: map.keySet()){
            sb.append(key);
            sb.append(map.get(key));
        }

        System.out.println(sb.toString());

    }
}

/*
61. CAPGEMINI 2023
You're supposed to reduce the size of this string using mathematical logic given
as in the example below:
Sample Input-I: aabbbbeeeeffggg
Sample Output -1: a2b4e4f2g3
Sample Input -2: abbccccc
ab2c5
Sample Output- 2:
 */