package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lٖؔۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16167l implements Iterator, InterfaceC2356l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f31663l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f31664l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f31665l = -1;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f31666l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C8934l f31667l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C6761l f31668l;

    public C16167l(C6761l c6761l) {
        this.f31668l = c6761l;
        int iPurchase = AbstractC8576l.purchase(0, 0, ((CharSequence) c6761l.amazon).length());
        this.f31664l = iPurchase;
        this.f31663l = iPurchase;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f31665l == -1) {
            yandex();
        }
        return this.f31665l == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f31665l == -1) {
            yandex();
        }
        if (this.f31665l == 0) {
            C4875l.firebase();
            return null;
        }
        C8934l c8934l = this.f31667l;
        this.f31667l = null;
        this.f31665l = -1;
        return c8934l;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e  */
    /* JADX WARN: Code duplicated, block: B:12:0x0024 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:18:0x0071  */
    public final void yandex() {
        C8195l c8195l;
        C6761l c6761l = this.f31668l;
        CharSequence charSequence = (CharSequence) c6761l.amazon;
        int i = this.f31663l;
        if (i < 0) {
            this.f31665l = 0;
            this.f31667l = null;
            return;
        }
        int i2 = c6761l.loadAd;
        if (i2 > 0) {
            int i3 = this.f31666l + 1;
            this.f31666l = i3;
            if (i3 >= i2) {
                this.f31667l = new C8934l(this.f31664l, AbstractC12024l.m3350volatile(charSequence), 1);
                this.f31663l = -1;
            } else if (i > charSequence.length() && (c8195l = (C8195l) c6761l.crashlytics.invoke(charSequence, Integer.valueOf(this.f31663l))) != null) {
                int iIntValue = ((Number) c8195l.f17098l).intValue();
                int iIntValue2 = ((Number) c8195l.f17097l).intValue();
                this.f31667l = AbstractC8576l.adcel(this.f31664l, iIntValue);
                int i4 = iIntValue + iIntValue2;
                this.f31664l = i4;
                this.f31663l = i4 + (iIntValue2 == 0 ? 1 : 0);
            } else {
                this.f31667l = new C8934l(this.f31664l, AbstractC12024l.m3350volatile(charSequence), 1);
                this.f31663l = -1;
            }
        } else if (i > charSequence.length()) {
            this.f31667l = new C8934l(this.f31664l, AbstractC12024l.m3350volatile(charSequence), 1);
            this.f31663l = -1;
        } else {
            int iIntValue3 = ((Number) c8195l.f17098l).intValue();
            int iIntValue4 = ((Number) c8195l.f17097l).intValue();
            this.f31667l = AbstractC8576l.adcel(this.f31664l, iIntValue3);
            int i5 = iIntValue3 + iIntValue4;
            this.f31664l = i5;
            this.f31663l = i5 + (iIntValue4 == 0 ? 1 : 0);
        }
        this.f31665l = 1;
    }
}
