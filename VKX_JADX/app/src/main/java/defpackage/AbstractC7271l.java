package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lؚٕٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7271l implements Iterator, InterfaceC2356l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f15113l = true;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f15114l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC15674l[] f15115l;

    public AbstractC7271l(C7250l c7250l, AbstractC15674l[] abstractC15674lArr) {
        this.f15115l = abstractC15674lArr;
        abstractC15674lArr[0].yandex(Integer.bitCount(c7250l.yandex) * 2, 0, c7250l.amazon);
        this.f15114l = 0;
        yandex();
    }

    public final int crashlytics(int i) {
        AbstractC15674l[] abstractC15674lArr = this.f15115l;
        AbstractC15674l abstractC15674l = abstractC15674lArr[i];
        int i2 = abstractC15674l.f30648l;
        if (i2 < abstractC15674l.f30649l) {
            return i;
        }
        Object[] objArr = abstractC15674l.f30650l;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        C7250l c7250l = (C7250l) objArr[i2];
        if (i == 6) {
            AbstractC15674l abstractC15674l2 = abstractC15674lArr[i + 1];
            Object[] objArr2 = c7250l.amazon;
            abstractC15674l2.yandex(objArr2.length, 0, objArr2);
        } else {
            abstractC15674lArr[i + 1].yandex(Integer.bitCount(c7250l.yandex) * 2, 0, c7250l.amazon);
        }
        return crashlytics(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15113l;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f15113l) {
            C4875l.firebase();
            return null;
        }
        Object next = this.f15115l[this.f15114l].next();
        yandex();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void yandex() {
        int i = this.f15114l;
        AbstractC15674l[] abstractC15674lArr = this.f15115l;
        AbstractC15674l abstractC15674l = abstractC15674lArr[i];
        if (abstractC15674l.f30648l < abstractC15674l.f30649l) {
            return;
        }
        while (-1 < i) {
            int iCrashlytics = crashlytics(i);
            if (iCrashlytics == -1) {
                AbstractC15674l abstractC15674l2 = abstractC15674lArr[i];
                int i2 = abstractC15674l2.f30648l;
                Object[] objArr = abstractC15674l2.f30650l;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    abstractC15674l2.f30648l = i2 + 1;
                    iCrashlytics = crashlytics(i);
                }
            }
            if (iCrashlytics != -1) {
                this.f15114l = iCrashlytics;
                return;
            }
            if (i > 0) {
                AbstractC15674l abstractC15674l3 = abstractC15674lArr[i - 1];
                int i3 = abstractC15674l3.f30648l;
                int length2 = abstractC15674l3.f30650l.length;
                abstractC15674l3.f30648l = i3 + 1;
            }
            abstractC15674lArr[i].yandex(0, 0, C7250l.purchase.amazon);
            i--;
        }
        this.f15113l = false;
    }
}
