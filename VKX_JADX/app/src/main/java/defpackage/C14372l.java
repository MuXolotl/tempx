package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lٓۘۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14372l implements InterfaceC11309l, InterfaceC15871l, InterfaceC3012l {
    public final AbstractC4383l amazon;
    public final C14720l crashlytics;
    public final C9950l loadAd;
    public boolean mopub;
    public final C17958l purchase;
    public final Path yandex = new Path();
    public final C3316l billing = new C3316l(7);

    public C14372l(C9950l c9950l, AbstractC10437l abstractC10437l, C17958l c17958l) {
        this.loadAd = c9950l;
        AbstractC4383l abstractC4383lMo1225l = c17958l.loadAd.mo1225l();
        this.crashlytics = (C14720l) abstractC4383lMo1225l;
        AbstractC4383l abstractC4383lMo1225l2 = c17958l.yandex.mo1225l();
        this.amazon = abstractC4383lMo1225l2;
        this.purchase = c17958l;
        abstractC10437l.amazon(abstractC4383lMo1225l);
        abstractC10437l.amazon(abstractC4383lMo1225l2);
        abstractC4383lMo1225l.yandex(this);
        abstractC4383lMo1225l2.yandex(this);
    }

    @Override // defpackage.InterfaceC3012l
    public final void loadAd(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            InterfaceC3012l interfaceC3012l = (InterfaceC3012l) arrayList.get(i);
            if (interfaceC3012l instanceof C18251l) {
                C18251l c18251l = (C18251l) interfaceC3012l;
                if (c18251l.crashlytics == 1) {
                    ((ArrayList) this.billing.f7072l).add(c18251l);
                    c18251l.amazon(this);
                }
            }
            i++;
        }
    }

    @Override // defpackage.InterfaceC11309l
    public final Path purchase() {
        boolean z = this.mopub;
        Path path = this.yandex;
        if (z) {
            return path;
        }
        path.reset();
        C17958l c17958l = this.purchase;
        if (c17958l.amazon) {
            this.mopub = true;
            return path;
        }
        PointF pointF = (PointF) this.crashlytics.amazon();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = f2 * 0.55228f;
        path.reset();
        if (c17958l.crashlytics) {
            float f5 = -f2;
            path.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            path.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            path.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            path.cubicTo(f10, f2, f, f9, f, 0.0f);
            path.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            path.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            path.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            path.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            path.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            path.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF pointF2 = (PointF) this.amazon.amazon();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.billing.subs(path);
        this.mopub = true;
        return path;
    }

    @Override // defpackage.InterfaceC15871l
    public final void yandex() {
        this.mopub = false;
        this.loadAd.invalidateSelf();
    }
}
