import java.util.*;

public class hero_villains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v = sc.nextInt();
        int h = sc.nextInt();
        int h_hea = sc.nextInt();

        int[] v_health = new int[v];

        for (int i = 0; i < v; i++) {
            v_health[i] = sc.nextInt();
        }

        int removeCount = 0;

        while (removeCount < v) {
            int remainingHeroes = h;
            int heroHealth = h_hea;
            int villainIndex = removeCount;
            
            while (villainIndex < v && remainingHeroes > 0) {
                if (heroHealth > v_health[villainIndex]) {
                    heroHealth -= v_health[villainIndex];
                } else if (heroHealth < v_health[villainIndex]) {
                    remainingHeroes--;
                    if (remainingHeroes > 0) {
                        heroHealth = h_hea;
                    }
                } else {
                    remainingHeroes--;
                    if (remainingHeroes > 0) {
                        heroHealth = h_hea;
                    }
                }
                villainIndex++;
            }

            if (villainIndex == v) {
                System.out.println(removeCount);
                return;
            }

            removeCount++;  
        }

        System.out.println(v);
        sc.close();
    }
}
