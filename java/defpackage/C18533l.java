package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lۘٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18533l extends AbstractC1068l {
    public int amazon;
    public Object[] crashlytics;

    @Override // defpackage.AbstractC1068l
    public final C11421l admob(int i) {
        if (i < this.amazon) {
            return (C11421l) this.crashlytics[i + i];
        }
        throw new IndexOutOfBoundsException();
    }

    public final void firebase(C11421l c11421l, Object obj) {
        int iSmaato;
        if (!c11421l.crashlytics && (iSmaato = smaato(c11421l)) != -1) {
            AbstractC13841l.billing(obj, "metadata value");
            this.crashlytics[iSmaato + iSmaato + 1] = obj;
            return;
        }
        int i = this.amazon + 1;
        Object[] objArr = this.crashlytics;
        int length = objArr.length;
        if (i + i > length) {
            this.crashlytics = Arrays.copyOf(objArr, length + length);
        }
        Object[] objArr2 = this.crashlytics;
        int i2 = this.amazon;
        int i3 = i2 + i2;
        objArr2[i3] = c11421l;
        AbstractC13841l.billing(obj, "metadata value");
        objArr2[i3 + 1] = obj;
        this.amazon++;
    }

    @Override // defpackage.AbstractC1068l
    public final Object isPro(C11421l c11421l) {
        int iSmaato = smaato(c11421l);
        if (iSmaato == -1) {
            return null;
        }
        return c11421l.loadAd.cast(this.crashlytics[iSmaato + iSmaato + 1]);
    }

    @Override // defpackage.AbstractC1068l
    public final int mopub() {
        return this.amazon;
    }

    public final int smaato(C11421l c11421l) {
        for (int i = 0; i < this.amazon; i++) {
            if (this.crashlytics[i + i].equals(c11421l)) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.AbstractC1068l
    public final Object subs(int i) {
        if (i < this.amazon) {
            return this.crashlytics[i + i + 1];
        }
        throw new IndexOutOfBoundsException();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata{");
        for (int i = 0; i < this.amazon; i++) {
            sb.append(" '");
            sb.append(admob(i));
            sb.append("': ");
            sb.append(subs(i));
        }
        sb.append(" }");
        return sb.toString();
    }
}
