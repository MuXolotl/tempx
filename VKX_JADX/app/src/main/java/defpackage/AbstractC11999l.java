package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.StrictMode;
import java.util.Arrays;
import kotlin.Unit;

/* JADX INFO: renamed from: lِٝۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11999l {
    public static final C15578l yandex = new C15578l(-1796312627, false, new C10272l(16));
    public static final C15578l loadAd = new C15578l(300930349, false, new C10272l(17));
    public static final C15578l crashlytics = new C15578l(1629692339, false, new C1104l(4));
    public static final C15578l amazon = new C15578l(-1044560986, false, new C1104l(5));
    public static final C15578l purchase = new C15578l(125415271, false, new C1104l(6));
    public static final C15578l billing = new C15578l(-262419184, false, new C1104l(7));
    public static final C15578l mopub = new C15578l(-12317905, false, new C1104l(8));
    public static final C15578l admob = new C15578l(237783374, false, new C1104l(9));
    public static final C15578l subs = new C15578l(487884653, false, new C1104l(0));
    public static final C15578l isPro = new C15578l(737985932, false, new C1104l(1));
    public static final C15578l firebase = new C15578l(988087211, false, new C1104l(2));
    public static final C15578l smaato = new C15578l(-523068772, false, new C1104l(3));

    public static final String amazon(int i, Object[] objArr, C6956l c6956l) {
        return ((Resources) c6956l.isPro(AbstractC1242l.crashlytics)).getString(i, Arrays.copyOf(objArr, objArr.length));
    }

    public static C18449l billing(Object obj) {
        return new C18449l(obj.getClass().getSimpleName(), 25);
    }

    public static final void crashlytics(Activity activity, Intent intent) {
        Parcelable parcelableExtra = intent.getParcelableExtra("ACTION_INTENT");
        if (parcelableExtra == null) {
            C8339l.metrica("List adapter activity trampoline invoked without specifying target intent.");
            return;
        }
        Intent intent2 = (Intent) parcelableExtra;
        int i = 0;
        if (intent.hasExtra("android.widget.extra.CHECKED")) {
            intent2.putExtra("android.widget.extra.CHECKED", intent.getBooleanExtra("android.widget.extra.CHECKED", false));
        }
        String stringExtra = intent.getStringExtra("ACTION_TYPE");
        if (stringExtra == null) {
            C8339l.metrica("List adapter activity trampoline invoked without trampoline type");
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("ACTIVITY_OPTIONS");
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setVmPolicy(Build.VERSION.SDK_INT >= 31 ? AbstractC12148l.premium(new StrictMode.VmPolicy.Builder(vmPolicy)).build() : new StrictMode.VmPolicy.Builder().build());
        if (stringExtra == null) {
            C6541l.subs("Name is null");
        } else if (stringExtra.equals("ACTIVITY")) {
            i = 1;
        } else if (stringExtra.equals("BROADCAST")) {
            i = 2;
        } else if (stringExtra.equals("SERVICE")) {
            i = 3;
        } else if (stringExtra.equals("FOREGROUND_SERVICE")) {
            i = 4;
        } else if (stringExtra.equals("CALLBACK")) {
            i = 5;
        } else {
            C8339l.metrica("No enum constant androidx.glance.appwidget.action.ActionTrampolineType.".concat(stringExtra));
        }
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            activity.startActivity(intent2, bundleExtra);
        } else if (iInmobi == 1) {
            activity.sendBroadcast(intent2);
        } else if (iInmobi == 2) {
            activity.startService(intent2);
        } else if (iInmobi != 3) {
            if (iInmobi != 4) {
                C18725l.billing();
                return;
            }
            activity.sendBroadcast(intent2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC5941l.m1891implements(activity, intent2);
        } else {
            activity.startService(intent2);
        }
        Unit unit = Unit.INSTANCE;
        StrictMode.setVmPolicy(vmPolicy);
        activity.finish();
    }

    public static final Uri loadAd(C4372l c4372l, int i, int i2, String str) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("glance-action");
        builder.path(AbstractC5020l.appmetrica(i2));
        builder.appendQueryParameter("appWidgetId", String.valueOf(c4372l.loadAd));
        builder.appendQueryParameter("viewId", String.valueOf(i));
        builder.appendQueryParameter("viewSize", C2261l.crashlytics(c4372l.isPro));
        builder.appendQueryParameter("extraData", str);
        if (c4372l.billing) {
            builder.appendQueryParameter("lazyCollection", String.valueOf(c4372l.firebase));
            builder.appendQueryParameter("lazeViewItem", String.valueOf(-1));
        }
        return builder.build();
    }

    public static final long mopub(long j, long j2) {
        int iPurchase;
        int iMopub = C12814l.mopub(j);
        int iBilling = C12814l.billing(j);
        if ((C12814l.mopub(j2) < C12814l.billing(j)) && (C12814l.mopub(j) < C12814l.billing(j2))) {
            if (C12814l.yandex(j2, j)) {
                iMopub = C12814l.mopub(j2);
                iBilling = iMopub;
            } else {
                if (C12814l.yandex(j, j2)) {
                    iPurchase = C12814l.purchase(j2);
                } else {
                    int iMopub2 = C12814l.mopub(j2);
                    if (iMopub >= C12814l.billing(j2) || iMopub2 > iMopub) {
                        iBilling = C12814l.mopub(j2);
                    } else {
                        iMopub = C12814l.mopub(j2);
                        iPurchase = C12814l.purchase(j2);
                    }
                }
                iBilling -= iPurchase;
            }
        } else if (iBilling > C12814l.mopub(j2)) {
            iMopub -= C12814l.purchase(j2);
            iPurchase = C12814l.purchase(j2);
            iBilling -= iPurchase;
        }
        return AbstractC2296l.loadAd(iMopub, iBilling);
    }

    public static final String purchase(C6956l c6956l, int i) {
        return ((Resources) c6956l.isPro(AbstractC1242l.crashlytics)).getString(i);
    }

    public static Intent yandex(Intent intent, C4372l c4372l, int i, int i2) {
        Intent intent2 = new Intent();
        C0458l c0458l = c4372l.metrica;
        intent2.setComponent(i2 == 1 ? (ComponentName) c0458l.f1691l : (ComponentName) c0458l.f1690l);
        intent2.setData(loadAd(c4372l, i, i2, ""));
        intent2.putExtra("ACTION_TYPE", AbstractC5020l.appmetrica(i2));
        intent2.putExtra("ACTION_INTENT", intent);
        return intent2;
    }
}
