package org.example.EXAMEN;

import java.util.Set;

public interface Acciones {
    void pagar();
    boolean autenticarse(Set<Usuario> usuariosRegistrados);
}
