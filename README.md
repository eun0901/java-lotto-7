# java-lotto-precourse

# 기능 목록
## 로또 구매
### 1. 구입 금액 입력받기
- [x] 구입 금액을 1,000원 단위로 입력받는다.

아래의 경우, 에러를 반환한다.
- [x] 1,000원 단위가 아닐 경우
- [x] 숫자가 아닌 값을 입력할 경우
- [x] 구입 금액이 (2^31-1)보다 큰 경우

### 2. 구입 금액에 따른 로또 티켓 수량 계산
- [x] 구입 금액에 따라 필요한 로또 티켓 수를 계산한다.

## 로또 발행
### 1. 로또 티켓 생성
- [ ] 각 티켓에 중복되지 않는 6개의 랜덤 숫자(1~45)를 생성한다.
- [ ] 로또 번호는 오름차순으로 정렬하여 저장한다.

### 2. 로또 티켓 출력
- [ ] 생성된 로또 티켓 수량과 각 티켓의 번호를 화면에 출력한다.

## 당첨 번호 생성
### 1. 당첨 번호 입력받기
- [ ] 쉼표(,)로 구분된 당첨 번호 6개를 입력받는다.

아래의 경우, 에러를 반환한다. 
- [ ] 6개의 숫자를 입력하지 않을 경우
- [ ] 숫자가 아닌 값을 입력할 경우
- [ ] 1~45 범위를 벗어난 숫자를 입력할 경우 
- [ ] 중복된 숫자가 있을 경우

### 2. 보너스 번호 입력받기
- [ ] 보너스 번호 1개를 입력받는다.

아래의 경우, 에러를 반환한다.
- [ ] 숫자가 아닌 값을 입력할 경우
- [ ] 1~45 범위를 벗어난 숫자를 입력할 경우
- [ ] 당첨 번호에 포함된 숫자와 중복될 경우


## 당첨 확인
### 1. 당첨 번호와 사용자 로또 번호 비교
- [ ] 사용자 로또 번호와 당첨 번호를 비교하여 맞춘 숫자의 개수에 따라 당첨 여부를 확인한다.
- [ ] 보너스 번호를 포함하여 당첨 등급을 결정한다.

### 2. 당첨 내역 계산
- [ ] 각 로또 번호에 대해 등급별 당첨 횟수를 기록한다.

### 3. 당첨 내역 출력
- [ ] 등급별로 당첨 횟수와 당첨금액을 출력한다.

## 수익률 계산
### 1. 총 당첨금 합산
- [ ] 등급별 당첨 횟수와 당첨 금액을 곱하여 전체 당첨금을 계산한다.
   
### 2. 수익률 계산
- [ ] 전체 당첨금을 구입 금액으로 나눈 후 백분율로 변환하여 수익률을 계산한다. 
- [ ] 소수점 둘째 자리에서 반올림하여 표시한다.
  
### 3. 수익률 출력
- [ ] 전체 수익률을 % 단위로 출력한다.