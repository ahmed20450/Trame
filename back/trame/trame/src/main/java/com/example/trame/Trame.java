package com.example.trame;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Trame {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private String action;
    private String numchambre;
    private String cod_resid;
    private String nom_resid;
    private String date_arrive;
    private String date_depart;
    private String code_user;
    private String nom_user;
    private String type;
    private String AsiCard;
    private String serv;
    private String Path;


}
