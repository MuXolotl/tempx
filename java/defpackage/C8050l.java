package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lًٗٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8050l implements Closeable {

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public static final C8463l f16752l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C10111l f16753l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public long f16754l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final String f16755l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C3097l f16756l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public long f16757l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public long f16758l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C7522l f16759l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final C12682l f16760l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final C0340l f16761l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final LinkedHashMap f16762l = new LinkedHashMap();

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC10039l f16763l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C0386l f16764l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final C8463l f16765l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public final LinkedHashSet f16766l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C7522l f16767l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public long f16768l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f16769l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f16770l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public long f16771l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C7522l f16772l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public boolean f16773l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final C11140l f16774l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public long f16775l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public C8463l f16776l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final C13987l f16777l;

    static {
        C8463l c8463l = new C8463l();
        c8463l.loadAd(4, 65535);
        c8463l.loadAd(5, 16384);
        f16752l = c8463l;
    }

    public C8050l(C11644l c11644l) {
        this.f16763l = (AbstractC10039l) c11644l.f23360l;
        String str = (String) c11644l.f23361l;
        this.f16755l = str == null ? null : str;
        this.f16769l = 3;
        C3097l c3097l = (C3097l) c11644l.f23358l;
        this.f16756l = c3097l;
        this.f16759l = c3097l.amazon();
        this.f16772l = c3097l.amazon();
        this.f16767l = c3097l.amazon();
        this.f16774l = C11140l.f22374l;
        this.f16760l = (C12682l) c11644l.f23362l;
        C8463l c8463l = new C8463l();
        c8463l.loadAd(4, 16777216);
        this.f16765l = c8463l;
        C8463l c8463l2 = f16752l;
        this.f16776l = c8463l2;
        this.f16764l = new C0386l(0);
        this.f16757l = c8463l2.yandex();
        C10111l c10111l = (C10111l) c11644l.f23357l;
        C10111l c10111l2 = c10111l != null ? c10111l : null;
        this.f16753l = c10111l2;
        this.f16777l = new C13987l((C7167l) c10111l2.f20589l);
        this.f16761l = new C0340l(this, new C4593l((C1503l) c10111l2.f20586l), 22);
        this.f16766l = new LinkedHashSet();
    }

    public final void adcel(int i) {
        synchronized (this.f16777l) {
            synchronized (this) {
                if (this.f16773l) {
                    return;
                }
                this.f16773l = true;
                int i2 = this.f16770l;
                Unit unit = Unit.INSTANCE;
                this.f16777l.vip(i2, i, AbstractC7712l.yandex);
            }
        }
    }

    public final void ads(long j) {
        synchronized (this) {
            try {
                C0386l.crashlytics(this.f16764l, j, 0L, 2);
                long jLoadAd = this.f16764l.loadAd();
                if (jLoadAd >= this.f16765l.yandex() / 2) {
                    inmobi(0, jLoadAd);
                    C0386l.crashlytics(this.f16764l, 0L, jLoadAd, 1);
                }
                this.f16760l.getClass();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C0374l billing(int i) {
        C0374l c0374l;
        synchronized (this) {
            c0374l = (C0374l) this.f16762l.get(Integer.valueOf(i));
        }
        return c0374l;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        yandex(1, 9, null);
    }

    public final void inmobi(final int i, final long j) {
        C7522l.crashlytics(this.f16759l, this.f16755l + '[' + i + "] windowUpdate", 0L, new Function0() { // from class: lؔٙۛ
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                C8050l c8050l = this.f5886l;
                try {
                    c8050l.f16777l.inmobi(i, j);
                } catch (IOException e) {
                    c8050l.yandex(2, 2, e);
                }
                return Unit.INSTANCE;
            }
        }, 6);
    }

    public final void isVip(int i, boolean z, C0869l c0869l, long j) {
        long j2;
        long j3;
        int iMin;
        long j4;
        if (j == 0) {
            this.f16777l.billing(z, i, c0869l, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j2 = this.f16758l;
                            j3 = this.f16757l;
                            if (j2 >= j3) {
                                if (!this.f16762l.containsKey(Integer.valueOf(i))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                iMin = Math.min((int) Math.min(j, j3 - j2), this.f16777l.f27288l);
                j4 = iMin;
                this.f16758l += j4;
                Unit unit = Unit.INSTANCE;
            }
            j -= j4;
            this.f16777l.billing(z && j == 0, i, c0869l, iMin);
        }
    }

    public final boolean mopub(long j) {
        synchronized (this) {
            if (this.f16773l) {
                return false;
            }
            return this.f16775l >= this.f16754l || j < this.f16768l;
        }
    }

    public final void signatures(int i, int i2) {
        C7522l.crashlytics(this.f16759l, this.f16755l + '[' + i + "] writeSynReset", 0L, new C6861l(this, i, i2, 0), 6);
    }

    public final C0374l vip(int i) {
        C0374l c0374l;
        synchronized (this) {
            c0374l = (C0374l) this.f16762l.remove(Integer.valueOf(i));
            notifyAll();
        }
        return c0374l;
    }

    public final void yandex(int i, int i2, IOException iOException) {
        int i3;
        Object[] array;
        TimeZone timeZone = AbstractC11432l.yandex;
        try {
            adcel(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.f16762l.isEmpty()) {
                    array = null;
                } else {
                    array = this.f16762l.values().toArray(new C0374l[0]);
                    this.f16762l.clear();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        C0374l[] c0374lArr = (C0374l[]) array;
        if (c0374lArr != null) {
            for (C0374l c0374l : c0374lArr) {
                try {
                    c0374l.crashlytics(i2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f16777l.close();
        } catch (IOException unused3) {
        }
        try {
            this.f16753l.cancel();
        } catch (IOException unused4) {
        }
        this.f16759l.billing();
        this.f16772l.billing();
        this.f16767l.billing();
    }
}
