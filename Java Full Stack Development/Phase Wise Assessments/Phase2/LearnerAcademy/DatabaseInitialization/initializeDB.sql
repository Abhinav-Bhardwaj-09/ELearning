SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

--Class Table
CREATE TABLE `classes` (
  `id` int(11) NOT NULL,
  `section` int(55) NOT NULL,
  `teacher` int(11) NOT NULL,
  `subject` int(11) NOT NULL,
  `time` varchar(44) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--Student Table
CREATE TABLE `students` (
  `id` int(11) NOT NULL,
  `fname` varchar(55) NOT NULL,
  `lname` varchar(55) NOT NULL,
  `class` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--Subject Table
CREATE TABLE `subjects` (
  `id` int(11) NOT NULL,
  `name` varchar(55) NOT NULL,
  `shortcut` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--Teacher Table
CREATE TABLE `teachers` (
  `id` int(11) NOT NULL,
  `fname` varchar(55) NOT NULL,
  `lname` varchar(55) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


-- Inserting data

INSERT INTO `subjects` (`id`, `name`, `shortcut`) VALUES
(1, 'English', 'ENG'),
(2, 'Hindi', 'HIN'),
(3, 'Mathematics', 'MATH'),
(4, 'Computer Science', 'CS'),
(5, 'Social Science', 'S.St');

INSERT INTO `teachers` (`id`, `fname`, `lname`) VALUES
(1, 'Teacher', '1'),
(2, 'Teacher', '2'),
(3, 'Teacher', '3'),
(4, 'Teacher', '4'),
(5, 'Teacher', '5');

INSERT INTO `classes` (`id`, `section`, `teacher`, `subject`, `time`) VALUES
(1, 1, 1, 1, '08:00'),
(2, 3, 4, 3, '09:00'),
(3, 2, 3, 5, '10:00'),
(4, 5, 2, 2, '11:00'),
(5, 4, 5, 4, '12:00');

INSERT INTO `students` (`id`, `fname`, `lname`, `class`) VALUES
(1, 'Student', '1', 1),
(2, 'Student', '2', 4),
(3, 'Student', '3', 5),
(4, 'Student', '4', 3),
(5, 'Student', '5', 1),
(6, 'Student', '6', 2),
(7, 'Student', '7', 4),
(8, 'Student', '8', 3),
(9, 'Student', '9', 3),
(10, 'Student', '10', 2),
(11, 'Student', '11', 5);



--Altering table to connect tables with each other

ALTER TABLE `classes`
  ADD PRIMARY KEY (`id`),
  ADD KEY `subject_id` (`subject`),
  ADD KEY `teacher_id` (`teacher`);

ALTER TABLE `students`
  ADD PRIMARY KEY (`id`),
  ADD KEY `class_id` (`class`);

ALTER TABLE `subjects`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `teachers`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `classes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

ALTER TABLE `students`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

ALTER TABLE `subjects`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

ALTER TABLE `teachers`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
  
  

--Adding constraints in the tables
ALTER TABLE `classes`
  ADD CONSTRAINT `subject_id` FOREIGN KEY (`subject`) REFERENCES `subjects` (`id`),
  ADD CONSTRAINT `teacher_id` FOREIGN KEY (`teacher`) REFERENCES `teachers` (`id`);

ALTER TABLE `students`
  ADD CONSTRAINT `class_id` FOREIGN KEY (`class`) REFERENCES `classes` (`id`);
COMMIT;