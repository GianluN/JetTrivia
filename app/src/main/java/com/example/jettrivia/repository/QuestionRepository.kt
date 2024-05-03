package com.example.jettrivia.repository

import android.util.Log
import com.example.jettrivia.data.DataOrException
import com.example.jettrivia.model.QuestionItem
import com.example.jettrivia.network.QuestionApi
import javax.inject.Inject

class QuestionRepository @Inject constructor(private val api: QuestionApi) {
    private val dataOrException = DataOrException<ArrayList<QuestionItem>, Boolean, Exception>() // facciamo così per poter passare altri dati oltre all'arraylist

    suspend fun getAllQuestions(): DataOrException<ArrayList<QuestionItem>, Boolean, Exception> {
        try {
            dataOrException.loading = true // corrisponde a Boolean
            dataOrException.data = api.getAllQuestions() // corrisponde a ArrayList<QuestionItem>
            if (dataOrException.data.toString().isNotEmpty()) dataOrException.loading = false // abbiamo caricato qualcosa, mettiamo a false lo stato

        } catch (exception: Exception) {
            dataOrException.e = exception
            Log.d("Exc", "getAllQuestion ${dataOrException.e!!.localizedMessage}")
        }
        return dataOrException
    }
}