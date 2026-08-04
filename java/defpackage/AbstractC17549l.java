package defpackage;

import android.R;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.List;

/* JADX INFO: renamed from: lٗۦُ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17549l {
    public static C3392l billing = null;
    public static int purchase = -1;
    public static final int[] yandex = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] loadAd = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] crashlytics = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] amazon = {R.attr.name, R.attr.pathData};

    public static final InterfaceC17242l admob(InterfaceC17242l interfaceC17242l, InterfaceC10137l interfaceC10137l) {
        return interfaceC17242l.premium(new C7058l(interfaceC10137l));
    }

    public static final InterfaceC17242l amazon(InterfaceC17242l interfaceC17242l, InterfaceC10137l interfaceC10137l) {
        return interfaceC17242l.premium(new C9994l(interfaceC10137l));
    }

    public static final C8896l billing(C12014l c12014l) {
        return AbstractC7470l.isPro(C1187l.subs(((C1187l) ((C10086l) c12014l.f23940l).getValue()).yandex, ((C1187l) ((C10086l) c12014l.f23944l).getValue()).yandex), ((C14174l) ((C10086l) c12014l.f23941l).getValue()).yandex);
    }

    public static final void crashlytics(C12014l c12014l, long j, long j2, long j3, boolean z) {
        C10086l c10086l = (C10086l) c12014l.f23940l;
        C10086l c10086l2 = (C10086l) c12014l.f23943l;
        C10086l c10086l3 = (C10086l) c12014l.f23941l;
        C10086l c10086l4 = (C10086l) c12014l.f23944l;
        if (!C1187l.loadAd(((C1187l) c10086l4.getValue()).yandex, j3) || !C14174l.loadAd(((C14174l) c10086l3.getValue()).yandex, j) || z) {
            c10086l3.setValue(new C14174l(j));
            c10086l4.setValue(new C1187l(j3));
            if (z) {
                c10086l.setValue(new C1187l(C1187l.admob(C1187l.admob(j2, j3), C1187l.admob(((C1187l) c10086l2.getValue()).yandex, ((C1187l) c10086l.getValue()).yandex))));
            }
        }
        c10086l2.setValue(new C1187l(C1187l.admob(j2, j3)));
    }

    public static final C8896l loadAd(C14509l c14509l, C8030l c8030l) {
        if (c8030l == null) {
            return null;
        }
        List listLoadAd = c14509l.loadAd();
        int size = listLoadAd.size();
        for (int i = 0; i < size; i++) {
            if (AbstractC8576l.yandex(((C0633l) listLoadAd.get(i)).f2093l, c8030l)) {
                if (c8030l.f29462l) {
                    return !c8030l.f16716l ? c8030l.f16718l : AbstractC7470l.isPro(c8030l.m2255l().mo2589native(AbstractC5573l.vip(c8030l), 0L, (6 & 4) != 0), AbstractC14707l.mopub(AbstractC5573l.vip(c8030l).f20590l));
                }
                return null;
            }
        }
        return null;
    }

    public static final String mopub(InterfaceC14029l interfaceC14029l) {
        Object c18435l;
        if (interfaceC14029l instanceof C16477l) {
            return ((C16477l) interfaceC14029l).toString();
        }
        try {
            c18435l = interfaceC14029l + '@' + purchase(interfaceC14029l);
        } catch (Throwable th) {
            c18435l = new C18435l(th);
        }
        if (C1171l.yandex(c18435l) != null) {
            c18435l = interfaceC14029l.getClass().getName() + '@' + purchase(interfaceC14029l);
        }
        return (String) c18435l;
    }

    public static final String purchase(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final void yandex(C10712l c10712l, C0059l c0059l, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        c6956l.m2133new(382909894);
        c6956l.m2125final(185152185);
        Object objM2132native = c6956l.m2132native();
        C13863l c13863l = C1867l.yandex;
        if (objM2132native == c13863l) {
            objM2132native = new C9950l();
            c6956l.m2147try(objM2132native);
        }
        C9950l c9950l = (C9950l) objM2132native;
        c6956l.startapp(false);
        c6956l.m2125final(185152232);
        Object objM2132native2 = c6956l.m2132native();
        if (objM2132native2 == c13863l) {
            objM2132native2 = new Matrix();
            c6956l.m2147try(objM2132native2);
        }
        Matrix matrix = (Matrix) objM2132native2;
        c6956l.startapp(false);
        c6956l.m2125final(185152312);
        boolean zBilling = c6956l.billing(c10712l);
        Object objM2132native3 = c6956l.m2132native();
        if (zBilling || objM2132native3 == c13863l) {
            objM2132native3 = AbstractC8020l.smaato(null);
            c6956l.m2147try(objM2132native3);
        }
        InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native3;
        c6956l.startapp(false);
        c6956l.m2125final(185152364);
        if (c10712l == null || c10712l.loadAd() == 0.0f) {
            AbstractC9383l.yandex(interfaceC17242l, c6956l, 6);
            c6956l.startapp(false);
            C4224l c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new C4342l(c10712l, c0059l, interfaceC17242l, i, 0);
                return;
            }
            return;
        }
        c6956l.startapp(false);
        Rect rect = c10712l.firebase;
        AbstractC12155l.yandex(interfaceC17242l.premium(new C4671l(rect.width(), rect.height())), new C4840l(rect, matrix, c9950l, c10712l, (Context) c6956l.isPro(AbstractC1242l.loadAd), c0059l, interfaceC8714l), c6956l, 0);
        C4224l c4224lAds2 = c6956l.ads();
        if (c4224lAds2 != null) {
            c4224lAds2.amazon = new C4342l(c10712l, c0059l, interfaceC17242l, i, 1);
        }
    }

    public abstract boolean firebase(AbstractC13813l abstractC13813l, C14714l c14714l, C14714l c14714l2);

    public abstract void isPro(C14714l c14714l, C14714l c14714l2);

    public abstract boolean metrica(AbstractC13813l abstractC13813l, Object obj, Object obj2);

    public abstract C14714l remoteconfig(AbstractC1207l abstractC1207l);

    public abstract boolean smaato(AbstractC13813l abstractC13813l, C14266l c14266l, C14266l c14266l2);

    public abstract void subs(C14714l c14714l, Thread thread);

    public abstract C14266l vip(AbstractC1207l abstractC1207l);
}
