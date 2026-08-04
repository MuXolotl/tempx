package defpackage;

import java.util.Collections;
import kotlin.Unit;

/* JADX INFO: renamed from: lٗٞٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17295l implements InterfaceC9492l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C9426l f33568l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C9426l f33569l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object f33567l = new Object();

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f33566l = new Object();

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C10685l f33565l = new C10685l(3);

    @Override // defpackage.InterfaceC9492l
    /* JADX INFO: renamed from: throw */
    public final void mo1762throw(InterfaceC10687l interfaceC10687l, long j, C9992l c9992l) {
        synchronized (this.f33566l) {
            try {
                C9426l c9426l = this.f33569l;
                if (c9426l != null) {
                    if (AbstractC8576l.yandex(((C12920l) interfaceC10687l.yandex(AbstractC14471l.yandex, C12920l.loadAd)).yandex.get("Camera2CameraControl.tag"), Integer.valueOf(c9426l.hashCode()))) {
                        c9426l.m3885new(null);
                        this.f33569l = null;
                        C9426l c9426l2 = this.f33568l;
                        if (c9426l2 != null) {
                            c9426l2.m3885new(null);
                            this.f33568l = null;
                        }
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C9426l yandex(InterfaceC16983l interfaceC16983l, boolean z) {
        C16443l c16443lM2952for;
        C9426l c9426l = new C9426l();
        synchronized (this.f33567l) {
            c16443lM2952for = this.f33565l.m2952for();
        }
        synchronized (this.f33566l) {
            try {
                if (interfaceC16983l != null) {
                    C9426l c9426l2 = this.f33569l;
                    if (z) {
                        if (c9426l2 != null) {
                            c9426l2.m2649l(new C6711l("Camera2CameraControl was updated with new options."));
                        }
                    } else if (c9426l2 != null) {
                        AbstractC0140l.vip(c9426l, c9426l2);
                    }
                    this.f33569l = c9426l;
                    interfaceC16983l.purchase(c16443lM2952for, Collections.singletonMap("Camera2CameraControl.tag", Integer.valueOf(c9426l.hashCode())));
                } else {
                    C9426l c9426l3 = this.f33568l;
                    if (c9426l3 != null) {
                        c9426l3.m2649l(new C6711l("Camera2CameraControl was updated with new options."));
                    }
                    this.f33568l = c9426l;
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c9426l;
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
    public final /* synthetic */ void inmobi(InterfaceC10687l interfaceC10687l, long j, C9992l c9992l) {
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
    public final /* synthetic */ void billing(InterfaceC10687l interfaceC10687l, long j, int i, int i2) {
    }
}
