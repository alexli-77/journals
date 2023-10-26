## Tests from Traces: Automated Unit Test Extraction for R



[Tests from Traces: Automated Unit Test Extraction for R](https://www.researchgate.net/profile/Filip-Krikava/publication/325819378_Tests_from_Traces_Automated_Unit_Test_Extraction_for_R/links/5b2799a7a6fdcc1c72b8fe24/Tests-from-Traces-Automated-Unit-Test-Extraction-for-R.pdf)



### What is this Paper about?

---

1. This paper **looks into** how well unit tests for a target software package can be extracted from the execution traces of client code.

2. **Our objective** is to reduce the effort involved in **creating test suites** while **minimizing** the number and size of individual tests, and **maximizing** coverage.

### Contributions

---

1. The **contributions** of this paper are **the description of a tool**, Genthat, for automatically extracting unit tests for R, as well as **an empirical evaluation** of that tool that demonstrates that for a large corpus, 1,545 packages, it is possible to significantly improve code coverage.

### How

---

1.  Our **approach** is as follows: For each project and its reverse dependencies, **gather all runnable artifacts**, be they test cases or examples, that may exercise the target, run the artifacts in an environment that records execution traces, and from those traces produce unit tests and, if possible, minimize them, keeping only the ones that increase code coverage.

### Genthat Overview

---

1. **Install:** given a target package, the package is downloaded from CRAN and installed in the current R environment. Furthermore, any package in CRAN that transitively depends on the target package is also acquired. 
2. **Extract:** executable code is extracted from the examples and vignettes in the installed packages. Target package functions that are to be tested are instrumented. Depending on which option is selected, either the public API functions or the private ones are decorated. All executable artifacts are turned into scripts. Each script is a self-contained runnable file. 
3. **Trace:** for each script, run that script and record trace information. From these traces generate unit tests for all calls to target functions. 
4. **Check:** all unit tests are checked for validity and correctness. Valid tests are those that execute without error. Correct ones are those that return the expected result. Invalid and incorrect tests are discarded. Code coverage data is recorded for the tests that are retained. 
5. **Minimize:** optionally, minimize the test suite. Minimization uses simple heuristics to discard tests that do not increase code coverage. Coverage being equal, tests that are, textually, smaller are preferred.



### Evaluation

---

#### Dataset

They selected **1,700 packages from CRAN**. We picked the **100 most downloaded packages** from RStudio CRAN mirror including their dependencies and then **1000 random selected CRAN packages**, again including their dependencies. **This added up to some 1,726 packages**.



### Results

---

1. We have presented the **design, implementation and evaluation of Genthat**, a tool for the **automated extraction of unit tests** for the **R language**
2. Our **evaluation** of Genthat on a **large corpus of packages** suggests that it can significantly **improve coverage of the code** being tested.



### Related Work

---

1. capture objects that can be used as inputs of tests [6].
2.  Joshi and Orso describe the issues of capturing state for Java programs [7].



### Interesting work

---

1. Gregor Richards, Andreas Gal, Brendan Eich, and Jan Vitek. 2011. Automated Construction of JavaScript Benchmarks. In Conference on Object-Oriented Programming Systems, Languages and Applications (OOPSLA). https://doi.org/10. 1145/2048066.2048119
2. 