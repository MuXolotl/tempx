package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lٖؕۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3554l extends AbstractC11904l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C4106l f7468l = new C4106l(3, AbstractC18202l.yandex.loadAd(C3554l.class), 2, null);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final List f7469l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final String f7470l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f7471l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final boolean f7472l;

    public C3554l(String str, String str2, List list, boolean z, C3844l c3844l) {
        super(f7468l, c3844l);
        this.f7471l = str;
        this.f7470l = str2;
        this.f7472l = z;
        this.f7469l = AbstractC13457l.purchase("bands", list);
    }

    public static C3554l loadAd(C3554l c3554l, String str, String str2, ArrayList arrayList, int i) {
        if ((i & 1) != 0) {
            str = c3554l.f7471l;
        }
        String str3 = str;
        if ((i & 2) != 0) {
            str2 = c3554l.f7470l;
        }
        String str4 = str2;
        List list = arrayList;
        if ((i & 4) != 0) {
            list = c3554l.f7469l;
        }
        boolean z = c3554l.f7472l;
        C3844l c3844lYandex = c3554l.yandex();
        c3554l.getClass();
        return new C3554l(str3, str4, list, z, c3844lYandex);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3554l)) {
            return false;
        }
        C3554l c3554l = (C3554l) obj;
        return AbstractC8576l.yandex(yandex(), c3554l.yandex()) && AbstractC8576l.yandex(this.f7471l, c3554l.f7471l) && AbstractC8576l.yandex(this.f7470l, c3554l.f7470l) && AbstractC8576l.yandex(this.f7469l, c3554l.f7469l) && this.f7472l == c3554l.f7472l;
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iAdmob = AbstractC14814l.admob(AbstractC12589l.advert(AbstractC12589l.advert(yandex().hashCode() * 37, 37, this.f7471l), 37, this.f7470l), 37, this.f7469l) + (this.f7472l ? 1231 : 1237);
        this.f23747l = iAdmob;
        return iAdmob;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC9029l.pro(this.f7471l, "id=", arrayList);
        AbstractC9029l.pro(this.f7470l, "name=", arrayList);
        List list = this.f7469l;
        if (!list.isEmpty()) {
            arrayList.add("bands=" + list);
        }
        AbstractC9029l.ad(new StringBuilder("double_pass="), this.f7472l, arrayList);
        return AbstractC16901l.m4210case(arrayList, ", ", "Equalizer{", "}", null, 56);
    }

    public /* synthetic */ C3554l(String str, String str2, ArrayList arrayList) {
        this(str, str2, arrayList, false, C3844l.f7950l);
    }
}
