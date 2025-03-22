# 📖 Understanding MVC, MVP, MVVM, and MVI: A 🔍 Comparative Guide

## 📌 Introduction

Software architecture plays a crucial role in building scalable and maintainable applications. This guide explores four popular architectural patterns—**MVC (Model-View-Controller), MVP (Model-View-Presenter), MVVM (Model-View-ViewModel), and MVI (Model-View-Intent)**—detailing their history, purpose, advantages, and drawbacks.

---

## 📖 Table of Contents

- [Model-View-Controller (MVC)](#model-view-controller-mvc)
- [Model-View-Presenter (MVP)](#model-view-presenter-mvp)
- [Model-View-ViewModel (MVVM)](#model-view-viewmodel-mvvm)
- [Model-View-Intent (MVI)](#model-view-intent-mvi)
- [Comparison](#comparison)
- [References](#references)

---

## 📌 Model-View-Controller (MVC)

### 🔹 When & Who Introduced It?

- Introduced in **the late 1970s** by **Trygve Reenskaug** at **Xerox PARC** while working on Smalltalk-76.

### 🔹 Why Was It Introduced?

- **Problem with previous approaches**: UI logic and business logic were tightly coupled.
- **Solution**: MVC separates concerns, making applications more maintainable and scalable.

### 🔹 Components

1. **Model** – Handles data and business logic.
2. **View** – Displays UI and interacts with the user.
3. **Controller** – Manages input and updates the Model.

### ✅ Merits

✔️ Clear separation of concerns.  
✔️ Promotes parallel development.  
✔️ Enhances code reusability.

### ❌ Demerits

❌ Tight coupling between View and Controller.  
❌ Controllers can become complex in large applications.

### 🔗 GitHub Repositories

1. [Android Clean Architecture](https://github.com/android10/Android-CleanArchitecture)
2. [Google Android Architecture Samples](https://github.com/googlesamples/android-architecture)
3. [repo 1 ](https://github.com/spdobest/MVC_MVP_MVVM)
4. [repo 2 ](https://github.com/saksham24/Android-simple-MVI-pattern-with-MVP-MVVM-collaboration)

---

## 📌 Model-View-Presenter (MVP)

### 🔹 When & Who Introduced It?

- Evolved from MVC in the **1990s** to improve testability and separation of concerns.

### 🔹 Why Was It Introduced?

- **Problem with MVC**: Controllers became too complex.
- **Solution**: MVP offloads logic to Presenters, making Views passive.

### 🔹 Components

1. **Model** – Handles data and business logic.
2. **View** – Displays UI and forwards events to the Presenter.
3. **Presenter** – Acts as a middleman, updating the View and Model.

### ✅ Merits

✔️ Better separation of concerns than MVC.  
✔️ Improved unit testability.  
✔️ Views remain lightweight.

### ❌ Demerits

❌ Presenters can become bloated.  
❌ Requires more boilerplate code.

### 🔗 GitHub Repositories

1. [Android MVP Example](https://github.com/antoniolg/androidmvp)
2. [Google Android Architecture Samples](https://github.com/googlesamples/android-architecture)

---

## 📌 Model-View-ViewModel (MVVM)

### 🔹 When & Who Introduced It?

- Introduced by **Microsoft in 2005** for **WPF applications**.

### 🔹 Why Was It Introduced?

- **Problem with MVP**: Presenters often contained too much logic.
- **Solution**: MVVM introduced ViewModel, enabling data binding and reducing direct UI manipulation.

### 🔹 Components

1. **Model** – Business logic and data handling.
2. **View** – Displays UI and binds data from ViewModel.
3. **ViewModel** – Manages UI-related data and communicates with the Model.

### ✅ Merits

✔️ Cleaner separation of concerns than MVP.  
✔️ Easy to test as ViewModel has no UI reference.  
✔️ Works well with data-binding frameworks.

### ❌ Demerits

❌ Can introduce complexity with data binding.  
❌ Memory leaks if ViewModel is not managed properly.

### 🔗 GitHub Repositories

1. [Google MVVM Sample](https://github.com/googlesamples/android-architecture-components)
2. [MVVM with Kotlin](https://github.com/erikjhordan-rey/KotlinMVVM)

---

## 📌 Model-View-Intent (MVI)

### 🔹 When & Who Introduced It?

- Gained popularity with **reactive programming** and **unidirectional data flow** concepts.

### 🔹 Why Was It Introduced?

- **Problem with MVVM**: Complex state management and potential data inconsistency.
- **Solution**: MVI enforces **predictable state changes** using a **single source of truth**.

### 🔹 Components

1. **Model** – Represents state and handles business logic.
2. **View** – Displays the UI and listens for state changes.
3. **Intent** – Captures user actions and updates Model accordingly.

### ✅ Merits

✔️ Ensures predictable state changes.  
✔️ Aligns well with reactive programming.  
✔️ Makes debugging easier with unidirectional data flow.

### ❌ Demerits

❌ Higher learning curve.  
❌ More boilerplate code than MVVM.

### 🔗 GitHub Repositories

1. [MVI Example](https://github.com/STAR-ZERO/MVIExample)
2. [Kotlin Coroutines + MVI](https://github.com/Spikeysanju/EzeePlayer)

---

## 📅 Timeline of Architectural Evolution

| Architecture | Year Introduced |
| ------------ | --------------- |
| **MVC**      | 1979            |
| **MVP**      | 1996            |
| **MVVM**     | 2005            |
| **MVI**      | 2017            |

## 📊 Comparison

| Architecture | Separation of Concerns | Testability | Complexity | Data Flow      |
| ------------ | ---------------------- | ----------- | ---------- | -------------- |
| **MVC**      | Moderate               | Low         | Moderate   | Bidirectional  |
| **MVP**      | Good                   | High        | Moderate   | Bidirectional  |
| **MVVM**     | Very Good              | High        | High       | Bidirectional  |
| **MVI**      | Excellent              | Very High   | Very High  | Unidirectional |

---

## 📚 References

- [Trygve Reenskaug's MVC History](https://folk.universitetetioslo.no/trygver/themes/mvc/mvc-index.html)
- [Google Android Architecture Guide](https://developer.android.com/jetpack/guide)
- [repo 1 ](https://github.com/spdobest/MVC_MVP_MVVM)
- [repo 2 ](https://github.com/saksham24/Android-simple-MVI-pattern-with-MVP-MVVM-collaboration)

---

## 🎯 Conclusion

Each architectural pattern has its strengths and weaknesses. **MVC and MVP** are simpler but less scalable, while **MVVM and MVI** provide better state management but require a learning curve. Choosing the right architecture depends on project needs and developer experience.

---

💡 **Found this guide helpful?** Give it a ⭐ on GitHub! 🚀
