package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٔؗۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C14701l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C16173l f28759l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f28760l;

    public /* synthetic */ C14701l(C16173l c16173l, int i) {
        this.f28760l = i;
        this.f28759l = c16173l;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x011f  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C8896l c8896l;
        InterfaceC18212l interfaceC18212lCrashlytics;
        char c;
        float fIntBitsToFloat;
        InterfaceC18212l interfaceC18212lCrashlytics2;
        InterfaceC18212l interfaceC18212lCrashlytics3;
        InterfaceC18212l interfaceC18212lCrashlytics4;
        InterfaceC18212l interfaceC18212lCrashlytics5;
        int i = this.f28760l;
        C16173l c16173l = this.f28759l;
        switch (i) {
            case 0:
                return new C9582l(10, c16173l);
            case 1:
                c16173l.ads();
                return Unit.INSTANCE;
            default:
                InterfaceC18212l interfaceC18212l = (InterfaceC18212l) obj;
                C17812l c17812l = c16173l.amazon;
                if (c17812l == null) {
                    c8896l = C8896l.purchase;
                } else {
                    if (c17812l.startapp) {
                        c17812l = null;
                    }
                    if (c17812l != null) {
                        InterfaceC4005l interfaceC4005l = c16173l.loadAd;
                        long j = c16173l.vip().loadAd;
                        int i2 = C12814l.crashlytics;
                        int iAdmob = interfaceC4005l.admob((int) (j >> 32));
                        int iAdmob2 = c16173l.loadAd.admob((int) (c16173l.vip().loadAd & 4294967295L));
                        C17812l c17812l2 = c16173l.amazon;
                        long jMo2591strictfp = 0;
                        long jMo2591strictfp2 = (c17812l2 == null || (interfaceC18212lCrashlytics5 = c17812l2.crashlytics()) == null) ? 0L : interfaceC18212lCrashlytics5.mo2591strictfp(c16173l.smaato(true));
                        C17812l c17812l3 = c16173l.amazon;
                        if (c17812l3 != null && (interfaceC18212lCrashlytics4 = c17812l3.crashlytics()) != null) {
                            jMo2591strictfp = interfaceC18212lCrashlytics4.mo2591strictfp(c16173l.smaato(false));
                        }
                        C17812l c17812l4 = c16173l.amazon;
                        float fIntBitsToFloat2 = 0.0f;
                        if (c17812l4 == null || (interfaceC18212lCrashlytics3 = c17812l4.crashlytics()) == null) {
                            c = ' ';
                            fIntBitsToFloat = 0.0f;
                        } else {
                            C11224l c11224lAmazon = c17812l.amazon();
                            c = ' ';
                            fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC18212lCrashlytics3.mo2591strictfp((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(c11224lAmazon != null ? c11224lAmazon.yandex.crashlytics(iAdmob).loadAd : 0.0f)) & 4294967295L)) & 4294967295L));
                        }
                        C17812l c17812l5 = c16173l.amazon;
                        if (c17812l5 != null && (interfaceC18212lCrashlytics2 = c17812l5.crashlytics()) != null) {
                            C11224l c11224lAmazon2 = c17812l.amazon();
                            fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC18212lCrashlytics2.mo2591strictfp((((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits(c11224lAmazon2 != null ? c11224lAmazon2.yandex.crashlytics(iAdmob2).loadAd : 0.0f)) & 4294967295L)) & 4294967295L));
                        }
                        int i3 = (int) (jMo2591strictfp2 >> c);
                        int i4 = (int) (jMo2591strictfp >> c);
                        c8896l = new C8896l(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), (c17812l.yandex.mopub.loadAd() * 25.0f) + Math.max(Float.intBitsToFloat((int) (jMo2591strictfp2 & 4294967295L)), Float.intBitsToFloat((int) (jMo2591strictfp & 4294967295L))));
                    } else {
                        c8896l = C8896l.purchase;
                    }
                }
                C17812l c17812l6 = c16173l.amazon;
                if (c17812l6 == null || (interfaceC18212lCrashlytics = c17812l6.crashlytics()) == null) {
                    return null;
                }
                return AbstractC17332l.amazon(c8896l, interfaceC18212lCrashlytics, interfaceC18212l);
        }
    }
}
