package defpackage;

/* JADX INFO: renamed from: lًٜٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8128l implements InterfaceC7267l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final long f16931l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f16932l;

    public C8128l(int i, long j) {
        AbstractC12442l.admob(j >= 0);
        this.f16932l = i;
        this.f16931l = j;
    }

    public static C8128l loadAd(InterfaceC10430l interfaceC10430l, C13143l c13143l) {
        interfaceC10430l.yandex(0, 8, c13143l.yandex);
        c13143l.m3562for(0);
        return new C8128l(c13143l.remoteconfig(), c13143l.ads(), false);
    }

    public static C8128l yandex(int i, int i2, String str) {
        if (i >= i2) {
            return null;
        }
        long j = 0;
        int i3 = i;
        while (i3 < i2) {
            char cCharAt = str.charAt(i3);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            j = (j * 10) + ((long) (cCharAt - '0'));
            if (j > 2147483647L) {
                return null;
            }
            i3++;
        }
        if (i3 == i) {
            return null;
        }
        return new C8128l(j, i3);
    }

    @Override // defpackage.InterfaceC7267l
    public C2106l toInstant() {
        C2106l c2106l = C2106l.f4733l;
        long j = C2106l.f4733l.f4736l;
        long j2 = this.f16931l;
        if (j2 >= j && j2 <= C2106l.f4734l.f4736l) {
            return C16367l.license(j2, this.f16932l);
        }
        throw new C14612l("The parsed date is outside the range representable by Instant (Unix epoch second " + j2 + ')');
    }

    public /* synthetic */ C8128l(long j, int i) {
        this.f16931l = j;
        this.f16932l = i;
    }

    public /* synthetic */ C8128l(int i, long j, boolean z) {
        this.f16932l = i;
        this.f16931l = j;
    }
}
