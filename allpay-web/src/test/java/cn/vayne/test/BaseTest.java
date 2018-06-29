package cn.vayne.test;

import cn.vayne.web.AppWeb;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/6/28 下午1:18
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,  classes = { AppWeb.class })
public class BaseTest {

	@Test
	public void test() {

	}

}
