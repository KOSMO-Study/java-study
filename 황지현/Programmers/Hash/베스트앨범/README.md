# 베스트 앨범

## 문제설명
스트리밍 사이트에서 장르 별로 가장 많이 재생된 노래를 두 개씩 모아 베스트 앨범을 출시하려 합니다. 노래는 고유 번호로 구분하며, 노래를 수록하는 기준은 다음과 같습니다.

1. 속한 노래가 많이 재생된 장르를 먼저 수록합니다.
2. 장르 내에서 많이 재생된 노래를 먼저 수록합니다.
3. 장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.

노래의 장르를 나타내는 문자열 배열 genres와 노래별 재생 횟수를 나타내는 정수 배열 plays가 주어질 때, 베스트 앨범에 들어갈 노래의 고유 번호를 순서대로 return 하도록 solution 함수를 완성하세요.

## 제한사항
- genres[i]는 고유번호가 i인 노래의 장르입니다.
- plays[i]는 고유번호가 i인 노래가 재생된 횟수입니다.
- genres와 plays의 길이는 같으며, 이는 1 이상 10,000 이하입니다.
- 장르 종류는 100개 미만입니다.
- 장르에 속한 곡이 하나라면, 하나의 곡만 선택합니다.
- 모든 장르는 재생된 횟수가 다릅니다.

## 입출력 예
|genres|plays|return|
|------|----|-------|
|["classic", "pop", "classic", "classic", "pop"]|[500, 600, 150, 800, 2500]|[4, 1, 3, 0]|


<br><hr>

## stream 사용

<br><hr>

## 코드
```java
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
```

<hr>

출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges  
참고:  
