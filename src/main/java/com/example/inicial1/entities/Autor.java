package com.example.inicial1.entities;


import jakarta.persistence.Column;
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
@Table(name="autor")
public class Autor extends Base{
    @Column(name="nombre")
    private String nombre;
    private String apellido;

    @Column(name="bibliografía", length = 1500)
    private String bibliografia;

}
