package com.niit.Cargo.dao;
import java.util.List;
import com.niit.Cargo.model.Supplier;
public interface SupplierDao 
{
public void addSupplier(Supplier s);
public void updateSupplier(Supplier s);
public List<Supplier> listSuppliers();
public Supplier getSupplierById(int Id);
public void removeSupplier(int Id);
}
