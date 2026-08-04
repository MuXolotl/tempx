package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lُٖۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16328l {
    public final C8610l amazon;
    public final InterfaceC1832l crashlytics;
    public InterfaceC13142l loadAd;
    public final C10086l purchase;
    public final C10178l yandex;

    public C16328l(C10178l c10178l, InterfaceC13142l interfaceC13142l, InterfaceC1832l interfaceC1832l) {
        this.yandex = c10178l;
        this.loadAd = interfaceC13142l;
        this.crashlytics = interfaceC1832l;
        this.amazon = interfaceC1832l != null ? AbstractC8020l.mopub(new C5514l(this, interfaceC1832l, 6)) : null;
        this.purchase = AbstractC8020l.smaato(new C6644l(1, 1));
    }

    public static void admob(C16328l c16328l, CharSequence charSequence, boolean z, int i) {
        boolean z2 = (i & 2) == 0;
        int i2 = (i & 4) != 0 ? 1 : 3;
        if ((i & 8) != 0) {
            z = true;
        }
        C10178l c10178l = c16328l.yandex;
        InterfaceC13142l interfaceC13142l = c16328l.loadAd;
        c10178l.loadAd.yandex().premium();
        C2566l c2566l = c10178l.loadAd;
        if (z2) {
            c2566l.billing(null);
        }
        long j = c2566l.f5585l;
        c2566l.crashlytics(C12814l.mopub(j), C12814l.billing(j), charSequence);
        int length = charSequence.length() + C12814l.mopub(j);
        AbstractC16357l.purchase(c2566l, length, length);
        c16328l.smaato(c2566l);
        C10178l.yandex(c10178l, interfaceC13142l, z, i2);
        c10178l.amazon(true);
    }

    public static void subs(C16328l c16328l, String str, long j, boolean z, int i) {
        if ((i & 8) != 0) {
            z = true;
        }
        C10178l c10178l = c16328l.yandex;
        InterfaceC13142l interfaceC13142l = c16328l.loadAd;
        c10178l.loadAd.yandex().premium();
        C2566l c2566l = c10178l.loadAd;
        long jPurchase = c16328l.purchase(j);
        c2566l.crashlytics(C12814l.mopub(jPurchase), C12814l.billing(jPurchase), str);
        int length = str.length() + C12814l.mopub(jPurchase);
        AbstractC16357l.purchase(c2566l, length, length);
        c16328l.smaato(c2566l);
        C10178l.yandex(c10178l, interfaceC13142l, z, 1);
        c10178l.amazon(true);
    }

    public final C5667l amazon() {
        C0209l c0209l;
        C8610l c8610l = this.amazon;
        return (c8610l == null || (c0209l = (C0209l) c8610l.getValue()) == null) ? this.yandex.loadAd() : c0209l.yandex;
    }

    public final long billing(long j) {
        C0209l c0209l;
        C8610l c8610l = this.amazon;
        C16535l c16535l = (c8610l == null || (c0209l = (C0209l) c8610l.getValue()) == null) ? null : c0209l.loadAd;
        return c16535l != null ? C2183l.purchase(j, c16535l, (C6644l) this.purchase.getValue()) : j;
    }

    public final void crashlytics() {
        InterfaceC13142l interfaceC13142l = this.loadAd;
        C10178l c10178l = this.yandex;
        c10178l.loadAd.yandex().premium();
        C2566l c2566l = c10178l.loadAd;
        c2566l.amazon(C12814l.mopub(c2566l.f5585l), C12814l.billing(c2566l.f5585l), "", 0, 0);
        int iMopub = C12814l.mopub(c2566l.f5585l);
        AbstractC16357l.purchase(c2566l, iMopub, iMopub);
        smaato(c2566l);
        C10178l.yandex(c10178l, interfaceC13142l, true, 3);
        c10178l.amazon(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16328l)) {
            return false;
        }
        C16328l c16328l = (C16328l) obj;
        return AbstractC8576l.yandex(this.yandex, c16328l.yandex) && AbstractC8576l.yandex(this.crashlytics, c16328l.crashlytics);
    }

    public final void firebase(long j) {
        InterfaceC13142l interfaceC13142l = this.loadAd;
        C10178l c10178l = this.yandex;
        c10178l.loadAd.yandex().premium();
        C2566l c2566l = c10178l.loadAd;
        int i = C12814l.crashlytics;
        AbstractC16357l.purchase(c2566l, (int) (j >> 32), (int) (j & 4294967295L));
        C10178l.yandex(c10178l, interfaceC13142l, true, 1);
        c10178l.amazon(true);
    }

    public final int hashCode() {
        int iHashCode = this.yandex.hashCode() * 31;
        InterfaceC1832l interfaceC1832l = this.crashlytics;
        return (iHashCode + (interfaceC1832l != null ? interfaceC1832l.hashCode() : 0)) * 31;
    }

    public final void isPro(long j) {
        firebase(purchase(j));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void loadAd(C2589l c2589l, AbstractC0283l abstractC0283l) {
        C7010l c7010l;
        if (abstractC0283l instanceof C7010l) {
            c7010l = (C7010l) abstractC0283l;
            int i = c7010l.f14706l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c7010l.f14706l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c7010l = new C7010l(this, abstractC0283l);
            }
        } else {
            c7010l = new C7010l(this, abstractC0283l);
        }
        Object obj = c7010l.f14705l;
        int i2 = c7010l.f14706l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            c7010l.f14706l = 1;
            C2397l c2397l = new C2397l(1, AbstractC17082l.billing(c7010l));
            c2397l.license();
            this.yandex.billing.crashlytics(c2589l);
            c2397l.ad(new C3768l(this, c2589l, 28));
            if (c2397l.Signature() == EnumC9342l.f19165l) {
                return;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            AbstractC2829l.crashlytics(obj);
        }
        C17132l.firebase();
    }

    public final void mopub(CharSequence charSequence) {
        InterfaceC13142l interfaceC13142l = this.loadAd;
        C10178l c10178l = this.yandex;
        c10178l.loadAd.yandex().premium();
        C2566l c2566l = c10178l.loadAd;
        c2566l.amazon(0, c2566l.f5577l.length(), "", 0, 0);
        c2566l.append(charSequence.toString());
        smaato(c2566l);
        C10178l.yandex(c10178l, interfaceC13142l, true, 1);
        c10178l.amazon(true);
    }

    public final long purchase(long j) {
        C0209l c0209l;
        C8610l c8610l = this.amazon;
        C16535l c16535l = (c8610l == null || (c0209l = (C0209l) c8610l.getValue()) == null) ? null : c0209l.loadAd;
        if (c16535l == null) {
            return j;
        }
        int i = C12814l.crashlytics;
        long jYandex = c16535l.yandex((int) (j >> 32), false);
        long jYandex2 = C12814l.amazon(j) ? jYandex : c16535l.yandex((int) (4294967295L & j), false);
        int iMin = Math.min(C12814l.mopub(jYandex), C12814l.mopub(jYandex2));
        int iMax = Math.max(C12814l.billing(jYandex), C12814l.billing(jYandex2));
        return C12814l.admob(j) ? AbstractC2296l.loadAd(iMax, iMin) : AbstractC2296l.loadAd(iMin, iMax);
    }

    public final void smaato(C2566l c2566l) {
        if (((C17893l) c2566l.yandex().f1691l).f34846l <= 0 || !C12814l.amazon(c2566l.f5585l)) {
            return;
        }
        this.purchase.setValue(new C6644l(1, 1));
    }

    public final String toString() {
        C10178l c10178l = this.yandex;
        return "TransformedTextFieldState(textFieldState=" + c10178l + ", outputTransformation=null, outputTransformedText=null, codepointTransformation=" + this.crashlytics + ", codepointTransformedText=" + this.amazon + ", outputText=\"" + ((Object) c10178l.loadAd()) + "\", visualText=\"" + ((Object) amazon()) + "\")";
    }

    public final void yandex() {
        InterfaceC13142l interfaceC13142l = this.loadAd;
        C10178l c10178l = this.yandex;
        c10178l.loadAd.yandex().premium();
        C2566l c2566l = c10178l.loadAd;
        int iBilling = C12814l.billing(c2566l.f5585l);
        AbstractC16357l.purchase(c2566l, iBilling, iBilling);
        C10178l.yandex(c10178l, interfaceC13142l, true, 1);
        c10178l.amazon(true);
    }
}
