package dev.lazurite.transporter.api.pattern;

import dev.lazurite.transporter.impl.pattern.model.Quad;

import java.util.List;

/**
 * A basic pattern contains just a set of quads.
 * @since 1.0.0
 */
public interface Pattern {
    List<Quad> getQuads();
}
