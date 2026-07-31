package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lَؔۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2532l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f5513l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ long f5514l;

    public C2532l(long j, boolean z) {
        this.f5514l = j;
        this.f5513l = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C3366l c3366l = (C3366l) obj;
        float fLoadAd = c3366l.loadAd() * 32.0f;
        return c3366l.yandex(new C4693l(0, new C7726l(this.f5513l, new C8169l(AbstractC14055l.remoteconfig(new C9735l(this.f5514l), new C9735l(C9735l.isPro)), null, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c3366l.f7169l.admob() & 4294967295L)) / 2.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(fLoadAd)) << 32), Float.intBitsToFloat((int) (c3366l.f7169l.admob() >> 32)) / 2.0f))));
    }
}
