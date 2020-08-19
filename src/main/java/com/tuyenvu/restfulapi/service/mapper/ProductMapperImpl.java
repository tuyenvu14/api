package com.tuyenvu.restfulapi.service.mapper;

import com.tuyenvu.restfulapi.model.ProductEntity;
import com.tuyenvu.restfulapi.service.dto.ProductDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public abstract class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductEntity convertEntity(ProductDto dto) {
//        ModelMapper modelMapper = new ModelMapper();
        ProductEntity entity = new ProductEntity();
//        modelMapper.map(entity, ProductDto.class);
        entity.setId(dto.getId());
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
        return entity;
    }

    @Override
    public ProductDto convertDto(ProductEntity entity) {
//        ModelMapper modelMapper = new ModelMapper();
        ProductDto dto = new ProductDto();
//        modelMapper.map(dto, ProductEntity.class );
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setParentCode(entity.getParentCode());
        dto.setAlias(entity.getAlias());
        dto.setStatus(entity.getStatus());
        dto.setCreatedBy(entity.getCreatedBy());
        dto.setCreatedDate(entity.getCreatedDate());
        dto.setLastModifiedBy(entity.getCreatedBy());
        dto.setLastModifiedDate(entity.getLastModifiedDate());
        dto.setType(entity.getType());
        dto.setCombinationCategory(entity.getCombinationCategory());
        dto.setChildren(entity.getChildren());
        dto.setLevel(entity.getLevel());
        dto.setPriority(entity.getPriority());
        dto.setIsVisible(entity.getIsVisible());
        dto.setCategoryCode(entity.getCategoryCode());
        dto.setDemandCode(entity.getDemandCode());
        dto.setRealestateCode(entity.getRealestateCode());
        return dto;
    }

    @Override
    public List<ProductEntity> convertEntity(List<ProductDto> dtoList) {
        List<ProductEntity> list = new ArrayList<>();
        for (ProductDto dto : dtoList) {
            ProductEntity entity = convertEntity(dto);
            list.add(entity);
        }
        return list;
    }

    @Override
    public List<ProductDto> convertDto(List<ProductEntity> entityList) {
        List<ProductDto> list = new ArrayList<>();
        for (ProductEntity entity : entityList) {
            ProductDto dto = convertDto(entity);
            list.add(dto);
        }
        return list;
    }
}
