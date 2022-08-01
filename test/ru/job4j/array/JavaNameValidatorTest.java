package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static ru.job4j.array.JavaNameValidator.*;

class JavaNameValidatorTest {
    @Test
    void whenFullLatValid() {
        assertThat(isNameValid("first")).isTrue();
    }

    @Test
    void whenLatNumberValid() {
        assertThat(isNameValid("first1")).isTrue();
    }

    @Test
    void whenLatNumberUnderValid() {
        assertThat(isNameValid("first_user")).isTrue();
    }

    @Test
    void whenNumberInValid() {
        assertThat(isNameValid("123")).isFalse();
    }

    @Test
    void whenCapitalInValid() {
        assertThat(isNameValid("A23")).isFalse();
    }
}