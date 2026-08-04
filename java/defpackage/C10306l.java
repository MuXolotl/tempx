package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import kotlin.Unit;

/* JADX INFO: renamed from: lَؘٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10306l {
    public long admob;
    public final C10086l amazon;
    public boolean billing;
    public final C11115l crashlytics;
    public long loadAd = 9205357640488583168L;
    public long mopub;
    public final boolean purchase;
    public final AbstractC11340l subs;
    public final InterfaceC13490l yandex;

    public C10306l(Context context, InterfaceC13490l interfaceC13490l, long j, InterfaceC11780l interfaceC11780l) {
        this.yandex = interfaceC13490l;
        C11115l c11115l = new C11115l(context, AbstractC12953l.startapp(j));
        this.crashlytics = c11115l;
        this.amazon = new C10086l(Unit.INSTANCE, C18450l.f36015l);
        this.purchase = true;
        this.mopub = 0L;
        this.admob = -1L;
        C7795l c7795l = new C7795l(0, this);
        C9185l c9185l = AbstractC1782l.yandex;
        C4566l c4566l = new C4566l(null, null, null, c7795l);
        this.subs = Build.VERSION.SDK_INT >= 31 ? new C4612l(c4566l, this, c11115l) : new C6049l(c4566l, this, c11115l, interfaceC11780l);
    }

    public final float admob(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (crashlytics() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.mopub >> 32));
        EdgeEffect edgeEffectAmazon = this.crashlytics.amazon();
        float fSignatures = -fIntBitsToFloat2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fSignatures = AbstractC12148l.signatures(edgeEffectAmazon, fSignatures, fIntBitsToFloat);
        } else {
            edgeEffectAmazon.onPull(fSignatures, fIntBitsToFloat);
        }
        return (i2 >= 31 ? AbstractC12148l.metrica(edgeEffectAmazon) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.mopub >> 32)) * (-fSignatures) : Float.intBitsToFloat(i);
    }

    public final void amazon() {
        if (this.purchase) {
            this.amazon.setValue(Unit.INSTANCE);
        }
    }

    public final float billing(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (crashlytics() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.mopub & 4294967295L));
        EdgeEffect edgeEffectLoadAd = this.crashlytics.loadAd();
        float fSignatures = -fIntBitsToFloat2;
        float f = 1.0f - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fSignatures = AbstractC12148l.signatures(edgeEffectLoadAd, fSignatures, f);
        } else {
            edgeEffectLoadAd.onPull(fSignatures, f);
        }
        return (i2 >= 31 ? AbstractC12148l.metrica(edgeEffectLoadAd) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.mopub)) * (-fSignatures) : Float.intBitsToFloat(i);
    }

    public final long crashlytics() {
        long jMopub = this.loadAd;
        if ((9223372034707292159L & jMopub) == 9205357640488583168L) {
            jMopub = AbstractC8532l.mopub(this.mopub);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMopub >> 32)) / Float.intBitsToFloat((int) (this.mopub >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jMopub & 4294967295L)) / Float.intBitsToFloat((int) (this.mopub & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public final void isPro(long j) {
        boolean zLoadAd = C14174l.loadAd(this.mopub, 0L);
        boolean zLoadAd2 = C14174l.loadAd(j, this.mopub);
        this.mopub = j;
        if (!zLoadAd2) {
            int iAds = AbstractC5573l.ads(Float.intBitsToFloat((int) (j >> 32)));
            long jAds = (((long) AbstractC5573l.ads(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iAds) << 32);
            C11115l c11115l = this.crashlytics;
            c11115l.crashlytics = jAds;
            EdgeEffect edgeEffect = c11115l.amazon;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jAds >> 32), (int) (jAds & 4294967295L));
            }
            EdgeEffect edgeEffect2 = c11115l.purchase;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jAds >> 32), (int) (jAds & 4294967295L));
            }
            EdgeEffect edgeEffect3 = c11115l.billing;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jAds & 4294967295L), (int) (jAds >> 32));
            }
            EdgeEffect edgeEffect4 = c11115l.mopub;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jAds & 4294967295L), (int) (jAds >> 32));
            }
            EdgeEffect edgeEffect5 = c11115l.admob;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jAds >> 32), (int) (jAds & 4294967295L));
            }
            EdgeEffect edgeEffect6 = c11115l.subs;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jAds >> 32), (int) (jAds & 4294967295L));
            }
            EdgeEffect edgeEffect7 = c11115l.isPro;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jAds & 4294967295L), (int) (jAds >> 32));
            }
            EdgeEffect edgeEffect8 = c11115l.firebase;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jAds), (int) (jAds >> 32));
            }
        }
        if (zLoadAd || zLoadAd2) {
            return;
        }
        yandex();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (r20.invoke(r0, r5) == r6) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0127, code lost:
    
        if (r4 == r6) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object loadAd(long r18, kotlin.jvm.functions.Function2 r20, defpackage.AbstractC0283l r21) {
        /*
            Method dump skipped, instruction units count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10306l.loadAd(long, kotlin.jvm.functions.Function2, lّؑۧ):java.lang.Object");
    }

    public final float mopub(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (crashlytics() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.mopub >> 32));
        EdgeEffect edgeEffectCrashlytics = this.crashlytics.crashlytics();
        float f = 1.0f - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = AbstractC12148l.signatures(edgeEffectCrashlytics, fIntBitsToFloat2, f);
        } else {
            edgeEffectCrashlytics.onPull(fIntBitsToFloat2, f);
        }
        return (i2 >= 31 ? AbstractC12148l.metrica(edgeEffectCrashlytics) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.mopub >> 32)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final boolean purchase() {
        C11115l c11115l = this.crashlytics;
        EdgeEffect edgeEffect = c11115l.amazon;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? AbstractC12148l.metrica(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = c11115l.purchase;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? AbstractC12148l.metrica(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = c11115l.billing;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? AbstractC12148l.metrica(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = c11115l.mopub;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? AbstractC12148l.metrica(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    public final float subs(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (crashlytics() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.mopub & 4294967295L));
        EdgeEffect edgeEffectPurchase = this.crashlytics.purchase();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = AbstractC12148l.signatures(edgeEffectPurchase, fIntBitsToFloat2, fIntBitsToFloat);
        } else {
            edgeEffectPurchase.onPull(fIntBitsToFloat2, fIntBitsToFloat);
        }
        return (i2 >= 31 ? AbstractC12148l.metrica(edgeEffectPurchase) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.mopub)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final void yandex() {
        boolean z;
        C11115l c11115l = this.crashlytics;
        EdgeEffect edgeEffect = c11115l.amazon;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = c11115l.purchase;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = c11115l.billing;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = c11115l.mopub;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            amazon();
        }
    }
}
