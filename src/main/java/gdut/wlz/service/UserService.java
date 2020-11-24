package gdut.wlz.service;

import gdut.wlz.domain.User;
import gdut.wlz.mapper.UserMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author: BUG_BOY
 * DATE:2020/11/23  21:44
 */
@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    /**
     * 根据id查询用户
     * @param id
     * 注解：添加事务管理
     * @return
     */
    @Transactional
    public User findById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

}
