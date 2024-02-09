package org.example.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

import java.math.BigDecimal;

@Getter
@Setter
@EqualsAndHashCode(exclude = "country")
@Entity
@Table(name = "country_language", schema = "world")
public class CountryLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    @Column(name = "language")
    private String language;

    @Column(name = "is_official")
    @Type(type = "org.hibernate.type.BooleanType")
    private Boolean isOfficial;

    @Column(name = "percentage")
    private BigDecimal percentage;
}
