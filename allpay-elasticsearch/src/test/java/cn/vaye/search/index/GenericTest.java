package cn.vaye.search.index;

import cn.vaye.search.domain.Generic;
import org.junit.Test;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2019/4/18 3:14 PM
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
public class GenericTest {

	@Test
	public void test() {
		Generic<String> stringGeneric = new Generic<>();
		Generic<Integer> integerGeneric = new Generic<>();
		stringGeneric.setKey("aa");
		integerGeneric.setKey(2332);
		System.out.println(stringGeneric.getKey());
		System.out.println(integerGeneric.getKey());
	}
}
