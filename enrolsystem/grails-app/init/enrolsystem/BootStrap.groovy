package com.enrol

class BootStrap {

    def init = { servletContext ->
//define objects

//lecturer
def Jacky= new Lecturer(
fullName: 'Jacky Stallard',
post: 'Head',
subject: 'Wadi',
lecturerEmail: 'jacky@jacky.com',
office: '9404',
bio: 'jacky is ace'
).save()

def Tonderai= new Lecturer(
fullName: 'Tonderai Maswera',
post: 'Head',
subject: 'sys archs',
lecturerEmail: 'tonderai@tonderai.com',
office: '9506',
bio: 'yaaassss'
).save()

def Lynne= new Lecturer(
fullName: 'Lynne Dawson',
post: 'Head',
subject: 'databases',
lecturerEmail: 'lynne@lynne.com',
office: '9365',
bio: 'yaaassss'
).save()

def computing=new Course(
department:'Computing',
courseCode: 'CS123',
courseTitle: 'BSc Hon Computing',
courseLeader: Jacky,
startDate:new Date ('09/09/2019'),
endDate: new Date ('07/07/2023'),
numberOfStudents: '55',
studyMode: 'FullTime',
tuitionFees: '9000.60',
description: 'bvdjhbjhgfdsjhgvd.'
).save()

def computerScience=new Course(
department:'Computing',
courseCode: 'CS122',
courseTitle: 'Computer Science',
courseLeader: Lynne,
startDate:new Date ('08/09/2019'),
endDate: new Date ('06/07/2023'),
numberOfStudents: '62',
studyMode: 'FullTime',
tuitionFees: '9000.60',
description: 'bvdjhbjhgfdsjhgvd.'
).save()

def games=new Course(
department:'Computing',
courseCode: 'CS121',
courseTitle: 'games',
courseLeader: Tonderai,
startDate:new Date ('10/09/2019'),
endDate: new Date ('09/07/2023'),
numberOfStudents: '59',
studyMode: 'FullTime',
tuitionFees: '9000.60',
description: 'bvdjhbjhgfdsjhgvd.'
).save()

//student
def student1=new Student(
studentName: 'Ben Yardley',
studentID: 'b1234567',
dob: new Date ('06/08/1999'),
isFundingAvailable: 'Yes',
studentEmail: 'Ben@ben.com',
studentUsername: 'benben',
studentPassword: 'benben',
course: computing
).save()

//student
def student2=new Student(
studentName: 'George Turner',
studentID: 'b2345678',
dob: new Date ('25/10/1998'),
isFundingAvailable: 'Yes',
studentEmail: 'george@george.com',
studentUsername: 'george',
studentPassword: 'george',
course: games
).save()

def student3=new Student(
studentName: 'Miles Waring',
studentID: 'b3456789',
dob: new Date ('20/06/1997'),
isFundingAvailable: 'Yes',
studentEmail: 'miles@miles.com',
studentUsername: 'miles',
studentPassword: 'miles',
course: computerScience
).save()




//module
def Wadi= new Module(
moduleTitle: 'Wadi',
moduleCode: 'M1234',
credits: '50',
lecturer: 'Jacky',
course: 'Computing',
description: 'yaas'
).save()

def sysarchs= new Module(
moduleTitle: 'sys archs',
moduleCode: 'M2345',
credits: '50',
lecturer: 'Tonderai',
course: 'Computing',
description: 'yaass'
).save()

def databases= new Module(
moduleTitle: 'databases',
moduleCode: 'M3456',
credits: '50',
lecturer: 'Lynne',
course: 'Computing',
description: 'yaasss'
).save()

Jacky.addToModules(Wadi)
Jacky.addToModules(databases)

games.addToLecturers(Tonderai)
computing.addToLecturers(Jacky)

Jacky.addToCourses(computing)
Tonderai.addToCourses(games)

games.addToStudents(student2)
games.addToStudents(student1)
games.addToStudents(student3)

Wadi.addToCourses(games)
databases.addToCourses(computing)

Wadi.addToStudents(student1)
databases.addToStudents(student2)

student1.addToModules(Wadi)
student2.addToModules(databases)








    }
    def destroy = {

//destroy app
    }
}
