package cn.vayne.web.domain.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/8/22 下午3:20
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
@Data
@ToString
public class LocationReq {

	private String city;

	private Integer code;

	@JsonIgnore
	private String sex;
}
