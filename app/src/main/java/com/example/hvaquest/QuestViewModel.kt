package com.example.hvaquest

import androidx.lifecycle.ViewModel
import com.example.hvaquest.model.Question

class QuestViewModel: ViewModel() {

    private val questRepository = QuestRepository()
    var questionIndex: Int = 0

    fun isAnswerCorrect(answer: String): Boolean = answer == getQuestion().correctAnswer

    fun getClue(): Int = getQuestion().clue

    fun incrementQuestion() = questionIndex++

    fun decrementQuestion() = questionIndex--

    fun getQuestions() = questRepository.getHvaQuest()

    fun getQuestion(): Question = getQuestions().get(questionIndex)

    fun resetQuestionIndex() {
        questionIndex = 0
    }


}