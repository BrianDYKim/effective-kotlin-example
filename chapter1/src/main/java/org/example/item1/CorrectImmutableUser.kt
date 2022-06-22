package org.example.item1

/**
 * [immutable 객체를 사용시의 장점]
 * 1. 한번 정의된 상태가 유지되므로 코드를 이해하기 쉽다
 * 2. immutable 객체는 공유했을 때도 충돌이 일어나지 않기 때문에 병렬 처리를 안전하게 할수있다
 * 3. immutable 객체에 대한 참조는 변경되지 않기 때문에 쉽게 캐시된다
 * 4. 깊은 복제가 필요없다
 * 5. immutable 객체는 또다른 객체를 생성해내는데 좋다. 그리고 실행이 쉽게 예측된다.
 * 6. immutable 객체는 set 또는 map의 key로 사용이 가능하다.
 * (참고)
 * set 그리고 map은 내부적으로 hash table을 사용하기 때문에 내부의 값을 이용해서 버킷을 결정해버린다. 그러므로
 * set이나 map의 자료구조에서 mutable 객체를 이용해서 요소를 수정해버리면 테이블 내부에서 값을 찾을수가 없게된다.
 * (참고)
 * property와 collection 중에서 하나를 mutable하게 만들어야한다면, 프로퍼티 자체를 mutable로 만들어서 setter를 private으로
 * 설정하는게 가변성 제한의 측면에서 유리하다
 */
class CorrectImmutableUser(
    val name: String,
    val surname: String
) {
    // 불변성을 유지하기 위해서 메소드를 따로 구현하여 immutable 객체를 반환하도록 만들어야한다
    fun withSurname(surname: String) = CorrectImmutableUser(name, surname)
}