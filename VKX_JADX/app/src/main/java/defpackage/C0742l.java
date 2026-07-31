package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lؑۨٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0742l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C0483l f2239l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2240l;

    public /* synthetic */ C0742l(C0483l c0483l, int i) {
        this.f2240l = i;
        this.f2239l = c0483l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f2240l;
        C0483l c0483l = this.f2239l;
        switch (i) {
            case 0:
                C10218l c10218l = (C10218l) obj;
                C13450l c13450l = (C13450l) ((C10086l) c0483l.yandex.startapp.f23357l).getValue();
                c10218l.setArtwork(c13450l != null ? AbstractC5941l.loadAd(c13450l.loadAd) : null);
                return Unit.INSTANCE;
            case 1:
                Integer num = (Integer) obj;
                num.getClass();
                C9879l c9879l = c0483l.yandex;
                new C18534l((C16016l) c9879l.ads.yandex(), num).Signature(c9879l.yandex);
                return Unit.INSTANCE;
            default:
                C9879l c9879l2 = c0483l.yandex;
                C10111l c10111l = c9879l2.adcel;
                AppActivity appActivity = c9879l2.yandex;
                C14974l c14974l = c9879l2.firebase().yandex;
                String str = c14974l.loadAd;
                String str2 = c14974l.amazon;
                int iOrdinal = ((EnumC11215l) obj).ordinal();
                if (iOrdinal == 0) {
                    appActivity.applovin();
                    appActivity.license(new C13157l());
                } else if (iOrdinal == 1) {
                    C7268l c7268l = C7268l.f15111l;
                    AudioTrack audioTrack = (AudioTrack) c9879l2.isPro().loadAd;
                    c7268l.getClass();
                    C15478l.purchase.getClass();
                    AbstractC0532l.loadAd(new C9810l(appActivity, audioTrack, 18), appActivity);
                    VKXApplication.Companion companion = VKXApplication.f36628l;
                    c10111l.startapp(VKXApplication.Companion.loadAd(R.string.sn_track_added_to_cache), str2 + " - " + str);
                } else if (iOrdinal == 2) {
                    C9312l c9312l = new C9312l(appActivity);
                    C14225l c14225l = (C14225l) c9312l.f28907l;
                    c14225l.amazon = c14225l.yandex.getText(R.string.confirm);
                    VKXApplication vKXApplication = VKXApplication.f36631l;
                    c14225l.billing = (vKXApplication != null ? vKXApplication : null).getString(R.string.cache_remove_desc, str2, str);
                    c9312l.appmetrica(R.string.remove, new DialogInterfaceOnClickListenerC13033l(c9879l2, c14974l, 0));
                    c9312l.applovin(R.string.cancel, new DialogInterfaceOnClickListenerC0609l(1));
                    c9312l.isVip();
                } else if (iOrdinal == 3) {
                    try {
                        AbstractC11397l.mopub(appActivity, new C11704l((AudioTrack) c9879l2.isPro().loadAd, 4));
                    } catch (SecurityException unused) {
                        c10111l.startapp("Ошибка", "Нет разрешения, вы точно дали разрешение \"Память\"?");
                    }
                    break;
                } else if (iOrdinal == 4) {
                    new C9231l((AudioTrack) c9879l2.isPro().loadAd).Signature(appActivity);
                } else {
                    if (iOrdinal != 5) {
                        C18725l.billing();
                        return null;
                    }
                    c9879l2.remoteconfig(c9879l2.isPro());
                }
                c0483l.remoteconfig();
                return Unit.INSTANCE;
        }
    }
}
