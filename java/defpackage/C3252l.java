package defpackage;

/* JADX INFO: renamed from: lؚْؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3252l extends AbstractC12734l {
    public final C16757l yandex;

    public C3252l(C16757l c16757l) {
        EnumC18077l enumC18077l = EnumC18077l.f35371l;
        this.yandex = c16757l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12734l)) {
            return false;
        }
        if (!this.yandex.equals(((C3252l) ((AbstractC12734l) obj)).yandex)) {
            return false;
        }
        Object obj2 = EnumC18077l.f35371l;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return ((this.yandex.hashCode() ^ 1000003) * 1000003) ^ EnumC18077l.f35371l.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.yandex + ", productIdOrigin=" + EnumC18077l.f35371l + "}";
    }
}
