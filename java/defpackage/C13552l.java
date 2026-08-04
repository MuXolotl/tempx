package defpackage;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: lْٞ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13552l extends AbstractC18650l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f26569l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Object[] f26570l;

    @Override // defpackage.AbstractC18650l
    public final int amazon() {
        return this.f26569l;
    }

    @Override // defpackage.AbstractC18650l
    public final void billing(int i, C7687l c7687l) {
        Object[] objArr = this.f26570l;
        if (objArr.length <= i) {
            int length = objArr.length;
            do {
                length *= 2;
            } while (length <= i);
            this.f26570l = Arrays.copyOf(this.f26570l, length);
        }
        Object[] objArr2 = this.f26570l;
        if (objArr2[i] == null) {
            this.f26569l++;
        }
        objArr2[i] = c7687l;
    }

    @Override // defpackage.AbstractC18650l
    public final Object get(int i) {
        return AbstractC8669l.m2418throw(i, this.f26570l);
    }

    @Override // defpackage.AbstractC18650l, java.lang.Iterable
    public final Iterator iterator() {
        return new C3651l(this);
    }
}
