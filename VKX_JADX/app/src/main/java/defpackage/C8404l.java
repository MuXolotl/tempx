package defpackage;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: lًۦؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8404l {
    public final C14965l loadAd;
    public final String yandex;

    public C8404l(Set set, C14965l c14965l) {
        this.yandex = loadAd(set);
        this.loadAd = c14965l;
    }

    public static String loadAd(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C4662l c4662l = (C4662l) it.next();
            sb.append(c4662l.yandex);
            sb.append('/');
            sb.append(c4662l.loadAd);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String yandex() {
        Set setUnmodifiableSet;
        C14965l c14965l = this.loadAd;
        synchronized (((HashSet) c14965l.f29441l)) {
            setUnmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) c14965l.f29441l);
        }
        boolean zIsEmpty = setUnmodifiableSet.isEmpty();
        String str = this.yandex;
        if (zIsEmpty) {
            return str;
        }
        return str + ' ' + loadAd(c14965l.isPro());
    }
}
