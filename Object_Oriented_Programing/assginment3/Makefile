OBJECTS = main.o mathTeacher.o footballer.o person.o

CC = g++
CFLAGS = -c
TARGET = main

$(TARGET): $(OBJECTS)
	$(CC) -o $(TARGET) $(OBJECTS)

clean:
	rm -f $(OBJECTS) $(TARGET)

main.o: main.cpp
mathTeacher.o: mathTeacher.cpp
footballer.o: footballer.cpp
person.o: person.cpp
