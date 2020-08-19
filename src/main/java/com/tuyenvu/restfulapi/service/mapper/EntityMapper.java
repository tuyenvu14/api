package com.tuyenvu.restfulapi.service.mapper;

import java.util.List;

public interface EntityMapper<D, E> {

    E convertEntity(D dto);

    D convertDto(E entity);

    List<E> convertEntity(List<D> dtoList);

    List <D> convertDto(List<E> entityList);
}
