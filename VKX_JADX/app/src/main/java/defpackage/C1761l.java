package defpackage;

import j$.time.DateTimeException;
import j$.time.ZoneOffset;

/* JADX INFO: renamed from: lَؓٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1761l extends AbstractC17691l {
    public final C15977l yandex;

    public C1761l(C15977l c15977l) {
        this.yandex = c15977l;
    }

    @Override // defpackage.AbstractC17691l
    public final Object amazon(InterfaceC7697l interfaceC7697l) {
        C11924l c11924l = (C11924l) interfaceC7697l;
        int i = AbstractC8576l.yandex(c11924l.yandex, Boolean.TRUE) ? -1 : 1;
        Integer num = c11924l.loadAd;
        Integer numValueOf = num != null ? Integer.valueOf(num.intValue() * i) : null;
        Integer num2 = c11924l.crashlytics;
        Integer numValueOf2 = num2 != null ? Integer.valueOf(num2.intValue() * i) : null;
        Integer num3 = c11924l.amazon;
        Integer numValueOf3 = num3 != null ? Integer.valueOf(num3.intValue() * i) : null;
        C8688l c8688l = AbstractC9394l.yandex;
        try {
            if (numValueOf != null) {
                return new C3425l(ZoneOffset.ofHoursMinutesSeconds(numValueOf.intValue(), numValueOf2 != null ? numValueOf2.intValue() : 0, numValueOf3 != null ? numValueOf3.intValue() : 0));
            }
            if (numValueOf2 != null) {
                return new C3425l(ZoneOffset.ofHoursMinutesSeconds(numValueOf2.intValue() / 60, numValueOf2.intValue() % 60, numValueOf3 != null ? numValueOf3.intValue() : 0));
            }
            return new C3425l(ZoneOffset.ofTotalSeconds(numValueOf3 != null ? numValueOf3.intValue() : 0));
        } catch (DateTimeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // defpackage.AbstractC17691l
    public final InterfaceC7697l loadAd() {
        return AbstractC11714l.amazon;
    }

    @Override // defpackage.AbstractC17691l
    public final C15977l yandex() {
        return this.yandex;
    }
}
