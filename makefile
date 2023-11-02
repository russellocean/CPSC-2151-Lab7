JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	cpsc2150/listDec/ShuffleApp.java \
	cpsc2150/listDec/ShuffleList.java \
	cpsc2150/listDec/IShuffleList.java 

default: classes

classes: $(CLASSES:.java=.class)

run: classes
	java cpsc2150.listDec.ShuffleApp

clean:
	$(RM) *.class