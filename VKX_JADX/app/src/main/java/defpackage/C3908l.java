package defpackage;

import android.graphics.Canvas;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: renamed from: lْؖؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3908l implements InterfaceC1286l {
    public final int amazon;
    public final int crashlytics;
    public final C2494l loadAd;
    public final C4816l yandex;

    public C3908l(C4816l c4816l, C2494l c2494l, int i, int i2) {
        this.yandex = c4816l;
        this.loadAd = c2494l;
        this.crashlytics = i;
        this.amazon = i2;
    }

    @Override // defpackage.InterfaceC1286l
    public final boolean admob() {
        return true;
    }

    @Override // defpackage.InterfaceC1286l
    public final int loadAd() {
        return this.amazon;
    }

    @Override // defpackage.InterfaceC1286l
    public final long mopub() {
        return 2048L;
    }

    @Override // defpackage.InterfaceC1286l
    public final int purchase() {
        return this.crashlytics;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ef  */
    @Override // defpackage.InterfaceC1286l
    public final void subs(Canvas canvas) {
        boolean z;
        boolean z2;
        ArrayList arrayList;
        C4816l c4816l = this.yandex;
        c4816l.getClass();
        C3927l c3927l = (C3927l) c4816l.f9859l;
        C2494l c2494l = this.loadAd;
        if (c2494l == null) {
            c2494l = new C2494l(16);
        }
        if (((C10006l) c2494l.f5290l) == null) {
            c2494l.f5290l = new C10006l(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        }
        C1424l c1424l = new C1424l();
        c1424l.f3603l = canvas;
        c1424l.f3602l = c4816l;
        C15965l c15965l = (C15965l) c4816l.f9860l;
        if (c15965l == null) {
            Log.w("SVGAndroidRenderer", "Nothing to render. Document is empty.");
            return;
        }
        C10006l c10006l = c15965l.metrica;
        C3299l c3299l = c15965l.vip;
        C3927l c3927l2 = (C3927l) c2494l.f5291l;
        if (c3927l2 == null) {
            z = false;
        } else {
            ArrayList arrayList2 = c3927l2.loadAd;
            if ((arrayList2 != null ? arrayList2.size() : 0) > 0) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            c3927l.loadAd((C3927l) c2494l.f5291l);
        }
        c1424l.f3601l = new C16539l();
        c1424l.f3605l = new Stack();
        c1424l.m946l((C16539l) c1424l.f3601l, C2071l.yandex());
        C16539l c16539l = (C16539l) c1424l.f3601l;
        c16539l.billing = null;
        c16539l.admob = false;
        ((Stack) c1424l.f3605l).push(new C16539l(c16539l));
        c1424l.f3606l = new Stack();
        c1424l.f3604l = new Stack();
        Boolean bool = c15965l.amazon;
        if (bool != null) {
            ((C16539l) c1424l.f3601l).admob = bool.booleanValue();
        }
        c1424l.m931l();
        C10006l c10006l2 = new C10006l((C10006l) c2494l.f5290l);
        C12671l c12671l = c15965l.ads;
        if (c12671l != null) {
            c10006l2.amazon = c12671l.loadAd(c1424l, c10006l2.amazon);
        }
        C12671l c12671l2 = c15965l.subscription;
        if (c12671l2 != null) {
            c10006l2.purchase = c12671l2.loadAd(c1424l, c10006l2.purchase);
        }
        c1424l.m917l(c15965l, c10006l2, c10006l, c3299l);
        c1424l.m941l();
        C3927l c3927l3 = (C3927l) c2494l.f5291l;
        if (c3927l3 != null) {
            ArrayList arrayList3 = c3927l3.loadAd;
            z2 = (arrayList3 != null ? arrayList3.size() : 0) > 0;
        }
        if (!z2 || (arrayList = c3927l.loadAd) == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((C0398l) it.next()).crashlytics == 2) {
                it.remove();
            }
        }
    }
}
