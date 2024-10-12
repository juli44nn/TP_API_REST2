package com.example.inicial1.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Null;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.envers.Audited;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
@Audited
@Table(name="persona")
public class Persona extends Base {
    private String nombre;
    private String apellido;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_domicilio")
    @Null
    private Domicilio domicilio;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(
            name="persona_libro",
            joinColumns = @JoinColumn(name="persona_id"),
            inverseJoinColumns = @JoinColumn(name="libro_id")

    )
    private List<Libro> libros;
}

