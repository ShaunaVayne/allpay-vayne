package cn.vayne.web.mapper;

import cn.vayne.web.model.User;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2019/4/19 10:51 AM
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
public interface UserMapper {

	int addUser(User user);

	User getUser(Integer id);
}
