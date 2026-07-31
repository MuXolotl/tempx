package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import kotlin.Unit;

/* JADX INFO: renamed from: lٓؒٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13880l {
    public static final C13617l yandex = new C13617l(20);

    public static C5028l amazon(C6956l c6956l, int i) {
        c6956l.m2123default(2106917102);
        long jPurchase = AbstractC15038l.purchase(c6956l, 25);
        c6956l.startapp(false);
        boolean zPurchase = c6956l.purchase(jPurchase);
        Object objM2132native = c6956l.m2132native();
        if (zPurchase || objM2132native == C1867l.yandex) {
            objM2132native = AbstractC2576l.yandex(1.0f, jPurchase);
            c6956l.m2147try(objM2132native);
        }
        return (C5028l) objM2132native;
    }

    public static final C2106l billing(C2106l c2106l, int i, C14146l c14146l) {
        long j = i;
        try {
            C3535l c3535lSubs = AbstractC9843l.subs(j, c14146l.crashlytics);
            long j2 = c3535lSubs.yandex;
            long j3 = c3535lSubs.loadAd;
            C6760l c6760l = C9658l.f19699l;
            return c2106l.loadAd(AbstractC15918l.Signature(j2, EnumC16636l.SECONDS)).loadAd(AbstractC15918l.Signature(j3, EnumC16636l.NANOSECONDS));
        } catch (ArithmeticException unused) {
            C2106l c2106l2 = C2106l.f4733l;
            return C16367l.license(j > 0 ? Long.MAX_VALUE : Long.MIN_VALUE, 0L);
        } catch (IllegalArgumentException unused2) {
            C2106l c2106l3 = C2106l.f4733l;
            return C16367l.license(j > 0 ? Long.MAX_VALUE : Long.MIN_VALUE, 0L);
        }
    }

    public static C12654l crashlytics(C0764l c0764l) {
        C12654l c12654l = c0764l.f2299goto;
        if (c12654l != null) {
            return c12654l;
        }
        C12654l c12654l2 = new C12654l(AbstractC15038l.amazon(c0764l, 39), AbstractC15038l.yandex(c0764l, AbstractC15038l.amazon(c0764l, 39)), AbstractC12953l.firebase(C9735l.loadAd(0.38f, AbstractC15038l.amazon(c0764l, 44)), AbstractC15038l.amazon(c0764l, 39)), C9735l.loadAd(0.38f, AbstractC15038l.yandex(c0764l, AbstractC15038l.amazon(c0764l, 39))));
        c0764l.f2299goto = c12654l2;
        return c12654l2;
    }

    public static EnumC9199l loadAd(String str) throws IOException {
        if (str.equals("http/1.0")) {
            return EnumC9199l.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return EnumC9199l.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return EnumC9199l.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return EnumC9199l.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return EnumC9199l.SPDY_3;
        }
        if (str.equals("quic")) {
            return EnumC9199l.QUIC;
        }
        if (AbstractC16648l.isVip(str, "h3", false)) {
            return EnumC9199l.HTTP_3;
        }
        C18262l.metrica("Unexpected protocol: ".concat(str));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object mopub(C3640l c3640l, AbstractC0283l abstractC0283l) {
        C5935l c5935l;
        C3640l c3640l2;
        Throwable th;
        C0869l c0869l;
        if (abstractC0283l instanceof C5935l) {
            c5935l = (C5935l) abstractC0283l;
            int i = c5935l.f12496l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c5935l.f12496l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c5935l = new C5935l(abstractC0283l);
            }
        } else {
            c5935l = new C5935l(abstractC0283l);
        }
        Object obj = c5935l.f12499l;
        int i2 = c5935l.f12496l;
        if (i2 != 0) {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c0869l = c5935l.f12497l;
            c3640l2 = c5935l.f12498l;
            try {
                AbstractC2829l.crashlytics(obj);
                AbstractC1214l.yandex(c3640l2, null);
                return c0869l;
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    AbstractC1214l.yandex(c3640l2, th);
                    throw th3;
                }
            }
        }
        AbstractC2829l.crashlytics(obj);
        try {
            C0869l c0869l2 = new C0869l();
            c5935l.f12498l = c3640l;
            c5935l.f12497l = c0869l2;
            c5935l.f12496l = 1;
            c3640l.f7619l.mo701catch(c0869l2);
            Unit unit = Unit.INSTANCE;
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (unit == enumC9342l) {
                return enumC9342l;
            }
            c3640l2 = c3640l;
            c0869l = c0869l2;
            AbstractC1214l.yandex(c3640l2, null);
            return c0869l;
        } catch (Throwable th4) {
            c3640l2 = c3640l;
            th = th4;
            throw th;
        }
    }

    public static C12654l purchase(long j, long j2, C6956l c6956l, int i, int i2) {
        C12654l c12654l;
        long jLoadAd = (i2 & 2) != 0 ? AbstractC15038l.loadAd(j, c6956l) : j2;
        long j3 = C9735l.firebase;
        long jLoadAd2 = C9735l.loadAd(0.38f, AbstractC15038l.loadAd(j, c6956l));
        C0764l c0764l = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex;
        C12654l c12654l2 = c0764l.f2315super;
        if (c12654l2 == null) {
            C12654l c12654l3 = new C12654l(AbstractC15038l.amazon(c0764l, 35), AbstractC15038l.yandex(c0764l, AbstractC15038l.amazon(c0764l, 35)), AbstractC15038l.amazon(c0764l, 35), C9735l.loadAd(0.38f, AbstractC15038l.yandex(c0764l, AbstractC15038l.amazon(c0764l, 35))));
            c0764l.f2315super = c12654l3;
            c12654l = c12654l3;
        } else {
            c12654l = c12654l2;
        }
        return c12654l.yandex(j, jLoadAd, j3, jLoadAd2);
    }

    public static C12654l yandex(long j, long j2, long j3, long j4, C6956l c6956l, int i, int i2) {
        if ((i2 & 1) != 0) {
            j = C9735l.firebase;
        }
        if ((i2 & 2) != 0) {
            j2 = AbstractC15038l.loadAd(j, c6956l);
        }
        if ((i2 & 4) != 0) {
            j3 = C9735l.firebase;
        }
        if ((i2 & 8) != 0) {
            j4 = C9735l.loadAd(0.38f, j2);
        }
        return crashlytics(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex).yandex(j, j2, j3, j4);
    }
}
