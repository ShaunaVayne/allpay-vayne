package cn.vayne.search.controller;

import cn.vayne.search.entity.User;
import cn.vayne.search.repository.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/7/3 下午5:45
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
@RestController
@Slf4j
public class UserController {

	@Autowired
	private UserServiceImpl userService;

	@GetMapping("insert")
	public Object insert() {
		final Long flag = System.currentTimeMillis();
		User user = new User(System.currentTimeMillis() - flag, "商品");
		userService.saveEntity(user);
		return "success";
	}

	@GetMapping("getAll")
	public Object getAll(String desription) {
		List<User> users = userService.searchEntity(desription);
		log.info("users paramer {}" , users);
		return users;
	}
}
