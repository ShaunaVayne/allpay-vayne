package cn.vayne.web.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2019/4/19 2:11 PM
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParameterConfig {

	private Integer id;

	private String key;

	private String value;
}
