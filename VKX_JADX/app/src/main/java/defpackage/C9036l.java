package defpackage;

import android.content.res.Resources;
import j$.util.Objects;

/* JADX INFO: renamed from: lٌۣۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9036l {
    public final Resources.Theme loadAd;
    public final Resources yandex;

    public C9036l(Resources resources, Resources.Theme theme) {
        this.yandex = resources;
        this.loadAd = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9036l.class == obj.getClass()) {
            C9036l c9036l = (C9036l) obj;
            if (this.yandex.equals(c9036l.yandex) && Objects.equals(this.loadAd, c9036l.loadAd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.yandex, this.loadAd);
    }
}
