package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lُؑٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0247l extends AbstractC11904l {

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final C6210l f1238l = new C6210l(3, AbstractC18202l.yandex.loadAd(C0247l.class), 2, null);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final boolean f1239l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final boolean f1240l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final int f1241l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final String f1242l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f1243l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final boolean f1244l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final String f1245l;

    public C0247l(String str, String str2, String str3, boolean z, boolean z2, boolean z3, int i, C3844l c3844l) {
        super(f1238l, c3844l);
        this.f1243l = str;
        this.f1242l = str2;
        this.f1245l = str3;
        this.f1239l = z;
        this.f1240l = z2;
        this.f1244l = z3;
        this.f1241l = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0247l)) {
            return false;
        }
        C0247l c0247l = (C0247l) obj;
        return AbstractC8576l.yandex(yandex(), c0247l.yandex()) && AbstractC8576l.yandex(this.f1243l, c0247l.f1243l) && AbstractC8576l.yandex(this.f1242l, c0247l.f1242l) && AbstractC8576l.yandex(this.f1245l, c0247l.f1245l) && this.f1239l == c0247l.f1239l && this.f1240l == c0247l.f1240l && this.f1244l == c0247l.f1244l && this.f1241l == c0247l.f1241l;
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iAdvert = ((((((AbstractC12589l.advert(AbstractC12589l.advert(AbstractC12589l.advert(yandex().hashCode() * 37, 37, this.f1243l), 37, this.f1242l), 37, this.f1245l) + (this.f1239l ? 1231 : 1237)) * 37) + (this.f1240l ? 1231 : 1237)) * 37) + (this.f1244l ? 1231 : 1237)) * 37) + this.f1241l;
        this.f23747l = iAdvert;
        return iAdvert;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC9029l.pro(this.f1243l, "id=", arrayList);
        AbstractC9029l.pro(this.f1242l, "title=", arrayList);
        StringBuilder sbMetrica = AbstractC9029l.metrica(AbstractC9029l.metrica(AbstractC9029l.metrica(AbstractC9029l.vip(this.f1245l, "description=", arrayList, "is_recommended="), this.f1239l, arrayList, "is_automatic="), this.f1240l, arrayList, "is_extra_tax="), this.f1244l, arrayList, "minimum_price_rub=");
        sbMetrica.append(this.f1241l);
        arrayList.add(sbMetrica.toString());
        return AbstractC16901l.m4210case(arrayList, ", ", "PaymentMethod{", "}", null, 56);
    }
}
