package cn.vayne.web.handler;

import cn.vayne.web.model.ParameterConfig;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2019/4/19 11:54 AM
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
abstract class AbstractTypeHandler implements TypeHandler<List<ParameterConfig>> {

	@Override
	public void setParameter(PreparedStatement ps, int i, List<ParameterConfig> parameter, JdbcType jdbcType) throws SQLException {

	}

	@Override
	public List<ParameterConfig> getResult(ResultSet rs, String columnName) throws SQLException {
		return null;
	}

	@Override
	public List<ParameterConfig> getResult(ResultSet rs, int columnIndex) throws SQLException {
		return null;
	}

	@Override
	public List<ParameterConfig> getResult(CallableStatement cs, int columnIndex) throws SQLException {
		return null;
	}
}
