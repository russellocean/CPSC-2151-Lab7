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
	java cpsc2150.listDec.ShuffleApp

clean:
	$(RM) *.class