package microservice.book.socialmultiplication.service;

import microservice.book.socialmultiplication.domain.Multiplication;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;

/**
 * Created by dengweiqiang on 2021/3/5
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class MultiplicationServiceTest {
    @MockBean
    private RandomGeneratorService randomGeneratorService;
    @Autowired
    private MultiplicationService multiplicationService;
    
    @Test
    void createRandomMultiplication() {
        // mock randomGeneratorService服务，给他两个返回值，第一个返回50，第二个返回30
        given(randomGeneratorService.generateRandomFactor()).willReturn(50, 30);
        
        Multiplication multiplication = multiplicationService.createRandomMultiplication();
        
        assertThat(multiplication.getFactorA()).isEqualTo(50);
        assertThat(multiplication.getFactorB()).isEqualTo(30);
        assertThat(multiplication.getResult()).isEqualTo(1500);
    }
}