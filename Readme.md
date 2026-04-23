# Java OOP — From Zero to Thinking in Objects

A personal deep-dive into Object-Oriented Programming with Java.  
55 programs. 10 topic areas. Written, broken, debugged, and understood — one at a time.

---

## Why This Exists

I wanted to actually understand OOP — not just pass through it.  
So I built everything from scratch: no copying, no skipping, no hand-waving through the hard parts.

This repo is the paper trail of that process.

---

## What's Inside

### Set 1 — Java Fundamentals
Getting comfortable with the language itself before thinking about objects.  
Unit conversions, Cramer's rule solver, ATM cash dispenser, BMI calculator, triangle area with Heron's formula, digit manipulation, command-line arguments.

### Set 2 & 3 — Core OOP Concepts
Where the mental model shift happens.  
Classes, objects, constructors, method overloading, `this` keyword, static vs instance, access modifiers — the building blocks of everything that follows.

### Set 4 — Inheritance
Extending behaviour without rewriting it.  
Single, multilevel, and hierarchical inheritance. Method overriding. The `super` keyword. Understanding what actually gets inherited and what doesn't.

### Set 5 — Interfaces & Abstract Classes
The design layer of OOP.  
When to use an abstract class vs an interface, and why the distinction matters more than most tutorials admit. Polymorphic references. Runtime behaviour through compile-time contracts.

### Set 6 — Exception Handling
Writing code that fails gracefully.  
Checked vs unchecked exceptions. `try-catch-finally`. Custom exception classes. The difference between handling an exception and hiding one.

### Set 7 — Concurrency & Threads
Where Java gets genuinely hard.  
Thread lifecycle, `Runnable` vs extending `Thread`, synchronization, race conditions — and what happens when you get it wrong.

### Set 8 — File I/O
Reading and writing the real world.  
Byte streams, character streams, buffered I/O, and working with the filesystem. Serialization basics.

### Set 9 — Collections Framework
Java's data structures, done right.  
`ArrayList`, `LinkedList`, `HashMap`, `HashSet`, `TreeMap`, iterators, generics, and choosing the right structure for the problem.

### Set 10 — JavaFX
Putting a face on it.  
Event-driven GUI programming. Scene graphs, controls, layouts, and event handlers — where OOP concepts like inheritance and interfaces suddenly become very visible.

---

## Repo Structure

```
java-oop/
├── set-01-fundamentals/
├── set-02-oop-basics/
├── set-03-oop-continued/
├── set-04-inheritance/
├── set-05-interfaces-abstract/
├── set-06-exception-handling/
├── set-07-concurrency/
├── set-08-file-io/
├── set-09-collections/
└── set-10-javafx/
```

Each folder contains numbered `.java` files with a comment block at the top explaining what the program does and what concept it demonstrates.

---

## How to Run Any Program

**Requires:** Java 17+ (or Java 11 minimum)

```bash
# Compile
javac FileName.java

# Run
java FileName

# For programs that use command-line arguments
java FileName arg1 arg2
```

For JavaFX programs, you'll need the JavaFX SDK:
```bash
javac --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls FileName.java
java --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls FileName
```

---

## What I Actually Learned

The programs are the easy part to write down. The harder things to capture:

- **OOP is a design discipline first, a syntax second.** Inheritance misused creates more problems than it solves. Interfaces are how you build systems that survive change.
- **Threads are humbling.** Code that looks correct can be wrong in ways that only show up under load or on specific hardware.
- **The Collections Framework is worth studying as a design document**, not just a toolbox. How they implemented it teaches you more about interfaces and generics than any tutorial.
- **Exception handling is about intent.** Catching `Exception` everywhere is not handling errors — it's hiding them.

---

## What's Next

- Dive into design patterns (starting with Strategy, Observer, and Factory)
- Build something non-trivial using these concepts end-to-end
- Explore Spring to see how a real framework leverages OOP at scale

---

*55 programs down. The interesting part starts now.*
