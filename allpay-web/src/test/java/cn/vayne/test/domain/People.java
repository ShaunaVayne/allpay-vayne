package cn.vayne.test.domain;

import lombok.Data;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/10/31 下午3:43
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
@Data
public class People {

	private Integer id;

	private String name;

	private Integer age;

	private Student student;
}

@Data
class Student {
	private String sex;

	private String address;
}
