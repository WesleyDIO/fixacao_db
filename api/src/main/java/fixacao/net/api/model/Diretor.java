package fixacao.net.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tb_diretor")
public class Diretor extends Usuario {

    @OneToOne
    private Escola escola;
}
