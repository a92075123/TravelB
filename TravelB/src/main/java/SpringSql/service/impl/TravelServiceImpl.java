package SpringSql.service.impl;

import java.awt.print.Book;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import SpringSql.dao.TravelDao;
import SpringSql.dto.TravelQueryParams;
import SpringSql.model.Travel;
import SpringSql.model.jpaTravel;
import SpringSql.repository.TravelRepository;
import SpringSql.service.TravelService;

@Component
public class TravelServiceImpl  implements TravelService{
	
	
	
	@Autowired
	private TravelDao travelDao;
	
	@Autowired
	private TravelRepository travelRepository;
	


	@Override
	public List<Travel> getTravelById(String travelQueryParams) {
		
		return travelDao.getTravelById(travelQueryParams);
	}



	


	@Override
	public List<Travel> getTravelAll() {
		
		return travelDao.getTravelAll();
	}













	@Override
	public Page<jpaTravel> listAll(int pageNumber) {
		Pageable pageable =PageRequest.of(pageNumber - 1, 40);
		return travelRepository.findAll(pageable);
	}






	







	



	
	

	
	
	
	
}
