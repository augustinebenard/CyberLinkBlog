package com.austine.blog.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
//@Entity
//@Table(name = "token")
//public class VerificationToken implements Serializable{
//
//    @Id
//    @GeneratedValue(strategy = IDENTITY)
//    private Long id;
//    private String token;
//    @OneToOne(fetch = LAZY)
//    private User user;
//    private Instant expiryDate;
//
//
//
//}