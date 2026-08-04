package defpackage;

/* JADX INFO: renamed from: lَۖؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10486l extends AbstractC2775l implements InterfaceC8371l {

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC13922l[] f21345l = {new C0544l(C10486l.class, "fragments", "getFragments()Ljava/util/List;", 0), new C0544l(C10486l.class, "empty", "getEmpty()Z", 0)};

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C2278l f21346l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C2144l f21347l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C2312l f21348l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C10202l f21349l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C2278l f21350l;

    /* JADX WARN: Illegal instructions before constructor call */
    public C10486l(C10202l c10202l, C2312l c2312l, C16412l c16412l) {
        C3199l c3199l = C2782l.f6058l;
        C16781l c16781l = c2312l.yandex;
        super(c3199l, c16781l.crashlytics() ? C16781l.purchase : c16781l.mopub());
        this.f21349l = c10202l;
        this.f21348l = c2312l;
        this.f21350l = new C2278l(c16412l, new C10131l(this, 0));
        this.f21346l = new C2278l(c16412l, new C10131l(this, 1));
        this.f21347l = new C2144l(c16412l, new C10131l(this, 2));
    }

    @Override // defpackage.InterfaceC8371l
    public final InterfaceC8371l Signature() {
        C2312l c2312l = this.f21348l;
        if (c2312l.yandex.crashlytics()) {
            return null;
        }
        return this.f21349l.mo2270l(c2312l.loadAd());
    }

    @Override // defpackage.Cgoto
    public final boolean equals(Object obj) {
        C10486l c10486l = obj instanceof C10486l ? (C10486l) obj : null;
        if (c10486l == null) {
            return false;
        }
        return AbstractC8576l.yandex(this.f21348l, c10486l.f21348l) && AbstractC8576l.yandex(this.f21349l, c10486l.f21349l);
    }

    public final int hashCode() {
        return this.f21348l.hashCode() + (this.f21349l.hashCode() * 31);
    }

    @Override // defpackage.InterfaceC8371l
    /* JADX INFO: renamed from: import */
    public final Object mo1008import(InterfaceC15600l interfaceC15600l, Object obj) {
        return interfaceC15600l.firebase(this, obj);
    }
}
