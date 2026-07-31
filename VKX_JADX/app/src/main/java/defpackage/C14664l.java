package defpackage;

import androidx.car.app.model.Alert;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٔؕۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14664l extends AbstractC14971l implements InterfaceC7150l, InterfaceC3703l {

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public boolean f28674l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public C11194l f28675l;

    @Override // defpackage.InterfaceC7150l
    public final InterfaceC17792l amazon(InterfaceC7448l interfaceC7448l, InterfaceC6357l interfaceC6357l, long j) {
        AbstractC15684l.loadAd(j, this.f28674l ? EnumC7283l.f15126l : EnumC7283l.f15125l);
        boolean z = this.f28674l;
        int iAdmob = Alert.DURATION_SHOW_INDEFINITELY;
        int iMopub = z ? Integer.MAX_VALUE : C15519l.mopub(j);
        if (this.f28674l) {
            iAdmob = C15519l.admob(j);
        }
        AbstractC10113l abstractC10113lAdcel = interfaceC6357l.adcel(C15519l.yandex(0, iAdmob, 0, iMopub, 5, j));
        int i = abstractC10113lAdcel.f20592l;
        int iAdmob2 = C15519l.admob(j);
        if (i > iAdmob2) {
            i = iAdmob2;
        }
        int i2 = abstractC10113lAdcel.f20591l;
        int iMopub2 = C15519l.mopub(j);
        if (i2 > iMopub2) {
            i2 = iMopub2;
        }
        int i3 = abstractC10113lAdcel.f20591l - i2;
        int i4 = abstractC10113lAdcel.f20592l - i;
        if (!this.f28674l) {
            i3 = i4;
        }
        this.f28675l.billing(i3);
        this.f28675l.loadAd.subs(this.f28674l ? i2 : i);
        this.f28675l.crashlytics.subs(this.f28674l ? abstractC10113lAdcel.f20591l : abstractC10113lAdcel.f20592l);
        this.f28675l.amazon.setValue(Boolean.FALSE);
        return interfaceC7448l.isVip(i, i2, C14054l.f27396l, new C8608l(this, i3, abstractC10113lAdcel, 5));
    }

    @Override // defpackage.InterfaceC7150l
    public final int billing(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        if (!this.f28674l) {
            i = Alert.DURATION_SHOW_INDEFINITELY;
        }
        return interfaceC6357l.crashlytics(i);
    }

    @Override // defpackage.InterfaceC3703l
    /* JADX INFO: renamed from: catch */
    public final /* synthetic */ boolean mo490catch() {
        return false;
    }

    @Override // defpackage.InterfaceC3703l
    public final void isPro(InterfaceC17593l interfaceC17593l) {
        AbstractC3668l.adcel(interfaceC17593l);
        final int i = 0;
        final int i2 = 1;
        C11601l c11601l = new C11601l(new Function0(this) { // from class: lؚؒؑ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C14664l f2334l;

            {
                this.f2334l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iAdmob;
                int i3 = i;
                C14664l c14664l = this.f2334l;
                switch (i3) {
                    case 0:
                        iAdmob = c14664l.f28675l.yandex.admob();
                        break;
                    default:
                        iAdmob = c14664l.f28675l.billing.admob();
                        break;
                }
                return Float.valueOf(iAdmob);
            }
        }, new Function0(this) { // from class: lؚؒؑ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C14664l f2334l;

            {
                this.f2334l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iAdmob;
                int i3 = i2;
                C14664l c14664l = this.f2334l;
                switch (i3) {
                    case 0:
                        iAdmob = c14664l.f28675l.yandex.admob();
                        break;
                    default:
                        iAdmob = c14664l.f28675l.billing.admob();
                        break;
                }
                return Float.valueOf(iAdmob);
            }
        });
        if (this.f28674l) {
            C4707l c4707l = AbstractC0424l.pro;
            InterfaceC13922l interfaceC13922l = AbstractC3668l.yandex[13];
            interfaceC17593l.amazon(c4707l, c11601l);
        } else {
            C4707l c4707l2 = AbstractC0424l.license;
            InterfaceC13922l interfaceC13922l2 = AbstractC3668l.yandex[12];
            interfaceC17593l.amazon(c4707l2, c11601l);
        }
    }

    @Override // defpackage.InterfaceC3703l
    /* JADX INFO: renamed from: lۣؒٞ */
    public final /* synthetic */ boolean mo491l() {
        return false;
    }

    @Override // defpackage.InterfaceC7150l
    public final int mopub(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        if (!this.f28674l) {
            i = Alert.DURATION_SHOW_INDEFINITELY;
        }
        return interfaceC6357l.mo1460for(i);
    }

    @Override // defpackage.InterfaceC3703l
    public final /* synthetic */ boolean remoteconfig() {
        return true;
    }

    @Override // defpackage.InterfaceC7150l
    public final int subs(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        if (this.f28674l) {
            i = Alert.DURATION_SHOW_INDEFINITELY;
        }
        return interfaceC6357l.remoteconfig(i);
    }

    @Override // defpackage.InterfaceC7150l
    public final int yandex(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        if (this.f28674l) {
            i = Alert.DURATION_SHOW_INDEFINITELY;
        }
        return interfaceC6357l.metrica(i);
    }
}
