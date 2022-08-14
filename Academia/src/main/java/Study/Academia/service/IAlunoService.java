package Study.Academia.service;

import Study.Academia.entity.Aluno;
import Study.Academia.entity.AvaliacaoFisica;
import Study.Academia.entity.form.AlunoForm;
import Study.Academia.entity.form.AlunoUpdateForm;

import java.util.List;

public interface IAlunoService {

    Aluno create(AlunoForm form);

    Aluno get(Long id);

    List<Aluno> getAll(String dataDeNascimento);

    Aluno update(Long id, AlunoUpdateForm formUpdate);

    void delete(Long id);

    List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);
}
