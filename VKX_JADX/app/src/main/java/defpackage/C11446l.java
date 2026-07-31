package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lُۤؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11446l extends AbstractC14412l {
    public final boolean admob;
    public final Function0 amazon;
    public final Function1 billing;
    public final Function0 crashlytics;
    public final C10086l firebase;
    public final C10086l isPro;
    public final boolean mopub;
    public final Function1 purchase;
    public C1101l remoteconfig;
    public final C10086l smaato;
    public final Function0 subs;
    public final C10086l vip;

    public C11446l(Function0 function0, Function0 function1, C12433l c12433l, Function1 function2, boolean z, boolean z2, C11921l c11921l, int i) {
        Function1 c10557l = (i & 4) != 0 ? new C10557l(19) : c12433l;
        z = (i & 16) != 0 ? false : z;
        z2 = (i & 32) != 0 ? false : z2;
        Function0 c5146l = (i & 64) != 0 ? new C5146l(11) : c11921l;
        this.crashlytics = function0;
        this.amazon = function1;
        this.purchase = c10557l;
        this.billing = function2;
        this.mopub = z;
        this.admob = z2;
        this.subs = c5146l;
        Boolean bool = Boolean.FALSE;
        this.isPro = AbstractC8020l.smaato(bool);
        this.firebase = AbstractC8020l.smaato(bool);
        this.smaato = AbstractC8020l.smaato("");
        this.vip = AbstractC8020l.smaato(AbstractC7252l.purchase(AbstractC13209l.purchase.crashlytics));
    }

    @Override // defpackage.AbstractC14412l
    public final void admob(int i) {
        C1101l c1101l = this.remoteconfig;
        if (c1101l != null) {
            ComposeView composeView = c1101l.f3038l;
            ViewGroup.LayoutParams layoutParams = composeView.getLayoutParams();
            if (layoutParams == null) {
                C6541l.subs("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = i;
            composeView.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // defpackage.AbstractC14412l
    public final View amazon(Context context, ViewGroup viewGroup) {
        C1101l c1101lYandex = C1101l.yandex(LayoutInflater.from(context), viewGroup);
        this.remoteconfig = c1101lYandex;
        c1101lYandex.f3037l.setContent(new C15578l(-2109107379, true, new C10525l(this, 0)));
        return c1101lYandex.f3038l;
    }

    @Override // defpackage.AbstractC14412l
    public final void billing() {
        this.vip.setValue(AbstractC7252l.purchase(AbstractC13209l.purchase.crashlytics));
    }

    public final void firebase(EnumC10474l enumC10474l, C6956l c6956l, int i) {
        c6956l.m2133new(-1702304664);
        int i2 = (c6956l.amazon(enumC10474l.ordinal()) ? 4 : 2) | i | (c6956l.admob(this) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            int iAdmob = AbstractC6363l.admob(0, 1, c6956l);
            int i3 = 14;
            boolean zAdmob = c6956l.admob(this) | ((i2 & 14) == 4);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C8652l(enumC10474l, this, i3);
                c6956l.m2147try(objM2132native);
            }
            AbstractC7470l.billing((Function0) objM2132native, C4346l.f8873l, false, null, null, null, AbstractC14566l.amazon(-1563728374, new C1674l(enumC10474l, iAdmob, 13), c6956l), c6956l, 1572912, 60);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C10848l(this, enumC10474l, i, 17);
        }
    }

    @Override // defpackage.AbstractC14412l
    public final View purchase() {
        C1101l c1101l = this.remoteconfig;
        if (c1101l != null) {
            return c1101l.f3038l;
        }
        return null;
    }

    public final void remoteconfig(boolean z) {
        this.firebase.setValue(Boolean.valueOf(z));
    }

    public final void smaato(Function2 function2, C6956l c6956l, int i, int i2) {
        int i3;
        Function2 function3;
        Object c8568l;
        c6956l.m2133new(1988865583);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (c6956l.admob(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i3 | (c6956l.admob(this) ? 32 : 16);
        if (c6956l.m2127for(i5 & 1, (i5 & 19) != 18)) {
            if (i4 != 0) {
                function2 = AbstractC2438l.yandex;
            }
            Function2 function4 = function2;
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                objM2132native = new C6523l();
                c6956l.m2147try(objM2132native);
            }
            C6523l c6523l = (C6523l) objM2132native;
            InterfaceC6497l interfaceC6497l = (InterfaceC6497l) c6956l.isPro(AbstractC4751l.subs);
            Object objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == c13863l) {
                objM2132native2 = AbstractC14814l.isPro(c6956l);
            }
            C2403l c2403l = (C2403l) objM2132native2;
            InterfaceC8714l interfaceC8714lLoadAd = AbstractC8317l.loadAd(c2403l, c6956l, 6);
            Boolean bool = (Boolean) this.isPro.getValue();
            bool.booleanValue();
            boolean zAdmob = c6956l.admob(this) | c6956l.admob(interfaceC6497l);
            Object objM2132native3 = c6956l.m2132native();
            InterfaceC14029l interfaceC14029l = null;
            if (zAdmob || objM2132native3 == c13863l) {
                c8568l = new C8568l(this, interfaceC6497l, c6523l, interfaceC14029l, 9);
                c6956l.m2147try(c8568l);
            } else {
                c8568l = objM2132native3;
            }
            AbstractC12311l.amazon(c6956l, bool, (Function2) c8568l);
            Boolean bool2 = (Boolean) this.firebase.getValue();
            bool2.booleanValue();
            boolean zAdmob2 = c6956l.admob(this) | c6956l.admob(interfaceC6497l);
            Object objM2132native4 = c6956l.m2132native();
            if (zAdmob2 || objM2132native4 == c13863l) {
                objM2132native4 = new C7864l(this, interfaceC6497l, interfaceC14029l, 14);
                c6956l.m2147try(objM2132native4);
            }
            AbstractC12311l.amazon(c6956l, bool2, (Function2) objM2132native4);
            Unit unit = Unit.INSTANCE;
            boolean zAdmob3 = c6956l.admob(this) | c6956l.billing(interfaceC8714lLoadAd);
            Object objM2132native5 = c6956l.m2132native();
            if (zAdmob3 || objM2132native5 == c13863l) {
                objM2132native5 = new C7226l(this, interfaceC8714lLoadAd, interfaceC14029l, 19);
                c6956l.m2147try(objM2132native5);
            }
            AbstractC12311l.amazon(c6956l, unit, (Function2) objM2132native5);
            AbstractC10478l.yandex(AbstractC5020l.startapp(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel, AbstractC12502l.yandex), AbstractC14566l.amazon(1015054703, new C2104l(this, c6523l, c2403l, function4, 16), c6956l), c6956l, 56);
            function3 = function4;
        } else {
            c6956l.m2124else();
            function3 = function2;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C9976l(this, function3, i, i2, 2);
        }
    }

    @Override // defpackage.AbstractC14412l
    public final void mopub(String str) {
    }
}
