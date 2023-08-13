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
