package SpringSql.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import SpringSql.dao.TravelDao;
import SpringSql.model.Travel;
import SpringSql.rowmapper.TravelRowMapper;
@Component
public class TravelDaoImpl implements TravelDao {

	@Autowired
	private NamedParameterJdbcTemplate  namedParameterJdbcTemplate;

	@Override
	public List<Travel> getTravelById(String travelId) {
		try {
			String sql= "SELECT id,name,town,address,tel,tickets,introduce,picture FROM travel2  WHERE town  = :travelId";
			Map<String,Object> map=new HashMap<>();
			
			
			map.put("travelId", travelId); 
					
			List<Travel> travelList = namedParameterJdbcTemplate.query(sql, map,new TravelRowMapper());
			
			
				return  travelList;
			
			}catch (Exception e) {
				return null;
			}
		
			
		}
}