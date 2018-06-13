package com.niit.Cargo.dao;
import java.util.List;
import com.niit.Cargo.model.Category;
public interface CategoryDao 
{
public <Category> void addCategory(Category c);
public <Category> void updateCategory(Category c);
public <Category> List<Category> listCategorys();
public <Category> Category getCategorybyId(int id);
public void removeCategory(int id);
}
