package com.aruerue.shop.repository;

import java.util.List;

<<<<<<< HEAD
import com.aruerue.shop.dto.addminDto.AddminDto;
import com.aruerue.shop.model.product.Category;
import com.aruerue.shop.model.product.Product;
import com.aruerue.shop.model.product.RelatedProduct;
=======
import com.aruerue.shop.addminDto.AddminDto;
import com.aruerue.shop.model.product.Category;
import com.aruerue.shop.model.product.Product;
import com.aruerue.shop.model.product.Product_status;
import com.aruerue.shop.model.product.Related_product;
>>>>>>> c3ce0af68d3d29589e62f7f56fded8857d096b13
import com.aruerue.shop.model.user.User;

public interface AddminRepository {
	///////////등록할떄 이거 3개가 동시에 Insert되게함.////////////////////////
<<<<<<< HEAD
	public void saveProduct(AddminDto addminDto);
	public void saveRelated_product(AddminDto addminDto);
	public void saveProduct_status(AddminDto addminDto);
	///////////////////////////////////////////////////////////////
	
	List<AddminDto> productList();
=======
	List<AddminDto> addminDtoList();
	public int saveProduct(AddminDto addminDto);
	public void saveRelated_product(AddminDto addminDto);
	public void saveProduct_status(AddminDto addminDto);

	public AddminDto selectProduct(AddminDto addminDto);
	///////////////////////////////////////////////////////////////

	List<Product> productList();
	List<AddminDto> relatedProduct();
	//////////////////////////////////////////////////
	public int listdelete(int id);
	public int listdetete_product_status(int id);

	///////////////////////////////////////////
	public Product selectUpdate(Product product);
	public void updata(Product product);

>>>>>>> c3ce0af68d3d29589e62f7f56fded8857d096b13
}
