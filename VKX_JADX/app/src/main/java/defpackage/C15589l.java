package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lَٕؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15589l extends AbstractC11904l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C12621l f30433l = new C12621l(3, AbstractC18202l.yandex.loadAd(C15589l.class), 2, null);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final EnumC1496l f30434l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final String f30435l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f30436l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final int f30437l;

    public /* synthetic */ C15589l(String str, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? "8.14.1_pub" : "", (i & 4) != 0 ? 0 : 100136, EnumC1496l.f3744l, C3844l.f7950l);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C15589l)) {
            return false;
        }
        C15589l c15589l = (C15589l) obj;
        return AbstractC8576l.yandex(yandex(), c15589l.yandex()) && AbstractC8576l.yandex(this.f30436l, c15589l.f30436l) && AbstractC8576l.yandex(this.f30435l, c15589l.f30435l) && this.f30437l == c15589l.f30437l && this.f30434l == c15589l.f30434l;
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.f30434l.hashCode() + ((AbstractC12589l.advert(AbstractC12589l.advert(yandex().hashCode() * 37, 37, this.f30436l), 37, this.f30435l) + this.f30437l) * 37);
        this.f23747l = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC9029l.pro(this.f30436l, "package_name=", arrayList);
        StringBuilder sbVip = AbstractC9029l.vip(this.f30435l, "version_name=", arrayList, "version_code=");
        sbVip.append(this.f30437l);
        arrayList.add(sbVip.toString());
        arrayList.add("platform=" + this.f30434l);
        return AbstractC16901l.m4210case(arrayList, ", ", "OrbitCoreApplicationInfo{", "}", null, 56);
    }

    public C15589l(String str, String str2, int i, EnumC1496l enumC1496l, C3844l c3844l) {
        super(f30433l, c3844l);
        this.f30436l = str;
        this.f30435l = str2;
        this.f30437l = i;
        this.f30434l = enumC1496l;
    }
}
