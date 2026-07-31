package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٟۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C18497l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C12217l f36124l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f36125l;

    public /* synthetic */ C18497l(C12217l c12217l, int i) {
        this.f36125l = i;
        this.f36124l = c12217l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InterfaceC18212l interfaceC18212lAdcel;
        C8896l c8896l;
        int i = this.f36125l;
        C12217l c12217l = this.f36124l;
        switch (i) {
            case 0:
                return c12217l.startapp(true, false);
            case 1:
                return c12217l.startapp(false, false);
            case 2:
                return Boolean.valueOf(c12217l.isPro(false).yandex);
            case 3:
                C10086l c10086l = c12217l.tapsense;
                C16328l c16328l = c12217l.yandex;
                boolean zAmazon = C12814l.amazon(c16328l.amazon().f12061l);
                if (((zAmazon && ((EnumC6775l) c10086l.getValue()) == EnumC6775l.f14200l) || (!zAmazon && ((EnumC6775l) c10086l.getValue()) == EnumC6775l.f14199l)) && c12217l.smaato() == null && ((Boolean) c12217l.smaato.getValue()).booleanValue() && (interfaceC18212lAdcel = c12217l.adcel()) != null) {
                    C8896l c8896lAdmob = AbstractC2044l.admob(interfaceC18212lAdcel);
                    C8896l c8896lIsPro = AbstractC7470l.isPro(interfaceC18212lAdcel.mo2591strictfp(c8896lAdmob.admob()), c8896lAdmob.mopub());
                    InterfaceC18212l interfaceC18212lAdcel2 = c12217l.adcel();
                    if (interfaceC18212lAdcel2 != null) {
                        long j = c16328l.amazon().f12061l;
                        if (C12814l.amazon(j)) {
                            C8896l c8896lFirebase = c12217l.firebase();
                            c8896l = AbstractC7470l.isPro(interfaceC18212lAdcel2.mo2591strictfp(c8896lFirebase.admob()), c8896lFirebase.mopub());
                        } else {
                            long jMo2591strictfp = interfaceC18212lAdcel2.mo2591strictfp(c12217l.metrica(true));
                            long jMo2591strictfp2 = interfaceC18212lAdcel2.mo2591strictfp(c12217l.metrica(false));
                            C0327l c0327lCrashlytics = c12217l.loadAd.crashlytics();
                            if (c0327lCrashlytics == null) {
                                c8896l = C8896l.purchase;
                            } else {
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC18212lAdcel2.mo2591strictfp((((long) Float.floatToRawIntBits(c0327lCrashlytics.crashlytics((int) (j >> 32)).loadAd)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32)) & 4294967295L));
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC18212lAdcel2.mo2591strictfp((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(c0327lCrashlytics.crashlytics((int) (j & 4294967295L)).loadAd)) & 4294967295L)) & 4294967295L));
                                int i2 = (int) (jMo2591strictfp >> 32);
                                int i3 = (int) (jMo2591strictfp2 >> 32);
                                float fMin = Math.min(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3));
                                float fMax = Math.max(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3));
                                if (fMin == fMax) {
                                    fMax += 1.0f;
                                }
                                c8896l = new C8896l(fMin, Math.min(fIntBitsToFloat, fIntBitsToFloat2), fMax, Math.max(Float.intBitsToFloat((int) (jMo2591strictfp & 4294967295L)), Float.intBitsToFloat((int) (jMo2591strictfp2 & 4294967295L))));
                            }
                        }
                        if (c8896l.smaato(c8896lIsPro)) {
                            return c8896l.isPro(c8896lIsPro);
                        }
                    } else {
                        AbstractC14825l.amazon("textLayoutCoordinates should not be null.");
                        C17132l.firebase();
                    }
                }
                return null;
            case 4:
                return (C8896l) c12217l.advert.getValue();
            case 5:
                return c12217l.yandex.amazon();
            case 6:
                c12217l.amazon();
                return Unit.INSTANCE;
            case 7:
                return Boolean.valueOf(!((Boolean) c12217l.Signature.getValue()).booleanValue());
            case 8:
                C16328l c16328l2 = c12217l.yandex;
                C10178l c10178l = c16328l2.yandex;
                InterfaceC13142l interfaceC13142l = c16328l2.loadAd;
                c10178l.loadAd.yandex().premium();
                C2566l c2566l = c10178l.loadAd;
                AbstractC16357l.purchase(c2566l, 0, c2566l.f5577l.length());
                C10178l.yandex(c10178l, interfaceC13142l, true, 1);
                c10178l.amazon(true);
                return Unit.INSTANCE;
            default:
                Function0 function0 = c12217l.remoteconfig;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.INSTANCE;
        }
    }
}
