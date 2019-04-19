package cn.vaye.search.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2019/4/18 3:13 PM
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Generic<T> {

	private T key;

}
