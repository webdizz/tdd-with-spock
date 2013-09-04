# -*- coding: undecided -*-
require 'buildr/groovy'

Buildr::Groovy::Groovyc::REQUIRES.groovy = '1.8.9'

VERSION_NUMBER = '0.0.1'
GROUP = 'name.webdizz.tdd.spock'

repositories.remote << 'http://repo1.maven.org/maven2'

desc 'This is a buildfile for source code for TDD with Spock talk @ XPDays 2013'
define "tdd-with-spock" do

  project.version = VERSION_NUMBER
  project.group = GROUP

  compile.with # Add classpath dependencies
  test.compile.with # Add classpath dependencies
  package(:jar)
end
