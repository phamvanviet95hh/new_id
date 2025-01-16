package org.suite.suiteservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Table(name = "transactions_statistics")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TransactionsStatisticsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "transaction_id", nullable = false)
    private TransactionsEntity transactions;

    @ManyToOne
    @JoinColumn(name = "statistic_id", nullable = false)
    private StatisticsEntity statistics;
}
