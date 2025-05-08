
n = int(input()) # 몇 개의 단어가 주어지는지 입력 받음
count = 0 # 그룹 단어의 개수

for _ in range(n) : # 단어를 하나씩 입력받기 위한 반복. _는 변수명을 쓰지 않겠다는 의미
    word = input() # 단어를 한줄 입력받음
    visited = set() # 이미 나온 알파벳을 저장할 집합. 집합(set)은 중복을 허용하지 않고, 빠르게 존재 여부 확인 가능
    prev = '' # 이전 문자를 저장하기 위한 변수. 첫 글자와 비교할 때 필요

    is_group = True # 이 단어가 그룹 단어인지 아닌지를 판별하는 플래그
    for ch in word : # 단어의 각 문자를 한 글자씩 순회
        if ch != prev : # 현재 문자가 이전 문자와 다르면, -> 같을 경우는 연속된 문자이므로 검사 생략 가능
            if ch in visited : # 이전에 한 번 나왔다가 다른 문자가 끼고 다시 나온 문자는 그룹 단어가 아님
                is_group = False # 그룹 단어가 아님을 표시
                break # 반복문 탈출
            visited.add(ch) # 처음 등장한 문자라면 기록해둠
        prev = ch # 현재 문자를 다음 루프의 이전 문자로 저장

    if is_group: # 그룹 단어인 경우에만 카운트 증가
        count += 1

print(count)