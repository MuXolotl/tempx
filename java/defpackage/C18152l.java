package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: l٘ۘٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18152l implements Cloneable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public /* synthetic */ int f35537l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public /* synthetic */ Object[] f35538l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public /* synthetic */ int[] f35539l;

    public C18152l(int i) {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.f35539l = new int[i5];
        this.f35538l = new Object[i5];
    }

    public final int amazon(int i) {
        if (i >= this.f35537l || i < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f35539l[i];
    }

    public final Object billing(int i) {
        if (i >= this.f35537l || i < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f35538l[i];
    }

    public final Object crashlytics(int i) {
        Object obj;
        int iLoadAd = AbstractC4918l.loadAd(this.f35537l, i, this.f35539l);
        if (iLoadAd < 0 || (obj = this.f35538l[iLoadAd]) == AbstractC13831l.yandex) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: loadAd, reason: merged with bridge method [inline-methods] */
    public final C18152l clone() {
        C18152l c18152l = (C18152l) super.clone();
        c18152l.f35539l = (int[]) this.f35539l.clone();
        c18152l.f35538l = (Object[]) this.f35538l.clone();
        return c18152l;
    }

    public final void purchase(int i, Object obj) {
        int iLoadAd = AbstractC4918l.loadAd(this.f35537l, i, this.f35539l);
        if (iLoadAd >= 0) {
            this.f35538l[iLoadAd] = obj;
            return;
        }
        int i2 = ~iLoadAd;
        int i3 = this.f35537l;
        if (i2 < i3) {
            Object[] objArr = this.f35538l;
            if (objArr[i2] == AbstractC13831l.yandex) {
                this.f35539l[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.f35539l.length) {
            int i4 = (i3 + 1) * 4;
            for (int i5 = 4; i5 < 32; i5++) {
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
            }
            int i7 = i4 / 4;
            this.f35539l = Arrays.copyOf(this.f35539l, i7);
            this.f35538l = Arrays.copyOf(this.f35538l, i7);
        }
        int i8 = this.f35537l;
        if (i8 - i2 != 0) {
            int[] iArr = this.f35539l;
            int i9 = i2 + 1;
            AbstractC8669l.ad(i9, i2, iArr, iArr, i8);
            Object[] objArr2 = this.f35538l;
            AbstractC8669l.pro(i9, i2, this.f35537l, objArr2, objArr2);
        }
        this.f35539l[i2] = i;
        this.f35538l[i2] = obj;
        this.f35537l++;
    }

    public final String toString() {
        int i = this.f35537l;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.f35537l;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(amazon(i3));
            sb.append('=');
            Object objBilling = billing(i3);
            if (objBilling != this) {
                sb.append(objBilling);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final void yandex(int i, Object obj) {
        int i2 = this.f35537l;
        if (i2 != 0 && i <= this.f35539l[i2 - 1]) {
            purchase(i, obj);
            return;
        }
        if (i2 >= this.f35539l.length) {
            int i3 = (i2 + 1) * 4;
            for (int i4 = 4; i4 < 32; i4++) {
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                }
            }
            int i6 = i3 / 4;
            this.f35539l = Arrays.copyOf(this.f35539l, i6);
            this.f35538l = Arrays.copyOf(this.f35538l, i6);
        }
        this.f35539l[i2] = i;
        this.f35538l[i2] = obj;
        this.f35537l = i2 + 1;
    }
}
