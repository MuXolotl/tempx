package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: lٕٕۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15702l implements Comparable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final List f30841l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final Set f30842l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f30843l;

    static {
        int i = 0;
        int i2 = 1;
        int i3 = 2;
        f30842l = AbstractC8669l.m2407import(new C15702l[]{new C15702l(i), new C15702l(i2), new C15702l(i3)});
        List listRemoteconfig = AbstractC14055l.remoteconfig(new C15702l(i3), new C15702l(i2), new C15702l(i));
        f30841l = listRemoteconfig;
        AbstractC16901l.m4229l(listRemoteconfig);
    }

    public /* synthetic */ C15702l(int i) {
        this.f30843l = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return C14467l.yandex(AbstractC15576l.billing(this.f30843l), AbstractC15576l.billing(((C15702l) obj).f30843l));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C15702l) {
            return this.f30843l == ((C15702l) obj).f30843l;
        }
        return false;
    }

    public final int hashCode() {
        return this.f30843l;
    }

    public final String toString() {
        String str;
        int i = this.f30843l;
        if (i == 0) {
            str = "Compact";
        } else if (i == 1) {
            str = "Medium";
        } else {
            str = i == 2 ? "Expanded" : "";
        }
        return "WindowHeightSizeClass.".concat(str);
    }
}
