package gdut.wlz.service;

import gdut.wlz.domain.User;
import gdut.wlz.mapper.UserMapper;
import org.springframework.stereotype.Service;

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
     * @return
     */
    public User findById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

}
