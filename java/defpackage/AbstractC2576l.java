package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

/* JADX INFO: renamed from: lّؔٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2576l {
    public static final C15578l yandex = new C15578l(-957819804, false, new C5974l(9));
    public static final C15578l loadAd = new C15578l(-1465694771, false, new C0263l(16));
    public static final C15578l crashlytics = new C15578l(1980018564, false, new C0263l(17));

    public static final C13995l amazon(AbstractC12194l abstractC12194l, AbstractC12194l abstractC12194l2) {
        return new C13995l(AbstractC14055l.remoteconfig(abstractC12194l, abstractC12194l2));
    }

    public static long crashlytics(C13143l c13143l, int i, int i2) {
        c13143l.m3562for(i);
        if (c13143l.yandex() < 5) {
            return -9223372036854775807L;
        }
        int iRemoteconfig = c13143l.remoteconfig();
        if ((8388608 & iRemoteconfig) != 0 || ((2096896 & iRemoteconfig) >> 8) != i2 || (iRemoteconfig & 32) == 0 || c13143l.signatures() < 7 || c13143l.yandex() < 7 || (c13143l.signatures() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        c13143l.firebase(0, 6, bArr);
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((255 & ((long) bArr[4])) >> 7);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0092  */
    public static final void loadAd(InterfaceC13349l interfaceC13349l, C11925l c11925l) {
        int i;
        float f;
        float f2;
        C4480l c4480lYandex;
        float f3;
        float f4;
        InterfaceC14859l interfaceC14859lM4555synchronized = interfaceC13349l.mo2065break().m4555synchronized();
        C11925l c11925l2 = (C11925l) interfaceC13349l.mo2065break().f36009l;
        InterfaceC0285l interfaceC0285l = c11925l.yandex;
        if (c11925l.subscription) {
            return;
        }
        long j = c11925l.admob;
        Canvas canvas = AbstractC10071l.yandex;
        C2151l c2151l = (C2151l) interfaceC14859lM4555synchronized;
        Canvas canvas2 = c2151l.yandex;
        boolean zIsHardwareAccelerated = canvas2.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            long j2 = c11925l.tapsense;
            float f5 = (int) (j2 >> 32);
            float f6 = f5 - c11925l.license;
            float f7 = (int) (j2 & 4294967295L);
            float f8 = f7 - c11925l.pro;
            long j3 = c11925l.Signature;
            float f9 = f5 + ((int) (j3 >> 32)) + c11925l.ad;
            float f10 = f7 + ((int) (j3 & 4294967295L)) + c11925l.advert;
            float fYandex = interfaceC0285l.yandex();
            AbstractC8939l abstractC8939lVip = interfaceC0285l.vip();
            int iMo393catch = interfaceC0285l.mo393catch();
            if (fYandex >= 1.0f) {
                f = f10;
                if (iMo393catch == 3 && abstractC8939lVip == null) {
                    f2 = f8;
                    if (interfaceC0285l.remoteconfig() != 1) {
                        canvas2.save();
                        f3 = f6;
                        canvas2 = canvas2;
                        f4 = f2;
                    }
                    canvas2.translate(f3, f4);
                    Matrix matrixMo396native = interfaceC0285l.mo396native();
                    matrixMo396native.preTranslate(c11925l.license, c11925l.pro);
                    canvas2.concat(matrixMo396native);
                    c11925l.admob = C1187l.admob(c11925l.admob, (((long) Float.floatToRawIntBits(c11925l.pro)) & 4294967295L) | (((long) Float.floatToRawIntBits(c11925l.license)) << 32));
                }
                c4480lYandex = c11925l.startapp;
                if (c4480lYandex == null) {
                    c4480lYandex = AbstractC4311l.yandex();
                    c11925l.startapp = c4480lYandex;
                }
                c4480lYandex.amazon(fYandex);
                c4480lYandex.purchase(iMo393catch);
                c4480lYandex.mopub(abstractC8939lVip);
                Paint paintAdmob = AbstractC4311l.admob(c4480lYandex);
                canvas2 = canvas2;
                f3 = f6;
                f4 = f2;
                canvas2.saveLayer(f3, f4, f9, f, paintAdmob);
                canvas2.translate(f3, f4);
                Matrix matrixMo396native2 = interfaceC0285l.mo396native();
                matrixMo396native2.preTranslate(c11925l.license, c11925l.pro);
                canvas2.concat(matrixMo396native2);
                c11925l.admob = C1187l.admob(c11925l.admob, (((long) Float.floatToRawIntBits(c11925l.pro)) & 4294967295L) | (((long) Float.floatToRawIntBits(c11925l.license)) << 32));
            } else {
                f = f10;
            }
            f2 = f8;
            c4480lYandex = c11925l.startapp;
            if (c4480lYandex == null) {
                c4480lYandex = AbstractC4311l.yandex();
                c11925l.startapp = c4480lYandex;
            }
            c4480lYandex.amazon(fYandex);
            c4480lYandex.purchase(iMo393catch);
            c4480lYandex.mopub(abstractC8939lVip);
            Paint paintAdmob2 = AbstractC4311l.admob(c4480lYandex);
            canvas2 = canvas2;
            f3 = f6;
            f4 = f2;
            canvas2.saveLayer(f3, f4, f9, f, paintAdmob2);
            canvas2.translate(f3, f4);
            Matrix matrixMo396native3 = interfaceC0285l.mo396native();
            matrixMo396native3.preTranslate(c11925l.license, c11925l.pro);
            canvas2.concat(matrixMo396native3);
            c11925l.admob = C1187l.admob(c11925l.admob, (((long) Float.floatToRawIntBits(c11925l.pro)) & 4294967295L) | (((long) Float.floatToRawIntBits(c11925l.license)) << 32));
        }
        c11925l.yandex();
        if (!interfaceC0285l.adcel()) {
            try {
                c11925l.yandex.mo397package(c11925l.loadAd, c11925l.crashlytics, c11925l, c11925l.purchase);
            } catch (Throwable unused) {
            }
        }
        boolean z = false;
        boolean z2 = interfaceC0285l.mo394extends() > 0.0f;
        if (z2) {
            interfaceC14859lM4555synchronized.license();
        }
        boolean z3 = !zIsHardwareAccelerated && c11925l.signatures;
        if (z3) {
            interfaceC14859lM4555synchronized.mopub();
            AbstractC15342l abstractC15342lAmazon = c11925l.amazon();
            if (abstractC15342lAmazon instanceof C13080l) {
                interfaceC14859lM4555synchronized.tapsense(((C13080l) abstractC15342lAmazon).amazon);
            } else if (abstractC15342lAmazon instanceof C18521l) {
                C9902l c9902lYandex = c11925l.remoteconfig;
                if (c9902lYandex != null) {
                    c9902lYandex.subs();
                } else {
                    c9902lYandex = AbstractC3478l.yandex();
                    c11925l.remoteconfig = c9902lYandex;
                }
                AbstractC15560l.firebase(c9902lYandex, ((C18521l) abstractC15342lAmazon).amazon);
                interfaceC14859lM4555synchronized.remoteconfig(c9902lYandex);
            } else {
                if (!(abstractC15342lAmazon instanceof C13616l)) {
                    C18725l.billing();
                    return;
                }
                interfaceC14859lM4555synchronized.remoteconfig(((C13616l) abstractC15342lAmazon).amazon);
            }
        }
        if (c11925l2 != null) {
            C18480l c18480l = c11925l2.ads;
            if (!c18480l.f36085l) {
                AbstractC11597l.yandex("Only add dependencies during a tracking");
            }
            C6295l c6295l = (C6295l) c18480l.f36087l;
            if (c6295l != null) {
                c6295l.yandex(c11925l);
            } else if (((C11925l) c18480l.f36084l) != null) {
                C6295l c6295l2 = AbstractC13087l.yandex;
                C6295l c6295l3 = new C6295l();
                c6295l3.yandex((C11925l) c18480l.f36084l);
                c6295l3.yandex(c11925l);
                c18480l.f36087l = c6295l3;
                c18480l.f36084l = null;
            } else {
                c18480l.f36084l = c11925l;
            }
            C6295l c6295l4 = (C6295l) c18480l.f36089l;
            if (c6295l4 != null) {
                boolean zRemoteconfig = c6295l4.remoteconfig(c11925l);
                i = 1;
                z = !zRemoteconfig;
            } else {
                i = 1;
                if (((C11925l) c18480l.f36088l) != c11925l) {
                    z = true;
                } else {
                    c18480l.f36088l = null;
                }
            }
            if (z) {
                c11925l.adcel += i;
            }
        }
        if (c2151l.yandex.isHardwareAccelerated()) {
            interfaceC0285l.smaato(interfaceC14859lM4555synchronized);
        } else {
            C13601l c13601l = c11925l.metrica;
            if (c13601l == null) {
                c13601l = new C13601l();
                c11925l.metrica = c13601l;
            }
            C18449l c18449l = c13601l.f26629l;
            InterfaceC13490l interfaceC13490l = c11925l.loadAd;
            EnumC9931l enumC9931l = c11925l.crashlytics;
            long jMopub = AbstractC14707l.mopub(c11925l.Signature);
            InterfaceC13490l interfaceC13490lM4560volatile = c18449l.m4560volatile();
            EnumC9931l enumC9931lM4548native = c18449l.m4548native();
            InterfaceC14859l interfaceC14859lM4555synchronized2 = c18449l.m4555synchronized();
            long jM4551private = c18449l.m4551private();
            C11925l c11925l3 = (C11925l) c18449l.f36009l;
            c18449l.m4554super(interfaceC13490l);
            c18449l.m4545import(enumC9931l);
            c18449l.m4544goto(interfaceC14859lM4555synchronized);
            c18449l.m4534abstract(jMopub);
            c18449l.f36009l = c11925l;
            interfaceC14859lM4555synchronized.mopub();
            try {
                c11925l.crashlytics(c13601l);
                interfaceC14859lM4555synchronized.ads();
                c18449l.m4554super(interfaceC13490lM4560volatile);
                c18449l.m4545import(enumC9931lM4548native);
                c18449l.m4544goto(interfaceC14859lM4555synchronized2);
                c18449l.m4534abstract(jM4551private);
                c18449l.f36009l = c11925l3;
            } catch (Throwable th) {
                interfaceC14859lM4555synchronized.ads();
                c18449l.m4554super(interfaceC13490lM4560volatile);
                c18449l.m4545import(enumC9931lM4548native);
                c18449l.m4544goto(interfaceC14859lM4555synchronized2);
                c18449l.m4534abstract(jM4551private);
                c18449l.f36009l = c11925l3;
                throw th;
            }
        }
        if (z3) {
            interfaceC14859lM4555synchronized.ads();
        }
        if (z2) {
            interfaceC14859lM4555synchronized.isPro();
        }
        if (!zIsHardwareAccelerated) {
            canvas2.restore();
        }
        c11925l.admob = j;
    }

    public static final C5028l yandex(float f, long j) {
        return new C5028l(f, new C8990l(j));
    }
}
