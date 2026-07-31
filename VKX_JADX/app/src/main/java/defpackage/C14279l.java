package defpackage;

/* JADX INFO: renamed from: lٜٓۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14279l extends AbstractC3149l implements InterfaceC14404l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C5254l f27962l;

    /* JADX WARN: Illegal instructions before constructor call */
    public C14279l(C5254l c5254l) {
        String str;
        if (c5254l != null) {
            str = "Content type " + c5254l + " is not supported";
        } else {
            str = "Content-Type header is required";
        }
        super(str);
        this.f27962l = c5254l;
    }

    @Override // defpackage.InterfaceC14404l
    public final Throwable yandex() {
        C14279l c14279l = new C14279l(this.f27962l);
        c14279l.initCause(this);
        return c14279l;
    }
}
