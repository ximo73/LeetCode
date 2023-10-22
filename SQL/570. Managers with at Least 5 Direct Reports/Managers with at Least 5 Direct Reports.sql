Select e1.name
From Employee e1 JOIN Employee e2 on e1.id = e2.managerId
Group by e2.managerId
Having Count(*) >= 5