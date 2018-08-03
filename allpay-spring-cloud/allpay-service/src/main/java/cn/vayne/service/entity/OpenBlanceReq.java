package cn.vayne.service.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/8/2 下午6:51
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OpenBlanceReq {

	private Long shopId;

	private Long orderAmount;

	private Long orderNum;



}
