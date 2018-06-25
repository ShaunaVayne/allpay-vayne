package cn.vayne.web.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/6/25 上午11:26
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemDO {

	private String orderId;

	private String itemNums;

	private String itemIds;

	private String itemNames;
}
