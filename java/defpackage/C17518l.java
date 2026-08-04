package defpackage;

import android.os.Build;
import android.view.DisplayCutout;

/* JADX INFO: renamed from: lِٗۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17518l {
    public final DisplayCutout yandex;

    public C17518l(DisplayCutout displayCutout) {
        this.yandex = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C17518l.class != obj.getClass()) {
            return false;
        }
        return this.yandex.equals(((C17518l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.yandex + "}";
    }

    public final C15496l yandex() {
        return Build.VERSION.SDK_INT >= 30 ? C15496l.crashlytics(AbstractC5121l.isPro(this.yandex)) : C15496l.purchase;
    }
}
