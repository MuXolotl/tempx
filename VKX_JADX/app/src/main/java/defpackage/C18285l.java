package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: lّ٘ۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18285l {
    public final View loadAd;
    public final HashMap yandex = new HashMap();
    public final ArrayList crashlytics = new ArrayList();

    public C18285l(View view) {
        this.loadAd = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18285l)) {
            return false;
        }
        C18285l c18285l = (C18285l) obj;
        return this.loadAd == c18285l.loadAd && this.yandex.equals(c18285l.yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode() + (this.loadAd.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbAdvert = AbstractC5020l.advert("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbAdvert.append(this.loadAd);
        sbAdvert.append("\n");
        String strConcat = sbAdvert.toString().concat("    values:");
        HashMap map = this.yandex;
        for (String str : map.keySet()) {
            strConcat = strConcat + "    " + str + ": " + map.get(str) + "\n";
        }
        return strConcat;
    }
}
