package com.tuyenvu.restfulapi.service.mapper;

import com.tuyenvu.restfulapi.service.dto.ProductDto;
import com.tuyenvu.restfulapi.model.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface ProductMapper extends EntityMapper<ProductDto, ProductEntity> {

    ProductEntity convertEntity(ProductDto dto);

    ProductDto convertDto(ProductEntity entity);

    List<ProductEntity> convertEntity(List<ProductDto> dtoList);

    List <ProductDto> convertDto(List<ProductEntity> entities);
}
