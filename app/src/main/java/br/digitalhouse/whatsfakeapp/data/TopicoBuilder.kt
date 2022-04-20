package br.digitalhouse.whatsfakeapp.data

class TopicoBuilder {

    var listaDeTopicos = mutableListOf<Topicos>()

    fun add(image: Int, message: String, title: String) {
        var itens = Topicos(image, title, message)
        listaDeTopicos.add(itens)
    }

}