package net.rjt.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.rjt.shoppingbackend.dao.CatagoryDAO;
import net.rjt.shoppingbackend.dto.Catagory;
@Repository("catagoryDAO")
public class CatagoryDAOImpl implements CatagoryDAO {

	private static List<Catagory> catagories=new ArrayList<>(); 

	static{

		Catagory catagory=new Catagory();
		//forst catagory
	catagory.setId(1);
		catagory.setName("Television");
		catagory.setDescription("This is some desc. for television!!");
		catagory.setImageURL("CAT_1.png");
		catagories.add(catagory);
		//second catagory
		catagory=new Catagory();
		catagory.setId(2);
		catagory.setName("Mobile");
		catagory.setDescription("This is some desc. for Mobile!!");
		catagory.setImageURL("CAT_2.png");
		catagories.add(catagory);
		//Thrid catagory
		catagory=new Catagory();
		catagory.setId(3);
		catagory.setName("Laptop");
		catagory.setDescription("This is some desc. for Laptop!!");
		catagory.setImageURL("CAT_3.png");
		catagories.add(catagory);
	}
	@Override
	public List<Catagory> list() {


		return catagories;	
	}
	@Override
	public Catagory get(int id) {
		for(Catagory catagory:catagories){
			if(catagory.getId()==id){
				return catagory;
			}
		}
		return null;
	}

}
