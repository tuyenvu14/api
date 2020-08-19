package com.tuyenvu.restfulapi.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto implements Serializable {
    private int id;
    private String name;
    private String parentCode;
    private String alias;
    private int status;
    private String createdBy;
    private Date createdDate;
    private String lastModifiedBy;
    private Date lastModifiedDate;
    private String type;
    private String combinationCategory;
    private String children;
    private int level;
    private int priority;
    private int isVisible;
    private String categoryCode;
    private String demandCode;
    private String realestateCode;
}
