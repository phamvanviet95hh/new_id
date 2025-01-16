package org.suite.suiteservice.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Set;

@Data
@Table(name = "sub_partners")
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class SubPartnerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String address;
    private String code;
    private String inactiveReason;
    private Boolean isPartner;
    private String name;
    private String phoneNumber;
    private String status;
    private Integer wardId;

    @ManyToOne
    @JoinColumn(name = "partner_id", nullable = false)
    private PartnersEntity partners;




}
