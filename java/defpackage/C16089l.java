package defpackage;

import j$.time.DateTimeException;
import j$.time.LocalTime;

/* JADX INFO: renamed from: lٕۧٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16089l implements InterfaceC12650l, InterfaceC7697l {
    public Integer amazon;
    public Integer billing;
    public final EnumC9527l crashlytics;
    public final Integer loadAd;
    public Integer purchase;
    public Integer yandex;

    public C16089l(Integer num, Integer num2, EnumC9527l enumC9527l, Integer num3, Integer num4, Integer num5) {
        this.yandex = num;
        this.loadAd = num2;
        this.crashlytics = enumC9527l;
        this.amazon = num3;
        this.purchase = num4;
        this.billing = num5;
    }

    @Override // defpackage.InterfaceC12650l
    public final Integer amazon() {
        return this.amazon;
    }

    public final C5864l crashlytics() {
        int iIntValue;
        int iIntValue2;
        Integer num = this.yandex;
        EnumC9527l enumC9527l = this.crashlytics;
        Integer numValueOf = null;
        EnumC9527l enumC9527l2 = EnumC9527l.f19427l;
        Integer num2 = this.loadAd;
        if (num != null) {
            iIntValue = num.intValue();
            if (num2 != null && ((iIntValue + 11) % 12) + 1 != (iIntValue2 = num2.intValue())) {
                C10754l.metrica(AbstractC12589l.premium(iIntValue, iIntValue2, "Inconsistent hour and hour-of-am-pm: hour is ", ", but hour-of-am-pm is "));
                return null;
            }
            if (enumC9527l != null) {
                if ((enumC9527l == enumC9527l2) != (iIntValue >= 12)) {
                    throw new IllegalArgumentException(("Inconsistent hour and the AM/PM marker: hour is " + iIntValue + ", but the AM/PM marker is " + enumC9527l).toString());
                }
            }
        } else {
            if (num2 != null) {
                int iIntValue3 = num2.intValue();
                if (enumC9527l != null) {
                    if (iIntValue3 == 12) {
                        iIntValue3 = 0;
                    }
                    numValueOf = Integer.valueOf(iIntValue3 + (enumC9527l != enumC9527l2 ? 0 : 12));
                }
            }
            if (numValueOf == null) {
                throw new C14612l("Incomplete time: missing hour");
            }
            iIntValue = numValueOf.intValue();
        }
        Integer num3 = this.amazon;
        AbstractC8525l.yandex(num3, "minute");
        int iIntValue4 = num3.intValue();
        Integer num4 = this.purchase;
        int iIntValue5 = num4 != null ? num4.intValue() : 0;
        Integer num5 = this.billing;
        try {
            return new C5864l(LocalTime.of(iIntValue, iIntValue4, iIntValue5, num5 != null ? num5.intValue() : 0));
        } catch (DateTimeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16089l)) {
            return false;
        }
        C16089l c16089l = (C16089l) obj;
        return AbstractC8576l.yandex(this.yandex, c16089l.yandex) && AbstractC8576l.yandex(this.loadAd, c16089l.loadAd) && this.crashlytics == c16089l.crashlytics && AbstractC8576l.yandex(this.amazon, c16089l.amazon) && AbstractC8576l.yandex(this.purchase, c16089l.purchase) && AbstractC8576l.yandex(this.billing, c16089l.billing);
    }

    public final int hashCode() {
        Integer num = this.yandex;
        int iIntValue = (num != null ? num.intValue() : 0) * 31;
        Integer num2 = this.loadAd;
        int iIntValue2 = ((num2 != null ? num2.intValue() : 0) * 31) + iIntValue;
        EnumC9527l enumC9527l = this.crashlytics;
        int iHashCode = ((enumC9527l != null ? enumC9527l.hashCode() : 0) * 31) + iIntValue2;
        Integer num3 = this.amazon;
        int iIntValue3 = ((num3 != null ? num3.intValue() : 0) * 31) + iHashCode;
        Integer num4 = this.purchase;
        int iIntValue4 = ((num4 != null ? num4.intValue() : 0) * 31) + iIntValue3;
        Integer num5 = this.billing;
        return iIntValue4 + (num5 != null ? num5.intValue() : 0);
    }

    @Override // defpackage.InterfaceC12650l
    public final void loadAd(C17707l c17707l) {
        this.billing = c17707l != null ? Integer.valueOf(c17707l.yandex(9)) : null;
    }

    @Override // defpackage.InterfaceC12650l
    public final void metrica(Integer num) {
        this.purchase = num;
    }

    @Override // defpackage.InterfaceC12650l
    public final C17707l mopub() {
        Integer num = this.billing;
        if (num != null) {
            return new C17707l(num.intValue(), 9);
        }
        return null;
    }

    @Override // defpackage.InterfaceC12650l
    public final void purchase(Integer num) {
        this.amazon = num;
    }

    @Override // defpackage.InterfaceC12650l
    public final Integer remoteconfig() {
        return this.yandex;
    }

    @Override // defpackage.InterfaceC12650l
    public final void smaato(Integer num) {
        this.yandex = num;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    public final String toString() {
        String strM3340static;
        StringBuilder sb = new StringBuilder();
        Object obj = this.yandex;
        if (obj == null) {
            obj = "??";
        }
        sb.append(obj);
        sb.append(':');
        Object obj2 = this.amazon;
        if (obj2 == null) {
            obj2 = "??";
        }
        sb.append(obj2);
        sb.append(':');
        Integer num = this.purchase;
        sb.append(num != null ? num : "??");
        sb.append('.');
        Integer num2 = this.billing;
        if (num2 != null) {
            String strValueOf = String.valueOf(num2.intValue());
            strM3340static = AbstractC12024l.m3340static(9 - strValueOf.length(), strValueOf);
            if (strM3340static == null) {
                strM3340static = "???";
            }
        } else {
            strM3340static = "???";
        }
        sb.append(strM3340static);
        return sb.toString();
    }

    @Override // defpackage.InterfaceC12650l
    public final Integer vip() {
        return this.purchase;
    }

    @Override // defpackage.InterfaceC7697l
    public final Object yandex() {
        return new C16089l(this.yandex, this.loadAd, this.crashlytics, this.amazon, this.purchase, this.billing);
    }

    public /* synthetic */ C16089l() {
        this(null, null, null, null, null, null);
    }
}
