package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lَّٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10434l extends AbstractC11904l {

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final C4413l f21246l = new C4413l(3, AbstractC18202l.yandex.loadAd(C10434l.class), 2, null);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final String f21247l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final boolean f21248l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final String f21249l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f21250l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final boolean f21251l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final int f21252l;

    public /* synthetic */ C10434l(String str, String str2, int i, String str3, boolean z, boolean z2, int i2) {
        this(str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? "" : str3, z, (i2 & 32) != 0 ? false : z2, C3844l.f7950l);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10434l)) {
            return false;
        }
        C10434l c10434l = (C10434l) obj;
        return AbstractC8576l.yandex(yandex(), c10434l.yandex()) && AbstractC8576l.yandex(this.f21250l, c10434l.f21250l) && AbstractC8576l.yandex(this.f21249l, c10434l.f21249l) && this.f21252l == c10434l.f21252l && AbstractC8576l.yandex(this.f21247l, c10434l.f21247l) && this.f21248l == c10434l.f21248l && this.f21251l == c10434l.f21251l;
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iAdvert = ((AbstractC12589l.advert((AbstractC12589l.advert(AbstractC12589l.advert(yandex().hashCode() * 37, 37, this.f21250l), 37, this.f21249l) + this.f21252l) * 37, 37, this.f21247l) + (this.f21248l ? 1231 : 1237)) * 37) + (this.f21251l ? 1231 : 1237);
        this.f23747l = iAdvert;
        return iAdvert;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC9029l.pro(this.f21250l, "class_name=", arrayList);
        StringBuilder sbVip = AbstractC9029l.vip(this.f21249l, "file_name=", arrayList, "line_number=");
        sbVip.append(this.f21252l);
        arrayList.add(sbVip.toString());
        AbstractC9029l.ad(AbstractC9029l.metrica(AbstractC9029l.vip(this.f21247l, "method_name=", arrayList, "is_native_method="), this.f21248l, arrayList, "is_sourcefile_cleared="), this.f21251l, arrayList);
        return AbstractC16901l.m4210case(arrayList, ", ", "StackTraceElement{", "}", null, 56);
    }

    public C10434l(String str, String str2, int i, String str3, boolean z, boolean z2, C3844l c3844l) {
        super(f21246l, c3844l);
        this.f21250l = str;
        this.f21249l = str2;
        this.f21252l = i;
        this.f21247l = str3;
        this.f21248l = z;
        this.f21251l = z2;
    }
}
