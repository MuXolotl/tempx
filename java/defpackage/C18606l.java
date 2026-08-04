package defpackage;

import android.media.AudioManager;
import androidx.car.app.navigation.model.Maneuver;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: l۟ۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C18606l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C16076l f36357l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f36358l;

    public /* synthetic */ C18606l(C16076l c16076l, int i) {
        this.f36358l = i;
        this.f36357l = c16076l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long j;
        int i = this.f36358l;
        long j2 = 0;
        C16076l c16076l = this.f36357l;
        switch (i) {
            case 0:
                C16811l c16811l = c16076l.f31499l;
                if (c16811l != null) {
                    return Long.valueOf(c16811l.mo2771l());
                }
                return null;
            case 1:
                C16811l c16811l2 = c16076l.f31499l;
                return Boolean.valueOf((c16811l2 == null || c16811l2.mo2763instanceof()) ? false : true);
            case 2:
                C16811l c16811l3 = c16076l.f31499l;
                if (c16811l3 == null) {
                    return null;
                }
                c16811l3.mo2814volatile();
                return Unit.INSTANCE;
            case 3:
                C16811l c16811l4 = c16076l.f31499l;
                int iPurchase = c16811l4 != null ? c16811l4.purchase() : 1;
                if (iPurchase != 2 && iPurchase != 3) {
                    return EnumC11447l.f23033l;
                }
                C16811l c16811l5 = c16076l.f31499l;
                return (c16811l5 == null || !c16811l5.mo2758finally()) ? EnumC11447l.f23031l : EnumC11447l.f23032l;
            case 4:
                C16811l c16811l6 = c16076l.f31499l;
                return Integer.valueOf(c16811l6 != null ? c16811l6.mo2761implements() : 0);
            case 5:
                C2258l c2258l = c16076l.f31521l;
                C16811l c16811l7 = c16076l.f31499l;
                return c2258l.admob(c16811l7 != null ? Integer.valueOf(c16811l7.mo2813try()) : null);
            case 6:
                C16811l c16811l8 = c16076l.f31499l;
                int iMopub = c16811l8 != null ? c16811l8.mopub() : 0;
                if (iMopub != 0) {
                    return iMopub != 1 ? EnumC12501l.f24640l : EnumC12501l.f24639l;
                }
                return EnumC12501l.f24641l;
            case 7:
                return c16076l.f31501l;
            case 8:
                return (AudioManager) c16076l.f31508l.getSystemService(AudioManager.class);
            case 9:
                C16811l c16811l9 = c16076l.f31499l;
                if (c16811l9 != null) {
                    return Long.valueOf(c16811l9.mo2798new());
                }
                return null;
            case 10:
                C16811l c16811l10 = c16076l.f31499l;
                if (c16811l10 != null) {
                    c16811l10.mo2749case();
                }
                C16811l c16811l11 = c16076l.f31499l;
                if (c16811l11 == null) {
                    return null;
                }
                c16811l11.mo2801protected();
                return Unit.INSTANCE;
            case 11:
                C2258l c2258l2 = c16076l.f31521l;
                C16811l c16811l12 = c16076l.f31499l;
                return c2258l2.admob(c16811l12 != null ? Integer.valueOf(c16811l12.mo2761implements()) : null);
            case 12:
                C2258l c2258l3 = c16076l.f31521l;
                C16811l c16811l13 = c16076l.f31499l;
                return c2258l3.admob(c16811l13 != null ? Integer.valueOf(c16811l13.license()) : null);
            case 13:
                C16811l c16811l14 = c16076l.f31499l;
                if (c16811l14 != null) {
                    long duration = c16811l14.getDuration();
                    if (duration < 0) {
                        duration = 0;
                    }
                    j = duration;
                } else {
                    j = 0;
                }
                C16811l c16811l15 = c16076l.f31499l;
                long jMo2798new = c16811l15 != null ? c16811l15.mo2798new() : 0L;
                C16811l c16811l16 = c16076l.f31499l;
                return new C1100l(j, jMo2798new, c16811l16 != null ? c16811l16.mo2771l() : 0L);
            case 14:
                C16811l c16811l17 = c16076l.f31499l;
                if (c16811l17 != null) {
                    return c16811l17.mo2778l();
                }
                return null;
            case 15:
                C16811l c16811l18 = c16076l.f31499l;
                if (c16811l18 == null) {
                    return null;
                }
                c16811l18.mo2773l();
                return Unit.INSTANCE;
            case 16:
                C16811l c16811l19 = c16076l.f31499l;
                if (c16811l19 == null) {
                    return null;
                }
                c16811l19.mo2786l();
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C16811l c16811l20 = c16076l.f31499l;
                if (c16811l20 != null) {
                    return c16811l20.billing();
                }
                return null;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C16811l c16811l21 = c16076l.f31499l;
                if (c16811l21 != null) {
                    long duration2 = c16811l21.getDuration();
                    if (duration2 >= 0) {
                        j2 = duration2;
                    }
                }
                return Long.valueOf(j2);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C16811l c16811l22 = c16076l.f31499l;
                if (c16811l22 == null) {
                    return null;
                }
                c16811l22.mo2801protected();
                return Unit.INSTANCE;
            default:
                C16811l c16811l23 = c16076l.f31499l;
                return Boolean.valueOf(c16811l23 != null && c16811l23.purchase() == 2);
        }
    }
}
