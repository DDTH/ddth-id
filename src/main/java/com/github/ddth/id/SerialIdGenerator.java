package com.github.ddth.id;

import java.util.concurrent.TimeUnit;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.RemovalListener;
import com.google.common.cache.RemovalNotification;

/**
 * Generate serial IDs.
 * 
 * <p>
 * Serial IDs are:
 * </p>
 * <ul>
 * <li>Grouped into namespaces.</li>
 * <li>Unique within the namespace.</li>
 * <li>Ascending and Serial: {@code next_id = previous_id + 1}.</li>
 * </ul>
 * 
 * @author Thanh Nguyen <btnguyen2k@gmail.com>
 * @since 0.1.0
 */
public abstract class SerialIdGenerator {

	protected static Cache<String, SerialIdGenerator> idGenerators = CacheBuilder
			.newBuilder().expireAfterAccess(3600, TimeUnit.SECONDS)
			.removalListener(new RemovalListener<String, SerialIdGenerator>() {
				@Override
				public void onRemoval(
						RemovalNotification<String, SerialIdGenerator> entry) {
					entry.getValue().destroy();
				}
			}).build();

	public SerialIdGenerator init() {
		return this;
	}

	public void destroy() {
		// EMPTY
	}

	/**
	 * Generates next id.
	 * 
	 * @return
	 */
	public abstract long nextId(String namespace);
}
