package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lٌٍٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9424l implements InterfaceC4944l {
    public final ArrayList yandex;

    public C9424l(ArrayList arrayList) {
        this.yandex = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9424l) && this.yandex.equals(((C9424l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return "Success(data=" + this.yandex + ')';
    }
}
