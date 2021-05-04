package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {
    @Test
    @DisplayName("자동차_생성_성공")
    public void 자동차_생성_성공() {
        Car car = new Car("car1");
        assertThat(car).isNotNull();
    }

    @Test
    @DisplayName("자동차_생성_이름_공백_실패")
    public void 자동차_생성_이름_공백_실패() {
        assertThatThrownBy(() -> {
            new Car("");
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("공백");
    }

    @Test
    @DisplayName("자동차_생성_이름_5자초과_실패")
    public void 자동차_생성_이름_5자초과_실패() {
        assertThatThrownBy(() -> {
            new Car("abcdef");
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("5자 초과");
    }

    @Test
    @DisplayName("자동차_생성_위치_초기값_0")
    void 자동차_생성_위치_초기값_0() {
        Car car = new Car("car1");
        assertThat(car.getCarPosition()).isEqualTo(0);
    }

    @Test
    @DisplayName("자동차_전진_4부터_9까지")
    void 자동차_전진() {
        Car car = new Car("car1");
        assertThat(car.move(4)).isEqualTo(1);
    }

    @Test
    @DisplayName("자동차_멈춤_0부터_3까지")
    void 자동차_멈춤() {
        Car car = new Car("car1");
        assertThat(car.move(3)).isEqualTo(0);
    }
}

