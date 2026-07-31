package defpackage;

/* JADX INFO: renamed from: lؒؗۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0861l {
    public static final C0861l crashlytics = new C0861l(0, null);
    public final InterfaceC13012l loadAd;
    public final int yandex;

    public C0861l(int i, InterfaceC13012l interfaceC13012l) {
        String string;
        this.yandex = i;
        this.loadAd = interfaceC13012l;
        if ((i == 0) == (interfaceC13012l == null)) {
            return;
        }
        if (i != 0) {
            StringBuilder sb = new StringBuilder("The projection variance ");
            sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "OUT" : "IN" : "INVARIANT");
            sb.append(" requires type to be specified.");
            string = sb.toString();
        } else {
            string = "Star projection must have no type specified.";
        }
        C10754l.metrica(string);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0861l)) {
            return false;
        }
        C0861l c0861l = (C0861l) obj;
        return this.yandex == c0861l.yandex && AbstractC8576l.yandex(this.loadAd, c0861l.loadAd);
    }

    public final int hashCode() {
        int i = this.yandex;
        int iInmobi = (i == 0 ? 0 : AbstractC5020l.inmobi(i)) * 31;
        InterfaceC13012l interfaceC13012l = this.loadAd;
        return iInmobi + (interfaceC13012l != null ? interfaceC13012l.hashCode() : 0);
    }

    public final String toString() {
        int i = this.yandex;
        int i2 = i == 0 ? -1 : AbstractC9536l.yandex[AbstractC5020l.inmobi(i)];
        if (i2 == -1) {
            return "*";
        }
        InterfaceC13012l interfaceC13012l = this.loadAd;
        if (i2 == 1) {
            return String.valueOf(interfaceC13012l);
        }
        if (i2 == 2) {
            return "in " + interfaceC13012l;
        }
        if (i2 != 3) {
            C18725l.billing();
            return null;
        }
        return "out " + interfaceC13012l;
    }
}
