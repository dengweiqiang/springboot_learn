package microservice.book.socialmultiplication.service;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by dengweiqiang on 2021/3/6
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class RandomGeneratorServiceTest {
    @Autowired
    private RandomGeneratorService randomGeneratorService;
    
    @Test
    void generateRandomFactor() {
        // when a good sample of randomly generated factors is generated
        List<Integer> randomFactors = IntStream.range(0, 1000).map(i -> randomGeneratorService.generateRandomFactor())
                .boxed().collect(Collectors.toList());
        
        // then all of them should be between 11 and 100
        // because we want a middle-complexity calculation
        assertThat(randomFactors).containsOnlyElementsOf(
                IntStream.range(11, 100).boxed().collect(Collectors.toList()));
    }
}