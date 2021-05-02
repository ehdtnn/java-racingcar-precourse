package utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidationUtilsTest {
    @Test
    @DisplayName("자동차_이름_5자이하_검증_성공")
    void 자동차_이름_5자이하_검증_성공() {
        assertThat(ValidationUtils.validName("a")).isTrue();
        assertThat(ValidationUtils.validName("abcde")).isTrue();
    }

    @Test
    @DisplayName("자동차_이름_5자이하_검증_실패")
    void 자동차_이름_5자이하_검증_실패() {
        assertThat(ValidationUtils.validName("")).isFalse();
        assertThat(ValidationUtils.validName("abcdef")).isFalse();
    }



}
