package defpackage;

import android.view.WindowId;

/* JADX INFO: renamed from: lؓؖٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1625l {
    public WindowId amazon;
    public boolean mopub;
    public final C10086l yandex = AbstractC8020l.smaato(new C1187l(9205357640488583168L));
    public final C10086l loadAd = AbstractC8020l.smaato(new C14174l(9205357640488583168L));
    public final C13765l crashlytics = new C13765l(0.0f);
    public final C3549l purchase = new C3549l();
    public final C10086l billing = AbstractC8020l.smaato(null);

    public final long loadAd() {
        return ((C1187l) this.yandex.getValue()).yandex;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HazeArea(");
        sb.append("positionOnScreen=" + C1187l.firebase(loadAd()) + ", ");
        sb.append("size=" + C14174l.subs(((C14174l) this.loadAd.getValue()).yandex) + ", ");
        sb.append("zIndex=" + this.crashlytics.admob() + ", ");
        sb.append("contentLayer=" + yandex() + ", ");
        sb.append("contentDrawing=" + this.mopub);
        sb.append(")");
        return sb.toString();
    }

    public final C11925l yandex() {
        return (C11925l) this.billing.getValue();
    }
}
