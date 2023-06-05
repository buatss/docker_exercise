package com.example.demo;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "hello")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class HelloEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String message;
}
