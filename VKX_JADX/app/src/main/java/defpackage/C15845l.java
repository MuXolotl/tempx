package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lٕٞۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15845l extends AbstractC11904l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C18250l f31097l = new C18250l(3, AbstractC18202l.yandex.loadAd(C15845l.class), 2, null);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final String f31098l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final long f31099l;

    public C15845l(long j, String str, C3844l c3844l) {
        super(f31097l, c3844l);
        this.f31099l = j;
        this.f31098l = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C15845l)) {
            return false;
        }
        C15845l c15845l = (C15845l) obj;
        return AbstractC8576l.yandex(yandex(), c15845l.yandex()) && this.f31099l == c15845l.f31099l && AbstractC8576l.yandex(this.f31098l, c15845l.f31098l);
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = yandex().hashCode() * 37;
        long j = this.f31099l;
        int iHashCode2 = this.f31098l.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 37);
        this.f23747l = iHashCode2;
        return iHashCode2;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("size=" + this.f31099l);
        AbstractC9029l.pro(this.f31098l, "destination=", arrayList);
        return AbstractC16901l.m4210case(arrayList, ", ", "CdcmFileMarker{", "}", null, 56);
    }

    public /* synthetic */ C15845l(long j, String str) {
        this(j, str, C3844l.f7950l);
    }
}
