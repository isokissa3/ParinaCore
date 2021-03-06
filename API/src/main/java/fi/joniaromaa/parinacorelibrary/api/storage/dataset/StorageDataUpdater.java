package fi.joniaromaa.parinacorelibrary.api.storage.dataset;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface StorageDataUpdater
{
	String value();
	StorageDataUpdateType type();
}
