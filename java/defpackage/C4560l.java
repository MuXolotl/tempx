package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؖۨۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4560l extends AbstractC11801l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C10086l f9229l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final C10086l f9230l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final String f9231l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final C10086l f9232l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final String f9233l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final String f9234l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final String f9235l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final C10086l f9236l;

    public C4560l(String str, String str2, String str3, String str4, C10186l c10186l) {
        super(0);
        this.f9234l = str;
        this.f9235l = str2;
        this.f9233l = str3;
        this.f9231l = str4;
        Boolean bool = Boolean.FALSE;
        this.f9230l = AbstractC8020l.smaato(bool);
        this.f9229l = AbstractC8020l.smaato(bool);
        this.f9236l = AbstractC8020l.smaato("");
        this.f9232l = AbstractC8020l.smaato(c10186l);
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final C10186l m1555import() {
        return (C10186l) this.f9232l.getValue();
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        c6956l.m2133new(709296586);
        int i2 = i | (c6956l.admob(this) ? 4 : 2);
        byte b = 0;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            InterfaceC14029l interfaceC14029l = null;
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
            InterfaceC8533l interfaceC8533l = (InterfaceC8533l) c6956l.isPro(AbstractC4751l.adcel);
            EnumC9763l enumC9763l = m1555import().yandex;
            boolean zAdmob = c6956l.admob(this);
            Object objM2132native2 = c6956l.m2132native();
            if (zAdmob || objM2132native2 == obj) {
                objM2132native2 = new C14951l(this, interfaceC14029l, 22);
                c6956l.m2147try(objM2132native2);
            }
            AbstractC12311l.amazon(c6956l, enumC9763l, (Function2) objM2132native2);
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(2085929350, new C15727l(this, b, b), c6956l), null, null, null, 0, 0L, 0L, null, AbstractC14566l.amazon(1394614555, new C11223l(this, c10178lMopub, interfaceC8533l, c6523l2, 8), c6956l), c6956l, 805306416, 509);
            Unit unit = Unit.INSTANCE;
            boolean zBilling = c6956l.billing(c6523l2);
            Object objM2132native3 = c6956l.m2132native();
            if (zBilling || objM2132native3 == obj) {
                objM2132native3 = new C1012l(c6523l2, null, 2);
                c6956l.m2147try(objM2132native3);
            }
            AbstractC12311l.amazon(c6956l, unit, (Function2) objM2132native3);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C15727l(this, i);
        }
    }
}
