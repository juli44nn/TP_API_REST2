package com.example.inicial1.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.envers.Audited;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
@Audited
@Table(name="libro")
public class Libro extends Base{
    private String titulo;
    private String fecha;
    private String genero;
    private int paginas;
}
