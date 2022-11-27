package SQL;

import java.sql.SQLException;
import java.util.List;

import Persona.Colaborador;

public interface SQLAcciones {

    public List<Colaborador> select() throws SQLException;

    public int insert(Colaborador colaborador) throws SQLException;

}
