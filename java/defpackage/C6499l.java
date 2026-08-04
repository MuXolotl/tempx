package defpackage;

import android.os.Bundle;
import j$.util.Objects;

/* JADX INFO: renamed from: lؙٖٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6499l {
    public final InterfaceC3270l amazon;
    public final int crashlytics;
    public final int loadAd;
    public final Bundle purchase;
    public final C16701l yandex;

    public C6499l(C16701l c16701l, int i, int i2, boolean z, InterfaceC3270l interfaceC3270l, Bundle bundle) {
        this.yandex = c16701l;
        this.loadAd = i;
        this.crashlytics = i2;
        this.amazon = interfaceC3270l;
        this.purchase = bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6499l)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C6499l c6499l = (C6499l) obj;
        InterfaceC3270l interfaceC3270l = c6499l.amazon;
        InterfaceC3270l interfaceC3270l2 = this.amazon;
        return (interfaceC3270l2 == null && interfaceC3270l == null) ? this.yandex.equals(c6499l.yandex) : Objects.equals(interfaceC3270l2, interfaceC3270l);
    }

    public final int hashCode() {
        return Objects.hash(this.amazon, this.yandex);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ControllerInfo {pkg=");
        C16701l c16701l = this.yandex;
        sb.append(c16701l.yandex.yandex);
        sb.append(", uid=");
        return AbstractC14814l.remoteconfig(c16701l.yandex.crashlytics, "}", sb);
    }
}
