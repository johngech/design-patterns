
# 🎯 **Memento Pattern (Behavioral Pattern)**

### **📌 Purpose**

The **Memento Pattern** is used to *capture and restore an object’s internal state* without exposing its internal details.
It helps implement *undo/rollback* functionality.

---

# 🧩 **Key Participants**

1. **Originator**

    * The object whose state needs to be saved and restored.

2. **Memento**

    * Stores the Originator’s state.

3. **Caretaker**

    * Requests saves, keeps mementos safe, and restores them when needed
    * **Does NOT** modify or inspect the mementos.

---

# 📊 **Graphical Representation (UML)**

```
+----------------+        +----------------+        +----------------+
|    Originator  |        |    Memento     |        |   Caretaker   |
+----------------+        +----------------+        +----------------+
| - state        |        | - state        |        | - mementos[]  |
+----------------+        +----------------+        +----------------+
| + createMemento()|----->|                |        | + save(...)   |
| + restore(m)    |<----- |                |<-------| + undo()      |
+----------------+        +----------------+        +----------------+
```

Flow:

1. Originator asks Memento to save its state.
2. Caretaker stores the Memento.
3. Caretaker gives a saved Memento back to the Originator to restore.

---

# 🧠 **Real-World Analogy**

Think of **Ctrl + Z (Undo)** in a text editor.
The editor saves snapshots of the text — *those are mementos*.
Pressing undo restores a previous snapshot.

---

# 💻 **Clear Example (Simple Code)**


---

## **🔹 Originator**

```python
class TextEditor:
    def __init__(self):
        self.text = ""

    def write(self, new_text):
        self.text = new_text

    def create_memento(self):
        return Memento(self.text)

    def restore(self, memento):
        self.text = memento.get_saved_text()
```

## **🔹 Memento**

```python
class Memento:
    def __init__(self, text):
        self._text = text     # protected: caretaker cannot access directly

    def get_saved_text(self):
        return self._text
```

## **🔹 Caretaker**

```python
class History:
    def __init__(self):
        self._mementos = []

    def save(self, memento):
        self._mementos.append(memento)

    def undo(self):
        if self._mementos:
            return self._mementos.pop()
        return None
```

---

## **🔹 Usage Example (Undo Functionality)**

```python
editor = TextEditor()
history = History()

editor.write("Version 1")
history.save(editor.create_memento())

editor.write("Version 2")
history.save(editor.create_memento())

editor.write("Version 3")  # No save here

print(editor.text)  # Output: Version 3

# Undo
editor.restore(history.undo())
print(editor.text)  # Output: Version 2

# Undo again
editor.restore(history.undo())
print(editor.text)  # Output: Version 1
```

---

# ✅ **Key Benefits**

* Allows easy **undo/rollback**.
* Keeps internal state **encapsulated**.
* Caretaker does not manipulate the state directly.

# ⚠️ Drawbacks

* May use **lots of memory** if the stored states are large or very frequent.

---
