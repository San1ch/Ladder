package com.example.ladder

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.ladder.core.essentials.exceptions.ConnectionException
import com.example.ladder.core.essentials.exceptions.mapper.ExceptionToMassageMapper
import com.example.ladder.core.essentials.logger.Logger
import com.example.ladder.ui.theme.AppTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @Inject
    lateinit var exceptionToMassageMapper: ExceptionToMassageMapper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val massage1 = exceptionToMassageMapper.getLocalizedMassage(ConnectionException())
        val massage2 = exceptionToMassageMapper.getLocalizedMassage(ConnectionException())

        Logger.d(massage1)
        Logger.d(massage2)

        setContent {
            AppTheme {
                //TODO NavGraph()
            }
        }
    }
}