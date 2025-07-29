package com.example.sleepeasy.navigation

import kotlinx.serialization.Serializable

interface destination

@Serializable
object SleepFormScreenDestination : destination

@Serializable
object SleepHubScreenDestination : destination

@Serializable
object CaffeineFormScreenDestination : destination
