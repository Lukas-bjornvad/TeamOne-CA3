[![Build Status](https://travis-ci.org/wormple12/TeamOne-CA3.svg?branch=master)](https://travis-ci.org/wormple12/TeamOne-CA3)

3. Semester, CA3

API:
=====================
Back end deployed at: https://www.helvedesmaskine.dk/teamone-ca2-back/

Front end deployed at https://ca2-teamone-frontend.surge.sh/

Open API: https://helvedesmaskine.dk/teamone-ca2-back/openapi/

Group: Team One
=======================
Lukas Bj�rnvad

Rasmus Pr�torius
https://github.com/Rasm-P

Simon Norup

Henning Wiberg

Group Contract
==================
Respect your group members and their work. Try to avoid working on features that other members are currently working on.

If you want to change other members' work, contact them and coordinate.

Whenever you have made a small feature, do the following:

- Clean n Build

- If build/tests fail, fix issues and clean n build again

- Git add + git commit (with descriptive message)

- Git pull to see if anyone else has pushed, fix possible merge conflicts

- If any changes occured; begin from point 1 again

- Git push

- Wait for travis -- if fail; drop everything and fix immediately

- Tell other members to pull.

- Always wait for other members to finish pushing and for travis to check it before pushing a feature yourself.


Instructions
==================
Projects which are expected to use this start-code are projects that require all, or most of the following technologies:*
 - *JPA and REST*
- *Testing, including database test*
- *Testing, including tests of REST-API's*
- *CI and CONTINUOUS DELIVERY* 
- *More?*

Preconditions
*In order to use this code, you should have a local developer setup + a "matching" droplet on Digital Ocean as described in the 3. semester guidelines* 

To set up the project backend to work on your machine and pipeline, change the following:

pom.xml : Domain name
config.properties : names of both databases
.travis.yaml : name of test database
Travis, environment variables: REMOTE_USER + REMOTE_PW
rest, @OpenAPIDefinition: Local and remote server url for openapi.
CorsResponseFilter, Access-Control-Allow-Origin: Your frontend deployment

For instructions on how to use the API see the following openapi decription:
//helvedesmaskine.dk/teamone-ca2-back/openapi/