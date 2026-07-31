package defpackage;

/* JADX INFO: renamed from: lۡؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18627l extends AbstractC14165l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public AbstractC8939l f36397l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final long f36399l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public float f36396l = 1.0f;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final long f36398l = 9205357640488583168L;

    public C18627l(long j) {
        this.f36399l = j;
    }

    @Override // defpackage.AbstractC14165l
    public final boolean amazon(float f) {
        this.f36396l = f;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C18627l) {
            return C9735l.crashlytics(this.f36399l, ((C18627l) obj).f36399l);
        }
        return false;
    }

    public final int hashCode() {
        int i = C9735l.smaato;
        return C10882l.yandex(this.f36399l);
    }

    @Override // defpackage.AbstractC14165l
    public final void isPro(InterfaceC13349l interfaceC13349l) {
        AbstractC9361l.metrica(interfaceC13349l, this.f36399l, 0L, 0L, this.f36396l, null, this.f36397l, 0, 86);
    }

    @Override // defpackage.AbstractC14165l
    public final boolean purchase(AbstractC8939l abstractC8939l) {
        this.f36397l = abstractC8939l;
        return true;
    }

    @Override // defpackage.AbstractC14165l
    public final long subs() {
        return this.f36398l;
    }

    public final String toString() {
        return AbstractC15560l.Signature("ColorPainter(color=", C9735l.subs(this.f36399l), ")");
    }
}
