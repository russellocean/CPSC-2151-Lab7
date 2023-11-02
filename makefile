JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	ShuffleApp.java \
	ShuffleList.java \
	IShuffleList.java 

default: classes

classes: $(CLASSES:.java=.class)

run: classes
	java ShuffleApp

clean:
	$(RM) *.class