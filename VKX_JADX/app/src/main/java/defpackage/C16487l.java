package defpackage;

import android.os.Looper;
import j$.util.Objects;

/* JADX INFO: renamed from: lٖٟٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C16487l implements InterfaceC12052l, InterfaceC0945l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C16616l f32227l;

    public /* synthetic */ C16487l(C16616l c16616l) {
        this.f32227l = c16616l;
    }

    @Override // defpackage.InterfaceC12052l
    public void amazon(C13208l c13208l) {
        boolean z;
        boolean z2;
        C16811l c16811l = c13208l.yandex;
        if (c13208l.mo319l()) {
            C16616l c16616l = c13208l.advert;
            C16616l c16616l2 = this.f32227l;
            if (Objects.equals(c16616l, c16616l2)) {
                return;
            }
            c13208l.advert = c16616l2;
            C16616l c16616l3 = c13208l.isVip;
            C16616l c16616lM3607l = c13208l.m3607l(c13208l.ad, c16616l2);
            c13208l.isVip = c16616lM3607l;
            boolean zEquals = c16616lM3607l.equals(c16616l3);
            boolean z3 = true;
            if (zEquals) {
                z = false;
                z2 = false;
            } else {
                C13708l c13708l = c13208l.Signature;
                C13708l c13708l2 = c13208l.license;
                C13708l c13708lM3589l = C13208l.m3589l(c13208l.tapsense, c13208l.subscription, c13208l.pro, c13208l.isVip, c13208l.f25987strictfp);
                c13208l.Signature = c13708lM3589l;
                c13208l.license = C13208l.m3594l(c13708lM3589l, c13208l.subscription, c13208l.f25987strictfp, c13208l.pro, c13208l.isVip, c13208l.m3611l());
                z = !c13208l.Signature.equals(c13708l);
                z2 = !c13208l.license.equals(c13708l2);
                c13208l.subs.mopub(13, new C16262l(c13208l, z3 ? 1 : 0));
            }
            if (z2) {
                c16811l.getClass();
                AbstractC12442l.subscription(Looper.myLooper() == c16811l.f32839l.getLooper());
                c16811l.f32840l.getClass();
            }
            if (z) {
                c16811l.getClass();
                AbstractC12442l.subscription(Looper.myLooper() == c16811l.f32839l.getLooper());
                c16811l.f32840l.isVip();
            }
        }
    }

    @Override // defpackage.InterfaceC0945l
    public void mopub(InterfaceC3270l interfaceC3270l, int i) {
        interfaceC3270l.smaato(i, this.f32227l);
    }
}
