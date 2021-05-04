package utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UtilsTest {
    @Test
    @DisplayName("자동차_이름_5자이하_검증_성공")
    void 자동차_이름_5자이하_검증_성공() {
        assertThat(Utils.validName("a")).isTrue();
        assertThat(Utils.validName("abcde")).isTrue();
    }

    @Test
    @DisplayName("자동차_이름_5자이하_검증_실패")
    void 자동차_이름_5자이하_검증_실패() {
        assertThat(Utils.validName("")).isFalse();
        assertThat(Utils.validName("abcdef")).isFalse();
    }

    @Test
    @DisplayName("랜덤_숫자_생성_함수_0_9_테스트")
    void 랜덤_숫자_생성_함수_0_9_테스트() {
        assertThat(Utils.makeRandom()).isGreaterThanOrEqualTo(0);
        assertThat(Utils.makeRandom()).isLessThanOrEqualTo(9);
    }

}
