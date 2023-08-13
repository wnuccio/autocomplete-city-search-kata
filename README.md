# autocomplete-city-search-kata
Given a list of cities of length N where each city is a String. 
The task is to implement a search query for the city directory (cities List) having a search string query as input parameters.

Return the list of potential matches for the search string. 
If there is no match between query and cities, return 0.

It’s very important the performance and the auxiliary space required

Example 1:
Input:
cities = {"Las Palmas", "Pamplona", "Palencia", "Palma de Mallorca", "Ponferrada", "Calella de Palafrugell"}

Search entry string = "palma"

Output:
p: Las Palmas, Pamplona, Palencia, Palma de Mallorca, Ponferrada, Calella de Palafrugell
pa: Las Palmas, Pamplona, Palencia, Palma de Mallorca, Calella de Palafrugell
pal: Las Palmas, Palencia, Palma de Mallorca, Calella de Palafrugell
palm: Las Palmas, Palma de Mallorca
palma: Las Palmas, Palma de Mallorca

Example 2:
Input:
Cities = {"Las Palmas", "Pamplona", "Palencia", “Palma de Mallorca”, “Ponferrada”, “Calella de Palafrugell”}

Search entry string = "Casti"

Output:
C: Calella de Palafrugell, Palencia, Palma de Mallorca
Ca: Calella de Palafrugell, Palma de Mallorca
Cas: 0
Cast: 0
Casti: 0

## Emerging Design Pattern - Notes on solution
One of the crucial aspect of TDD is the order of test cases,
how to proceed from simple cases to more complex ones.

There is little research on this (see Transformation Priority Premise by Uncle Bob).

The following are euristhics/patterns which seem to be helpful
in supporting an evolutionary approach that makes it possible,
for the design, to gradually emerge.

**Assumptions and corner cases**
The input is always "correct", so
- the input string is not null nor empty (but it can be one or many char) 
- the input list can be empty, one-city, many city
- each city is not null nor empty (but in can be one or many char)

The corner cases, which violate this constraints should be checked at the end of the process,
in some final test cases.
Actually, they could also be checked at the first, but consider that they do not help
in generalizing and making the solution emerge.

**Dimensions and partitions**
The problem has the following dimensions:
    - the input string, which has partitions: empty, one char, many char
    - the city list, which has partitions: empty, one city, many cities
    - each city, which has partitions: one char, many char (let's assume that a city cannot be empty: "");
    - the output, which has partitions: 
        one line with one city, 
        one line with "0", 
        many lines with many cities,
        many lines with many cities and a final "0"

**Signature and Types**    
The signature takes into account the nature of each dimension from the very beginning, so:
    - the input is a String (never a single char)
    - the cities is a List (not a single String)
    - each city is a String (not a single char)
    - the output is a List<String> (not a single String)

This approach avoids complex refactoring in the future:
even if in your first test cases you model cities with a single char,
or the output with a single List, the refactoring will be unnecessarily complex.

**One Dimension at a time**
Select, for each Dimension, the simplest partition.
For a collection of values, simplest means "one element". 
In fact, 0 elements seems a corner case, an exception, while many adds too much complexity at first.

If the partition has a set of fixed values (ex. a boolean which can be true or false),
start with the one that seems the simplest.




