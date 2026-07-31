package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؖٗؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4166l {
    public final List yandex;

    public C4166l(InterfaceC14254l... interfaceC14254lArr) {
        if (interfaceC14254lArr.length <= 0) {
            this.yandex = AbstractC8669l.m2415super(interfaceC14254lArr);
        } else {
            InterfaceC14254l interfaceC14254l = interfaceC14254lArr[0];
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4166l) {
            return AbstractC8576l.yandex(this.yandex, ((C4166l) obj).yandex);
        }
        return false;
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return "Settings(settings=" + this.yandex + ")";
    }
}
