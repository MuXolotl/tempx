package defpackage;

/* JADX INFO: renamed from: lِّٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14830l implements InterfaceC12244l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C8610l f29035l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C8610l f29036l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C9426l f29034l = new C9426l();

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C10086l f29033l = AbstractC8020l.smaato(null);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C10086l f29032l = AbstractC8020l.smaato(null);

    public C14830l() {
        AbstractC8020l.mopub(new C17482l(this, 2));
        this.f29036l = AbstractC8020l.mopub(new C17482l(this, 0));
        AbstractC8020l.mopub(new C17482l(this, 1));
        this.f29035l = AbstractC8020l.mopub(new C17482l(this, 3));
    }

    public final synchronized void crashlytics(Throwable th) {
        if (((Boolean) this.f29036l.getValue()).booleanValue()) {
            return;
        }
        this.f29032l.setValue(th);
        this.f29034l.m2649l(th);
    }

    @Override // defpackage.InterfaceC12244l
    public final Object getValue() {
        return (C10712l) this.f29033l.getValue();
    }
}
