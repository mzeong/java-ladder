# java-ladder

사다리 타기 미션 저장소

## 구현 기능 목록

- [x] 사람 이름을 입력받는다.
  - [x] 사람 이름은 쉼표(,)를 기준으로 구분한다.
  - [x] 사다리 게임에 참여하는 사람이 두 명 이상이어야 한다. `예외`
  - [x] 사다리 게임에 참여하는 사람에 이름을 최대 5글자까지 부여할 수 있다. `예외`
  - [x] 사다리 게임에 참여하는 사람에 이름을 최소 1글자는 부여해야 한다. `예외`
  - [x] 이름의 글자 수를 셀 때 앞뒤 공백은 포함하지 않는다.
- [x] 최대 사다리 높이를 입력받는다.
  - [x] 높이는 1 이상의 정수여야 한다. `예외`
- [x] 사용자가 잘못된 값을 입력할 경우 `IllegalArgumentException`를 발생시키고, 에러 메시지를 출력 후 그 부분부터 입력을 다시 받는다.

<br>

- [x] 입력받은 최대 사다리 높이만큼 라인을 생성한다.
- [x] 라인에 `사람의 수 - 1`만큼 좌표를 생성한다. 
- [x] 사다리의 라인을 만들 때 좌표는 사용되거나 사용되지 않는다.
  - [x] 단, 최대 사다리 높이를 만족하려면 좌표가 하나 이상 사용되어야 한다.
  - [x] 단, 사다리 타기가 정상적으로 동작하려면 좌표가 연속적으로 사용되어서는 안 된다.

<br>

- [x] 사다리를 출력할 때 사람 이름도 같이 출력한다.
- [x] 사람 이름은 5자 기준으로 출력한다.
  - [x] 글자 수에 따라 `***a*`, `**aa*`, `*aaa*`, `aaaa*`, `aaaaa`와 같이 공백(*)을 추가한다.
  - [x] 이름 구분을 위해 뒤에 공백(*)을 추가한다.
- [x] 사람 이름을 5자 기준으로 출력하기 때문에 사다리 폭도 넓어져야 한다.


## 우아한테크코스 코드리뷰

- [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)
