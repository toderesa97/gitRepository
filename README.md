# Practising with git

## What is git?

Git is a helpful tool to keep track of our files in a project. Instead of copying files to test if a 
new feature is going to work, we can branch, and that means creating our 'developing' 
path, so we don't push to the master branch without being sure what we've done. It's supposed that the master branch
contains the last version (and obviously it must work) of our software.

This is a repository which will be used to practice the git methodology. I'll be using IntelliJ and the VCS (Version control Software),
mostly known as GIT.

##### TODO

1.Practise with basic commands such as...

```
git status      # Retrieve the current status (if a file has been modified, or nothing to commit...)
git log -n      # Retrieve the last n transactions(commits) we've done. Argument n is not necessary you can just
type git log.
```
Be careful with this last command. If you have done lots of 'transactions' and you execute this command
in the terminal (especially on GitBash - for Windows), it's going to be a mess. Instead redirect the output to a file using the redirection operator,
as follows...

``$ git log > log_file.txt``

If this command is run on OS based on UNIX you should enter to VIM terminal text editor. To exit type 
``:q``  or  ``:wq`` if you entered on VI.

Continuing with the commands...

```
git add <files> # Adding files to be committed
git commit      # Commit the added files
git push        # Push to the repository     
git branch      # See the actual branches
git branch <n>  # Branch with name n from the actual branch where the command is executed (creates a copy)
git clone <url> # Clones a repository from _url_ into the directory where is being executed
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

