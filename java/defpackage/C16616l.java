package defpackage;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import java.util.ArrayList;

/* JADX INFO: renamed from: lٖۚؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16616l {
    public static final String crashlytics;
    public static final C16616l loadAd;
    public final C4094l yandex;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        AbstractC12442l.subscription(!false);
        loadAd = new C16616l(new C4094l(sparseBooleanArray));
        String str = AbstractC15323l.yandex;
        crashlytics = Integer.toString(0, 36);
    }

    public C16616l(C4094l c4094l) {
        this.yandex = c4094l;
    }

    public static C16616l loadAd(Bundle bundle) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(crashlytics);
        if (integerArrayList == null) {
            return loadAd;
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i = 0; i < integerArrayList.size(); i++) {
            int iIntValue = integerArrayList.get(i).intValue();
            AbstractC12442l.subscription(!false);
            sparseBooleanArray.append(iIntValue, true);
        }
        AbstractC12442l.subscription(!false);
        return new C16616l(new C4094l(sparseBooleanArray));
    }

    public final Bundle crashlytics() {
        Bundle bundle = new Bundle();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i = 0;
        while (true) {
            C4094l c4094l = this.yandex;
            if (i >= c4094l.yandex.size()) {
                bundle.putIntegerArrayList(crashlytics, arrayList);
                return bundle;
            }
            arrayList.add(Integer.valueOf(c4094l.loadAd(i)));
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C16616l) {
            return this.yandex.equals(((C16616l) obj).yandex);
        }
        return false;
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final boolean yandex(int i) {
        return this.yandex.yandex.get(i);
    }
}
