package defpackage;

import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: renamed from: lِؓؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C11573l implements InterfaceC5246l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f23247l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C10500l f23248l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C3716l f23249l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C2005l f23250l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C2005l f23251l;

    public /* synthetic */ C11573l(C3716l c3716l, C10500l c10500l, int i, C2005l c2005l, C2005l c2005l2) {
        this.f23249l = c3716l;
        this.f23248l = c10500l;
        this.f23247l = i;
        this.f23251l = c2005l;
        this.f23250l = c2005l2;
    }

    @Override // defpackage.InterfaceC5246l
    public final ListenableFuture apply(Object obj) {
        C10500l c10500l = this.f23248l;
        Surface surface = (Surface) obj;
        C3716l c3716l = this.f23249l;
        c3716l.getClass();
        surface.getClass();
        try {
            c10500l.amazon();
            C3214l c3214l = new C3214l(surface, this.f23247l, c3716l.mopub.yandex, this.f23251l, this.f23250l);
            c3214l.f6913l.f32512l.yandex(new RunnableC8594l(c10500l, 1), AbstractC12272l.yandex());
            AbstractC5641l.purchase("Consumer can only be linked once.", c10500l.adcel == null);
            c10500l.adcel = c3214l;
            return AbstractC11356l.mopub(c3214l);
        } catch (C4201l e) {
            return new C11077l(1, e);
        }
    }
}
