package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lِٟؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0996l extends AbstractC11801l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C10086l f2742l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final C10086l f2743l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C10086l f2744l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final boolean f2745l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final String f2746l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final String f2747l;

    public C0996l(String str, String str2, boolean z) {
        super(0);
        this.f2746l = str;
        this.f2747l = str2;
        this.f2745l = z;
        Boolean bool = Boolean.FALSE;
        this.f2744l = AbstractC8020l.smaato(bool);
        this.f2743l = AbstractC8020l.smaato(bool);
        this.f2742l = AbstractC8020l.smaato("");
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        c6956l.m2133new(732115196);
        int i2 = i | (c6956l.admob(this) ? 4 : 2);
        byte b = 0;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            C10178l c10178lMopub = AbstractC11173l.mopub(null, c6956l, 3);
            Object objM2132native = c6956l.m2132native();
            Object obj = C1867l.yandex;
            if (objM2132native == obj) {
                C6523l c6523l = C6523l.loadAd;
                objM2132native = C7122l.yandex;
                c6956l.m2147try(objM2132native);
            }
            ((C7122l) objM2132native).getClass();
            C6523l c6523l2 = new C6523l();
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(2108747960, new C15692l(this, b, b), c6956l), null, null, null, 0, 0L, 0L, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).amazon(c6956l), AbstractC14566l.amazon(1417433165, new C11223l(c10178lMopub, (InterfaceC8533l) c6956l.isPro(AbstractC4751l.adcel), this, c6523l2, 9), c6956l), c6956l, 805306416, 253);
            Unit unit = Unit.INSTANCE;
            boolean zBilling = c6956l.billing(c6523l2);
            Object objM2132native2 = c6956l.m2132native();
            if (zBilling || objM2132native2 == obj) {
                objM2132native2 = new C1012l(c6523l2, null, 3);
                c6956l.m2147try(objM2132native2);
            }
            AbstractC12311l.amazon(c6956l, unit, (Function2) objM2132native2);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C15692l(this, i);
        }
    }
}
