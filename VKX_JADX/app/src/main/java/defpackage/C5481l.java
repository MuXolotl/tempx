package defpackage;

import io.realm.kotlin.internal.interop.NativePointer;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* JADX INFO: renamed from: lؘؘؘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5481l implements InterfaceC3210l {
    public final NativePointer yandex;
    public final ReentrantLock loadAd = new ReentrantLock();
    public final C18474l crashlytics = AbstractC1805l.yandex(true);

    public C5481l(NativePointer nativePointer) {
        this.yandex = nativePointer;
    }

    @Override // defpackage.InterfaceC3210l
    public final void cancel() {
        C18474l c18474l = this.crashlytics;
        ReentrantLock reentrantLock = this.loadAd;
        reentrantLock.lock();
        try {
            if (c18474l.loadAd()) {
                this.yandex.release();
            }
            c18474l.yandex = 0;
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }
}
