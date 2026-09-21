package edu.course.lab01;


import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CourseToolkitParameterizedTest {


    @ParameterizedTest
    @ValueSource (ints = {2, 3, 5, 7, 11, 13, 17, 19})
    void returnsTrueIfPrime(int number) {
        boolean result = CourseToolkit.isPrime(number);

        assertTrue(result);
    }

}
