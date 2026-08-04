package defpackage;

/* JADX INFO: renamed from: lٕٔ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15219l extends IllegalStateException implements InterfaceC14404l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final long f29814l;

    public C15219l(long j) {
        super(AbstractC2812l.ads(j, "Body.size is too long. Expected "));
        this.f29814l = j;
    }

    @Override // defpackage.InterfaceC14404l
    public final Throwable yandex() {
        C15219l c15219l = new C15219l(this.f29814l);
        c15219l.initCause(this);
        return c15219l;
    }
}
