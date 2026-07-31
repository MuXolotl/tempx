package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؙُٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6606l {
    public long admob;
    public final AbstractC14971l amazon;
    public C6606l billing;
    public final long crashlytics;
    public final /* synthetic */ C6709l firebase;
    public final long loadAd;
    public long mopub;
    public final Function1 purchase;
    public final int yandex;
    public long subs = Long.MIN_VALUE;
    public long isPro = -1;

    public C6606l(C6709l c6709l, int i, long j, long j2, AbstractC14971l abstractC14971l, Function1 function1) {
        this.firebase = c6709l;
        this.yandex = i;
        this.loadAd = j;
        this.crashlytics = j2;
        this.amazon = abstractC14971l;
        this.purchase = function1;
    }

    public final void loadAd() {
        C6709l c6709l = this.firebase;
        C16977l c16977l = c6709l.yandex;
        int i = this.yandex;
        C6606l c6606l = (C6606l) c16977l.mopub(i);
        if (c6606l != null) {
            if (c6606l == this) {
                C6606l c6606l2 = this.billing;
                this.billing = null;
                if (c6606l2 != null) {
                    int iAmazon = c16977l.amazon(i);
                    Object[] objArr = c16977l.crashlytics;
                    Object obj = objArr[iAmazon];
                    c16977l.loadAd[iAmazon] = i;
                    objArr[iAmazon] = c6606l2;
                    return;
                }
                C3654l c3654lMetrica = AbstractC5573l.metrica(this.amazon.f29454l);
                if (c3654lMetrica.m1386native()) {
                    C0151l rectManager = ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5672l.yandex(c3654lMetrica)).getRectManager();
                    rectManager.getClass();
                    if (c3654lMetrica.f7674l != -4) {
                        C13698l c13698l = rectManager.crashlytics;
                        int iPurchase = rectManager.purchase(c3654lMetrica);
                        long[] jArr = (long[]) c13698l.f26743l;
                        int i2 = iPurchase + 2;
                        jArr[i2] = jArr[i2] & 8070450532247928831L;
                        return;
                    }
                    return;
                }
                return;
            }
            int iAmazon2 = c16977l.amazon(i);
            Object[] objArr2 = c16977l.crashlytics;
            Object obj2 = objArr2[iAmazon2];
            c16977l.loadAd[iAmazon2] = i;
            objArr2[iAmazon2] = c6606l;
            while (true) {
                C6606l c6606l3 = c6606l.billing;
                if (c6606l3 == null) {
                    break;
                }
                if (c6606l3 == this) {
                    c6606l.billing = this.billing;
                    this.billing = null;
                    return;
                }
                c6606l = c6606l3;
            }
        }
        C6606l c6606l4 = c6709l.loadAd;
        if (c6606l4 == this) {
            c6709l.loadAd = c6606l4.billing;
            this.billing = null;
            return;
        }
        C6606l c6606l5 = c6606l4 != null ? c6606l4.billing : null;
        while (true) {
            C6606l c6606l6 = c6606l4;
            c6606l4 = c6606l5;
            if (c6606l4 == null) {
                return;
            }
            if (c6606l4 == this) {
                if (c6606l6 != null) {
                    c6606l6.billing = c6606l4.billing;
                }
                this.billing = null;
                return;
            }
            c6606l5 = c6606l4.billing;
        }
    }

    public final void yandex(long j, long j2, long j3, long j4, float[] fArr) {
        C11595l c11595l;
        C11595l c11595l2;
        long j5 = this.firebase.billing;
        AbstractC14971l abstractC14971l = this.amazon;
        AbstractC18026l abstractC18026lSmaato = AbstractC5573l.smaato(abstractC14971l, 2);
        C3654l c3654lMetrica = AbstractC5573l.metrica(abstractC14971l);
        boolean zM1389private = c3654lMetrica.m1389private();
        C18289l c18289l = c3654lMetrica.f7703l;
        if (zM1389private) {
            if (((AbstractC18026l) c18289l.purchase) != abstractC18026lSmaato) {
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
                abstractC18026lSmaato.getClass();
                long j6 = abstractC18026lSmaato.f20590l;
                AbstractC18026l abstractC18026l = (AbstractC18026l) c18289l.purchase;
                abstractC18026l.getClass();
                long jIsPro = AbstractC3383l.isPro(abstractC18026l.mo2589native(abstractC18026lSmaato, jFloatToRawIntBits, true));
                c11595l = new C11595l(jIsPro, (4294967295L & ((long) (((int) (jIsPro & 4294967295L)) + ((int) (j6 & 4294967295L))))) | (((long) (((int) (jIsPro >> 32)) + ((int) (j6 >> 32)))) << 32), j3, j4, j5, fArr, abstractC14971l);
            } else {
                c11595l = new C11595l(j, j2, j3, j4, j5, fArr, abstractC14971l);
            }
            c11595l2 = c11595l;
        } else {
            c11595l2 = null;
        }
        if (c11595l2 == null) {
            return;
        }
        this.purchase.invoke(c11595l2);
    }
}
