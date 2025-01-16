package org.suite.suiteservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.time.LocalDateTime;

@Data
@Table(name = "partner_quotas")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PartnerQuotasEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private LocalDateTime activeAt;
    private String cancelledBy;
    private String cancelledReason;
    private Date contractAt;
    private String contractCode;
    private String contractName;
    private LocalDateTime expiredAt;
    private Long quota;
    private String rank;
    private Long remain;
    private String status;
    private Long used;

    @ManyToOne
    @JoinColumn(name = "partner_id", nullable = false)
    private PartnersEntity partner;


}
