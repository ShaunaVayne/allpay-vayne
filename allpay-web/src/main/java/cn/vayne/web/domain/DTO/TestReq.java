package cn.vayne.web.domain.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/8/22 下午3:19
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
@Data
@ToString
public class TestReq {

	private String name;

	private Integer age;

	private Integer id;

	@JsonIgnore
	private String sex;

	private List<LocationReq> locationReqs;
}
