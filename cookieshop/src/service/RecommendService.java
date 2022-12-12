package service;

import java.sql.SQLException;
import java.util.List;

import dao.RecommendDao;
import model.Goods;
import model.Page;

public class RecommendService {
	private RecommendDao dao = new RecommendDao();
	
	public Page<Goods> findGoodsByRecommendType(int type,int pageNum,int pageSize){
		Page<Goods> p = new Page<>();
		List<Goods> list;
		
		try {
			p.setPageNumber(pageNum);
			int totalCount = dao.findGoodsByRecommendTypeCount(type);
			p.SetPageSizeAndTotalCount(pageSize, totalCount);			
			list = dao.findGoodsByRecommendType(type, pageNum, pageSize);
			
			//将list中所有的goods，推荐属性值
			for(Goods goods:list) {
				goods.setScroll(dao.isRecommend(goods, 1));
				goods.setHot(dao.isRecommend(goods, 2));
				goods.setNew(dao.isRecommend(goods, 3));
			}
			p.setList(list);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}

}
