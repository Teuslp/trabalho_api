import jakarta.persistence.*;
import lombok.*;

@Entity
@Data // Gera automaticamente os getters, setters, equals, hashCode e toString
@NoArgsConstructor
@AllArgsConstructor
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cpf;
    private int idade;
}
