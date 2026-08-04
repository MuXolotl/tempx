package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: lؙؚۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6317l extends AbstractC4383l {
    public final PointF admob;
    public final C10017l firebase;
    public final C10017l isPro;
    public final PointF subs;

    public C6317l(C10017l c10017l, C10017l c10017l2) {
        super(Collections.EMPTY_LIST);
        this.admob = new PointF();
        this.subs = new PointF();
        this.isPro = c10017l;
        this.firebase = c10017l2;
        mopub(this.amazon);
    }

    @Override // defpackage.AbstractC4383l
    public final Object amazon() {
        PointF pointF = this.admob;
        float f = pointF.x;
        PointF pointF2 = this.subs;
        pointF2.set(f, 0.0f);
        pointF2.set(pointF2.x, pointF.y);
        return pointF2;
    }

    @Override // defpackage.AbstractC4383l
    public final void mopub(float f) {
        C10017l c10017l = this.isPro;
        c10017l.mopub(f);
        C10017l c10017l2 = this.firebase;
        c10017l2.mopub(f);
        this.admob.set(((Float) c10017l.amazon()).floatValue(), ((Float) c10017l2.amazon()).floatValue());
        int i = 0;
        while (true) {
            ArrayList arrayList = this.yandex;
            if (i >= arrayList.size()) {
                return;
            }
            ((InterfaceC15871l) arrayList.get(i)).yandex();
            i++;
        }
    }

    @Override // defpackage.AbstractC4383l
    public final Object purchase(C4529l c4529l, float f) {
        PointF pointF = this.admob;
        float f2 = pointF.x;
        PointF pointF2 = this.subs;
        pointF2.set(f2, 0.0f);
        pointF2.set(pointF2.x, pointF.y);
        return pointF2;
    }
}
