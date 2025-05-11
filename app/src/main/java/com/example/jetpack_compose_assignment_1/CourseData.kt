package com.example.jetpack_compose_assignment_1

// CourseData.
fun getCourses(): List<Course> {
    return listOf(
        Course(
            id = 1,
            title = "Web Development",
            code = "SECT-3112",
            credit = 4.00,
            description = "This course introduces the foundational technologies of the web such as HTML, CSS, and JavaScript. You’ll learn to build static and dynamic web pages, understand responsive design, and create basic user interfaces. Concepts like web hosting, browser rendering, and frontend frameworks will also be touched on. By the end, you'll be able to design interactive and accessible websites from scratch.",
            prerequisites = listOf(
                "Basic computer skills",
                "Familiarity with internet usage",
                "Introductory programming knowledge"
            )
        ),
        Course(
            id = 2,
            title = "Fundamentals of Database",
            code = "SECT-2161",
            credit = 3.00,
            description = "This course covers database fundamentals including data modeling, relational database design, and SQL. Students will gain hands-on experience in designing and querying databases using modern tools. The course also touches on normalization, transactions, and indexing. You'll understand how to structure data efficiently and access it for web and mobile applications.",
            prerequisites = listOf(
                "Introduction to Programming",
                "Basic data structures",
                "Logical thinking skills"
            )
        ),
        Course(
            id = 3,
            title = "Computer Architecture",
            code = "SECT-3122",
            credit = 3.00,
            description = "Learn how computers execute instructions and process data through this deep dive into digital design and architecture. The course explores topics such as the CPU, memory hierarchy, instruction sets, and control units. You'll also understand how assembly language interfaces with hardware. This is essential for students aiming to master low-level programming or embedded systems.",
            prerequisites = listOf(
                "Digital logic design",
                "Basic electronics",
                "Mathematical reasoning"
            )
        ),
        Course(
            id = 4,
            title = " Software Engineering",
            code = "SECT-2111",
            credit = 3.00,
            description = "This course introduces principles, methods, and tools for developing high-quality software systems. Topics include software development life cycle (SDLC), agile methodologies, requirements gathering, system design, and testing strategies. Students will work on team projects to apply theoretical knowledge. Emphasis is placed on maintainability, scalability, and user needs.",
            prerequisites = listOf(
                "Object-oriented programming",
                "Team collaboration skills",
                "Intro to project management"
            )
        ),
        Course(
            id = 5,
            title = "Human Computer Interaction",
            code = "SECT-3131",
            credit = 3.00,
            description = "Explore how humans interact with technology through the lens of design, usability, and cognitive psychology. This course covers UI/UX principles, user research, prototyping, and accessibility standards. You'll gain insight into how to create software interfaces that are intuitive and inclusive. Design-thinking techniques and usability testing will be a core part of hands-on assignments.",
            prerequisites = listOf(
                "Basic design thinking",
                "Knowledge of HTML/CSS",
                "Communication skills"
            )
        ),
        Course(
            id = 6,
            title = " Mobile Development",
            code = "SECT-3113",
            credit = 3.00,
            description = "An introduction to building mobile applications for Android and iOS platforms. You’ll learn about mobile architecture, UI components, activity lifecycles, and performance optimization. The course explores tools such as Kotlin or Flutter for cross-platform development. By the end, students will be able to build a functional mobile app and deploy it for testing.",
            prerequisites = listOf(
                "Intermediate programming",
                "Understanding of web concepts",
                "Object-oriented principles"
            )
        ),
        Course(
            id = 7,
            title = "Fundamentals of AI",
            code = "SECT-3151",
            credit = 2.00,
            description = "This course introduces you to the basic concepts and applications of Artificial Intelligence. Topics include problem-solving, machine learning, search algorithms, and neural networks. You'll also explore real-world use cases such as recommendation systems and chatbots. Mathematical foundations such as statistics and algebra are integrated throughout.",
            prerequisites = listOf(
                "Basic Python knowledge",
                "Mathematics (linear algebra)",
                "Statistics fundamentals"
            )
        ),
        Course(
            id = 8,
            title = " Computer Graphics",
            code = "SECT-3132",
            credit = 3.00,
            description = "Delve into the world of creating images and animations using programming. Learn how shapes, colors, lighting, and motion are processed and rendered digitally. The course covers 2D and 3D graphics, transformations, and modeling basics. Students will work with graphic libraries to bring visual elements to life on the screen.",
            prerequisites = listOf(
                "Geometry and linear algebra",
                "Intro to C++ or Java",
                "Creative mindset"
            )
        ),
        Course(
            id = 9,
            title = "Cyber Security",
            code = "SECT-3141",
            credit = 2.00,
            description = "This course equips students with knowledge about threats, vulnerabilities, and security controls. Topics include encryption, authentication, malware, and network security. You'll learn how to protect systems and data from common cyber attacks. Practical examples will help you understand ethical hacking and digital defense strategies.",
            prerequisites = listOf(
                "Networking basics",
                "Operating systems fundamentals",
                "Critical thinking"
            )
        ),
        Course(
            id = 10,
            title = " Operating Systems",
            code = "SECT-3082",
            credit = 3.00,
            description = "Learn how an operating system manages hardware and software resources. Key topics include memory management, process scheduling, file systems, and concurrency. You'll understand what happens behind the scenes when programs run and interact. Real-world operating systems like Linux and Windows will be used for demonstrations.",
            prerequisites = listOf(
                "Basic programming",
                "Computer architecture knowledge",
                "Understanding of binary/hex"
            )
        )
    )
}


