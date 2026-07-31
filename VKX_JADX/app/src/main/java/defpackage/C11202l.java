package defpackage;

/* JADX INFO: renamed from: lًُٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11202l extends AbstractC2520l {
    public final double crashlytics;
    public final InterfaceC14665l loadAd;

    public C11202l(C2234l c2234l, InterfaceC14665l interfaceC14665l, double d) {
        super(c2234l);
        this.loadAd = interfaceC14665l;
        this.crashlytics = d;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("SUCCESS");
        InterfaceC14665l interfaceC14665l = this.loadAd;
        if (interfaceC14665l.isEmpty()) {
            str = "";
        } else {
            str = "; " + interfaceC14665l;
        }
        sb.append(str);
        sb.append(" @ ");
        sb.append(AbstractC10478l.admob(this.yandex));
        return sb.toString();
    }
}
