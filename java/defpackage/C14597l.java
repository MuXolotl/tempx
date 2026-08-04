package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lٔؐ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14597l {
    public final /* synthetic */ C12660l admob;
    public int amazon;
    public int billing;
    public int crashlytics;
    public C15519l loadAd;
    public int mopub;
    public C7136l[] yandex = AbstractC7439l.yandex;
    public int purchase = 1;

    public C14597l(C12660l c12660l) {
        this.admob = c12660l;
    }

    public static void loadAd(C14597l c14597l, InterfaceC9146l interfaceC9146l, InterfaceC2262l interfaceC2262l, InterfaceC3685l interfaceC3685l, int i, int i2, boolean z) {
        c14597l.admob.getClass();
        long jSmaato = interfaceC9146l.smaato(0);
        c14597l.yandex(interfaceC9146l, interfaceC2262l, interfaceC3685l, i, i2, (int) (!z ? jSmaato & 4294967295L : jSmaato >> 32));
    }

    public final void yandex(InterfaceC9146l interfaceC9146l, InterfaceC2262l interfaceC2262l, InterfaceC3685l interfaceC3685l, int i, int i2, int i3) {
        C7136l[] c7136lArr;
        C7136l[] c7136lArr2 = this.yandex;
        int length = c7136lArr2.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                this.billing = i;
                this.mopub = i2;
                break;
            } else {
                C7136l c7136l = c7136lArr2[i4];
                if (c7136l != null && c7136l.mopub) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        int size = interfaceC9146l.isPro().size();
        int length2 = this.yandex.length;
        while (true) {
            c7136lArr = this.yandex;
            if (size >= length2) {
                break;
            }
            C7136l c7136l2 = c7136lArr[size];
            if (c7136l2 != null) {
                c7136l2.amazon();
            }
            size++;
        }
        if (c7136lArr.length != interfaceC9146l.isPro().size()) {
            this.yandex = (C7136l[]) Arrays.copyOf(this.yandex, interfaceC9146l.isPro().size());
        }
        this.loadAd = new C15519l(interfaceC9146l.subs());
        this.crashlytics = i3;
        this.amazon = interfaceC9146l.remoteconfig();
        this.purchase = interfaceC9146l.mopub();
        int size2 = interfaceC9146l.isPro().size();
        for (int i5 = 0; i5 < size2; i5++) {
            Object objSignature = ((AbstractC10113l) interfaceC9146l.isPro().get(i5)).Signature();
            C6223l c6223l = objSignature instanceof C6223l ? (C6223l) objSignature : null;
            C7136l[] c7136lArr3 = this.yandex;
            if (c6223l == null) {
                C7136l c7136l3 = c7136lArr3[i5];
                if (c7136l3 != null) {
                    c7136l3.amazon();
                }
                this.yandex[i5] = null;
            } else {
                C7136l c7136l4 = c7136lArr3[i5];
                if (c7136l4 == null) {
                    c7136l4 = new C7136l(interfaceC2262l, interfaceC3685l, new C7730l(16, this.admob));
                    this.yandex[i5] = c7136l4;
                }
                c7136l4.amazon = c6223l.f13154l;
                c7136l4.purchase = c6223l.f13152l;
                c7136l4.billing = c6223l.f13153l;
            }
        }
    }
}
