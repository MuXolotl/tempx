package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: lْۤ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13774l extends PhantomReference {
    public static final C7026l billing = new C7026l(14, false);
    public C13774l amazon;
    public final long crashlytics;
    public final AtomicBoolean loadAd;
    public C13774l purchase;
    public final C5456l yandex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13774l(LongPointerWrapper longPointerWrapper, ReferenceQueue referenceQueue) {
        super(longPointerWrapper, referenceQueue);
        C5456l c5456l = C5456l.yandex;
        this.yandex = c5456l;
        this.loadAd = longPointerWrapper.getReleased();
        this.crashlytics = longPointerWrapper.getPtr$cinterop_release();
        C7026l c7026l = billing;
        synchronized (c7026l) {
            try {
                this.amazon = null;
                C13774l c13774l = (C13774l) c7026l.f14720l;
                this.purchase = c13774l;
                if (c13774l != null) {
                    c13774l.amazon = this;
                }
                c7026l.f14720l = this;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
