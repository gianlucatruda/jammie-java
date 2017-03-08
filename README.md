# Jammie Java

A collection of helpful tools for Java development as a University of Cape Town CompSci student.

## What?

This project aims to be a collaborative and actively updated repository for UCT students, by UCT students. It contains commonly recurring code segments that will help students focus on the goal of their coding project or assignment and not be derailed by bugs or anti-patterns in the ancillary code of their program.

It also aims to be a safe and encouraging space for students to get to grips with Git and collaborative work — with a view to engaging in the open source community in the future.

<b>This project does not provide solutions to assignments, nor is it a resource for copying and pasting code!</b>
For more information on what is and is not permitted, please see the CSC department's [plagiarism policy](https://github.com/gianlucatruda/jammie-java/blob/master/csc-plagiarism-policy.pdf).

All code found here already exists in some form or another on the web, but is built and archived here for consistency and time efficiency.

Simply using this code will not make you a good programmer or a good computer scientist; but forking the repo, getting immersed, and pushing valued changes will help make you an excellent one.

## How?

Clone or fork the repo from the master branch.
```
$ git clone https://github.com/gianlucatruda/jammie-java.git
```

Use the classes to help accelerate your development for assignments, hackathons, or personal projects.

If you copy any code directly, please add the following comment to the section of code:
```
/** This code is in collaboration with the Jammie Java Project.
* github.com/gianlucatruda/jammie-java
* If you feel this code should not be here, please contact
* the project administrators.
*/
```

## Why?

1. UCT assigns comprehensive and detailed assignments from the second half of 1st year, through 2nd and 3rd year. These often require ancillary code to perform functions (like text input/output and makefiles) that are not related to the core goal of the exercise. Many students simply copy and paste some code from Stack Exchange. Many more spend hours fixing small bugs related to this ancillary code and cannot focus sufficient time on the exercise itself.

2. UCT attempts to incorporate version control (Git) into the syllabus from 2nd year, but (due to the nature of academic assignments and project scale) this is insufficient to provide enough practice to prepare students for the workplace or for collaborative work. This is not the fault of UCT or its staff, but a consequence of the academic model. This project aims to help students develop those skills, but incentivises it through relating the work to their assignments.

## Who?

UCT students and staff are welcome to use and contribute to this codebase. The project also aims to provide a resource for those who cannot afford to attend world-class institutions like UCT to learn and develop the skills required. Those who make valid pull requests from outside the UCT community will certainly be considered.

## How can I help?

The project is only just starting out. If you wish to collaborate, please email a short description of yourself and your experience level to trdgia001@myuct.ac.za and we'll be in touch.

## Contributors' Notes

The project makes use of [Git Flow](http://danielkummer.github.io/git-flow-cheatsheet/), a set of git extensions.
As a result, new features will be on a branch titled "<i>feature/my-new-feature</i>" and all code must merge into the <i>develop</i> branch, then be checked before it is finally merged to the <i>master</i> branch for distribution.

The use of [IntelliJ](https://www.jetbrains.com/idea/) IDE is recommended.

Tab indentation is used (IntelliJ defaults), with other conventions as described [here](http://www.oracle.com/technetwork/java/javase/documentation/codeconventions-136091.html).

If you don't know where to start contributing, have a look at the listed [issues and suggestions](https://github.com/gianlucatruda/jammie-java/issues) for inspiration. Anything tagged <i>help wanted</i> is free game, but please comment that you are taking on that project so that nobody clashes with you and does unnecessary work.

Clone the repo, make sure Git Flow is installed and configured (all default settings) and then make your new branch with
```
$ git flow feature start MYFEATURE
```

Build your feature and push changes regularly to your branch:
```
$ git push origin feature/MYFEATURE
```

Once you are done, submit a pull request [here](https://github.com/gianlucatruda/jammie-java/pulls) comparing your feature branch to the <i>develop</i> branch. The reviewing and discussion then begins.

For more detail on the development process, check out [this illustrated guide](https://guides.github.com/introduction/flow/).
