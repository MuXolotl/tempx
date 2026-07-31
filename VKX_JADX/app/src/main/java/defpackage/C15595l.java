package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lَٕ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15595l extends AbstractC16915l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C13551l f30450l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f30451l = 1;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f30452l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f30453l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f30454l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15595l(C13551l c13551l, C17421l c17421l, C17421l c17421l2, C17421l c17421l3) {
        super(1);
        this.f30450l = c13551l;
        this.f30453l = c17421l;
        this.f30452l = c17421l2;
        this.f30454l = c17421l3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f30451l;
        Object obj2 = this.f30452l;
        Object obj3 = this.f30453l;
        C13551l c13551l = this.f30450l;
        Object obj4 = this.f30454l;
        switch (i) {
            case 0:
                C6148l c6148l = (C6148l) obj;
                InterfaceC12244l interfaceC12244l = (InterfaceC12244l) obj3;
                float fFloatValue = interfaceC12244l != null ? ((Number) interfaceC12244l.getValue()).floatValue() : 1.0f;
                C14169l c14169l = c13551l.crashlytics;
                float fAdmob = fFloatValue * ((c13551l.loadAd() && ((Boolean) ((C10086l) c14169l.yandex).getValue()).booleanValue()) ? ((C13765l) c14169l.loadAd).admob() : 1.0f);
                if (c13551l.loadAd()) {
                    c13551l.billing = fAdmob;
                }
                c6148l.crashlytics(fAdmob);
                InterfaceC12244l interfaceC12244l2 = (InterfaceC12244l) obj2;
                float fFloatValue2 = interfaceC12244l2 != null ? ((Number) interfaceC12244l2.getValue()).floatValue() : 1.0f;
                boolean z = c13551l.loadAd() && ((Boolean) ((C10086l) c14169l.crashlytics).getValue()).booleanValue();
                float fAdmob2 = fFloatValue2 * (z ? ((C13765l) c14169l.amazon).admob() : 1.0f);
                if (c13551l.loadAd()) {
                    c13551l.mopub = fAdmob2;
                    if (z) {
                        if (c13551l.isPro == null) {
                            c13551l.isPro = new C13507l(false, 2);
                        }
                        C13507l c13507l = c13551l.isPro;
                        if (c13507l != null) {
                            c13507l.yandex(fAdmob2, C9658l.amazon(C4663l.yandex(c13551l.amazon)));
                        }
                    }
                }
                c6148l.remoteconfig(fAdmob2);
                c6148l.vip(fAdmob2);
                InterfaceC12244l interfaceC12244l3 = (InterfaceC12244l) obj4;
                long j = interfaceC12244l3 != null ? ((C1723l) interfaceC12244l3.getValue()).yandex : C1723l.loadAd;
                if (c13551l.loadAd() && ((Boolean) ((C10086l) c14169l.purchase).getValue()).booleanValue()) {
                    j = ((C1723l) ((C10086l) c14169l.billing).getValue()).yandex;
                }
                if (c13551l.loadAd()) {
                    c13551l.admob = j;
                }
                c6148l.tapsense(j);
                return Unit.INSTANCE;
            default:
                C0274l c0274l = (C0274l) obj4;
                int iOrdinal = ((EnumC18226l) obj).ordinal();
                C1723l c1723l = null;
                if (iOrdinal == 0) {
                    C11700l c11700l = ((C3000l) obj2).yandex.amazon;
                    if (c11700l != null) {
                        c1723l = new C1723l(c11700l.loadAd);
                    } else {
                        C11700l c11700l2 = c0274l.yandex.amazon;
                        if (c11700l2 != null) {
                            c1723l = new C1723l(c11700l2.loadAd);
                        }
                    }
                } else if (iOrdinal == 1) {
                    c1723l = (C1723l) obj3;
                } else {
                    if (iOrdinal != 2) {
                        C18725l.billing();
                        return null;
                    }
                    C11700l c11700l3 = c0274l.yandex.amazon;
                    c1723l = new C1723l(c11700l3 != null ? c11700l3.loadAd : c13551l.admob);
                }
                return new C1723l(c1723l != null ? c1723l.yandex : C1723l.loadAd);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15595l(C1723l c1723l, C3000l c3000l, C0274l c0274l, C13551l c13551l) {
        super(1);
        this.f30453l = c1723l;
        this.f30452l = c3000l;
        this.f30454l = c0274l;
        this.f30450l = c13551l;
    }
}
