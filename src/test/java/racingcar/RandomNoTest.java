package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RandomNoTest {

    @Test
    @DisplayName("랜덤_숫자_생성_0_9_테스트")
    void 랜덤_숫자_생성_0_9_검증_성공() {
        assertThat(new RandomNo(0)).isEqualTo(0);
        assertThat(new RandomNo(9)).isEqualTo(9);
    }
}