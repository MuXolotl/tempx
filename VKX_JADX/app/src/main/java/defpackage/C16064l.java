package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import java.io.File;
import java.util.ArrayList;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.service.AutostartReceiver;

/* JADX INFO: renamed from: lٕۦَ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16064l implements InterfaceC17639l {
    public static final C16064l yandex = new C16064l();

    @Override // defpackage.InterfaceC17639l
    public final void yandex(Context context) {
        Context applicationContext = context.getApplicationContext();
        VKXApplication.Companion companion = VKXApplication.f36628l;
        int i = 5;
        int i2 = 2;
        InterfaceC14029l interfaceC14029l = null;
        if (VKXApplication.f36632l != null) {
            String simpleName = AbstractC16330l.class.getSimpleName();
            if (simpleName.length() == 0) {
                simpleName = (String) AbstractC16901l.m4214continue(AbstractC12024l.m3323finally(AbstractC16330l.class.getName(), new char[]{'.'}));
            }
            AbstractC2991l.billing(simpleName, 5, "Trying to create already created PlaybackControllerImpl!", null);
        } else {
            C16076l.f31498l = new C0554l(new C3342l(i2), new C9871l(applicationContext, i), new C3342l(3));
            C11324l c11324l = new C11324l(applicationContext.getApplicationContext(), "exoplayer_internal.db", null, 1);
            File file = new File(applicationContext.getCacheDir(), "oc_exocache");
            Context applicationContext2 = applicationContext.getApplicationContext();
            C13042l c13042l = C13042l.f25547l;
            C7390l c7390l = new C7390l();
            C11610l c11610l = AbstractC3629l.yandex;
            C11610l c11610l2 = c11610l != null ? c11610l : null;
            C1424l c1424lCrashlytics = AbstractC16584l.crashlytics();
            C12220l c12220l = new C12220l(file, new C6172l(), c11324l);
            C18073l c18073l = new C18073l();
            C13434l c13434l = C13434l.yandex;
            C4626l c4626l = C4626l.yandex;
            C16076l c16076l = new C16076l(applicationContext2, c13042l, c7390l, c11610l2, c12220l, c11324l, file, c18073l, c13434l, c1424lCrashlytics, new C3342l(4));
            VKXApplication.f36632l = c16076l;
            C7796l c7796l = new C7796l();
            ArrayList arrayList = c16076l.f31510l;
            arrayList.add(c7796l);
            arrayList.add(new C14357l());
            arrayList.add(C12942l.yandex);
            arrayList.add(C1602l.yandex);
            arrayList.add(new C14357l(c16076l));
        }
        C3392l c3392l = new C3392l(context, i2);
        AbstractC17549l.purchase = R.drawable.generic_audio_nowplaying;
        AbstractC17549l.billing = c3392l;
        AbstractC4340l.yandex = context.getApplicationContext().getSharedPreferences("lastfmutil", 0);
        AbstractC4340l.loadAd = true;
        C18659l c18659l = C18659l.yandex;
        C18659l.loadAd.put("vk", C18003l.yandex);
        context.getApplicationContext().registerReceiver(new AutostartReceiver(), new IntentFilter("android.intent.action.HEADSET_PLUG"));
        VKXApplication vKXApplication = VKXApplication.f36631l;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        AbstractC10999l.mopub(vKXApplication, AbstractC11463l.yandex, 0, new C18160l(i2, interfaceC14029l, 11), 2);
    }
}
