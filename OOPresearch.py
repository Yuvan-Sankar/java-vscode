# Class representing one student
class Student:
    def __init__(self, name):
        self.name = name
        self.grades = []
    def add_grade(self, grade):
        self.grades.append(grade)

    # Method to get average of student's grades
    def avgcalc(self):
        if len(self.grades) == 0:
            return 0

        return sum(self.grades) / len(self.grades)

    # Method to display the student's info
    def display_info(self):
        print(f"Student Name: {self.name}")

        if len(self.grades) == 0:
            print("Grades: No grades entered")
        else:
            print("Grades:", end=" ")
            for grade in self.grades:
                print(grade, end=" ")
            print()

        print(f"Average: {self.avgcalc():.2f}")
        print()


# Class representing the gradebook
class Gradebook:
    def __init__(self):
        self.students = []

    # Method to add a student
    def add_student(self, name):
        student = Student(name)
        self.students.append(student)
        print("Student added successfully.")

    # Method to find a student
    def find_student(self, name):
        for student in self.students:
            if student.name == name:
                return student
        return None

    # Method to add multiple grades to a student
    def add_grades(self, name, grades):
        student = self.find_student(name)

        if student is None:
            print("Student not found.")
            return

        for grade in grades:
            student.add_grade(grade)

        print("Grades added successfully.")

    # Method to display all students and their averages
    def display_all(self):
        if len(self.students) == 0:
            print("No students in the gradebook.")
            return

        print("\n--- All Students and Averages ---")
        for student in self.students:
            student.display_info()


# Main program
def main():
    gradebook = Gradebook()

    # Keep showing the menu until the user chooses to exit
    while True:
        print("\n--- Student Gradebook Manager ---")
        print("1. Add Student")
        print("2. Enter Grades for Student")
        print("3. Display All Students and Averages")
        print("4. Exit")

        choice = input("Enter your choice: ")

        if choice == "1":
            name = input("Enter student name: ")
            gradebook.add_student(name)

        elif choice == "2":
            name = input("Enter student name: ")

            # Check whether the student exists first
            student = gradebook.find_student(name)

            if student is None:
                print("Student not found.")
            else:
                count = int(input("How many grades do you want to enter? "))
                grades = []

                for i in range(count):
                    grade = float(input(f"Enter grade {i + 1}: "))
                    grades.append(grade)

                gradebook.add_grades(name, grades)

        elif choice == "3":
            gradebook.display_all()

        elif choice == "4":
            print("Exiting program.")
            break

        else:
            print("Invalid choice. Please try again.")

# Runs the program
main()
