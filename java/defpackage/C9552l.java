package defpackage;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.material.appbar.AppBarLayout;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: lٍٓۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9552l {
    public final C6323l yandex = new C6323l();
    public static final C4733l loadAd = new C4733l(C8378l.class, new C14377l(1));
    public static final C8873l crashlytics = new C8873l("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", new C14377l(2));
    public static final C5773l amazon = new C5773l(C1778l.class, new C14377l(3));
    public static final C9439l purchase = new C9439l("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", new C14377l(4));
    public static final int[] billing = {R.attr.stateListAnimator};

    public static C9358l admob(C6932l c6932l) {
        if (c6932l.equals(C6932l.crashlytics)) {
            return C9358l.crashlytics;
        }
        if (c6932l == C6932l.amazon) {
            return C9358l.billing;
        }
        if (c6932l == C6932l.purchase) {
            return C9358l.purchase;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c6932l)));
    }

    public static C16152l amazon(C8378l c8378l) {
        EnumC7004l enumC7004l;
        C1272l c1272lInmobi = C16152l.inmobi();
        int i = c8378l.amazon;
        c1272lInmobi.purchase();
        C16152l.signatures((C16152l) c1272lInmobi.f19242l, i);
        C11534l c11534l = c8378l.billing;
        if (c11534l.equals(C11534l.f23190l)) {
            enumC7004l = EnumC7004l.SHA1;
        } else if (c11534l == C11534l.f23195l) {
            enumC7004l = EnumC7004l.SHA224;
        } else if (c11534l == C11534l.f23194l) {
            enumC7004l = EnumC7004l.SHA256;
        } else if (c11534l == C11534l.f23198l) {
            enumC7004l = EnumC7004l.SHA384;
        } else {
            if (c11534l != C11534l.f23191l) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(c11534l)));
            }
            enumC7004l = EnumC7004l.SHA512;
        }
        c1272lInmobi.purchase();
        C16152l.isVip((C16152l) c1272lInmobi.f19242l, enumC7004l);
        return (C16152l) c1272lInmobi.yandex();
    }

    public static void billing(AppBarLayout appBarLayout, float f) {
        int integer = appBarLayout.getResources().getInteger(ua.itaysonlab.vkx.R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, ua.itaysonlab.vkx.R.attr.state_liftable, -ua.itaysonlab.vkx.R.attr.state_lifted}, ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(appBarLayout, "elevation", f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(0L));
        appBarLayout.setStateListAnimator(stateListAnimator);
    }

    public static final File isPro(Uri uri) throws C8413l {
        if (!uri.getScheme().equals("file")) {
            throw new C8413l("Scheme must be 'file'");
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new C8413l("Did not expect uri to have query");
        }
        if (TextUtils.isEmpty(uri.getAuthority())) {
            return new File(uri.getPath());
        }
        throw new C8413l("Did not expect uri to have authority");
    }

    public static final Object loadAd(InterfaceC6843l interfaceC6843l, InterfaceC2077l interfaceC2077l, InterfaceC14029l interfaceC14029l) {
        Object objAdmob = AbstractC11990l.admob(new C8568l(interfaceC6843l, interfaceC2077l, null, 5), interfaceC14029l);
        return objAdmob == EnumC9342l.f19165l ? objAdmob : Unit.INSTANCE;
    }

    public static C11534l mopub(EnumC7004l enumC7004l) throws GeneralSecurityException {
        int iOrdinal = enumC7004l.ordinal();
        if (iOrdinal == 1) {
            return C11534l.f23190l;
        }
        if (iOrdinal == 2) {
            return C11534l.f23198l;
        }
        if (iOrdinal == 3) {
            return C11534l.f23194l;
        }
        if (iOrdinal == 4) {
            return C11534l.f23191l;
        }
        if (iOrdinal == 5) {
            return C11534l.f23195l;
        }
        throw new GeneralSecurityException(AbstractC0653l.vip(enumC7004l.loadAd(), "Unable to parse HashType: "));
    }

    public static final C0387l purchase(C0387l c0387l, C0387l c0387l2, float f) {
        return new C0387l(AbstractC12953l.remoteconfig(c0387l.yandex, c0387l2.yandex, f), AbstractC2296l.billing(c0387l.loadAd, c0387l2.loadAd, f), AbstractC7572l.firebase(c0387l.crashlytics, c0387l2.crashlytics, f));
    }

    public static C6932l subs(C9358l c9358l) throws GeneralSecurityException {
        C6932l c6932l = C6932l.amazon;
        if (c9358l == C9358l.crashlytics) {
            return C6932l.crashlytics;
        }
        if (c9358l == C9358l.billing || c9358l == C9358l.amazon) {
            return c6932l;
        }
        if (c9358l == C9358l.purchase) {
            return C6932l.purchase;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(c9358l)));
    }

    public static final List yandex(InterfaceC1388l interfaceC1388l) {
        return AbstractC17587l.adcel(new C8767l(AbstractC17587l.remoteconfig(interfaceC1388l, C5818l.f12252l), C5818l.f12232l, C8534l.f17624l));
    }

    public final void crashlytics(InterfaceC3770l interfaceC3770l, C13006l c13006l, C15389l c15389l, InterfaceC3928l interfaceC3928l) {
        this.yandex.admob(interfaceC3770l, c13006l, c15389l, interfaceC3928l);
    }
}
