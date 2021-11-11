package model

import javax.persistence.*

@Entity
@Table(name = "CicloRuta")
class Ruta {
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(updatable = false)
  var id: Long? = null
  var nombre: String? = null
  var longitud: String? = null

}
