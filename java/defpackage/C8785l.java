package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lٌٔۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8785l extends AbstractC11904l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C7298l f18084l = new C7298l(3, AbstractC18202l.yandex.loadAd(C8785l.class), 2, null);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final EnumC15144l f18085l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f18086l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final List f18087l;

    public C8785l(String str, EnumC15144l enumC15144l, List list, C3844l c3844l) {
        super(f18084l, c3844l);
        this.f18086l = str;
        this.f18085l = enumC15144l;
        this.f18087l = AbstractC13457l.purchase("stack_trace", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8785l)) {
            return false;
        }
        C8785l c8785l = (C8785l) obj;
        return AbstractC8576l.yandex(yandex(), c8785l.yandex()) && AbstractC8576l.yandex(this.f18086l, c8785l.f18086l) && this.f18085l == c8785l.f18085l && AbstractC8576l.yandex(this.f18087l, c8785l.f18087l);
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.f18087l.hashCode() + ((this.f18085l.hashCode() + AbstractC12589l.advert(yandex().hashCode() * 37, 37, this.f18086l)) * 37);
        this.f23747l = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        StringBuilder sbVip = AbstractC9029l.vip(this.f18086l, "name=", arrayList, "state=");
        sbVip.append(this.f18085l);
        arrayList.add(sbVip.toString());
        List list = this.f18087l;
        if (!list.isEmpty()) {
            arrayList.add("stack_trace=" + list);
        }
        return AbstractC16901l.m4210case(arrayList, ", ", "ThreadReport{", "}", null, 56);
    }
}
