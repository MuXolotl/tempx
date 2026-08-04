package defpackage;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* JADX INFO: renamed from: lُْْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13289l implements InterfaceC14991l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f26069l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public long f26070l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C13007l f26071l;

    public C13289l(C13007l c13007l, long j) {
        this.f26071l = c13007l;
        this.f26070l = j;
    }

    @Override // defpackage.InterfaceC14991l
    public final long ad(C0869l c0869l, long j) {
        long j2;
        long j3;
        int i;
        if (this.f26069l) {
            C8339l.smaato("closed");
            return 0L;
        }
        C13007l c13007l = this.f26071l;
        long j4 = this.f26070l;
        if (j < 0) {
            C10754l.metrica(AbstractC2812l.ads(j, "byteCount < 0: "));
            return 0L;
        }
        long j5 = j + j4;
        long j6 = j4;
        while (true) {
            if (j6 < j5) {
                C18346l c18346lM730super = c0869l.m730super(1);
                byte[] bArr = c18346lM730super.yandex;
                int i2 = c18346lM730super.crashlytics;
                j2 = -1;
                int iMin = (int) Math.min(j5 - j6, 8192 - i2);
                synchronized (c13007l) {
                    c13007l.f25487l.seek(j6);
                    i = 0;
                    while (true) {
                        if (i < iMin) {
                            int i3 = c13007l.f25487l.read(bArr, i2, iMin - i);
                            if (i3 != -1) {
                                i += i3;
                            } else if (i == 0) {
                                i = -1;
                                break;
                            }
                        }
                        break;
                    }
                }
                if (i == -1) {
                    if (c18346lM730super.loadAd == c18346lM730super.crashlytics) {
                        c0869l.f2527l = c18346lM730super.yandex();
                        AbstractC18391l.yandex(c18346lM730super);
                    }
                    if (j4 == j6) {
                        j3 = -1;
                        break;
                    }
                } else {
                    c18346lM730super.crashlytics += i;
                    long j7 = i;
                    j6 += j7;
                    c0869l.f2526l += j7;
                }
            } else {
                j2 = -1;
            }
            j3 = j6 - j4;
            break;
        }
        if (j3 != j2) {
            this.f26070l += j3;
        }
        return j3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C13007l c13007l = this.f26071l;
        if (this.f26069l) {
            return;
        }
        this.f26069l = true;
        ReentrantLock reentrantLock = c13007l.f25488l;
        reentrantLock.lock();
        try {
            int i = c13007l.f25484l - 1;
            c13007l.f25484l = i;
            if (i == 0 && c13007l.f25485l) {
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
                synchronized (c13007l) {
                    c13007l.f25487l.close();
                }
                return;
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.InterfaceC14991l
    public final C3446l isPro() {
        return C3446l.amazon;
    }
}
