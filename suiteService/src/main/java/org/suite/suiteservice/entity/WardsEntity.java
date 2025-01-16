package org.suite.suiteservice.entity;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "wards")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WardsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer districtId;
    private String name;
    private String name_en;
    private Integer province_id;
    private String type;
}
