package gdut.wlz.service;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: BUG_BOY
 * DATE:2020/11/24  11:09
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest extends TestCase {
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void testFindById() {
    }

    @Test
    /**
     * 测试redis
     */
    public void testRedis() {
        redisTemplate.boundValueOps("weng").set("gdut");
        System.out.println(redisTemplate.opsForValue().get("weng"));
    }
}