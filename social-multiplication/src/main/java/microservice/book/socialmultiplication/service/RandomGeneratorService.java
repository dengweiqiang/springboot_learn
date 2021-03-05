package microservice.book.socialmultiplication.service;

/**
 * Created by dengweiqiang on 2021/3/5
 */
public interface RandomGeneratorService {
    /**
     * 返回一个随机数，范围在11到99之间
     * @return 随机数
     */
    int generateRandomFactor();
}
