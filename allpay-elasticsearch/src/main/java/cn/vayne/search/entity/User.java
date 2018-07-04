package cn.vayne.search.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/7/3 下午5:26
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

	private static final long serialVersionUID = 1032368820536417082L;

	public static final String INDEX_NAME = "index_user";

	public static final String TYPE = "tstype";

	private Long id;

	private String name;

}
