package defpackage;

import android.app.Activity;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.OriginalPlaylist;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lٍؑٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0409l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C5218l f1524l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f1525l;

    public /* synthetic */ C0409l(C5218l c5218l, int i) {
        this.f1525l = i;
        this.f1524l = c5218l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f1525l;
        InterfaceC14029l interfaceC14029l = null;
        int i2 = 2;
        boolean z = false;
        byte b = 0;
        int i3 = 5;
        int i4 = 1;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = true;
        C5218l c5218l = this.f1524l;
        switch (i) {
            case 0:
                C4456l c4456l = (C4456l) obj;
                Activity activity = c4456l.f5081l;
                AbstractC9033l.crashlytics((AppActivity) activity, new C15556l(c5218l, activity, interfaceC14029l, z2 ? 1 : 0));
                c4456l.purchase();
                break;
            case 1:
                C4456l c4456l2 = (C4456l) obj;
                AppActivity appActivity = (AppActivity) c4456l2.f5081l;
                AudioPlaylist audioPlaylist = c5218l.f11302l;
                appActivity.license(new C7246l(new C17317l(audioPlaylist.amazon, audioPlaylist.crashlytics, audioPlaylist.pro)));
                c4456l2.purchase();
                break;
            case 2:
                C4456l c4456l3 = (C4456l) obj;
                C10086l c10086lSmaato = AbstractC8020l.smaato(Boolean.FALSE);
                new C13330l(R.string.libtools_merge_playlist, R.string.libtools_merge_playlist_confirm, R.string.confirm_act, new C15578l(-2073977128, true, new C5157l(c10086lSmaato, b == true ? 1 : 0)), null, new C5996l(c5218l, c10086lSmaato, c4456l3, i2), null, 328).Signature(c4456l3.f5081l);
                c4456l3.purchase();
                break;
            case 3:
                C4456l c4456l4 = (C4456l) obj;
                Activity activity2 = c4456l4.f5081l;
                c5218l.crashlytics(activity2, new C6663l(activity2, c5218l, z3 ? 1 : 0));
                AppActivity appActivity2 = (AppActivity) c4456l4.f5081l;
                Integer numValueOf = Integer.valueOf(R.drawable.ic_download_square_outline_28);
                VKXApplication.Companion companion = VKXApplication.f36628l;
                C6666l.yandex(appActivity2, new C10734l(numValueOf, VKXApplication.Companion.loadAd(R.string.sn_playlist_added_to_cache), c5218l.f11301l + " - " + c5218l.f11302l.mopub, null, null, 248));
                c4456l4.purchase();
                break;
            case 4:
                AppActivity appActivity3 = (AppActivity) ((Activity) obj);
                StringBuilder sb = new StringBuilder("https://vk.com/audios");
                AudioPlaylist audioPlaylist2 = c5218l.f11302l;
                OriginalPlaylist originalPlaylist = audioPlaylist2.tapsense;
                sb.append(originalPlaylist != null ? originalPlaylist.yandex : audioPlaylist2.amazon);
                appActivity3.license(new C15191l((String) null, new C1329l(sb.toString(), 1)));
                break;
            case 5:
                C4456l c4456l5 = (C4456l) obj;
                Activity activity3 = c4456l5.f5081l;
                c5218l.crashlytics(activity3, new C6663l(activity3, c5218l, i2));
                AppActivity appActivity4 = (AppActivity) c4456l5.f5081l;
                Integer numValueOf2 = Integer.valueOf(R.drawable.ic_download_square_outline_28);
                VKXApplication.Companion companion2 = VKXApplication.f36628l;
                C6666l.yandex(appActivity4, new C10734l(numValueOf2, VKXApplication.Companion.loadAd(R.string.sn_playlist_added_to_cache), c5218l.f11301l + " - " + c5218l.f11302l.mopub, null, null, 248));
                c4456l5.purchase();
                break;
            case 6:
                C4456l c4456l6 = (C4456l) obj;
                new C2157l(new C9080l(c5218l.f11302l)).Signature(c4456l6.f5081l);
                c4456l6.purchase();
                break;
            case 7:
                C4456l c4456l7 = (C4456l) obj;
                Context context = c4456l7.f5081l;
                c5218l.crashlytics(context, new C9012l(z, context, i3));
                c4456l7.purchase();
                break;
            case 8:
                C4456l c4456l8 = (C4456l) obj;
                Context context2 = c4456l8.f5081l;
                c5218l.crashlytics(context2, new C9012l(z4 ? 1 : 0, context2, i3));
                c4456l8.purchase();
                break;
            case 9:
                C4456l c4456l9 = (C4456l) obj;
                c5218l.crashlytics(c4456l9.f5081l, new C0014l(c4456l9, i4));
                c4456l9.purchase();
                break;
            default:
                C4456l c4456l10 = (C4456l) obj;
                Activity activity4 = c4456l10.f5081l;
                c5218l.crashlytics(activity4, new C6663l(c5218l, activity4));
                c4456l10.purchase();
                break;
        }
        return Unit.INSTANCE;
    }
}
