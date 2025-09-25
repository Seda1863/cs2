
📝 Quiz Application (Android)

COMP4107 – Spring 2025 – In Class Study 2

A simple quiz application built with Android. The app asks 3 questions to the user, tracks answers, and displays a final result based on the score.

⸻

🎯 Requirements
	•	The main screen has only a Start button → goes to the first question screen.
	•	Each question screen must:
	•	Have centered elements
	•	End with a Submit button → moves to the next question
	•	The last question screen has a Finish button → goes to final screen.
	•	Final screen:
	•	Shows “You Won” if correct answers > 1
	•	Shows “You Lose” otherwise
	•	Elements must be centered

⸻

⚙️ Constraints
	•	Must use Data Binding
	•	Only one Activity allowed
	•	Only course slides, course examples, and Android documentation may be used (no external/AI tools)

⸻

🛠️ Tech Stack
	•	Language: Java / Kotlin
	•	Framework: Android SDK
	•	UI: ConstraintLayout (to ensure centered elements)
	•	Data Handling: ViewModel + LiveData with Data Binding

⸻

🚀 How It Works
	1.	Start Screen → “Start” button navigates to Question 1.
	2.	Question Screens (1–3) → each has a question, options, and Submit button.
	3.	Final Screen → shows result message (“You Won” / “You Lose”).

⸻

✅ Features
	•	Centered UI elements on all screens
	•	Data Binding used for UI updates
	•	One-Activity structure with multiple fragments or views
	•	Simple navigation flow from Start → Q1 → Q2 → Q3 → Result

⸻

📜 Notes
	•	App designed strictly following assignment rules.
	•	Questions are customizable by the developer.
	•	Robustness ensured: submit/finish buttons correctly navigate and show final result.

⸻

