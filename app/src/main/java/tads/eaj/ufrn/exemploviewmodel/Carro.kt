package tads.eaj.ufrn.exemploviewmodel

import android.util.Log

data class Carro (var nome:String, var cor:String, var ano:Int) {

    fun envelhecer(){
        Log.i("AULA", "envelhecer chamado")
        Log.i("AULA", this.ano.toString())
        this.ano = this.ano -1
        Log.i("AULA", this.ano.toString())
    }
}