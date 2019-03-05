package com.enrol

class Course{

String department
String courseTitle
Lecturer courseLeader
String courseCode
Date startDate
Date endDate
String description
int numberOfStudents
double tuitionFees
String studyMode
static hasMany = [lecturers:Lecturer, students:Student, modules:Module]


String toString(){

return courseTitle
}

static contraints = {

courseTitle nullable:false
courseTitle blank:false
department nullable:false
department blank:false
courseLeader nullable:false
courseLeader blank:false
courseCode nullable:false
courseCode blank:false
numberOfStudents nullable:false
numberOfStudents blank:false
numberOfStudents minSize:20
numberOfStudents maxSize:60
startDate nullable:false
startDate blank:false
endDate nullable:false
endDate blank:false
studyMode nullable:false
studyMode blank:false
studyMode length:20
description nullable:false
description blank:false
description maxSize:5000
description widget: 'textarea'
tuitionFees nullable:false
tuitionFees scale:2









}
}
