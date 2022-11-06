package com.example.listadoparques

class ParqueProvider {
    companion object{
        val parqueList = listOf<Parque>(
            Parque(
                imagen = "https://img.europapress.es/fotoweb/fotonoticia_20220730103247_420.jpg",
                nombre = "Parque del Retiro",
                descripcion = "Es un jardín histórico y parque público situado en Madrid"
            ),
            Parque(
                imagen = "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/12/6a/30/c5/fabulosa-arquitectura.jpg?w=1200&h=1200&s=1",
                nombre = "Parque de María Luisa",
                descripcion = "Es el primer parque urbano de Sevilla y uno de sus pulmones verdes"
            ),
            Parque(
                imagen = "https://www.barcelo.com/guia-turismo/wp-content/uploads/2019/04/parque-guell.jpg",
                nombre = "Parque Güell",
                descripcion = "Es un parque público con jardines y elementos arquitectónicos situado en la parte superior de la ciudad de Barcelona"
            ),
            Parque(
                imagen = "https://upload.wikimedia.org/wikipedia/commons/7/79/Parque_de_la_Paloma_1.JPG",
                nombre = "Parque de la Paloma",
                descripcion = "Se localiza en el municipio malagueño de Benalmádena, inaugurado en 1995"
            ),
            Parque(
                imagen = "https://turismotorremolinos.es/wp-content/uploads/2017/03/parque-bateria.jpg",
                nombre = "Parque de la Bateria",
                descripcion = "Es un parque del municipio de Torremolinos, provincia de Málaga"
            )
        )
    }
}