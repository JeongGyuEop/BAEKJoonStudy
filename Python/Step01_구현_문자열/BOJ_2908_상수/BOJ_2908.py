s1, s2 = input().split()

# Python 슬라이싱 개념 익히기
# 기본 형태
# a라는 연속적인 객체들의 자료구조(예: 리스트, 튜플, 문자열)가 있다고 가정을 했을 때
# 기본 형태는 아래와 같습니다.

# a[start : end : step]

# 각각 start, end, step 모두 양수와 음수를 가질 수 있습니다.
# start: 슬라이싱을 시작할 시작위치입니다.
# end: 슬라이싱을 끝낼 위치로 end는 포함하지 않습니다!
# step: 옵션이며, stride(보폭)라고도 하며 몇개씩 끊어서 가져올지와 방향을 정합니다.

s1_rev = int(s1[::-1])
s2_rev = int(s2[::-1])

print(max(s1_rev, s2_rev))