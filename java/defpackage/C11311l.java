package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: lُٕۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11311l extends AbstractC7877l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final long f22798l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final ArrayList f22799l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final ArrayList f22800l;

    public C11311l(int i, long j) {
        super(i, 3);
        this.f22798l = j;
        this.f22800l = new ArrayList();
        this.f22799l = new ArrayList();
    }

    public final C11311l remoteconfig(int i) {
        ArrayList arrayList = this.f22799l;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C11311l c11311l = (C11311l) arrayList.get(i2);
            if (c11311l.f16423l == i) {
                return c11311l;
            }
        }
        return null;
    }

    @Override // defpackage.AbstractC7877l
    public final String toString() {
        return AbstractC7877l.loadAd(this.f16423l) + " leaves: " + Arrays.toString(this.f22800l.toArray()) + " containers: " + Arrays.toString(this.f22799l.toArray());
    }

    public final C16792l vip(int i) {
        ArrayList arrayList = this.f22800l;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C16792l c16792l = (C16792l) arrayList.get(i2);
            if (c16792l.f16423l == i) {
                return c16792l;
            }
        }
        return null;
    }
}
