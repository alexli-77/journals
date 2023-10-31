

## AmPyfier: Test amplification in Python

[AmPyfier: Test amplification in Python](https://www.researchgate.net/publication/362232883_AmPyfier_Test_amplification_in_Python)



### Introduction

---

- **Manually writing** a completely adequate test suite is a laborious and time-consuming task. This is where research concerning test amplification and generation proves to be useful
- **Test amplification** tries to harden a test suite against a given adequacy criterion, criteria, or engineering goal based on the already existing test suite for the project under test
- While test generation focuses only on the program under test, test amplification generates tests through modification or extension of the existing handwritten test suite.
- For **dynamically-typed** languages, test amplification techniques **cannot solely rely on static analysis**.



### Contribution

---

- **Extend the concept of test amplification to Python**, one of the most popular (dynamically typed) languages today according to IEEE† and on Github
- Present **AmPyfier**
- Introduce **multi-metric selection** in order to increase the efficiency of the mutation score as a selection criterion



### Implementation

---

- The main algorithm is inspired by the work of DSpot, with the addition of dynamic type profiling inspired by Small-Amp and multi-metric selection
- Assertion Amplification
- Type Profiler：the type profiler exploits the fact that it is possible to extract type information dynamically by executing the existing test suite.
- Input Amplification
- Multi-Metric Selection：AmPyfier introduces multi-metrics selection: the usage of code coverage along with mutation testing and dynamic generation of new mutants for newly covered code.



### Evaluation

---

- AmPyfier has been evaluated on 54 test classes belonging to 11 projects from Github.

- This paper randomly selected 11 projects with recent commits from varying **popularity, size, coverage, and mutation score**. 



### Interesting Parts

---

- **DSpot** : a test amplification tool for the statically-typed language Java,DSpot and Small-Amp both **rely on mutation score** as the adequacy criterion to improve the test suite against.
- **The goal of test amplification** is to improve the test suite in regard to a quantifiable engineering goal, expressed as a metric. In both DSpot and Small-Amp the same adequacy criterion is used as metric for the selection of generated test methods, **namely the mutation score**. Both tools generate lots of new test methods derived from the existing test suite. **The mutation score is calculated for each newly generated test method**. If it is able to improve it, the generated test method is selected as an amplified test method, otherwise, it is discarded.





