package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.service.media.MediaBrowserService;

/* JADX INFO: renamed from: lؘٕٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5701l extends C14932l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C4479l f12086l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5701l(C4479l c4479l, Context context) {
        super(c4479l, context);
        this.f12086l = c4479l;
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result, Bundle bundle) {
        Bundle bundleStartapp = AbstractC15323l.startapp(bundle);
        C4479l c4479l = this.f12086l;
        ServiceC16415l serviceC16415l = c4479l.f9107l;
        C7996l c7996l = serviceC16415l.f32104l;
        C9346l c9346l = new C9346l(c4479l, str, new C5501l(16, result), bundleStartapp);
        serviceC16415l.f32114l = c7996l;
        serviceC16415l.amazon(str, c9346l, bundleStartapp);
        serviceC16415l.f32114l = null;
        serviceC16415l.f32114l = null;
    }
}
