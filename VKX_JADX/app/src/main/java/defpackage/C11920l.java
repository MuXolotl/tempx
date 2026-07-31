package defpackage;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lِ٘ۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C11920l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ MainArtist f23768l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f23769l;

    public /* synthetic */ C11920l(MainArtist mainArtist, int i) {
        this.f23769l = i;
        this.f23768l = mainArtist;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f23769l;
        MainArtist mainArtist = this.f23768l;
        Activity activity = (Activity) obj;
        switch (i) {
            case 0:
                AppActivity appActivity = (AppActivity) activity;
                String str = mainArtist.yandex;
                if (str != null) {
                    appActivity.license(new C13379l(str));
                }
                break;
            default:
                AppActivity appActivity2 = (AppActivity) activity;
                String str2 = mainArtist.yandex;
                if (str2 != null) {
                    appActivity2.license(new C13379l(str2));
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
