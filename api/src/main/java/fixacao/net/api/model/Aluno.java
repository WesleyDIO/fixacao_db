package fixacao.net.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tb_aluno")
public class Aluno extends Usuario{

    @ManyToOne
    private Turma turma;
}
