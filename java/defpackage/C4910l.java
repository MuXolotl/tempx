package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;

/* JADX INFO: renamed from: lٖؗؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4910l extends C6460l implements InterfaceC1601l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10006l = AtomicReferenceFieldUpdater.newUpdater(C4910l.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public C4910l(boolean z) {
        super(1, z ? 1 : 0);
        this.owner$volatile = z ? null : AbstractC8618l.yandex;
    }

    @Override // defpackage.InterfaceC1601l
    public final void billing(Object obj) {
        while (purchase()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10006l;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C9676l c9676l = AbstractC8618l.yandex;
            if (obj2 != c9676l) {
                if (obj2 != obj && obj != null) {
                    C6541l.isPro("This mutex is locked by ", obj2, ", but ", obj, " is expected");
                    return;
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, c9676l)) {
                        amazon();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj2);
            }
        }
        C8339l.smaato("This mutex is not locked");
    }

    public final boolean mopub() {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C6460l.f13492l;
            int i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = this.f13497l;
            if (i2 > i3) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i3) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i3));
            } else {
                if (i2 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    f10006l.set(this, null);
                    return true;
                }
            }
        }
    }

    public final boolean purchase() {
        return Math.max(C6460l.f13492l.get(this), 0) == 0;
    }

    public final String toString() {
        return "Mutex@" + AbstractC17549l.purchase(this) + "[isLocked=" + purchase() + ",owner=" + f10006l.get(this) + ']';
    }

    @Override // defpackage.InterfaceC1601l
    public final Object yandex(InterfaceC14029l interfaceC14029l) {
        if (mopub()) {
            return Unit.INSTANCE;
        }
        C2397l c2397lYandex = AbstractC15185l.yandex(AbstractC17082l.billing(interfaceC14029l));
        try {
            C8968l c8968l = new C8968l(this, c2397lYandex);
            while (true) {
                int andDecrement = C6460l.f13492l.getAndDecrement(this);
                if (andDecrement <= this.f13497l) {
                    if (andDecrement > 0) {
                        c8968l.remoteconfig(Unit.INSTANCE, this.f13496l);
                        break;
                    }
                    if (crashlytics(c8968l)) {
                        break;
                    }
                }
            }
            Object objSignature = c2397lYandex.Signature();
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objSignature != enumC9342l) {
                objSignature = Unit.INSTANCE;
            }
            return objSignature == enumC9342l ? objSignature : Unit.INSTANCE;
        } catch (Throwable th) {
            c2397lYandex.m1133throws();
            throw th;
        }
    }
}
