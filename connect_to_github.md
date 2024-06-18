
HASAKI@DESKTOP-DT4IBET MINGW64 /d/ha
$ git clone hhttps://github.com/gazzachenry/first-java.git
Cloning into 'first-java'...
fatal: protocol 'https' is not supported

HASAKI@DESKTOP-DT4IBET MINGW64 /d/ha
$ git clone https://github.com/gazzachenry/first-java.git
Cloning into 'first-java'...
fatal: protocol 'https' is not supported

HASAKI@DESKTOP-DT4IBET MINGW64 /d/ha
$ git clone https://github.com/gazzachenry/first-java.git
Cloning into 'first-java'...
warning: You appear to have cloned an empty repository.

HASAKI@DESKTOP-DT4IBET MINGW64 /d/ha
$ ls
first-java/

HASAKI@DESKTOP-DT4IBET MINGW64 /d/ha
$ cd first-java/

HASAKI@DESKTOP-DT4IBET MINGW64 /d/ha/first-java (main)
$ ls

HASAKI@DESKTOP-DT4IBET MINGW64 /d/ha/first-java (main)
$ git add .
warning: in the working copy of 'GFG (1).java', LF will be replaced by CRLF the next time Git touches it

HASAKI@DESKTOP-DT4IBET MINGW64 /d/ha/first-java (main)
$ git commit -m " first commit"
Author identity unknown

*** Please tell me who you are.

Run

  git config --global user.email "you@example.com"
  git config --global user.name "Your Name"

to set your account's default identity.
Omit --global to set the identity only in this repository.

fatal: unable to auto-detect email address (got 'HASAKI@DESKTOP-DT4IBET.(none)')

HASAKI@DESKTOP-DT4IBET MINGW64 /d/ha/first-java (main)
$ ^C

HASAKI@DESKTOP-DT4IBET MINGW64 /d/ha/first-java (main)
$ ^[[200~  git config --global user.email "you@example.com"
bash: $'\E[200~': command not found

HASAKI@DESKTOP-DT4IBET MINGW64 /d/ha/first-java (main)
$ git config --global user.email "letrungtin5659@gmail.com"

HASAKI@DESKTOP-DT4IBET MINGW64 /d/ha/first-java (main)
$ ^C

HASAKI@DESKTOP-DT4IBET MINGW64 /d/ha/first-java (main)
$  git config --global user.name "gazzachenry"

HASAKI@DESKTOP-DT4IBET MINGW64 /d/ha/first-java (main)
$ git commit -m " first commit"
[main (root-commit) 32e7d97]  first commit
 1 file changed, 99 insertions(+)
 create mode 100644 GFG (1).java

HASAKI@DESKTOP-DT4IBET MINGW64 /d/ha/first-java (main)
$ git push
Enumerating objects: 3, done.
Counting objects: 100% (3/3), done.
Delta compression using up to 8 threads
Compressing objects: 100% (2/2), done.
Writing objects: 100% (3/3), 1.05 KiB | 1.05 MiB/s, done.
Total 3 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
To https://github.com/gazzachenry/first-java.git
 * [new branch]      main -> main

HASAKI@DESKTOP-DT4IBET MINGW64 /d/ha/first-java (main)
$
