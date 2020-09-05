# Java

This is the event management system developed using Java in Netbeans Ide. The complete description of this project can be found in https://github.com/nirajpoudel18/Java/blob/master/PrincipleOfProgramming.odt

## Task Description 

Consider the following scenario: 
 
University and campus life not only consists of lectures and practical / seminar sessions but also extra-curricular activities organised by students.  Such extracurricular activities may comprise, among others, reading groups, hacking sessions, seminars and talks discussing advanced topic in the field of study, excursions, peer-assisted sessions to help struggling students and also leisure activities.  Activities might take place physically or online, the latter with high importance in pandemic times.  Extra-curricular activities are organised by students for students, often without lecturer involvement.  
  
This project is the creation of a Java Desktop application to manage student-led activities at the university/school. To this end, the application collects the following event details: 
 
    • Title and description of the event 
    • Whether it’s an online or physical event 
    • In case of an online event: its URL 
    • In case of an external visit/excursion, the organistion and location
    • In case of a internal event: its location (campus and room number) 
    • Time and date of the event (repeat events should be possible, ie.. every Tuesday for 5 from calendar week 6 to week 11) 
    • Place limitations (e.g. up to 30 participants) 
    • Event organiser (s)
    • Whether a booking must be made
  
Students should be able to register on the system so that they can book or post events (given they have permission to do so). To register, they need to provide their name and student ID.  Once registered they need to login to use the system. 

The Administrator is responsible for giving permission for a student to post events.
 
The following actors/users can use the system (see also Figure 1): 
 
Students are able to view all events.  Students who want to participate in an event are able to book it. In case of a successful booking, the system displays a message that the event is booked. Students can able to cancel their booking and view their own bookings (with the option to select and cancel a booking from there). 
 
Event organisers are registered students who can post events. When posting an event, they need to provide the event details described above. Event organisers should also be able to retrieve a list of their own events, cancel events or change event details, for example, location and time. In case of event cancellation all bookings associated with an event need to be automatically cancelled. 
 
An administrator can provide a student with event organisation rights (essentially making a student an event organizer) or revoke these rights. The administrator can view all events and bookings. They can also cancel events or bookings. 
 
The use case for this project is:

<img src = "https://user-images.githubusercontent.com/59787504/92301585-b0411c00-ef84-11ea-990c-6c47117a4aff.jpg">

The screenshot of the projects are attached below.

<img src = "https://user-images.githubusercontent.com/59787504/92300261-2fc8ee00-ef79-11ea-9afc-323e035f8abc.png" height="400" width="500">

<img src = "https://user-images.githubusercontent.com/59787504/92300236-1b84f100-ef79-11ea-9bd0-0d7a085c488c.png" height="400" width="500">

<img src = "https://user-images.githubusercontent.com/59787504/92300264-30fa1b00-ef79-11ea-9aab-e5aa5db52ffe.png" height="400" width="500">

<img src = "https://user-images.githubusercontent.com/59787504/92300266-335c7500-ef79-11ea-9b38-73dbe56d5a0a.png" height="400" width="500">

<img src = "https://user-images.githubusercontent.com/59787504/92300259-2f305780-ef79-11ea-8126-be449b5eab24.png" height="400" width="500">

<img src = "https://user-images.githubusercontent.com/59787504/92300257-2d669400-ef79-11ea-8c1f-1a41f8162a06.png" height="400" width="500">

<img src = "https://user-images.githubusercontent.com/59787504/92300255-2b9cd080-ef79-11ea-9035-d1d1ef3df435.png" height="400" width="500">

<img src = "https://user-images.githubusercontent.com/59787504/92300254-2a6ba380-ef79-11ea-817c-e94bb78a2baa.png" height="400" width="500">

<img src = "https://user-images.githubusercontent.com/59787504/92300251-293a7680-ef79-11ea-82b6-10b1907d9a2d.png" height="400" width="500">

<img src = "https://user-images.githubusercontent.com/59787504/92300242-22136880-ef79-11ea-95e9-ab425be9f194.png" height="400" width="500">

<img src = "https://user-images.githubusercontent.com/59787504/92300241-20e23b80-ef79-11ea-8016-06d78d20e479.png" height="400" width="500">

<img src = "https://user-images.githubusercontent.com/59787504/92300248-26d81c80-ef79-11ea-816d-d24abf12f490.png" height="400" width="500">

<img src = "https://user-images.githubusercontent.com/59787504/92300245-23dd2c00-ef79-11ea-8fed-46e9efc6e256.png" height="400" width="500">

<img src = "https://user-images.githubusercontent.com/59787504/92300246-250e5900-ef79-11ea-95ad-05c6d77e65f9.png" height="400" width="500">

<img src = "https://user-images.githubusercontent.com/59787504/92300239-1fb10e80-ef79-11ea-9a9f-93d4a57b9e56.png" height="400" width="500">

<img src = "https://user-images.githubusercontent.com/59787504/92300237-1d4eb480-ef79-11ea-96c0-cefe9362bf85.png" height="400" width="500">
