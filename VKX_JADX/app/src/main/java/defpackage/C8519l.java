package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lٌٖؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C8519l {
    public static final C12877l Companion = new C12877l();
    public static final InterfaceC1220l[] loadAd = {AbstractC9968l.crashlytics(2, new C3321l(25))};
    public final List yandex;

    public /* synthetic */ C8519l(int i, List list) {
        if ((i & 1) == 0) {
            this.yandex = null;
        } else {
            this.yandex = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8519l) && AbstractC8576l.yandex(this.yandex, ((C8519l) obj).yandex);
    }

    public final int hashCode() {
        List list = this.yandex;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return AbstractC0653l.subscription(new StringBuilder("EcosystemGetVerificationMethodsResponseDto(methods="), this.yandex, ')');
    }
}
