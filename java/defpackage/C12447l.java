package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lؚّ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12447l extends AbstractC11904l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C8875l f24570l = new C8875l(3, AbstractC18202l.yandex.loadAd(C12447l.class), 2, null);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final List f24571l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final long f24572l;

    public C12447l(ArrayList arrayList, long j, C3844l c3844l) {
        super(f24570l, c3844l);
        this.f24572l = j;
        this.f24571l = AbstractC13457l.purchase("messages", arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12447l)) {
            return false;
        }
        C12447l c12447l = (C12447l) obj;
        return AbstractC8576l.yandex(yandex(), c12447l.yandex()) && AbstractC8576l.yandex(this.f24571l, c12447l.f24571l) && this.f24572l == c12447l.f24572l;
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iAdmob = AbstractC14814l.admob(yandex().hashCode() * 37, 37, this.f24571l);
        long j = this.f24572l;
        int i2 = iAdmob + ((int) (j ^ (j >>> 32)));
        this.f23747l = i2;
        return i2;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.f24571l;
        if (!list.isEmpty()) {
            arrayList.add("messages=" + list);
        }
        arrayList.add("last_read=" + this.f24572l);
        return AbstractC16901l.m4210case(arrayList, ", ", "InboxList{", "}", null, 56);
    }
}
