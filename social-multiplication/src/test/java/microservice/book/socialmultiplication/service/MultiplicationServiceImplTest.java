package microservice.book.socialmultiplication.service;

import microservice.book.socialmultiplication.domain.Multiplication;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

/**
 * Created by dengweiqiang on 2021/3/5
 */
public class MultiplicationServiceImplTest {
    @Mock
    private RandomGeneratorService randomGeneratorService;
    private MultiplicationServiceImpl multiplicationServiceImpl;
    
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        multiplicationServiceImpl = new MultiplicationServiceImpl(randomGeneratorService);
    }
    
    @Test
    public void createRandomMultiplication() {
        // mock randomGeneratorService服务，给他两个返回值，第一个返回50，第二个返回30
        given(randomGeneratorService.generateRandomFactor()).willReturn(50, 30);
        
        Multiplication multiplication = multiplicationServiceImpl.createRandomMultiplication();
        
        assertThat(multiplication.getFactorA()).isEqualTo(50);
        assertThat(multiplication.getFactorB()).isEqualTo(30);
        assertThat(multiplication.getResult()).isEqualTo(1500);
    }
}