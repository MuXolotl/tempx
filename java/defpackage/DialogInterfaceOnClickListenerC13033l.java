package defpackage;

import android.content.DialogInterface;
import java.util.List;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lّۨۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC13033l implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f25527l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f25528l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f25529l;

    public /* synthetic */ DialogInterfaceOnClickListenerC13033l(Object obj, Object obj2, int i) {
        this.f25529l = i;
        this.f25528l = obj;
        this.f25527l = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        StringBuilder sb;
        String str;
        int i2 = this.f25529l;
        Object obj = this.f25527l;
        Object obj2 = this.f25528l;
        switch (i2) {
            case 0:
                C9879l c9879l = (C9879l) obj2;
                C14974l c14974l = (C14974l) obj;
                C7268l.f15111l.mopub((AudioTrack) c9879l.isPro().loadAd);
                C10111l c10111l = c9879l.adcel;
                VKXApplication.Companion companion = VKXApplication.f36628l;
                c10111l.startapp(VKXApplication.Companion.loadAd(R.string.sn_track_removed_from_cache), c14974l.amazon + " - " + c14974l.loadAd);
                dialogInterface.dismiss();
                break;
            default:
                C7711l c7711l = (C7711l) obj2;
                List list = (List) obj;
                AppActivity appActivity = (AppActivity) c7711l.isVip();
                Integer numValueOf = Integer.valueOf(R.drawable.ic_delete_outline_android_28);
                VKXApplication.Companion companion2 = VKXApplication.f36628l;
                String strLoadAd = VKXApplication.Companion.loadAd(R.string.sn_tracks_removed_from_library);
                if (list.size() == 1) {
                    sb = new StringBuilder();
                    sb.append(list.size());
                    str = " штука";
                } else {
                    sb = new StringBuilder();
                    sb.append(list.size());
                    str = " штук";
                }
                sb.append(str);
                C6666l.yandex(appActivity, new C10734l(numValueOf, strLoadAd, sb.toString(), new C8195l(VKXApplication.Companion.loadAd(R.string.sn_undo), new C6573l(20)), new C9810l(list, c7711l, 27), 208));
                dialogInterface.dismiss();
                break;
        }
    }
}
