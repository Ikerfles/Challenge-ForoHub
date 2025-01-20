package com.forohub.challenge.domain.topico;

import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(@NotNull
                                    Long id,
                                    String mensaje,
                                    String autor,
                                    Boolean status) {
}
