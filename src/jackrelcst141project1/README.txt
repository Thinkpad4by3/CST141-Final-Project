Jason Jackrel ReadME

  _____                _ __  __        ______ _ _      
 |  __ \              | |  \/  |      |  ____(_) |     
 | |__) |___  __ _  __| | \  / | ___  | |__   _| | ___ 
 |  _  // _ \/ _` |/ _` | |\/| |/ _ \ |  __| | | |/ _ \
 | | \ \  __/ (_| | (_| | |  | |  __/ | |    | | |  __/
 |_|  \_\___|\__,_|\__,_|_|  |_|\___| |_|    |_|_|\___|.


!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
!!!!!!!!!!PLEASE PUT THE TEST FOLDER AT THE ROOT OF THE C: OR CHANGE DIRECTORY!!!!!!!!!!
!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

Classes:
	Address
	Address --> Constructor(blank and full)
	(get/set)StreetNumber --> Gets or sets Street Number
	(get/set)StreetName --> Gets or sets Street Name
	(get/set)City --> Gets or sets City
	(get/set)State --> Gets or sets State
	(get/set)Zip --> Gets or sets Zipcode
	display --> display the address in standard form (xxxx Street Name City, State,ZIP)
*******************************************
	Person
	Person --> Constructor(blank and full)
	(get/set)FirstName --> Gets or sets First Name
	(get/set)LastName --> Gets or sets Last Name
	getId --> get randomly generated ID
	(get/set)Address --> Gets or sets Address(as address class)
	(get/set)Phone --> Gets or sets Phone
*******************************************
	Student
	Student --> Constructor(blank and full)
	(get/set)FirstName --> Gets or sets First Name
	(get/set)LastName --> Gets or sets Last Name
	getId --> get randomly generated ID
	(get/set)Address --> Gets or sets Address(as address class)
	(get/set)Phone --> Gets or sets Phone
	(get/set)CoursesTook --> Gets or sets CoursesTook (with array location)
	(get/set)CoursesTaking --> Gets or sets CoursesTaking (with array location)
	(get/set)CoursesToTake --> Gets or sets CoursesToTake (with array location)
*******************************************
	Faculty
	Faculty --> Constructor(blank and full)
	(get/set)FirstName --> Gets or sets First Name
	(get/set)LastName --> Gets or sets Last Name
	getId --> get randomly generated ID
	(get/set)Address --> Gets or sets Address(as address class)
	(get/set)Phone --> Gets or sets Phone
	(get/set)Salary --> Gets or sets Salary(double)
	(get/set)OfficeAddress --> Gets or sets Office Address
	(get/set)Title --> Gets or sets Title
*******************************************
	Textbook
	Textbook --> Constructor(blank and full)
	(get/set)Title --> Gets or sets First Name
	(get/set)Author --> Gets or sets Last Name
	getISBN --> get ISBN
	(get/set)Price --> Gets or sets price(d.
ouble)
	(get/set)Publisher --> Gets or sets Publisher
*******************************************
	Course	
	Course --> Constructor(blank and full)
	(get/set)ISBN --> Gets or sets Textbook ISBN
	(get/set)CourseTitle --> Gets or sets Course Title
	getId --> get randomly generated ID
	(get/set)NumberOfCredits --> Gets or sets Number of Credits(int)
	(get/set)CourseNumber --> Gets or sets course number
*******************************************
	PersonBag
	PersonBag --> Constructor(blank and full)
	add --> Adds a person to the bag
	findById --> Finds person by ID
	removeById --> Removes person by ID then shifts everyone
	display --> displays all people in organized fashion
	importText--> imports data to array via ".person file" or other suitable txt format.
*******************************************
	StudentBag
	StudentBag --> Constructor(blank and full)
	add --> Adds a student to the bag
	findById --> Finds Student by ID
	removeById --> Removes Student by ID then shifts everyone
	display --> displays all Students in organized fashion
	importText--> imports data to array via ".student file" or other suitable txt format.
*******************************************
	FacultyBag --> Constructor(blank and full)
	add --> Adds a faculty to the bag
	findById --> Finds faculty by ID
	removeById --> Removes faculty by ID then shifts everyone
	display --> displays all faculty in organized fashion
	importText--> imports data to array via ".faculty file" or other suitable txt format.
*******************************************
	TextbookBag
	TextbookBag --> Constructor(blank and full)
	add --> Adds a Textbook to the bag
	findById --> Finds textbook by ID
	removeById --> Removes textbook by ID then shifts everyone
	display --> displays all textbooks in organized fashion
	importText--> imports data to array via ".textbook file" or other suitable txt format.
*******************************************
	CourseBag
	CourseBag --> Constructor(blank and full)
	add --> Adds a person to the bag
	findById --> Finds Course by ID
	removeById --> Removes course by ID then sifts everyone
	display --> displays all courses in organized fashion
	importText--> imports data to array via ".course file" or other suitable txt format.
