package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: renamed from: lؑۗۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0530l implements Comparator, Serializable {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Long.valueOf(((C1109l) obj).crashlytics).compareTo(Long.valueOf(((C1109l) obj2).crashlytics));
    }
}
