package defpackage;

import j$.time.DateTimeException;
import j$.time.LocalDate;

/* JADX INFO: renamed from: lَؒؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0852l implements InterfaceC11068l, InterfaceC4497l, InterfaceC7697l {
    public final Integer amazon;
    public final Integer crashlytics;
    public Integer loadAd;
    public final C1822l yandex;

    public C0852l(C1822l c1822l, Integer num, Integer num2, Integer num3) {
        this.yandex = c1822l;
        this.loadAd = num;
        this.crashlytics = num2;
        this.amazon = num3;
    }

    @Override // defpackage.InterfaceC4497l
    public final Integer admob() {
        return this.loadAd;
    }

    @Override // defpackage.InterfaceC11068l
    public final Integer billing() {
        return this.yandex.yandex;
    }

    @Override // defpackage.InterfaceC11068l
    public final void crashlytics(Integer num) {
        this.yandex.loadAd = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0852l)) {
            return false;
        }
        C0852l c0852l = (C0852l) obj;
        return AbstractC8576l.yandex(this.yandex, c0852l.yandex) && AbstractC8576l.yandex(this.loadAd, c0852l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c0852l.crashlytics) && AbstractC8576l.yandex(this.amazon, c0852l.amazon);
    }

    @Override // defpackage.InterfaceC11068l
    public final Integer firebase() {
        return this.yandex.loadAd;
    }

    public final int hashCode() {
        int iHashCode = this.yandex.hashCode() * 29791;
        Integer num = this.loadAd;
        int iHashCode2 = ((num != null ? num.hashCode() : 0) * 961) + iHashCode;
        Integer num2 = this.crashlytics;
        int iHashCode3 = ((num2 != null ? num2.hashCode() : 0) * 31) + iHashCode2;
        Integer num3 = this.amazon;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // defpackage.InterfaceC11068l
    public final void isPro(Integer num) {
        this.yandex.yandex = num;
    }

    public final C0378l loadAd() throws Exception {
        int i;
        C0378l c0378l;
        C1822l c1822l = this.yandex;
        Integer num = c1822l.yandex;
        AbstractC8525l.yandex(num, "year");
        int iIntValue = num.intValue();
        Integer num2 = this.amazon;
        if (num2 == null) {
            Integer num3 = c1822l.loadAd;
            AbstractC8525l.yandex(num3, "monthNumber");
            int iIntValue2 = num3.intValue();
            Integer num4 = this.loadAd;
            AbstractC8525l.yandex(num4, "day");
            c0378l = new C0378l(iIntValue, iIntValue2, num4.intValue());
            i = 1;
        } else {
            C0378l c0378l2 = new C0378l(iIntValue, 1, 1);
            int iIntValue3 = num2.intValue() - 1;
            AbstractC5303l.Companion.getClass();
            C0066l c0066l = AbstractC5303l.loadAd;
            long j = iIntValue3;
            int i2 = AbstractC11298l.crashlytics;
            LocalDate localDate = c0378l2.f1462l;
            try {
                long jAmazon = AbstractC6873l.amazon(j, c0066l.crashlytics);
                long epochDay = localDate.toEpochDay();
                i = 1;
                long j2 = epochDay + jAmazon;
                if (!((jAmazon ^ epochDay) < 0) && !((epochDay ^ j2) >= 0)) {
                    throw new ArithmeticException();
                }
                long j3 = AbstractC11298l.yandex;
                if (j2 > AbstractC11298l.loadAd || j3 > j2) {
                    throw new DateTimeException("The resulting day " + j2 + " is out of supported LocalDate range.");
                }
                LocalDate localDateOfEpochDay = LocalDate.ofEpochDay(j2);
                C0378l c0378l3 = new C0378l(localDateOfEpochDay);
                if (localDateOfEpochDay.getYear() != iIntValue) {
                    throw new C14612l("Can not create a LocalDate from the given input: the day of year is " + num2 + ", which is not a valid day of year for the year " + iIntValue);
                }
                Integer num5 = c1822l.loadAd;
                C14092l c14092l = EnumC5657l.f12011l;
                if (num5 != null) {
                    int iOrdinal = ((EnumC5657l) c14092l.get(localDateOfEpochDay.getMonth().getValue() - 1)).ordinal() + 1;
                    Integer num6 = c1822l.loadAd;
                    if (num6 == null || iOrdinal != num6.intValue()) {
                        StringBuilder sb = new StringBuilder("Can not create a LocalDate from the given input: the day of year is ");
                        sb.append(num2);
                        sb.append(", which is ");
                        sb.append((EnumC5657l) c14092l.get(localDateOfEpochDay.getMonth().getValue() - 1));
                        Integer num7 = c1822l.loadAd;
                        sb.append(", but ");
                        sb.append(num7);
                        sb.append(" was specified as the month number");
                        throw new C14612l(sb.toString());
                    }
                }
                if (this.loadAd != null) {
                    int dayOfMonth = localDateOfEpochDay.getDayOfMonth();
                    Integer num8 = this.loadAd;
                    if (num8 == null || dayOfMonth != num8.intValue()) {
                        StringBuilder sb2 = new StringBuilder("Can not create a LocalDate from the given input: the day of year is ");
                        sb2.append(num2);
                        sb2.append(", which is the day ");
                        sb2.append(localDateOfEpochDay.getDayOfMonth());
                        sb2.append(" of ");
                        sb2.append((EnumC5657l) c14092l.get(localDateOfEpochDay.getMonth().getValue() - 1));
                        Integer num9 = this.loadAd;
                        sb2.append(", but ");
                        sb2.append(num9);
                        sb2.append(" was specified as the day of month");
                        throw new C14612l(sb2.toString());
                    }
                }
                c0378l = c0378l3;
            } catch (Exception e) {
                if (!(e instanceof DateTimeException) && !(e instanceof ArithmeticException)) {
                    throw e;
                }
                throw new C6451l(1, "The result of adding " + j + " of " + c0066l + " to " + c0378l2 + " is out of LocalDate range.", e);
            }
        }
        Integer num10 = this.crashlytics;
        if (num10 != null) {
            int iIntValue4 = num10.intValue();
            LocalDate localDate2 = c0378l.f1462l;
            int value = localDate2.getDayOfWeek().getValue() - i;
            C14092l c14092l2 = EnumC6623l.f13862l;
            if (iIntValue4 != ((EnumC6623l) c14092l2.get(value)).ordinal() + i) {
                StringBuilder sb3 = new StringBuilder("Can not create a LocalDate from the given input: the day of week is ");
                if (i > iIntValue4 || iIntValue4 >= 8) {
                    C10754l.metrica(AbstractC0653l.vip(iIntValue4, "Expected ISO day-of-week number in 1..7, got "));
                    return null;
                }
                sb3.append((EnumC6623l) c14092l2.get(iIntValue4 - i));
                sb3.append(" but the date is ");
                sb3.append(c0378l);
                sb3.append(", which is a ");
                sb3.append((EnumC6623l) c14092l2.get(localDate2.getDayOfWeek().getValue() - i));
                throw new C14612l(sb3.toString());
            }
        }
        return c0378l;
    }

    @Override // defpackage.InterfaceC4497l
    public final void subs(Integer num) {
        this.loadAd = num;
    }

    public final String toString() {
        Object obj = this.crashlytics;
        C1822l c1822l = this.yandex;
        Integer num = this.amazon;
        if (num == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(c1822l);
            sb.append('-');
            Object obj2 = this.loadAd;
            if (obj2 == null) {
                obj2 = "??";
            }
            sb.append(obj2);
            sb.append(" (day of week is ");
            if (obj == null) {
                obj = "??";
            }
            sb.append(obj);
            sb.append(')');
            return sb.toString();
        }
        if (this.loadAd == null && c1822l.loadAd == null) {
            StringBuilder sb2 = new StringBuilder("(");
            Object obj3 = c1822l.yandex;
            if (obj3 == null) {
                obj3 = "??";
            }
            sb2.append(obj3);
            sb2.append(")-");
            sb2.append(num);
            sb2.append(" (day of week is ");
            if (obj == null) {
                obj = "??";
            }
            sb2.append(obj);
            sb2.append(')');
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(c1822l);
        sb3.append('-');
        Object obj4 = this.loadAd;
        if (obj4 == null) {
            obj4 = "??";
        }
        sb3.append(obj4);
        sb3.append(" (day of week is ");
        if (obj == null) {
            obj = "??";
        }
        sb3.append(obj);
        sb3.append(", day of year is ");
        sb3.append(num);
        sb3.append(')');
        return sb3.toString();
    }

    @Override // defpackage.InterfaceC7697l
    public final Object yandex() {
        C1822l c1822l = this.yandex;
        return new C0852l(new C1822l(c1822l.yandex, c1822l.loadAd), this.loadAd, this.crashlytics, this.amazon);
    }

    public /* synthetic */ C0852l() {
        this(new C1822l(null, null), null, null, null);
    }
}
