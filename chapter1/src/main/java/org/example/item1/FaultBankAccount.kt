package org.example.item1

/**
 * [가변성이 존재하는 클래스를 작성시 발생하는 문제들]
 * 1. 디버그하기가 힘들다. 클래스가 stateful한 경우 상태를 갖는 부분들을 개발자가 기억을 해야하며, 상태 변경이 잦아지면 추적하기가 힘들다.
 * 2. 가변성이 존재하면 코드의 실행을 추론하기 힘들다.
 * 3. 멀티스레드 프로그램에서 동작하는 클래스일 경우 동기화(Synchronizing) 과정이 필요하다. -> 많은 부분에서 충돌을 일으킬 가능성이 높다
 * 4. stateful class는 모든 상태를 테스트 해야하기 때문에 테스트가 힘들어진다
 * 5. 상태 변경이 일어날 때 상태변경을 전파해야하는 경우 꽤나 많은 오버헤드가 발생한다.
 */
class FaultBankAccount {
    var balance = 0.0
        private set

    suspend fun deposit(depositAmount: Double) {
        balance += depositAmount
    }

    @Throws(InsufficientFunds::class)
    suspend fun withdraw(withdrawAmount: Double) {
        if (balance < withdrawAmount)
            throw InsufficientFunds()

        balance -= withdrawAmount
    }
}