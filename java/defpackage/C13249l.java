package defpackage;

import androidx.car.app.model.Alert;

/* JADX INFO: renamed from: lًٍْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13249l extends AbstractC14971l implements InterfaceC7150l, InterfaceC16388l {

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public AbstractC8939l f26023l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public boolean f26024l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public float f26025l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public InterfaceC13460l f26026l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public AbstractC14165l f26027l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public InterfaceC17030l f26028l;

    /* JADX INFO: renamed from: lٌّۡ, reason: contains not printable characters */
    public static boolean m3622l(long j) {
        return !C14174l.loadAd(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Alert.DURATION_SHOW_INDEFINITELY) < 2139095040;
    }

    /* JADX INFO: renamed from: lؘٗۦ, reason: contains not printable characters */
    public static boolean m3623l(long j) {
        return !C14174l.loadAd(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Alert.DURATION_SHOW_INDEFINITELY) < 2139095040;
    }

    @Override // defpackage.InterfaceC7150l
    public final InterfaceC17792l amazon(InterfaceC7448l interfaceC7448l, InterfaceC6357l interfaceC6357l, long j) {
        AbstractC10113l abstractC10113lAdcel = interfaceC6357l.adcel(m3625l(j));
        return interfaceC7448l.isVip(abstractC10113lAdcel.f20592l, abstractC10113lAdcel.f20591l, C14054l.f27396l, new C16441l(abstractC10113lAdcel, 6));
    }

    @Override // defpackage.InterfaceC7150l
    public final int billing(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        if (!m3624l()) {
            return interfaceC6357l.crashlytics(i);
        }
        long jM3625l = m3625l(AbstractC7563l.loadAd(0, i, 0, 0, 13));
        return Math.max(C15519l.subs(jM3625l), interfaceC6357l.crashlytics(i));
    }

    /* JADX INFO: renamed from: lؘۛؕ, reason: contains not printable characters */
    public final boolean m3624l() {
        return this.f26024l && this.f26027l.subs() != 9205357640488583168L;
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؙٗۛ */
    public final boolean mo512l() {
        return false;
    }

    @Override // defpackage.InterfaceC16388l
    /* JADX INFO: renamed from: lؚۦ۠ */
    public final void mo536l(C6742l c6742l) {
        long jSubs = this.f26027l.subs();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(m3622l(jSubs) ? Float.intBitsToFloat((int) (jSubs >> 32)) : Float.intBitsToFloat((int) (c6742l.f14144l.f26629l.m4551private() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(m3623l(jSubs) ? Float.intBitsToFloat((int) (jSubs & 4294967295L)) : Float.intBitsToFloat((int) (c6742l.f14144l.f26629l.m4551private() & 4294967295L)))) & 4294967295L);
        C13601l c13601l = c6742l.f14144l;
        long jFirebase = (Float.intBitsToFloat((int) (c13601l.f26629l.m4551private() >> 32)) == 0.0f || Float.intBitsToFloat((int) (c13601l.f26629l.m4551private() & 4294967295L)) == 0.0f) ? 0L : AbstractC10392l.firebase(jFloatToRawIntBits, this.f26028l.billing(jFloatToRawIntBits, c13601l.f26629l.m4551private()));
        long jYandex = this.f26026l.yandex((((long) Math.round(Float.intBitsToFloat((int) (jFirebase >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jFirebase & 4294967295L)))) & 4294967295L), (((long) Math.round(Float.intBitsToFloat((int) (c13601l.f26629l.m4551private() & 4294967295L)))) & 4294967295L) | (((long) Math.round(Float.intBitsToFloat((int) (c13601l.f26629l.m4551private() >> 32)))) << 32), c6742l.getLayoutDirection());
        float f = (int) (jYandex >> 32);
        float f2 = (int) (jYandex & 4294967295L);
        ((C16543l) c13601l.f26629l.f36010l).inmobi(f, f2);
        try {
            this.f26027l.mopub(c6742l, jFirebase, this.f26025l, this.f26023l);
            ((C16543l) c13601l.f26629l.f36010l).inmobi(-f, -f2);
            c6742l.yandex();
        } catch (Throwable th) {
            ((C16543l) c13601l.f26629l.f36010l).inmobi(-f, -f2);
            throw th;
        }
    }

    /* JADX INFO: renamed from: l٘ۦۢ, reason: contains not printable characters */
    public final long m3625l(long j) {
        boolean z = false;
        boolean z2 = C15519l.amazon(j) && C15519l.crashlytics(j);
        if (C15519l.billing(j) && C15519l.purchase(j)) {
            z = true;
        }
        if ((!m3624l() && z2) || z) {
            return C15519l.yandex(C15519l.admob(j), 0, C15519l.mopub(j), 0, 10, j);
        }
        long jSubs = this.f26027l.subs();
        int iRound = m3622l(jSubs) ? Math.round(Float.intBitsToFloat((int) (jSubs >> 32))) : C15519l.isPro(j);
        int iRound2 = m3623l(jSubs) ? Math.round(Float.intBitsToFloat((int) (jSubs & 4294967295L))) : C15519l.subs(j);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(AbstractC7563l.billing(iRound2, j))) & 4294967295L) | (((long) Float.floatToRawIntBits(AbstractC7563l.mopub(iRound, j))) << 32);
        if (m3624l()) {
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(!m3622l(this.f26027l.subs()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.f26027l.subs() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!m3623l(this.f26027l.subs()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.f26027l.subs() & 4294967295L)))) & 4294967295L);
            jFloatToRawIntBits = (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : AbstractC10392l.firebase(jFloatToRawIntBits2, this.f26028l.billing(jFloatToRawIntBits2, jFloatToRawIntBits));
        }
        return C15519l.yandex(AbstractC7563l.mopub(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))), j), 0, AbstractC7563l.billing(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))), j), 0, 10, j);
    }

    @Override // defpackage.InterfaceC7150l
    public final int mopub(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        if (!m3624l()) {
            return interfaceC6357l.mo1460for(i);
        }
        long jM3625l = m3625l(AbstractC7563l.loadAd(0, i, 0, 0, 13));
        return Math.max(C15519l.subs(jM3625l), interfaceC6357l.mo1460for(i));
    }

    @Override // defpackage.InterfaceC7150l
    public final int subs(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        if (!m3624l()) {
            return interfaceC6357l.remoteconfig(i);
        }
        long jM3625l = m3625l(AbstractC7563l.loadAd(0, 0, 0, i, 7));
        return Math.max(C15519l.isPro(jM3625l), interfaceC6357l.remoteconfig(i));
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.f26027l + ", sizeToIntrinsics=" + this.f26024l + ", alignment=" + this.f26026l + ", alpha=" + this.f26025l + ", colorFilter=" + this.f26023l + ")";
    }

    @Override // defpackage.InterfaceC7150l
    public final int yandex(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        if (!m3624l()) {
            return interfaceC6357l.metrica(i);
        }
        long jM3625l = m3625l(AbstractC7563l.loadAd(0, 0, 0, i, 7));
        return Math.max(C15519l.isPro(jM3625l), interfaceC6357l.metrica(i));
    }

    @Override // defpackage.InterfaceC16388l
    /* JADX INFO: renamed from: continue */
    public final /* synthetic */ void mo533continue() {
    }
}
