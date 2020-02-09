package itcelaya.basketballcontadorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import kotlinx.android.synthetic.main.activity_main.*;

class MainActivity : AppCompatActivity(), OnClickListener{

    var scoreA:Int = 0
    var scoreB:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1ptEqA.setOnClickListener(this)
        btn2ptsEqA.setOnClickListener(this)
        btn3ptsEqA.setOnClickListener(this)

        btn1ptEqB.setOnClickListener(this)
        btn2ptsEqB.setOnClickListener(this)
        btn3ptsEqB.setOnClickListener(this)

        btnLimpiar.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn1ptEqA->sumarPuntosA(1)
            R.id.btn2ptsEqA->sumarPuntosA(2)
            R.id.btn3ptsEqA->sumarPuntosA(3)
            R.id.btn1ptEqB->sumarPuntosB(1)
            R.id.btn2ptsEqB->sumarPuntosB(2)
            R.id.btn3ptsEqB->sumarPuntosB(3)
            R.id.btnLimpiar->limpiarScores()
        }
    }

    private fun limpiarScores() {
        txtScore1.text = "0"
        txtScore2.text = "0"
        scoreA = 0
        scoreB = 0
    }

    private fun sumarPuntosA(i: Int) {
        scoreA += i
        txtScore1.text = scoreA.toString()
    }

    private fun sumarPuntosB(i: Int) {
        scoreB += i
        txtScore2.text = scoreB.toString()
    }
}
