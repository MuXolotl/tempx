package defpackage;

/* JADX INFO: renamed from: lِٖٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC11882l {
    /* JADX INFO: Fake field, exist only in values array */
    UBYTE(C8565l.adcel("kotlin/UByte", false)),
    /* JADX INFO: Fake field, exist only in values array */
    USHORT(C8565l.adcel("kotlin/UShort", false)),
    /* JADX INFO: Fake field, exist only in values array */
    UINT(C8565l.adcel("kotlin/UInt", false)),
    /* JADX INFO: Fake field, exist only in values array */
    ULONG(C8565l.adcel("kotlin/ULong", false));


    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C3624l f23703l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C3498l f23704l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C3624l f23705l;

    EnumC11882l(C3624l c3624l) {
        this.f23705l = c3624l;
        C3498l c3498lBilling = c3624l.billing();
        this.f23704l = c3498lBilling;
        this.f23703l = new C3624l(c3624l.yandex, C3498l.purchase(c3498lBilling.loadAd() + "Array"));
    }
}
