package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lؔۖٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2825l implements InterfaceC14242l, InterfaceC1677l {
    public final Executor crashlytics;
    public final HashMap yandex = new HashMap();
    public ArrayDeque loadAd = new ArrayDeque();

    public C2825l(Executor executor) {
        this.crashlytics = executor;
    }

    public final synchronized void yandex(Executor executor, InterfaceC12690l interfaceC12690l) {
        try {
            executor.getClass();
            if (!this.yandex.containsKey(AbstractC14760l.class)) {
                this.yandex.put(AbstractC14760l.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.yandex.get(AbstractC14760l.class)).put(interfaceC12690l, executor);
        } catch (Throwable th) {
            throw th;
        }
    }
}
