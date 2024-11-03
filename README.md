# java-lotto-precourse
## 기능 요구 사항
- 로또 번호의 숫자 범위는 1~45까지이다.
- 1개의 로또를 발행할 때 중복되지 않는 6개의 숫자를 뽑는다.
- 당첨 번호 추첨 시 중복되지 않는 숫자 6개와 보너스 번호 1개를 뽑는다.
- 당첨은 1등부터 5등까지 있다. 당첨 기준과 금액은 아래와 같다.
  - 1등: 6개 번호 일치 / 2,000,000,000원
  - 2등: 5개 번호 + 보너스 번호 일치 / 30,000,000원
  - 3등: 5개 번호 일치 / 1,500,000원
  - 4등: 4개 번호 일치 / 50,000원
  - 5등: 3개 번호 일치 / 5,000원 
- 로또 구입 금액을 입력하면 구입 금액에 해당하는 만큼 로또를 발행해야 한다. 
- 로또 1장의 가격은 1,000원이다. 
- 당첨 번호와 보너스 번호를 입력받는다. 
- 사용자가 구매한 로또 번호와 당첨 번호를 비교하여 당첨 내역 및 수익률을 출력하고 로또 게임을 종료한다. 
- 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException을 발생시키고, "[ERROR]"로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 다시 받는다. 
  - Exception이 아닌 IllegalArgumentException, IllegalStateException 등과 같은 명확한 유형을 처리한다.

## 구현할 기능 목록
- [x] 로또 구입 금액을 입력 받는다.
- [x] 로또 구입 금액을 통해 로또 수량을 얻는다.
- [x] 로또 수량만큼 로또를 발행한다.
- [x] 발행한 로또 수량 및 번호를 출력한다. 
- [x] 당첨 번호를 입력받는다.
- [x] 보너스 번호를 입력받는다.
- [x] 로또 별로 당첨 번호와 일치하는 번호가 있는지 확인한다.
- [x] 로또 당첨 개수를 저장한다
- [x] 당첨 내역을 출력한다.
- [x] 당첨 내역과 로또 구입 금액을 통해 수익률을 계산한다.
- [x] 수익률을 출력한다.

## 예외처리
### 로또 가격 입력
- [x] 1000 단위가 아니면 예뢰
- [x] 빈 값이면 예외
- [x] 숫자가 아니면 예외
- [x] 음수면 예외

### 당첨 번호 입력
- [x] 중복되면 예외
- [x] 6개가 아니면 예외
- [x] 음수면 예외
- [x] 빈 값이면 예외
- [x] 숫자가 아니면 예외

### 보너스 번호 입력
- [ ] 당첨 번호랑 중복이면 예외
- [ ] 빈 값이면 예외
- [ ] 숫자가 아니면 예외


