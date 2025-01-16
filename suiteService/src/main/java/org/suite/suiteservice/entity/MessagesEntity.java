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
@Table(name = "messages")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MessagesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String code;

    private String content;
    private String content_en;
}
