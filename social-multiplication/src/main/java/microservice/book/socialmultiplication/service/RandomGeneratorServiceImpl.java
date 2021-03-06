package microservice.book.socialmultiplication.service;

import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * Created by dengweiqiang on 2021/3/6
 */
@Service
public class RandomGeneratorServiceImpl implements RandomGeneratorService {
    
    final static int MINIMUM_FACTOR = 11;
    final static int MAXIMUM_FACTOR = 99;
    
    @Override
    public int generateRandomFactor() {
        return new Random().nextInt((MAXIMUM_FACTOR - MINIMUM_FACTOR) + 1) + MINIMUM_FACTOR;
    }
}
