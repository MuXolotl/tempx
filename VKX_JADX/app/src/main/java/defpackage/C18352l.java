package defpackage;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* JADX INFO: renamed from: l٘ۦٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18352l implements InterfaceC10506l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f35868l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public long f35869l = 0;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C13007l f35870l;

    public C18352l(C13007l c13007l) {
        this.f35870l = c13007l;
    }

    @Override // defpackage.InterfaceC10506l
    /* JADX INFO: renamed from: break */
    public final void mo390break(C0869l c0869l, long j) {
        if (this.f35868l) {
            C8339l.smaato("closed");
            return;
        }
        C13007l c13007l = this.f35870l;
        long j2 = this.f35869l;
        c13007l.getClass();
        AbstractC9334l.crashlytics(c0869l.f2526l, 0L, j);
        long j3 = j2 + j;
        while (j2 < j3) {
            C18346l c18346l = c0869l.f2527l;
            int iMin = (int) Math.min(j3 - j2, c18346l.crashlytics - c18346l.loadAd);
            byte[] bArr = c18346l.yandex;
            int i = c18346l.loadAd;
            synchronized (c13007l) {
                c13007l.f25487l.seek(j2);
                c13007l.f25487l.write(bArr, i, iMin);
            }
            int i2 = c18346l.loadAd + iMin;
            c18346l.loadAd = i2;
            long j4 = iMin;
            j2 += j4;
            c0869l.f2526l -= j4;
            if (i2 == c18346l.crashlytics) {
                c0869l.f2527l = c18346l.yandex();
                AbstractC18391l.yandex(c18346l);
            }
        }
        this.f35869l += j;
    }

    @Override // defpackage.InterfaceC10506l, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C13007l c13007l = this.f35870l;
        if (this.f35868l) {
            return;
        }
        this.f35868l = true;
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

    @Override // defpackage.InterfaceC10506l, java.io.Flushable
    public final void flush() {
        if (this.f35868l) {
            C8339l.smaato("closed");
            return;
        }
        C13007l c13007l = this.f35870l;
        synchronized (c13007l) {
            c13007l.f25487l.getFD().sync();
        }
    }

    @Override // defpackage.InterfaceC10506l
    public final C3446l isPro() {
        return C3446l.amazon;
    }
}
