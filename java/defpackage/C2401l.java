package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lؔؖٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2401l {
    public final C2673l yandex;

    public /* synthetic */ C2401l(C15848l c15848l) {
        this.yandex = (C2673l) c15848l.f31100l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2401l) {
            return AbstractC7236l.amazon(this.yandex, ((C2401l) obj).yandex);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.yandex});
    }
}
