package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* JADX INFO: renamed from: lؔٙٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2712l {
    public final boolean crashlytics;
    public final List loadAd;
    public final String yandex;

    public AbstractC2712l(String str, List list, boolean z) {
        this.yandex = str;
        this.loadAd = DesugarCollections.unmodifiableList(list);
        this.crashlytics = z;
    }

    public abstract Object yandex(List list);
}
