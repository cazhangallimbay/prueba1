package Repository

import model.Ruta
import org.springframework.data.jpa.repository.JpaRepository


interface RutaRepository: JpaRepository<Ruta, Long> {
fun findById (id: Long?): Ruta?
}



