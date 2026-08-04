package defpackage;

import android.content.Intent;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lٖ٘ؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C16439l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C0471l f32141l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f32142l;

    public /* synthetic */ C16439l(C0471l c0471l, int i) {
        this.f32142l = i;
        this.f32141l = c0471l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f32142l;
        C0471l c0471l = this.f32141l;
        switch (i) {
            case 0:
                c0471l.f1724l.setValue(Boolean.TRUE);
                break;
            case 1:
                AbstractC9033l.crashlytics((AppActivity) c0471l.isVip(), new C17949l(c0471l, null, 11));
                break;
            case 2:
                c0471l.isVip().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(c0471l.m566public().yandex.smaato)));
                break;
            default:
                c0471l.f1724l.setValue(Boolean.FALSE);
                break;
        }
        return Unit.INSTANCE;
    }
}
