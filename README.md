[![Build Status](https://travis-ci.org/assumption/CP-Catalog.svg?branch=master)](https://travis-ci.org/assumption/CP-Catalog) [![Quality Gate](https://sonarqube.com/api/badges/gate?key=cp.catalog)](https://sonarqube.com/dashboard/index/cp.catalog)

# CP-Catalog

An API for Cal Poly's course information repurposed from [my flowcharting application](https://github.com/cpe308-309/Group-name).

Usage | URL | Example
--- | --- | ---
List all courses | cp-catalog.herokuapp.com/course | 
List specific course | cp-catalog.herokuapp.com/course/{prefix}{suffix} | http://cp-catalog.herokuapp.com/course/cpe357
List all courses with specific prefix | cp-catalog.herokuapp.com/course/prefix/{prefix} | http://cp-catalog.herokuapp.com/course/prefix/cpe
