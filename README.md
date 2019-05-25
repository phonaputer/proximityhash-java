## ProximityHash Java: Geohashes in Proximity to a Point
* *Ported from the [ProximityHash project](https://github.com/ashwin711/proximityhash) created by ashwin711*

[Geohash](https://en.wikipedia.org/wiki/Geohash) is a geocoding system invented by Gustavo Niemeyer and placed into the
public domain. It is a hierarchical spatial data structure which subdivides space
into buckets of grid shape, which is one of the many applications of what is known
as a Z-order curve, and generally space-filling curves.

### ProximityHash Java
ProximityHash generates a set of geohashes that cover a circular area, given the
center coordinates and the radius. It returns two sets. One contains all geohashes
falling entirely within the radius. The other contains all geohashes which fall
partially within the radius. On a map, the results would look like a (rough) circle of
geohashes which fully match (with the origin point lying at the circle's center)
with a ring of partially matching geohashes around the perimeter of the circle.

### Usage and Documentation
Javadocs for ProximityHash Java can be found here: <https://phonaputer.github.io/proximityhash-java/>

This project isn't on Maven central since I wouldn't say it's "production ready"
for everyone due the fact it doesn't work near the poles. If that doesn't bother you
(and it didn't bother me), please feel free to copy the files into your Java
project or put this library in your private repository and import it from there.

### Contributors
phonaputer [https://github.com/phonaputer]

### Idea Taken From
ProximityHash by Ashwin Nair [https://github.com/ashwin711/proximityhash]
