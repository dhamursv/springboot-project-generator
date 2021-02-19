    mvn archetype:generate                                  \
      -DarchetypeGroupId=com.springboot      		    \
      -DarchetypeArtifactId=projectgenerator                \
      -DarchetypeVersion=1.0                                \
      -DgroupId=com.springboot                            \
      -DartifactId=$1     \
      -Dversion=1.0 