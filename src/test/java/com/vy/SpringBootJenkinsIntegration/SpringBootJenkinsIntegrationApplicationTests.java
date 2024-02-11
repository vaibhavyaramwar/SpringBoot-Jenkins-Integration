package com.vy.SpringBootJenkinsIntegration;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootJenkinsIntegrationApplicationTests {

    public static Logger logger = LoggerFactory.getLogger(SpringBootJenkinsIntegrationApplicationTests.class);


    @Test
    void contextLoads() {
        logger.info("Test case executed");
        logger.info("Test case executed....1");
        assert true;
    }

}
