package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: lَٖؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16304l implements InterfaceC13600l {
    public final float yandex;

    public C16304l(float f) {
        this.yandex = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16304l) && this.yandex == ((C16304l) obj).yandex;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.yandex)});
    }

    @Override // defpackage.InterfaceC13600l
    public final float yandex(RectF rectF) {
        return this.yandex;
    }
}
