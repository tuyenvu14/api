package com.tuyenvu.restfulapi.controller;

import com.tuyenvu.restfulapi.service.dto.ProductDto;
import com.tuyenvu.restfulapi.service.impl.ProductService;
import org.apache.tomcat.util.http.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private  ProductService service;

    @GetMapping(value = "/product/{id}")
    public ResponseEntity<ProductDto> findProductById(@PathVariable int id) {
        ProductDto dto = service.getById(id);
        if (dto == null) {
            return new ResponseEntity<ProductDto>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<ProductDto>(dto,HttpStatus.OK);
    }

    @GetMapping(value = "/products")
    public ResponseEntity<List<ProductDto>> findAllProduct() {
        List<ProductDto> dtoList = service.getAll();
        if (dtoList.isEmpty()) {
            return new ResponseEntity<List<ProductDto>>(dtoList, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<ProductDto>>(dtoList, HttpStatus.OK);
    }

    @PostMapping(value = "/add")
    public ResponseEntity<ProductDto> addProduct(@RequestBody ProductDto dto) {
        service.postProduct(dto);
        return new ResponseEntity<ProductDto>(dto, HttpStatus.OK);
    }

    @PostMapping(value = "/addAll")
    public ResponseEntity<List<ProductDto>> addAll(@RequestBody List<ProductDto> dtoList) {
        service.postProducts(dtoList);
        return new ResponseEntity<List<ProductDto>>(dtoList, HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<ProductDto> delete(@PathVariable int id) {
        ProductDto dto = service.deleteProduct(id);
        return new ResponseEntity<ProductDto>(dto, HttpStatus.OK);
    }

    @PutMapping(value = "/update")
    public ResponseEntity<ProductDto> update(@RequestBody ProductDto dto) {
        ProductDto dto1 = service.updateProduct(dto);
        if (dto1 == null) {
            return new ResponseEntity<ProductDto>(HttpStatus.NOT_FOUND);
        }
        return  new ResponseEntity<ProductDto>(dto,HttpStatus.OK);
    }
}
