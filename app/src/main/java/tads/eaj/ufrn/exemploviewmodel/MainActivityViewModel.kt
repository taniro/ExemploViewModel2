package tads.eaj.ufrn.exemploviewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    private var _carro = MutableLiveData<Carro>()
    var carro:LiveData<Carro> = _carro

    init {
        _carro.value = Carro("corsa", "vermelho", 1990)
    }

    fun handleClickEnvelhecer(){
        Log.i("AULA", _carro.value.toString())
        _carro.value?.envelhecer()
        Log.i("AULA", _carro.value.toString())
        _carro.postValue(_carro.value)
    }


    /*

    private var _nome = MutableLiveData<String>("palio")
    var nome:LiveData<String> = _nome

    private var _ano = MutableLiveData<Int>(2000)
    var ano: LiveData<Int> = _ano

    private var _cor = MutableLiveData<String> ("Branco")
    var cor:LiveData<String> = _cor


    fun incrementa(){
        this._ano.value = this._ano.value?.plus(1)
    }

     */

}