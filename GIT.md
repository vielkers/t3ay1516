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

Things to Remember:
* NEVER edit the master branch
* Always remember which branch you are on
* The current branch you are on is marked with asterisk and colored differently

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

## Pushing to Remote Repository
1. Pushing to repository is on per branch basis
  * It is possible to push all branches you have, but we won't be doing that
2. Pushing means uploading commits that are not yet uploaded to the remote
3. To push, you need to indicate the remote name, and the branch you want to push to it

Syntax:
```
git push <remote> <branch>
```

Example:
```
git push origin master
git push origin ex2-bibera
```

## Updating Your Origin With Upstream
1. Your forked repository does not keep track of its upstream
2. To update your forked repository, make sure you did not push to your repository's master branch
3. Switch to master branch
4. Fetch for the latest changes in the upstream repository

```
git fetch upstream master
```

5. Update your project to include the fetched changes

```
git rebase upstream/master
```

6. At this point, your local repository is now updated to match the remote upstream
7. Push the master branch onto your remote repository

```
git push origin master
```

8. Your forked repository should now be on par with the upstream repository's master branch
  * This is the only instance where you should push to your forked repository's master branch