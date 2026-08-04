package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lٕ٘ؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17937l extends AbstractC11904l {

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final C14006l f34908l = new C14006l(3, AbstractC18202l.yandex.loadAd(C17937l.class), 2, null);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final List f34909l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final List f34910l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final String f34911l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f34912l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C17937l f34913l;

    public C17937l(String str, String str2, List list, List list2, C17937l c17937l, C3844l c3844l) {
        super(f34908l, c3844l);
        this.f34912l = str;
        this.f34911l = str2;
        this.f34913l = c17937l;
        this.f34909l = AbstractC13457l.purchase("stack_trace", list);
        this.f34910l = AbstractC13457l.purchase("suppressed_exceptions", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17937l)) {
            return false;
        }
        C17937l c17937l = (C17937l) obj;
        return AbstractC8576l.yandex(yandex(), c17937l.yandex()) && AbstractC8576l.yandex(this.f34912l, c17937l.f34912l) && AbstractC8576l.yandex(this.f34911l, c17937l.f34911l) && AbstractC8576l.yandex(this.f34909l, c17937l.f34909l) && AbstractC8576l.yandex(this.f34910l, c17937l.f34910l) && AbstractC8576l.yandex(this.f34913l, c17937l.f34913l);
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iAdmob = AbstractC14814l.admob(AbstractC14814l.admob(AbstractC12589l.advert(AbstractC12589l.advert(yandex().hashCode() * 37, 37, this.f34912l), 37, this.f34911l), 37, this.f34909l), 37, this.f34910l);
        C17937l c17937l = this.f34913l;
        int iHashCode = iAdmob + (c17937l != null ? c17937l.hashCode() : 0);
        this.f23747l = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC9029l.pro(this.f34912l, "exception_class=", arrayList);
        AbstractC9029l.pro(this.f34911l, "message=", arrayList);
        List list = this.f34909l;
        if (!list.isEmpty()) {
            arrayList.add("stack_trace=" + list);
        }
        List list2 = this.f34910l;
        if (!list2.isEmpty()) {
            arrayList.add("suppressed_exceptions=" + list2);
        }
        C17937l c17937l = this.f34913l;
        if (c17937l != null) {
            arrayList.add("cause=" + c17937l);
        }
        return AbstractC16901l.m4210case(arrayList, ", ", "ExceptionReport{", "}", null, 56);
    }
}
