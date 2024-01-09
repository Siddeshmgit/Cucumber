#Author: your.email@your.domain.com
#Keywords Summary :
@background
Feature: Education
Background: Schooling should be completed
Given Student has cleared SSLC examinations
When student has scored more than distinction
Then he is allowed to join PUC

Scenario: He wants to join for medicals
Given The student has cleared boards for PCMB
When He writes neet exam 
And he clears the exam
Then he will be able to join MBBS

Scenario: He wants to join for engineering
Given  The student has cleared boards for PCMC
When he writes CET exam
And he ranks below ten thousand
Then he will be able to join engineering

