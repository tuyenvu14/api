package com.tuyenvu.restfulapi.service.impl;

import com.tuyenvu.restfulapi.model.ProductEntity;
import com.tuyenvu.restfulapi.repository.ProductRepository;
import com.tuyenvu.restfulapi.service.dto.ProductDto;
import com.tuyenvu.restfulapi.service.mapper.ProductMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper mapper;

    @Autowired
    private ProductRepository repository;

//    public ProductServiceImpl(ProductMapper mapper, ProductRepository repository) {
//        this.mapper = mapper;
//        this.repository = repository;
//    }

    @Override
    public List<ProductDto> getAll() {
        return mapper.convertDto(repository.findAll());
    }

    @Override
    public ProductDto getById(int id) {
        return mapper.convertDto(repository.findById(id).orElse(null));
    }

    @Override
    public ProductDto postProduct(ProductDto dto) {
        ProductEntity entity = new ProductEntity();
        entity = mapper.convertEntity(dto);
        repository.save(entity);
        return dto;
    }

    @Override
    public List<ProductDto> postProducts(List<ProductDto> dtoList) {
        List<ProductEntity> entityList = new ArrayList<>();
        entityList = mapper.convertEntity(dtoList);
        repository.saveAll(entityList);
        return dtoList;
    }

    @Override
    public ProductDto updateProduct(ProductDto dto) {
        ProductEntity entity = repository.findById(dto.getId()).orElse(null);
        if (entity != null) {
            entity.setName(dto.getName());
            entity.setParentCode(dto.getParentCode());
            entity.setAlias(dto.getAlias());
            entity.setStatus(dto.getStatus());
            entity.setCreatedBy(dto.getCreatedBy());
            entity.setCreatedDate(dto.getCreatedDate());
            entity.setLastModifiedBy(dto.getCreatedBy());
            entity.setLastModifiedDate(dto.getLastModifiedDate());
            entity.setType(dto.getType());
            entity.setCombinationCategory(dto.getCombinationCategory());
            entity.setChildren(dto.getChildren());
            entity.setLevel(dto.getLevel());
            entity.setPriority(dto.getPriority());
            entity.setIsVisible(dto.getIsVisible());
            entity.setCategoryCode(dto.getCategoryCode());
            entity.setDemandCode(dto.getDemandCode());
            entity.setRealestateCode(dto.getRealestateCode());

            ProductEntity entity1 = repository.save(entity);
        } else {
            return null;
        }
        return mapper.convertDto(entity);
    }

    @Override
    public ProductDto deleteProduct(int id) {
        ProductEntity entity = repository.findById(id).orElse(null);
        if (entity != null) {
            repository.deleteById(id);
        } else {
            return null;
        }
        return mapper.convertDto(entity);
    }
}