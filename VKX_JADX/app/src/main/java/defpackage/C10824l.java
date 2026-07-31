package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: renamed from: lُؕؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10824l {
    public final boolean admob;
    public final Object amazon;
    public final C0086l billing;
    public final long crashlytics;
    public int firebase;
    public final int[] isPro;
    public final List loadAd;
    public final EnumC9931l mopub;
    public final InterfaceC6947l purchase;
    public int smaato;
    public final int subs;
    public final int yandex;

    public C10824l(int i, int i2, List list, long j, Object obj, EnumC7283l enumC7283l, InterfaceC6947l interfaceC6947l, C0086l c0086l, EnumC9931l enumC9931l) {
        this.yandex = i;
        this.loadAd = list;
        this.crashlytics = j;
        this.amazon = obj;
        this.purchase = interfaceC6947l;
        this.billing = c0086l;
        this.mopub = enumC9931l;
        this.admob = enumC7283l == EnumC7283l.f15126l;
        int size = list.size();
        int iMax = 0;
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC10113l abstractC10113l = (AbstractC10113l) list.get(i3);
            iMax = Math.max(iMax, !this.admob ? abstractC10113l.f20591l : abstractC10113l.f20592l);
        }
        this.subs = iMax;
        this.isPro = new int[this.loadAd.size() * 2];
        this.smaato = RecyclerView.UNDEFINED_DURATION;
    }

    public final void loadAd(int i, int i2, int i3) {
        int i4;
        this.firebase = i;
        boolean z = this.admob;
        this.smaato = z ? i3 : i2;
        List list = this.loadAd;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            AbstractC10113l abstractC10113l = (AbstractC10113l) list.get(i5);
            int i6 = i5 * 2;
            int[] iArr = this.isPro;
            if (z) {
                InterfaceC6947l interfaceC6947l = this.purchase;
                if (interfaceC6947l == null) {
                    throw AbstractC1757l.m1043volatile("null horizontalAlignment");
                }
                iArr[i6] = interfaceC6947l.yandex(abstractC10113l.f20592l, i2, this.mopub);
                iArr[i6 + 1] = i;
                i4 = abstractC10113l.f20591l;
            } else {
                iArr[i6] = i;
                int i7 = i6 + 1;
                C0086l c0086l = this.billing;
                if (c0086l == null) {
                    throw AbstractC1757l.m1043volatile("null verticalAlignment");
                }
                iArr[i7] = c0086l.yandex(abstractC10113l.f20591l, i3);
                i4 = abstractC10113l.f20592l;
            }
            i += i4;
        }
    }

    public final void yandex(int i) {
        this.firebase += i;
        int[] iArr = this.isPro;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            boolean z = this.admob;
            if ((z && i2 % 2 == 1) || (!z && i2 % 2 == 0)) {
                iArr[i2] = iArr[i2] + i;
            }
        }
    }
}
