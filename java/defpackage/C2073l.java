package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: lؓۘۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2073l implements InterfaceC2541l {
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C1038l f4651l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4649l = AtomicIntegerFieldUpdater.newUpdater(C2073l.class, "_isCompleting$volatile");

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4648l = AtomicReferenceFieldUpdater.newUpdater(C2073l.class, Object.class, "_rootCause$volatile");

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4650l = AtomicReferenceFieldUpdater.newUpdater(C2073l.class, Object.class, "_exceptionsHolder$volatile");

    public C2073l(C1038l c1038l, Throwable th) {
        this.f4651l = c1038l;
        this._rootCause$volatile = th;
    }

    public final boolean amazon() {
        return crashlytics() != null;
    }

    public final Throwable crashlytics() {
        return (Throwable) f4648l.get(this);
    }

    @Override // defpackage.InterfaceC2541l
    public final C1038l loadAd() {
        return this.f4651l;
    }

    @Override // defpackage.InterfaceC2541l
    public final boolean mopub() {
        return crashlytics() == null;
    }

    public final ArrayList purchase(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4650l;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                C17132l.metrica(obj, "State is ");
                return null;
            }
            arrayList = (ArrayList) obj;
        }
        Throwable thCrashlytics = crashlytics();
        if (thCrashlytics != null) {
            arrayList.add(0, thCrashlytics);
        }
        if (th != null && !th.equals(thCrashlytics)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, AbstractC7114l.purchase);
        return arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(amazon());
        sb.append(", completing=");
        sb.append(f4649l.get(this) == 1);
        sb.append(", rootCause=");
        sb.append(crashlytics());
        sb.append(", exceptions=");
        sb.append(f4650l.get(this));
        sb.append(", list=");
        sb.append(this.f4651l);
        sb.append(']');
        return sb.toString();
    }

    public final void yandex(Throwable th) {
        Throwable thCrashlytics = crashlytics();
        if (thCrashlytics == null) {
            f4648l.set(this, th);
            return;
        }
        if (th == thCrashlytics) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4650l;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
                return;
            } else {
                C17132l.metrica(obj, "State is ");
                return;
            }
        }
        if (th == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }
}
