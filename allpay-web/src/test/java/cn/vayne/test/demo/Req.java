package cn.vayne.test.demo;

import lombok.Data;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/9/27 下午2:22
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
@Data
public class Req {

	private Integer pageNum = 1;

	private Integer pageSize = 10;

	private String search;
}
