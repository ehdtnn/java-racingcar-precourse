package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import view.Message;

import static org.assertj.core.api.Assertions.assertThat;

class CarsTest {
    private Cars cars;

    @BeforeEach
    void setUp() {
        cars = new Cars("a,b,c");
    }

    @Test
    @DisplayName("생성")
    void 생성() {
        assertThat(cars.getSize()).isEqualTo(3);
    }

}

