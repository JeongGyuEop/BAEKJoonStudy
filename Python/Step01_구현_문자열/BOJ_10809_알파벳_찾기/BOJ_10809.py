s = input()
alphabet = [-1] * 26

for i in range(len(s)) :
    idx = ord(s[i]) - ord('a') # ord()는 문자열을 아스키 코드로 변환하기 위해 사용
    if alphabet[idx] == -1 :
        alphabet[idx] = i

print(' '.join(map(str, alphabet))) # 리스트 출력 시 공백 구분