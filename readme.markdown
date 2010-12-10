This repository contains the Austin Code Dojo CyberPoker project. 

Setting up your development environment
---------------------------------------
The CyberPoker project is Mavenized, so if you're using Eclipse, you can
install the [m2eclipse plugin](http://m2eclipse.sonatype.org) and import the
Maven project after cloning the repository. Note that we depend on some
artifacts that are themselves not Mavenized, so until you install those
dependencies, you won't be able to build. These dependencies can all be found
in the prebuilt directory, in subdirectories by the groupId we refer to them
in the CyberPoker poms. The install-prebuilts.sh script will install the
prebuilt dependencies into your local maven repository for you, assuming that
you have a bash-y shell and that Maven is on your path.

About the Austin Code Dojo
--------------------------

The Austin Code Dojo is a group of software craftsman who get together on a
biweekly basis to practice the software craft through Katas and side projects.

For more information, check out the [Google
Group](http://groups.google.com/group/austin-code-dojo).
