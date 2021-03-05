package microservice.book.socialmultiplication.service;

import microservice.book.socialmultiplication.domain.Multiplication;

/**
 * Created by dengweiqiang on 2021/3/5
 */
public interface MultiplicationService {
    /**
     * 使用两个随机生成的因子创建乘法对象
     * 范围在11到99之间
     * @return 返回一个随机数
     */
    Multiplication createRandomMultiplication();
}
