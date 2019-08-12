package com.masstersoft.compainrepo.async_tasks

import android.os.Bundle
import android.os.Handler
import android.os.SystemClock
import androidx.appcompat.app.AppCompatActivity
import com.masstersoft.compainrepo.R
import kotlinx.android.synthetic.main.activity_handler.*


class HandlerActivity : AppCompatActivity() {

    // считаем нажатия кнопки
    private var btnPressed = 0

    // счетчик времени
    private var time = 0L

    // обработчик потока - обновляет сведения о времени
    // Создаётся в основном UI-потоке
    private val handler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_handler)

        if (time == 0L) {
            time = SystemClock.uptimeMillis();
            handler.removeCallbacks(timeUpdaterRunnable);
            // Добавляем Runnable-объект timeUpdaterRunnable в очередь
            // сообщений, объект должен быть запущен после задержки в 100 мс
            handler.postDelayed(timeUpdaterRunnable, 100);
        }

        btnStart.setOnClickListener {
            tv2.text = (++btnPressed).toString()
        }
    }

    // Описание Runnable-объекта
    private val timeUpdaterRunnable = object : Runnable {
        override fun run() {
            // вычисляем время
            val start = time
            val millis = SystemClock.uptimeMillis() - start
            var second = (millis / 1000).toInt()
            val min = second / 60
            second = second % 60
            // выводим время
            tv1.text = "" + min + ":" + String.format("%02d", second)
            // повторяем через каждые 200 миллисекунд
            handler.postDelayed(this, 200)
        }
    }

    override fun onPause() {
        // Удаляем Runnable-объект для прекращения задачи
        handler.removeCallbacks(timeUpdaterRunnable);
        super.onPause();
    }

    override fun onResume() {
        super.onResume()
        // Добавляем Runnable-объект
        handler.postDelayed(timeUpdaterRunnable, 100);
    }
}
