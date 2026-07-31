package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lًٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8069l {
    public static C5197l amazon;
    public static final C15578l yandex = new C15578l(-2046479553, false, new C1659l(22));
    public static final C15578l loadAd = new C15578l(-2004531282, false, new C1659l(23));
    public static final C15578l crashlytics = new C15578l(888630450, false, new C1659l(24));

    public static final long amazon(C0327l c0327l, int i, boolean z, boolean z2) {
        C6222l c6222l = c0327l.loadAd;
        long j = c0327l.crashlytics;
        int iAmazon = c6222l.amazon(i);
        if (iAmazon >= c6222l.billing) {
            return 9205357640488583168L;
        }
        return (((long) Float.floatToRawIntBits(AbstractC8576l.amazon(c0327l.purchase(i, c0327l.yandex(((!z || z2) && (z || !z2)) ? Math.max(i + (-1), 0) : i) == c0327l.isPro(i)), 0.0f, (int) (j >> 32)))) << 32) | (((long) Float.floatToRawIntBits(AbstractC8576l.amazon(c6222l.loadAd(iAmazon), 0.0f, (int) (j & 4294967295L)))) & 4294967295L);
    }

    public static final C5197l crashlytics() {
        C5197l c5197l = amazon;
        if (c5197l != null) {
            return c5197l;
        }
        C10943l c10943l = new C10943l("AutoMirrored.Rounded.ArrowBack", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i = AbstractC8192l.yandex;
        C8990l c8990l = new C8990l(C9735l.loadAd);
        C15659l c15659l = new C15659l();
        c15659l.billing(19.0f, 11.0f);
        c15659l.crashlytics(7.83f);
        c15659l.purchase(4.88f, -4.88f);
        c15659l.loadAd(0.39f, -0.39f, 0.39f, -1.03f, 0.0f, -1.42f);
        c15659l.loadAd(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        c15659l.purchase(-6.59f, 6.59f);
        c15659l.loadAd(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        c15659l.purchase(6.59f, 6.59f);
        c15659l.loadAd(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        c15659l.loadAd(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        c15659l.amazon(7.83f, 13.0f);
        c15659l.crashlytics(19.0f);
        c15659l.loadAd(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        c15659l.mopub(-0.45f, -1.0f, -1.0f, -1.0f);
        c15659l.yandex();
        C10943l.yandex(c10943l, c15659l.f30611l, c8990l);
        C5197l c5197lLoadAd = c10943l.loadAd();
        amazon = c5197lLoadAd;
        return c5197lLoadAd;
    }

    public static final Object loadAd(C17778l c17778l, AbstractC0283l abstractC0283l) {
        C2397l c2397l = new C2397l(1, AbstractC17082l.billing(abstractC0283l));
        c2397l.license();
        c17778l.purchase(new C5008l(17, c2397l));
        c2397l.ad(new C4193l(c17778l, 1));
        return c2397l.Signature();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object yandex(C17993l c17993l, Function3 function3, Throwable th, AbstractC0283l abstractC0283l) {
        C12837l c12837l;
        if (abstractC0283l instanceof C12837l) {
            c12837l = (C12837l) abstractC0283l;
            int i = c12837l.f25246l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c12837l.f25246l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c12837l = new C12837l(abstractC0283l);
            }
        } else {
            c12837l = new C12837l(abstractC0283l);
        }
        Object obj = c12837l.f25244l;
        int i2 = c12837l.f25246l;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(obj);
                c12837l.f25245l = th;
                c12837l.f25246l = 1;
                Object objInvoke = function3.invoke(c17993l, th, c12837l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objInvoke == enumC9342l) {
                    return enumC9342l;
                }
            } else {
                if (i2 != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th = c12837l.f25245l;
                AbstractC2829l.crashlytics(obj);
            }
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                AbstractC11718l.yandex(th2, th);
            }
            throw th2;
        }
    }
}
