
@xfleet
Feature:XFleetsolutions login functionality

    Scenario Outline: xfleetsolutions login functionality

      Given  user is on the main page of "xfleetsolutionLogin"
      When  user enters "<username>" and "<password>"
      And user clicks signuplogin button
      Then title should be "Dashboard"


      Examples: login values
        | username        | password    |
        | user1           | UserUser123 |
        | user2           | UserUser123 |
        | user3           | UserUser123 |
        | storemanager51  | UserUser123 |
        | storemanager52  | UserUser123 |
        | storemanager53  | UserUser123 |
        | salesmanager101 | UserUser123 |
        | salesmanager102 | UserUser123 |
        | salesmanager103 | UserUser123 |





