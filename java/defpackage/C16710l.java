package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lٌٖۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16710l {
    public static final C16710l crashlytics = new C16710l(new Bundle(), null);
    public List loadAd;
    public final Bundle yandex;

    public C16710l(Bundle bundle, ArrayList arrayList) {
        this.yandex = bundle;
        this.loadAd = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16710l)) {
            return false;
        }
        C16710l c16710l = (C16710l) obj;
        yandex();
        c16710l.yandex();
        return this.loadAd.equals(c16710l.loadAd);
    }

    public final int hashCode() {
        yandex();
        return this.loadAd.hashCode();
    }

    public final ArrayList loadAd() {
        yandex();
        return new ArrayList(this.loadAd);
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(loadAd().toArray()) + " }";
    }

    public final void yandex() {
        if (this.loadAd == null) {
            ArrayList<String> stringArrayList = this.yandex.getStringArrayList("controlCategories");
            this.loadAd = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.loadAd = Collections.EMPTY_LIST;
            }
        }
    }
}
