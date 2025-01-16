package org.suite.suiteservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.time.LocalDateTime;

@Data
@Table(name = "statistics")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StatisticsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private Integer dayNumber;
    private Integer monthNumber;
    private String partnerType;
    private Long pricePerDay;
    private String priceType;
    private Date reportDate;
    private String scope;
    private Long totalFailTransaction;
    private Long totalRevenue;
    private Long totalSuccessTransaction;
    private Long totalTransaction;
    private Integer yearNumber;

    @ManyToOne
    @JoinColumn(name = "partner_id", nullable = false)
    private PartnersEntity partners;

    private String statisticFor;
    private String subPartnerCode;

}
