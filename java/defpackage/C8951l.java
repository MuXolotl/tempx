package defpackage;

import j$.time.DateTimeException;
import j$.time.YearMonth;

/* JADX INFO: renamed from: lٌٞۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8951l extends AbstractC17691l {
    public final C15977l yandex;

    public C8951l(C15977l c15977l) {
        this.yandex = c15977l;
    }

    @Override // defpackage.AbstractC17691l
    public final Object amazon(InterfaceC7697l interfaceC7697l) {
        C1822l c1822l = (C1822l) interfaceC7697l;
        Integer num = c1822l.yandex;
        AbstractC8525l.yandex(num, "year");
        int iIntValue = num.intValue();
        Integer num2 = c1822l.loadAd;
        AbstractC8525l.yandex(num2, "monthNumber");
        try {
            return new C10480l(YearMonth.of(iIntValue, num2.intValue()));
        } catch (DateTimeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // defpackage.AbstractC17691l
    public final InterfaceC7697l loadAd() {
        return AbstractC8525l.yandex;
    }

    @Override // defpackage.AbstractC17691l
    public final C15977l yandex() {
        return this.yandex;
    }
}
