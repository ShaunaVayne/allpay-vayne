package cn.vaye.search.index;

import cn.vaye.search.MainTest;
import cn.vayne.search.entity.Item;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2019/3/27 3:41 PM
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
public class ElasticSearchGenericTest extends MainTest {

	@Autowired
	private ElasticsearchTemplate elasticsearchTemplate;

	@Test
	public void testCreatIndex() {
		elasticsearchTemplate.createIndex(Item.class);
		System.out.println("success----------");
	}

	@Test
	public void testDeleteIndex() {
		elasticsearchTemplate.deleteIndex(Item.class);
		System.out.println("success----------");
	}
}
