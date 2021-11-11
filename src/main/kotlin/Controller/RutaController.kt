package Controller

import Service.RutaService
import model.Ruta
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/Cicloruta")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])

class RutaController {

        @Autowired
        lateinit var RutaService: RutaService

        @GetMapping
        fun list(): List<Ruta>{
            return RutaService.list()
        }

        @PutMapping
        fun update (@RequestBody ruta: Ruta):Ruta{
            return RutaService.update(ruta)
        }

        @PatchMapping
        fun patch(@RequestBody ruta: Ruta):Ruta{
            return RutaService.updateDescription(ruta)
        }

        @DeleteMapping("/delete/{id}")
        fun delete (@PathVariable("id") id: Long):Boolean{
            return RutaService.delete(id)
        }



    }
