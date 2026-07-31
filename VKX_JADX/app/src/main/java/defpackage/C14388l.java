package defpackage;

/* JADX INFO: renamed from: lٓۙۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14388l extends AbstractC3476l {
    public final int amazon;
    public final int crashlytics;
    public final C1243l purchase;

    public C14388l(int i, int i2, C1243l c1243l, String str) {
        super(i == i2 ? Integer.valueOf(i) : null, str);
        this.crashlytics = i;
        this.amazon = i2;
        this.purchase = c1243l;
        if (1 > i || i >= 10) {
            throw new IllegalArgumentException(("Invalid minimum length " + i + " for field " + str + ": expected 1..9").toString());
        }
        if (i > i2 || i2 >= 10) {
            StringBuilder sb = new StringBuilder("Invalid maximum length ");
            sb.append(i2);
            sb.append(" for field ");
            sb.append(str);
            sb.append(": expected ");
            C10754l.metrica(AbstractC14814l.remoteconfig(i, "..9", sb));
            throw null;
        }
    }

    @Override // defpackage.AbstractC3476l
    public final InterfaceC5066l yandex(int i, int i2, Object obj, String str) {
        int i3 = i2 - i;
        int iCharAt = 0;
        int i4 = this.crashlytics;
        if (i3 < i4) {
            return new C14513l(i4, 12, (byte) 0);
        }
        int i5 = this.amazon;
        if (i3 > i5) {
            return new C14513l(i5, 13, (byte) 0);
        }
        while (i < i2) {
            iCharAt = (iCharAt * 10) + (str.charAt(i) - '0');
            i++;
        }
        Object objYandex = this.purchase.yandex(obj, new C17707l(iCharAt, i3));
        if (objYandex == null) {
            return null;
        }
        return new C13577l(objYandex);
    }
}
