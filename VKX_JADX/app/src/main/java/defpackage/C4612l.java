package defpackage;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: lؗؓٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4612l extends AbstractC11340l implements InterfaceC16388l {

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public RenderNode f9348l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final C10306l f9349l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C11115l f9350l;

    public C4612l(C4566l c4566l, C10306l c10306l, C11115l c11115l) {
        this.f9349l = c10306l;
        this.f9350l = c11115l;
        m3069l(c4566l);
    }

    /* JADX INFO: renamed from: l٘ۦۢ, reason: contains not printable characters */
    public static boolean m1559l(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    /* JADX INFO: renamed from: lًؑٝ, reason: contains not printable characters */
    public final RenderNode m1560l() {
        RenderNode renderNode = this.f9348l;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeAmazon = AbstractC10971l.amazon();
        this.f9348l = renderNodeAmazon;
        return renderNodeAmazon;
    }

    @Override // defpackage.InterfaceC16388l
    /* JADX INFO: renamed from: lؚۦ۠ */
    public final void mo536l(C6742l c6742l) {
        boolean z;
        boolean zM1559l;
        EnumC7283l enumC7283l;
        char c;
        float f;
        C13601l c13601l = c6742l.f14144l;
        long jM4551private = c13601l.f26629l.m4551private();
        C10306l c10306l = this.f9349l;
        c10306l.isPro(jM4551private);
        InterfaceC14859l interfaceC14859lM4555synchronized = c13601l.f26629l.m4555synchronized();
        Canvas canvas = AbstractC10071l.yandex;
        Canvas canvas2 = ((C2151l) interfaceC14859lM4555synchronized).yandex;
        c10306l.amazon.getValue();
        C18449l c18449l = c13601l.f26629l;
        if (C14174l.mopub(c18449l.m4551private())) {
            c6742l.yandex();
            return;
        }
        boolean zIsHardwareAccelerated = canvas2.isHardwareAccelerated();
        C11115l c11115l = this.f9350l;
        if (!zIsHardwareAccelerated) {
            EdgeEffect edgeEffect = c11115l.amazon;
            if (edgeEffect != null) {
                edgeEffect.finish();
            }
            EdgeEffect edgeEffect2 = c11115l.purchase;
            if (edgeEffect2 != null) {
                edgeEffect2.finish();
            }
            EdgeEffect edgeEffect3 = c11115l.billing;
            if (edgeEffect3 != null) {
                edgeEffect3.finish();
            }
            EdgeEffect edgeEffect4 = c11115l.mopub;
            if (edgeEffect4 != null) {
                edgeEffect4.finish();
            }
            EdgeEffect edgeEffect5 = c11115l.admob;
            if (edgeEffect5 != null) {
                edgeEffect5.finish();
            }
            EdgeEffect edgeEffect6 = c11115l.subs;
            if (edgeEffect6 != null) {
                edgeEffect6.finish();
            }
            EdgeEffect edgeEffect7 = c11115l.isPro;
            if (edgeEffect7 != null) {
                edgeEffect7.finish();
            }
            EdgeEffect edgeEffect8 = c11115l.firebase;
            if (edgeEffect8 != null) {
                edgeEffect8.finish();
            }
            c6742l.yandex();
            return;
        }
        float fMo868instanceof = c6742l.mo868instanceof(30.0f);
        boolean z2 = C11115l.billing(c11115l.amazon) || C11115l.mopub(c11115l.admob) || C11115l.billing(c11115l.purchase) || C11115l.mopub(c11115l.subs);
        boolean z3 = C11115l.billing(c11115l.billing) || C11115l.mopub(c11115l.isPro) || C11115l.billing(c11115l.mopub) || C11115l.mopub(c11115l.firebase);
        if (z2 && z3) {
            m1560l().setPosition(0, 0, canvas2.getWidth(), canvas2.getHeight());
        } else if (z2) {
            m1560l().setPosition(0, 0, (AbstractC5573l.ads(fMo868instanceof) * 2) + canvas2.getWidth(), canvas2.getHeight());
        } else {
            if (!z3) {
                c6742l.yandex();
                return;
            }
            m1560l().setPosition(0, 0, canvas2.getWidth(), (AbstractC5573l.ads(fMo868instanceof) * 2) + canvas2.getHeight());
        }
        RecordingCanvas recordingCanvasBeginRecording = m1560l().beginRecording();
        boolean zMopub = C11115l.mopub(c11115l.isPro);
        EnumC7283l enumC7283l2 = EnumC7283l.f15125l;
        if (zMopub) {
            EdgeEffect edgeEffectYandex = c11115l.isPro;
            if (edgeEffectYandex == null) {
                edgeEffectYandex = c11115l.yandex(enumC7283l2);
                c11115l.isPro = edgeEffectYandex;
            }
            m1559l(90.0f, edgeEffectYandex, recordingCanvasBeginRecording);
            edgeEffectYandex.finish();
        }
        if (C11115l.billing(c11115l.billing)) {
            EdgeEffect edgeEffectCrashlytics = c11115l.crashlytics();
            zM1559l = m1559l(270.0f, edgeEffectCrashlytics, recordingCanvasBeginRecording);
            if (C11115l.mopub(c11115l.billing)) {
                z = z3;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (c10306l.crashlytics() & 4294967295L));
                EdgeEffect edgeEffectYandex2 = c11115l.isPro;
                if (edgeEffectYandex2 == null) {
                    edgeEffectYandex2 = c11115l.yandex(enumC7283l2);
                    c11115l.isPro = edgeEffectYandex2;
                }
                int i = Build.VERSION.SDK_INT;
                float fMetrica = i >= 31 ? AbstractC12148l.metrica(edgeEffectCrashlytics) : 0.0f;
                float f2 = 1.0f - fIntBitsToFloat;
                if (i >= 31) {
                    AbstractC12148l.signatures(edgeEffectYandex2, fMetrica, f2);
                } else {
                    edgeEffectYandex2.onPull(fMetrica, f2);
                }
            } else {
                z = z3;
            }
        } else {
            z = z3;
            zM1559l = false;
        }
        boolean zMopub2 = C11115l.mopub(c11115l.admob);
        EnumC7283l enumC7283l3 = EnumC7283l.f15126l;
        if (zMopub2) {
            EdgeEffect edgeEffectYandex3 = c11115l.admob;
            if (edgeEffectYandex3 == null) {
                edgeEffectYandex3 = c11115l.yandex(enumC7283l3);
                c11115l.admob = edgeEffectYandex3;
            }
            m1559l(180.0f, edgeEffectYandex3, recordingCanvasBeginRecording);
            edgeEffectYandex3.finish();
        }
        if (C11115l.billing(c11115l.amazon)) {
            EdgeEffect edgeEffectPurchase = c11115l.purchase();
            c = ' ';
            zM1559l = m1559l(0.0f, edgeEffectPurchase, recordingCanvasBeginRecording) || zM1559l;
            if (C11115l.mopub(c11115l.amazon)) {
                enumC7283l = enumC7283l2;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c10306l.crashlytics() >> 32));
                EdgeEffect edgeEffectYandex4 = c11115l.admob;
                if (edgeEffectYandex4 == null) {
                    edgeEffectYandex4 = c11115l.yandex(enumC7283l3);
                    c11115l.admob = edgeEffectYandex4;
                }
                int i2 = Build.VERSION.SDK_INT;
                float fMetrica2 = i2 >= 31 ? AbstractC12148l.metrica(edgeEffectPurchase) : 0.0f;
                if (i2 >= 31) {
                    AbstractC12148l.signatures(edgeEffectYandex4, fMetrica2, fIntBitsToFloat2);
                } else {
                    edgeEffectYandex4.onPull(fMetrica2, fIntBitsToFloat2);
                }
            } else {
                c18449l = c18449l;
                enumC7283l = enumC7283l2;
            }
        } else {
            c18449l = c18449l;
            enumC7283l = enumC7283l2;
            c = ' ';
        }
        if (C11115l.mopub(c11115l.firebase)) {
            EdgeEffect edgeEffectYandex5 = c11115l.firebase;
            if (edgeEffectYandex5 == null) {
                edgeEffectYandex5 = c11115l.yandex(enumC7283l);
                c11115l.firebase = edgeEffectYandex5;
            }
            m1559l(270.0f, edgeEffectYandex5, recordingCanvasBeginRecording);
            edgeEffectYandex5.finish();
        }
        if (C11115l.billing(c11115l.mopub)) {
            EdgeEffect edgeEffectAmazon = c11115l.amazon();
            zM1559l = m1559l(90.0f, edgeEffectAmazon, recordingCanvasBeginRecording) || zM1559l;
            if (C11115l.mopub(c11115l.mopub)) {
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (c10306l.crashlytics() & 4294967295L));
                EdgeEffect edgeEffectYandex6 = c11115l.firebase;
                if (edgeEffectYandex6 == null) {
                    edgeEffectYandex6 = c11115l.yandex(enumC7283l);
                    c11115l.firebase = edgeEffectYandex6;
                }
                int i3 = Build.VERSION.SDK_INT;
                float fMetrica3 = i3 >= 31 ? AbstractC12148l.metrica(edgeEffectAmazon) : 0.0f;
                if (i3 >= 31) {
                    AbstractC12148l.signatures(edgeEffectYandex6, fMetrica3, fIntBitsToFloat3);
                } else {
                    edgeEffectYandex6.onPull(fMetrica3, fIntBitsToFloat3);
                }
            }
        }
        if (C11115l.mopub(c11115l.subs)) {
            EdgeEffect edgeEffectYandex7 = c11115l.subs;
            if (edgeEffectYandex7 == null) {
                edgeEffectYandex7 = c11115l.yandex(enumC7283l3);
                c11115l.subs = edgeEffectYandex7;
            }
            f = 0.0f;
            m1559l(0.0f, edgeEffectYandex7, recordingCanvasBeginRecording);
            edgeEffectYandex7.finish();
        } else {
            f = 0.0f;
        }
        if (C11115l.billing(c11115l.purchase)) {
            EdgeEffect edgeEffectLoadAd = c11115l.loadAd();
            boolean z4 = m1559l(180.0f, edgeEffectLoadAd, recordingCanvasBeginRecording) || zM1559l;
            if (C11115l.mopub(c11115l.purchase)) {
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (c10306l.crashlytics() >> c));
                EdgeEffect edgeEffectYandex8 = c11115l.subs;
                if (edgeEffectYandex8 == null) {
                    edgeEffectYandex8 = c11115l.yandex(enumC7283l3);
                    c11115l.subs = edgeEffectYandex8;
                }
                int i4 = Build.VERSION.SDK_INT;
                float fMetrica4 = i4 >= 31 ? AbstractC12148l.metrica(edgeEffectLoadAd) : f;
                float f3 = 1.0f - fIntBitsToFloat4;
                if (i4 >= 31) {
                    AbstractC12148l.signatures(edgeEffectYandex8, fMetrica4, f3);
                } else {
                    edgeEffectYandex8.onPull(fMetrica4, f3);
                }
            }
            zM1559l = z4;
        }
        if (zM1559l) {
            c10306l.amazon();
        }
        float f4 = z ? f : fMo868instanceof;
        if (z2) {
            fMo868instanceof = f;
        }
        EnumC9931l layoutDirection = c6742l.getLayoutDirection();
        C2151l c2151l = new C2151l();
        c2151l.yandex = recordingCanvasBeginRecording;
        long jM4551private2 = c18449l.m4551private();
        InterfaceC13490l interfaceC13490lM4560volatile = c13601l.f26629l.m4560volatile();
        EnumC9931l enumC9931lM4548native = c13601l.f26629l.m4548native();
        InterfaceC14859l interfaceC14859lM4555synchronized2 = c13601l.f26629l.m4555synchronized();
        long jM4551private3 = c13601l.f26629l.m4551private();
        C18449l c18449l2 = c13601l.f26629l;
        C11925l c11925l = (C11925l) c18449l2.f36009l;
        c18449l2.m4554super(c6742l);
        c18449l2.m4545import(layoutDirection);
        c18449l2.m4544goto(c2151l);
        c18449l2.m4534abstract(jM4551private2);
        c18449l2.f36009l = null;
        c2151l.mopub();
        try {
            ((C16543l) c6742l.f14144l.f26629l.f36010l).inmobi(f4, fMo868instanceof);
            try {
                c6742l.yandex();
                float f5 = -f4;
                float f6 = -fMo868instanceof;
                ((C16543l) c6742l.f14144l.f26629l.f36010l).inmobi(f5, f6);
                c2151l.ads();
                C18449l c18449l3 = c13601l.f26629l;
                c18449l3.m4554super(interfaceC13490lM4560volatile);
                c18449l3.m4545import(enumC9931lM4548native);
                c18449l3.m4544goto(interfaceC14859lM4555synchronized2);
                c18449l3.m4534abstract(jM4551private3);
                c18449l3.f36009l = c11925l;
                m1560l().endRecording();
                int iSave = canvas2.save();
                canvas2.translate(f5, f6);
                canvas2.drawRenderNode(m1560l());
                canvas2.restoreToCount(iSave);
            } catch (Throwable th) {
                ((C16543l) c6742l.f14144l.f26629l.f36010l).inmobi(-f4, -fMo868instanceof);
                throw th;
            }
        } catch (Throwable th2) {
            c2151l.ads();
            C18449l c18449l4 = c13601l.f26629l;
            c18449l4.m4554super(interfaceC13490lM4560volatile);
            c18449l4.m4545import(enumC9931lM4548native);
            c18449l4.m4544goto(interfaceC14859lM4555synchronized2);
            c18449l4.m4534abstract(jM4551private3);
            c18449l4.f36009l = c11925l;
            throw th2;
        }
    }

    @Override // defpackage.InterfaceC16388l
    /* JADX INFO: renamed from: continue */
    public final /* synthetic */ void mo533continue() {
    }
}
