package cn.vayne.web.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/6/21 上午10:41
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExcelPoiInfo extends HashMap<Object, Object> {

	private int code;

	private String msg;

}
