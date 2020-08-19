package com.tuyenvu.restfulapi.service.impl;

import com.tuyenvu.restfulapi.service.dto.ProductDto;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<ProductDto> getAll();

    ProductDto getById(int id);

    ProductDto postProduct(ProductDto dto);

    List<ProductDto> postProducts(List<ProductDto> dtoList);

    ProductDto updateProduct(ProductDto dto);

    ProductDto deleteProduct(int  id);
}
