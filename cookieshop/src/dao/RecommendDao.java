package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import model.Goods;
import model.User;
import utils.C3P0Utils;

public class RecommendDao {
	
	//当前商品是否是某个推荐
	public boolean isRecommend(Goods goods,int type) throws SQLException {
		boolean flag = false;
		QueryRunner runner = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "SELECT count(*) FROM recommend INNER JOIN goods ON recommend.goods_id = goods.id " + 
				"WHERE goods.id = ? AND recommend.type = ? ";
		int count = runner.query(sql, new ScalarHandler<Long>(),goods.getId(),type).intValue();
		if(count == 1) 
			flag = true;
		
		return flag;
	}
	
	//通过推荐类型，查询这个类型所有的商品，分页s
	public List<Goods> findGoodsByRecommendType(int type,int pageNum,int pageSize) throws SQLException{
		List<Goods> list = new ArrayList<>();
		
		QueryRunner runner = new QueryRunner(C3P0Utils.getDataSource());
		
		String sql = "SELECT " + 
				"goods.id," + 
				"goods.`name`," + 
				"goods.cover," + 
				"goods.image1," + 
				"goods.image2," + 
				"goods.price," + 
				"goods.intro," + 
				"goods.stock," + 
				"type.id typeid," + 
				"type.`name` typename" + 
				" FROM goods" + 
				" INNER JOIN type ON goods.type_id = type.id" + 
				" INNER JOIN recommend ON recommend.goods_id = goods.id" + 
				" WHERE recommend.type = ?" + 
				" ORDER BY" + 
				" goods.id desc" + 
				" LIMIT ?, ? ";
		
		list = runner.query(sql.toString(), new BeanListHandler<>(Goods.class),
				type,(pageNum-1)*pageSize,pageSize);
		
		return list;
	}
	
	public int findGoodsByRecommendTypeCount(int type) throws SQLException{
		int count = 0;
		
		QueryRunner runner = new QueryRunner(C3P0Utils.getDataSource());
		
		String sql = "SELECT count(*) FROM recommend WHERE type = ?" ;
		
		count = runner.query(sql, new ScalarHandler<Long>(),type).intValue();
		
		return count;
	}

}