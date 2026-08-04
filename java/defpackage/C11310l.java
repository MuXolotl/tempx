package defpackage;

/* JADX INFO: renamed from: lُۚٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11310l {
    public final InterfaceC13012l loadAd;
    public final InterfaceC1388l yandex;

    public C11310l(InterfaceC1388l interfaceC1388l, InterfaceC13012l interfaceC13012l) {
        this.yandex = interfaceC1388l;
        this.loadAd = interfaceC13012l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11310l)) {
            return false;
        }
        InterfaceC13012l interfaceC13012l = this.loadAd;
        if (interfaceC13012l == null) {
            C11310l c11310l = (C11310l) obj;
            if (c11310l.loadAd == null) {
                return AbstractC8576l.yandex(this.yandex, c11310l.yandex);
            }
        }
        return AbstractC8576l.yandex(interfaceC13012l, ((C11310l) obj).loadAd);
    }

    public final int hashCode() {
        InterfaceC13012l interfaceC13012l = this.loadAd;
        return interfaceC13012l != null ? interfaceC13012l.hashCode() : this.yandex.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeInfo(");
        Object obj = this.loadAd;
        if (obj == null) {
            obj = this.yandex;
        }
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }
}
