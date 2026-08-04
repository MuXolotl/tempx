package defpackage;

import androidx.car.app.model.Alert;

/* JADX INFO: renamed from: lؚْؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2586l extends AbstractC14971l implements InterfaceC7150l, InterfaceC16388l, InterfaceC10653l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C10086l f5631l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public C11925l f5632l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public C7504l f5633l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public float f5634l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public final C8610l f5638l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public int f5639l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final C15308l f5637l = new C15308l(0);

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C15308l f5640l = new C15308l(0);

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C10086l f5636l = AbstractC8020l.smaato(Boolean.FALSE);

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final C10086l f5641l = AbstractC8020l.smaato(new C18649l());

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final C5616l f5635l = AbstractC6791l.yandex(0.0f);

    public C2586l(int i, C4875l c4875l, float f) {
        this.f5639l = i;
        this.f5634l = f;
        this.f5631l = AbstractC8020l.smaato(c4875l);
        this.f5638l = AbstractC8020l.mopub(new C4062l(c4875l, this));
    }

    @Override // defpackage.InterfaceC7150l
    public final InterfaceC17792l amazon(InterfaceC7448l interfaceC7448l, InterfaceC6357l interfaceC6357l, long j) {
        AbstractC10113l abstractC10113lAdcel = interfaceC6357l.adcel(C15519l.yandex(0, Alert.DURATION_SHOW_INDEFINITELY, 0, 0, 13, j));
        int iMopub = AbstractC7563l.mopub(abstractC10113lAdcel.f20592l, j);
        C15308l c15308l = this.f5640l;
        c15308l.subs(iMopub);
        this.f5637l.subs(abstractC10113lAdcel.f20592l);
        return interfaceC7448l.isVip(c15308l.admob(), abstractC10113lAdcel.f20591l, C14054l.f27396l, new C10889l(abstractC10113lAdcel, 9));
    }

    @Override // defpackage.InterfaceC7150l
    public final int billing(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return interfaceC6357l.crashlytics(Alert.DURATION_SHOW_INDEFINITELY);
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؘؓؖ */
    public final void mo535l() {
        C7504l c7504l = this.f5633l;
        if (c7504l != null) {
            c7504l.ads(null);
        }
        this.f5633l = null;
        C11925l c11925l = this.f5632l;
        if (c11925l != null) {
            AbstractC5573l.remoteconfig(this).yandex(c11925l);
            this.f5632l = null;
        }
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lّؗؑ */
    public final void mo511l() {
        C11925l c11925l = this.f5632l;
        InterfaceC3685l interfaceC3685lRemoteconfig = AbstractC5573l.remoteconfig(this);
        if (c11925l != null) {
            interfaceC3685lRemoteconfig.yandex(c11925l);
        }
        this.f5632l = interfaceC3685lRemoteconfig.crashlytics();
        m1230l();
    }

    /* JADX INFO: renamed from: lؘۛؕ, reason: contains not printable characters */
    public final int m1229l() {
        return ((Number) this.f5638l.getValue()).intValue();
    }

    @Override // defpackage.InterfaceC16388l
    /* JADX INFO: renamed from: lؚۦ۠ */
    public final void mo536l(C6742l c6742l) throws Throwable {
        float fAdmob;
        float fFloatValue;
        int iAdmob;
        long j;
        long j2;
        int iYandex = C14467l.yandex(this.f5634l, 0.0f);
        C15308l c15308l = this.f5640l;
        C15308l c15308l2 = this.f5637l;
        C5616l c5616l = this.f5635l;
        if (iYandex > 0) {
            int iOrdinal = c6742l.getLayoutDirection().ordinal();
            if (iOrdinal == 0) {
                fAdmob = ((Number) c5616l.amazon()).floatValue();
            } else if (iOrdinal != 1) {
                C18725l.billing();
                return;
            } else {
                fFloatValue = (-((Number) c5616l.amazon()).floatValue()) + (c15308l2.admob() * 2) + m1229l();
                iAdmob = c15308l.admob();
                fAdmob = fFloatValue - iAdmob;
            }
        } else {
            int iOrdinal2 = c6742l.getLayoutDirection().ordinal();
            if (iOrdinal2 == 0) {
                fAdmob = (-((Number) c5616l.amazon()).floatValue()) + c15308l2.admob() + m1229l();
            } else if (iOrdinal2 != 1) {
                C18725l.billing();
                return;
            } else {
                fFloatValue = ((Number) c5616l.amazon()).floatValue() + c15308l2.admob();
                iAdmob = c15308l.admob();
                fAdmob = fFloatValue - iAdmob;
            }
        }
        boolean z = fAdmob < ((float) c15308l2.admob());
        boolean z2 = ((float) c15308l.admob()) + fAdmob > ((float) (m1229l() + c15308l2.admob()));
        float fM1229l = m1229l() + c15308l2.admob();
        C13601l c13601l = c6742l.f14144l;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c13601l.f26629l.m4551private() & 4294967295L));
        C11925l c11925l = this.f5632l;
        if (c11925l != null) {
            j = 4294967295L;
            c6742l.subscription((((long) AbstractC5573l.ads(fIntBitsToFloat)) & 4294967295L) | (((long) c15308l2.admob()) << 32), c11925l, new C15941l(c6742l));
        } else {
            j = 4294967295L;
        }
        float fAdmob2 = c15308l.admob();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c6742l.admob() & j));
        C18449l c18449l = c13601l.f26629l;
        long jM4551private = c18449l.m4551private();
        c18449l.m4555synchronized().mopub();
        try {
            try {
                ((C16543l) c18449l.f36010l).remoteconfig(0.0f, 0.0f, fAdmob2, fIntBitsToFloat2, 1);
                float f = -fAdmob;
                ((C16543l) c6742l.f14144l.f26629l.f36010l).inmobi(f, 0.0f);
                try {
                    C11925l c11925l2 = this.f5632l;
                    if (c11925l2 != null) {
                        if (z) {
                            AbstractC2576l.loadAd(c6742l, c11925l2);
                        }
                        if (z2) {
                            ((C16543l) c6742l.f14144l.f26629l.f36010l).inmobi(fM1229l, 0.0f);
                            try {
                                AbstractC2576l.loadAd(c6742l, c11925l2);
                                ((C16543l) c6742l.f14144l.f26629l.f36010l).inmobi(-fM1229l, -0.0f);
                            } catch (Throwable th) {
                                ((C16543l) c6742l.f14144l.f26629l.f36010l).inmobi(-fM1229l, -0.0f);
                                throw th;
                            }
                        }
                    } else {
                        if (z) {
                            c6742l.yandex();
                        }
                        if (z2) {
                            ((C16543l) c6742l.f14144l.f26629l.f36010l).inmobi(fM1229l, 0.0f);
                            try {
                                c6742l.yandex();
                                ((C16543l) c6742l.f14144l.f26629l.f36010l).inmobi(-fM1229l, -0.0f);
                            } catch (Throwable th2) {
                                ((C16543l) c6742l.f14144l.f26629l.f36010l).inmobi(-fM1229l, -0.0f);
                                throw th2;
                            }
                        }
                    }
                    ((C16543l) c6742l.f14144l.f26629l.f36010l).inmobi(-f, -0.0f);
                    AbstractC0653l.license(c18449l, jM4551private);
                } catch (Throwable th3) {
                    j2 = jM4551private;
                    try {
                        ((C16543l) c6742l.f14144l.f26629l.f36010l).inmobi(-f, -0.0f);
                        throw th3;
                    } catch (Throwable th4) {
                        th = th4;
                        AbstractC0653l.license(c18449l, j2);
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                j2 = jM4551private;
            }
        } catch (Throwable th6) {
            th = th6;
            j2 = jM4551private;
        }
    }

    /* JADX INFO: renamed from: lؘٗۦ, reason: contains not printable characters */
    public final void m1230l() {
        C7504l c7504l = this.f5633l;
        InterfaceC14029l interfaceC14029l = null;
        if (c7504l != null) {
            c7504l.ads(null);
        }
        if (this.f29462l) {
            this.f5633l = AbstractC10999l.mopub(m3914l(), null, 0, new C5888l(c7504l, this, interfaceC14029l, 0), 3);
        }
    }

    @Override // defpackage.InterfaceC7150l
    public final int mopub(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return interfaceC6357l.mo1460for(Alert.DURATION_SHOW_INDEFINITELY);
    }

    @Override // defpackage.InterfaceC10653l
    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final void mo1231native(EnumC11822l enumC11822l) {
        this.f5636l.setValue(Boolean.valueOf(enumC11822l.yandex()));
    }

    @Override // defpackage.InterfaceC7150l
    public final int subs(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return 0;
    }

    @Override // defpackage.InterfaceC7150l
    public final int yandex(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return interfaceC6357l.metrica(i);
    }

    @Override // defpackage.InterfaceC16388l
    /* JADX INFO: renamed from: continue */
    public final /* synthetic */ void mo533continue() {
    }
}
