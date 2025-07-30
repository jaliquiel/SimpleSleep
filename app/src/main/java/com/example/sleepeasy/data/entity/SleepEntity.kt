package com.example.sleepeasy.data.entity

data class SleepData(
    val sleepingTime: SleepingEntry,
    val exerciseLevel: ExerciseLevel,
    val stressLevel: StressLevel,
    val mgCaffeineIntake: Int = 0, // Assuming caffeine intake is an integer representing mg of caffeine
)

data class SleepingEntry(
    val sleepTime: String = "",
    val wakeUpTime: String = "",
    val date: String = "",
    val sleepDuration: String = ""
)

// stress level enum from 0 to 5
enum class StressLevel(val level: Int) {
    NONE(0),
    LOW(1),
    MODERATE(2),
    HIGH(3),
    VERY_HIGH(4),
    EXTREME(5);

    companion object {
        fun fromInt(level: Int): StressLevel {
            return entries.find { it.level == level } ?: NONE
        }
    }
}

enum class ExerciseLevel {
    NONE, LIGHT, MODERATE, HEAVY
}
