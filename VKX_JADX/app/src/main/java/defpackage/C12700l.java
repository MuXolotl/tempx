package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: renamed from: lّٛٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12700l implements InterfaceC11766l, Serializable {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object f25021l;

    public C12700l(Object obj) {
        this.f25021l = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C12700l) {
            return AbstractC7000l.loadAd(this.f25021l, ((C12700l) obj).f25021l);
        }
        return false;
    }

    @Override // defpackage.InterfaceC11766l
    public final Object get() {
        return this.f25021l;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f25021l});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f25021l + ")";
    }
}
