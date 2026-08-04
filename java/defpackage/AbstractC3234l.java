package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؙؕؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3234l {
    public static C5197l crashlytics;
    public static final int[] yandex = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, AbstractC12994l.AUDIO_CONTENT_SAMPLING_RATE, 12000, 11025, 8000, 7350};
    public static final int[] loadAd = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static Cimport admob(C5257l c5257l, boolean z) throws C17655l {
        int iMopub = c5257l.mopub(5);
        if (iMopub == 31) {
            iMopub = c5257l.mopub(6) + 32;
        }
        int iMopub2 = mopub(c5257l);
        int iMopub3 = c5257l.mopub(4);
        String strVip = AbstractC0653l.vip(iMopub, "mp4a.40.");
        if (iMopub == 5 || iMopub == 29) {
            iMopub2 = mopub(c5257l);
            int iMopub4 = c5257l.mopub(5);
            if (iMopub4 == 31) {
                iMopub4 = c5257l.mopub(6) + 32;
            }
            iMopub = iMopub4;
            if (iMopub == 22) {
                iMopub3 = c5257l.mopub(4);
            }
        }
        if (z) {
            if (iMopub != 1 && iMopub != 2 && iMopub != 3 && iMopub != 4 && iMopub != 6 && iMopub != 7 && iMopub != 17) {
                switch (iMopub) {
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw C17655l.crashlytics("Unsupported audio object type: " + iMopub);
                }
            }
            if (c5257l.billing()) {
                AbstractC6427l.vip("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (c5257l.billing()) {
                c5257l.metrica(14);
            }
            boolean zBilling = c5257l.billing();
            if (iMopub3 == 0) {
                C3010l.mopub();
                return null;
            }
            if (iMopub == 6 || iMopub == 20) {
                c5257l.metrica(3);
            }
            if (zBilling) {
                if (iMopub == 22) {
                    c5257l.metrica(16);
                }
                if (iMopub == 17 || iMopub == 19 || iMopub == 20 || iMopub == 23) {
                    c5257l.metrica(3);
                }
                c5257l.metrica(1);
            }
            switch (iMopub) {
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iMopub5 = c5257l.mopub(2);
                    if (iMopub5 == 2 || iMopub5 == 3) {
                        throw C17655l.crashlytics("Unsupported epConfig: " + iMopub5);
                    }
                    break;
            }
        }
        int i = loadAd[iMopub3];
        if (i != -1) {
            return new Cimport(iMopub2, i, strVip);
        }
        throw C17655l.yandex(null, null);
    }

    public static final float amazon(int i, int i2, float[] fArr, float[] fArr2) {
        int i3 = i * 4;
        return (fArr[i3 + 3] * fArr2[12 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3] * fArr2[i2]);
    }

    public static final C5197l billing() {
        C5197l c5197l = crashlytics;
        if (c5197l != null) {
            return c5197l;
        }
        C10943l c10943l = new C10943l("Rounded.Lock", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = AbstractC8192l.yandex;
        C8990l c8990l = new C8990l(C9735l.loadAd);
        C15659l c15659l = new C15659l();
        c15659l.billing(18.0f, 8.0f);
        C0040l c0040l = new C0040l(-1.0f);
        ArrayList arrayList = c15659l.f30611l;
        arrayList.add(c0040l);
        c15659l.amazon(17.0f, 6.0f);
        c15659l.loadAd(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        arrayList.add(new C1902l(7.0f, 3.24f, 7.0f, 6.0f));
        arrayList.add(new C12363l(2.0f));
        c15659l.amazon(6.0f, 8.0f);
        c15659l.loadAd(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        arrayList.add(new C12363l(10.0f));
        c15659l.loadAd(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        arrayList.add(new C0040l(12.0f));
        c15659l.loadAd(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        c15659l.amazon(20.0f, 10.0f);
        c15659l.loadAd(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        c15659l.yandex();
        c15659l.billing(12.0f, 17.0f);
        c15659l.loadAd(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        c15659l.mopub(0.9f, -2.0f, 2.0f, -2.0f);
        c15659l.mopub(2.0f, 0.9f, 2.0f, 2.0f);
        c15659l.mopub(-0.9f, 2.0f, -2.0f, 2.0f);
        c15659l.yandex();
        c15659l.billing(9.0f, 8.0f);
        c15659l.amazon(9.0f, 6.0f);
        c15659l.loadAd(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f);
        c15659l.mopub(3.0f, 1.34f, 3.0f, 3.0f);
        arrayList.add(new C12363l(2.0f));
        c15659l.amazon(9.0f, 8.0f);
        c15659l.yandex();
        C10943l.yandex(c10943l, arrayList, c8990l);
        C5197l c5197lLoadAd = c10943l.loadAd();
        crashlytics = c5197lLoadAd;
        return c5197lLoadAd;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v7, types: [lّۖۘ] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [lّۖۘ] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, lَُؖ] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v4, types: [lَؗ] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [lَؗ] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r3v5, types: [lٌؚؖ] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v7, types: [lؚٖٞ] */
    /* JADX WARN: Type inference failed for: r4v8 */
    public static final Object crashlytics(C3399l c3399l, Context context, C4043l c4043l, C15428l c15428l, C5146l c5146l, AbstractC0283l abstractC0283l) throws Throwable {
        C9648l c9648l;
        ?? r4;
        C7504l c7504l;
        C16248l c16248l;
        C15428l c15428l2;
        C4043l c4043l2;
        Context context2;
        C3399l c3399l2;
        EnumC9342l enumC9342l;
        InterfaceC7042l interfaceC7042l;
        C16248l c16248l2;
        C16248l c16248l3;
        ?? r2;
        ?? r1;
        C6411l c6411l;
        C4043l c4043l3;
        C4791l c4791l;
        C6931l c6931l;
        int i;
        ?? r3 = context;
        ?? r5 = c4043l;
        if (abstractC0283l instanceof C9648l) {
            c9648l = (C9648l) abstractC0283l;
            i = c9648l.f19667l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                int i2 = i - RecyclerView.UNDEFINED_DURATION;
                c9648l.f19667l = i2;
                r4 = i2;
            } else {
                c9648l = new C9648l(abstractC0283l);
                r4 = i;
            }
        } else {
            c9648l = new C9648l(abstractC0283l);
            r4 = i;
        }
        C9648l c9648l2 = c9648l;
        Object obj = c9648l2.f19673l;
        ?? r6 = c9648l2.f19667l;
        int i3 = 2;
        InterfaceC14029l interfaceC14029l = null;
        EnumC9342l enumC9342l2 = EnumC9342l.f19165l;
        try {
            try {
                if (r6 != 0) {
                    try {
                        if (r6 == 1) {
                            C6931l c6931l2 = c9648l2.f19676l;
                            C4791l c4791l2 = c9648l2.f19670l;
                            C7504l c7504l2 = c9648l2.f19674l;
                            C16248l c16248l4 = c9648l2.f19669l;
                            C15428l c15428l3 = (C15428l) c9648l2.f19668l;
                            C4043l c4043l4 = (C4043l) c9648l2.f19675l;
                            Context context3 = (Context) c9648l2.f19671l;
                            C3399l c3399l3 = (C3399l) c9648l2.f19672l;
                            AbstractC2829l.crashlytics(obj);
                            c7504l = c7504l2;
                            c16248l = c16248l4;
                            c15428l2 = c15428l3;
                            c4043l2 = c4043l4;
                            context2 = context3;
                            c3399l2 = c3399l3;
                            enumC9342l = enumC9342l2;
                            r6 = c6931l2;
                            r5 = c4791l2;
                        } else {
                            if (r6 != 2) {
                                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            InterfaceC12776l interfaceC12776l = (InterfaceC12776l) c9648l2.f19668l;
                            C4791l c4791l3 = (C4791l) c9648l2.f19675l;
                            interfaceC7042l = (InterfaceC7042l) c9648l2.f19671l;
                            c16248l2 = (C16248l) c9648l2.f19672l;
                            AbstractC2829l.crashlytics(obj);
                            r1 = interfaceC12776l;
                            r2 = c4791l3;
                        }
                        r1.yandex();
                        c16248l2.loadAd();
                        interfaceC7042l.ads(null);
                        r2.applovin();
                        return Unit.INSTANCE;
                    } catch (Throwable th) {
                        th = th;
                        r6.yandex();
                        r4.loadAd();
                        r3.ads(null);
                        r5.applovin();
                        throw th;
                    }
                }
                AbstractC2829l.crashlytics(obj);
                c16248l3 = new C16248l(c3399l);
                C7504l c7504lMopub = AbstractC10999l.mopub(c3399l, null, 0, new C18160l(i3, interfaceC14029l, 17), 3);
                r5.getClass();
                C14524l c14524l = new C14524l(50);
                C1008l c1008lYandex = AbstractC11190l.yandex(Boolean.FALSE);
                C16741l c16741l = new C16741l(c3399l, r5, r3);
                c5146l.getClass();
                C0462l c0462lYandex = AbstractC11174l.yandex();
                InterfaceC2262l interfaceC2262l = c3399l.f7243l;
                InterfaceC7042l interfaceC7042l2 = (InterfaceC7042l) interfaceC2262l.vip().mo245l(C1083l.f2996l);
                if (interfaceC7042l2 != null) {
                    interfaceC7042l2.mo2154l(new C16931l(21, c0462lYandex));
                }
                C4791l c4791l4 = new C4791l(interfaceC2262l.vip().mo246l(c0462lYandex).mo246l(c16741l));
                C6931l c6931l3 = new C6931l(c4791l4, new C2416l(c14524l));
                try {
                    try {
                        c6931l = c6931l3;
                        c4791l = c4791l4;
                        try {
                            AbstractC10999l.mopub(c3399l, c16248l3, 0, new C1914l(c6931l3, (C4043l) r5, (Context) r3, c4791l4, c3399l, (InterfaceC14029l) null), 2);
                            c7504l = c7504lMopub;
                            try {
                                context2 = context;
                                AbstractC10999l.mopub(c3399l, null, 0, new C3649l(c4791l, c4043l, c1008lYandex, context, c14524l, c3399l, c15428l, null, 5), 3);
                                C17822l c17822l = new C17822l(2, null);
                                c9648l2.f19672l = c3399l;
                                c9648l2.f19671l = context2;
                                c9648l2.f19675l = c4043l;
                                c9648l2.f19668l = c15428l;
                                c9648l2.f19669l = c16248l3;
                                c9648l2.f19674l = c7504l;
                                c9648l2.f19670l = c4791l;
                                c9648l2.f19676l = c6931l;
                                c9648l2.f19667l = 1;
                                Object objSmaato = AbstractC0622l.smaato(c1008lYandex, c17822l, c9648l2);
                                enumC9342l = enumC9342l2;
                                if (objSmaato != enumC9342l) {
                                    c4043l2 = c4043l;
                                    c3399l2 = c3399l;
                                    c15428l2 = c15428l;
                                    c16248l = c16248l3;
                                    r5 = c4791l;
                                    r6 = c6931l;
                                }
                                return enumC9342l;
                            } catch (Throwable th2) {
                                th = th2;
                                r5 = c4791l;
                                r6 = c6931l;
                                r3 = c7504l;
                                r4 = c16248l3;
                                r6.yandex();
                                r4.loadAd();
                                r3.ads(null);
                                r5.applovin();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            c7504l = c7504lMopub;
                            r5 = c4791l;
                            r6 = c6931l;
                            r3 = c7504l;
                            r4 = c16248l3;
                            r6.yandex();
                            r4.loadAd();
                            r3.ads(null);
                            r5.applovin();
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        c6931l = c6931l3;
                        c4791l = c4791l4;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    c4791l = c4791l4;
                    c6931l = c6931l3;
                }
                c9648l2.f19672l = c16248l3;
                c9648l2.f19671l = c7504l;
                c9648l2.f19675l = r5;
                c9648l2.f19668l = r6;
                c9648l2.f19669l = null;
                c9648l2.f19674l = null;
                c9648l2.f19670l = null;
                c9648l2.f19676l = null;
                c9648l2.f19667l = 2;
                if (c4043l3.amazon(context2, c6411l, c9648l2) != enumC9342l) {
                    interfaceC7042l = c7504l;
                    c16248l2 = c16248l3;
                    r1 = r6;
                    r2 = r5;
                    r1.yandex();
                    c16248l2.loadAd();
                    interfaceC7042l.ads(null);
                    r2.applovin();
                    return Unit.INSTANCE;
                }
                return enumC9342l;
            } catch (Throwable th6) {
                th = th6;
                r3 = c7504l;
                r4 = c16248l3;
                r6.yandex();
                r4.loadAd();
                r3.ads(null);
                r5.applovin();
                throw th;
            }
            c6411l = new C6411l(c3399l2, c15428l2, c4043l2, c16248l, 5);
            c4043l3 = c4043l2;
            c16248l3 = c16248l;
        } catch (Throwable th7) {
            th = th7;
            c16248l3 = c16248l;
        }
    }

    public static final void firebase(Level level, Executor executor, Exception exc, String str, Object... objArr) {
        RunnableC16843l runnableC16843l = new RunnableC16843l(10, level, exc, str, objArr, false);
        int i = AbstractC6854l.yandex;
        C9226l c9226lLoadAd = AbstractC10540l.loadAd();
        Object objBilling = c9226lLoadAd.loadAd;
        if (objBilling == null || objBilling == C4933l.f10053l) {
            objBilling = C10368l.billing(c9226lLoadAd);
        }
        executor.execute(new RunnableC7706l(new C10700l(), objBilling, runnableC16843l, false, 18));
    }

    public static final InterfaceC17242l isPro(InterfaceC17242l interfaceC17242l, boolean z, C2403l c2403l, C8372l c8372l, boolean z2, C6402l c6402l, Function1 function1) {
        InterfaceC17242l interfaceC17242lPremium;
        if (AbstractC2812l.advert(c8372l)) {
            interfaceC17242lPremium = new C17825l(z, c2403l, c8372l, z2, c6402l, function1);
        } else if (c8372l == null) {
            interfaceC17242lPremium = new C17825l(z, c2403l, null, z2, c6402l, function1);
        } else {
            C4346l c4346l = C4346l.f8873l;
            interfaceC17242lPremium = c2403l != null ? AbstractC14631l.yandex(c4346l, c2403l, c8372l).premium(new C17825l(z, c2403l, null, z2, c6402l, function1)) : AbstractC17541l.loadAd(c4346l, new C8161l(c8372l, z, z2, c6402l, function1, 1));
        }
        return interfaceC17242l.premium(interfaceC17242lPremium);
    }

    public static final void loadAd(float[] fArr, float f, float f2, float[] fArr2) {
        C10924l.amazon(fArr2);
        C10924l.isPro(fArr2, f, f2);
        subs(fArr, fArr2);
    }

    public static int mopub(C5257l c5257l) throws C17655l {
        int iMopub = c5257l.mopub(4);
        if (iMopub == 15) {
            if (c5257l.loadAd() >= 24) {
                return c5257l.mopub(24);
            }
            throw C17655l.yandex(null, "AAC header insufficient data");
        }
        if (iMopub < 13) {
            return yandex[iMopub];
        }
        throw C17655l.yandex(null, "AAC header wrong Sampling Frequency Index");
    }

    public static final InterfaceC12932l purchase(C18662l c18662l) {
        InterfaceC12932l interfaceC12932l = c18662l.f36440l;
        return interfaceC12932l.mo245l(C1083l.f2996l) == null ? interfaceC12932l.mo246l(AbstractC11174l.yandex()) : interfaceC12932l;
    }

    public static final void subs(float[] fArr, float[] fArr2) {
        float fAmazon = amazon(0, 0, fArr2, fArr);
        float fAmazon2 = amazon(0, 1, fArr2, fArr);
        float fAmazon3 = amazon(0, 2, fArr2, fArr);
        float fAmazon4 = amazon(0, 3, fArr2, fArr);
        float fAmazon5 = amazon(1, 0, fArr2, fArr);
        float fAmazon6 = amazon(1, 1, fArr2, fArr);
        float fAmazon7 = amazon(1, 2, fArr2, fArr);
        float fAmazon8 = amazon(1, 3, fArr2, fArr);
        float fAmazon9 = amazon(2, 0, fArr2, fArr);
        float fAmazon10 = amazon(2, 1, fArr2, fArr);
        float fAmazon11 = amazon(2, 2, fArr2, fArr);
        float fAmazon12 = amazon(2, 3, fArr2, fArr);
        float fAmazon13 = amazon(3, 0, fArr2, fArr);
        float fAmazon14 = amazon(3, 1, fArr2, fArr);
        float fAmazon15 = amazon(3, 2, fArr2, fArr);
        float fAmazon16 = amazon(3, 3, fArr2, fArr);
        fArr[0] = fAmazon;
        fArr[1] = fAmazon2;
        fArr[2] = fAmazon3;
        fArr[3] = fAmazon4;
        fArr[4] = fAmazon5;
        fArr[5] = fAmazon6;
        fArr[6] = fAmazon7;
        fArr[7] = fAmazon8;
        fArr[8] = fAmazon9;
        fArr[9] = fAmazon10;
        fArr[10] = fAmazon11;
        fArr[11] = fAmazon12;
        fArr[12] = fAmazon13;
        fArr[13] = fAmazon14;
        fArr[14] = fAmazon15;
        fArr[15] = fAmazon16;
    }

    public static final boolean yandex(View view, View view2) {
        if (view2.equals(view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }
}
