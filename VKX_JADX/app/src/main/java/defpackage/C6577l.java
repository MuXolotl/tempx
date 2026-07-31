package defpackage;

import android.os.Build;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؙِٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6577l implements InterfaceC10702l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC13840l f13730l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public boolean f13731l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public boolean f13733l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public AbstractC15342l f13735l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC3685l f13736l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C11925l f13737l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public boolean f13739l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public boolean f13740l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Function0 f13742l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Function2 f13743l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public float[] f13745l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public int f13748l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public boolean f13749l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public long f13746l = 9223372034707292159L;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final float[] f13734l = C10924l.yandex();

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public InterfaceC13490l f13747l = AbstractC17463l.yandex();

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public EnumC9931l f13744l = EnumC9931l.f20223l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final C13601l f13729l = new C13601l();

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public long f13741l = C1723l.loadAd;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public boolean f13738l = true;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final C3006l f13732l = new C3006l(19, this);

    public C6577l(C11925l c11925l, InterfaceC3685l interfaceC3685l, ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l, Function2 function2, Function0 function0) {
        this.f13737l = c11925l;
        this.f13736l = interfaceC3685l;
        this.f13730l = viewTreeObserverOnGlobalLayoutListenerC13840l;
        this.f13743l = function2;
        this.f13742l = function0;
    }

    public final void amazon(long j) {
        boolean zRemoteconfig = ViewTreeObserverOnGlobalLayoutListenerC13840l.remoteconfig();
        ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l = this.f13730l;
        if (zRemoteconfig) {
            viewTreeObserverOnGlobalLayoutListenerC13840l.m3775throw(-4.0f);
        }
        C11925l c11925l = this.f13737l;
        if (!C5177l.loadAd(c11925l.tapsense, j)) {
            c11925l.tapsense = j;
            c11925l.yandex.firebase((int) (j >> 32), c11925l.Signature, (int) (j & 4294967295L));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            AbstractC11829l.billing(viewTreeObserverOnGlobalLayoutListenerC13840l);
        } else {
            viewTreeObserverOnGlobalLayoutListenerC13840l.invalidate();
        }
    }

    public final void billing(boolean z) {
        if (z != this.f13740l) {
            this.f13740l = z;
            ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l = this.f13730l;
            C12463l c12463l = viewTreeObserverOnGlobalLayoutListenerC13840l.f27054l;
            boolean z2 = viewTreeObserverOnGlobalLayoutListenerC13840l.f27034l;
            if (!z) {
                if (z2) {
                    return;
                }
                c12463l.smaato(this);
                C12463l c12463l2 = viewTreeObserverOnGlobalLayoutListenerC13840l.f27001l;
                if (c12463l2 != null) {
                    c12463l2.smaato(this);
                    return;
                }
                return;
            }
            if (!z2) {
                c12463l.yandex(this);
                return;
            }
            C12463l c12463l3 = viewTreeObserverOnGlobalLayoutListenerC13840l.f27001l;
            if (c12463l3 == null) {
                c12463l3 = new C12463l();
                viewTreeObserverOnGlobalLayoutListenerC13840l.f27001l = c12463l3;
            }
            c12463l3.yandex(this);
        }
    }

    public final void crashlytics() {
        if (this.f13740l || this.f13731l) {
            return;
        }
        this.f13730l.invalidate();
        billing(true);
    }

    public final float[] loadAd() {
        boolean z = this.f13739l;
        float[] fArr = this.f13734l;
        if (z) {
            C11925l c11925l = this.f13737l;
            long jMopub = c11925l.isVip;
            InterfaceC0285l interfaceC0285l = c11925l.yandex;
            if ((9223372034707292159L & jMopub) == 9205357640488583168L) {
                jMopub = AbstractC8532l.mopub(AbstractC14707l.mopub(this.f13746l));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jMopub >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMopub & 4294967295L));
            float fAppmetrica = interfaceC0285l.appmetrica();
            float fAd = interfaceC0285l.ad();
            float fMo402throws = interfaceC0285l.mo402throws();
            float fStartapp = interfaceC0285l.startapp();
            float fAds = interfaceC0285l.ads();
            float fCrashlytics = interfaceC0285l.crashlytics();
            float fMo395for = interfaceC0285l.mo395for();
            double d = ((double) fMo402throws) * 0.017453292519943295d;
            float fSin = (float) Math.sin(d);
            float fCos = (float) Math.cos(d);
            float f = -fSin;
            float f2 = (fAd * fCos) - (0.0f * fSin);
            float f3 = (0.0f * fCos) + (fAd * fSin);
            double d2 = ((double) fStartapp) * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d2);
            float fCos2 = (float) Math.cos(d2);
            float f4 = -fSin2;
            float f5 = fSin * fSin2;
            float f6 = fSin * fCos2;
            float f7 = fCos * fSin2;
            float f8 = fCos * fCos2;
            float f9 = (f3 * fSin2) + (fAppmetrica * fCos2);
            float f10 = (f3 * fCos2) + ((-fAppmetrica) * fSin2);
            double d3 = ((double) fAds) * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d3);
            float fCos3 = (float) Math.cos(d3);
            float f11 = -fSin3;
            float f12 = (fCos3 * f5) + (f11 * fCos2);
            float f13 = (f5 * fSin3) + (fCos2 * fCos3);
            float f14 = fSin3 * fCos;
            float f15 = f13 * fCrashlytics;
            float f16 = f14 * fCrashlytics;
            float f17 = ((fSin3 * f6) + (fCos3 * f4)) * fCrashlytics;
            float f18 = f12 * fMo395for;
            float f19 = fCos * fCos3 * fMo395for;
            float f20 = ((fCos3 * f6) + (f11 * f4)) * fMo395for;
            float f21 = f7 * 1.0f;
            float f22 = f * 1.0f;
            float f23 = f8 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f15;
                fArr[1] = f16;
                fArr[2] = f17;
                fArr[3] = 0.0f;
                fArr[4] = f18;
                fArr[5] = f19;
                fArr[6] = f20;
                fArr[7] = 0.0f;
                fArr[8] = f21;
                fArr[9] = f22;
                fArr[10] = f23;
                fArr[11] = 0.0f;
                float f24 = -fIntBitsToFloat;
                fArr[12] = ((f15 * f24) - (fIntBitsToFloat2 * f18)) + f9 + fIntBitsToFloat;
                fArr[13] = ((f16 * f24) - (fIntBitsToFloat2 * f19)) + f2 + fIntBitsToFloat2;
                fArr[14] = ((f24 * f17) - (fIntBitsToFloat2 * f20)) + f10;
                fArr[15] = 1.0f;
            }
            this.f13739l = false;
            this.f13738l = AbstractC2533l.crashlytics(fArr);
        }
        return fArr;
    }

    public final void mopub() {
        ViewTreeObserverOnGlobalLayoutListenerC13840l.remoteconfig();
        if (this.f13740l) {
            if (!C1723l.yandex(this.f13741l, C1723l.loadAd) && !C4999l.loadAd(this.f13737l.Signature, this.f13746l)) {
                C11925l c11925l = this.f13737l;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f13741l >> 32)) * ((int) (this.f13746l >> 32));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.f13741l & 4294967295L)) * ((int) (this.f13746l & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                if (!C1187l.loadAd(c11925l.isVip, jFloatToRawIntBits)) {
                    c11925l.isVip = jFloatToRawIntBits;
                    c11925l.yandex.subscription(jFloatToRawIntBits);
                }
            }
            this.f13737l.purchase(this.f13747l, this.f13744l, this.f13746l, this.f13732l);
            billing(false);
        }
    }

    public final void purchase(long j) {
        if (C4999l.loadAd(j, this.f13746l)) {
            return;
        }
        if (ViewTreeObserverOnGlobalLayoutListenerC13840l.remoteconfig()) {
            this.f13730l.m3775throw(-4.0f);
        }
        this.f13746l = j;
        crashlytics();
    }

    public final float[] yandex() {
        float[] fArrYandex = this.f13745l;
        if (fArrYandex == null) {
            fArrYandex = C10924l.yandex();
            this.f13745l = fArrYandex;
        }
        if (this.f13749l) {
            this.f13749l = false;
            float[] fArrLoadAd = loadAd();
            if (this.f13738l) {
                return fArrLoadAd;
            }
            if (!AbstractC6745l.mopub(fArrLoadAd, fArrYandex)) {
                fArrYandex[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrYandex[0])) {
            return null;
        }
        return fArrYandex;
    }
}
