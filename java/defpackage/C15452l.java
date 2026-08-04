package defpackage;

/* JADX INFO: renamed from: lٕؕۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C15452l implements InterfaceC9234l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C6336l f30209l;

    public C15452l(C6336l c6336l) {
        this.f30209l = c6336l;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C15452l) && (obj instanceof InterfaceC9234l)) {
            return loadAd().equals(((InterfaceC9234l) obj).loadAd());
        }
        return false;
    }

    public final int hashCode() {
        return loadAd().hashCode();
    }

    @Override // defpackage.InterfaceC9234l
    public final InterfaceC14328l loadAd() {
        return new C1538l(1, this.f30209l, C6336l.class, "migrate", "migrate(Lio/realm/kotlin/migration/AutomaticSchemaMigration$MigrationContext;)V", 0, 0);
    }
}
