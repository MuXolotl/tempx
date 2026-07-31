package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lًؙؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6323l extends AbstractC11156l {
    public int firebase;
    public int remoteconfig;
    public int subs;
    public AbstractC1387l[] admob = new AbstractC1387l[16];
    public int[] isPro = new int[16];
    public Object[] smaato = new Object[16];

    public final void admob(InterfaceC3770l interfaceC3770l, C13006l c13006l, C15389l c15389l, InterfaceC3928l interfaceC3928l) {
        if (this.subs != 0) {
            C12676l c12676l = new C12676l(7, this);
            C6323l c6323l = (C6323l) c12676l.purchase;
            while (true) {
                AbstractC1387l abstractC1387l = c6323l.admob[c12676l.loadAd];
                C12317l c12317lBilling = abstractC1387l.billing(c12676l);
                InterfaceC3770l interfaceC3770l2 = interfaceC3770l;
                C13006l c13006l2 = c13006l;
                C15389l c15389l2 = c15389l;
                InterfaceC3928l interfaceC3928l2 = interfaceC3928l;
                try {
                    abstractC1387l.amazon(c12676l, interfaceC3770l2, c13006l2, c15389l2, interfaceC3928l2);
                    int i = c12676l.loadAd;
                    int i2 = c6323l.subs;
                    if (i < i2) {
                        AbstractC1387l abstractC1387l2 = c6323l.admob[i];
                        c12676l.crashlytics += abstractC1387l2.loadAd;
                        c12676l.amazon += abstractC1387l2.crashlytics;
                        int i3 = i + 1;
                        c12676l.loadAd = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        interfaceC3770l = interfaceC3770l2;
                        c13006l = c13006l2;
                        c15389l = c15389l2;
                        interfaceC3928l = interfaceC3928l2;
                    } else {
                        break;
                    }
                } catch (Throwable th) {
                    if (interfaceC3928l2 == null) {
                        throw th;
                    }
                    AbstractC3605l.Signature(th, new Cfinally(c12317lBilling, c13006l2, interfaceC3928l2, 22));
                    throw th;
                }
            }
        }
        mopub();
    }

    public final void isPro(AbstractC1387l abstractC1387l) {
        int i = this.subs;
        AbstractC1387l[] abstractC1387lArr = this.admob;
        if (i == abstractC1387lArr.length) {
            AbstractC1387l[] abstractC1387lArr2 = new AbstractC1387l[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(abstractC1387lArr, 0, abstractC1387lArr2, 0, i);
            this.admob = abstractC1387lArr2;
        }
        int i2 = this.firebase;
        int i3 = abstractC1387l.loadAd;
        int i4 = abstractC1387l.crashlytics;
        int i5 = i2 + i3;
        int[] iArr = this.isPro;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = (length > 1024 ? 1024 : length) + length;
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] iArr2 = new int[i5];
            AbstractC8669l.ad(0, 0, iArr, iArr2, length);
            this.isPro = iArr2;
        }
        int i7 = this.remoteconfig + i4;
        Object[] objArr = this.smaato;
        int length2 = objArr.length;
        if (i7 > length2) {
            int i8 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i8 >= i7) {
                i7 = i8;
            }
            Object[] objArr2 = new Object[i7];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.smaato = objArr2;
        }
        AbstractC1387l[] abstractC1387lArr3 = this.admob;
        int i9 = this.subs;
        this.subs = i9 + 1;
        abstractC1387lArr3[i9] = abstractC1387l;
        this.firebase += abstractC1387l.loadAd;
        this.remoteconfig += i4;
    }

    public final void mopub() {
        this.subs = 0;
        this.firebase = 0;
        Arrays.fill(this.smaato, 0, this.remoteconfig, (Object) null);
        this.remoteconfig = 0;
    }

    public final boolean subs() {
        return this.subs == 0;
    }
}
