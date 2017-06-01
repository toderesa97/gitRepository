# Practising with git

## What is git?

Git is a helpful tool to keep track of our files in a project. Instead of copying files to test if a 
new feature is going to work, we can branch, and that means creating our 'developing' 
path, so we don't push to the master branch without being sure what we've done. It's supposed that the master branch
contains the last version (and obviously it must work) of our software.

This is a repository which will be used to practice the git methodology. I'll be using IntelliJ and the VCS (Version control Software),
mostly known as GIT.

##### Commands

```
git status      # Retrieve the current status (if a file has been modified, or nothing to commit...)
git log -n      # Retrieve the last n transactions(commits) we've done. Argument n is not necessary you can just
type git log.
```
Be careful with this last command. If you have done lots of 'transactions' and you execute this command
in the terminal (especially on GitBash - for Windows), it's going to be a mess. Instead redirect the output to a file using the redirection operator,
as follows...

``$ git log > log_file.txt``

If this command is run on OS based on UNIX you should enter to VIM (VI IMproved) terminal text editor. To exit type 
``:q``  or  ``:wq`` if you entered on VI.

Continuing with the commands...

```
git add <files>           # Adding files to be committed
git commit <file(s)>      # Commit the added files
```
You will be redirected to VI editor in order to add a message of the selected file(s). That's a good practice 
because it allows you to add specific information depending of the file. If you want to commit everything just type
``$ git commit -am "committing everything with this message"``
```
git push        # Push to the repository
```

If you executed the last command you will get an error because your computer does not know who you are. In order
to push (send to your remote repository) there are an useful command.

``$ git remote -v``, and the output should be something similar to:

```
origin  https://github.com/toderesa97/gitRepository.git (fetch)

origin  https://github.com/toderesa97/gitRepository.git (push)
```
The important thing here is the first column, which represents the name of your remote. 

Another important thing we must take into account is the branches. You can execute ``$ git branch``
to see your branches (if it's a new repository you'll have just the **master** branch lead by an asterisk)

Note: asterisk (*) indicates you in what branch are you working on.

Now to push, execute:

``$ git push <remote> <branch>`` in our case ``$ git push origin master``. You will be asked for your github credentials. 

```
git branch      # See the actual branches
git branch <n>  # Creates a branch with name n from the actual branch where the command is executed (creates a copy)
git clone <url> # Clones a repository from _url_ into the directory where is being executed (grab from server the repository and *paste* it into your computer)
```

Also it's very helpful to add a file called ``.gitignore``. This file contains all the extensions we don't want
to keep track of. Examples of these files could be: the .xml, .iml, .class ... Files that are generated by your IDE.
So instead of selecting the files you want to commit, which will make you waste time, you can add this file.

This file should be something similar to:

```
# Created by .ignore support plugin (hsz.mobi)
### Java template
# Compiled class file
*.class

# Log file
*.log

# BlueJ files
*.ctxt

# Mobile Tools for Java (J2ME)
.mtj.tmp/

# Package Files #
*.jar
*.war
*.ear
*.zip
*.tar.gz
*.rar

# virtual machine crash logs, see http://www.java.com/en/download/help/error_hotspot.xml
hs_err_pid*

# Extensions added by me
*.xml
*.iml

```

Note: ``*.extension`` is a regular expression that matches **all files regardless their names** with extension ``.extension``.
