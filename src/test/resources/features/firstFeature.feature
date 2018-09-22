Feature: Hit a API

  Scenario: Hit the API /posts/1

    When I hit the posts for id 1
    Then I should get "title" as "sunt aut facere repellat provident occaecati excepturi optio reprehenderit"
    And I should get "body" as "quia et suscipit suscipit recusandae consequuntur expedita et cum reprehenderit molestiae ut ut quas totam nostrum rerum est autem sunt rem eveniet architecto"