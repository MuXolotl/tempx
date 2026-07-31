package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٖؔۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16165l {
    public final Function0 loadAd;
    public final Object yandex;

    public C16165l(Object obj, Function0 function0) {
        this.yandex = obj;
        this.loadAd = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C16165l.class == obj.getClass() && this.yandex.equals(((C16165l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }
}
