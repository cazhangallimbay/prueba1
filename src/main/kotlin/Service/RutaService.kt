package Service


import Repository.RutaRepository
import model.Ruta
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class RutaService {
  @Autowired
  lateinit var rutaRepository: RutaRepository


  fun list(): List<Ruta> {

    return rutaRepository.findAll()
  }

  fun save(client: Ruta): Ruta {

    return rutaRepository.save(client)
  }
  fun update(ruta: Ruta): Ruta{

    return rutaRepository.save(ruta)

  }

  fun updateDescription (ruta: Ruta):Ruta  {
    val response = rutaRepository.findById(ruta.id)

      ?: throw Exception()

    response.apply {
      this.nombre =ruta.nombre
    }
    return rutaRepository.save(response)
  }

  fun delete (id:Long): Boolean{
    rutaRepository.deleteById(id)
    return true
  }
}

