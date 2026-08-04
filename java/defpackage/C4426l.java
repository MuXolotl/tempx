package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: lِؖ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4426l extends AbstractC11904l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C12213l f9013l = new C12213l(AbstractC18202l.yandex.loadAd(C4426l.class));

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Map f9014l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f9015l;

    public C4426l(String str, LinkedHashMap linkedHashMap, C3844l c3844l) {
        super(f9013l, c3844l);
        this.f9015l = str;
        this.f9014l = AbstractC13457l.billing("replacements", linkedHashMap);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4426l)) {
            return false;
        }
        C4426l c4426l = (C4426l) obj;
        return AbstractC8576l.yandex(yandex(), c4426l.yandex()) && AbstractC8576l.yandex(this.f9015l, c4426l.f9015l) && AbstractC8576l.yandex(this.f9014l, c4426l.f9014l);
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.f9014l.hashCode() + AbstractC12589l.advert(yandex().hashCode() * 37, 37, this.f9015l);
        this.f23747l = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC9029l.pro(this.f9015l, "text=", arrayList);
        Map map = this.f9014l;
        if (!map.isEmpty()) {
            arrayList.add("replacements=" + map);
        }
        return AbstractC16901l.m4210case(arrayList, ", ", "Content{", "}", null, 56);
    }
}
