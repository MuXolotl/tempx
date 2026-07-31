package defpackage;

import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lؚّٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14000l implements InterfaceC9433l {
    public InterfaceC0612l admob;
    public final ArrayDeque amazon;
    public C5978l billing;
    public final C14699l crashlytics;
    public InterfaceC15310l isPro;
    public final C8887l loadAd;
    public long mopub;
    public Surface purchase;
    public Executor subs;
    public final C7578l yandex;

    public C14000l(C7578l c7578l, C8887l c8887l, C18527l c18527l) {
        this.yandex = c7578l;
        this.loadAd = c8887l;
        c7578l.smaato = c18527l;
        this.crashlytics = new C14699l(new C0458l(this), c7578l, c8887l);
        this.amazon = new ArrayDeque();
        this.billing = new C5978l(new C12984l());
        this.mopub = -9223372036854775807L;
        this.admob = InterfaceC0612l.f2067l;
        this.subs = new ExecutorC11374l(1);
        this.isPro = new C17581l();
    }

    @Override // defpackage.InterfaceC9433l
    public final void Signature(Surface surface, C5989l c5989l) {
        this.purchase = surface;
        this.yandex.mopub(surface);
    }

    @Override // defpackage.InterfaceC9433l
    public final void adcel(boolean z) {
        this.yandex.crashlytics(z);
    }

    @Override // defpackage.InterfaceC9433l
    public final boolean admob() {
        C14699l c14699l = this.crashlytics;
        long j = c14699l.isPro;
        return j != -9223372036854775807L && c14699l.subs == j;
    }

    @Override // defpackage.InterfaceC9433l
    public final boolean ads(boolean z) {
        return this.yandex.loadAd(z);
    }

    @Override // defpackage.InterfaceC9433l
    public final void amazon() {
        this.loadAd.loadAd();
        this.yandex.amazon();
    }

    @Override // defpackage.InterfaceC9433l
    public final void billing(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.InterfaceC9433l
    public final void crashlytics(float f) {
        this.yandex.admob(f);
    }

    @Override // defpackage.InterfaceC9433l
    public final void firebase() {
        this.purchase = null;
        this.yandex.mopub(null);
    }

    @Override // defpackage.InterfaceC9433l
    public final Surface getInputSurface() {
        Surface surface = this.purchase;
        surface.getClass();
        return surface;
    }

    @Override // defpackage.InterfaceC9433l
    public final void isPro(int i) {
        C7048l c7048l = this.yandex.loadAd;
        if (c7048l.isPro == i) {
            return;
        }
        c7048l.isPro = i;
        c7048l.amazon(true);
    }

    @Override // defpackage.InterfaceC9433l
    public final void license() {
        C7578l c7578l = this.yandex;
        if (c7578l.purchase == 0) {
            c7578l.purchase = 1;
        }
    }

    @Override // defpackage.InterfaceC9433l
    public final void loadAd() {
        this.loadAd.loadAd();
        C7578l c7578l = this.yandex;
        c7578l.amazon = false;
        c7578l.subs = -9223372036854775807L;
        C7048l c7048l = c7578l.loadAd;
        c7048l.amazon = false;
        AbstractC16097l abstractC16097l = c7048l.crashlytics;
        if (abstractC16097l != null) {
            abstractC16097l.loadAd();
        }
        c7048l.yandex();
    }

    @Override // defpackage.InterfaceC9433l
    public final void metrica(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.InterfaceC9433l
    public final void mopub(C10685l c10685l) {
        this.admob = c10685l;
        this.subs = EnumC1535l.f3808l;
    }

    @Override // defpackage.InterfaceC9433l
    public final void purchase(C5978l c5978l, long j, int i, List list) {
        AbstractC12442l.subscription(list.isEmpty());
        int i2 = c5978l.license;
        int i3 = c5978l.pro;
        C5978l c5978l2 = this.billing;
        int i4 = c5978l2.license;
        C14699l c14699l = this.crashlytics;
        if (i2 != i4 || i3 != c5978l2.pro) {
            C11522l c11522l = c14699l.amazon;
            long j2 = c14699l.admob;
            c11522l.billing(j2 == -9223372036854775807L ? 0L : j2 + 1, new C15074l(i2, i3));
        }
        float f = c5978l.isVip;
        if (f != this.billing.isVip) {
            this.yandex.billing(f);
        }
        this.billing = c5978l;
        if (j != this.mopub) {
            if (c14699l.billing.f15052l == 0) {
                c14699l.loadAd.purchase(i);
                c14699l.smaato = j;
            } else {
                C11522l c11522l2 = c14699l.purchase;
                long j3 = c14699l.admob;
                c11522l2.billing(j3 == -9223372036854775807L ? -4611686018427387904L : j3 + 1, Long.valueOf(j));
            }
            this.mopub = j;
        }
    }

    @Override // defpackage.InterfaceC9433l
    public final boolean remoteconfig(C5978l c5978l) {
        return true;
    }

    @Override // defpackage.InterfaceC9433l
    public final boolean smaato(long j, C9809l c9809l) {
        this.amazon.add(c9809l);
        C14699l c14699l = this.crashlytics;
        C7221l c7221l = c14699l.billing;
        int i = c7221l.f15052l;
        long[] jArr = (long[]) c7221l.f15053l;
        if (i == jArr.length) {
            int length = jArr.length << 1;
            if (length < 0) {
                C18073l.admob();
                return false;
            }
            long[] jArr2 = new long[length];
            int length2 = jArr.length;
            int i2 = c7221l.f15049l;
            int i3 = length2 - i2;
            System.arraycopy(jArr, i2, jArr2, 0, i3);
            System.arraycopy((long[]) c7221l.f15053l, 0, jArr2, i3, i2);
            c7221l.f15049l = 0;
            c7221l.f15048l = c7221l.f15052l - 1;
            c7221l.f15053l = jArr2;
            c7221l.f15051l = length - 1;
        }
        int i4 = (c7221l.f15048l + 1) & c7221l.f15051l;
        c7221l.f15048l = i4;
        ((long[]) c7221l.f15053l)[i4] = j;
        c7221l.f15052l++;
        c14699l.admob = j;
        c14699l.isPro = -9223372036854775807L;
        this.subs.execute(new RunnableC11297l(0, this));
        return true;
    }

    @Override // defpackage.InterfaceC9433l
    public final void startapp(long j, long j2) {
        try {
            this.crashlytics.yandex(j, j2);
        } catch (C17361l e) {
            throw new C18714l(e, this.billing);
        }
    }

    @Override // defpackage.InterfaceC9433l
    public final void subs() {
        C14699l c14699l = this.crashlytics;
        if (c14699l.admob == -9223372036854775807L) {
            c14699l.admob = Long.MIN_VALUE;
            c14699l.subs = Long.MIN_VALUE;
        }
        c14699l.isPro = c14699l.admob;
    }

    @Override // defpackage.InterfaceC9433l
    public final void subscription(InterfaceC15310l interfaceC15310l) {
        this.isPro = interfaceC15310l;
    }

    @Override // defpackage.InterfaceC9433l
    public final void tapsense() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.InterfaceC9433l
    public final void vip(boolean z) {
        if (z) {
            C7578l c7578l = this.yandex;
            c7578l.loadAd.loadAd();
            c7578l.admob = -9223372036854775807L;
            c7578l.billing = -9223372036854775807L;
            c7578l.purchase = Math.min(c7578l.purchase, 1);
            c7578l.subs = -9223372036854775807L;
            c7578l.vip = false;
        }
        this.loadAd.loadAd();
        C14699l c14699l = this.crashlytics;
        C11522l c11522l = c14699l.amazon;
        C7221l c7221l = c14699l.billing;
        c7221l.f15049l = 0;
        c7221l.f15048l = -1;
        c7221l.f15052l = 0;
        c14699l.admob = -9223372036854775807L;
        c14699l.subs = -9223372036854775807L;
        c14699l.isPro = -9223372036854775807L;
        C11522l c11522l2 = c14699l.purchase;
        if (c11522l2.m3116new() > 0) {
            AbstractC12442l.admob(c11522l2.m3116new() > 0);
            while (c11522l2.m3116new() > 1) {
                c11522l2.m3123switch();
            }
            Object objM3123switch = c11522l2.m3123switch();
            objM3123switch.getClass();
            c14699l.smaato = ((Long) objM3123switch).longValue();
        }
        if (c11522l.m3116new() > 0) {
            AbstractC12442l.admob(c11522l.m3116new() > 0);
            while (c11522l.m3116new() > 1) {
                c11522l.m3123switch();
            }
            Object objM3123switch2 = c11522l.m3123switch();
            objM3123switch2.getClass();
            c11522l.billing(0L, (C15074l) objM3123switch2);
        }
        this.amazon.clear();
    }

    @Override // defpackage.InterfaceC9433l
    public final boolean yandex() {
        return true;
    }

    @Override // defpackage.InterfaceC9433l
    public final void release() {
    }
}
