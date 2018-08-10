package net.rjt.shoppingbackend.dao;

import java.util.List;

import net.rjt.shoppingbackend.dto.Catagory;

public interface CatagoryDAO {

	List<Catagory>  list();
	Catagory get(int id);
}
