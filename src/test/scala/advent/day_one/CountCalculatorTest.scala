package advent.day_one

import org.scalatest.FunSuite

/**
  * For example:
  *
  * For a mass of 12, divide by 3 and round down to get 4, then subtract 2 to get 2.
  * For a mass of 14, dividing by 3 and rounding down still yields 4, so the fuel required is also 2.
  * For a mass of 1969, the fuel required is 654.
  * For a mass of 100756, the fuel required is 33583.
  */

/**
  * A module of mass 14 requires 2 fuel. This fuel requires no further fuel (2 divided by 3 and rounded down is 0, which would call for a negative fuel), so the total fuel required is still just 2.
  * At first, a module of mass 1969 requires 654 fuel. Then, this fuel requires 216 more fuel (654 / 3 - 2). 216 then requires 70 more fuel, which requires 21 fuel, which requires 5 fuel, which requires no further fuel. So, the total fuel required for a module of mass 1969 is 654 + 216 + 70 + 21 + 5 = 966.
  * The fuel required by a module of mass 100756 and its fuel is: 33583 + 11192 + 3728 + 1240 + 411 + 135 + 43 + 12 + 2 = 50346.
  */
class CountCalculatorTest extends FunSuite{
  test("Fuel.counter 12") {
    assert(Fuel.counter(12) === 2)
  }

  test("Fuel.counter 14") {
    assert(Fuel.counter(14) === 2)
  }

  test("Fuel.counter 1969") {
    assert(Fuel.counter(1969) === 654)
  }

  test("Fuel.counter 100756") {
    assert(Fuel.counter(100756) === 33583)
  }

  test("Fuel.sumFuel 12") {
    assert(Fuel.sumFuel(12) === 2)
  }

  test("Fuel.sumFuel 14") {
    assert(Fuel.sumFuel(14) === 2)
  }

  test("Fuel.sumFuel 1969") {
    assert(Fuel.sumFuel(1969) === 966)
  }

  test("Fuel.sumFuel 100756") {
    assert(Fuel.sumFuel(100756) === 50346)
  }

}
