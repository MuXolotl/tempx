package defpackage;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.widget.ImageView;

/* JADX INFO: renamed from: lَٛۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10413l {
    public static final C16543l amazon;
    public static final C16543l billing;
    public static final C16543l crashlytics;
    public static final C16543l loadAd;
    public static final C16543l mopub;
    public static final C16543l purchase;
    public static final C16543l yandex;

    static {
        int i = 11;
        yandex = new C16543l(i, InterfaceC3457l.yandex);
        loadAd = new C16543l(i, AbstractC4032l.loadAd);
        Object obj = null;
        crashlytics = new C16543l(i, obj);
        Boolean bool = Boolean.TRUE;
        amazon = new C16543l(i, bool);
        purchase = new C16543l(i, obj);
        billing = new C16543l(i, bool);
        mopub = new C16543l(i, Boolean.FALSE);
    }

    public static final void amazon(C9477l c9477l, ImageView imageView) {
        c9477l.amazon = new C2672l(imageView);
    }

    public static final ColorSpace crashlytics(C15106l c15106l) {
        return C1759l.billing(AbstractC0532l.amazon(c15106l, crashlytics));
    }

    public static final Bitmap.Config loadAd(C15106l c15106l) {
        return (Bitmap.Config) AbstractC0532l.amazon(c15106l, loadAd);
    }

    public static final void yandex(C9477l c9477l, boolean z) {
        c9477l.loadAd().yandex(billing, Boolean.valueOf(z));
    }
}
