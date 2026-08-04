package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lٔؗؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14690l extends AbstractC11904l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C1301l f28752l = new C1301l(3, AbstractC18202l.yandex.loadAd(C14690l.class), 2, null);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final long f28753l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final EnumC15312l f28754l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final List f28755l;

    public C14690l(EnumC15312l enumC15312l, List list, long j, C3844l c3844l) {
        super(f28752l, c3844l);
        this.f28754l = enumC15312l;
        this.f28753l = j;
        this.f28755l = AbstractC13457l.purchase("available_items", list);
    }

    public static C14690l loadAd(C14690l c14690l, EnumC15312l enumC15312l, List list, long j, int i) {
        if ((i & 1) != 0) {
            enumC15312l = c14690l.f28754l;
        }
        EnumC15312l enumC15312l2 = enumC15312l;
        if ((i & 2) != 0) {
            list = c14690l.f28755l;
        }
        C3844l c3844lYandex = c14690l.yandex();
        c14690l.getClass();
        return new C14690l(enumC15312l2, list, j, c3844lYandex);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14690l)) {
            return false;
        }
        C14690l c14690l = (C14690l) obj;
        return AbstractC8576l.yandex(yandex(), c14690l.yandex()) && this.f28754l == c14690l.f28754l && AbstractC8576l.yandex(this.f28755l, c14690l.f28755l) && this.f28753l == c14690l.f28753l;
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iAdmob = AbstractC14814l.admob((this.f28754l.hashCode() + (yandex().hashCode() * 37)) * 37, 37, this.f28755l);
        long j = this.f28753l;
        int i2 = iAdmob + ((int) (j ^ (j >>> 32)));
        this.f23747l = i2;
        return i2;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("source=" + this.f28754l);
        List list = this.f28755l;
        if (!list.isEmpty()) {
            arrayList.add("available_items=" + list);
        }
        arrayList.add("loaded_at=" + this.f28753l);
        return AbstractC16901l.m4210case(arrayList, ", ", "VkxPlaylistsWidgetState{", "}", null, 56);
    }
}
