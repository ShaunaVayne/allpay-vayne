package cn.vayne.search.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2019/3/27 2:54 PM
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
@Data
@Document(indexName = "item", type = "docs", shards = 5, replicas = 1)
public class Item implements Serializable {

	private static final long serialVersionUID = -2129303122046982015L;


	@Id
	private Long id;

	@Field(type = FieldType.Text, analyzer = "ik_max_word")
	private String title; //标题

	@Field(type = FieldType.Keyword)
	private String category; //分类

	@Field(type = FieldType.Keyword)
	private String brand; //品牌

	@Field(type = FieldType.Double)
	private Double price; //价格

	@Field(index = false, type = FieldType.Keyword)
	private String images; //图片地址
}
