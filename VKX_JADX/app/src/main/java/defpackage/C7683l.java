package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: lؚۨۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7683l implements InterfaceC0914l {
    public static final C7683l loadAd = new C7683l(0);
    public final /* synthetic */ int yandex;

    public /* synthetic */ C7683l(int i) {
        this.yandex = i;
    }

    @Override // defpackage.InterfaceC0914l
    public final InterfaceC14142l yandex(Object obj, C15106l c15106l, C13177l c13177l) {
        int i = 0;
        int i2 = 1;
        int i3 = 2;
        switch (this.yandex) {
            case 0:
                return new C10407l((C16820l) obj, c15106l);
            case 1:
                C16060l c16060l = (C16060l) obj;
                Bitmap.Config[] configArr = AbstractC4032l.yandex;
                if (AbstractC8576l.yandex(c16060l.crashlytics, "file") && AbstractC8576l.yandex(AbstractC16901l.m4217extends(AbstractC1051l.metrica(c16060l)), "android_asset")) {
                    return new C13020l(c16060l, c15106l, i);
                }
                return null;
            case 2:
                return new C12728l((Bitmap) obj);
            case 3:
                return new C4387l((byte[]) obj, c15106l, i);
            case 4:
                return new C4387l((ByteBuffer) obj, c15106l, i2);
            case 5:
                C16060l c16060l2 = (C16060l) obj;
                if (AbstractC8576l.yandex(c16060l2.crashlytics, "content")) {
                    return new C10622l(c16060l2, c15106l);
                }
                return null;
            case 6:
                C16060l c16060l3 = (C16060l) obj;
                if (AbstractC8576l.yandex(c16060l3.crashlytics, "data")) {
                    return new C13020l(c16060l3, c15106l, i2);
                }
                return null;
            case 7:
                return new C4387l((Drawable) obj, c15106l, i3);
            case 8:
                C16060l c16060l4 = (C16060l) obj;
                String str = c16060l4.crashlytics;
                if ((str != null && !str.equals("file")) || c16060l4.purchase == null) {
                    return null;
                }
                Bitmap.Config[] configArr2 = AbstractC4032l.yandex;
                if (AbstractC8576l.yandex(c16060l4.crashlytics, "file") && AbstractC8576l.yandex(AbstractC16901l.m4217extends(AbstractC1051l.metrica(c16060l4)), "android_asset")) {
                    return null;
                }
                return new C13020l(c16060l4, c15106l, i3);
            case 9:
                C16060l c16060l5 = (C16060l) obj;
                if (AbstractC8576l.yandex(c16060l5.crashlytics, "jar:file")) {
                    return new C13020l(c16060l5, c15106l, 3);
                }
                return null;
            default:
                C16060l c16060l6 = (C16060l) obj;
                if (AbstractC8576l.yandex(c16060l6.crashlytics, "android.resource")) {
                    return new C13020l(c16060l6, c15106l, 4);
                }
                return null;
        }
    }
}
