package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lَۙۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10542l extends AbstractC11904l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C13895l f21450l = new C13895l(3, AbstractC18202l.yandex.loadAd(C10542l.class), 2, null);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C13654l f21451l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f21452l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final List f21453l;

    public C10542l(int i, C13654l c13654l, List list, C3844l c3844l) {
        super(f21450l, c3844l);
        this.f21452l = i;
        this.f21451l = c13654l;
        this.f21453l = AbstractC13457l.purchase("modules", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10542l)) {
            return false;
        }
        C10542l c10542l = (C10542l) obj;
        return AbstractC8576l.yandex(yandex(), c10542l.yandex()) && this.f21452l == c10542l.f21452l && AbstractC8576l.yandex(this.f21451l, c10542l.f21451l) && AbstractC8576l.yandex(this.f21453l, c10542l.f21453l);
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((yandex().hashCode() * 37) + this.f21452l) * 37;
        C13654l c13654l = this.f21451l;
        int iHashCode2 = this.f21453l.hashCode() + ((iHashCode + (c13654l != null ? c13654l.hashCode() : 0)) * 37);
        this.f23747l = iHashCode2;
        return iHashCode2;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("protocol_version=" + this.f21452l);
        C13654l c13654l = this.f21451l;
        if (c13654l != null) {
            arrayList.add("device_info=" + c13654l);
        }
        List list = this.f21453l;
        if (!list.isEmpty()) {
            arrayList.add("modules=".concat(AbstractC16901l.m4210case(list, null, "[", "]", C17901l.f34850l, 25)));
        }
        return AbstractC16901l.m4210case(arrayList, ", ", "IacRootResponse{", "}", null, 56);
    }
}
