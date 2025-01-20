package com.forohub.challenge.domain.topico;

import java.time.LocalDateTime;

public record DatosRespuestaTopico(Long id, String titulo, String mensaje, LocalDateTime fechaCreacion, String autor, String curso) {
}
