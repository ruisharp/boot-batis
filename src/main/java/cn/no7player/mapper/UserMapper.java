package cn.no7player.mapper;

import java.util.List;

import cn.no7player.model.User;
import cn.no7player.vo.UserDo;

/**
 * Created by zl on 2015/8/27.
 */
public interface UserMapper {
    public User findUserInfo();
    
    
    public List<UserDo> selectUserDoageQuery(UserDo userDo);
}
