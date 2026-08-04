package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؔ٘ۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2697l {
    public static final C7638l yandex = new C7638l();
    public static final C8125l loadAd = new C8125l(5);
    public static final C8125l crashlytics = new C8125l(6);
    public static final C8125l amazon = new C8125l(7);
    public static final C8125l purchase = new C8125l(8);
    public static final C8125l billing = new C8125l(9);

    public AbstractC2697l(AbstractC18261l abstractC18261l) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void firebase(InterfaceC16388l interfaceC16388l) {
        if (((AbstractC14971l) interfaceC16388l).f29454l.f29462l) {
            AbstractC5573l.smaato(interfaceC16388l, 1).m4495l();
        }
    }

    public static final InterfaceC17242l subscription(InterfaceC17242l interfaceC17242l, Function1 function1) {
        return interfaceC17242l.premium(new C9274l(function1));
    }

    public static final boolean vip(InterfaceC0582l interfaceC0582l) {
        return (interfaceC0582l instanceof C6143l) || (interfaceC0582l instanceof C16016l);
    }

    public static final void yandex(C8464l c8464l, C3654l c3654l) {
        long jMo2591strictfp = ((C11103l) c3654l.f7703l.amazon).mo2591strictfp(0L);
        int iRound = Math.round(Float.intBitsToFloat((int) (jMo2591strictfp >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jMo2591strictfp & 4294967295L)));
        c8464l.layout(iRound, iRound2, c8464l.getMeasuredWidth() + iRound, c8464l.getMeasuredHeight() + iRound2);
    }

    public abstract boolean adcel(View view, float f);

    public abstract int admob(View view);

    public abstract void ads(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2);

    public abstract int amazon();

    public abstract int billing();

    public abstract float crashlytics(int i);

    public abstract int isPro();

    public abstract int loadAd(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract boolean metrica(float f, float f2);

    public abstract int mopub();

    public abstract int purchase();

    public abstract boolean remoteconfig(View view);

    public abstract boolean smaato(float f);

    public boolean startapp() {
        throw null;
    }

    public abstract int subs(CoordinatorLayout coordinatorLayout);
}
