package defpackage;

/* JADX INFO: renamed from: lٍٔۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC15114l implements InterfaceC14742l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f29650l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f29651l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C11442l f29652l;

    public AbstractC15114l(C11442l c11442l, String str) {
        this.f29652l = c11442l;
        this.f29651l = str;
    }

    @Override // defpackage.InterfaceC14742l
    /* JADX INFO: renamed from: goto */
    public final boolean mo825goto() {
        return getLong(0) != 0;
    }

    public final void yandex() {
        if (this.f29650l) {
            AbstractC13628l.smaato(21, "statement is closed");
            throw null;
        }
    }
}
