package defpackage;

/* JADX INFO: renamed from: lؘؘۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6040l extends AbstractC3476l {
    public final Integer amazon;
    public final boolean billing;
    public final Integer crashlytics;
    public final C1243l purchase;

    /* JADX WARN: Illegal instructions before constructor call */
    public C6040l(Integer num, Integer num2, C1243l c1243l, String str, boolean z) {
        Integer num3 = num.equals(num2) ? num : null;
        super(num3, str);
        this.crashlytics = num;
        this.amazon = num2;
        this.purchase = c1243l;
        this.billing = z;
        if (num3 == null || new C8934l(1, 9, 1).amazon(num3.intValue())) {
            return;
        }
        C18073l.tapsense("Invalid length for field ", str, ": ", num3);
        throw null;
    }

    @Override // defpackage.AbstractC3476l
    public final InterfaceC5066l yandex(int i, int i2, Object obj, String str) {
        Integer numValueOf;
        int iCharAt = 0;
        Integer num = this.amazon;
        if (num != null && i2 - i > num.intValue()) {
            return new C14513l(num.intValue(), 13, (byte) 0);
        }
        Integer num2 = this.crashlytics;
        if (num2 != null && i2 - i < num2.intValue()) {
            return new C14513l(num2.intValue(), 12, (byte) 0);
        }
        while (true) {
            if (i >= i2) {
                numValueOf = Integer.valueOf(iCharAt);
                break;
            }
            iCharAt = (iCharAt * 10) + (str.charAt(i) - '0');
            if (iCharAt < 0) {
                numValueOf = null;
                break;
            }
            i++;
        }
        if (numValueOf == null) {
            return C13863l.f27117l;
        }
        boolean z = this.billing;
        int iIntValue = numValueOf.intValue();
        if (z) {
            iIntValue = -iIntValue;
        }
        Object objYandex = this.purchase.yandex(obj, Integer.valueOf(iIntValue));
        if (objYandex == null) {
            return null;
        }
        return new C13577l(objYandex);
    }
}
