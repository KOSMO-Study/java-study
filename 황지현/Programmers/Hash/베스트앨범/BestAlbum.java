package programmers.hash.HashTest4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * 
 */


class Solution {
	
	// map�� �޾Ƽ� value���� ������������ ��Ī�ϴ� key���� List�� �����ϴ� �Լ�
	List<Integer> sortValues(Map<Integer, Integer> m) {
		List<Integer> result = new ArrayList<Integer>();
		
		m.entrySet().stream()
	    	.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
	    	.limit(2)
	    	.forEach(e -> result.add(e.getKey()));
		    	
		System.out.println("===>  " + result);
		
		return result;
	}
	
	
    public int[] solution(String[] genres, int[] plays) {
    	int[] answer = {};
        
    	// key: ���� �帣, value: [���ǹ�ȣ-�÷���Ƚ��] 
    	Map<String, Map<Integer, Integer>> map = new HashMap<String, Map<Integer,Integer>>();
    	// �帣�� �� �÷��� Ƚ��
    	Map<String, Integer> totPlays = new HashMap<String, Integer>();
    	
    	// {�帣1={���ǹ�ȣ=�÷���Ƚ��, ...}, �帣2={���ǹ�ȣ=�÷���Ƚ��, ...}}
    	for (int i = 0; i < genres.length; i++) {
    		// �帣�� �� �÷��� Ƚ�� ����
    		totPlays.put(genres[i], totPlays.getOrDefault(genres[i], 0) + plays[i]);
    		
    		// ���� key���̸� map ���� �� ����
    		if (map.get(genres[i]) == null) {
    			Map<Integer, Integer> playCnt = new HashMap<Integer, Integer>();
    			playCnt.put(i, plays[i]);
    			
    			map.put(genres[i], playCnt);
    		} else { // �ִ� key���̸� �����ϱ�
    			map.get(genres[i]).put(i, plays[i]);
    		}
    		
    	}

    	System.out.println(totPlays);
    	System.out.println(map);
    	
    	// �帣�� �� �÷��� Ƚ�� ������������ ���� �� key���� ����Ʈ�� �����
    	List<String> totSortList = totPlays.entrySet().stream()
				    				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				    				.map(Map.Entry::getKey)
				    				.collect(Collectors.toList());
    	
    	System.out.println(totSortList);
    	
    	// �帣�� value���� ������������ ������ ���ǹ�ȣ List
    	Map<String, List<Integer>> newMap = map.entrySet().stream()
    										.collect(Collectors.toMap(e -> e.getKey(), e -> sortValues(e.getValue())));
    	
    	
    	System.out.println(newMap);
    	
    	// ���� List
    	List<Integer> ans = new ArrayList<Integer>();
    	
    	for (String genre : totSortList) {
    		newMap.get(genre).stream().forEach(s -> ans.add(s));
    	}
    	
    	// ���� �迭�� �ٲ�
    	answer = ans.stream().mapToInt(Integer::intValue).toArray();
    	
    	for (int a : answer) {
    		System.out.print(a + " ");
    	}
    	
        return answer;
    }
}



public class BestAlbum{

	public static void main(String[] args) {
		// ["classic", "pop", "classic", "classic", "pop"]	[500, 600, 150, 800, 2500]	=> [4, 1, 3, 0]
		
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 2500};
		
		Solution s = new Solution();
		System.out.println(s.solution(genres, plays));

	}

}
