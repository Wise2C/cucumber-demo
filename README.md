# Cucumber例子程序
  本例子是用Cucumber作为功能测试（自动验收测试）框架，写的一个简单的测试功能。覆盖的场景是使用百度网站搜索睿云智合公司，并验证结果。  
  你可以对代码进行修改和优化，以满足测试更加复杂的功能。该测试案例使用Phantomjs WebDriver进行测试，方便程序在 CI server 上运行。  
  如你需要切换WebDriver，修改 src/test/java/com.wise2c.bdd/WebDriverUtils 中的web driver 类型即可。 
## 如何使用
      gradle cobertura  
   测试成功或失败，你都可以在项目的 build/cucumber.html 目录下看到测试报告与截图。      
# License
Copyright (c) 2015-2016 [Wise2c, Inc.](http://www.wise2c.com)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

[http://www.apache.org/licenses/LICENSE-2.0](http://www.apache.org/licenses/LICENSE-2.0)

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.