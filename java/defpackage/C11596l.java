package defpackage;

/* JADX INFO: renamed from: lِْؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11596l implements InterfaceC13342l, AutoCloseable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f23309l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C1453l f23310l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f23311l;

    public C11596l(String str, C1453l c1453l) {
        this.f23311l = str;
        this.f23310l = c1453l;
    }

    @Override // defpackage.InterfaceC13342l
    public final void ads(InterfaceC3177l interfaceC3177l, EnumC14812l enumC14812l) {
        if (enumC14812l == EnumC14812l.ON_DESTROY) {
            this.f23309l = false;
            interfaceC3177l.loadAd().loadAd(this);
        }
    }

    public final void yandex(C18396l c18396l, AbstractC6475l abstractC6475l) {
        if (this.f23309l) {
            C8339l.smaato("Already attached to lifecycleOwner");
            return;
        }
        this.f23309l = true;
        abstractC6475l.yandex(this);
        c18396l.m4528synchronized(this.f23311l, (C8955l) this.f23310l.yandex.f7481l);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
