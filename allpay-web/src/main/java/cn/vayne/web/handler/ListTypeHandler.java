package cn.vayne.web.handler;

import cn.vayne.web.model.ParameterConfig;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.type.JdbcType;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2019/4/19 11:55 AM
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
/*
@MappedJdbcTypes(JdbcType.VARCHAR)
@MappedTypes(List.class)
这两个注解, 感觉没用, 删掉也能出一样的结果
*/
public class ListTypeHandler extends AbstractTypeHandler {
	@Override
	public void setParameter(PreparedStatement ps, int i, List<ParameterConfig> parameter, JdbcType jdbcType) throws SQLException {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for (ParameterConfig parameterConfig : parameter) {
			sb.append("{")
					.append("\"id\":").append(parameterConfig.getId()).append(",")
					.append("\"key\":").append("\"").append(parameterConfig.getKey()).append("\",")
					.append("\"value\":").append("\"").append(parameterConfig.getValue()).append("\"")
					.append("},");
		}
		String s = sb.toString().substring(0,sb.toString().length() - 1) + "]";
		ps.setString(i,s);
		super.setParameter(ps, i, parameter, jdbcType);
	}

	@Override
	public List<ParameterConfig> getResult(ResultSet rs, String columnName) throws SQLException {
		String favorites = rs.getString("favorites");
		List<ParameterConfig> parameterConfigs = new ArrayList<>();
		if(StringUtils.isNotEmpty(favorites)) {
			JSONArray jsonArray = JSONArray.parseArray(favorites);
			for (Object obj : jsonArray) {
				ParameterConfig parameterConfig = ((JSONObject) obj).toJavaObject(ParameterConfig.class);
				parameterConfigs.add(parameterConfig);
			}
		}
		return parameterConfigs;
	}
}
