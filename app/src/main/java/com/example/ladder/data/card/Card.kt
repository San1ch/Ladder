package com.example.ladder.data.card

import java.util.Calendar

data class Card(
    val id: Long,
    val englishWord: String,
    val meanings: List<String>,

    val createdType: CardCreatedType,

    val createdAt: Long = Calendar.getInstance().timeInMillis,
    val updatedAt: Long,

    val tags: List<TagId>
) {
    fun getCalendarByCreatedAt(): Calendar {
        val calendar = Calendar.getInstance()
        calendar.timeInMillis = createdAt

        return calendar
    }
    
    fun getCalendarByUpdatedAt(): Calendar {
        val calendar = Calendar.getInstance()
        calendar.timeInMillis = updatedAt
        return calendar
    }

    fun changeFirstMeaning(idToTop: Int): Card {
        val newList = meanings.toMutableList()
        val shouldBeOnTheTop = newList[idToTop]

        newList.removeAt(idToTop)
        newList.add(0, shouldBeOnTheTop)

        return this.copy(meanings = newList, updatedAt = Calendar.getInstance().timeInMillis)
    }

    fun getFirstMeaning(): String {
        return meanings[0]
    }

    fun getMeaningById(id: Int): String {
        return meanings[id]
    }
}

@JvmInline
value class TagId(val id: Long)

data class Tag(
    val id: TagId,
    val name: String
){

}

class CardRules{
    val minEnglishWordLength = 1
    val maxEnglishWordLength = 50

    val minMeaningsCount = 0
    val maxMeaningsCount = 5


}

enum class CardCreatedType {
    SINGLE,
    BY_PARSE,
    FROM_TEXT
}
