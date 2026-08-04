package defpackage;

import android.graphics.Canvas;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: lؘۢ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6049l extends AbstractC11340l implements InterfaceC16388l {

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final InterfaceC11780l f12821l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final C10306l f12822l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C11115l f12823l;

    public C6049l(C4566l c4566l, C10306l c10306l, C11115l c11115l, InterfaceC11780l interfaceC11780l) {
        this.f12822l = c10306l;
        this.f12823l = c11115l;
        this.f12821l = interfaceC11780l;
        m3069l(c4566l);
    }

    /* JADX INFO: renamed from: l٘ۦۢ, reason: contains not printable characters */
    public static boolean m1925l(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // defpackage.InterfaceC16388l
    /* JADX INFO: renamed from: lؚۦ۠ */
    public final void mo536l(C6742l c6742l) {
        boolean zM1925l;
        char c;
        long j;
        C13601l c13601l = c6742l.f14144l;
        long jM4551private = c13601l.f26629l.m4551private();
        C10306l c10306l = this.f12822l;
        c10306l.isPro(jM4551private);
        if (C14174l.mopub(c13601l.f26629l.m4551private())) {
            c6742l.yandex();
            return;
        }
        c6742l.yandex();
        c10306l.amazon.getValue();
        InterfaceC14859l interfaceC14859lM4555synchronized = c13601l.f26629l.m4555synchronized();
        Canvas canvas = AbstractC10071l.yandex;
        Canvas canvas2 = ((C2151l) interfaceC14859lM4555synchronized).yandex;
        C11115l c11115l = this.f12823l;
        boolean zBilling = C11115l.billing(c11115l.billing);
        InterfaceC11780l interfaceC11780l = this.f12821l;
        if (zBilling) {
            zM1925l = m1925l(270.0f, (((long) Float.floatToRawIntBits(c6742l.mo868instanceof(interfaceC11780l.loadAd(c6742l.getLayoutDirection())))) & 4294967295L) | (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (c6742l.admob() & 4294967295L)))) << 32), c11115l.crashlytics(), canvas2);
        } else {
            zM1925l = false;
        }
        if (C11115l.billing(c11115l.amazon)) {
            c = ' ';
            j = 4294967295L;
            zM1925l = m1925l(0.0f, (((long) Float.floatToRawIntBits(c6742l.mo868instanceof(interfaceC11780l.amazon()))) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32), c11115l.purchase(), canvas2) || zM1925l;
        } else {
            c = ' ';
            j = 4294967295L;
        }
        if (C11115l.billing(c11115l.mopub)) {
            zM1925l = m1925l(90.0f, (((long) Float.floatToRawIntBits(c6742l.mo868instanceof(interfaceC11780l.crashlytics(c6742l.getLayoutDirection())) + (-((float) AbstractC5573l.ads(Float.intBitsToFloat((int) (c6742l.admob() >> c))))))) & j) | (((long) Float.floatToRawIntBits(0.0f)) << c), c11115l.amazon(), canvas2) || zM1925l;
        }
        if (C11115l.billing(c11115l.purchase)) {
            EdgeEffect edgeEffectLoadAd = c11115l.loadAd();
            zM1925l = m1925l(180.0f, (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (c6742l.admob() & j))) + c6742l.mo868instanceof(interfaceC11780l.yandex()))) & j) | (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (c6742l.admob() >> c)))) << c), edgeEffectLoadAd, canvas2) || zM1925l;
        }
        if (zM1925l) {
            c10306l.amazon();
        }
    }

    @Override // defpackage.InterfaceC16388l
    /* JADX INFO: renamed from: continue */
    public final /* synthetic */ void mo533continue() {
    }
}
