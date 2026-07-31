package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lًْؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7968l extends AbstractC11904l {

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final C8275l f16614l = new C8275l(3, AbstractC18202l.yandex.loadAd(C7968l.class), 2, null);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final boolean f16615l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final EnumC1518l f16616l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final String f16617l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final boolean f16618l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f16619l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C6170l f16620l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final boolean f16621l;

    public C7968l(boolean z, boolean z2, boolean z3, boolean z4, EnumC1518l enumC1518l, C6170l c6170l, String str, C3844l c3844l) {
        super(f16614l, c3844l);
        this.f16619l = z;
        this.f16618l = z2;
        this.f16621l = z3;
        this.f16615l = z4;
        this.f16616l = enumC1518l;
        this.f16620l = c6170l;
        this.f16617l = str;
        if ((enumC1518l != null ? 1 : 0) + (c6170l != null ? 1 : 0) <= 1) {
            return;
        }
        C8339l.metrica("At most one of source_simple, source_playlist may be non-null");
        throw null;
    }

    public static C7968l loadAd(C7968l c7968l, boolean z, boolean z2, boolean z3, boolean z4, EnumC1518l enumC1518l, int i) {
        if ((i & 1) != 0) {
            z = c7968l.f16619l;
        }
        boolean z5 = z;
        if ((i & 2) != 0) {
            z2 = c7968l.f16618l;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            z3 = c7968l.f16621l;
        }
        boolean z7 = z3;
        if ((i & 8) != 0) {
            z4 = c7968l.f16615l;
        }
        boolean z8 = z4;
        if ((i & 16) != 0) {
            enumC1518l = c7968l.f16616l;
        }
        EnumC1518l enumC1518l2 = enumC1518l;
        C6170l c6170l = (i & 32) != 0 ? c7968l.f16620l : null;
        String str = c7968l.f16617l;
        C3844l c3844lYandex = c7968l.yandex();
        c7968l.getClass();
        return new C7968l(z5, z6, z7, z8, enumC1518l2, c6170l, str, c3844lYandex);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7968l)) {
            return false;
        }
        C7968l c7968l = (C7968l) obj;
        return AbstractC8576l.yandex(yandex(), c7968l.yandex()) && this.f16619l == c7968l.f16619l && this.f16618l == c7968l.f16618l && this.f16621l == c7968l.f16621l && this.f16615l == c7968l.f16615l && this.f16616l == c7968l.f16616l && AbstractC8576l.yandex(this.f16620l, c7968l.f16620l) && AbstractC8576l.yandex(this.f16617l, c7968l.f16617l);
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((yandex().hashCode() * 37) + (this.f16619l ? 1231 : 1237)) * 37) + (this.f16618l ? 1231 : 1237)) * 37) + (this.f16621l ? 1231 : 1237)) * 37) + (this.f16615l ? 1231 : 1237)) * 37;
        EnumC1518l enumC1518l = this.f16616l;
        int iHashCode2 = (iHashCode + (enumC1518l != null ? enumC1518l.hashCode() : 0)) * 37;
        C6170l c6170l = this.f16620l;
        int iHashCode3 = this.f16617l.hashCode() + ((iHashCode2 + (c6170l != null ? c6170l.hashCode() : 0)) * 37);
        this.f23747l = iHashCode3;
        return iHashCode3;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC9029l.ad(AbstractC9029l.metrica(AbstractC9029l.metrica(AbstractC9029l.metrica(new StringBuilder("direct_start="), this.f16619l, arrayList, "try_queue_first="), this.f16618l, arrayList, "shuffle="), this.f16621l, arrayList, "replace="), this.f16615l, arrayList);
        EnumC1518l enumC1518l = this.f16616l;
        if (enumC1518l != null) {
            arrayList.add("source_simple=" + enumC1518l);
        }
        C6170l c6170l = this.f16620l;
        if (c6170l != null) {
            arrayList.add("source_playlist=" + c6170l);
        }
        AbstractC9029l.pro(this.f16617l, "bt_device_name=", arrayList);
        return AbstractC16901l.m4210case(arrayList, ", ", "Scenario{", "}", null, 56);
    }

    public /* synthetic */ C7968l(String str, int i) {
        this(false, false, false, false, null, null, (i & 64) != 0 ? "" : str, C3844l.f7950l);
    }
}
