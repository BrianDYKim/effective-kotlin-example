package org.example.item1

/**
 * [data 한정자에 대한 설명]
 * 1. data class의 경우 내부적으로 copy를 지원해주기 때문에 아래와 같이 사용이 가능하다
 * [Code snippet]
 * var user = DataUser("Brian", "turkey")
 * user = user.copy(surname = "Cheetah") -> 불변성을 유지하면서 객체를 바꾸는게 가능해진다
 */
data class DataUser(
    val name: String,
    val surname: String
)
