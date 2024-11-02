 select * from faculty;
 
 select * from course;
 select * from facultycourse;
 select * from faculty;
 
select c.name , count(fc.facultyId) isnull
from course c, facultyCourse fc
where c.id = fc.courseId
group by c.name
order by c.name
;

-- list name of courses where number of faculty assigned to those courses is zero
select c.name 
from course c
where c.id not in (select courseId from facultyCourse)
order by c.name
;

-- list the course name and number of students in all courses where there no assigned faculty 
select c.name, count(sc.studentId) as number_of_students
from course c, studentCourse sc
where c.id = sc.courseId and
c.id not in (select courseId from facultyCourse)
group by c.name
order by number_of_students desc, c.name;

-- 	list of total number of students that were enrolled in class during each school year student and year columns
select count( distinct studentId) as Students,
year(startDate) as  school_year
from studentCourse
group by year(startDate);

-- list of start date and total students who were enrolled in classes in august of each year
select startDate as Start_Date,
count( distinct studentId) as Total_Students
from studentCourse
where month(startDate)=8
group by startDate
order by Start_Date, Total_Students
;

-- list for student fname lname& no of courses they are taking in for majors
select s.firstName, s.lastname, 
count(c.id) as Number_of_Courses
from student s, course c, studentCourse sc
where s.id = sc.studentId
and sc.courseId = c.id
and s.majorId = c.deptId
group by s.id
order by Number_of_Courses desc,
        firstname, lastname
;

-- list fname, lname, avg progress of all students achiving avg progress of less then 50%

select s.firstname, s.lastname, round(avg(sc.progress),1) as Average_Progress
from student s, studentCourse sc
where s.id = sc.studentId
group by s.id
having avg(sc.progress) < 50
order by Average_Progress desc, s.firstname, lastname
;

-- list each course name and avg progress of students in that course
select c.name, round(avg(sc.progress),1) as Average_progress
from studentCourse sc, course c
where sc.courseId = c.id
group by c.name
order by Average_progress desc, c.name
;

-- list of course name with highest avg progress

select avg(progress), courseId from studentcourse
group by courseId
order by avg(progress) desc;

select c.name, round(avg(sc.progress),1) as Average_progress
from studentCourse sc, course c
where sc.courseId = c.id
group by c.name
having sc.progress = max(progress)
order by Average_progress desc, c.name
;

select name, max(Average_progress) from
(select top round(avg(sc.progress),1) as Average_progress
from studentCourse sc, course c
where sc.courseId = c.id
and c.name = name
group by c.name 
order by Average_progress desc) as tab1
group by name;
-- having Average_progress = max(Average_progress);

select * from studentCourse
having progress = max(progress)
;








 