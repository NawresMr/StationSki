package tn.esprit.gestionfoyernawres.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
//tous les champs sont privées
@FieldDefaults(level = AccessLevel.PRIVATE)
public class test {
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Setter(AccessLevel.NONE) //pour que l'id n'avoir pas un setter
  Long id;
  String name;
}
