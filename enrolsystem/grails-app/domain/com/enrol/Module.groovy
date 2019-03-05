package com.enrol

class Module {

String moduleTitle
String moduleCode
int credits
String lecturer
String description

static hasMany = [courses:Course, students:Student]
static belongsTo=[Course, Student]

String toString(){

return moduleTitle
}

    static constraints = {

moduleTitle nullable:false
moduleTitle blank:false
moduleCode nullable:false
moduleCode blank:false
credits nullable:false
credits blank:false
credits minsize:20
credits maxsize:120
lecturer nullable:false
lecturer blank:false
description nullable:false
description blank:false
description maxsize:5000
description widget: 'textarea'



    }
}
