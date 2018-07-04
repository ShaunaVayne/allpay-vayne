package cn.vayne.search.repository;

import cn.vayne.search.entity.User;

import java.util.List;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/7/3 下午5:30
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
public interface UserService {

	void saveEntity(User user);

	void saveEntity(List<User> userList);

	List<User> searchEntity(String searchContent);

}
