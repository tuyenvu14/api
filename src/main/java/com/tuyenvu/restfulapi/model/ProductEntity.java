package com.tuyenvu.restfulapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "parent_code")
    private String parentCode;

    @Column(name = "alias")
    private String alias;

    @Column(name = "status")
    private int status;

    @Column(name = "created_by")
    private String createdBy;

    //    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "last_modified_by")
    private String lastModifiedBy;

    //    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "last_modified_date")
    private Date lastModifiedDate;

    @Column(name = "type")
    private String type;

    @Column(name = "combination_category")
    private String combinationCategory;

    @Column(name = "children")
    private String children;

    @Column(name = "level")
    private int level;

    @Column(name = "priority")
    private int priority;

    @Column(name = "is_visible")
    private int isVisible;

    @Column(name = "category_code")
    private String categoryCode;

    @Column(name = "demand_code")
    private String demandCode;

    @Column(name = "realestate_code")
    private String realestateCode;
}