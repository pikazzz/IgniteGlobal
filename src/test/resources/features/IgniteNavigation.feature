Feature: Navigation Bar
        To see the subpages
        Without logging in
        I can click the navigation bar links

        Scenario: I can access the subpages through the navigation bar
            Given I navigate to www.igniteglobal.io
            When I go to services page using the navigation bar
            Then I validate the options in the service page

        Scenario Outline: I can access the subpages through the navigation bar
            Given I navigate to www.igniteglobal.io
            When I go to <section> using the navigation bar
            Examples:
            | section    |
            | Home       |
            | Services   |
            | Case studies  |
            | Tech Stack    |
            | Locations  |
            | About Us   |
            | Contact Us |

        