package tads.eaj.ufrn.exemploviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import tads.eaj.ufrn.exemploviewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding
    lateinit var viewModel: MainActivityViewModel


    //val carro1 = Carro("corsa", "vermelho", 1990)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        binding.vmodel = viewModel
        binding.lifecycleOwner = this
    }
}