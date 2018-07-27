package cn.vayne.search.repository;

import cn.vayne.search.entity.User;
import io.searchbox.client.JestClient;
import io.searchbox.client.JestResult;
import io.searchbox.core.Bulk;
import io.searchbox.core.Index;
import io.searchbox.core.Search;
import lombok.extern.slf4j.Slf4j;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/7/3 下午5:31
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {

	@Autowired
	private JestClient jestClient;

	@Override
	public void saveEntity(User user) {
		Index index = new Index.Builder(user).index(User.INDEX_NAME).type(User.TYPE).build();
		try {
			jestClient.execute(index);
			log.info("ES 插入完成");
		} catch (IOException e) {
			log.error(e.getMessage());
		}
	}

	@Override
	public void saveEntity(List<User> userList) {
		Bulk.Builder bulk = new Bulk.Builder();
		for(User entity : userList) {
			Index index = new Index.Builder(entity).index(User.INDEX_NAME).type(User.TYPE).build();
			bulk.addAction(index);
		}
		try {
			jestClient.execute(bulk.build());
			log.info("ES 插入完成");
		} catch (IOException e) {
			log.error(e.getMessage());
		}

	}

	@Override
	public List<User> searchEntity(String searchContent) {
		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
		searchSourceBuilder.query(QueryBuilders.matchQuery("name",searchContent));
		Search search = new Search.Builder(searchSourceBuilder.toString())
				.addIndex(User.INDEX_NAME).addType(User.TYPE).build();
		try {
			JestResult result = jestClient.execute(search);
			List<User> sourceAsObjectList = result.getSourceAsObjectList(User.class);
			return sourceAsObjectList;
		} catch (IOException e) {
			log.error(e.getMessage());
		}
		return null;
	}
}
