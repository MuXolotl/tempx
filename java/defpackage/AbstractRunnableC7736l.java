package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lًؓؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractRunnableC7736l implements Runnable, Comparable, InterfaceC11791l {
    private volatile Object _heap;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f16232l = -1;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public long f16233l;

    public AbstractRunnableC7736l(long j) {
        this.f16233l = j;
    }

    public final void amazon(C13755l c13755l) {
        if (this._heap != AbstractC16465l.yandex) {
            this._heap = c13755l;
        } else {
            C8339l.metrica("Failed requirement.");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f16233l - ((AbstractRunnableC7736l) obj).f16233l;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final int crashlytics(long j, C13755l c13755l, AbstractC11705l abstractC11705l) {
        synchronized (this) {
            if (this._heap == AbstractC16465l.yandex) {
                return 2;
            }
            synchronized (c13755l) {
                try {
                    AbstractRunnableC7736l[] abstractRunnableC7736lArr = c13755l.yandex;
                    AbstractRunnableC7736l abstractRunnableC7736l = abstractRunnableC7736lArr != null ? abstractRunnableC7736lArr[0] : null;
                    if (AbstractC11705l.f23454l.get(abstractC11705l) == 1) {
                        return 1;
                    }
                    if (abstractRunnableC7736l == null) {
                        c13755l.crashlytics = j;
                    } else {
                        long j2 = abstractRunnableC7736l.f16233l;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - c13755l.crashlytics > 0) {
                            c13755l.crashlytics = j;
                        }
                    }
                    long j3 = this.f16233l;
                    long j4 = c13755l.crashlytics;
                    if (j3 - j4 < 0) {
                        this.f16233l = j4;
                    }
                    c13755l.yandex(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final C8381l loadAd() {
        Object obj = this._heap;
        if (obj instanceof C8381l) {
            return (C8381l) obj;
        }
        return null;
    }

    public String toString() {
        return AbstractC12900l.smaato(new StringBuilder("Delayed[nanos="), this.f16233l, ']');
    }

    @Override // defpackage.InterfaceC11791l
    public final void yandex() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                C9676l c9676l = AbstractC16465l.yandex;
                if (obj == c9676l) {
                    return;
                }
                C13755l c13755l = obj instanceof C13755l ? (C13755l) obj : null;
                if (c13755l != null) {
                    c13755l.loadAd(this);
                }
                this._heap = c9676l;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
