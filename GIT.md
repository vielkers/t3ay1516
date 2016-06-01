# Git Commands

## List all Remotes
```
git remote -v
```

## Creating New Remotes
```
git remote add <remote-name> <remote-url>
```

Example:
```
git remote add upstream https://github.com/lbyiet1/t3ay1516.git
```

* Remotes can be named with anything
* Common convention:
  * origin = a repository you created, or your forked version of a repository
  * upstream = If you forked, this is the repo where you forked from

## List all Branches
```
git branch
```
* The current branch you are on is marked with asterisk and colored differently

Things to Remember:
1. NEVER edit the master branch
2. Always remember which branch you are on

## Switching to a Different Branch
```
git checkout <branchname>
```

Example:
```
git checkout master
git checkout ex2-bibera
```

## Creating a New Branch
Similar to switching to an existing branch, but with an additional '-b'
```
git checkout -b <branchname>
```

Example:
```
git checkout -b ex3-reyes
```
Always make the branch name short, but expressive of what you are going to code / program

## Committing Changes
Notes:
1. Committing means saving the changes to your LOCAL repository
  * The commits exist only on your computer
2. Commits are written per branch, so make sure you know which branch you are currently on
3. Commits require two steps: (1) Adding files, and (2) committing

Adding Files:
```
git add <files to be committed>
```

Example:
```
git add Ex1.java Ex2.java
```

Committing:
```
git commit -s -m "Commit message" 
```

Example:
```
git commit -s -m "Implemented Ex1"
```