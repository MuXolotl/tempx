package io.realm.kotlin.internal.interop;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001JE\u0010\n\u001a\u00020\t2\u0010\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00010\u0002j\u0002`\u00032\u0010\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u00010\u0002j\u0002`\u00052\u0010\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00010\u0002j\u0002`\u0007H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lio/realm/kotlin/internal/interop/MigrationCallback;", "", "Lio/realm/kotlin/internal/interop/NativePointer;", "Lio/realm/kotlin/internal/interop/FrozenRealmPointer;", "oldRealm", "Lio/realm/kotlin/internal/interop/LiveRealmPointer;", "newRealm", "Lio/realm/kotlin/internal/interop/RealmSchemaPointer;", "schema", "", "migrate", "(Lio/realm/kotlin/internal/interop/NativePointer;Lio/realm/kotlin/internal/interop/NativePointer;Lio/realm/kotlin/internal/interop/NativePointer;)V", "cinterop_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MigrationCallback {
    void migrate(NativePointer<Object> oldRealm, NativePointer<Object> newRealm, NativePointer<Object> schema);
}
