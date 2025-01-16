package org.suite.suiteservice.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Table(name = "transactions")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TransactionsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String destinationApi;
    private String deviceType;

    @Column(columnDefinition = "TEXT")
    private String exception;

    private Integer httpStatus;
    private Boolean isValidIdCard;
    private Integer latencyTime;
    private String partnerType;

    @Column(columnDefinition = "TEXT")
    private String request_body;

    private LocalDateTime requestTime;
    private String requestType;

    @Column(columnDefinition = "TEXT")
    private String responseBody;

    private String status;

    @ManyToOne
    @JoinColumn(name = "partner_id", nullable = false)
    private PartnersEntity partners;

    @ManyToOne
    @JoinColumn(name = "partner_quota_id", nullable = false)
    private PartnerQuotasEntity partnerQuotas;

    @ManyToOne
    @JoinColumn(name = "sub_partner_id", nullable = false)
    private SubPartnerEntity subPartner;

    @Column(columnDefinition = "TEXT")
    private String signature;

    private String code;
    private Long discount;
    private Long originalPrice;
    private Long price;
    private String activityId;
    private String requestId;

}
