package io.realm.kotlin.internal.interop;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H&¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lio/realm/kotlin/internal/interop/SyncThreadObserver;", "", "threadName", "", "onCreated", "", "onDestroyed", "onError", "error", "cinterop_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SyncThreadObserver {
    void onCreated();

    void onDestroyed();

    void onError(String error);

    String threadName();
}
