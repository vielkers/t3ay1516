# Setting Up the Project

## Forking the Main Repository
1. Go to repository `https://github.com/lbyiet1/t3ay1516.git`
2. Make sure you are logged in, then fork the repository
3. Take note of the URL of your forked repository
  * It takes the form `https://github.com/<username>/t3ay1516.git`

## Cloning Your Fork
Syntax:
```
git clone https://github.com/<username>/<repo-name>.git
```
(The .git is optional)

Example:
```
git clone https://github.com/lbyiet1/t3ay1516.git
```

## Opening in IntelliJ
1. In IntelliJ, click on open, and select the directory t3ay1516
2. In the Project Window, expand on the folder
3. Right click on src folder > Mark Directory As > Sources Root
  * The folder should be colored blue
4. Right click on t3ay1516 in the Project Window, and select copy path
5. File > Project Structure > Modules
  1. Under Compiler Output, Select 'Use module compile output path'
  2. Ctrl + V on output path and test output path
  3. Add '/out' at the end of both output path and test output path
    * For Windows, use '\out' instead (Windows use backslash instead of '/')
  4. Press Apply/Ok
6. Configure which source code to run
7. Press "Run" (The Play Button)
  * Make sure all source code in the project are error-free, else the program will fail to run
8. 