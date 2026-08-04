package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkxreborn.ui.nextdock.NextDockView;

/* JADX INFO: renamed from: lٍ۠ۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9871l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Context f20074l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f20075l;

    public /* synthetic */ C9871l(Context context, int i) {
        this.f20075l = i;
        this.f20074l = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws Exception {
        int i = this.f20075l;
        Context context = this.f20074l;
        switch (i) {
            case 0:
                return new C17485l(context);
            case 1:
                File fileAmazon = AbstractC2632l.amazon(context, "firebaseSessions/sessionConfigsDataStore.data");
                C15593l.loadAd(fileAmazon);
                return fileAmazon;
            case 2:
                File fileAmazon2 = AbstractC2632l.amazon(context, "firebaseSessions/sessionDataStore.data");
                C15593l.loadAd(fileAmazon2);
                return fileAmazon2;
            case 3:
                AbstractC12081l.purchase((AppActivity) context);
                return Unit.INSTANCE;
            case 4:
                int i2 = NextDockView.f36847l;
                return LayoutInflater.from(context);
            case 5:
                int i3 = AppActivity.f36635l;
                VKXApplication vKXApplication = VKXApplication.f36631l;
                if (vKXApplication == null) {
                    vKXApplication = null;
                }
                Intent intent = new Intent(vKXApplication, (Class<?>) AppActivity.class);
                VKXApplication vKXApplication2 = VKXApplication.f36631l;
                intent.setPackage((vKXApplication2 != null ? vKXApplication2 : null).getPackageName());
                intent.setAction("ua.itaysonlab.vkx.action.OPEN_PLAYER");
                intent.addFlags(536870912);
                return PendingIntent.getActivity(context, 0, intent, AbstractC3058l.ads());
            case 6:
                return PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
            case 7:
                return context.getApplicationContext().getSharedPreferences("op_prefs", 0);
            case 8:
                return context.getApplicationContext().getSharedPreferences("op_theme_overrides", 0);
            default:
                return PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        }
    }
}
