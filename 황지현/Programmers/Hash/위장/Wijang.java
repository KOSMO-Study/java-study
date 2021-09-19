package programmers.hash.HashTest3	;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*
 * 
 */


class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        
        // clothes ������ key������ �ش� ���� ������ value�� map �����
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        for (String[] sub : clothes) {
        	map.put(sub[1], map.getOrDefault(sub[1], 0) + 1);
        }
        
        System.out.println(map);
        
        // map�� value �κи� ����
        Collection<Integer> values = map.values();
        
        // stream�� ���� value�� 1�� ���� �� ���� ���Ѵ�.
        answer = values.stream().mapToInt(s -> s + 1).reduce(1, (a, b) -> a * b);
        
        System.out.println(answer);
        
        // �� ���� ���� ��� 1�� ���� �����Ѵ�.
        return answer - 1;
    }
}




public class Wijang {

	public static void main(String[] args) {
		// [["yellowhat", "headgear"], ["bluesunglasses", "eyewear"], ["green_turban", "headgear"]]	5
		// [["crowmask", "face"], ["bluesunglasses", "face"], ["smoky_makeup", "face"]]	3
		
		String[][] clothes = {{"crowmask", "face"}, {"bluesunglasses", "face"}, {"smoky_makeup", "face"}};
		
		Solution s = new Solution();
		System.out.println(s.solution(clothes));
		

	}

}
