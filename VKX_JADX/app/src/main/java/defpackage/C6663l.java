package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lؘؙۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6663l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C5218l f14013l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Context f14014l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f14015l;

    public /* synthetic */ C6663l(C5218l c5218l, Activity activity) {
        this.f14015l = 0;
        this.f14013l = c5218l;
        this.f14014l = activity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f14015l;
        C5218l c5218l = this.f14013l;
        Context context = this.f14014l;
        List list = (List) obj;
        switch (i) {
            case 0:
                new C0228l(new C10949l(19), c5218l.f11302l, list, 8).Signature((Activity) context);
                break;
            case 1:
                AbstractC11397l.mopub(context, new C9810l(c5218l.f11302l, list, 9));
                break;
            default:
                C7268l c7268l = C7268l.f15111l;
                String str = c5218l.f11301l;
                AudioPlaylist audioPlaylist = c5218l.f11302l;
                c7268l.getClass();
                C7268l.yandex((AppActivity) context, str, audioPlaylist, list);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C6663l(Activity activity, C5218l c5218l, int i) {
        this.f14015l = i;
        this.f14014l = activity;
        this.f14013l = c5218l;
    }
}
