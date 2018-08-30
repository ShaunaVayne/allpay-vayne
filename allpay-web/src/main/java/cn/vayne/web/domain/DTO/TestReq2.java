package cn.vayne.web.domain.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/8/23 下午3:43
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class TestReq2 {

	private String name;

	private Integer age;

	private String loc;
}
