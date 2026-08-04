package defpackage;

import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: renamed from: lٜؔۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3070l {
    public C15585l yandex;

    public C3070l(String str, int i, int i2) {
        if (str == null) {
            C6541l.subs("package shouldn't be null");
            throw null;
        }
        if (TextUtils.isEmpty(str)) {
            C8339l.metrica("packageName should be nonempty");
            throw null;
        }
        if (Build.VERSION.SDK_INT < 28) {
            this.yandex = new C15585l(str, i, i2);
            return;
        }
        C2303l c2303l = new C2303l(str, i, i2);
        AbstractC1172l.purchase(i, i2, str);
        this.yandex = c2303l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3070l) {
            return this.yandex.equals(((C3070l) obj).yandex);
        }
        return false;
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }
}
