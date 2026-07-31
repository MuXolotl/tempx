package defpackage;

/* JADX INFO: renamed from: lِٗؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11889l extends AbstractC6280l {
    public final /* synthetic */ int loadAd = 0;

    public C11889l(byte b) {
        super(Byte.valueOf(b));
    }

    @Override // defpackage.AbstractC0757l
    public final String toString() {
        int i = this.loadAd;
        Object obj = this.yandex;
        switch (i) {
            case 0:
                return ((Number) obj).intValue() + ".toUByte()";
            case 1:
                return ((Number) obj).intValue() + ".toUInt()";
            case 2:
                return ((Number) obj).longValue() + ".toULong()";
            default:
                return ((Number) obj).intValue() + ".toUShort()";
        }
    }

    @Override // defpackage.AbstractC0757l
    public final AbstractC18041l yandex(InterfaceC11865l interfaceC11865l) {
        AbstractC15211l abstractC15211lAd;
        AbstractC15211l abstractC15211lAd2;
        AbstractC15211l abstractC15211lAd3;
        AbstractC15211l abstractC15211lAd4;
        int i = this.loadAd;
        EnumC5123l enumC5123l = EnumC5123l.f11142l;
        switch (i) {
            case 0:
                InterfaceC17477l interfaceC17477lAmazon = AbstractC9033l.amazon(interfaceC11865l, AbstractC3333l.f7104switch);
                return (interfaceC17477lAmazon == null || (abstractC15211lAd = interfaceC17477lAmazon.ad()) == null) ? C8741l.loadAd(enumC5123l, "UByte") : abstractC15211lAd;
            case 1:
                InterfaceC17477l interfaceC17477lAmazon2 = AbstractC9033l.amazon(interfaceC11865l, AbstractC3333l.f7084class);
                return (interfaceC17477lAmazon2 == null || (abstractC15211lAd2 = interfaceC17477lAmazon2.ad()) == null) ? C8741l.loadAd(enumC5123l, "UInt") : abstractC15211lAd2;
            case 2:
                InterfaceC17477l interfaceC17477lAmazon3 = AbstractC9033l.amazon(interfaceC11865l, AbstractC3333l.f7095interface);
                return (interfaceC17477lAmazon3 == null || (abstractC15211lAd3 = interfaceC17477lAmazon3.ad()) == null) ? C8741l.loadAd(enumC5123l, "ULong") : abstractC15211lAd3;
            default:
                InterfaceC17477l interfaceC17477lAmazon4 = AbstractC9033l.amazon(interfaceC11865l, AbstractC3333l.f7085continue);
                return (interfaceC17477lAmazon4 == null || (abstractC15211lAd4 = interfaceC17477lAmazon4.ad()) == null) ? C8741l.loadAd(enumC5123l, "UShort") : abstractC15211lAd4;
        }
    }

    public C11889l(short s) {
        super(Short.valueOf(s));
    }

    public C11889l(int i) {
        super(Integer.valueOf(i));
    }

    public C11889l(long j) {
        super(Long.valueOf(j));
    }
}
