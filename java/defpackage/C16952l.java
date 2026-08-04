package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؙٗۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C16952l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Activity f33070l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f33071l;

    public /* synthetic */ C16952l(Activity activity, int i) {
        this.f33071l = i;
        this.f33070l = activity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f33071l;
        Activity activity = this.f33070l;
        switch (i) {
            case 0:
                if (activity != null) {
                    activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/vkxfaq/55")));
                }
                break;
            default:
                if (activity != null) {
                    C16287l.yandex.getClass();
                    AbstractC16584l.loadAd().purchase(C16287l.crashlytics());
                    C16287l.purchase(activity);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
