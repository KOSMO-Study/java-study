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
	
	// map을 받아서 value값을 내림차순으로 대칭하는 key값을 List로 리턴하는 함수
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
        
    	// key: 음악 장르, value: [음악번호-플레이횟수] 
    	Map<String, Map<Integer, Integer>> map = new HashMap<String, Map<Integer,Integer>>();
    	// 장르별 총 플레이 횟수
    	Map<String, Integer> totPlays = new HashMap<String, Integer>();
    	
    	// {장르1={음악번호=플레이횟수, ...}, 장르2={음악번호=플레이횟수, ...}}
    	for (int i = 0; i < genres.length; i++) {
    		// 장르별 총 플레이 횟수 누적
    		totPlays.put(genres[i], totPlays.getOrDefault(genres[i], 0) + plays[i]);
    		
    		// 없는 key값이면 map 생성 후 저장
    		if (map.get(genres[i]) == null) {
    			Map<Integer, Integer> playCnt = new HashMap<Integer, Integer>();
    			playCnt.put(i, plays[i]);
    			
    			map.put(genres[i], playCnt);
    		} else { // 있는 key값이면 저장하기
    			map.get(genres[i]).put(i, plays[i]);
    		}
    		
    	}

    	System.out.println(totPlays);
    	System.out.println(map);
    	
    	// 장르별 총 플레이 횟수 내림차순으로 정렬 후 key값만 리스트로 만들기
    	List<String> totSortList = totPlays.entrySet().stream()
				    				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				    				.map(Map.Entry::getKey)
				    				.collect(Collectors.toList());
    	
    	System.out.println(totSortList);
    	
    	// 장르별 value값은 내립차순으로 정렬한 음악번호 List
    	Map<String, List<Integer>> newMap = map.entrySet().stream()
    										.collect(Collectors.toMap(e -> e.getKey(), e -> sortValues(e.getValue())));
    	
    	
    	System.out.println(newMap);
    	
    	// 정답 List
    	List<Integer> ans = new ArrayList<Integer>();
    	
    	for (String genre : totSortList) {
    		newMap.get(genre).stream().forEach(s -> ans.add(s));
    	}
    	
    	// 정답 배열로 바꿈
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
