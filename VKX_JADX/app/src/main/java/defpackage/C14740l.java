package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lُؚٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14740l {
    public C4540l amazon = (C4540l) AbstractC11066l.loadAd.mo2252strictfp();
    public int crashlytics;
    public int loadAd;
    public final C16231l yandex;

    public C14740l(C16231l c16231l) {
        this.yandex = c16231l;
    }

    public final void amazon(int i, int i2, int i3, int i4) {
        int i5;
        int i6 = this.loadAd;
        double d = i6;
        int i7 = this.crashlytics;
        if (d >= ((double) i7) * 0.75d) {
            C4540l c4540l = this.amazon;
            this.loadAd = 0;
            this.crashlytics = (i7 * 2) | 128;
            C4540l c4540l2 = (C4540l) AbstractC11066l.loadAd.mo2252strictfp();
            int size = (c4540l.yandex.size() * 2) | 1;
            for (int i8 = 0; i8 < size; i8++) {
                c4540l2.yandex.add(AbstractC11066l.yandex.mo2252strictfp());
            }
            c4540l2.getClass();
            this.amazon = c4540l2;
            C11129l c11129lPurchase = AbstractC6900l.purchase((Function2) c4540l.loadAd().loadAd);
            while (c11129lPurchase.hasNext()) {
                int iIntValue = ((Number) c11129lPurchase.next()).intValue();
                amazon(c4540l.yandex(iIntValue + 1), c4540l.yandex(iIntValue + 2), c4540l.yandex(iIntValue + 3), c4540l.yandex(iIntValue + 4));
            }
            AbstractC11066l.loadAd.mo2251l(c4540l);
            if (i6 != this.loadAd) {
                C8339l.metrica("Failed requirement.");
                return;
            }
        }
        C16231l c16231l = this.yandex;
        int iAbs = Math.abs(AbstractC15176l.loadAd(i, i2, c16231l));
        CharSequence charSequenceSubSequence = c16231l.subSequence(i, i2);
        int i9 = iAbs % this.crashlytics;
        int i10 = -1;
        while (true) {
            i5 = i9 * 6;
            if (this.amazon.yandex(i5) == -1) {
                break;
            }
            if (loadAd(charSequenceSubSequence, i5)) {
                i10 = i9;
            }
            i9 = (i9 + 1) % this.crashlytics;
        }
        this.amazon.crashlytics(i5, iAbs);
        this.amazon.crashlytics(i5 + 1, i);
        this.amazon.crashlytics(i5 + 2, i2);
        this.amazon.crashlytics(i5 + 3, i3);
        this.amazon.crashlytics(i5 + 4, i4);
        this.amazon.crashlytics(i5 + 5, -1);
        if (i10 != -1) {
            this.amazon.crashlytics((i10 * 6) + 5, i9);
        }
        this.loadAd++;
    }

    public final C13545l billing(int i) {
        return (C13545l) this.yandex.subSequence(this.amazon.yandex(i + 3), this.amazon.yandex(i + 4));
    }

    public final C13545l crashlytics(int i) {
        return (C13545l) this.yandex.subSequence(this.amazon.yandex(i + 1), this.amazon.yandex(i + 2));
    }

    public final boolean loadAd(CharSequence charSequence, int i) {
        return AbstractC15176l.yandex(this.yandex, this.amazon.yandex(i + 1), this.amazon.yandex(i + 2), charSequence);
    }

    public final void purchase() {
        this.loadAd = 0;
        this.crashlytics = 0;
        C17520l c17520l = AbstractC11066l.loadAd;
        c17520l.mo2251l(this.amazon);
        this.amazon = (C4540l) c17520l.mo2252strictfp();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C17520l c17520l = AbstractC11066l.yandex;
        C11129l c11129lPurchase = AbstractC6900l.purchase((Function2) this.amazon.loadAd().loadAd);
        while (c11129lPurchase.hasNext()) {
            int iIntValue = ((Number) c11129lPurchase.next()).intValue();
            sb.append((CharSequence) "");
            sb.append((CharSequence) crashlytics(iIntValue));
            sb.append((CharSequence) " => ");
            sb.append((CharSequence) billing(iIntValue));
            sb.append((CharSequence) "\n");
        }
        return sb.toString();
    }

    public final C13545l yandex(String str) {
        if (this.loadAd == 0) {
            return null;
        }
        C10685l c10685l = AbstractC15176l.yandex;
        int iAbs = Math.abs(AbstractC15176l.loadAd(0, str.length(), str));
        int i = this.crashlytics;
        while (true) {
            int i2 = iAbs % i;
            int i3 = i2 * 6;
            if (this.amazon.yandex(i3) == -1) {
                return null;
            }
            if (loadAd(str, i3)) {
                return billing(i3);
            }
            iAbs = i2 + 1;
            i = this.crashlytics;
        }
    }
}
