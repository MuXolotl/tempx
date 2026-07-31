package defpackage;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.textclassifier.TextClassification;
import android.widget.Magnifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٌٖٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16278l implements InterfaceC16182l, InterfaceC18693l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final C16278l f31881l = new C16278l();

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C16278l f31880l = new C16278l();

    public static Typeface admob(String str, C6886l c6886l, int i) {
        if (i == 0 && AbstractC8576l.yandex(c6886l, C6886l.f14425l) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        if (i == 0 && AbstractC8576l.yandex(c6886l, C6886l.f14424l) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT_BOLD;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), c6886l.f14426l, i == 1);
    }

    public static String amazon(TextClassification textClassification, C6956l c6956l) {
        c6956l.m2123default(950061013);
        String strValueOf = String.valueOf(textClassification.getLabel());
        c6956l.startapp(false);
        return strValueOf;
    }

    public static String billing(RemoteAction remoteAction, C6956l c6956l) {
        c6956l.m2123default(-1376593684);
        String string = remoteAction.getTitle().toString();
        c6956l.startapp(false);
        return string;
    }

    public static Unit purchase(RemoteAction remoteAction) throws PendingIntent.CanceledException {
        PendingIntent actionIntent = remoteAction.getActionIntent();
        if (Build.VERSION.SDK_INT >= 34) {
            AbstractC5917l.m1869package(actionIntent);
        } else {
            actionIntent.send();
        }
        return Unit.INSTANCE;
    }

    public static void subs(C7152l c7152l, Context context, C8765l c8765l) {
        if (context == null) {
            return;
        }
        int i = c8765l.crashlytics;
        TextClassification textClassification = c8765l.loadAd;
        Drawable drawable = c8765l.amazon;
        int i2 = 1;
        if (i < 0) {
            C7152l.loadAd(c7152l, new C1645l(22, textClassification), drawable != null ? new C15578l(-1123224187, true, new C2821l(drawable, 0)) : null, new C5514l(context, textClassification, 0), 6);
        } else {
            RemoteAction remoteAction = textClassification.getActions().get(i);
            C7152l.loadAd(c7152l, new C1645l(23, remoteAction), drawable != null ? new C15578l(1106162332, true, new C2821l(drawable, i2)) : null, new C5767l(21, remoteAction), 6);
        }
    }

    @Override // defpackage.InterfaceC16182l
    public InterfaceC14104l crashlytics(View view, boolean z, long j, float f, float f2, boolean z2, InterfaceC13490l interfaceC13490l, float f3) {
        return new C3061l(new Magnifier(view));
    }

    @Override // defpackage.InterfaceC18693l
    public Typeface firebase(C3944l c3944l, C6886l c6886l, int i) {
        return admob(c3944l.f8124l, c6886l, i);
    }

    @Override // defpackage.InterfaceC18693l
    public Typeface loadAd(int i, C6886l c6886l) {
        return admob(null, c6886l, i);
    }

    public void mopub(Drawable drawable, C6956l c6956l, int i) {
        c6956l.m2133new(257732500);
        int i2 = (c6956l.admob(drawable) ? 4 : 2) | i;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            InterfaceC17242l interfaceC17242lIsPro = AbstractC0080l.isPro(C4346l.f8873l, AbstractC12259l.purchase);
            boolean zAdmob = c6956l.admob(drawable);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C0783l(5, drawable);
                c6956l.m2147try(objM2132native);
            }
            AbstractC9383l.yandex(AbstractC14289l.isPro(interfaceC17242lIsPro, (Function1) objM2132native), c6956l, 0);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C2736l(this, drawable, i, 13);
        }
    }

    @Override // defpackage.InterfaceC16182l
    public boolean yandex() {
        return false;
    }
}
