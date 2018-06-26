package cn.vayne.web.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/6/26 下午6:51
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SkuItemDo {

	private String orderId;

	private String skuId;

	private String skuName;

	private String specifications;
}
