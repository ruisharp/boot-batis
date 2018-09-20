package cn.no7player.service;

import cn.no7player.mapper.UserMapper;
import cn.no7player.model.User;
import cn.no7player.util.Page;
import cn.no7player.vo.UserDo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zl on 2015/8/27.
 */

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;

	public User getUserInfo() {
		User user = userMapper.findUserInfo();
		// User user=null;
		return user;
	}

	public Page<UserDo> selectUserDoageQuery(UserDo userDo) {
		Page<UserDo> page = new Page<>();
		page.setPageNo(userDo.getStartPage());
		page.setPageSize(userDo.getPageSize());
		page.setTotalCount(count.intValue());
		page.setList(userMapper.selectUserDoageQuery(userDo));
	
	}

}
