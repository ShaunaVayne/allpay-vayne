package cn.vayne.web.model;

import lombok.Data;

import java.util.List;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2019/4/19 10:49 AM
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
@Data
public class User {

	private Long id;

	private String userName;

	private List<ParameterConfig> favorites;

}
