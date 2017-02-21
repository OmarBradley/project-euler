package lee.eulerproject

import lee.eulerproject.problem.getNumber28Answer
import lee.eulerproject.problem.getPlusNumber
import lee.eulerproject.problem.getPlusNumbers
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals

class Number28Test : Spek({

    describe("28번의 정답을 구한다") {

        it("5의 대각의 합은 101이다") {
            assertEquals(getNumber28Answer(5), 101)
        }

        it("1001의 대각의 합은 101이다") {
            assertEquals(getNumber28Answer(1001), 101)
        }
    }

    describe("getPlusNumber 잘 동작을 하는지") {

        it("101의 plusNumber는 100이다") {
            assertEquals(getPlusNumber(101), 100)
        }

        it("22의 plusNumber는 21이다") {
            assertEquals(getPlusNumber(22), 21)
        }

        it("0의 plusNumber는 0이다") {
            assertEquals(getPlusNumber(0), 0)
        }

        it("-1의 plusNumber는 0이다") {
            assertEquals(getPlusNumber(-1), 0)
        }

        it("2의 plusNumber는 1이다") {
            assertEquals(getPlusNumber(2), 1)
        }

    }

    describe("getPlusNumbers 잘 동작을 하는지") {

        it("1까지에서의 getPlusNumbers가 잘 뽑아진다") {
            assertEquals(getPlusNumbers(1) == listOf(1), true)
        }

        it("2까지에서의 getPlusNumbers가 잘 뽑아진다") {
            assertEquals(getPlusNumbers(2) == listOf(1, 1, 1, 1), true)
        }

        it("3까지에서의 getPlusNumbers가 잘 뽑아진다") {
            assertEquals(getPlusNumbers(3) == listOf(1, 2, 2, 2, 2), true)
        }

        it("5까지에서의 getPlusNumbers가 잘 뽑아진다") {
            assertEquals(getPlusNumbers(5) == listOf(1, 2, 2, 2, 2, 4, 4, 4, 4), true)
        }

        it("6까지에서의 getPlusNumbers가 잘 뽑아진다") {
            assertEquals(getPlusNumbers(6) == listOf(1, 1, 1, 1, 3, 3, 3, 3, 5, 5, 5, 5), true)
        }

        it("7까지에서의 getPlusNumbers가 잘 뽑아진다") {
            assertEquals(getPlusNumbers(7) == listOf(1, 2, 2, 2, 2, 4, 4, 4, 4, 6, 6, 6, 6), true)
        }
    }

})