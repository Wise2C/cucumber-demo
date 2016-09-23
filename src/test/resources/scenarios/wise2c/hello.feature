@one
Feature: 打开百度网站并浏览相关信息

  Scenario: 打开网站，浏览相关信息
    Given 作为一个访问网站的用户
    When 我将看到网页标题为百度
    When 搜索睿云智合
    Then 我将看到关于搜索结果页面
