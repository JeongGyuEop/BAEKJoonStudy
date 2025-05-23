grade_tabel = { # 성적 문자 -> 평점으로 매핑한 딕셔너리
    "A+": 4.5, "A0": 4.0,
    "B+": 3.5, "B0": 3.0,
    "C+": 2.5, "C0": 2.0,
    "D+": 1.5, "D0": 1.0,
    "F": 0.0
}

total_score = 0.0
total_credit = 0.0

for _ in range(20):
    subject, credit, grade = input().split()
    credit = float(credit)

    if grade == "P":
        continue

    total_score += credit * grade_tabel[grade]
    total_credit += credit

gpa = total_score / total_credit
print(f"{gpa:.6f}") # 소수점 6자리까지 출력