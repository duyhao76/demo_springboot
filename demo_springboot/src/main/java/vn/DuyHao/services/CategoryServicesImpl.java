package vn.DuyHao.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import vn.DuyHao.entity.Category;
import vn.DuyHao.repository.CategoryRepository;

@Service
public class CategoryServicesImpl  implements CategoryService{

	@Autowired
	CategoryRepository categoryRepository;

	public CategoryServicesImpl(CategoryRepository categoryRepository) {
		super();
		this.categoryRepository = categoryRepository;
	}

	@Override
	public Optional<Category> findByName(String name) {
		return categoryRepository.findByName(name);
	}

	@Override
	public Page<Category> findByNameContaining(String keyword, Pageable pageable) {
		return categoryRepository.findByNameContaining(keyword, pageable);
	}

	@Override
	public List<Category> findAll(Sort sort) {
		return categoryRepository.findAll(sort);
	}

	@Override
	public Page<Category> findAll(org.springframework.data.domain.Pageable pageable) {
		return categoryRepository.findAll(pageable);
	}

	@Override
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}

	@Override
	public Optional<Category> findById(Long id) {
		return categoryRepository.findById(id);
	}

	@Override
	public long count() {
		return categoryRepository.count();
	}

	@Override
	public void deleteById(Long id) {
		categoryRepository.deleteById(id);
	}

	@Override
	public <S extends Category> S save(S entity) {
		return categoryRepository.save(entity);
	}	
}
