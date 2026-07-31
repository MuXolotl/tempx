package defpackage;

/* JADX INFO: renamed from: lؖۦؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4511l extends AbstractC0436l {
    public final C11398l yandex;

    public C4511l(C11398l c11398l) {
        this.yandex = c11398l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0436l)) {
            return false;
        }
        AbstractC0436l abstractC0436l = (AbstractC0436l) obj;
        Object obj2 = EnumC1941l.f4418l;
        if (obj2.equals(obj2)) {
            return this.yandex.equals(((C4511l) abstractC0436l).yandex);
        }
        return false;
    }

    public final int hashCode() {
        return this.yandex.hashCode() ^ ((EnumC1941l.f4418l.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ClientInfo{clientType=" + EnumC1941l.f4418l + ", androidClientInfo=" + this.yandex + "}";
    }
}
