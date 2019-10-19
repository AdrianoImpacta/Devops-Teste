package br.com.fernandosousa.lmsapp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.login.*

class MainActivity : DebugActivity() {

    private val context: Context get() = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        // encontra objeto pelo id
        campo_imagem.setImageResource(R.drawable.bonaparte)

        texto_login.text = getString(R.string.mensagem_login)

        // evento no botao de login forma 1
//        botao_login.setOnClickListener {
//            val valorUsuario = campo_usuario.text.toString()
//            val valorSenha = campo_senha.text.toString()
//            Toast.makeText(this, "$valorUsuario : $valorSenha", Toast.LENGTH_LONG).show()
//        }

        // segunda forma: delegar para método
        botao_login.setOnClickListener {onClickLogin() }

    }

    fun onClickLogin(){
        val valorUsuario = campo_usuario.text.toString()
        val valorSenha = campo_senha.text.toString()
        //Toast.makeText(context, "$valorUsuario : $valorSenha", Toast.LENGTH_LONG).show()
        if (valorUsuario == "aluno" ) {

            if (valorSenha == "impacta") {
                // criar intent
                val intent = Intent(context, TelaInicialActivity::class.java)
                // colocar parâmetros (opcional)
                val params = Bundle()
                params.putString("nome", "Fernando Sousa")
                intent.putExtras(params)

                // enviar parâmetros simplificado
                intent.putExtra("numero", 10)

                // fazer a chamada
                //startActivity(intent)

                // fazer a chamada esperando resultado
                startActivityForResult(intent, 1)
            }
            else{
                Toast.makeText(this, "Login ou Senha Inválido", Toast.LENGTH_LONG).show()
            }
        }
        else{
            Toast.makeText(this, "Login ou Senha Inválido", Toast.LENGTH_LONG).show()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == 1) {
            val result = data?.getStringExtra("result")
            Toast.makeText(context, "$result", Toast.LENGTH_LONG).show()
        }
    }
}
