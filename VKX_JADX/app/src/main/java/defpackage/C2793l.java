package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: lؔٞٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2793l implements InterfaceC9433l {
    public long amazon;
    public final /* synthetic */ C14600l billing;
    public long crashlytics;
    public C5978l loadAd;
    public int purchase;
    public AbstractC1186l yandex;

    public C2793l(C14600l c14600l, Context context) {
        this.billing = c14600l;
        AbstractC15323l.m3984throw(context);
        C9258l c9258l = AbstractC1186l.f3181l;
        this.yandex = C13708l.f26763l;
        this.amazon = -9223372036854775807L;
    }

    @Override // defpackage.InterfaceC9433l
    public final void Signature(Surface surface, C5989l c5989l) {
        C14600l c14600l = this.billing;
        Pair pair = c14600l.smaato;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((C5989l) c14600l.smaato.second).equals(c5989l)) {
            return;
        }
        c14600l.smaato = Pair.create(surface, c5989l);
        int i = c5989l.yandex;
    }

    @Override // defpackage.InterfaceC9433l
    public final void adcel(boolean z) {
        C14600l c14600l = this.billing;
        if (c14600l.amazon) {
            c14600l.purchase.adcel(z);
        }
    }

    @Override // defpackage.InterfaceC9433l
    public final boolean admob() {
        return false;
    }

    @Override // defpackage.InterfaceC9433l
    public final boolean ads(boolean z) {
        return this.billing.purchase.yandex.loadAd(false);
    }

    @Override // defpackage.InterfaceC9433l
    public final void amazon() {
        C14600l c14600l = this.billing;
        if (c14600l.amazon) {
            c14600l.purchase.amazon();
        }
    }

    @Override // defpackage.InterfaceC9433l
    public final void billing(long j) {
        this.crashlytics = j;
    }

    @Override // defpackage.InterfaceC9433l
    public final void crashlytics(float f) {
        C14600l c14600l = this.billing;
        c14600l.subs.crashlytics(f);
        c14600l.purchase.crashlytics(f);
    }

    @Override // defpackage.InterfaceC9433l
    public final void firebase() {
        int i = C5989l.crashlytics.yandex;
        this.billing.smaato = null;
    }

    @Override // defpackage.InterfaceC9433l
    public final Surface getInputSurface() {
        AbstractC12442l.subscription(false);
        throw null;
    }

    @Override // defpackage.InterfaceC9433l
    public final void isPro(int i) {
        this.billing.purchase.isPro(i);
    }

    @Override // defpackage.InterfaceC9433l
    public final void license() {
        C14600l c14600l = this.billing;
        if (c14600l.isPro.m3116new() == 0) {
            c14600l.purchase.license();
            return;
        }
        C11522l c11522l = new C11522l();
        if (c14600l.isPro.m3116new() <= 0) {
            c14600l.isPro = c11522l;
        } else {
            ((AbstractC12627l) c14600l.isPro.m3123switch()).getClass();
            throw null;
        }
    }

    @Override // defpackage.InterfaceC9433l
    public final void loadAd() {
        C14600l c14600l = this.billing;
        if (c14600l.amazon) {
            c14600l.purchase.loadAd();
        }
    }

    @Override // defpackage.InterfaceC9433l
    public final void metrica(List list) {
        if (this.yandex.equals(list)) {
            return;
        }
        this.yandex = AbstractC1186l.Signature(list);
        C5978l c5978l = this.loadAd;
        if (c5978l == null) {
            return;
        }
        C12984l c12984lYandex = c5978l.yandex();
        C1591l c1591l = c5978l.inmobi;
        if (c1591l == null || !c1591l.amazon()) {
            c1591l = C1591l.admob;
        }
        c12984lYandex.appmetrica = c1591l;
        c12984lYandex.yandex();
        throw null;
    }

    @Override // defpackage.InterfaceC9433l
    public final void purchase(C5978l c5978l, long j, int i, List list) {
        AbstractC12442l.subscription(false);
        this.yandex = AbstractC1186l.Signature(list);
        this.loadAd = c5978l;
        C12984l c12984lYandex = c5978l.yandex();
        C1591l c1591l = c5978l.inmobi;
        if (c1591l == null || !c1591l.amazon()) {
            c1591l = C1591l.admob;
        }
        c12984lYandex.appmetrica = c1591l;
        c12984lYandex.yandex();
        throw null;
    }

    @Override // defpackage.InterfaceC9433l
    public final void release() {
        C14600l c14600l = this.billing;
        if (c14600l.vip == 2) {
            return;
        }
        C14500l c14500l = c14600l.firebase;
        if (c14500l != null) {
            c14500l.purchase();
        }
        c14600l.smaato = null;
        c14600l.vip = 2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    /* JADX WARN: Code duplicated, block: B:28:0x005a A[Catch: lٍؙٔ -> 0x003a, TryCatch #0 {lٍؙٔ -> 0x003a, blocks: (B:14:0x002a, B:17:0x0032, B:25:0x0041, B:28:0x005a, B:30:0x005e, B:37:0x0071, B:40:0x0078, B:45:0x009a, B:34:0x0067), top: B:50:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:30:0x005e A[Catch: lٍؙٔ -> 0x003a, TryCatch #0 {lٍؙٔ -> 0x003a, blocks: (B:14:0x002a, B:17:0x0032, B:25:0x0041, B:28:0x005a, B:30:0x005e, B:37:0x0071, B:40:0x0078, B:45:0x009a, B:34:0x0067), top: B:50:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0065 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0067 A[Catch: lٍؙٔ -> 0x003a, TryCatch #0 {lٍؙٔ -> 0x003a, blocks: (B:14:0x002a, B:17:0x0032, B:25:0x0041, B:28:0x005a, B:30:0x005e, B:37:0x0071, B:40:0x0078, B:45:0x009a, B:34:0x0067), top: B:50:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:35:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071 A[Catch: lٍؙٔ -> 0x003a, TryCatch #0 {lٍؙٔ -> 0x003a, blocks: (B:14:0x002a, B:17:0x0032, B:25:0x0041, B:28:0x005a, B:30:0x005e, B:37:0x0071, B:40:0x0078, B:45:0x009a, B:34:0x0067), top: B:50:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0093  */
    /* JADX WARN: Code duplicated, block: B:43:0x0096  */
    /* JADX WARN: Code duplicated, block: B:45:0x009a A[Catch: lٍؙٔ -> 0x003a, TRY_LEAVE, TryCatch #0 {lٍؙٔ -> 0x003a, blocks: (B:14:0x002a, B:17:0x0032, B:25:0x0041, B:28:0x005a, B:30:0x005e, B:37:0x0071, B:40:0x0078, B:45:0x009a, B:34:0x0067), top: B:50:0x002a }] */
    @Override // defpackage.InterfaceC9433l
    public final boolean remoteconfig(C5978l c5978l) throws C18714l {
        C14600l c14600l = this.billing;
        boolean zAmazon = false;
        AbstractC12442l.subscription(c14600l.vip == 0);
        C1591l c1591l = c5978l.inmobi;
        if (c1591l == null || !c1591l.amazon()) {
            c1591l = C1591l.admob;
        }
        int i = c1591l.crashlytics;
        if (i == 7) {
            try {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 34) {
                    if (i == 6) {
                        if (Build.VERSION.SDK_INT < 33 && AbstractC15235l.amazon("EGL_EXT_gl_colorspace_bt2020_pq")) {
                            zAmazon = true;
                        }
                    } else if (i == 7) {
                        zAmazon = AbstractC15235l.amazon("EGL_EXT_gl_colorspace_bt2020_hlg");
                    } else {
                        zAmazon = true;
                    }
                    if (zAmazon && Build.VERSION.SDK_INT >= 29) {
                        Locale locale = Locale.US;
                        AbstractC6427l.vip("PlaybackVidGraphWrapper", "Color transfer " + i + " is not supported. Falling back to OpenGl tone mapping.");
                        c1591l = C1591l.admob;
                    } else if (i != 2 || i == 10) {
                        c1591l = C1591l.admob;
                    }
                } else {
                    if (i2 >= 33 && AbstractC15235l.amazon("EGL_EXT_gl_colorspace_bt2020_pq")) {
                        c1591l = new C1591l(c1591l.yandex, c1591l.loadAd, 6, c1591l.amazon, c1591l.purchase, c1591l.billing);
                    } else {
                        if (i == 6) {
                            if (Build.VERSION.SDK_INT < 33) {
                            }
                        } else if (i == 7) {
                            zAmazon = AbstractC15235l.amazon("EGL_EXT_gl_colorspace_bt2020_hlg");
                        } else {
                            zAmazon = true;
                        }
                        if (zAmazon) {
                            if (i != 2) {
                                c1591l = C1591l.admob;
                            } else {
                                c1591l = C1591l.admob;
                            }
                        } else if (i != 2) {
                            c1591l = C1591l.admob;
                        } else {
                            c1591l = C1591l.admob;
                        }
                    }
                }
            } catch (C9373l e) {
                throw new C18714l(e, c5978l);
            }
        } else {
            if (i == 6) {
                if (Build.VERSION.SDK_INT < 33) {
                }
            } else if (i == 7) {
                zAmazon = AbstractC15235l.amazon("EGL_EXT_gl_colorspace_bt2020_hlg");
            } else {
                zAmazon = true;
            }
            if (zAmazon) {
                if (i != 2) {
                    c1591l = C1591l.admob;
                } else {
                    c1591l = C1591l.admob;
                }
            } else if (i != 2) {
                c1591l = C1591l.admob;
            } else {
                c1591l = C1591l.admob;
            }
        }
        C18527l c18527l = c14600l.billing;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        C14500l c14500lYandex = c18527l.yandex(looperMyLooper, null);
        c14600l.firebase = c14500lYandex;
        c14600l.loadAd.yandex(c14600l.yandex, c1591l, c14600l, new ExecutorC12010l(1, c14500lYandex));
        throw null;
    }

    @Override // defpackage.InterfaceC9433l
    public final boolean smaato(long j, C9809l c9809l) {
        int i;
        AbstractC12442l.subscription(false);
        long j2 = j + this.crashlytics;
        C14600l c14600l = this.billing;
        C8887l c8887l = c14600l.subs;
        long j3 = c8887l.yandex;
        long j4 = j3 == -9223372036854775807L ? -9223372036854775807L : (long) (((j2 - j3) * c8887l.crashlytics) + c8887l.loadAd);
        if (j4 != -9223372036854775807L) {
            long j5 = c14600l.admob;
            if (j5 != -9223372036854775807L && j4 < j5 && (i = this.purchase) < 2) {
                this.purchase = i + 1;
                C11727l c11727l = c9809l.crashlytics;
                InterfaceC17529l interfaceC17529l = c9809l.yandex;
                int i2 = c9809l.loadAd;
                Trace.beginSection("dropVideoBuffer");
                interfaceC17529l.billing(i2);
                Trace.endSection();
                c11727l.m3233l(0, 1);
                return true;
            }
        }
        int i3 = c14600l.startapp;
        if (i3 == -1 || i3 != 0) {
            return false;
        }
        throw null;
    }

    @Override // defpackage.InterfaceC9433l
    public final void startapp(long j, long j2) {
        this.billing.purchase.startapp(j + this.crashlytics, j2);
    }

    @Override // defpackage.InterfaceC9433l
    public final void subs() {
        long j = this.amazon;
        C14600l c14600l = this.billing;
        if (c14600l.metrica >= j) {
            c14600l.purchase.subs();
        }
    }

    @Override // defpackage.InterfaceC9433l
    public final void subscription(InterfaceC15310l interfaceC15310l) {
        this.billing.purchase.isPro = interfaceC15310l;
    }

    @Override // defpackage.InterfaceC9433l
    public final void vip(boolean z) {
        C11522l c11522l;
        this.amazon = -9223372036854775807L;
        C14600l c14600l = this.billing;
        C14000l c14000l = c14600l.purchase;
        if (c14600l.vip == 1) {
            c14600l.remoteconfig++;
            c14000l.vip(z);
            while (true) {
                int iM3116new = c14600l.isPro.m3116new();
                c11522l = c14600l.isPro;
                if (iM3116new <= 1) {
                    break;
                } else {
                    c11522l.m3123switch();
                }
            }
            if (c11522l.m3116new() == 1) {
                ((AbstractC12627l) c14600l.isPro.m3123switch()).getClass();
                throw null;
            }
            c14600l.metrica = -9223372036854775807L;
            C14500l c14500l = c14600l.firebase;
            c14500l.getClass();
            c14500l.amazon(new RunnableC11297l(24, c14600l));
        }
    }

    @Override // defpackage.InterfaceC9433l
    public final boolean yandex() {
        return false;
    }

    @Override // defpackage.InterfaceC9433l
    public final void tapsense() {
    }

    @Override // defpackage.InterfaceC9433l
    public final void mopub(C10685l c10685l) {
    }
}
