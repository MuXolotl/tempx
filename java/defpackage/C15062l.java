package defpackage;

/* JADX INFO: renamed from: lٔٞۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l(with = C18274l.class)
public final class C15062l extends AbstractC3160l {
    public static final C18316l Companion = new C18316l();

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C3662l f29593l;

    static {
        C14660l c14660l = C3662l.crashlytics;
        C14660l c14660l2 = C3662l.crashlytics;
        C14660l c14660l3 = C3662l.crashlytics;
        C14660l c14660l4 = C3662l.crashlytics;
        C14660l c14660l5 = C3662l.crashlytics;
        C14660l c14660l6 = C3662l.crashlytics;
        C14660l c14660l7 = C3662l.crashlytics;
    }

    public C15062l(C3662l c3662l) {
        this.f29593l = c3662l;
    }

    @Override // defpackage.AbstractC3160l
    public final int amazon() {
        return 20;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        C2336l c2336l = AbstractC18202l.yandex;
        if (AbstractC8576l.yandex(c2336l.loadAd(C15062l.class), c2336l.loadAd(obj.getClass()))) {
            return AbstractC8576l.yandex(this.f29593l, ((C15062l) obj).f29593l);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29593l.hashCode();
    }

    public final String toString() {
        return "BsonDecimal128(value=" + this.f29593l + ')';
    }
}
