package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: l٘ٝۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C18075l implements InterfaceC3340l {
    public final BigInteger yandex;

    public C18075l(BigInteger bigInteger) {
        this.yandex = bigInteger;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C18075l) {
            return this.yandex.equals(((C18075l) obj).yandex);
        }
        return false;
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    @Override // defpackage.InterfaceC3340l
    public final BigInteger loadAd() {
        return this.yandex;
    }

    @Override // defpackage.InterfaceC3340l
    public final int yandex() {
        return 1;
    }
}
