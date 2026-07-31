package defpackage;

import android.graphics.Shader;
import android.os.Build;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: lؑۖۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0509l {
    public static final C15578l yandex = new C15578l(1598145118, false, new C2834l(13));
    public static final C15578l loadAd = new C15578l(1083909494, false, new C11112l(5));
    public static final C15578l crashlytics = new C15578l(654084171, false, new C2834l(14));
    public static final C15578l amazon = new C15578l(1607006894, false, new C11112l(6));
    public static final C15578l purchase = new C15578l(1049022831, false, new C11112l(7));

    public static final Shader.TileMode amazon(int i) {
        if (i == 0) {
            return Shader.TileMode.CLAMP;
        }
        if (i == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i == 2) {
            return Shader.TileMode.MIRROR;
        }
        if (i == 3) {
            return Build.VERSION.SDK_INT >= 31 ? AbstractC12148l.startapp() : Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.CLAMP;
    }

    public static final AbstractC18082l billing(Iterable iterable) {
        AbstractC18082l abstractC18082l = iterable instanceof AbstractC18082l ? (AbstractC18082l) iterable : null;
        if (abstractC18082l != null) {
            return abstractC18082l;
        }
        C1637l c1637l = iterable instanceof C1637l ? (C1637l) iterable : null;
        AbstractC18082l abstractC18082lAdvert = c1637l != null ? c1637l.advert() : null;
        if (abstractC18082lAdvert != null) {
            return abstractC18082lAdvert;
        }
        boolean z = iterable instanceof Collection;
        C11507l c11507l = C11507l.f23131l;
        if (z) {
            return c11507l.advert((Collection) iterable);
        }
        C1637l c1637lIsVip = c11507l.isVip();
        AbstractC3984l.license(c1637lIsVip, iterable);
        return c1637lIsVip.advert();
    }

    public static final AbstractC18082l crashlytics(Object... objArr) {
        return C11507l.f23131l.advert(Arrays.asList(objArr));
    }

    public static final int loadAd(float f) {
        return Math.round((float) Math.ceil(f));
    }

    public static final InterfaceC13238l purchase(List list) {
        InterfaceC13238l interfaceC13238l = list instanceof InterfaceC13238l ? (InterfaceC13238l) list : null;
        return interfaceC13238l == null ? billing(list) : interfaceC13238l;
    }

    public static final AbstractC14971l yandex(InterfaceC8605l interfaceC8605l, int i) {
        AbstractC14971l abstractC14971l = ((AbstractC14971l) interfaceC8605l).f29454l.f29460l;
        if (abstractC14971l == null || (abstractC14971l.f29457l & i) == 0) {
            return null;
        }
        while (abstractC14971l != null) {
            int i2 = abstractC14971l.f29450l;
            if ((i2 & 2) != 0) {
                return null;
            }
            if ((i2 & i) != 0) {
                return abstractC14971l;
            }
            abstractC14971l = abstractC14971l.f29460l;
        }
        return null;
    }
}
