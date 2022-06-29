const fizzBuzz = require("../src/fizzbuzz");

test("should return hello world", () => {
    // given

    // when
    const actualResult = fizzBuzz()

    // then
    expect(actualResult).toEqual("hello world")
})
