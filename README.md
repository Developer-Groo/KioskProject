#  KioskProject

**간단한 계산기를 만들며 Java 의 기본 문법과 객체지향에 대해서 학습하였습니다.**

## ☑️ Index
- [🏁 Team](#-Team)
- [📑 Commit Convention](#-Commit-Convention)
- [🔥 Trouble Shouting](#-Trouble-Shouting)
- [✅ 마무리](#-마무리)

<br>

## 🏁 Team
| **우현**                                                                                                                                                             |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| <img src="https://github.com/Developer-Nova/Sec19-Local-Data-Persistance_ByAngela/assets/123448121/17a2ba3b-a618-4ac8-93b9-0d0e02c19c78" width="110" height="110"> |
| [Groo's GitHub](https://github.com/Developer-Nova)                                                                                                                 |

<br>

## 📑 Commit Convention

**`feat`** : 새로운 기능 추가

**`fix`** : bug fix

**`docs`**  : 문서 수정

**`style`** : 세미콜론 같은 코드의 사소한 스타일 변화.

**`refactor`** : 변수명 수정같은 리팩터링

**`test`** : 테스트 코드 추가 & 수정

**`chore`** : 중요하지 않은 일

<br>

## 🔥 Trouble Shouting

### 1. 가변인자로 받은 파라미터 값을 Menu 클래스의 필드값에 저장하는 문제

가변 인자로 받은 파라미터 값을 리스트에 넣을 때 반복문을 돌리지 않고 한번에 저장할 수 있는 방법을 고민했습니다.

~~~ java
public void setMenuItems(MenuItem... menuItems) {
        for (MenuItem menuItem : menuItems) {
            this.menuItems.add(menuItem);
        }
    }
~~~

<br>

### 해결방법

가변 인자로 받은 파라미터 값을 `Arrays.asList()` 를 사용하여 리스트로 변환한 후 `addAll()` 메서드를 사용하여 한번에 리스에 저장하였습니다.

~~~ java
public void setMenuItems(MenuItem... menuItems) {
        this.menuItems.addAll(Arrays.asList(menuItems));
    }
~~~

<br>

## 고민해봐야할 점

`Arrays.asList(menuItems)` 자체는 고정 크기의 리스트를 반환하기 때문에 리스트의 크기를 변경할 수 없습니다.

현재 로직에서는 `addAll()` 메서드를 통해 처리하기 때문에 상관이 없지만 추후에 `Arrays.asList()` 를 사용할때 주의해야 할 것 같습니다.

<br>