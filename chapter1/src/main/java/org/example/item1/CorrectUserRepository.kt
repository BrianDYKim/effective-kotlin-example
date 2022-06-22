package org.example.item1

/**
 * [변경 가능지점 노출하지 않기]
 * loadAll() 메소드의 반환을 immutable 객체로 업캐스팅하여 변경 가능 지점을 노출하지 않는 것도 방법이다.
 */
class CorrectUserRepository {
    private val storedUserList: MutableMap<Int, String> = mutableMapOf()

    fun loadAll(): Map<Int, String> {
        return storedUserList
    }
}