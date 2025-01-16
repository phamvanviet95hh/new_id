package org.suite.suiteservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@Table(name = "partners")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PartnersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private LocalDateTime createdAt;
    private String address;
    private LocalDateTime updatedAt;
    private String apiKey;
    private String code;
    private String consumerId;
    private String createdBy;
    private String email;
    private Boolean isEmailVerified;
    private String name;
    private String partnerRank;
    private String partnerType;
    private String phoneNumber;
    private String representative;
    private String status;
    private String taxNumber;
    private String username;
    private String wardId;

    @OneToMany(mappedBy = "partner")
    private Set<PartnersEntity> partners;

}
