package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: lًۡۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C8327l {
    volatile /* synthetic */ Object _next = this;
    volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object removedRef = null;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f17222l = AtomicReferenceFieldUpdater.newUpdater(C8327l.class, Object.class, "_next");

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f17221l = AtomicReferenceFieldUpdater.newUpdater(C8327l.class, Object.class, "_prev");

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f17220l = AtomicReferenceFieldUpdater.newUpdater(C8327l.class, Object.class, "removedRef");

    public final C8327l crashlytics() {
        C8327l c8327lRemoteconfig;
        while (true) {
            Object obj = this._prev;
            if (obj instanceof C4760l) {
                return ((C4760l) obj).yandex;
            }
            if (obj == this) {
                c8327lRemoteconfig = this;
                while (!(c8327lRemoteconfig instanceof C8029l)) {
                    c8327lRemoteconfig = AbstractC2632l.remoteconfig(c8327lRemoteconfig._next);
                    if (c8327lRemoteconfig == this) {
                        C8339l.smaato("Cannot loop to this while looking for list head");
                        return null;
                    }
                }
            } else {
                c8327lRemoteconfig = (C8327l) obj;
            }
            C4760l c4760l = (C4760l) c8327lRemoteconfig.removedRef;
            if (c4760l == null) {
                c4760l = new C4760l(c8327lRemoteconfig);
                f17220l.lazySet(c8327lRemoteconfig, c4760l);
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17221l;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c4760l)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                }
            }
            return (C8327l) obj;
        }
    }

    public final void loadAd(C8327l c8327l) {
        Object obj;
        while (true) {
            C8327l c8327l2 = null;
            while (true) {
                obj = c8327l._next;
                if (obj == null) {
                    return;
                }
                if (!(obj instanceof C4760l)) {
                    Object obj2 = this._prev;
                    if (obj2 instanceof C4760l) {
                        return;
                    }
                    if (obj != this) {
                        c8327l2 = c8327l;
                        c8327l = (C8327l) obj;
                    } else {
                        if (obj2 == c8327l) {
                            return;
                        }
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17221l;
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, c8327l)) {
                                if (c8327l._prev instanceof C4760l) {
                                    break;
                                } else {
                                    return;
                                }
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == obj2);
                    }
                } else if (c8327l2 != null) {
                    break;
                } else {
                    c8327l = AbstractC2632l.remoteconfig(c8327l._prev);
                }
            }
            c8327l.crashlytics();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f17222l;
            C8327l c8327l3 = ((C4760l) obj).yandex;
            while (!atomicReferenceFieldUpdater2.compareAndSet(c8327l2, c8327l, c8327l3) && atomicReferenceFieldUpdater2.get(c8327l2) == c8327l) {
            }
            c8327l = c8327l2;
        }
    }

    public final String toString() {
        return AbstractC18202l.yandex.loadAd(getClass()).license() + '@' + hashCode();
    }

    public void yandex() {
        Object obj;
        C8327l c8327lRemoteconfig;
        while (true) {
            Object obj2 = this._next;
            if ((obj2 instanceof C4760l) || obj2 == this) {
                return;
            }
            C8327l c8327l = (C8327l) obj2;
            C4760l c4760l = (C4760l) c8327l.removedRef;
            if (c4760l == null) {
                c4760l = new C4760l(c8327l);
                f17220l.lazySet(c8327l, c4760l);
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17222l;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, c4760l)) {
                    C8327l c8327lCrashlytics = crashlytics();
                    C8327l c8327l2 = ((C4760l) this._next).yandex;
                    loop2: while (true) {
                        C8327l c8327l3 = null;
                        while (true) {
                            Object obj3 = c8327l2._next;
                            if (obj3 instanceof C4760l) {
                                c8327l2.crashlytics();
                                c8327l2 = ((C4760l) obj3).yandex;
                            } else {
                                obj = c8327lCrashlytics._next;
                                if (obj instanceof C4760l) {
                                    if (c8327l3 != null) {
                                        break;
                                    } else {
                                        c8327lRemoteconfig = AbstractC2632l.remoteconfig(c8327lCrashlytics._prev);
                                    }
                                } else if (obj != this) {
                                    c8327lRemoteconfig = (C8327l) obj;
                                    if (c8327lRemoteconfig == c8327l2) {
                                        break loop2;
                                    } else {
                                        c8327l3 = c8327lCrashlytics;
                                    }
                                } else {
                                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f17222l;
                                    do {
                                        if (atomicReferenceFieldUpdater2.compareAndSet(c8327lCrashlytics, this, c8327l2)) {
                                            break loop2;
                                        }
                                    } while (atomicReferenceFieldUpdater2.get(c8327lCrashlytics) == this);
                                }
                                c8327lCrashlytics = c8327lRemoteconfig;
                            }
                        }
                        c8327lCrashlytics.crashlytics();
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f17222l;
                        C8327l c8327l4 = ((C4760l) obj).yandex;
                        while (!atomicReferenceFieldUpdater3.compareAndSet(c8327l3, c8327lCrashlytics, c8327l4) && atomicReferenceFieldUpdater3.get(c8327l3) == c8327lCrashlytics) {
                        }
                        c8327lCrashlytics = c8327l3;
                    }
                    c8327l.loadAd(AbstractC2632l.remoteconfig(this._prev));
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }
}
