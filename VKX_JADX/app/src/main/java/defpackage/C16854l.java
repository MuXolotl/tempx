package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٗؒۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16854l extends AbstractC11801l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C10086l f32886l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final C10086l f32887l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C10086l f32888l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final C10086l f32889l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final boolean f32890l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final String f32891l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final String f32892l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final C10086l f32893l;

    public C16854l(String str, String str2, boolean z, C5779l c5779l) {
        super(0);
        this.f32891l = str;
        this.f32892l = str2;
        this.f32890l = z;
        Boolean bool = Boolean.FALSE;
        this.f32888l = AbstractC8020l.smaato(bool);
        this.f32887l = AbstractC8020l.smaato(bool);
        this.f32886l = AbstractC8020l.smaato(bool);
        this.f32893l = AbstractC8020l.smaato("");
        this.f32889l = AbstractC8020l.smaato(c5779l);
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public static final void m4199import(C16854l c16854l, AbstractC14237l abstractC14237l, C4530l c4530l) {
        if (abstractC14237l instanceof C10898l) {
            C5779l c5779lM4200abstract = c16854l.m4200abstract();
            EnumC11781l enumC11781l = c4530l.yandex;
            if (enumC11781l == null) {
                enumC11781l = EnumC11781l.RESERVE_CODE;
            }
            String str = c4530l.amazon;
            if (str == null) {
                str = "";
            }
            c16854l.f32889l.setValue(C5779l.yandex(c5779lM4200abstract, enumC11781l, str));
            return;
        }
        c16854l.getClass();
        if (!(abstractC14237l instanceof C17922l)) {
            C18725l.billing();
            return;
        }
        StringBuilder sb = new StringBuilder("[RS/");
        C17922l c17922l = (C17922l) abstractC14237l;
        sb.append(c17922l.yandex);
        sb.append("] ");
        sb.append(c17922l.loadAd);
        c16854l.m4202instanceof(sb.toString());
    }

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final C5779l m4200abstract() {
        return (C5779l) this.f32889l.getValue();
    }

    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public final void m4201finally(boolean z) {
        this.f32887l.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public final void m4202instanceof(String str) {
        this.f32893l.setValue(str);
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        c6956l.m2133new(503079452);
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
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(68986328, new C10321l(this, b, b), c6956l), null, null, null, 0, 0L, 0L, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).amazon(c6956l), AbstractC14566l.amazon(-1863475091, new C0598l(0, c10178lMopub, (InterfaceC8533l) c6956l.isPro(AbstractC4751l.adcel), this, c6523l2, m4200abstract().yandex == EnumC11781l.PASSWORD), c6956l), c6956l, 805306416, 253);
            Unit unit = Unit.INSTANCE;
            boolean zBilling = c6956l.billing(c6523l2);
            Object objM2132native2 = c6956l.m2132native();
            if (zBilling || objM2132native2 == obj) {
                objM2132native2 = new C1012l(c6523l2, null, 1);
                c6956l.m2147try(objM2132native2);
            }
            AbstractC12311l.amazon(c6956l, unit, (Function2) objM2132native2);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C10321l(this, i);
        }
    }

    /* JADX INFO: renamed from: public, reason: not valid java name */
    public final void m4203public(boolean z) {
        this.f32888l.setValue(Boolean.valueOf(z));
    }
}
