package org.suite.suiteservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "districts")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DistrictsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String name_en;
    private Long province_id;
    private String administrative_unit_id;
    private String code;
    private String code_name;
    private String full_name;
    private String full_name_en;
    private String province_code;


}
