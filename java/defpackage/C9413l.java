package defpackage;

import android.hardware.camera2.CaptureResult;
import android.os.Build;

/* JADX INFO: renamed from: lًٍۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9413l implements InterfaceC9492l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C12094l f19257l;

    public C9413l(C12094l c12094l) {
        this.f19257l = c12094l;
    }

    @Override // defpackage.InterfaceC9492l
    public final void inmobi(InterfaceC10687l interfaceC10687l, long j, C9992l c9992l) {
        if (Build.VERSION.SDK_INT >= 35) {
            C12094l c12094l = this.f19257l;
            if (c12094l.crashlytics == null || !c12094l.purchase) {
                return;
            }
            Integer num = (Integer) ((C15331l) c9992l.f20389l).f29963l.get(CaptureResult.CONTROL_LOW_LIGHT_BOOST_STATE);
            if (num != null) {
                c12094l.crashlytics(c12094l.billing, num.intValue() != 1 ? 0 : 1);
            }
        }
    }

    @Override // defpackage.InterfaceC9492l
    public final /* synthetic */ void ads(InterfaceC10687l interfaceC10687l) {
    }

    @Override // defpackage.InterfaceC9492l
    /* JADX INFO: renamed from: package */
    public final /* synthetic */ void mo1758package(InterfaceC10687l interfaceC10687l) {
    }

    @Override // defpackage.InterfaceC9492l
    /* JADX INFO: renamed from: switch */
    public final /* synthetic */ void mo1760switch(C15390l c15390l) {
    }

    @Override // defpackage.InterfaceC9492l
    public final /* synthetic */ void vip(InterfaceC10687l interfaceC10687l) {
    }

    @Override // defpackage.InterfaceC9492l
    public final /* synthetic */ void adcel(InterfaceC10687l interfaceC10687l, long j) {
    }

    @Override // defpackage.InterfaceC9492l
    public final /* synthetic */ void signatures(InterfaceC10687l interfaceC10687l, int i) {
    }

    @Override // defpackage.InterfaceC9492l
    public final /* synthetic */ void isVip(InterfaceC10687l interfaceC10687l, long j, long j2) {
    }

    @Override // defpackage.InterfaceC9492l
    public final /* synthetic */ void mopub(InterfaceC10687l interfaceC10687l, long j, long j2) {
    }

    @Override // defpackage.InterfaceC9492l
    /* JADX INFO: renamed from: private */
    public final /* synthetic */ void mo1759private(InterfaceC10687l interfaceC10687l, long j, InterfaceC9595l interfaceC9595l) {
    }

    @Override // defpackage.InterfaceC9492l
    /* JADX INFO: renamed from: synchronized */
    public final /* synthetic */ void mo1761synchronized(InterfaceC10687l interfaceC10687l, long j, C15331l c15331l) {
    }

    @Override // defpackage.InterfaceC9492l
    /* JADX INFO: renamed from: throw */
    public final /* synthetic */ void mo1762throw(InterfaceC10687l interfaceC10687l, long j, C9992l c9992l) {
    }

    @Override // defpackage.InterfaceC9492l
    public final /* synthetic */ void billing(InterfaceC10687l interfaceC10687l, long j, int i, int i2) {
    }
}
