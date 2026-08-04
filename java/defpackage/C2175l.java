package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: lؓۡٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C2175l {
    public static final /* synthetic */ AtomicIntegerFieldUpdater loadAd = AtomicIntegerFieldUpdater.newUpdater(C2175l.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;
    public final Throwable yandex;

    public C2175l(Throwable th, boolean z) {
        this.yandex = th;
        this._handled$volatile = z ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.yandex + ']';
    }
}
