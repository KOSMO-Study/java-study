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
        
        // clothes 종류를 key값으로 해당 종류 개수를 value로 map 만들기
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        for (String[] sub : clothes) {
        	map.put(sub[1], map.getOrDefault(sub[1], 0) + 1);
        }
        
        System.out.println(map);
        
        // map의 value 부분만 모음
        Collection<Integer> values = map.values();
        
        // stream을 통해 value를 1씩 더한 후 각각 곱한다.
        answer = values.stream().mapToInt(s -> s + 1).reduce(1, (a, b) -> a * b);
        
        System.out.println(answer);
        
        // 다 입지 않은 경우 1을 빼서 리턴한다.
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
