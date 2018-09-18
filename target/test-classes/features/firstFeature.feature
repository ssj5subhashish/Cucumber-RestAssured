Feature: Hit a API

  Scenario: Hit the API /posts/1

    When I hit the posts for id 1
    Then I should get "sunt aut facere repellat provident occaecati excepturi optio reprehenderit" as "title"
    And I should get "quia et suscipit suscipit recusandae consequuntur expedita et cum reprehenderit molestiae ut ut quas totam nostrum rerum est autem sunt rem eveniet architecto" as "body"
