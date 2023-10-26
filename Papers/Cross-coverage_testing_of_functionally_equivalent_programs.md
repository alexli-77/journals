## Cross-coverage testing of functionally equivalent programs



[Cross-coverage testing of functionally equivalent programs](https://arxiv.org/pdf/2304.14768)



### Conclusion

---

This paper provides noval concept into improving the coverage testing through cross-testing multiple programs with similar functionality.

The two motivations presented in this article are well-founded, and I have also encountered similar issues in my previous work. In my last job, we addressed these issues by having developers perform cross-testing, where different developers would contribute manually constructed test suites. However, this paper offers a new approach.

Regarding the verification part, in my view, this verification process is reproducible. It mentions that the programs used were obtained from the Zenodo database. Randoop was used to generate general test suites, while EvoSuit was applied to create coverage test cases for each method. I have downloaded their experimental scripts, the filter and collection strategies looks reusable. 


Regarding the visualization section, in terms of presenting experimental data, it could be useful to include more figures to illustrate the data. For instance, using pie charts or bar chart to show the distribution of various average gains mentioned in the paper would be helpful.



### Case Studies

---

The paper studied two research questions, primarily focused on whether cross-coverage test suite augmentation contributes to improving the thoroughness of a test suite and exposing missing functionalities.

The researchers employed a mixed-methods approach to gather data, including constructing program datasets using datasets from other articles and randomly generating generic test datasets using the Randoop tool.

The tool they used to observe test coverage is Jacoco. 

The primary objective of this case study was to explain how cross-coverage test suite augmentation is more effective in improving coverage testing by conducting quantitative analysis.



## Personal opinion

The paper clearly defines the research problem of whether we can leverage the information relative to code coverage of Q to improve the testing of P (or the vice versa) and breaks it down into two research questions. 

It provides a clear definition of the research subject cross-coverage testing. 

Secondly, it uses reliable and reusable data, partly from previous research and partly from testing tools. 

Thirdly, it provides two representative examples (in Chapter 2) to further illustrate the practical significance of the research. 

Fourthly, it offers ample information and arguments, making it easy for other researchers to replicate the study's findings. 

Fifthly, the authors acknowledge the threats to validity, including constraints related to the dataset and biases.



### Available tools

---

[Randoop](https://homes.cs.washington.edu/~mernst/pubs/pacheco-randoop-oopsla2007.pdf)
[Randoop github](https://randoop.github.io/randoop/)
[Evosuite](https://www.evosuite.org/wp-content/papercite-data/pdf/esecfse11.pdf)
[Evosuite website](https://www.evosuite.org/evosuite/)
[Zenodo - Dataset of Functionally Equivalent Java Methods](https://zenodo.org/records/5912689)

Defects4J repo - a collection of reproducible bugs ](https://github.com/rjust/defects4j) 

