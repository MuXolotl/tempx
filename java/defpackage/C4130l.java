package defpackage;

/* JADX INFO: renamed from: lٕؖؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4130l extends AbstractC1387l {
    public final InterfaceC1421l[] amazon;

    /* JADX WARN: Illegal instructions before constructor call */
    public C4130l(int i, InterfaceC1421l[] interfaceC1421lArr) {
        if (interfaceC1421lArr == null) {
            C8339l.metrica("Argument for @NotNull parameter 'enumEntries' of kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField.bitWidth must not be null");
            throw null;
        }
        int i2 = 1;
        int length = interfaceC1421lArr.length - 1;
        if (length != 0) {
            for (int i3 = 31; i3 >= 0; i3--) {
                if (((1 << i3) & length) != 0) {
                    i2 = 1 + i3;
                }
            }
            C1759l.isPro(interfaceC1421lArr.getClass(), "Empty enum: ");
            throw null;
        }
        super(i, i2, 0, (byte) 0);
        this.amazon = interfaceC1421lArr;
    }

    @Override // defpackage.AbstractC1387l
    public final Object purchase(int i) {
        int i2 = (1 << this.crashlytics) - 1;
        int i3 = this.loadAd;
        int i4 = (i & (i2 << i3)) >> i3;
        for (InterfaceC1421l interfaceC1421l : this.amazon) {
            if (interfaceC1421l.yandex() == i4) {
                return interfaceC1421l;
            }
        }
        return null;
    }
}
