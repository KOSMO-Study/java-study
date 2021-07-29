# 완주하지 못한 선수

## 문제설명
수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.


## 제한사항
- 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
- completion의 길이는 participant의 길이보다 1 작습니다.
- 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
- 참가자 중에는 동명이인이 있을 수 있습니다.

## 입출력 예
|participant|completion|return|
|-----------|----------|------|
|["leo", "kiki", "eden"]|	["eden", "kiki"]|	"leo"|
|["marina", "josipa", "nikola", "vinko", "filipa"]	|["josipa", "filipa", "marina", "nikola"]	|"vinko"
|["mislav", "stanko", "mislav", "ana"]	|["stanko", "ana", "mislav"]|	"mislav"|


<br><hr>

## HashMap 메소드
- `put(key, value)` : key-value 쌍 추가 메서드
- `put(원래있는 key, value)` :HashMap은 key 중복이 안되므로, 새로운 value 로 업데이트된다.
- `getOrDefault(key, 디폴트value)` : key 존재하면 그 키의 value를 반환하고, 존재하지 않으면 디폴트value값을 반환한다.
- `get(key)` : 해당 key의 value를 반환한다.

<br>

## HashMap 전체 출력
#### keySet()
  - keySet() 후 get()을 사용하는 것은 비효율적이다. get()할 때 다시 HashMap을 돌려 찾아야 하기 때문이다.
  - key와 value를 다 써야 할 때는 entrySet()을 사용하자.
```java
for (String key : map.keySet()) {  // keySet() : key들만 모아져있는
    String value = map.get(key);  // get(key) : value 얻기
    System.out.println("[key]:" + key + ", [value]:" + value);
}
```
#### entrySet()
  - entrySet() 에는 key-value 쌍이 들어 있다.
  - Map.Entry<key형타입, value형타입> 을 통해 key-value 한 쌍을 받는다.
```java
for (Map.Entry<String, Integer> elem : map.entrySet()) {
    // elem 에는 key-value 쌍이 들어있다.
    // elem.getKey() : key 얻기
    // elem.getValue() : value 얻기
    System.out.println("[key]:" + elem.getKey() + ", [value]:" + elem.getValue());
}

```
#### Iterator
```java
Iterator<Integer> ir = map.keySet().iterator();

while(ir.hasNext()) {
     int key = ir.next();  // next() : key 얻기
     String value = map.get(key);   // get(key) : value 얻기
     System.out.println("[key]:" + key + ", [value]:" + value);
}
```

<br><hr>

## 코드 (수정 후)
```java
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
    	
      String answer = "";
		
      // 참가자 해시맵 생성 [key : 참가자 이름, value : 이름가진 사람 수]
      HashMap<String, Integer> part_hm = new HashMap<String, Integer>();

      for(String p : participant) {  // 해시맵에 참가자 넣기
          part_hm.put(p, part_hm.getOrDefault(p, 0) + 1);  // getOrDefault() : 해시맵에 키값이 있으면 value 리턴, 없으면 설정 값 리턴
      }

      for (String c : completion) { // 해시맵에 완주자 key값으로 찾아 value-1 해주기
          part_hm.put(c, part_hm.get(c) - 1);
      }

      for (Map.Entry<String, Integer> elem : part_hm.entrySet()) {	// entrySet() 통해 key-value 쌍을 Entry elem 으로 받는다.
          if (elem.getValue() == 1) {  // 명 수가 1명이면 answer에 이름 key 값 저장 후, break.
              answer = elem.getKey();
              break;
          }
      }
		
		
      return answer;
      
    }
}
```

<hr>

출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
