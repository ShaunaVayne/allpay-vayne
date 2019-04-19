package cn.vayne.search.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2019/3/27 2:53 PM
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
@Data
public class Spu {

	private Long id;

	private String parentCode;

	private String childCode;

	private String definitionCode;

	private String pid;

	private String unit;

	private String name;

	private Long brandId;

	private String brand;

	private String specification;

	private Long purchasePrice;

	private Long sellPrice;

	private Boolean onSale;

	private Boolean isDelete;

	private Boolean isBlack;

	private String content;

	private String onlyTime;

	private String createUser;

	private String updateUser;

	private Date createTime;

	private Date updateTime;
}
