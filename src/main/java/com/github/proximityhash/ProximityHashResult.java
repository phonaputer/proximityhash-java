package com.github.proximityhash;

import java.util.Set;

/**
 * Results from {@link com.github.proximityhash.ProximityHash#findGeohashesWithinRadius(GeoPoint, double, int)}.
 */
public class ProximityHashResult {

    private Set<String> hashesWithinRadius;
    private Set<String> hashesPartiallyWithinRadius;

    public ProximityHashResult(Set<String> hashesWithinRadius, Set<String> hashesPartiallyWithinRadius) {
        this.hashesWithinRadius = hashesWithinRadius;
        this.hashesPartiallyWithinRadius = hashesPartiallyWithinRadius;
    }

    /**
     * Get all geohashes of the given precision which lie entirely within the radius.
     *
     * @return A set of geohash strings.
     */
    public Set<String> getHashesWithinRadius() {
        return hashesWithinRadius;
    }

    /**
     * Get all geohashes of the given precision which lie partially but not entirely within the radius.
     *
     * @return A set of geohash strings.
     */
    public Set<String> getHashesPartiallyWithinRadius() {
        return hashesPartiallyWithinRadius;
    }

}
