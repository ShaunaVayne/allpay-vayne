package cn.vayne.test.domain;

import lombok.Data;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/10/24 下午1:49
 * @ProjectName: saas-purchase
 * @Version: 1.0.0
 */
@Data
public class PurchaseProductReq {

	private String productId;

	private String productName;

	private String productSpecification;

	private String productUnit;

	private Long productPrice;

	private Integer quantityLimit;

	private Integer quantityExpect;
}
