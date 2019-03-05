package com.enrol

class Lecturer {

String fullName
String post
String subject
String lecturerEmail
String office
String bio
Course theCourse
static hasMany = [modules:Module, courses:Course]
static belongsTo = [Course]

String toString(){

return fullName
}

    static constraints = {

fullName nullable:false
fullName blank:false
post nullable:false
post blank:false
subject nullable:false
subject blank:false
lecturerEmail nullable:false
lecturerEmail blank:false
lecturerEmail email:true
office nullable:false
office blank:false
bio nullable:false
bio blank:false
bio maxsize: 5000
bio widget: 'textarea'
theCourse nullable:true
theCourse blank:true


    }
}
