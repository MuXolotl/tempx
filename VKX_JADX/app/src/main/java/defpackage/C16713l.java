package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Layout;

/* JADX INFO: renamed from: lّٖۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16713l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Catalog2Layout.SynthOpenCacheSearch f32730l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC9694l f32731l;

    public C16713l(AbstractC9694l abstractC9694l, Catalog2Layout.SynthOpenCacheSearch synthOpenCacheSearch) {
        this.f32731l = abstractC9694l;
        this.f32730l = synthOpenCacheSearch;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f32731l.m4125private(new C8748l(this.f32730l.yandex));
        return Unit.INSTANCE;
    }
}
