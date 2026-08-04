package defpackage;

import android.os.Build;
import android.widget.EdgeEffect;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lَِؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1789l {
    public static final C15578l yandex = new C15578l(749773641, false, new C10272l(10));
    public static final C15578l loadAd = new C15578l(-566276152, false, new C10272l(11));
    public static final C15578l crashlytics = new C15578l(-223385095, false, new C13881l(20));
    public static final C15578l amazon = new C15578l(-1288352326, false, new C13881l(21));
    public static final C15578l purchase = new C15578l(1941647739, false, new C13881l(22));
    public static final C15578l billing = new C15578l(20151768, false, new C13881l(23));
    public static final C15578l mopub = new C15578l(-1044815463, false, new C13881l(24));
    public static final C15578l admob = new C15578l(-2109782694, false, new C13881l(25));
    public static final C15578l subs = new C15578l(-530698500, false, new C13881l(26));
    public static final C15578l isPro = new C15578l(571461555, false, new C13881l(18));
    public static final C15578l firebase = new C15578l(-884951500, false, new C13881l(19));

    public static final InterfaceC13854l amazon(InterfaceC12932l interfaceC12932l) {
        InterfaceC13854l interfaceC13854l = (InterfaceC13854l) interfaceC12932l.mo245l(C11140l.f22361l);
        if (interfaceC13854l != null) {
            return interfaceC13854l;
        }
        C8339l.smaato("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    public static final InterfaceC12001l crashlytics(InterfaceC12001l interfaceC12001l, InterfaceC12133l interfaceC12133l) {
        return interfaceC12001l.billing(new C10847l(interfaceC12133l));
    }

    public static float loadAd(EdgeEffect edgeEffect, float f, float f2, InterfaceC13490l interfaceC13490l) {
        float f3 = AbstractC7421l.yandex;
        double dLoadAd = interfaceC13490l.loadAd() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f) * 0.35f;
        double d = ((double) AbstractC7421l.yandex) * dLoadAd;
        float fExp = (float) (Math.exp((AbstractC7421l.loadAd / AbstractC7421l.crashlytics) * Math.log(dAbs / d)) * d);
        int i = Build.VERSION.SDK_INT;
        if (fExp > (i >= 31 ? AbstractC12148l.metrica(edgeEffect) : 0.0f) * f2) {
            return 0.0f;
        }
        int iAds = AbstractC5573l.ads(f);
        if (i >= 31) {
            edgeEffect.onAbsorb(iAds);
            return f;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(iAds);
        }
        return f;
    }

    public static final Object purchase(Function1 function1, AbstractC5563l abstractC5563l) {
        return amazon(abstractC5563l.f1295l).mo1226super(new C13832l(2, function1), abstractC5563l);
    }

    public static final C4163l yandex(AbstractC8237l abstractC8237l, String str) {
        return new C4163l(str, abstractC8237l.yandex);
    }
}
