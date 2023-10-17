create database mvc
use mvc
create table login(email varchar(128),password varchar(50))
select * from login


CREATE TABLE Tasks (
    task_id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    due_date DATE,
    status ENUM('complete', 'incomplete') NOT NULL
)
select * from Tasks