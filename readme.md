# Java Threads & Concurrency

![Java](https://img.shields.io/badge/Java-JDK%208+-ED8B00?style=flat&logo=openjdk&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-blue?style=flat)
![Stars](https://img.shields.io/github/stars/Minokainduwara/Java-Threads?style=flat)

A hands-on Java repository covering core multithreading and concurrency concepts — from thread creation to deadlocks. Built for developers who want to understand not just *how* threads work, but *what goes wrong* and why.

---

## Contents

- [Overview](#overview)
- [Concepts Covered](#concepts-covered)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
- [Key Diagrams](#key-diagrams)
- [Where This Applies](#where-this-applies)
- [Contributing](#contributing)

---

## Overview

Multithreading is essential for building scalable, high-performance applications. This repository walks through the fundamentals of Java concurrency with practical, runnable examples — including the real-world pitfalls that trip up even experienced developers.

---

## Concepts Covered

### Thread Creation
- Extending `Thread` vs implementing `Runnable`
- Difference between `start()` and `run()`

### Thread Scheduling
- How the JVM and OS schedule threads
- Thread priorities and context switching
- Non-deterministic execution behavior

### Synchronization
- Race conditions and thread interference
- `synchronized` methods and blocks
- Critical section handling and thread safety

### Deadlocks
- What causes a deadlock (all 4 conditions)
- Practical deadlock examples
- Strategies to detect and avoid them

---

## Project Structure

```
Java-Threads/
├── src/
│   └── com/
│       └── ThreadCreation/
│       ├── RaceCondition/
│       ├── Scheduling/
│       ├── Synchronization/
│       └── Deadlock/
└── README.md
```

---

## Getting Started

**1. Clone the repository**
```bash
git clone https://github.com/Minokainduwara/Java-Threads.git
```

**2. Open in your IDE**

Works with IntelliJ IDEA, VS Code, or Eclipse.

**3. Run any example**

Navigate to a class and run its `main()` method. Observe thread behavior in the console output.

**Quick example:**
```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Running: " + Thread.currentThread().getName());
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}
```

---

## Key Diagrams

### Race Condition vs Synchronization

```
❌ Without synchronization:

  Thread A ──────────┐
                     ▼
             Shared Resource  →  Data corruption
                     ▲
  Thread B ──────────┘

✅ With synchronization:

  Thread A ──► [LOCK 🔒] ──► Critical Section ──► Release
  Thread B ──► (waiting ⏳)
```

```java
synchronized void increment() {
    count++;
}
```

---

### Deadlock

```
  Thread A holds Lock 1 → waiting for Lock 2
  Thread B holds Lock 2 → waiting for Lock 1

  ──► Circular wait = deadlock 💀
```

A deadlock requires all four conditions to hold simultaneously:

| Condition | Description |
|---|---|
| Mutual Exclusion | Resource held by one thread at a time |
| Hold and Wait | Thread holds a resource while waiting for another |
| No Preemption | Resources can't be forcibly taken away |
| Circular Wait | Thread A waits on B, B waits on A |

---

### Thread Scheduling

```
Run 1:  Thread A → Thread B
Run 2:  Thread B → Thread A → Thread A
Run 3:  Thread A → Thread B → Thread A

Execution order is non-deterministic — controlled by JVM + OS.
```

---

## Where This Applies

- Backend APIs (Spring Boot, REST services)
- Operating systems and system programming
- Game development (game loops, physics engines)
- Distributed systems and microservices
- Any performance-critical application

---

## Contributing

Contributions are welcome.

1. Fork the repository
2. Create a branch: `git checkout -b feature/your-topic`
3. Commit your changes
4. Open a Pull Request

---

## License

This project is licensed under the [MIT License](LICENSE).

---

> If this helped you understand Java concurrency better, consider giving it a ⭐