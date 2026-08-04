package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: lٗۖۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17328l implements InterfaceC12313l {
    public int admob;
    public final AbstractC11739l[] billing;
    public boolean firebase;
    public AbstractC4008l isPro;
    public int mopub;
    public final C4136l[] purchase;
    public boolean smaato;
    public C4136l subs;
    public final C12839l yandex;
    public final Object loadAd = new Object();
    public long remoteconfig = -9223372036854775807L;
    public final ArrayDeque crashlytics = new ArrayDeque();
    public final ArrayDeque amazon = new ArrayDeque();

    public AbstractC17328l(C4136l[] c4136lArr, AbstractC11739l[] abstractC11739lArr) {
        this.purchase = c4136lArr;
        this.mopub = c4136lArr.length;
        for (int i = 0; i < this.mopub; i++) {
            this.purchase[i] = billing();
        }
        this.billing = abstractC11739lArr;
        this.admob = abstractC11739lArr.length;
        for (int i2 = 0; i2 < this.admob; i2++) {
            this.billing[i2] = mopub();
        }
        C12839l c12839l = new C12839l(this);
        this.yandex = c12839l;
        c12839l.start();
    }

    public abstract AbstractC4008l admob(Throwable th);

    @Override // defpackage.InterfaceC12313l
    public final Object amazon() {
        C4136l c4136l;
        synchronized (this.loadAd) {
            try {
                AbstractC4008l abstractC4008l = this.isPro;
                if (abstractC4008l != null) {
                    throw abstractC4008l;
                }
                AbstractC12442l.subscription(this.subs == null);
                int i = this.mopub;
                if (i == 0) {
                    c4136l = null;
                } else {
                    C4136l[] c4136lArr = this.purchase;
                    int i2 = i - 1;
                    this.mopub = i2;
                    c4136l = c4136lArr[i2];
                }
                this.subs = c4136l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4136l;
    }

    public abstract C4136l billing();

    @Override // defpackage.InterfaceC12313l
    /* JADX INFO: renamed from: firebase, reason: merged with bridge method [inline-methods] */
    public final AbstractC11739l crashlytics() {
        synchronized (this.loadAd) {
            try {
                AbstractC4008l abstractC4008l = this.isPro;
                if (abstractC4008l != null) {
                    throw abstractC4008l;
                }
                if (this.amazon.isEmpty()) {
                    return null;
                }
                return (AbstractC11739l) this.amazon.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC12313l
    public final void flush() {
        synchronized (this.loadAd) {
            try {
                this.firebase = true;
                C4136l c4136l = this.subs;
                if (c4136l != null) {
                    c4136l.remoteconfig();
                    C4136l[] c4136lArr = this.purchase;
                    int i = this.mopub;
                    this.mopub = i + 1;
                    c4136lArr[i] = c4136l;
                    this.subs = null;
                }
                while (!this.crashlytics.isEmpty()) {
                    C4136l c4136l2 = (C4136l) this.crashlytics.removeFirst();
                    c4136l2.remoteconfig();
                    C4136l[] c4136lArr2 = this.purchase;
                    int i2 = this.mopub;
                    this.mopub = i2 + 1;
                    c4136lArr2[i2] = c4136l2;
                }
                while (!this.amazon.isEmpty()) {
                    ((AbstractC11739l) this.amazon.removeFirst()).vip();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean isPro() {
        AbstractC4008l abstractC4008lAdmob;
        synchronized (this.loadAd) {
            while (!this.smaato) {
                try {
                    if (!this.crashlytics.isEmpty() && this.admob > 0) {
                        break;
                    }
                    this.loadAd.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.smaato) {
                return false;
            }
            C4136l c4136l = (C4136l) this.crashlytics.removeFirst();
            AbstractC11739l[] abstractC11739lArr = this.billing;
            int i = this.admob - 1;
            this.admob = i;
            AbstractC11739l abstractC11739l = abstractC11739lArr[i];
            boolean z = this.firebase;
            this.firebase = false;
            if (c4136l.crashlytics(4)) {
                abstractC11739l.yandex(4);
            } else {
                abstractC11739l.f23515l = c4136l.f8496l;
                if (c4136l.crashlytics(134217728)) {
                    abstractC11739l.yandex(134217728);
                }
                if (!smaato(c4136l.f8496l)) {
                    abstractC11739l.f23516l = true;
                }
                try {
                    abstractC4008lAdmob = subs(c4136l, abstractC11739l, z);
                } catch (OutOfMemoryError e) {
                    abstractC4008lAdmob = admob(e);
                } catch (RuntimeException e2) {
                    abstractC4008lAdmob = admob(e2);
                }
                if (abstractC4008lAdmob != null) {
                    synchronized (this.loadAd) {
                        this.isPro = abstractC4008lAdmob;
                    }
                    return false;
                }
            }
            synchronized (this.loadAd) {
                try {
                    if (this.firebase || abstractC11739l.f23516l) {
                        abstractC11739l.vip();
                    } else {
                        this.amazon.addLast(abstractC11739l);
                    }
                    c4136l.remoteconfig();
                    C4136l[] c4136lArr = this.purchase;
                    int i2 = this.mopub;
                    this.mopub = i2 + 1;
                    c4136lArr[i2] = c4136l;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
    }

    public abstract AbstractC11739l mopub();

    @Override // defpackage.InterfaceC12313l
    public final void release() {
        synchronized (this.loadAd) {
            this.smaato = true;
            this.loadAd.notify();
        }
        try {
            this.yandex.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // defpackage.InterfaceC12313l
    /* JADX INFO: renamed from: remoteconfig, reason: merged with bridge method [inline-methods] */
    public final void purchase(C4136l c4136l) {
        synchronized (this.loadAd) {
            try {
                AbstractC4008l abstractC4008l = this.isPro;
                if (abstractC4008l != null) {
                    throw abstractC4008l;
                }
                AbstractC12442l.admob(c4136l == this.subs);
                this.crashlytics.addLast(c4136l);
                if (!this.crashlytics.isEmpty() && this.admob > 0) {
                    this.loadAd.notify();
                }
                this.subs = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean smaato(long j) {
        boolean z;
        synchronized (this.loadAd) {
            long j2 = this.remoteconfig;
            z = j2 == -9223372036854775807L || j >= j2;
        }
        return z;
    }

    public abstract AbstractC4008l subs(C4136l c4136l, AbstractC11739l abstractC11739l, boolean z);

    public final void vip(AbstractC11739l abstractC11739l) {
        synchronized (this.loadAd) {
            abstractC11739l.remoteconfig();
            AbstractC11739l[] abstractC11739lArr = this.billing;
            int i = this.admob;
            this.admob = i + 1;
            abstractC11739lArr[i] = abstractC11739l;
            if (!this.crashlytics.isEmpty() && this.admob > 0) {
                this.loadAd.notify();
            }
        }
    }

    @Override // defpackage.InterfaceC12313l
    public final void yandex(long j) {
        synchronized (this.loadAd) {
            try {
                AbstractC12442l.subscription(this.mopub == this.purchase.length || this.firebase);
                this.remoteconfig = j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
