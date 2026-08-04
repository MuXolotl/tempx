package defpackage;

import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: lٍٙۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9649l extends AbstractC12586l implements InterfaceC16036l, InterfaceC3703l {

    /* JADX INFO: renamed from: lؒٓؐ, reason: contains not printable characters */
    public final C1192l f19677l;

    /* JADX INFO: renamed from: lٟؓٔ, reason: contains not printable characters */
    public final C6543l f19678l;

    /* JADX INFO: renamed from: lؔؕؖ, reason: contains not printable characters */
    public C17299l f19679l;

    /* JADX INFO: renamed from: lؕۦؓ, reason: contains not printable characters */
    public final C4154l f19680l;

    /* JADX INFO: renamed from: lؖ۠ٙ, reason: contains not printable characters */
    public final C17110l f19681l;

    /* JADX INFO: renamed from: lؚؗٞ, reason: contains not printable characters */
    public final C10632l f19682l;

    /* JADX INFO: renamed from: lؗ۟ۤ, reason: contains not printable characters */
    public final C3276l f19683l;

    /* JADX INFO: renamed from: lُؚؓ, reason: contains not printable characters */
    public C3652l f19684l;

    /* JADX INFO: renamed from: lٍَٕ, reason: contains not printable characters */
    public C10306l f19685l;

    /* JADX INFO: renamed from: lِِٞ, reason: contains not printable characters */
    public C1645l f19686l;

    /* JADX INFO: renamed from: lؘْٙ, reason: contains not printable characters */
    public InterfaceC14745l f19687l;

    /* JADX INFO: renamed from: lٖ٘ۘ, reason: contains not printable characters */
    public C17658l f19688l;

    public C9649l(C10306l c10306l, InterfaceC14447l interfaceC14447l, InterfaceC14745l interfaceC14745l, C2403l c2403l, EnumC7283l enumC7283l, InterfaceC17955l interfaceC17955l, boolean z, boolean z2) {
        super(AbstractC13611l.yandex, z, c2403l, enumC7283l);
        this.f19685l = c10306l;
        this.f19687l = interfaceC14745l;
        C17110l c17110l = new C17110l();
        this.f19681l = c17110l;
        C1192l c1192l = new C1192l(new C17308l(new C5008l(AbstractC13611l.amazon)));
        this.f19677l = c1192l;
        C10306l c10306l2 = this.f19685l;
        InterfaceC14745l interfaceC14745l2 = this.f19687l;
        C4154l c4154l = new C4154l(interfaceC17955l, c10306l2, interfaceC14745l2 == null ? c1192l : interfaceC14745l2, enumC7283l, z2, c17110l, this, new C10839l(this, 0));
        this.f19680l = c4154l;
        C10632l c10632l = new C10632l(c4154l, z);
        this.f19682l = c10632l;
        C6543l c6543l = new C6543l(2, null, 10);
        m3069l(c6543l);
        this.f19678l = c6543l;
        C3276l c3276l = new C3276l(enumC7283l, c4154l, z2, interfaceC14447l, new C10839l(this, 1));
        m3069l(c3276l);
        this.f19683l = c3276l;
        m3069l(new C4369l(c10632l, c17110l));
        C1252l c1252l = new C1252l();
        c1252l.f3277l = c3276l;
        m3069l(c1252l);
    }

    /* JADX WARN: Code duplicated, block: B:66:0x014c  */
    @Override // defpackage.AbstractC12586l, defpackage.InterfaceC13202l
    public final void appmetrica(C9185l c9185l, EnumC9065l enumC9065l, long j) {
        EnumC9065l enumC9065l2;
        EnumC9065l enumC9065l3;
        int i;
        int i2;
        int i3;
        List list = c9185l.yandex;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (((Boolean) this.f24791l.invoke(new C10829l(((C15730l) list.get(i4)).subs))).booleanValue()) {
                super.appmetrica(c9185l, enumC9065l, j);
                break;
            }
        }
        if (this.f24781l) {
            if (this.f24775l == null) {
                C18395l c18395l = new C18395l(this);
                m3069l(c18395l);
                this.f24775l = c18395l;
            }
            int i5 = 3;
            InterfaceC14029l interfaceC14029l = null;
            C4154l c4154l = this.f19680l;
            EnumC9065l enumC9065l4 = EnumC9065l.f18654l;
            if (enumC9065l == enumC9065l4 && c9185l.billing == 6) {
                if (this.f19679l == null) {
                    enumC9065l2 = enumC9065l4;
                    this.f19679l = new C17299l(c4154l, new C15053l(ViewConfiguration.get(AbstractC1068l.billing(this).getContext())), new C11491l(2, this, C9649l.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4, 2), AbstractC5573l.metrica(this).f7668l);
                } else {
                    enumC9065l2 = enumC9065l4;
                }
                C17299l c17299l = this.f19679l;
                if (c17299l != null) {
                    InterfaceC2262l interfaceC2262lM3914l = m3914l();
                    if (c17299l.subs == null) {
                        c17299l.subs = AbstractC10999l.mopub(interfaceC2262lM3914l, null, 0, new C5888l(c17299l, interfaceC14029l, i5), 3);
                    }
                }
            } else {
                enumC9065l2 = enumC9065l4;
            }
            C17299l c17299l2 = this.f19679l;
            EnumC9065l enumC9065l5 = EnumC9065l.f18653l;
            if (c17299l2 == null || c9185l.billing != 6) {
                enumC9065l3 = enumC9065l2;
                break;
            }
            int size2 = list.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size2) {
                    enumC9065l3 = enumC9065l2;
                    if (enumC9065l == enumC9065l3 && c17299l2.crashlytics) {
                        c17299l2.m4303static(c9185l);
                        AbstractC0294l.yandex(c9185l);
                    }
                    if (enumC9065l != enumC9065l5 || c17299l2.crashlytics || !c17299l2.m4303static(c9185l)) {
                        break;
                        break;
                        break;
                    } else {
                        AbstractC0294l.yandex(c9185l);
                        break;
                    }
                }
                if (((C15730l) list.get(i6)).crashlytics()) {
                    enumC9065l3 = enumC9065l2;
                    break;
                }
                i6++;
            }
            if (enumC9065l == enumC9065l3 && ((i3 = c9185l.billing) == 10 || i3 == 11 || i3 == 12)) {
                if (this.f19688l == null) {
                    i2 = 11;
                    this.f19688l = new C17658l(c4154l, new C11491l(2, this, C9649l.class, "onTrackpadScrollStopped", "onTrackpadScrollStopped-TH1AsA0(J)V", 4, 3), AbstractC5573l.metrica(this).f7668l);
                } else {
                    i2 = 11;
                }
                C17658l c17658l = this.f19688l;
                if (c17658l != null) {
                    InterfaceC2262l interfaceC2262lM3914l2 = m3914l();
                    if (c17658l.admob == null) {
                        i = 0;
                        c17658l.admob = AbstractC10999l.mopub(interfaceC2262lM3914l2, null, 0, new C8036l(c17658l, interfaceC14029l, i2), 3);
                    } else {
                        i = 0;
                    }
                } else {
                    i = 0;
                }
            } else {
                enumC9065l5 = enumC9065l5;
                i = 0;
                i2 = 11;
            }
            C17658l c17658l2 = this.f19688l;
            if (c17658l2 != null) {
                int i7 = c9185l.billing;
                if (i7 == 10 || i7 == i2 || i7 == 12) {
                    int size3 = list.size();
                    for (int i8 = i; i8 < size3; i8++) {
                        if (((C15730l) list.get(i8)).crashlytics()) {
                            return;
                        }
                    }
                    if (enumC9065l == enumC9065l3 && c17658l2.crashlytics) {
                        c17658l2.m4407class(c9185l);
                        AbstractC0294l.yandex(c9185l);
                    }
                    if (enumC9065l == enumC9065l5 && !c17658l2.crashlytics && c17658l2.m4407class(c9185l)) {
                        AbstractC0294l.yandex(c9185l);
                    }
                }
            }
        }
    }

    @Override // defpackage.InterfaceC3703l
    /* JADX INFO: renamed from: catch */
    public final /* synthetic */ boolean mo490catch() {
        return false;
    }

    @Override // defpackage.InterfaceC3703l
    public final void isPro(InterfaceC17593l interfaceC17593l) {
        if (this.f24781l && (this.f19686l == null || this.f19684l == null)) {
            this.f19686l = new C1645l(0, this);
            this.f19684l = new C3652l(this, null);
        }
        C1645l c1645l = this.f19686l;
        if (c1645l != null) {
            InterfaceC13922l[] interfaceC13922lArr = AbstractC3668l.yandex;
            interfaceC17593l.amazon(AbstractC16601l.amazon, new C7629l(null, c1645l));
        }
        C3652l c3652l = this.f19684l;
        if (c3652l != null) {
            InterfaceC13922l[] interfaceC13922lArr2 = AbstractC3668l.yandex;
            interfaceC17593l.amazon(AbstractC16601l.purchase, c3652l);
        }
    }

    @Override // defpackage.InterfaceC3703l
    /* JADX INFO: renamed from: lۣؒٞ */
    public final /* synthetic */ boolean mo491l() {
        return false;
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lّؗؑ */
    public final void mo511l() {
        if (this.f29462l) {
            InterfaceC13490l interfaceC13490l = AbstractC5573l.metrica(this).f7668l;
            C1192l c1192l = this.f19677l;
            c1192l.getClass();
            c1192l.yandex = new C17308l(new C5008l(interfaceC13490l));
        }
        C17299l c17299l = this.f19679l;
        if (c17299l != null) {
            c17299l.amazon = AbstractC5573l.metrica(this).f7668l;
        }
        C17658l c17658l = this.f19688l;
        if (c17658l != null) {
            c17658l.amazon = AbstractC5573l.metrica(this).f7668l;
        }
    }

    @Override // defpackage.AbstractC12586l
    /* JADX INFO: renamed from: lؙؗٗ */
    public final boolean mo828l() {
        C4154l c4154l = this.f19680l;
        if (c4154l.yandex.yandex()) {
            return true;
        }
        C10306l c10306l = c4154l.loadAd;
        return c10306l != null ? c10306l.purchase() : false;
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؙٗۛ */
    public final boolean mo512l() {
        return false;
    }

    @Override // defpackage.AbstractC12586l, defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lٍؚۖ */
    public final void mo1495l() {
        mo1500throw();
        if (this.f29462l) {
            InterfaceC13490l interfaceC13490l = AbstractC5573l.metrica(this).f7668l;
            C1192l c1192l = this.f19677l;
            c1192l.getClass();
            c1192l.yandex = new C17308l(new C5008l(interfaceC13490l));
        }
        C17299l c17299l = this.f19679l;
        if (c17299l != null) {
            c17299l.amazon = AbstractC5573l.metrica(this).f7668l;
        }
        C17658l c17658l = this.f19688l;
        if (c17658l != null) {
            c17658l.amazon = AbstractC5573l.metrica(this).f7668l;
        }
    }

    @Override // defpackage.AbstractC12586l
    /* JADX INFO: renamed from: lُٔۨ */
    public final void mo830l(C5685l c5685l) {
        AbstractC10999l.mopub(this.f19681l.crashlytics(), null, 0, new C7226l(c5685l, this, null, 17), 3);
    }

    /* JADX INFO: renamed from: lّٔ٘, reason: contains not printable characters */
    public final void m2704l(C10306l c10306l, InterfaceC14447l interfaceC14447l, InterfaceC14745l interfaceC14745l, C2403l c2403l, EnumC7283l enumC7283l, InterfaceC17955l interfaceC17955l, boolean z, boolean z2) {
        boolean z3;
        boolean z4 = true;
        boolean z5 = false;
        if (this.f24781l != z) {
            this.f19682l.f21575l = z;
            z3 = true;
        } else {
            z3 = false;
        }
        InterfaceC14745l interfaceC14745l2 = interfaceC14745l == null ? this.f19677l : interfaceC14745l;
        C4154l c4154l = this.f19680l;
        if (!AbstractC8576l.yandex(c4154l.yandex, interfaceC17955l)) {
            c4154l.yandex = interfaceC17955l;
            z5 = true;
        }
        c4154l.loadAd = c10306l;
        if (c4154l.amazon != enumC7283l) {
            c4154l.amazon = enumC7283l;
            z5 = true;
        }
        if (c4154l.purchase != z2) {
            c4154l.purchase = z2;
        } else {
            z4 = z5;
        }
        c4154l.crashlytics = interfaceC14745l2;
        c4154l.billing = this.f19681l;
        C3276l c3276l = this.f19683l;
        c3276l.f7009l = enumC7283l;
        c3276l.f7008l = z2;
        c3276l.f7010l = interfaceC14447l;
        this.f19685l = c10306l;
        this.f19687l = interfaceC14745l;
        EnumC7283l enumC7283l2 = c4154l.amazon;
        EnumC7283l enumC7283l3 = EnumC7283l.f15126l;
        if (enumC7283l2 != enumC7283l3) {
            enumC7283l3 = EnumC7283l.f15125l;
        }
        m3410l(AbstractC13611l.yandex, z, c2403l, enumC7283l3, z4);
        if (z3) {
            this.f19686l = null;
            this.f19684l = null;
            AbstractC18037l.purchase(this);
        }
    }

    @Override // defpackage.AbstractC12586l
    /* JADX INFO: renamed from: lٖۡٓ */
    public final Object mo831l(C2375l c2375l, C2375l c2375l2) {
        C4154l c4154l = this.f19680l;
        Object objMopub = c4154l.mopub(EnumC11011l.f22181l, new C17949l(c2375l, c4154l, null, 20), c2375l2);
        return objMopub == EnumC9342l.f19165l ? objMopub : Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC3703l
    public final /* synthetic */ boolean remoteconfig() {
        return true;
    }

    @Override // defpackage.InterfaceC16036l
    /* JADX INFO: renamed from: strictfp */
    public final boolean mo1515strictfp(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        if (!this.f24781l || ((!AbstractC5072l.yandex(AbstractC16422l.amazon(keyEvent), AbstractC5072l.appmetrica) && !AbstractC5072l.yandex(AbstractC0593l.yandex(keyEvent.getKeyCode()), AbstractC5072l.applovin)) || AbstractC16422l.purchase(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        boolean z = this.f19680l.amazon == EnumC7283l.f15126l;
        C3276l c3276l = this.f19683l;
        if (z) {
            int iM1315l = (int) (c3276l.m1315l() & 4294967295L);
            float f = AbstractC5072l.yandex(AbstractC0593l.yandex(keyEvent.getKeyCode()), AbstractC5072l.applovin) ? iM1315l : -iM1315l;
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            iFloatToRawIntBits = Float.floatToRawIntBits(f);
        } else {
            int iM1315l2 = (int) (c3276l.m1315l() >> 32);
            jFloatToRawIntBits = Float.floatToRawIntBits(AbstractC5072l.yandex(AbstractC0593l.yandex(keyEvent.getKeyCode()), AbstractC5072l.applovin) ? iM1315l2 : -iM1315l2);
            iFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
        }
        AbstractC10999l.mopub(m3914l(), null, 0, new C3652l(this, (4294967295L & ((long) iFloatToRawIntBits)) | (jFloatToRawIntBits << 32), null, 0), 3);
        return true;
    }

    @Override // defpackage.InterfaceC16036l
    public final boolean vip(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.AbstractC12586l
    /* JADX INFO: renamed from: lؚؚؔ */
    public final void mo829l(long j) {
    }
}
