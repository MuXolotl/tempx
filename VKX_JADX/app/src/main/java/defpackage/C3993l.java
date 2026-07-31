package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٌؖؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3993l implements InterfaceC2180l {
    public final Function1 yandex;

    public C3993l(Function1 function1) {
        this.yandex = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3993l) && AbstractC8576l.yandex(this.yandex, ((C3993l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.yandex + ")";
    }

    @Override // defpackage.InterfaceC2180l
    public final Object yandex(InterfaceC18556l interfaceC18556l) {
        return this.yandex.invoke(interfaceC18556l);
    }
}
