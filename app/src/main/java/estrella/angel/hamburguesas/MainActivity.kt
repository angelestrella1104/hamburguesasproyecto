package estrella.angel.hamburguesas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import estrella.angel.hamburguesas.R
import estrella.angel.hamburguesas.databinding.ActivityMainBinding
import estrella.angel.hamburguesas.MenuActivity

import estrella.angel.hamburguesas.RecyclerActivity


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnReservarCita= findViewById<Button>(R.id.btn_reservar_sita)
        btnReservarCita.setOnClickListener{

            goToCreateAppoinment()

        }

        val btnMisCitas= findViewById<Button>(R.id.btn_ver_citas)
        btnMisCitas.setOnClickListener{

            gotoMisCitas()
        }

    }

    private fun gotoMisCitas(){

        val i= Intent(this, RecyclerActivity::class.java)
        startActivity(i)

    }

    private fun goToCreateAppoinment(){
        val i= Intent(this, MenuActivity::class.java)
        startActivity(i)
    }




}